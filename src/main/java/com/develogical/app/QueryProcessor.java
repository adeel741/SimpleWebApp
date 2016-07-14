package com.develogical.app;

import com.sun.tools.javac.util.ArrayUtils;
import org.eclipse.jetty.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class QueryProcessor {

    public String process(String query) {
        int max = 0;
        String[] queryArray = null;
        String[] queryNumbers = null;
        int[] queryInt = null;
        queryNumbers = query.split(":")[1].split(",");
        for (int i=0;i<queryNumbers.length;i++){
            queryInt[i] = Integer.parseInt(queryNumbers[i]);
            if (queryInt[i] > max){max = queryInt[i];}
        }

        return ""+max;


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
