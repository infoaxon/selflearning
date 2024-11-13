package com.healthycoderapp;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;
public class BMICalculatorTest {

    @Test
    void should_ReturnTrue_When_DietRecommended() {
        //given or Arrange
        double weight = 89.0;
        double height = 1.72;

        //when or Act
        boolean recommended = BMICalculator.isDietRecommended(weight, height);

        // then or Assert
        assertTrue(recommended);
    }

    @Test
    void should_ReturnFalse_When_DietRecommended() {
        // given or Arrange
        double weight = 57;
        double height = 1.72;

        // when or Act
        boolean recommended = BMICalculator.isDietRecommended(weight, height);

        // then or Assert
        assertFalse(recommended);
    }

    @Test

    void should_ThrowArithmeticException_When_HeightZero() {
        // given or Arrange
        double weight = 50;
        double height = 0.0;

        // when or Act
        Executable executable = () -> BMICalculator.isDietRecommended(weight, height);

        // then or Assert
        assertThrows(ArithmeticException.class, executable);

    }


}
