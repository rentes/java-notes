package basics;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;

/**
 * Created by 0930 on 2016-07-14.
 */
public class PrimitiveTypesTest {

        @Test
        public void absoluteOfMostNegativeValue() {
            final int mostNegative = Integer.MIN_VALUE;
            final int negated = Math.abs(mostNegative);
            assertFalse("No positive equivalent of Integer.MIN_VALUE", negated > 0);
        }
}
