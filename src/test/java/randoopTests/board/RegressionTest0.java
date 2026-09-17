package randoopTests.board;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = ar.edu.unrc.game2048.Board.WINNING_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        java.lang.Class<?> wildcardClass1 = direction0.getClass();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int0 = ar.edu.unrc.game2048.Board.DEFAULT_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy3.reset();
        java.lang.Class<?> wildcardClass5 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        java.lang.Class<?> wildcardClass1 = direction0.getClass();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int[] intArray0 = null;
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        java.lang.Class<?> wildcardClass2 = generateDeterministicCellStrategy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        java.lang.Class<?> wildcardClass6 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass5 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int[] intArray0 = null;
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        generateDeterministicCellStrategy1.reset();
        java.lang.Class<?> wildcardClass3 = generateDeterministicCellStrategy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy3.reset();
        java.lang.Class<?> wildcardClass5 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass5 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass6 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass4 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        java.lang.Class<?> wildcardClass6 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        java.lang.Class<?> wildcardClass6 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy4.reset();
        java.lang.Class<?> wildcardClass6 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy9.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        java.lang.Class<?> wildcardClass5 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass4 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass4 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.UP;
        java.lang.Class<?> wildcardClass1 = direction0.getClass();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.UP));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass6 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass4 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass3 = generateDeterministicCellStrategy2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass13 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass6 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass5 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass10 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy9.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass6 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass7 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass4 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass7 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy12.reset();
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass4 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        java.lang.Class<?> wildcardClass1 = direction0.getClass();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy4.reset();
        java.lang.Class<?> wildcardClass6 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass9 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass6 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass4 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass6 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass14 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        java.lang.Class<?> wildcardClass5 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass9 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy13.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass5 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        java.lang.Class<?> wildcardClass6 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy4.reset();
        java.lang.Class<?> wildcardClass6 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy11.reset();
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy2.reset();
        java.lang.Class<?> wildcardClass4 = generateDeterministicCellStrategy2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass5 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy10.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy4.reset();
        java.lang.Class<?> wildcardClass6 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        int[] intArray0 = null;
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        java.lang.Class<?> wildcardClass5 = generateDeterministicCellStrategy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass6 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass8 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy15.reset();
        java.lang.Class<?> wildcardClass17 = generateDeterministicCellStrategy15.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy9.reset();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass7 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass16 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass9 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass17 = generateDeterministicCellStrategy16.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass19 = generateDeterministicCellStrategy18.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy10.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass17 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy3.reset();
        java.lang.Class<?> wildcardClass5 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass12 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass19 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy10.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass7 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy10.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy9.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy10.reset();
        generateDeterministicCellStrategy10.reset();
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy4.reset();
        java.lang.Class<?> wildcardClass6 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        int[] intArray0 = null;
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        java.lang.Class<?> wildcardClass6 = generateDeterministicCellStrategy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass9 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        java.lang.Class<?> wildcardClass16 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass6 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass3 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass18 = generateDeterministicCellStrategy17.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy14.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        java.lang.Class<?> wildcardClass17 = generateDeterministicCellStrategy14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy14.reset();
        java.lang.Class<?> wildcardClass16 = generateDeterministicCellStrategy14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass20 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy10.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy10.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy10.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy12.reset();
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy20 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass21 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        java.lang.Class<?> wildcardClass16 = generateDeterministicCellStrategy12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass18 = generateDeterministicCellStrategy17.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass16 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass16 = generateDeterministicCellStrategy15.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy16.reset();
        generateDeterministicCellStrategy16.reset();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass19 = generateDeterministicCellStrategy18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass20 = generateDeterministicCellStrategy19.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy9.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        java.lang.Class<?> wildcardClass16 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        int[] intArray0 = null;
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy20 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy21 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy22 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy22.reset();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        int[] intArray0 = null;
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        java.lang.Class<?> wildcardClass4 = generateDeterministicCellStrategy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy13.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy12.reset();
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy12.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy15.reset();
        generateDeterministicCellStrategy15.reset();
        java.lang.Class<?> wildcardClass18 = generateDeterministicCellStrategy15.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        java.lang.Class<?> wildcardClass18 = generateDeterministicCellStrategy14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        java.lang.Class<?> wildcardClass6 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        int[] intArray0 = null;
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        java.lang.Class<?> wildcardClass19 = generateDeterministicCellStrategy14.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy14.reset();
        java.lang.Class<?> wildcardClass16 = generateDeterministicCellStrategy14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy11.reset();
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass5 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy10.reset();
        generateDeterministicCellStrategy10.reset();
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy2.reset();
        generateDeterministicCellStrategy2.reset();
        java.lang.Class<?> wildcardClass5 = generateDeterministicCellStrategy2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy12.reset();
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy12.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        java.lang.Class<?> wildcardClass17 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass11 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        java.lang.Class<?> wildcardClass16 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy15.reset();
        generateDeterministicCellStrategy15.reset();
        generateDeterministicCellStrategy15.reset();
        generateDeterministicCellStrategy15.reset();
        generateDeterministicCellStrategy15.reset();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass16 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass16 = generateDeterministicCellStrategy15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        java.lang.Class<?> wildcardClass17 = generateDeterministicCellStrategy12.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass17 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        java.lang.Class<?> wildcardClass22 = generateDeterministicCellStrategy19.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass20 = generateDeterministicCellStrategy19.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy10.reset();
        generateDeterministicCellStrategy10.reset();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy15.reset();
        generateDeterministicCellStrategy15.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy10.reset();
        generateDeterministicCellStrategy10.reset();
        generateDeterministicCellStrategy10.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass19 = generateDeterministicCellStrategy18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        int[] intArray3 = new int[] { 100, (short) -1, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, (-1), (-1) });
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass17 = generateDeterministicCellStrategy16.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy20 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass16 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy15.reset();
        java.lang.Class<?> wildcardClass17 = generateDeterministicCellStrategy15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass11 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy15.reset();
        generateDeterministicCellStrategy15.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy18.reset();
        generateDeterministicCellStrategy18.reset();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        int[] intArray1 = new int[] { (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass3 = generateDeterministicCellStrategy2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass19 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy17.reset();
        generateDeterministicCellStrategy17.reset();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy18.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy20 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy21 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy22 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        java.lang.Class<?> wildcardClass23 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass11 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy3.reset();
        java.lang.Class<?> wildcardClass5 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass18 = generateDeterministicCellStrategy17.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass17 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy15.reset();
        java.lang.Class<?> wildcardClass17 = generateDeterministicCellStrategy15.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        int[] intArray1 = new int[] { (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        int[] intArray1 = new int[] { (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy2.reset();
        java.lang.Class<?> wildcardClass4 = generateDeterministicCellStrategy2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy10.reset();
        generateDeterministicCellStrategy10.reset();
        generateDeterministicCellStrategy10.reset();
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy13.reset();
        generateDeterministicCellStrategy13.reset();
        generateDeterministicCellStrategy13.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy20 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy21 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy22 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy23 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy23.reset();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy4.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass20 = generateDeterministicCellStrategy19.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass16 = generateDeterministicCellStrategy15.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy11.reset();
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy20 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy21 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy21.reset();
        generateDeterministicCellStrategy21.reset();
        generateDeterministicCellStrategy21.reset();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy19.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        int[] intArray6 = new int[] { (byte) 0, 10, 100, (byte) 1, 'a', (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        java.lang.Class<?> wildcardClass8 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 10, 100, 1, 97, 100 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        int[] intArray0 = null;
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy13.reset();
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy14.reset();
        java.lang.Class<?> wildcardClass16 = generateDeterministicCellStrategy14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy15.reset();
        generateDeterministicCellStrategy15.reset();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy10.reset();
        generateDeterministicCellStrategy10.reset();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        int[] intArray0 = null;
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        java.lang.Class<?> wildcardClass7 = generateDeterministicCellStrategy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass15 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        int[] intArray1 = new int[] { (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy3.reset();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 100 });
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy9.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        int[] intArray0 = null;
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        generateDeterministicCellStrategy1.reset();
        java.lang.Class<?> wildcardClass9 = generateDeterministicCellStrategy1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy16.reset();
        generateDeterministicCellStrategy16.reset();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy20 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy20.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass16 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        int[] intArray5 = new int[] { (byte) 0, (byte) 100, 4, (short) 0, 0 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 0, 100, 4, 0, 0 });
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        int[] intArray5 = new int[] { 10, (byte) 1, '4', 10, 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 10, 1, 52, 10, 100 });
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy14.reset();
        java.lang.Class<?> wildcardClass16 = generateDeterministicCellStrategy14.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy18.reset();
        java.lang.Class<?> wildcardClass20 = generateDeterministicCellStrategy18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy16.reset();
        java.lang.Class<?> wildcardClass18 = generateDeterministicCellStrategy16.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy8.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        int[] intArray6 = new int[] { (byte) 0, 10, 100, (byte) 1, 'a', (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 10, 100, 1, 97, 100 });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass11 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy10.reset();
        generateDeterministicCellStrategy10.reset();
        java.lang.Class<?> wildcardClass13 = generateDeterministicCellStrategy10.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy18.reset();
        generateDeterministicCellStrategy18.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        java.lang.Class<?> wildcardClass4 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy20 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy21 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy13.reset();
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy4.reset();
        generateDeterministicCellStrategy4.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy16.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy13.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy20 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy20.reset();
        generateDeterministicCellStrategy20.reset();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        generateDeterministicCellStrategy5.reset();
        java.lang.Class<?> wildcardClass15 = generateDeterministicCellStrategy5.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        java.lang.Class<?> wildcardClass16 = generateDeterministicCellStrategy12.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        java.lang.Class<?> wildcardClass12 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy10.reset();
        generateDeterministicCellStrategy10.reset();
        generateDeterministicCellStrategy10.reset();
        generateDeterministicCellStrategy10.reset();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy18.reset();
        java.lang.Class<?> wildcardClass20 = generateDeterministicCellStrategy18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        java.lang.Class<?> wildcardClass16 = generateDeterministicCellStrategy12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        int[] intArray6 = new int[] { (byte) 0, 10, 100, (byte) 1, 'a', (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 10, 100, 1, 97, 100 });
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        generateDeterministicCellStrategy12.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy19.reset();
        java.lang.Class<?> wildcardClass21 = generateDeterministicCellStrategy19.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy20 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy21 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        java.lang.Class<?> wildcardClass18 = generateDeterministicCellStrategy11.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        int[] intArray2 = new int[] { (short) 10, (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy16.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 100 });
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy12.reset();
        java.lang.Class<?> wildcardClass14 = generateDeterministicCellStrategy12.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        int[] intArray3 = new int[] { (short) 100, '#', (short) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] { 100, 35, 1 });
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        int[] intArray4 = new int[] { '#', (byte) 10, 100, (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy20 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        generateDeterministicCellStrategy20.reset();
        java.lang.Class<?> wildcardClass22 = generateDeterministicCellStrategy20.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] { 35, 10, 100, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        int[] intArray6 = new int[] { (byte) 0, 10, 100, (byte) 1, 'a', (short) 100 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 0, 10, 100, 1, 97, 100 });
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        int[] intArray1 = new int[] { (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { 1 });
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        int[] intArray2 = new int[] { (short) 10, (byte) 1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        generateDeterministicCellStrategy14.reset();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 10, 1 });
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy17.reset();
        generateDeterministicCellStrategy17.reset();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        int[] intArray1 = new int[] { (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        generateDeterministicCellStrategy3.reset();
        java.lang.Class<?> wildcardClass8 = generateDeterministicCellStrategy3.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] { (-1) });
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        int[] intArray2 = new int[] { (short) 0, 2048 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy20 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray2);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertArrayEquals(intArray2, new int[] { 0, 2048 });
        org.junit.Assert.assertNotNull(wildcardClass21);
    }
}

