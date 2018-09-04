package org.radekbor.junitordertest;

import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * You should see
 * 1) When you override and add @Before you can see only one
 */
public class OverrideBeforeWithAnnotation extends AbstractJunitRoot {

    private final static Logger log = Logger.getLogger(AbstractJunitRoot.class.toString());

    @Before
    public void setUp() {
        log.info("When you override and add @Before you can see only one");
    }

    @Test
    public void test() {

    }

}
