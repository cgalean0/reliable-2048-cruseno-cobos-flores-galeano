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
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        java.lang.Class<?> wildcardClass1 = direction0.getClass();
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        ar.edu.unrc.game2048.GenerateCellStrategy generateCellStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) '#', generateCellStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int[] intArray0 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        ar.edu.unrc.game2048.Board board2 = null;
        // The following exception was thrown during execution in test generation
        try {
            generateDeterministicCellStrategy1.addTile(board2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int[] intArray0 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        java.lang.Class<?> wildcardClass2 = generateDeterministicCellStrategy1.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int0 = ar.edu.unrc.game2048.Board.MAX_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int[] intArray5 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.Board board7 = null;
        // The following exception was thrown during execution in test generation
        try {
            generateDeterministicCellStrategy6.addTile(board7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 1, 1, 97, 32 });
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int[] intArray0 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        java.lang.Class<?> wildcardClass2 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        ar.edu.unrc.game2048.GenerateCellStrategy generateCellStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) -1, generateCellStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int int0 = ar.edu.unrc.game2048.Board.WINNING_VALUE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2048 + "'", int0 == 2048);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.UP;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.UP));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        ar.edu.unrc.game2048.Board board0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int[] intArray0 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        java.lang.Class<?> wildcardClass3 = generateDeterministicCellStrategy2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((-1), (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        int[] intArray5 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        ar.edu.unrc.game2048.Board board9 = null;
        // The following exception was thrown during execution in test generation
        try {
            generateDeterministicCellStrategy6.addTile(board9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 1, 1, 97, 32 });
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.Board board7 = null;
        // The following exception was thrown during execution in test generation
        try {
            generateDeterministicCellStrategy6.addTile(board7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        int[] intArray0 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        ar.edu.unrc.game2048.Board board3 = null;
        // The following exception was thrown during execution in test generation
        try {
            generateDeterministicCellStrategy2.addTile(board3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        int int0 = ar.edu.unrc.game2048.Board.DEFAULT_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.row;
        int int4 = position2.col;
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int[] intArray1 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        java.lang.Class<?> wildcardClass4 = position2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) (byte) 0, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.row;
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        java.lang.Class<?> wildcardClass6 = position2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, 32)" + "'", str5, "(52, 32)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.row;
        int int4 = position2.col;
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(52, 32)" + "'", str6, "(52, 32)");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(64, (int) (byte) -1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 64);
        int[] intArray6 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        boolean boolean8 = position5.equals((java.lang.Object) intArray6);
        boolean boolean9 = position2.equals((java.lang.Object) position5);
        int int10 = position5.col;
        java.lang.Class<?> wildcardClass11 = position5.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        java.lang.Class<?> wildcardClass10 = generateDeterministicCellStrategy7.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        ar.edu.unrc.game2048.Cell cell17 = null;
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell((int) '#', (int) (short) 100, cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        int[] intArray0 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        int[] intArray9 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray9);
        generateDeterministicCellStrategy10.reset();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        boolean boolean13 = board12.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            generateDeterministicCellStrategy2.addTile(board12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', 32);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int[] intArray1 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(100, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Max Size Allowed is 64x64");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        int int4 = position2.col;
        boolean boolean6 = position2.equals((java.lang.Object) (short) 100);
        int int7 = position2.col;
        int int8 = position2.col;
        int int9 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveDown();
        boolean boolean13 = board11.isWinningBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell19 = null;
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell((int) (byte) 100, 1, cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) '4');
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 52)" + "'", str4, "(0, 52)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.Class<?> wildcardClass13 = board11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray13 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        int int19 = board18.getSize();
        java.lang.String str20 = board18.toString();
        int int21 = board18.getScore();
        boolean boolean22 = board18.moveLeft();
        generateDeterministicCellStrategy6.addTile(board18);
        java.lang.Class<?> wildcardClass24 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str20, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isWinningBoard();
        int int11 = board9.getSize();
        ar.edu.unrc.game2048.Cell cell14 = null;
        // The following exception was thrown during execution in test generation
        try {
            board9.setCell(32, (int) (short) 10, cell14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 10) is out of bounds for board size 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveDown();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = board11.getCell((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.row;
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        boolean boolean7 = position2.equals((java.lang.Object) "(0, 52)");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, 32)" + "'", str5, "(52, 32)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        int int5 = position2.row;
        java.lang.String str6 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(52, 32)" + "'", str4, "(52, 32)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(52, 32)" + "'", str6, "(52, 32)");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((-1), (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        int int7 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(52, 32)" + "'", str4, "(52, 32)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, 32)" + "'", str5, "(52, 32)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) '4');
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(35, 52)" + "'", str3, "(35, 52)");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = board11.getCell(4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        int[] intArray7 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray7);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray7);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray7);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray7);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy11);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Max Size Allowed is 64x64");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 32, 52, 32, (-1) });
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        int[] intArray11 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray11);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray11);
        generateDeterministicCellStrategy13.reset();
        boolean boolean15 = board9.equals((java.lang.Object) generateDeterministicCellStrategy13);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board9.getEmptyPositions();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(positionSet16);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getScore();
        boolean boolean14 = board11.moveRight();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = board11.getCell((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveDown();
        ar.edu.unrc.game2048.Cell cell15 = null;
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell(64, (int) '4', cell15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (64, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        java.lang.String str7 = position2.toString();
        java.lang.String str8 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(52, 32)" + "'", str4, "(52, 32)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, 32)" + "'", str5, "(52, 32)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(52, 32)" + "'", str7, "(52, 32)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "(52, 32)" + "'", str8, "(52, 32)");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        int int4 = position2.col;
        boolean boolean6 = position2.equals((java.lang.Object) (short) 100);
        int int7 = position2.row;
        int int8 = position2.col;
        java.lang.String str9 = position2.toString();
        java.lang.Class<?> wildcardClass10 = position2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(52, 32)" + "'", str9, "(52, 32)");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 64);
        int[] intArray3 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        boolean boolean5 = position2.equals((java.lang.Object) intArray3);
        java.lang.String str6 = position2.toString();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(10, 64)" + "'", str6, "(10, 64)");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isWinningBoard();
        boolean boolean11 = board9.isWinningBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        boolean boolean15 = board11.moveLeft();
        boolean boolean17 = board11.equals((java.lang.Object) false);
        boolean boolean18 = board11.isLosingBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        boolean boolean15 = board11.moveLeft();
        ar.edu.unrc.game2048.Cell cell18 = null;
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell(52, 52, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        boolean boolean11 = board9.hasEmptyCells();
        boolean boolean12 = board9.moveLeft();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        boolean boolean11 = board9.isFull();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        boolean boolean12 = board11.hasEmptyCells();
        boolean boolean13 = board11.hasEmptyCells();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        int[] intArray1 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((int) (byte) 10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.isWinningBoard();
        boolean boolean13 = board11.hasEmptyCells();
        boolean boolean14 = board11.repOk();
        ar.edu.unrc.game2048.Cell cell17 = null;
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell((int) ' ', 0, cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isWinningBoard();
        int int11 = board9.getSize();
        boolean boolean12 = board9.isLosingBoard();
        int int13 = board9.getScore();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.hasEmptyCells();
        boolean boolean13 = board11.moveRight();
        boolean boolean14 = board11.moveLeft();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board11);
        ar.edu.unrc.game2048.Cell cell18 = null;
        // The following exception was thrown during execution in test generation
        try {
            board15.setCell(1, (int) '4', cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray12 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray12);
        int[] intArray20 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy21 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray20);
        generateDeterministicCellStrategy21.reset();
        generateDeterministicCellStrategy21.reset();
        generateDeterministicCellStrategy21.reset();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy21);
        int int26 = board25.getSize();
        java.lang.String str27 = board25.toString();
        int int28 = board25.getScore();
        boolean boolean29 = board25.moveLeft();
        generateDeterministicCellStrategy13.addTile(board25);
        generateDeterministicCellStrategy6.addTile(board25);
        ar.edu.unrc.game2048.Cell cell34 = null;
        // The following exception was thrown during execution in test generation
        try {
            board25.setCell((int) '4', (int) '4', cell34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str27, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell15 = null;
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell(0, (int) '4', cell15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getScore();
        boolean boolean14 = board11.moveRight();
        ar.edu.unrc.game2048.Cell cell17 = null;
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell((int) (short) 100, (int) '#', cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 35) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveDown();
        int int13 = board11.getSize();
        int int14 = board11.getScore();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = board11.getCell((int) (byte) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        int[] intArray11 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray11);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray11);
        generateDeterministicCellStrategy13.reset();
        boolean boolean15 = board9.equals((java.lang.Object) generateDeterministicCellStrategy13);
        int[] intArray22 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy23 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray22);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy24 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray22);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy25 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray22);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy26 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray22);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy26);
        boolean boolean28 = board27.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            generateDeterministicCellStrategy13.addTile(board27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 0, (int) (byte) 10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        int int4 = position2.col;
        boolean boolean6 = position2.equals((java.lang.Object) (short) 100);
        int int7 = position2.row;
        int int8 = position2.col;
        boolean boolean10 = position2.equals((java.lang.Object) "Score: 0\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getScore();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board11);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = board14.getCell((int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 97) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board11.getEmptyPositions();
        int int14 = board11.getSize();
        boolean boolean15 = board11.repOk();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell18 = board11.getCell(64, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (64, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isWinningBoard();
        boolean boolean11 = board9.isFull();
        boolean boolean12 = board9.isLosingBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveRight();
        ar.edu.unrc.game2048.Cell cell15 = null;
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell((int) (short) 0, 1, cell15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.isWinningBoard();
        boolean boolean13 = board11.moveUp();
        int int14 = board11.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray12 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray12);
        int[] intArray20 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy21 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray20);
        generateDeterministicCellStrategy21.reset();
        generateDeterministicCellStrategy21.reset();
        generateDeterministicCellStrategy21.reset();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy21);
        int int26 = board25.getSize();
        java.lang.String str27 = board25.toString();
        int int28 = board25.getScore();
        boolean boolean29 = board25.moveLeft();
        generateDeterministicCellStrategy13.addTile(board25);
        generateDeterministicCellStrategy6.addTile(board25);
        ar.edu.unrc.game2048.Cell cell34 = null;
        // The following exception was thrown during execution in test generation
        try {
            board25.setCell(100, 64, cell34);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 64) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str27, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        int[] intArray11 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray11);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray11);
        generateDeterministicCellStrategy13.reset();
        boolean boolean15 = board9.equals((java.lang.Object) generateDeterministicCellStrategy13);
        int[] intArray21 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy22 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray21);
        int[] intArray29 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy30 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray29);
        generateDeterministicCellStrategy30.reset();
        generateDeterministicCellStrategy30.reset();
        generateDeterministicCellStrategy30.reset();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy30);
        boolean boolean35 = board34.moveDown();
        boolean boolean36 = board34.isLosingBoard();
        boolean boolean37 = board34.hasEmptyCells();
        generateDeterministicCellStrategy22.addTile(board34);
        // The following exception was thrown during execution in test generation
        try {
            generateDeterministicCellStrategy13.addTile(board34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) (short) 10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int10 = position9.col;
        java.lang.String str11 = position9.toString();
        boolean boolean12 = position2.equals((java.lang.Object) position9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(52, 32)" + "'", str4, "(52, 32)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, 32)" + "'", str5, "(52, 32)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(52, 32)" + "'", str11, "(52, 32)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveDown();
        boolean boolean13 = board11.isLosingBoard();
        boolean boolean14 = board11.hasEmptyCells();
        boolean boolean15 = board11.moveRight();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        int int4 = position2.col;
        boolean boolean6 = position2.equals((java.lang.Object) (short) 100);
        int int7 = position2.col;
        int int8 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        int[] intArray11 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray11);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray11);
        generateDeterministicCellStrategy13.reset();
        boolean boolean15 = board9.equals((java.lang.Object) generateDeterministicCellStrategy13);
        generateDeterministicCellStrategy13.reset();
        int[] intArray23 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy24 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray23);
        generateDeterministicCellStrategy24.reset();
        generateDeterministicCellStrategy24.reset();
        generateDeterministicCellStrategy24.reset();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy24);
        boolean boolean29 = board28.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet30 = board28.getEmptyPositions();
        boolean boolean31 = board28.moveDown();
        java.lang.String str32 = board28.toString();
        boolean boolean33 = board28.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet34 = board28.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            generateDeterministicCellStrategy13.addTile(board28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(positionSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    1|     |    1|\n+-----+-----+-----+-----+\n" + "'", str32, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    1|     |    1|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(positionSet34);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) (byte) 10);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        int[] intArray1 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        generateDeterministicCellStrategy3.reset();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board11.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell16 = board11.getCell((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(positionSet13);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        generateDeterministicCellStrategy7.reset();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        int[] intArray0 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        int[] intArray9 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray9);
        generateDeterministicCellStrategy10.reset();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        boolean boolean13 = board12.isWinningBoard();
        int int14 = board12.getSize();
        boolean boolean15 = board12.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            generateDeterministicCellStrategy2.addTile(board12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.hasEmptyCells();
        boolean boolean13 = board11.moveRight();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board11);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(64, (int) (byte) -1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 64);
        int[] intArray6 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        boolean boolean8 = position5.equals((java.lang.Object) intArray6);
        boolean boolean9 = position2.equals((java.lang.Object) position5);
        int int10 = position2.col;
        int int11 = position2.row;
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.hasEmptyCells();
        boolean boolean13 = board11.moveRight();
        boolean boolean14 = board11.moveLeft();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = board11.getCell(32, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveDown();
        int int13 = board11.getSize();
        boolean boolean14 = board11.moveUp();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        int int5 = position2.row;
        ar.edu.unrc.game2048.Board.Position position8 = new ar.edu.unrc.game2048.Board.Position(2048, 0);
        java.lang.String str9 = position8.toString();
        boolean boolean10 = position2.equals((java.lang.Object) str9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(52, 32)" + "'", str4, "(52, 32)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(2048, 0)" + "'", str9, "(2048, 0)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(100, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Max Size Allowed is 64x64");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        int[] intArray6 = new int[] { (-1), (byte) 10, ' ', 4, 10, (byte) -1 };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { (-1), 10, 32, 4, 10, (-1) });
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(52, 2048);
        java.lang.Class<?> wildcardClass3 = position2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy8.reset();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.isWinningBoard();
        boolean boolean17 = board11.isFull();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isWinningBoard();
        int int11 = board9.getSize();
        boolean boolean12 = board9.moveRight();
        int int13 = board9.getSize();
        boolean boolean14 = board9.repOk();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = board9.getCell(10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 100) is out of bounds for board size 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveRight();
        boolean boolean13 = board11.repOk();
        boolean boolean14 = board11.moveRight();
        int int15 = board11.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        int[] intArray1 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(1, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray13 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        int int19 = board18.getSize();
        java.lang.String str20 = board18.toString();
        int int21 = board18.getScore();
        boolean boolean22 = board18.moveLeft();
        generateDeterministicCellStrategy6.addTile(board18);
        java.lang.String str24 = board18.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell27 = board18.getCell((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str20, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str24, "Score: 0\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.repOk();
        boolean boolean11 = board9.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board9.getEmptyPositions();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(positionSet12);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray13 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        int int19 = board18.getSize();
        java.lang.String str20 = board18.toString();
        int int21 = board18.getScore();
        boolean boolean22 = board18.moveLeft();
        generateDeterministicCellStrategy6.addTile(board18);
        int[] intArray30 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy31 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray30);
        generateDeterministicCellStrategy31.reset();
        generateDeterministicCellStrategy31.reset();
        generateDeterministicCellStrategy31.reset();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy31);
        int int36 = board35.getSize();
        boolean boolean37 = board35.moveUp();
        boolean boolean38 = board35.moveLeft();
        boolean boolean39 = board35.repOk();
        generateDeterministicCellStrategy6.addTile(board35);
        ar.edu.unrc.game2048.Cell cell43 = null;
        // The following exception was thrown during execution in test generation
        try {
            board35.setCell(0, (int) (short) -1, cell43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str20, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.moveLeft();
        boolean boolean15 = board11.moveDown();
        int[] intArray22 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy23 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray22);
        generateDeterministicCellStrategy23.reset();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy23);
        boolean boolean26 = board25.moveUp();
        boolean boolean27 = board25.moveDown();
        boolean boolean28 = board11.equals((java.lang.Object) boolean27);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 64);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveDown();
        int int13 = board11.getSize();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board11.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell19 = null;
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell((int) 'a', (int) (byte) 100, cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(positionSet16);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.moveLeft();
        boolean boolean15 = board11.repOk();
        int[] intArray22 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy23 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray22);
        generateDeterministicCellStrategy23.reset();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy23);
        boolean boolean26 = board25.isWinningBoard();
        int int27 = board25.getSize();
        boolean boolean28 = board25.isLosingBoard();
        boolean boolean29 = board11.equals((java.lang.Object) boolean28);
        boolean boolean30 = board11.moveDown();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-1), (int) (byte) 1);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, 1)" + "'", str3, "(-1, 1)");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board11.getEmptyPositions();
        boolean boolean14 = board11.moveDown();
        java.lang.String str15 = board11.toString();
        int int16 = board11.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    1|     |    1|\n+-----+-----+-----+-----+\n" + "'", str15, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    1|     |    1|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        int[] intArray5 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 1, 1, 97, 32 });
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        int int4 = position2.col;
        int[] intArray10 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray10);
        boolean boolean12 = position2.equals((java.lang.Object) intArray10);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray10);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray10);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray13 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        boolean boolean17 = board16.isFull();
        boolean boolean18 = board16.isWinningBoard();
        generateDeterministicCellStrategy6.addTile(board16);
        generateDeterministicCellStrategy6.reset();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveDown();
        int int13 = board11.getSize();
        boolean boolean14 = board11.repOk();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.moveLeft();
        boolean boolean15 = board11.repOk();
        int[] intArray22 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy23 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray22);
        generateDeterministicCellStrategy23.reset();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy23);
        boolean boolean26 = board25.isWinningBoard();
        int int27 = board25.getSize();
        boolean boolean28 = board25.isLosingBoard();
        boolean boolean29 = board11.equals((java.lang.Object) boolean28);
        boolean boolean30 = board11.moveUp();
        boolean boolean31 = board11.isFull();
        boolean boolean32 = board11.moveLeft();
        boolean boolean33 = board11.moveDown();
        boolean boolean34 = board11.repOk();
        java.lang.String str35 = board11.toString();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Score: 8\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str35, "Score: 8\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-1), 10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isWinningBoard();
        boolean boolean11 = board9.isFull();
        java.lang.Class<?> wildcardClass12 = board9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveDown();
        int int13 = board11.getSize();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board11.getEmptyPositions();
        int int17 = board11.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board11.getEmptyPositions();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(positionSet15);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray13 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        boolean boolean19 = board18.moveDown();
        boolean boolean20 = board18.isLosingBoard();
        boolean boolean21 = board18.hasEmptyCells();
        generateDeterministicCellStrategy6.addTile(board18);
        int int23 = board18.getScore();
        boolean boolean24 = board18.hasEmptyCells();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.moveLeft();
        boolean boolean15 = board11.repOk();
        int[] intArray22 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy23 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray22);
        generateDeterministicCellStrategy23.reset();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy23);
        boolean boolean26 = board25.isWinningBoard();
        int int27 = board25.getSize();
        boolean boolean28 = board25.isLosingBoard();
        boolean boolean29 = board11.equals((java.lang.Object) boolean28);
        boolean boolean30 = board11.moveUp();
        boolean boolean31 = board11.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet32 = board11.getEmptyPositions();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(positionSet32);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.repOk();
        boolean boolean11 = board9.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell14 = board9.getCell((int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 35) is out of bounds for board size 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        int int4 = position2.col;
        boolean boolean6 = position2.equals((java.lang.Object) (short) 100);
        int int7 = position2.row;
        int int8 = position2.col;
        int int9 = position2.row;
        int int10 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        boolean boolean15 = board11.moveLeft();
        boolean boolean17 = board11.equals((java.lang.Object) false);
        boolean boolean18 = board11.isFull();
        java.lang.String str19 = board11.toString();
        boolean boolean20 = board11.moveDown();
        boolean boolean21 = board11.hasEmptyCells();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str19, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board11.getEmptyPositions();
        boolean boolean14 = board11.moveDown();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean16 = board15.isLosingBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((-1), (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 1);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, 1)" + "'", str3, "(10, 1)");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        ar.edu.unrc.game2048.GenerateCellStrategy generateCellStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(0, generateCellStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getScore();
        boolean boolean14 = board11.moveRight();
        boolean boolean15 = board11.moveUp();
        boolean boolean16 = board11.moveLeft();
        boolean boolean17 = board11.moveLeft();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell20 = board11.getCell(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass3 = position2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 64);
        int[] intArray3 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        boolean boolean5 = position2.equals((java.lang.Object) intArray3);
        int int6 = position2.row;
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        ar.edu.unrc.game2048.Board.Position position3 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int4 = position3.col;
        int int5 = position3.col;
        int[] intArray11 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray11);
        boolean boolean13 = position3.equals((java.lang.Object) intArray11);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(0, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        ar.edu.unrc.game2048.Cell cell13 = null;
        // The following exception was thrown during execution in test generation
        try {
            board9.setCell((int) (byte) 0, (int) ' ', cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 32) is out of bounds for board size 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (byte) 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        java.lang.Class<?> wildcardClass7 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        boolean boolean15 = board11.isFull();
        ar.edu.unrc.game2048.Cell cell18 = null;
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell((int) 'a', 52, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 52) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.moveUp();
        boolean boolean11 = board9.moveDown();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell14 = board9.getCell((int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, -1) is out of bounds for board size 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.moveUp();
        boolean boolean11 = board9.moveLeft();
        boolean boolean12 = board9.isFull();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(100, (int) (short) -1);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(100, -1)" + "'", str4, "(100, -1)");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.hasEmptyCells();
        ar.edu.unrc.game2048.Board.Position position15 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int16 = position15.col;
        int int17 = position15.col;
        boolean boolean19 = position15.equals((java.lang.Object) (short) 100);
        int int20 = position15.col;
        boolean boolean21 = board11.equals((java.lang.Object) position15);
        boolean boolean22 = board11.isWinningBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        boolean boolean11 = board9.hasEmptyCells();
        boolean boolean12 = board9.isFull();
        boolean boolean13 = board9.moveRight();
        int int14 = board9.getSize();
        ar.edu.unrc.game2048.Cell cell17 = null;
        // The following exception was thrown during execution in test generation
        try {
            board9.setCell((int) (byte) -1, (int) (short) 10, cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 10) is out of bounds for board size 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        int[] intArray7 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray7);
        generateDeterministicCellStrategy8.reset();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy8);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) (byte) 0, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 32, 52, 32, (-1) });
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        boolean boolean11 = board9.hasEmptyCells();
        boolean boolean12 = board9.isFull();
        boolean boolean13 = board9.moveRight();
        boolean boolean14 = board9.repOk();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy9.reset();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.isWinningBoard();
        boolean boolean13 = board11.hasEmptyCells();
        boolean boolean14 = board11.moveDown();
        boolean boolean15 = board11.isFull();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board11);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getScore();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board11);
        int int15 = board14.getScore();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.repOk();
        boolean boolean15 = board11.repOk();
        boolean boolean16 = board11.repOk();
        boolean boolean17 = board11.isLosingBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.repOk();
        boolean boolean11 = board9.isFull();
        int int12 = board9.getSize();
        int int13 = board9.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        int[] intArray0 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        int[] intArray8 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray8);
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        generateDeterministicCellStrategy9.reset();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy9);
        boolean boolean14 = board13.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board13.getEmptyPositions();
        boolean boolean16 = board13.moveUp();
        // The following exception was thrown during execution in test generation
        try {
            generateDeterministicCellStrategy1.addTile(board13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertArrayEquals(intArray8, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) '4');
        java.lang.String str3 = position2.toString();
        java.lang.Class<?> wildcardClass4 = position2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) (byte) 10);
        java.lang.String str3 = position2.toString();
        int int4 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 10)" + "'", str3, "(1, 10)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        boolean boolean11 = board9.isWinningBoard();
        boolean boolean13 = board9.equals((java.lang.Object) 4);
        boolean boolean14 = board9.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = board9.getCell(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(52, (int) (short) 10);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(32, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy9);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        java.lang.Object obj4 = null;
        boolean boolean5 = position2.equals(obj4);
        int int6 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.isWinningBoard();
        boolean boolean13 = board11.hasEmptyCells();
        boolean boolean14 = board11.moveDown();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.moveUp();
        java.lang.String str17 = board11.toString();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str17, "Score: 0\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = board11.getCell((int) (short) 0, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board11.getEmptyPositions();
        boolean boolean14 = board11.moveDown();
        boolean boolean15 = board11.hasEmptyCells();
        boolean boolean16 = board11.moveRight();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        boolean boolean15 = board11.moveLeft();
        boolean boolean17 = board11.equals((java.lang.Object) false);
        boolean boolean18 = board11.isFull();
        boolean boolean19 = board11.isFull();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        boolean boolean12 = board11.moveUp();
        int int13 = board11.getScore();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isWinningBoard();
        int int11 = board9.getSize();
        boolean boolean12 = board9.moveRight();
        boolean boolean13 = board9.repOk();
        java.lang.Class<?> wildcardClass14 = board9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board11.getEmptyPositions();
        boolean boolean14 = board11.moveDown();
        int int15 = board11.getScore();
        boolean boolean16 = board11.moveUp();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.moveLeft();
        boolean boolean15 = board11.repOk();
        int[] intArray22 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy23 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray22);
        generateDeterministicCellStrategy23.reset();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy23);
        boolean boolean26 = board25.isWinningBoard();
        int int27 = board25.getSize();
        boolean boolean28 = board25.isLosingBoard();
        boolean boolean29 = board11.equals((java.lang.Object) boolean28);
        boolean boolean30 = board11.moveUp();
        boolean boolean31 = board11.isFull();
        boolean boolean32 = board11.moveLeft();
        boolean boolean34 = board11.equals((java.lang.Object) 10.0d);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(64, (int) (byte) -1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 64);
        int[] intArray6 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        boolean boolean8 = position5.equals((java.lang.Object) intArray6);
        boolean boolean9 = position2.equals((java.lang.Object) position5);
        java.lang.String str10 = position5.toString();
        int int11 = position5.row;
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10, 64)" + "'", str10, "(10, 64)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.isWinningBoard();
        boolean boolean13 = board11.moveUp();
        java.lang.String str14 = board11.toString();
        boolean boolean15 = board11.isWinningBoard();
        int int16 = board11.getScore();
        boolean boolean17 = board11.isWinningBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray13 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        int int19 = board18.getSize();
        java.lang.String str20 = board18.toString();
        int int21 = board18.getScore();
        boolean boolean22 = board18.moveLeft();
        generateDeterministicCellStrategy6.addTile(board18);
        int[] intArray30 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy31 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray30);
        generateDeterministicCellStrategy31.reset();
        generateDeterministicCellStrategy31.reset();
        generateDeterministicCellStrategy31.reset();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy31);
        int int36 = board35.getSize();
        boolean boolean37 = board35.moveUp();
        boolean boolean38 = board35.moveLeft();
        boolean boolean39 = board35.repOk();
        generateDeterministicCellStrategy6.addTile(board35);
        generateDeterministicCellStrategy6.reset();
        int[] intArray48 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy49 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray48);
        generateDeterministicCellStrategy49.reset();
        generateDeterministicCellStrategy49.reset();
        generateDeterministicCellStrategy49.reset();
        ar.edu.unrc.game2048.Board board53 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy49);
        boolean boolean54 = board53.isWinningBoard();
        boolean boolean55 = board53.moveUp();
        java.lang.String str56 = board53.toString();
        boolean boolean57 = board53.isWinningBoard();
        int int58 = board53.getScore();
        generateDeterministicCellStrategy6.addTile(board53);
        boolean boolean60 = board53.isLosingBoard();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str20, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertArrayEquals(intArray48, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str56, "Score: 0\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveDown();
        int int13 = board11.getSize();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        java.lang.Class<?> wildcardClass16 = board11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        boolean boolean11 = board9.hasEmptyCells();
        boolean boolean12 = board9.isFull();
        int int13 = board9.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.isWinningBoard();
        boolean boolean13 = board11.hasEmptyCells();
        boolean boolean14 = board11.moveDown();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.moveUp();
        int int17 = board11.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        int[] intArray18 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray18);
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy19);
        boolean boolean24 = board23.isWinningBoard();
        boolean boolean25 = board23.hasEmptyCells();
        boolean boolean26 = board23.repOk();
        boolean boolean27 = board23.isWinningBoard();
        boolean boolean29 = board23.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board23);
        int int31 = board23.getSize();
        boolean boolean32 = board23.moveLeft();
        generateDeterministicCellStrategy10.addTile(board23);
        java.lang.String str34 = board23.toString();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|   32|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str34, "Score: 0\n+-----+-----+-----+-----+\n|   32|     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        int[] intArray18 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray18);
        generateDeterministicCellStrategy19.reset();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy19);
        boolean boolean22 = board21.isWinningBoard();
        boolean boolean23 = board11.equals((java.lang.Object) board21);
        boolean boolean24 = board21.isFull();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.isFull();
        boolean boolean17 = board11.isFull();
        boolean boolean18 = board11.moveLeft();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        int int4 = position2.col;
        boolean boolean6 = position2.equals((java.lang.Object) (short) 100);
        int int7 = position2.row;
        int int8 = position2.col;
        int int9 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        int[] intArray18 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray18);
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy19);
        boolean boolean24 = board23.isWinningBoard();
        boolean boolean25 = board23.moveUp();
        java.lang.String str26 = board23.toString();
        generateDeterministicCellStrategy10.addTile(board23);
        boolean boolean28 = board23.isFull();
        int int29 = board23.getScore();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str26, "Score: 0\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray13 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        boolean boolean19 = board18.moveDown();
        boolean boolean20 = board18.isLosingBoard();
        generateDeterministicCellStrategy6.addTile(board18);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.hasEmptyCells();
        int[] intArray19 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy20 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray19);
        generateDeterministicCellStrategy20.reset();
        generateDeterministicCellStrategy20.reset();
        generateDeterministicCellStrategy20.reset();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy20);
        boolean boolean25 = board24.hasEmptyCells();
        boolean boolean26 = board24.moveRight();
        boolean boolean27 = board24.moveLeft();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board24);
        java.lang.Class<?> wildcardClass29 = board24.getClass();
        boolean boolean30 = board11.equals((java.lang.Object) board24);
        int int31 = board11.getScore();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray13 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        boolean boolean19 = board18.moveDown();
        boolean boolean20 = board18.isLosingBoard();
        boolean boolean21 = board18.hasEmptyCells();
        generateDeterministicCellStrategy6.addTile(board18);
        int[] intArray29 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy30 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray29);
        generateDeterministicCellStrategy30.reset();
        generateDeterministicCellStrategy30.reset();
        generateDeterministicCellStrategy30.reset();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy30);
        int int35 = board34.getSize();
        java.lang.String str36 = board34.toString();
        int int37 = board34.getScore();
        generateDeterministicCellStrategy6.addTile(board34);
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board(board34);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str36, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) (byte) 10);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        boolean boolean6 = position2.equals((java.lang.Object) 10L);
        int int7 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.isWinningBoard();
        int int17 = board11.getSize();
        int int18 = board11.getScore();
        boolean boolean19 = board11.moveDown();
        boolean boolean20 = board11.isLosingBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell23 = board11.getCell((int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.isWinningBoard();
        boolean boolean13 = board11.hasEmptyCells();
        boolean boolean14 = board11.repOk();
        boolean boolean15 = board11.isFull();
        boolean boolean16 = board11.moveRight();
        int int17 = board11.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveDown();
        boolean boolean13 = board11.moveLeft();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.repOk();
        boolean boolean17 = board11.isWinningBoard();
        boolean boolean18 = board11.hasEmptyCells();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isWinningBoard();
        boolean boolean11 = board9.isFull();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean13 = board9.isFull();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.isLosingBoard();
        java.lang.String str17 = board11.toString();
        boolean boolean18 = board11.moveDown();
        boolean boolean19 = board11.moveLeft();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str17, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getScore();
        boolean boolean14 = board11.isWinningBoard();
        boolean boolean15 = board11.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board11.getEmptyPositions();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(positionSet16);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        boolean boolean11 = board9.hasEmptyCells();
        boolean boolean12 = board9.isLosingBoard();
        boolean boolean13 = board9.hasEmptyCells();
        boolean boolean14 = board9.moveDown();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray13 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        boolean boolean19 = board18.moveDown();
        boolean boolean20 = board18.isLosingBoard();
        boolean boolean21 = board18.hasEmptyCells();
        generateDeterministicCellStrategy6.addTile(board18);
        generateDeterministicCellStrategy6.reset();
        java.lang.Class<?> wildcardClass24 = generateDeterministicCellStrategy6.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getScore();
        boolean boolean14 = board11.moveRight();
        boolean boolean15 = board11.moveUp();
        boolean boolean16 = board11.moveLeft();
        boolean boolean17 = board11.moveLeft();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board11);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board11);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.hasEmptyCells();
        boolean boolean13 = board11.moveRight();
        boolean boolean14 = board11.moveLeft();
        int[] intArray23 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy24 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray23);
        generateDeterministicCellStrategy24.reset();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy24);
        boolean boolean27 = board26.isWinningBoard();
        int int28 = board26.getSize();
        boolean boolean29 = board26.isLosingBoard();
        int[] intArray38 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy39 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray38);
        generateDeterministicCellStrategy39.reset();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy39);
        boolean boolean42 = board41.isWinningBoard();
        int int43 = board41.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet44 = board41.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell47 = board41.getCell((int) (byte) 0, 10);
        board26.setCell((int) (byte) 0, (int) (short) 0, cell47);
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell(0, (int) (short) -1, cell47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertNotNull(positionSet44);
        org.junit.Assert.assertNotNull(cell47);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getSize();
        java.lang.String str14 = board11.toString();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board11.getEmptyPositions();
        int int14 = board11.getSize();
        int int15 = board11.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        boolean boolean11 = board9.hasEmptyCells();
        boolean boolean12 = board9.isFull();
        boolean boolean13 = board9.moveRight();
        boolean boolean14 = board9.isWinningBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        int[] intArray11 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray11);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray11);
        generateDeterministicCellStrategy13.reset();
        boolean boolean15 = board9.equals((java.lang.Object) generateDeterministicCellStrategy13);
        boolean boolean16 = board9.moveDown();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        boolean boolean11 = board9.hasEmptyCells();
        boolean boolean12 = board9.isLosingBoard();
        int[] intArray19 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy20 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray19);
        generateDeterministicCellStrategy20.reset();
        generateDeterministicCellStrategy20.reset();
        generateDeterministicCellStrategy20.reset();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy20);
        boolean boolean25 = board24.isWinningBoard();
        boolean boolean26 = board24.moveUp();
        boolean boolean27 = board9.equals((java.lang.Object) board24);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet28 = board9.getEmptyPositions();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(positionSet28);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray16 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray16);
        generateDeterministicCellStrategy17.reset();
        generateDeterministicCellStrategy17.reset();
        generateDeterministicCellStrategy17.reset();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy17);
        boolean boolean22 = board21.isLosingBoard();
        generateDeterministicCellStrategy9.addTile(board21);
        generateDeterministicCellStrategy9.reset();
        int[] intArray31 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy32 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray31);
        generateDeterministicCellStrategy32.reset();
        generateDeterministicCellStrategy32.reset();
        generateDeterministicCellStrategy32.reset();
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy32);
        int int37 = board36.getSize();
        boolean boolean39 = board36.equals((java.lang.Object) 100L);
        boolean boolean40 = board36.moveLeft();
        boolean boolean42 = board36.equals((java.lang.Object) false);
        boolean boolean43 = board36.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet44 = board36.getEmptyPositions();
        generateDeterministicCellStrategy9.addTile(board36);
        int int46 = board36.getScore();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(positionSet44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.hasEmptyCells();
        int[] intArray19 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy20 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray19);
        generateDeterministicCellStrategy20.reset();
        generateDeterministicCellStrategy20.reset();
        generateDeterministicCellStrategy20.reset();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy20);
        boolean boolean25 = board24.hasEmptyCells();
        boolean boolean26 = board24.moveRight();
        boolean boolean27 = board24.moveLeft();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board24);
        java.lang.Class<?> wildcardClass29 = board24.getClass();
        boolean boolean30 = board11.equals((java.lang.Object) board24);
        boolean boolean32 = board24.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.repOk();
        boolean boolean11 = board9.isWinningBoard();
        int int12 = board9.getScore();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.repOk();
        boolean boolean15 = board11.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board11.getEmptyPositions();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(positionSet16);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) (byte) 1);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.isWinningBoard();
        boolean boolean17 = board11.moveDown();
        int int18 = board11.getScore();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getScore();
        boolean boolean14 = board11.moveRight();
        boolean boolean15 = board11.moveUp();
        boolean boolean16 = board11.moveDown();
        boolean boolean17 = board11.moveLeft();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(52, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy9);
        int[] intArray17 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray17);
        generateDeterministicCellStrategy18.reset();
        generateDeterministicCellStrategy18.reset();
        generateDeterministicCellStrategy18.reset();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy18);
        boolean boolean23 = board22.hasEmptyCells();
        boolean boolean24 = board22.moveRight();
        boolean boolean25 = board22.moveLeft();
        boolean boolean26 = board22.isLosingBoard();
        boolean boolean27 = board22.repOk();
        generateDeterministicCellStrategy9.addTile(board22);
        int[] intArray37 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy38 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray37);
        generateDeterministicCellStrategy38.reset();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy38);
        boolean boolean41 = board40.isWinningBoard();
        int int42 = board40.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet43 = board40.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell46 = board40.getCell((int) (byte) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            board22.setCell((int) (byte) 100, (int) ' ', cell46);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 32) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        org.junit.Assert.assertNotNull(positionSet43);
        org.junit.Assert.assertNotNull(cell46);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.isWinningBoard();
        boolean boolean17 = board11.moveDown();
        int int18 = board11.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.repOk();
        boolean boolean17 = board11.isWinningBoard();
        boolean boolean18 = board11.isFull();
        java.lang.Class<?> wildcardClass19 = board11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray12 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray12);
        int[] intArray20 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy21 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray20);
        generateDeterministicCellStrategy21.reset();
        generateDeterministicCellStrategy21.reset();
        generateDeterministicCellStrategy21.reset();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy21);
        int int26 = board25.getSize();
        java.lang.String str27 = board25.toString();
        int int28 = board25.getScore();
        boolean boolean29 = board25.moveLeft();
        generateDeterministicCellStrategy13.addTile(board25);
        generateDeterministicCellStrategy6.addTile(board25);
        boolean boolean32 = board25.moveDown();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str27, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.isLosingBoard();
        java.lang.String str17 = board11.toString();
        boolean boolean18 = board11.moveDown();
        boolean boolean19 = board11.repOk();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str17, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.hasEmptyCells();
        boolean boolean13 = board11.moveRight();
        boolean boolean14 = board11.repOk();
        int int15 = board11.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        int[] intArray11 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray11);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray11);
        generateDeterministicCellStrategy13.reset();
        boolean boolean15 = board9.equals((java.lang.Object) generateDeterministicCellStrategy13);
        boolean boolean16 = board9.repOk();
        boolean boolean17 = board9.isFull();
        boolean boolean18 = board9.moveLeft();
        java.lang.Class<?> wildcardClass19 = board9.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) '4');
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        java.lang.String str6 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 52)" + "'", str4, "(0, 52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(0, 52)" + "'", str5, "(0, 52)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0, 52)" + "'", str6, "(0, 52)");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board11.getEmptyPositions();
        boolean boolean14 = board11.moveDown();
        boolean boolean15 = board11.hasEmptyCells();
        int[] intArray24 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy25 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray24);
        generateDeterministicCellStrategy25.reset();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy25);
        int[] intArray36 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy37 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray36);
        generateDeterministicCellStrategy37.reset();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy37);
        boolean boolean40 = board39.isWinningBoard();
        int int41 = board39.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet42 = board39.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell45 = board39.getCell((int) (byte) 0, 10);
        board27.setCell((int) (byte) 10, (int) (short) 0, cell45);
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell((int) (short) 1, (int) (short) 100, cell45);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertArrayEquals(intArray36, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 32 + "'", int41 == 32);
        org.junit.Assert.assertNotNull(positionSet42);
        org.junit.Assert.assertNotNull(cell45);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.hasEmptyCells();
        ar.edu.unrc.game2048.Board.Position position15 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int16 = position15.col;
        int int17 = position15.col;
        boolean boolean19 = position15.equals((java.lang.Object) (short) 100);
        int int20 = position15.col;
        boolean boolean21 = board11.equals((java.lang.Object) position15);
        boolean boolean22 = board11.moveUp();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.hasEmptyCells();
        boolean boolean13 = board11.moveRight();
        int[] intArray20 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy21 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray20);
        generateDeterministicCellStrategy21.reset();
        generateDeterministicCellStrategy21.reset();
        generateDeterministicCellStrategy21.reset();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy21);
        boolean boolean26 = board25.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet27 = board25.getEmptyPositions();
        boolean boolean28 = board25.moveDown();
        java.lang.String str29 = board25.toString();
        boolean boolean30 = board25.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet31 = board25.getEmptyPositions();
        boolean boolean32 = board11.equals((java.lang.Object) positionSet31);
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board11);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(positionSet27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    1|     |    1|\n+-----+-----+-----+-----+\n" + "'", str29, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    1|     |    1|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(positionSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getScore();
        boolean boolean14 = board11.isWinningBoard();
        boolean boolean15 = board11.moveLeft();
        java.lang.String str16 = board11.toString();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str16, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        boolean boolean15 = board11.moveLeft();
        boolean boolean17 = board11.equals((java.lang.Object) false);
        boolean boolean18 = board11.isFull();
        boolean boolean19 = board11.moveUp();
        boolean boolean20 = board11.isFull();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        int int4 = position2.col;
        boolean boolean6 = position2.equals((java.lang.Object) (short) 100);
        int int7 = position2.row;
        int int8 = position2.col;
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) '4');
        java.lang.String str12 = position11.toString();
        java.lang.String str13 = position11.toString();
        boolean boolean15 = position11.equals((java.lang.Object) (-1L));
        boolean boolean16 = position2.equals((java.lang.Object) (-1L));
        java.lang.String str17 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(0, 52)" + "'", str12, "(0, 52)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(0, 52)" + "'", str13, "(0, 52)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(52, 32)" + "'", str17, "(52, 32)");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, 0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray13 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        int int19 = board18.getSize();
        java.lang.String str20 = board18.toString();
        int int21 = board18.getScore();
        boolean boolean22 = board18.moveLeft();
        generateDeterministicCellStrategy6.addTile(board18);
        int[] intArray30 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy31 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray30);
        generateDeterministicCellStrategy31.reset();
        generateDeterministicCellStrategy31.reset();
        generateDeterministicCellStrategy31.reset();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy31);
        int int36 = board35.getSize();
        boolean boolean37 = board35.moveUp();
        boolean boolean38 = board35.moveLeft();
        boolean boolean39 = board35.repOk();
        generateDeterministicCellStrategy6.addTile(board35);
        boolean boolean41 = board35.isFull();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str20, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 100);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        int[] intArray12 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray12);
        generateDeterministicCellStrategy13.reset();
        generateDeterministicCellStrategy13.reset();
        generateDeterministicCellStrategy13.reset();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy13);
        boolean boolean18 = board17.moveRight();
        boolean boolean19 = board17.repOk();
        boolean boolean20 = board17.moveRight();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board17);
        boolean boolean22 = position2.equals((java.lang.Object) board17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(52, 32)" + "'", str4, "(52, 32)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, 32)" + "'", str5, "(52, 32)");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.repOk();
        boolean boolean15 = board11.repOk();
        boolean boolean16 = board11.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board11.getEmptyPositions();
        int[] intArray26 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy27 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray26);
        generateDeterministicCellStrategy27.reset();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy27);
        int[] intArray38 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy39 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray38);
        generateDeterministicCellStrategy39.reset();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy39);
        boolean boolean42 = board41.isWinningBoard();
        int int43 = board41.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet44 = board41.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell47 = board41.getCell((int) (byte) 0, 10);
        board29.setCell((int) (byte) 10, (int) (short) 0, cell47);
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell(2048, (-1), cell47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (2048, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertArrayEquals(intArray38, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertNotNull(positionSet44);
        org.junit.Assert.assertNotNull(cell47);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 64);
        int[] intArray3 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        boolean boolean5 = position2.equals((java.lang.Object) intArray3);
        int int6 = position2.col;
        int int7 = position2.col;
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.isWinningBoard();
        boolean boolean17 = board11.isLosingBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        int int4 = position2.col;
        int[] intArray10 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray10);
        boolean boolean12 = position2.equals((java.lang.Object) intArray10);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray10);
        generateDeterministicCellStrategy13.reset();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.isWinningBoard();
        boolean boolean13 = board11.moveUp();
        int[] intArray22 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy23 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray22);
        generateDeterministicCellStrategy23.reset();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy23);
        boolean boolean26 = board25.isWinningBoard();
        int int27 = board25.getSize();
        boolean boolean28 = board25.isLosingBoard();
        int[] intArray37 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy38 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray37);
        generateDeterministicCellStrategy38.reset();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy38);
        boolean boolean41 = board40.isWinningBoard();
        int int42 = board40.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet43 = board40.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell46 = board40.getCell((int) (byte) 0, 10);
        board25.setCell((int) (byte) 0, (int) (short) 0, cell46);
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell(4, (int) (short) 0, cell46);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        org.junit.Assert.assertNotNull(positionSet43);
        org.junit.Assert.assertNotNull(cell46);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board11.getEmptyPositions();
        int int15 = board11.getScore();
        int int16 = board11.getScore();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        boolean boolean14 = board11.moveRight();
        int[] intArray21 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy22 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray21);
        generateDeterministicCellStrategy22.reset();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy22);
        boolean boolean25 = board24.isFull();
        boolean boolean26 = board24.isWinningBoard();
        boolean boolean28 = board24.equals((java.lang.Object) 4);
        boolean boolean29 = board11.equals((java.lang.Object) board24);
        boolean boolean30 = board24.isLosingBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        boolean boolean11 = board9.isWinningBoard();
        boolean boolean13 = board9.equals((java.lang.Object) 4);
        boolean boolean14 = board9.isLosingBoard();
        boolean boolean15 = board9.isWinningBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        int int15 = board11.getScore();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        int[] intArray18 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray18);
        generateDeterministicCellStrategy19.reset();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy19);
        boolean boolean22 = board21.isWinningBoard();
        boolean boolean23 = board11.equals((java.lang.Object) board21);
        boolean boolean24 = board21.isLosingBoard();
        int[] intArray33 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy34 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray33);
        generateDeterministicCellStrategy34.reset();
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy34);
        boolean boolean37 = board36.isWinningBoard();
        int int38 = board36.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet39 = board36.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell42 = board36.getCell((int) (byte) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            board21.setCell((int) (byte) 1, (int) (byte) 100, cell42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, 100) is out of bounds for board size 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertArrayEquals(intArray33, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertNotNull(positionSet39);
        org.junit.Assert.assertNotNull(cell42);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        int[] intArray1 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board((-1), (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertArrayEquals(intArray1, new int[] {});
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) 'a', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Max Size Allowed is 64x64");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        boolean boolean15 = board11.moveLeft();
        boolean boolean17 = board11.equals((java.lang.Object) false);
        boolean boolean18 = board11.hasEmptyCells();
        int[] intArray27 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy28 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray27);
        generateDeterministicCellStrategy28.reset();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy28);
        boolean boolean31 = board30.isWinningBoard();
        int int32 = board30.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet33 = board30.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell36 = board30.getCell((int) (byte) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell(52, 100, cell36);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertNotNull(positionSet33);
        org.junit.Assert.assertNotNull(cell36);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.isWinningBoard();
        boolean boolean13 = board11.hasEmptyCells();
        boolean boolean14 = board11.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board11.getEmptyPositions();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(positionSet15);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2048, 0);
        java.lang.String str3 = position2.toString();
        int[] intArray10 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray10);
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        generateDeterministicCellStrategy11.reset();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy11);
        int int16 = board15.getSize();
        java.lang.String str17 = board15.toString();
        int int18 = board15.getScore();
        boolean boolean19 = board15.moveLeft();
        boolean boolean20 = board15.repOk();
        boolean boolean21 = board15.isWinningBoard();
        boolean boolean22 = board15.isFull();
        boolean boolean23 = position2.equals((java.lang.Object) boolean22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(2048, 0)" + "'", str3, "(2048, 0)");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str17, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board11);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.isWinningBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray13 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        int int19 = board18.getSize();
        java.lang.String str20 = board18.toString();
        int int21 = board18.getScore();
        boolean boolean22 = board18.moveLeft();
        generateDeterministicCellStrategy6.addTile(board18);
        int[] intArray30 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy31 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray30);
        generateDeterministicCellStrategy31.reset();
        generateDeterministicCellStrategy31.reset();
        generateDeterministicCellStrategy31.reset();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy31);
        int int36 = board35.getSize();
        boolean boolean37 = board35.moveUp();
        boolean boolean38 = board35.moveLeft();
        boolean boolean39 = board35.repOk();
        generateDeterministicCellStrategy6.addTile(board35);
        int[] intArray49 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy50 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray49);
        generateDeterministicCellStrategy50.reset();
        ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy50);
        boolean boolean53 = board52.isWinningBoard();
        int int54 = board52.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet55 = board52.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell58 = board52.getCell((int) (byte) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            board35.setCell((int) (byte) -1, (int) (byte) 0, cell58);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str20, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertArrayEquals(intArray49, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 32 + "'", int54 == 32);
        org.junit.Assert.assertNotNull(positionSet55);
        org.junit.Assert.assertNotNull(cell58);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        generateDeterministicCellStrategy7.reset();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        boolean boolean15 = board11.moveLeft();
        boolean boolean17 = board11.equals((java.lang.Object) false);
        boolean boolean18 = board11.isFull();
        java.lang.String str19 = board11.toString();
        boolean boolean20 = board11.moveLeft();
        int int21 = board11.getScore();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str19, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) '4');
        java.lang.String str3 = position2.toString();
        int[] intArray10 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray10);
        generateDeterministicCellStrategy11.reset();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy11);
        boolean boolean14 = board13.repOk();
        boolean boolean15 = board13.isFull();
        boolean boolean16 = position2.equals((java.lang.Object) board13);
        boolean boolean17 = board13.isLosingBoard();
        int int18 = board13.getSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getScore();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean15 = board14.moveUp();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.moveLeft();
        boolean boolean15 = board11.repOk();
        int[] intArray22 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy23 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray22);
        generateDeterministicCellStrategy23.reset();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy23);
        boolean boolean26 = board25.isWinningBoard();
        int int27 = board25.getSize();
        boolean boolean28 = board25.isLosingBoard();
        boolean boolean29 = board11.equals((java.lang.Object) boolean28);
        boolean boolean30 = board11.moveUp();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean32 = board11.hasEmptyCells();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray16 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray16);
        generateDeterministicCellStrategy17.reset();
        generateDeterministicCellStrategy17.reset();
        generateDeterministicCellStrategy17.reset();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy17);
        boolean boolean22 = board21.isLosingBoard();
        generateDeterministicCellStrategy9.addTile(board21);
        int[] intArray30 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy31 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray30);
        generateDeterministicCellStrategy31.reset();
        generateDeterministicCellStrategy31.reset();
        generateDeterministicCellStrategy31.reset();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy31);
        int int36 = board35.getSize();
        java.lang.String str37 = board35.toString();
        int[] intArray44 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy45 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray44);
        generateDeterministicCellStrategy45.reset();
        generateDeterministicCellStrategy45.reset();
        generateDeterministicCellStrategy45.reset();
        ar.edu.unrc.game2048.Board board49 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy45);
        boolean boolean50 = board49.hasEmptyCells();
        boolean boolean51 = board49.moveRight();
        boolean boolean52 = board49.moveLeft();
        boolean boolean53 = board49.isFull();
        boolean boolean54 = board35.equals((java.lang.Object) boolean53);
        generateDeterministicCellStrategy9.addTile(board35);
        int[] intArray62 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy63 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray62);
        generateDeterministicCellStrategy63.reset();
        ar.edu.unrc.game2048.Board board65 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy63);
        boolean boolean66 = board65.isFull();
        boolean boolean67 = board65.hasEmptyCells();
        boolean boolean68 = board65.isFull();
        boolean boolean69 = board65.moveRight();
        boolean boolean70 = board65.isFull();
        generateDeterministicCellStrategy9.addTile(board65);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str37, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertArrayEquals(intArray44, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.moveLeft();
        int int15 = board11.getSize();
        boolean boolean16 = board11.moveDown();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) '4');
        java.lang.String str3 = position2.toString();
        int[] intArray10 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray10);
        generateDeterministicCellStrategy11.reset();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy11);
        boolean boolean14 = board13.repOk();
        boolean boolean15 = board13.isFull();
        boolean boolean16 = position2.equals((java.lang.Object) board13);
        java.lang.String str17 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertArrayEquals(intArray10, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(0, 52)" + "'", str17, "(0, 52)");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int[] intArray21 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy22 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray21);
        generateDeterministicCellStrategy22.reset();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy22);
        boolean boolean25 = board24.isWinningBoard();
        int int26 = board24.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet27 = board24.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell30 = board24.getCell((int) (byte) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell(0, 4, cell30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 4) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
        org.junit.Assert.assertNotNull(positionSet27);
        org.junit.Assert.assertNotNull(cell30);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.isFull();
        int int17 = board11.getSize();
        java.lang.Class<?> wildcardClass18 = board11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.isWinningBoard();
        boolean boolean13 = board11.hasEmptyCells();
        boolean boolean14 = board11.moveDown();
        boolean boolean15 = board11.isFull();
        boolean boolean16 = board11.moveUp();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) '4');
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        int int6 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 52)" + "'", str4, "(0, 52)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(0, 52)" + "'", str5, "(0, 52)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(64, (int) (byte) -1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 64);
        int[] intArray6 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        boolean boolean8 = position5.equals((java.lang.Object) intArray6);
        boolean boolean9 = position2.equals((java.lang.Object) position5);
        int int10 = position2.col;
        java.lang.String str11 = position2.toString();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "(64, -1)" + "'", str11, "(64, -1)");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.repOk();
        boolean boolean15 = board11.repOk();
        boolean boolean16 = board11.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board11.getEmptyPositions();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean19 = board11.isLosingBoard();
        boolean boolean20 = board11.moveLeft();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getScore();
        boolean boolean14 = board11.moveRight();
        boolean boolean15 = board11.moveUp();
        boolean boolean16 = board11.moveLeft();
        boolean boolean17 = board11.moveLeft();
        boolean boolean18 = board11.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell21 = board11.getCell(0, 0);
        boolean boolean22 = board11.moveDown();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.isWinningBoard();
        int int17 = board11.getSize();
        int int18 = board11.getScore();
        boolean boolean19 = board11.moveDown();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board11);
        int int21 = board20.getScore();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        int int4 = position2.col;
        ar.edu.unrc.game2048.Board.Position position7 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 2048);
        int int8 = position7.row;
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int12 = position11.col;
        int int13 = position11.col;
        int[] intArray19 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy20 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray19);
        boolean boolean21 = position11.equals((java.lang.Object) intArray19);
        int int22 = position11.col;
        int int23 = position11.row;
        boolean boolean24 = position7.equals((java.lang.Object) position11);
        boolean boolean25 = position2.equals((java.lang.Object) position11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        int[] intArray14 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray14);
        generateDeterministicCellStrategy15.reset();
        generateDeterministicCellStrategy15.reset();
        generateDeterministicCellStrategy15.reset();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy15);
        boolean boolean20 = board19.moveDown();
        boolean boolean21 = board19.isLosingBoard();
        boolean boolean22 = board19.hasEmptyCells();
        generateDeterministicCellStrategy7.addTile(board19);
        generateDeterministicCellStrategy7.reset();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) (byte) 0, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        boolean boolean11 = board9.hasEmptyCells();
        boolean boolean12 = board9.isFull();
        boolean boolean13 = board9.moveRight();
        boolean boolean14 = board9.isFull();
        boolean boolean15 = board9.hasEmptyCells();
        int int16 = board9.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 64);
        int[] intArray3 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        boolean boolean5 = position2.equals((java.lang.Object) intArray3);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray3);
        int[] intArray13 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        int int19 = board18.getSize();
        boolean boolean21 = board18.equals((java.lang.Object) 100L);
        boolean boolean22 = board18.moveLeft();
        boolean boolean23 = board18.isFull();
        boolean boolean24 = board18.isFull();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board18);
        // The following exception was thrown during execution in test generation
        try {
            generateDeterministicCellStrategy6.addTile(board25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        boolean boolean14 = board11.moveRight();
        int[] intArray21 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy22 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray21);
        generateDeterministicCellStrategy22.reset();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy22);
        boolean boolean25 = board24.isFull();
        boolean boolean26 = board24.isWinningBoard();
        boolean boolean28 = board24.equals((java.lang.Object) 4);
        boolean boolean29 = board11.equals((java.lang.Object) board24);
        boolean boolean30 = board11.isWinningBoard();
        int int31 = board11.getScore();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        int[] intArray0 = null;
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        generateDeterministicCellStrategy1.reset();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.repOk();
        java.lang.String str17 = board11.toString();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str17, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getScore();
        boolean boolean14 = board11.moveRight();
        boolean boolean15 = board11.moveUp();
        boolean boolean16 = board11.moveDown();
        boolean boolean17 = board11.hasEmptyCells();
        boolean boolean18 = board11.isWinningBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.moveLeft();
        boolean boolean15 = board11.repOk();
        int[] intArray22 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy23 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray22);
        generateDeterministicCellStrategy23.reset();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy23);
        boolean boolean26 = board25.isWinningBoard();
        int int27 = board25.getSize();
        boolean boolean28 = board25.isLosingBoard();
        boolean boolean29 = board11.equals((java.lang.Object) boolean28);
        boolean boolean30 = board11.moveUp();
        boolean boolean31 = board11.isFull();
        boolean boolean32 = board11.moveLeft();
        int[] intArray39 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy40 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray39);
        generateDeterministicCellStrategy40.reset();
        generateDeterministicCellStrategy40.reset();
        generateDeterministicCellStrategy40.reset();
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy40);
        int int45 = board44.getSize();
        int int46 = board44.getScore();
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board(board44);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet48 = board47.getEmptyPositions();
        boolean boolean49 = board11.equals((java.lang.Object) board47);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertArrayEquals(intArray39, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(positionSet48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        int[] intArray7 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray7);
        generateDeterministicCellStrategy8.reset();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy8);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) (short) 10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy8);
        boolean boolean12 = board11.moveUp();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = board11.getCell(100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 32) is out of bounds for board size 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveDown();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        java.lang.String str15 = board11.toString();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str15, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board11.getEmptyPositions();
        int int15 = board11.getScore();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell18 = board11.getCell((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int[] intArray20 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy21 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray20);
        generateDeterministicCellStrategy21.reset();
        generateDeterministicCellStrategy21.reset();
        generateDeterministicCellStrategy21.reset();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy21);
        boolean boolean26 = board25.hasEmptyCells();
        boolean boolean27 = board25.moveRight();
        boolean boolean28 = board25.moveLeft();
        boolean boolean29 = board25.isFull();
        boolean boolean30 = board11.equals((java.lang.Object) boolean29);
        boolean boolean31 = board11.isFull();
        int[] intArray40 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy41 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray40);
        generateDeterministicCellStrategy41.reset();
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy41);
        boolean boolean44 = board43.isWinningBoard();
        int int45 = board43.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet46 = board43.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell49 = board43.getCell((int) (byte) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell(4, (int) '#', cell49);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 35) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 32 + "'", int45 == 32);
        org.junit.Assert.assertNotNull(positionSet46);
        org.junit.Assert.assertNotNull(cell49);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 2048);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 2048)" + "'", str3, "(0, 2048)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2048 + "'", int4 == 2048);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        boolean boolean14 = board11.isFull();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isWinningBoard();
        boolean boolean11 = board9.isFull();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean13 = board12.moveRight();
        int int14 = board12.getSize();
        boolean boolean15 = board12.moveLeft();
        boolean boolean16 = board12.hasEmptyCells();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.moveRight();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveDown();
        int int13 = board11.getSize();
        int int14 = board11.getScore();
        boolean boolean15 = board11.repOk();
        boolean boolean16 = board11.hasEmptyCells();
        boolean boolean17 = board11.isWinningBoard();
        int int18 = board11.getSize();
        java.lang.Class<?> wildcardClass19 = board11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        int[] intArray18 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray18);
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy19);
        boolean boolean24 = board23.isWinningBoard();
        boolean boolean25 = board23.hasEmptyCells();
        boolean boolean26 = board23.repOk();
        boolean boolean27 = board23.isWinningBoard();
        boolean boolean29 = board23.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board23);
        int int31 = board23.getSize();
        boolean boolean32 = board23.moveLeft();
        generateDeterministicCellStrategy10.addTile(board23);
        int[] intArray40 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy41 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray40);
        generateDeterministicCellStrategy41.reset();
        generateDeterministicCellStrategy41.reset();
        generateDeterministicCellStrategy41.reset();
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy41);
        int int46 = board45.getSize();
        boolean boolean47 = board45.moveUp();
        boolean boolean48 = board45.moveLeft();
        boolean boolean49 = board45.repOk();
        int[] intArray56 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy57 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray56);
        generateDeterministicCellStrategy57.reset();
        ar.edu.unrc.game2048.Board board59 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy57);
        boolean boolean60 = board59.isWinningBoard();
        int int61 = board59.getSize();
        boolean boolean62 = board59.isLosingBoard();
        boolean boolean63 = board45.equals((java.lang.Object) boolean62);
        boolean boolean64 = board45.moveUp();
        generateDeterministicCellStrategy10.addTile(board45);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertArrayEquals(intArray56, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 32 + "'", int61 == 32);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        int[] intArray14 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray14);
        generateDeterministicCellStrategy15.reset();
        generateDeterministicCellStrategy15.reset();
        generateDeterministicCellStrategy15.reset();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy15);
        boolean boolean20 = board19.moveDown();
        boolean boolean21 = board19.moveDown();
        generateDeterministicCellStrategy7.addTile(board19);
        int[] intArray29 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy30 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray29);
        generateDeterministicCellStrategy30.reset();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy30);
        boolean boolean33 = board32.isFull();
        boolean boolean34 = board32.hasEmptyCells();
        boolean boolean35 = board32.isLosingBoard();
        int[] intArray42 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy43 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray42);
        generateDeterministicCellStrategy43.reset();
        generateDeterministicCellStrategy43.reset();
        generateDeterministicCellStrategy43.reset();
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy43);
        boolean boolean48 = board47.isWinningBoard();
        boolean boolean49 = board47.moveUp();
        boolean boolean50 = board32.equals((java.lang.Object) board47);
        generateDeterministicCellStrategy7.addTile(board47);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board((int) (byte) -1, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray16 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray16);
        generateDeterministicCellStrategy17.reset();
        generateDeterministicCellStrategy17.reset();
        generateDeterministicCellStrategy17.reset();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy17);
        boolean boolean22 = board21.isLosingBoard();
        generateDeterministicCellStrategy9.addTile(board21);
        generateDeterministicCellStrategy9.reset();
        int[] intArray31 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy32 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray31);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy33 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray31);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy34 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray31);
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(52, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy34);
        int[] intArray42 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy43 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray42);
        generateDeterministicCellStrategy43.reset();
        generateDeterministicCellStrategy43.reset();
        generateDeterministicCellStrategy43.reset();
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy43);
        boolean boolean48 = board47.hasEmptyCells();
        boolean boolean49 = board47.moveRight();
        boolean boolean50 = board47.moveLeft();
        boolean boolean51 = board47.isLosingBoard();
        boolean boolean52 = board47.repOk();
        generateDeterministicCellStrategy34.addTile(board47);
        generateDeterministicCellStrategy9.addTile(board47);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertArrayEquals(intArray31, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertArrayEquals(intArray42, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board11.getEmptyPositions();
        boolean boolean14 = board11.moveUp();
        int[] intArray21 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy22 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray21);
        generateDeterministicCellStrategy22.reset();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy22);
        boolean boolean25 = board24.isFull();
        int[] intArray26 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy27 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray26);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy28 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray26);
        generateDeterministicCellStrategy28.reset();
        boolean boolean30 = board24.equals((java.lang.Object) generateDeterministicCellStrategy28);
        generateDeterministicCellStrategy28.reset();
        java.lang.Class<?> wildcardClass32 = generateDeterministicCellStrategy28.getClass();
        boolean boolean33 = board11.equals((java.lang.Object) generateDeterministicCellStrategy28);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray13 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        int int19 = board18.getSize();
        java.lang.String str20 = board18.toString();
        int int21 = board18.getScore();
        boolean boolean22 = board18.moveLeft();
        generateDeterministicCellStrategy6.addTile(board18);
        boolean boolean24 = board18.moveLeft();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str20, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(64, 10);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int6 = position5.col;
        int int7 = position5.col;
        boolean boolean9 = position5.equals((java.lang.Object) (short) 100);
        java.lang.Class<?> wildcardClass10 = position5.getClass();
        boolean boolean11 = position2.equals((java.lang.Object) position5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        ar.edu.unrc.game2048.Board.Position position3 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 64);
        int[] intArray4 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        boolean boolean6 = position3.equals((java.lang.Object) intArray4);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board((int) (short) -1, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertArrayEquals(intArray4, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        int int4 = position2.col;
        boolean boolean6 = position2.equals((java.lang.Object) (short) 100);
        int int7 = position2.row;
        int int8 = position2.col;
        ar.edu.unrc.game2048.Board.Position position11 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) '4');
        java.lang.String str12 = position11.toString();
        java.lang.String str13 = position11.toString();
        boolean boolean15 = position11.equals((java.lang.Object) (-1L));
        boolean boolean16 = position2.equals((java.lang.Object) (-1L));
        int[] intArray23 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy24 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray23);
        generateDeterministicCellStrategy24.reset();
        generateDeterministicCellStrategy24.reset();
        generateDeterministicCellStrategy24.reset();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy24);
        boolean boolean29 = board28.isWinningBoard();
        boolean boolean30 = board28.moveUp();
        java.lang.String str31 = board28.toString();
        boolean boolean32 = board28.moveUp();
        boolean boolean33 = position2.equals((java.lang.Object) boolean32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(0, 52)" + "'", str12, "(0, 52)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(0, 52)" + "'", str13, "(0, 52)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertArrayEquals(intArray23, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str31, "Score: 0\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.repOk();
        boolean boolean15 = board11.repOk();
        boolean boolean16 = board11.repOk();
        int int17 = board11.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board11.getEmptyPositions();
        boolean boolean14 = board11.moveDown();
        java.lang.String str15 = board11.toString();
        boolean boolean16 = board11.moveDown();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    1|     |    1|\n+-----+-----+-----+-----+\n" + "'", str15, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    1|     |    1|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.isLosingBoard();
        java.lang.String str17 = board11.toString();
        boolean boolean18 = board11.hasEmptyCells();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str17, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.hasEmptyCells();
        int[] intArray19 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy20 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray19);
        generateDeterministicCellStrategy20.reset();
        generateDeterministicCellStrategy20.reset();
        generateDeterministicCellStrategy20.reset();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy20);
        boolean boolean25 = board24.hasEmptyCells();
        boolean boolean26 = board24.moveRight();
        boolean boolean27 = board24.moveLeft();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board24);
        java.lang.Class<?> wildcardClass29 = board24.getClass();
        boolean boolean30 = board11.equals((java.lang.Object) board24);
        boolean boolean31 = board11.moveLeft();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.isWinningBoard();
        boolean boolean17 = board11.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board11.getEmptyPositions();
        boolean boolean19 = board11.isLosingBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(64, (int) (byte) -1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 64);
        int[] intArray6 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        boolean boolean8 = position5.equals((java.lang.Object) intArray6);
        boolean boolean9 = position2.equals((java.lang.Object) position5);
        java.lang.String str10 = position5.toString();
        int int11 = position5.col;
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(10, 64)" + "'", str10, "(10, 64)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(64, (int) (short) -1);
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.hasEmptyCells();
        boolean boolean13 = board11.moveRight();
        boolean boolean14 = board11.moveLeft();
        boolean boolean15 = board11.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell18 = null;
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell(32, 10, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 10) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        java.lang.String str7 = position2.toString();
        int int8 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(52, 32)" + "'", str4, "(52, 32)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, 32)" + "'", str5, "(52, 32)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(52, 32)" + "'", str7, "(52, 32)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        int[] intArray7 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray7);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray7);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray7);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(52, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        int[] intArray18 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray18);
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy19);
        boolean boolean24 = board23.hasEmptyCells();
        boolean boolean25 = board23.moveRight();
        boolean boolean26 = board23.moveLeft();
        boolean boolean27 = board23.isLosingBoard();
        boolean boolean28 = board23.repOk();
        generateDeterministicCellStrategy10.addTile(board23);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board((int) '4', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        ar.edu.unrc.game2048.Board.Position position33 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) (byte) 1);
        int[] intArray40 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy41 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray40);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy42 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray40);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy43 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray40);
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board(52, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy43);
        int[] intArray51 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy52 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray51);
        generateDeterministicCellStrategy52.reset();
        generateDeterministicCellStrategy52.reset();
        generateDeterministicCellStrategy52.reset();
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy52);
        boolean boolean57 = board56.hasEmptyCells();
        boolean boolean58 = board56.moveRight();
        boolean boolean59 = board56.moveLeft();
        boolean boolean60 = board56.isLosingBoard();
        boolean boolean61 = board56.repOk();
        generateDeterministicCellStrategy43.addTile(board56);
        boolean boolean63 = position33.equals((java.lang.Object) board56);
        generateDeterministicCellStrategy10.addTile(board56);
        int[] intArray73 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy74 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray73);
        generateDeterministicCellStrategy74.reset();
        ar.edu.unrc.game2048.Board board76 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy74);
        boolean boolean77 = board76.isWinningBoard();
        int int78 = board76.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet79 = board76.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell82 = board76.getCell((int) (byte) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            board56.setCell((int) '#', (int) (byte) 0, cell82);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (35, 0) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertArrayEquals(intArray40, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertArrayEquals(intArray51, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertArrayEquals(intArray73, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 32 + "'", int78 == 32);
        org.junit.Assert.assertNotNull(positionSet79);
        org.junit.Assert.assertNotNull(cell82);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int[] intArray16 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray16);
        generateDeterministicCellStrategy17.reset();
        generateDeterministicCellStrategy17.reset();
        generateDeterministicCellStrategy17.reset();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy17);
        int int22 = board21.getSize();
        java.lang.String str23 = board21.toString();
        boolean boolean24 = board21.moveDown();
        java.lang.String str25 = board21.toString();
        boolean boolean26 = board21.moveUp();
        generateDeterministicCellStrategy7.addTile(board21);
        int[] intArray34 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy35 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray34);
        generateDeterministicCellStrategy35.reset();
        generateDeterministicCellStrategy35.reset();
        generateDeterministicCellStrategy35.reset();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy35);
        int int40 = board39.getSize();
        boolean boolean42 = board39.equals((java.lang.Object) 100L);
        boolean boolean43 = board39.moveLeft();
        boolean boolean45 = board39.equals((java.lang.Object) false);
        boolean boolean46 = board39.isFull();
        java.lang.String str47 = board39.toString();
        boolean boolean48 = board39.isWinningBoard();
        generateDeterministicCellStrategy7.addTile(board39);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str23, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str25, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertArrayEquals(intArray34, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str47, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.moveLeft();
        boolean boolean15 = board11.repOk();
        int[] intArray22 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy23 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray22);
        generateDeterministicCellStrategy23.reset();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy23);
        boolean boolean26 = board25.isWinningBoard();
        int int27 = board25.getSize();
        boolean boolean28 = board25.isLosingBoard();
        boolean boolean29 = board11.equals((java.lang.Object) boolean28);
        boolean boolean30 = board11.moveUp();
        boolean boolean31 = board11.isFull();
        boolean boolean32 = board11.moveLeft();
        boolean boolean33 = board11.moveDown();
        boolean boolean34 = board11.moveLeft();
        boolean boolean35 = board11.isWinningBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        int[] intArray18 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray18);
        generateDeterministicCellStrategy19.reset();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy19);
        boolean boolean22 = board21.isWinningBoard();
        boolean boolean23 = board11.equals((java.lang.Object) board21);
        boolean boolean24 = board21.isLosingBoard();
        int int25 = board21.getSize();
        boolean boolean26 = board21.hasEmptyCells();
        boolean boolean27 = board21.moveDown();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray16 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray16);
        generateDeterministicCellStrategy17.reset();
        generateDeterministicCellStrategy17.reset();
        generateDeterministicCellStrategy17.reset();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy17);
        boolean boolean22 = board21.isLosingBoard();
        generateDeterministicCellStrategy9.addTile(board21);
        int int24 = board21.getSize();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        boolean boolean15 = board11.moveLeft();
        boolean boolean17 = board11.equals((java.lang.Object) false);
        boolean boolean18 = board11.isFull();
        boolean boolean19 = board11.repOk();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        ar.edu.unrc.game2048.Board.Position position3 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int4 = position3.col;
        java.lang.String str5 = position3.toString();
        int int6 = position3.col;
        int[] intArray12 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray12);
        boolean boolean14 = position3.equals((java.lang.Object) generateDeterministicCellStrategy13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, 32)" + "'", str5, "(52, 32)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 2048);
        int int3 = position2.row;
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int7 = position6.col;
        int int8 = position6.col;
        int[] intArray14 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray14);
        boolean boolean16 = position6.equals((java.lang.Object) intArray14);
        int int17 = position6.col;
        int int18 = position6.row;
        boolean boolean19 = position2.equals((java.lang.Object) position6);
        int int20 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2048 + "'", int20 == 2048);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.row;
        int int4 = position2.col;
        java.lang.String str5 = position2.toString();
        int[] intArray12 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray12);
        generateDeterministicCellStrategy13.reset();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy13);
        int[] intArray24 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy25 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray24);
        generateDeterministicCellStrategy25.reset();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy25);
        boolean boolean28 = board27.isWinningBoard();
        int int29 = board27.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet30 = board27.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell33 = board27.getCell((int) (byte) 0, 10);
        board15.setCell((int) (byte) 10, (int) (short) 0, cell33);
        boolean boolean35 = position2.equals((java.lang.Object) board15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, 32)" + "'", str5, "(52, 32)");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertArrayEquals(intArray24, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(positionSet30);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.isWinningBoard();
        int int17 = board11.getSize();
        int int18 = board11.getScore();
        boolean boolean19 = board11.moveDown();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board11);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell23 = board11.getCell((int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 35) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.isWinningBoard();
        int int17 = board11.getSize();
        int int18 = board11.getScore();
        boolean boolean19 = board11.moveDown();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board11);
        ar.edu.unrc.game2048.Board.Position position26 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int27 = position26.col;
        java.lang.String str28 = position26.toString();
        int int29 = position26.col;
        int[] intArray35 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy36 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray35);
        boolean boolean37 = position26.equals((java.lang.Object) generateDeterministicCellStrategy36);
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board((int) '4', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy36);
        int[] intArray47 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy48 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray47);
        generateDeterministicCellStrategy48.reset();
        ar.edu.unrc.game2048.Board board50 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy48);
        boolean boolean51 = board50.isWinningBoard();
        int int52 = board50.getSize();
        boolean boolean53 = board50.isLosingBoard();
        int[] intArray62 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy63 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray62);
        generateDeterministicCellStrategy63.reset();
        ar.edu.unrc.game2048.Board board65 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy63);
        boolean boolean66 = board65.isWinningBoard();
        int int67 = board65.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet68 = board65.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell71 = board65.getCell((int) (byte) 0, 10);
        board50.setCell((int) (byte) 0, (int) (short) 0, cell71);
        board38.setCell(0, (int) (short) 0, cell71);
        // The following exception was thrown during execution in test generation
        try {
            board20.setCell((int) (byte) 10, 1, cell71);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(52, 32)" + "'", str28, "(52, 32)");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertArrayEquals(intArray35, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 32 + "'", int52 == 32);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertArrayEquals(intArray62, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 32 + "'", int67 == 32);
        org.junit.Assert.assertNotNull(positionSet68);
        org.junit.Assert.assertNotNull(cell71);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2, (int) '4');
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray13 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        int int19 = board18.getSize();
        java.lang.String str20 = board18.toString();
        int int21 = board18.getScore();
        boolean boolean22 = board18.moveLeft();
        generateDeterministicCellStrategy6.addTile(board18);
        boolean boolean24 = board18.moveRight();
        boolean boolean26 = board18.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str20, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (byte) 1);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        boolean boolean14 = board11.repOk();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.hasEmptyCells();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        int[] intArray14 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray14);
        generateDeterministicCellStrategy15.reset();
        generateDeterministicCellStrategy15.reset();
        generateDeterministicCellStrategy15.reset();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy15);
        boolean boolean20 = board19.moveDown();
        boolean boolean21 = board19.isLosingBoard();
        boolean boolean22 = board19.hasEmptyCells();
        generateDeterministicCellStrategy7.addTile(board19);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(64, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        generateDeterministicCellStrategy7.reset();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.moveLeft();
        boolean boolean15 = board11.repOk();
        int[] intArray22 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy23 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray22);
        generateDeterministicCellStrategy23.reset();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy23);
        boolean boolean26 = board25.isWinningBoard();
        int int27 = board25.getSize();
        boolean boolean28 = board25.isLosingBoard();
        boolean boolean29 = board11.equals((java.lang.Object) boolean28);
        boolean boolean30 = board11.moveUp();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(board11);
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(board11);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        int[] intArray18 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray18);
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy19);
        boolean boolean24 = board23.isWinningBoard();
        boolean boolean25 = board23.hasEmptyCells();
        boolean boolean26 = board23.repOk();
        boolean boolean27 = board23.isWinningBoard();
        boolean boolean29 = board23.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board23);
        int int31 = board23.getSize();
        boolean boolean32 = board23.moveLeft();
        generateDeterministicCellStrategy10.addTile(board23);
        boolean boolean34 = board23.isLosingBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        boolean boolean15 = board11.moveLeft();
        boolean boolean17 = board11.equals((java.lang.Object) false);
        boolean boolean18 = board11.isFull();
        boolean boolean19 = board11.isLosingBoard();
        boolean boolean20 = board11.moveDown();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        int[] intArray18 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray18);
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy19);
        boolean boolean24 = board23.isWinningBoard();
        boolean boolean25 = board23.hasEmptyCells();
        boolean boolean26 = board23.repOk();
        boolean boolean27 = board23.isWinningBoard();
        boolean boolean29 = board23.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board23);
        int int31 = board23.getSize();
        boolean boolean32 = board23.moveLeft();
        generateDeterministicCellStrategy10.addTile(board23);
        boolean boolean34 = board23.isWinningBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getScore();
        boolean boolean14 = board11.moveRight();
        boolean boolean15 = board11.moveUp();
        int int16 = board11.getScore();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        int[] intArray5 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        int[] intArray16 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray16);
        generateDeterministicCellStrategy17.reset();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy17);
        boolean boolean20 = board19.repOk();
        generateDeterministicCellStrategy6.addTile(board19);
        generateDeterministicCellStrategy6.reset();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.repOk();
        boolean boolean17 = board11.isWinningBoard();
        boolean boolean18 = board11.isFull();
        boolean boolean19 = board11.isFull();
        boolean boolean20 = board11.moveDown();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        ar.edu.unrc.game2048.Board.Position position3 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int4 = position3.col;
        java.lang.String str5 = position3.toString();
        int int6 = position3.col;
        int[] intArray12 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray12);
        boolean boolean14 = position3.equals((java.lang.Object) generateDeterministicCellStrategy13);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) '4', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy13);
        boolean boolean16 = board15.moveLeft();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, 32)" + "'", str5, "(52, 32)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        boolean boolean15 = board11.moveLeft();
        boolean boolean17 = board11.equals((java.lang.Object) false);
        boolean boolean18 = board11.isFull();
        boolean boolean19 = board11.isLosingBoard();
        boolean boolean20 = board11.moveUp();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.isFull();
        int int17 = board11.getSize();
        boolean boolean18 = board11.moveDown();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board11.getEmptyPositions();
        boolean boolean14 = board11.moveDown();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean16 = board11.isFull();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, 64);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 64)" + "'", str3, "(1, 64)");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        int[] intArray5 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        generateDeterministicCellStrategy6.reset();
        int[] intArray16 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray16);
        generateDeterministicCellStrategy17.reset();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy17);
        boolean boolean20 = board19.repOk();
        generateDeterministicCellStrategy6.addTile(board19);
        boolean boolean22 = board19.isFull();
        boolean boolean23 = board19.moveLeft();
        int[] intArray32 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy33 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray32);
        generateDeterministicCellStrategy33.reset();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy33);
        boolean boolean36 = board35.isWinningBoard();
        int int37 = board35.getSize();
        boolean boolean38 = board35.isLosingBoard();
        int[] intArray47 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy48 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray47);
        generateDeterministicCellStrategy48.reset();
        ar.edu.unrc.game2048.Board board50 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy48);
        boolean boolean51 = board50.isWinningBoard();
        int int52 = board50.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet53 = board50.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell56 = board50.getCell((int) (byte) 0, 10);
        board35.setCell((int) (byte) 0, (int) (short) 0, cell56);
        board19.setCell(10, 0, cell56);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertArrayEquals(intArray47, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 32 + "'", int52 == 32);
        org.junit.Assert.assertNotNull(positionSet53);
        org.junit.Assert.assertNotNull(cell56);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray16 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray16);
        generateDeterministicCellStrategy17.reset();
        generateDeterministicCellStrategy17.reset();
        generateDeterministicCellStrategy17.reset();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy17);
        boolean boolean22 = board21.isLosingBoard();
        generateDeterministicCellStrategy9.addTile(board21);
        boolean boolean24 = board21.isWinningBoard();
        boolean boolean25 = board21.isFull();
        int int26 = board21.getScore();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveDown();
        boolean boolean13 = board11.moveDown();
        int int14 = board11.getScore();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board11);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        int[] intArray17 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray17);
        generateDeterministicCellStrategy18.reset();
        generateDeterministicCellStrategy18.reset();
        generateDeterministicCellStrategy18.reset();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy18);
        boolean boolean23 = board22.isLosingBoard();
        generateDeterministicCellStrategy10.addTile(board22);
        generateDeterministicCellStrategy10.reset();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board((int) '4', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        int[] intArray5 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        generateDeterministicCellStrategy8.reset();
        generateDeterministicCellStrategy8.reset();
        int[] intArray17 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy18 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray17);
        generateDeterministicCellStrategy18.reset();
        generateDeterministicCellStrategy18.reset();
        generateDeterministicCellStrategy18.reset();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy18);
        boolean boolean23 = board22.isWinningBoard();
        boolean boolean24 = board22.moveUp();
        java.lang.String str25 = board22.toString();
        boolean boolean26 = board22.isWinningBoard();
        int int27 = board22.getScore();
        generateDeterministicCellStrategy8.addTile(board22);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertArrayEquals(intArray17, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str25, "Score: 0\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) (byte) 1);
        int[] intArray9 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray9);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy11 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray9);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray9);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(52, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy12);
        int[] intArray20 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy21 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray20);
        generateDeterministicCellStrategy21.reset();
        generateDeterministicCellStrategy21.reset();
        generateDeterministicCellStrategy21.reset();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy21);
        boolean boolean26 = board25.hasEmptyCells();
        boolean boolean27 = board25.moveRight();
        boolean boolean28 = board25.moveLeft();
        boolean boolean29 = board25.isLosingBoard();
        boolean boolean30 = board25.repOk();
        generateDeterministicCellStrategy12.addTile(board25);
        boolean boolean32 = position2.equals((java.lang.Object) board25);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell35 = board25.getCell(4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getScore();
        boolean boolean14 = board11.moveRight();
        boolean boolean15 = board11.moveUp();
        boolean boolean16 = board11.moveLeft();
        boolean boolean17 = board11.moveLeft();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean19 = board11.hasEmptyCells();
        boolean boolean20 = board11.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board11.getEmptyPositions();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(positionSet21);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.isWinningBoard();
        boolean boolean13 = board11.hasEmptyCells();
        boolean boolean14 = board11.repOk();
        boolean boolean15 = board11.isWinningBoard();
        boolean boolean17 = board11.equals((java.lang.Object) '#');
        boolean boolean18 = board11.isFull();
        java.lang.Class<?> wildcardClass19 = board11.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getScore();
        boolean boolean14 = board11.moveRight();
        boolean boolean15 = board11.moveUp();
        boolean boolean16 = board11.moveLeft();
        boolean boolean17 = board11.moveLeft();
        boolean boolean18 = board11.isWinningBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        int[] intArray18 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray18);
        generateDeterministicCellStrategy19.reset();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy19);
        boolean boolean22 = board21.isWinningBoard();
        boolean boolean23 = board11.equals((java.lang.Object) board21);
        boolean boolean24 = board21.moveUp();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(64, (int) (byte) -1);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 64);
        int[] intArray6 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        boolean boolean8 = position5.equals((java.lang.Object) intArray6);
        boolean boolean9 = position2.equals((java.lang.Object) position5);
        int int10 = position5.col;
        int int11 = position5.col;
        java.lang.String str12 = position5.toString();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(10, 64)" + "'", str12, "(10, 64)");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.isWinningBoard();
        boolean boolean13 = board11.moveUp();
        java.lang.String str14 = board11.toString();
        boolean boolean15 = board11.isWinningBoard();
        int int16 = board11.getScore();
        int int17 = board11.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str14, "Score: 0\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        boolean boolean11 = board9.hasEmptyCells();
        int int12 = board9.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isWinningBoard();
        boolean boolean11 = board9.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board9.getEmptyPositions();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(positionSet12);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray13 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        boolean boolean19 = board18.moveDown();
        boolean boolean20 = board18.isLosingBoard();
        boolean boolean21 = board18.hasEmptyCells();
        generateDeterministicCellStrategy6.addTile(board18);
        boolean boolean23 = board18.isWinningBoard();
        int[] intArray30 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy31 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray30);
        generateDeterministicCellStrategy31.reset();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy31);
        boolean boolean34 = board33.isFull();
        boolean boolean35 = board33.hasEmptyCells();
        boolean boolean36 = board33.isFull();
        boolean boolean37 = board33.moveRight();
        boolean boolean38 = board33.isFull();
        boolean boolean39 = board33.isFull();
        boolean boolean40 = board18.equals((java.lang.Object) boolean39);
        boolean boolean41 = board18.moveDown();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertArrayEquals(intArray30, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        int[] intArray18 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray18);
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy19);
        boolean boolean24 = board23.isWinningBoard();
        boolean boolean25 = board23.hasEmptyCells();
        boolean boolean26 = board23.repOk();
        boolean boolean27 = board23.isWinningBoard();
        boolean boolean29 = board23.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board23);
        int int31 = board23.getSize();
        boolean boolean32 = board23.moveLeft();
        generateDeterministicCellStrategy10.addTile(board23);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet34 = board23.getEmptyPositions();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(positionSet34);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(52, 32)" + "'", str3, "(52, 32)");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int6 = position5.col;
        int int7 = position5.col;
        int[] intArray13 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        boolean boolean15 = position5.equals((java.lang.Object) intArray13);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        boolean boolean18 = position2.equals((java.lang.Object) generateDeterministicCellStrategy17);
        java.lang.Class<?> wildcardClass19 = position2.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        int[] intArray18 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray18);
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy19);
        boolean boolean24 = board23.isWinningBoard();
        boolean boolean25 = board23.hasEmptyCells();
        boolean boolean26 = board23.repOk();
        boolean boolean27 = board23.isWinningBoard();
        boolean boolean29 = board23.equals((java.lang.Object) '#');
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board23);
        int int31 = board23.getSize();
        boolean boolean32 = board23.moveLeft();
        generateDeterministicCellStrategy10.addTile(board23);
        generateDeterministicCellStrategy10.reset();
        generateDeterministicCellStrategy10.reset();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        int[] intArray0 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        generateDeterministicCellStrategy2.reset();
        generateDeterministicCellStrategy2.reset();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray16 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy17 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray16);
        generateDeterministicCellStrategy17.reset();
        generateDeterministicCellStrategy17.reset();
        generateDeterministicCellStrategy17.reset();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy17);
        boolean boolean22 = board21.isLosingBoard();
        generateDeterministicCellStrategy9.addTile(board21);
        boolean boolean24 = board21.moveUp();
        boolean boolean25 = board21.moveDown();
        boolean boolean26 = board21.moveLeft();
        ar.edu.unrc.game2048.Board.Position position29 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int30 = position29.row;
        int int31 = position29.col;
        int int32 = position29.col;
        ar.edu.unrc.game2048.Board.Position position35 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int36 = position35.row;
        int int37 = position35.col;
        boolean boolean38 = position29.equals((java.lang.Object) int37);
        boolean boolean39 = board21.equals((java.lang.Object) boolean38);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertArrayEquals(intArray16, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 52 + "'", int36 == 52);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        boolean boolean15 = board11.moveLeft();
        boolean boolean17 = board11.equals((java.lang.Object) false);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board11);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.hasEmptyCells();
        boolean boolean13 = board11.moveRight();
        boolean boolean14 = board11.moveLeft();
        boolean boolean15 = board11.isFull();
        int int16 = board11.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        int[] intArray18 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray18);
        generateDeterministicCellStrategy19.reset();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy19);
        boolean boolean22 = board21.isWinningBoard();
        boolean boolean23 = board11.equals((java.lang.Object) board21);
        boolean boolean24 = board21.isLosingBoard();
        int int25 = board21.getScore();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell28 = board21.getCell((int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, -1) is out of bounds for board size 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        int[] intArray18 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray18);
        generateDeterministicCellStrategy19.reset();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy19);
        boolean boolean22 = board21.isWinningBoard();
        boolean boolean23 = board11.equals((java.lang.Object) board21);
        boolean boolean24 = board21.isLosingBoard();
        int int25 = board21.getSize();
        int int26 = board21.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.repOk();
        boolean boolean15 = board11.repOk();
        boolean boolean16 = board11.repOk();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board11);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board11.getEmptyPositions();
        boolean boolean19 = board11.isWinningBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) '4');
        boolean boolean4 = position2.equals((java.lang.Object) (-1.0d));
        int int5 = position2.col;
        int[] intArray12 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray12);
        generateDeterministicCellStrategy13.reset();
        generateDeterministicCellStrategy13.reset();
        generateDeterministicCellStrategy13.reset();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy13);
        int int18 = board17.getSize();
        boolean boolean19 = board17.moveUp();
        boolean boolean20 = board17.repOk();
        boolean boolean21 = board17.repOk();
        boolean boolean22 = board17.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet23 = board17.getEmptyPositions();
        boolean boolean24 = board17.moveDown();
        boolean boolean25 = position2.equals((java.lang.Object) board17);
        boolean boolean26 = board17.isFull();
        boolean boolean27 = board17.moveRight();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(positionSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getScore();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board11);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        boolean boolean16 = board14.moveLeft();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        boolean boolean12 = board11.moveUp();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = board11.getCell((int) (byte) -1, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 2048) is out of bounds for board size 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board11.getEmptyPositions();
        boolean boolean14 = board11.moveDown();
        boolean boolean15 = board11.hasEmptyCells();
        java.lang.String str16 = board11.toString();
        boolean boolean17 = board11.isFull();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    1|     |    1|\n+-----+-----+-----+-----+\n" + "'", str16, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |    2|\n+-----+-----+-----+-----+\n|     |    1|     |    1|\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        int[] intArray1 = null;
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        int[] intArray0 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy1 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy2 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy3 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy4 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy5 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertArrayEquals(intArray0, new int[] {});
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        int[] intArray7 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray7);
        int[] intArray15 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy16 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray15);
        generateDeterministicCellStrategy16.reset();
        generateDeterministicCellStrategy16.reset();
        generateDeterministicCellStrategy16.reset();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy16);
        boolean boolean21 = board20.moveDown();
        boolean boolean22 = board20.isLosingBoard();
        boolean boolean23 = board20.hasEmptyCells();
        generateDeterministicCellStrategy8.addTile(board20);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(64, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy8);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board((-1), (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertArrayEquals(intArray15, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.moveLeft();
        boolean boolean15 = board11.repOk();
        int[] intArray22 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy23 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray22);
        generateDeterministicCellStrategy23.reset();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy23);
        boolean boolean26 = board25.isWinningBoard();
        int int27 = board25.getSize();
        boolean boolean28 = board25.isLosingBoard();
        boolean boolean29 = board11.equals((java.lang.Object) boolean28);
        boolean boolean30 = board11.moveUp();
        boolean boolean31 = board11.isFull();
        boolean boolean32 = board11.moveLeft();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(board11);
        java.lang.String str34 = board33.toString();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Score: 6\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|    1|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str34, "Score: 6\n+-----+-----+-----+-----+\n|    4|     |     |     |\n+-----+-----+-----+-----+\n|    1|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    1|    1|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board11.getEmptyPositions();
        boolean boolean14 = board11.moveUp();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getSize();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        int[] intArray11 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy12 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray11);
        boolean boolean13 = position2.equals((java.lang.Object) generateDeterministicCellStrategy12);
        boolean boolean15 = position2.equals((java.lang.Object) 0);
        int[] intArray21 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy22 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray21);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy23 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray21);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy24 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray21);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy25 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray21);
        boolean boolean26 = position2.equals((java.lang.Object) intArray21);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy27 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(52, 32)" + "'", str4, "(52, 32)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertArrayEquals(intArray11, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertArrayEquals(intArray21, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.row;
        int int4 = position2.col;
        int int5 = position2.col;
        int int6 = position2.col;
        int int7 = position2.row;
        int int8 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray13 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        int int19 = board18.getSize();
        java.lang.String str20 = board18.toString();
        int int21 = board18.getScore();
        boolean boolean22 = board18.moveLeft();
        generateDeterministicCellStrategy6.addTile(board18);
        boolean boolean24 = board18.moveRight();
        int int25 = board18.getSize();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str20, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray13 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        boolean boolean17 = board16.isFull();
        boolean boolean18 = board16.isWinningBoard();
        generateDeterministicCellStrategy6.addTile(board16);
        int[] intArray26 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy27 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray26);
        generateDeterministicCellStrategy27.reset();
        generateDeterministicCellStrategy27.reset();
        generateDeterministicCellStrategy27.reset();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy27);
        boolean boolean32 = board31.moveDown();
        int int33 = board31.getSize();
        int int34 = board31.getScore();
        boolean boolean35 = board31.repOk();
        generateDeterministicCellStrategy6.addTile(board31);
        int[] intArray43 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy44 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray43);
        generateDeterministicCellStrategy44.reset();
        generateDeterministicCellStrategy44.reset();
        generateDeterministicCellStrategy44.reset();
        ar.edu.unrc.game2048.Board board48 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy44);
        boolean boolean49 = board48.hasEmptyCells();
        int[] intArray55 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy56 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray55);
        generateDeterministicCellStrategy56.reset();
        generateDeterministicCellStrategy56.reset();
        boolean boolean59 = board48.equals((java.lang.Object) generateDeterministicCellStrategy56);
        generateDeterministicCellStrategy6.addTile(board48);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertArrayEquals(intArray26, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertArrayEquals(intArray43, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertArrayEquals(intArray55, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board11.getEmptyPositions();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board11);
        java.lang.Class<?> wildcardClass17 = board16.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.moveLeft();
        boolean boolean15 = board11.moveDown();
        boolean boolean16 = board11.moveDown();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board11.getEmptyPositions();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(positionSet17);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2048, 0);
        int int3 = position2.row;
        int int4 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2048 + "'", int3 == 2048);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2048 + "'", int4 == 2048);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        int[] intArray18 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray18);
        generateDeterministicCellStrategy19.reset();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy19);
        boolean boolean22 = board21.isWinningBoard();
        boolean boolean23 = board11.equals((java.lang.Object) board21);
        boolean boolean24 = board21.isLosingBoard();
        int int25 = board21.getSize();
        boolean boolean26 = board21.hasEmptyCells();
        int int27 = board21.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isWinningBoard();
        int int11 = board9.getSize();
        boolean boolean12 = board9.moveRight();
        int int13 = board9.getSize();
        boolean boolean14 = board9.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board9.getEmptyPositions();
        int int16 = board9.getScore();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        int int14 = board11.getScore();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board11.getEmptyPositions();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(positionSet17);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        boolean boolean15 = board11.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board11.getEmptyPositions();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board11);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell20 = board17.getCell(32, 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 2048) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(positionSet16);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        boolean boolean11 = board9.hasEmptyCells();
        boolean boolean12 = board9.isFull();
        boolean boolean13 = board9.moveRight();
        boolean boolean14 = board9.isFull();
        boolean boolean15 = board9.isLosingBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        ar.edu.unrc.game2048.Board.Position position16 = new ar.edu.unrc.game2048.Board.Position(64, (int) (byte) -1);
        ar.edu.unrc.game2048.Board.Position position19 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 64);
        int[] intArray20 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy21 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray20);
        boolean boolean22 = position19.equals((java.lang.Object) intArray20);
        boolean boolean23 = position16.equals((java.lang.Object) position19);
        int int24 = position19.row;
        int[] intArray32 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy33 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray32);
        generateDeterministicCellStrategy33.reset();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy33);
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board((int) (short) 10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy33);
        boolean boolean37 = position19.equals((java.lang.Object) (short) 10);
        boolean boolean38 = board11.equals((java.lang.Object) boolean37);
        boolean boolean39 = board11.moveLeft();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertArrayEquals(intArray32, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.lang.String str13 = board11.toString();
        boolean boolean14 = board11.repOk();
        boolean boolean15 = board11.moveLeft();
        boolean boolean16 = board11.moveLeft();
        int[] intArray25 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy26 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray25);
        generateDeterministicCellStrategy26.reset();
        generateDeterministicCellStrategy26.reset();
        generateDeterministicCellStrategy26.reset();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy26);
        int int31 = board30.getSize();
        int int32 = board30.getScore();
        boolean boolean33 = board30.moveRight();
        boolean boolean34 = board30.moveUp();
        boolean boolean35 = board30.moveLeft();
        boolean boolean36 = board30.moveLeft();
        boolean boolean37 = board30.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell40 = board30.getCell(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            board11.setCell((int) '4', 100, cell40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str13, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertArrayEquals(intArray25, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cell40);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.repOk();
        boolean boolean15 = board11.repOk();
        boolean boolean16 = board11.repOk();
        boolean boolean17 = board11.moveUp();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        ar.edu.unrc.game2048.Board.Direction direction7 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        boolean boolean8 = position2.equals((java.lang.Object) direction7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(52, 32)" + "'", str4, "(52, 32)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(52, 32)" + "'", str5, "(52, 32)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + direction7 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction7.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean14 = board11.equals((java.lang.Object) 100L);
        boolean boolean16 = board11.equals((java.lang.Object) "(1, 64)");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(52, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy9);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board10.getEmptyPositions();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertNotNull(positionSet11);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        int int4 = position2.col;
        int int5 = position2.col;
        int int6 = position2.row;
        int[] intArray13 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        int int19 = board18.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = board18.getEmptyPositions();
        int[] intArray27 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy28 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray27);
        generateDeterministicCellStrategy28.reset();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy28);
        boolean boolean31 = board30.repOk();
        boolean boolean32 = board30.isWinningBoard();
        boolean boolean33 = board30.hasEmptyCells();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board30);
        int int35 = board30.getSize();
        boolean boolean36 = board18.equals((java.lang.Object) int35);
        boolean boolean37 = position2.equals((java.lang.Object) int35);
        int int38 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertArrayEquals(intArray27, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board11.getEmptyPositions();
        int[] intArray20 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy21 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray20);
        generateDeterministicCellStrategy21.reset();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy21);
        boolean boolean24 = board23.repOk();
        boolean boolean25 = board23.isWinningBoard();
        boolean boolean26 = board23.hasEmptyCells();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board23);
        int int28 = board23.getSize();
        boolean boolean29 = board11.equals((java.lang.Object) int28);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean31 = board30.moveRight();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        boolean boolean14 = board11.moveLeft();
        boolean boolean15 = board11.repOk();
        int[] intArray22 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy23 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray22);
        generateDeterministicCellStrategy23.reset();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy23);
        boolean boolean26 = board25.isWinningBoard();
        int int27 = board25.getSize();
        boolean boolean28 = board25.isLosingBoard();
        boolean boolean29 = board11.equals((java.lang.Object) boolean28);
        boolean boolean30 = board11.moveUp();
        int int31 = board11.getSize();
        int[] intArray37 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy38 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray37);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy39 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray37);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy40 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray37);
        boolean boolean41 = board11.equals((java.lang.Object) intArray37);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertArrayEquals(intArray22, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertArrayEquals(intArray37, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        int[] intArray14 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy15 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray14);
        generateDeterministicCellStrategy15.reset();
        generateDeterministicCellStrategy15.reset();
        generateDeterministicCellStrategy15.reset();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy15);
        boolean boolean20 = board19.moveDown();
        boolean boolean21 = board19.isLosingBoard();
        boolean boolean22 = board19.hasEmptyCells();
        generateDeterministicCellStrategy7.addTile(board19);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(64, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean25 = board24.moveRight();
        boolean boolean26 = board24.moveUp();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertArrayEquals(intArray14, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.hasEmptyCells();
        int[] intArray18 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray18);
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        boolean boolean22 = board11.equals((java.lang.Object) generateDeterministicCellStrategy19);
        int[] intArray29 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy30 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray29);
        generateDeterministicCellStrategy30.reset();
        generateDeterministicCellStrategy30.reset();
        generateDeterministicCellStrategy30.reset();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy30);
        int int35 = board34.getSize();
        boolean boolean37 = board34.equals((java.lang.Object) 100L);
        boolean boolean38 = board34.moveLeft();
        boolean boolean40 = board34.equals((java.lang.Object) false);
        boolean boolean41 = board34.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet42 = board34.getEmptyPositions();
        generateDeterministicCellStrategy19.addTile(board34);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(positionSet42);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int3 = position2.col;
        int int4 = position2.col;
        boolean boolean6 = position2.equals((java.lang.Object) (short) 100);
        boolean boolean8 = position2.equals((java.lang.Object) 'a');
        int int9 = position2.col;
        java.lang.String str10 = position2.toString();
        int int11 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "(52, 32)" + "'", str10, "(52, 32)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 2);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isFull();
        boolean boolean11 = board9.hasEmptyCells();
        int int12 = board9.getScore();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        int[] intArray18 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy19 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray18);
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        generateDeterministicCellStrategy19.reset();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy19);
        boolean boolean24 = board23.isWinningBoard();
        boolean boolean25 = board23.moveUp();
        java.lang.String str26 = board23.toString();
        generateDeterministicCellStrategy10.addTile(board23);
        boolean boolean28 = board23.isFull();
        boolean boolean29 = board23.isWinningBoard();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertArrayEquals(intArray18, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str26, "Score: 0\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.isWinningBoard();
        boolean boolean13 = board11.hasEmptyCells();
        boolean boolean14 = board11.moveDown();
        boolean boolean15 = board11.isFull();
        java.lang.String str16 = board11.toString();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str16, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|    1|     |     |\n+-----+-----+-----+-----+\n");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        ar.edu.unrc.game2048.Board.Position position4 = new ar.edu.unrc.game2048.Board.Position((int) '4', (int) ' ');
        int int5 = position4.col;
        java.lang.String str6 = position4.toString();
        int int7 = position4.col;
        int[] intArray13 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        boolean boolean15 = position4.equals((java.lang.Object) generateDeterministicCellStrategy14);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board((int) '4', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(0, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(52, 32)" + "'", str6, "(52, 32)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy9 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy10);
        int int12 = board11.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.hasEmptyCells();
        boolean boolean13 = board11.moveRight();
        boolean boolean14 = board11.moveLeft();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board11);
        int int16 = board15.getScore();
        boolean boolean17 = board15.moveRight();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.isWinningBoard();
        int int11 = board9.getSize();
        int int12 = board9.getScore();
        int[] intArray19 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy20 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray19);
        generateDeterministicCellStrategy20.reset();
        generateDeterministicCellStrategy20.reset();
        generateDeterministicCellStrategy20.reset();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy20);
        boolean boolean25 = board24.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet26 = board24.getEmptyPositions();
        boolean boolean27 = board24.moveUp();
        boolean boolean28 = board24.hasEmptyCells();
        boolean boolean29 = board24.moveDown();
        boolean boolean30 = board9.equals((java.lang.Object) boolean29);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertArrayEquals(intArray19, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(positionSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, (int) ' ');
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board11.getEmptyPositions();
        int int15 = board11.getScore();
        boolean boolean16 = board11.repOk();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        int[] intArray6 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean10 = board9.moveLeft();
        ar.edu.unrc.game2048.Cell cell13 = board9.getCell((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell13);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, 2);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        int[] intArray5 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy6 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray5);
        int[] intArray13 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy14 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray13);
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        generateDeterministicCellStrategy14.reset();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy14);
        boolean boolean19 = board18.moveDown();
        boolean boolean20 = board18.isLosingBoard();
        boolean boolean21 = board18.hasEmptyCells();
        generateDeterministicCellStrategy6.addTile(board18);
        int[] intArray29 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy30 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray29);
        generateDeterministicCellStrategy30.reset();
        generateDeterministicCellStrategy30.reset();
        generateDeterministicCellStrategy30.reset();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy30);
        int int35 = board34.getSize();
        java.lang.String str36 = board34.toString();
        int int37 = board34.getScore();
        generateDeterministicCellStrategy6.addTile(board34);
        boolean boolean39 = board34.isWinningBoard();
        boolean boolean40 = board34.isWinningBoard();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertArrayEquals(intArray5, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertArrayEquals(intArray13, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertArrayEquals(intArray29, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n" + "'", str36, "Score: 0\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|    2|     |     |     |\n+-----+-----+-----+-----+\n|     |     |     |     |\n+-----+-----+-----+-----+\n|     |    1|     |     |\n+-----+-----+-----+-----+\n");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.moveDown();
        int int13 = board11.getSize();
        int int14 = board11.getScore();
        boolean boolean15 = board11.isFull();
        boolean boolean16 = board11.repOk();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell19 = board11.getCell(64, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (64, 100) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        boolean boolean12 = board11.isWinningBoard();
        boolean boolean13 = board11.hasEmptyCells();
        boolean boolean14 = board11.repOk();
        boolean boolean15 = board11.isWinningBoard();
        boolean boolean16 = board11.isFull();
        boolean boolean17 = board11.isFull();
        int int18 = board11.getSize();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        int[] intArray7 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy8 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray7);
        generateDeterministicCellStrategy8.reset();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy8);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) (short) 10, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy8);
        boolean boolean12 = board11.moveUp();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board11);
        ar.edu.unrc.game2048.Board.Position position16 = new ar.edu.unrc.game2048.Board.Position((-1), 4);
        boolean boolean17 = board11.equals((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertArrayEquals(intArray7, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board11.getEmptyPositions();
        int[] intArray20 = new int[] { ' ', ' ', '4', ' ', (-1) };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy21 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray20);
        generateDeterministicCellStrategy21.reset();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board((int) ' ', (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy21);
        boolean boolean24 = board23.repOk();
        boolean boolean25 = board23.isWinningBoard();
        boolean boolean26 = board23.hasEmptyCells();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board23);
        int int28 = board23.getSize();
        boolean boolean29 = board11.equals((java.lang.Object) int28);
        boolean boolean30 = board11.moveLeft();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertArrayEquals(intArray20, new int[] { 32, 32, 52, 32, (-1) });
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        ar.edu.unrc.game2048.GenerateCellStrategy generateCellStrategy1 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, generateCellStrategy1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Max Size Allowed is 64x64");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) '4');
        boolean boolean4 = position2.equals((java.lang.Object) (-1.0d));
        int int5 = position2.col;
        int[] intArray12 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy13 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray12);
        generateDeterministicCellStrategy13.reset();
        generateDeterministicCellStrategy13.reset();
        generateDeterministicCellStrategy13.reset();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy13);
        int int18 = board17.getSize();
        boolean boolean19 = board17.moveUp();
        boolean boolean20 = board17.repOk();
        boolean boolean21 = board17.repOk();
        boolean boolean22 = board17.repOk();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet23 = board17.getEmptyPositions();
        boolean boolean24 = board17.moveDown();
        boolean boolean25 = position2.equals((java.lang.Object) board17);
        int int26 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertArrayEquals(intArray12, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(positionSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, (int) 'a');
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position(64, (int) (byte) -1);
        ar.edu.unrc.game2048.Board.Position position8 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, 64);
        int[] intArray9 = new int[] {};
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy10 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray9);
        boolean boolean11 = position8.equals((java.lang.Object) intArray9);
        boolean boolean12 = position5.equals((java.lang.Object) position8);
        int int13 = position8.col;
        int int14 = position8.col;
        boolean boolean15 = position2.equals((java.lang.Object) position8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertArrayEquals(intArray9, new int[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        int[] intArray6 = new int[] { '#', 1, (byte) 1, 'a', ' ' };
        ar.edu.unrc.game2048.GenerateDeterministicCellStrategy generateDeterministicCellStrategy7 = new ar.edu.unrc.game2048.GenerateDeterministicCellStrategy(intArray6);
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        generateDeterministicCellStrategy7.reset();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(4, (ar.edu.unrc.game2048.GenerateCellStrategy) generateDeterministicCellStrategy7);
        int int12 = board11.getSize();
        int int13 = board11.getScore();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean15 = board11.hasEmptyCells();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertArrayEquals(intArray6, new int[] { 35, 1, 1, 97, 32 });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }
}

