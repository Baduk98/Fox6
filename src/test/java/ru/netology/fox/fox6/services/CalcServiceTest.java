package ru.netology.fox.fox6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalcServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/count.csv")

    public void testCalcCount(int expected, int income, int expense, int threshold) {
        CalcService service = new CalcService();

        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}