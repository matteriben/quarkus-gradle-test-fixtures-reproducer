package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@QuarkusTest
public class ExampleTest {
    private static final Logger log = LoggerFactory.getLogger(ExampleTest.class);

    @Test
    void testToString() {
        log.info("classloader(ExampleTest): {}", this.getClass().getClassLoader());
        log.info("classloader(TestFixture): {}", TestFixture.class.getClassLoader());
        // Test the toString method from TestFixture
        String str = TestFixture.toString(this);
        assert str != null : "Expected toString to return a non-null value, but was null";
    }
}
