package org.example;


@FunctionalInterface
public interface MyCalculate
{
    int sum(int a, int b);
}

public class MyCalculateSum {

    MyCalculate myCalculateIntf = (a,b)->a+b;

   System.out.println("Total sum" +myCalculateIntf.sum(2,3));
}
