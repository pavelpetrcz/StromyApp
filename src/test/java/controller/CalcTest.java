package controller;

import model.Leaf;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {

    @Test
    public void createLeaf() {
        Calc test = new Calc();
        test.createLeaf("1;L;H");
        assertNotNull(test);
    }

    @Test
    public void createNut() {
        Calc test = new Calc();
        test.createNut("1;O;N");
        assertNotNull(test);
    }

    @Test
    public void createBranch() {
        Calc test = new Calc();
        test.createBranch("1;V;5");
        assertNotNull(test);
    }

    @Test
    public void checkInput() throws Exception {
        Calc test = new Calc();
        assertEquals(true, test.checkInput("start"));
    }

    @Test
    public void checkInputFileExists() throws Exception {
        Calc test = new Calc();
        assertEquals(false, test.checkInputFileExists("aa"));

    }

    @Test
    public void readFile() {
    }

    @Test
    public void createEdge() {
    }

    @Test
    public void countLeafs() {
    }

    @Test
    public void countNuts() {
    }

    @Test
    public void readIds() {


    }
}