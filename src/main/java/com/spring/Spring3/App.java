package com.spring.Spring3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Impl.GoldCustomer;
import com.spring.Impl.PlatinumCustomer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("beans.xml");
        
        GoldCustomer gc = (GoldCustomer)cx.getBean("goldCustomer");
        PlatinumCustomer pc = (PlatinumCustomer)cx.getBean("platinumCustomer");
        
        gc.giveDetails();
        pc.giveDetails();
    }
}
