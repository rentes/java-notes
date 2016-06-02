/**
 * Created by 0930 on 2016-06-02.
 */
package basics;

import org.junit.Assert.assertFalse;
import org.junit.Test;

public class PrimitiveTypesTest {
    @Test
    public void absoluteOfMostNegativeValue() {
        final int mostNegative = Integer.MIN_VALUE;
        final int negated = Math.abs(mostNegative);
        assertFalse("No positive equivalent of Integer.MIN_VALUE", negated > 0);
    }
}

