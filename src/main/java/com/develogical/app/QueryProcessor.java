package com.develogical.app;


public class QueryProcessor {

    public String process(String query) {
        int max = 0;
        String[] queryNumbers = null;
        int[] queryInt = null;
        if (query.toLowerCase().contains("largest")){

                queryNumbers = query.split(":")[1].split(",");
                for (int i=0;i<queryNumbers.length;i++){
                    queryInt[i] = Integer.parseInt(queryNumbers[i]);
                    if (queryInt[i] > max){max = queryInt[i];}
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
