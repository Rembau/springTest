package org.rembau.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by rembau on 2017/3/22.
 */

@Service
public class TestBean4 {
    private final static Logger logger = LoggerFactory.getLogger(TestBean4.class);

    //自动依赖注入
    @Autowired
    private TestBean3 testBean3;

    @PostConstruct
    public void handel() {
        logger.info("test handle {}", this.getClass());
        testBean3.handle();
    }
}
