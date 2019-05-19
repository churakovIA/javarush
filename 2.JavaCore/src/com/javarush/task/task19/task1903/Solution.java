package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static{
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        public String getCompanyName() {
            return data.getCompany();
        }

        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        public String getName() {
            return String.join(", ", data.getContactLastName(), data.getContactFirstName());
        }

        public String getPhoneNumber() {
            final int code = data.getCountryPhoneCode();
            final int num = data.getPhoneNumber();

            String snum = String.format("%010d", num);

            return String.format("+%d(%s)%s-%s-%s",   code,
                                                        snum.substring(0, 3),
                                                        snum.substring(3, 6),
                                                        snum.substring(6, 8),
                                                        snum.substring(8, 10));

        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}