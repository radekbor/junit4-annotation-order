package org.radekbor.junitordertest;

import org.junit.Test;

import java.util.logging.Logger;

/**
 * You should see
 * 1) When you override and don't add @Before you can see only one, from child
 */

public class OverrideBeforeWithoutAnnotation extends AbstractJunitRoot {

    private final static Logger log = Logger.getLogger(AbstractJunitRoot.class.toString());

    public void setUp() {
        log.info("When you override and don't add @Before you can see only one, from child");
    }

    @Test
    public void test() {

    }


}
