package org.rembau.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by rembau on 2017/3/22.
 */

public class TestBean {
    private final static Logger logger = LoggerFactory.getLogger(TestBean.class);

    public TestBean() {
        logger.info("构造器");
    }

    static {
        logger.info("静态区");
    }

    public void handle() {
        logger.info("test");
    }
}
