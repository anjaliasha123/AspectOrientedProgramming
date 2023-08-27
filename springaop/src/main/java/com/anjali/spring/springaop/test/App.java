package com.anjali.spring.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anjali.spring.springaop.ProductService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/anjali/spring/springaop/test/config.xml");
        ProductService service =  (ProductService)context.getBean("productService");
        int ans = service.multiply(23, 10);
        System.out.println("multiplied ans: "+ ans);
    }
}
