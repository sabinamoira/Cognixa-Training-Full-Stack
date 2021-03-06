package com.d03.parameterizedtest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CsvFileSourceTest {

    // Skip the first line
    @ParameterizedTest
    @CsvFileSource(resources = "/simple.csv", numLinesToSkip = 1)
    void test_csv_file(String str, int length) {
        assertEquals(length, str.length());
    }

}
