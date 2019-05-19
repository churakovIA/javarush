package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/* 
Построй дерево(1)
*/
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {

    Entry<String> root;

    public CustomTree() {
        this.root = new CustomTree.Entry<String>("root");
    }

    //------------------------------------------------------------

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    //-------------------------------------

    @Override
    public boolean add(String s) {

        LinkedList<Entry<String>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Entry<String> top = queue.poll();

            if(top.leftChild!=null)
                queue.add(top.leftChild);
            else {
                top.leftChild = new CustomTree.Entry<String>(s, top);
                break;
            }

            if(top.rightChild!=null)
                queue.add(top.rightChild);
            else {
                top.rightChild = new CustomTree.Entry<String>(s, top);
                break;
            }
        }
        return true;
    }

    @Override
    public int size() {
        int count = -1;
        LinkedList<Entry<String>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Entry<String> top = queue.poll();
            if(top.leftChild!=null) queue.add(top.leftChild);
            if(top.rightChild!=null) queue.add(top.rightChild);
            count++;
        }
        return count;
    }

    public String getParent(String s){
        String parent = "";

        LinkedList<Entry<String>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Entry<String> top = queue.poll();
            if(top.leftChild!=null) {
                queue.add(top.leftChild);
                if(top.leftChild.elementName.equals(s)) return top.elementName;
            }
            if(top.rightChild!=null) {
                queue.add(top.rightChild);
                if(top.rightChild.elementName.equals(s)) return top.elementName;
            }
        }

        return parent;
    }

    @Override
    public boolean remove(Object o) {

        if(!(o instanceof String)) throw new UnsupportedOperationException();

        CustomTree.Entry<String> entry = null;
        LinkedList<Entry<String>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Entry<String> top = queue.poll();
            if(top.elementName.equals(o) && top != root){
                entry = top;
                break;
            }
            if(top.leftChild!=null) queue.add(top.leftChild);
            if(top.rightChild!=null) queue.add(top.rightChild);
        }

        if(entry == null) return false;

        CustomTree.Entry<String> curParent = entry.parent;
        if(entry == curParent.leftChild) curParent.leftChild = null;
        if(entry == curParent.rightChild) curParent.rightChild = null;

        curParent.checkChildren();

        return true;
    }

    //-------------------------------------

    static class Entry<T> implements Serializable{
        String elementName;
        int lineNumber;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public Entry(String elementName) {
            this.elementName = elementName;
            this.availableToAddLeftChildren = true;
            this.availableToAddRightChildren = true;
        }

        public Entry(String elementName, CustomTree.Entry<T> parent) {
            this(elementName);
            this.parent = parent;
        }

        //____________________________________________

        void checkChildren(){
            if(leftChild!=null) availableToAddLeftChildren = false;
            if(rightChild!=null) availableToAddRightChildren = false;
        }

        boolean isAvailableToAddChildren(){
            return availableToAddLeftChildren || availableToAddRightChildren;
        }

    }

}
