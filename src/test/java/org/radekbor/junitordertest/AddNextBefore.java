package org.radekbor.junitordertest;

import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * You should see
 * 1) setUp from Parent
 * 2) When you add another before you can both
 */
public class AddNextBefore extends AbstractJunitRoot {

    private final static Logger log = Logger.getLogger(AbstractJunitRoot.class.toString());

    @Before
    public void setUpInChild() {
        log.info("When you add another before you can both");
    }

    @Test
    public void test() {

    }


}
