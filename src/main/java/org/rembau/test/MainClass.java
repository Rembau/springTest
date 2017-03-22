package org.rembau.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rembau on 2017/3/22.
 */
public class MainClass {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:applicationContext.xml"});
        TestBean testBean = context.getBean(TestBean.class);
        testBean.handle();
    }
}
