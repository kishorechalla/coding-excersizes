package org.coding;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BalancedBracketsTest {

    private BalancedBrackets balancedBrackets;

    @Before
    public void setup() {
        balancedBrackets = new BalancedBrackets();
    }

    @Test
    public void isBalancedTest1() {
        boolean isBalanced = balancedBrackets.isBalanced("[{()}]");
        assertTrue(isBalanced);
    }

    @Test
    public void isBalancedTest2() {
        boolean isBalanced = balancedBrackets.isBalanced("[{(}])");
        assertFalse(isBalanced);
    }

    @Test
    public void isBalancedTest3() {
        boolean isBalanced = balancedBrackets.isBalanced("[abc]{}(def){([])}");
        assertTrue(isBalanced);
    }

    @Test
    public void isBalancedTest4() {
        boolean isBalanced = balancedBrackets.isBalanced("[]{}(){([])}");
        assertTrue(isBalanced);
    }

    @Test
    public void isBalancedTest5() {
        boolean isBalanced = balancedBrackets.isBalanced("");
        assertTrue(isBalanced);
    }

    @Test
    public void isBalancedTest6() {
        boolean isBalanced = balancedBrackets.isBalanced(null);
        assertFalse(isBalanced);
    }

}
