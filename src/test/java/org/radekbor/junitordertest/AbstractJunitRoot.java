package org.radekbor.junitordertest;

import org.junit.Before;

import java.util.logging.Logger;

public abstract class AbstractJunitRoot {

    private final static Logger log = Logger.getLogger(AbstractJunitRoot.class.toString());

    @Before
    public void setUp() {
        log.info("setUp from Parent");
    }
}
