package controller;

import model.Leaf;
import model.Nut;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        assertNotNull(test);
    }

    @Test
    public void readFile() throws Exception {
        Calc test = new Calc();
        test.readFile("D:/StromyApp/src/test/java/calcTest.txt");

    }

    @Test
    public void countLeafs() {
        List<Leaf>leafs = new ArrayList<>();
        Leaf leaf = new Leaf();
        leaf.setColor('H');
        leafs.add(leaf);
        Calc test = new Calc();

        assertEquals(1, test.countLeafs(leafs, 'H'));

    }

    @Test
    public void countNuts() {
        List<Nut> nuts = new ArrayList<>();
        Nut nut = new Nut();
        nut.setState('N');
        nuts.add(nut);
        Calc test = new Calc();

        assertEquals(1, test.countNuts(nuts, 'N'));
    }

    @Test
    public void readIds() throws Exception {
        List<Integer> testIds = new ArrayList<>();
        testIds.add(1);
        testIds.add(2);
        testIds.add(3);
        //testIds.add(4);

        Calc test = new Calc();

        //assertSame(testIds, test.readIds("D:/StromyApp/src/test/java/calcTestReadIDs.txt"));



    }
}