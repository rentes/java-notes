package basics;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static junit.framework.TestCase.assertFalse;

/**
 * Created by Miguel Rentes on 2016-07-14.
 */
public class PrimitiveTypesTest {
    private static final Logger log = LoggerFactory.getLogger(PrimitiveTypesTest.class);

        @Test
        public void absoluteOfMostNegativeValue() {
            final int mostNegative = Integer.MIN_VALUE;
            final int negated = Math.abs(mostNegative);
            assertFalse("No positive equivalent of Integer.MIN_VALUE", negated > 0);
        }
}
