package com.develogical.app;


public class QueryProcessor {

    public String process(String query) {
        int max = 0;
        String[] queryNumbers = null;
        int[] queryInt = new int[100];
        if (query.toLowerCase().contains("largest")){

                queryNumbers = query.split(":")[1].split(",");
                System.out.println(queryNumbers.toString());
                for (int i=0;i<queryNumbers.length;i++) {
                    if (queryNumbers[i] != null) {
                        queryInt[i] = Integer.parseInt(queryNumbers[i].trim());
                        if (queryInt[i] > max) {
                            max = queryInt[i];
                        }
                        System.out.println("MAX VALUE: " + max);
                    }
                }
            return Integer.toString(max);
        }else if (query.toLowerCase().contains("plus")){

        }


        return "";


//        else if (query.toLowerCase().contains("what is your name"))
//        {
//            return "PIP Team";
//        }
//
//        else if (query.toLowerCase().contains("what is your name"))
//        {
//            return "PIP Team";
//        }
//
//        else if (query.toLowerCase().contains("what is your name"))
//        {
//            return "PIP Team";
//        }

    }
}
