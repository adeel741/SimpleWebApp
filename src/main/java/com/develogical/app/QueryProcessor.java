package com.develogical.app;


public class QueryProcessor {
    boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        System.out.println("Testing Prime: "+ n);
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

/*
            String result ="";
            queryNumbers = query.split(":")[1].split(",");

            for (int i=0;i<queryNumbers.length;i++) {
                if (queryNumbers[i] != null) {

                    queryInt[i] = Integer.parseInt(queryNumbers[i].trim());
                    if (isPrime(queryInt[i])){
                        result += Integer.toString(queryInt[i])+ " ";
                    }
                }
                System.out.println("Primes: "+result);
                return result;
            }

*/


        }else if (query.toLowerCase().contains("eiffel")){
            return "Paris";
        }
        else if (query.toLowerCase().contains("banana")){
            return "yellow";
        }
        else if (query.toLowerCase().contains("bond")){
            return "Sean Connery";
        }else if (query.toLowerCase().contains("spain")){
            return "peseta";
        }else if (query.toLowerCase().contains("fibonacci")){
            String[] array = query.split(" ");
            System.out.println("value: "+array[4]);
            if (array[4].toLowerCase().trim().contains("1st")){
                return "0";
            }else if (array[4].toLowerCase().trim().contains("2nd")){
                return "1";
            }else if (array[4].toLowerCase().trim().contains("3rd")){
                return "1";
            }
            else if (array[4].toLowerCase().trim().contains("4th")){
                return "2";
            }else if (array[4].toLowerCase().trim().contains("5th")){
                return "3";
            }else if (array[4].toLowerCase().trim().contains("6th")){
                return "5";
            }else if (array[4].toLowerCase().trim().contains("7th")){
                return "8";
            }else if (array[4].toLowerCase().trim().contains("8th")){
                return "13";
            }else if (array[4].toLowerCase().trim().contains("9th")){
                return "21";
            }else if (array[4].toLowerCase().trim().contains("10th")){
                return "34";
            }else if (array[4].toLowerCase().trim().contains("11th")){
                return "55";
            }else if (array[4].toLowerCase().trim().contains("12th")){
                return "89";
            }
            else if (array[4].toLowerCase().trim().contains("13th")){
                return "144";
            }
            return "0";
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
