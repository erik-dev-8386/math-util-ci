package com.thanhdt.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.thanhdt.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilityDDTTest {

    //CHUẨN BỊ BỘ DÂTA HAY CẶP DATA X! KÌ VỌNG BẰNG MẤY CHÍNH LÀ MẢNG 2 CHIỀU HÀM NÀY PHẢI LÀ HÀM PUBLIC
    // ĐỂ CÁC HÀM @TEST MÒ VÀO LẤY DATA ĐỂ TEST RUN
    public static Object[][] initData()
    {
        return new Object[][] {
                { 0, 1 }, //0! hy vọng 1
                { 1, 1 },
                { 2, 2 },
                { 3, 6 },
                { 4, 24 },
                { 5, 120 },//5! hy vọng 120
                { 6, 7200 },
        };
    }

    @ParameterizedTest
    @MethodSource("initData") // DDT - Data Driven Testing
    public void testFactorialGivenRightAgrumentReturnsWell(int n, long expectedResult){
        assertEquals(expectedResult, getFactorial(n));
        //                  5! hy vọng trả về 120
        //assert là hàm so 2 giá trị có == nhau hay ko, của thư viện JUNIT
    }

}