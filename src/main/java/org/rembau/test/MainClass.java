package org.rembau.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by rembau on 2017/3/22.
 */
public class MainClass {
    private final static Logger logger = LoggerFactory.getLogger(MainClass.class);

    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"classpath:applicationContext.xml"});

        TestBean testBean = context.getBean(TestBean.class);
        testBean.handle();

        logger.info("=============================================1");

        TestBean2 testBean2 = context.getBean(TestBean2.class);
        testBean2.handle();
    }
}
