package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class FixtureTest {
    @Test
    void testLength() {
        // Test the length method from TestFixture
        int length = TestFixture.length("Hello");
        assert length == 5 : "Expected length to be 5, but was " + length;

        length = TestFixture.length(null);
        assert length == 0 : "Expected length of null to be 0, but was " + length;
    }
}
