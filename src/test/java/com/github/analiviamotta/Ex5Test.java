package com.github.analiviamotta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Ex5Test {

    @Test
    @DisplayName("shold the number of candles can blow out is zero")
    void sholdTheNumberOfCandlesCanBlowOutIsZero(){
        Ex05 ex05 = new Ex05();
        int[] candles = {0};

        assertThat(ex05.computeNumberOfBlowoutCandles(0, candles)).isEqualTo(0);
    }


}
