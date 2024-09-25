package com.github.analiviamotta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Ex5Test {

    @Test
    @DisplayName("should the number of candles can blow out is zero")
    void shouldTheNumberOfCandlesCanBlowOutIsZero(){
        Ex05 ex05 = new Ex05();
        int[] candles = {0};

        assertThat(ex05.computeNumberOfBlowoutCandles(0, candles)).isEqualTo(0);
    }

    @Test
    @DisplayName("should the number of candles can blow out is three")
    void shouldTheNumberOfCandlesCanBlowOutIsThree(){
        Ex05 ex05 = new Ex05();
        int[] candles = {1, 2, 2, 1, 1, 2};

        assertThat(ex05.computeNumberOfBlowoutCandles(6, candles)).isEqualTo(3);
    }

    @Test
    @DisplayName("should throw exception when age is negative")
    void shouldThrowExceptionWhenAgeIsNegative(){
        Ex05 ex05 = new Ex05();
        int[] candles = {};

        assertThrows(IllegalArgumentException.class, () ->
                ex05.computeNumberOfBlowoutCandles(-1, candles));
    }

    @Test
    @DisplayName("should throw exception when candle size is negative")
    void shouldThrowExceptionWhenCandleSizeIsNegative(){
        Ex05 ex05 = new Ex05();
        int[] candles = {1, 2, 3, -4};

        assertThrows(IllegalArgumentException.class, () ->
                ex05.computeNumberOfBlowoutCandles(4, candles));
    }




}
