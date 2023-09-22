package org.example;

@FunctionalInterface
public interface AnFunctionalInterface {

    void m1();


    default public void m2()
    {
        System.out.println("M2 mehode");
    }

   public static void m3()
    {
        System.out.println("M3 mehode");
    }
}
