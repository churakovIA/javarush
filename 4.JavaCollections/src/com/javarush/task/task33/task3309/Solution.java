package com.javarush.task.task33.task3309;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.util.regex.Pattern;

/*
Комментарий внутри xml
*/
public class Solution {
    public static String toXmlWithComment(Object obj, String tagName, String comment) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.newDocument();

        ContentHandler handler = new MyContentHandler(doc, tagName, comment);

        JAXBContext context = JAXBContext.newInstance(obj.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(obj, handler);

        StringWriter writer = new StringWriter();

        Transformer t = TransformerFactory.newInstance().newTransformer();
        t.setOutputProperty(OutputKeys.INDENT, "yes");
        t.setOutputProperty(OutputKeys.STANDALONE, "no");
        t.transform(new DOMSource(doc), new StreamResult(writer));

        return writer.toString();

    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Integer i = 8;
        System.out.println(cat.toString() + i + "1 + 2 = " + (1 + 2) );
    }

    //-------------------------

    static class Cat{}

    private static class MyContentHandler extends DefaultHandler {
        private Document doc;
        private final String tagName;
        private final String comment;
        private static final Pattern XML_CHARS = Pattern.compile(".*[<>&'\\\"].*");
        Node currNode;

        public MyContentHandler(Document doc, String tagName, String comment) {
            this.doc = doc;
            this.tagName = tagName;
            this.comment = comment;
            this.currNode = doc;
        }

        ////////////////////////////////////

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if(localName.equals(tagName))
                currNode.appendChild(doc.createComment(comment));

            currNode = currNode.appendChild(doc.createElement(localName));
        }

        @Override
        public void endElement(String uri, String localName, String qName) throws SAXException {
            currNode = currNode.getParentNode();
        }

        @Override
        public void characters(char[] ch, int start, int length) throws SAXException {
            String text = new String(ch,start,length);
            if (XML_CHARS.matcher(text).find())
                currNode.appendChild(doc.createCDATASection(text));
            else
                currNode.appendChild(doc.createTextNode(text));
        }
    }
}
