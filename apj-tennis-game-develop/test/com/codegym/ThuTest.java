package com.codegym;

import org.junit.Assert;
import org.junit.Test;

public class ThuTest {
    @Test
    public  void testDeuce() {
        String result = TennisGame.getScore(4, 4);
        Assert.assertEquals(TennisGame.DEUCE, result);
    }
    @Test
    public  void testWin() {
        String result = TennisGame.getScore(1, 4);
        Assert.assertEquals(TennisGame.WIN_FOR_PLAYER_2, result);
    }
}
