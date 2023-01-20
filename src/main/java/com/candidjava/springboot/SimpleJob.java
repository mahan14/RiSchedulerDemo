package com.candidjava.springboot;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

public class SimpleJob implements Job{
 
    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
    	int a= 5;
        int b=3;
        int sum= a+b;
    	System.out.println("5+3 ={sum}"+sum);
        
    }
}