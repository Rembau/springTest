package org.rembau.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by rembau on 2017/3/22.
 */
public class TestBean2 {
    private final static Logger logger = LoggerFactory.getLogger(TestBean2.class);

    private TestBean testBean;

    public TestBean2(TestBean testBean) {
        this.testBean = testBean;
    }

    public void handle() {
        logger.info("test handle：{}", this.getClass());
        testBean.handle();
    }
}
