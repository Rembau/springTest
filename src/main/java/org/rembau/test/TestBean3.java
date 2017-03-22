package org.rembau.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by rembau on 2017/3/22.
 */

@Service("testBean3")
public class TestBean3 {
    private final static Logger logger = LoggerFactory.getLogger(TestBean3.class);

    public void handle() {
        logger.info("test handle {}", this.getClass());
    }
}
