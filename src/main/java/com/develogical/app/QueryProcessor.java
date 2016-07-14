package com.develogical.app;


public class QueryProcessor {
    boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public String process(String query) {
        int max = 0;
        String[] queryNumbers = null;
        String primes;
        int[] queryInt = new int[100];
        if (query.toLowerCase().contains("largest")){

            queryNumbers = query.split(":")[1].split(",");

                for (int i=0;i<queryNumbers.length;i++) {
                    if (queryNumbers[i] != null) {

                        queryInt[i] = Integer.parseInt(queryNumbers[i].trim());
                        if (queryInt[i] > max) {
                            max = queryInt[i];
                        }
                    }
                }
            System.out.println(max);
            return Integer.toString(max);
        }else if (query.toLowerCase().contains("plus")){
            String[] array = query.split(" ");
            int result = Integer.parseInt(array[3]) + Integer.parseInt(array[5]);
            System.out.println(result);
            return Integer.toString(result);
        }
        else if (query.toLowerCase().contains("minus")){
            String[] array = query.split(" ");
            int result = Integer.parseInt(array[3]) - Integer.parseInt(array[5]);
            System.out.println("Minus "+result);
            return Integer.toString(result);
        }
        else if (query.toLowerCase().contains("multiplied")){
            String[] array = query.split(" ");
            int result = Integer.parseInt(array[3]) * Integer.parseInt(array[6]);
            System.out.println(result);
            return Integer.toString(result);
        } else if (query.toLowerCase().contains("square and a cube")){


        }else if (query.toLowerCase().contains("primes")){
/*            String result ="";
            queryNumbers = query.split(":")[1].split(",");

            for (int i=0;i<queryNumbers.length;i++) {
                if (queryNumbers[i] != null) {

                    queryInt[i] = Integer.parseInt(queryNumbers[i].trim());
                    if (isPrime(queryInt[i])){
                        result+= Integer.toString(queryInt[i])+ " ";
                    }
                }
                System.out.println("Primes: "+result);
                return result;
            }*/


        }else if (query.toLowerCase().contains("Eiffel")){
            return "Paris";
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
