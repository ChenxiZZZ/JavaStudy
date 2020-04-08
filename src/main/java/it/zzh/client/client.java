package it.zzh.client;

import it.zzh.domain.person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

public class client {
    @Resource(name="person")
    private static person p2=null;
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        person p1=context.getBean("person",person.class);
        System.out.println(p1);
        if(p2!=null)
            System.out.println(p2);
        System.out.println("testCommit");
        //test
    }
}
