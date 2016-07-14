package com.develogical.app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        QueryProcessor query = new QueryProcessor();
        query.process(" which of the following numbers is the largest: 60, 412");
    }
    @Test
    public void plustest() throws Exception {
        QueryProcessor query = new QueryProcessor();
        query.process("what is 100 plus 12");
    }
    @Test
    public void multipliedtest() throws Exception {
        QueryProcessor query = new QueryProcessor();
        query.process("what is 100 multiplied by 12");
    }


}
