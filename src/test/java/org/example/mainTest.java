package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class mainTest {
    @Test

    public void test() {
        Main add = new Main();
        add.addFilm("1film");
        add.addFilm("2film");
        add.addFilm("3film");
        add.addFilm("4film");
        add.addFilm("5film");
        add.addFilm("6film");
        add.addFilm("7film");
        add.addFilm("8film");
        add.addFilm("9film");
        add.addFilm("10film");
        add.addFilm("11film");


        String[] expectid = {"1film", "2film", "3film", "4film", "5film", "6film", "7film", "8film", "9film", "10film", "11film"};
        String[] actual = add.findAll();
        Assertions.assertArrayEquals(expectid,actual);
    }
    @Test
    public void test2() {
        Main add = new Main();
        add.addFilm("1film");
        add.addFilm("2film");
        add.addFilm("3film");
        add.addFilm("4film");


        String[] expectid = {"4film", "3film", "2film"};
        String[] actual = add.findLast(3);
        Assertions.assertArrayEquals(expectid, actual);
    }
    @Test
    public void test3() {
        Main add = new Main();
        add.addFilm("1film");
        add.addFilm("2film");
        add.addFilm("3film");
        add.addFilm("4film");


        String[] expectid = {"4film", "3film", "2film","1film" };
        String[] actual = add.findLast(4);
        Assertions.assertArrayEquals(expectid, actual);
    }
    @Test
    public void test4() {
        Main add = new Main();
        add.addFilm("1film");
        add.addFilm("2film");
        add.addFilm("3film");
        add.addFilm("4film");


        String[] expectid = {"4film", "3film", "2film","1film" };
        String[] actual = add.findLast(10);
        Assertions.assertArrayEquals(expectid, actual);
    }


}


