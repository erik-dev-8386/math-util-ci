package com.thanhdt;

import com.thanhdt.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightAgrument0ReturnsWell();
        testFactorialGivenRightAgrument1ReturnsWell();
        testFactorialGivenRightAgrument5ReturnsWell();
        testFactorialGivenWrongArgumentMinus1ThrowsException();
    }

    public static void testFactorialGivenWrongArgumentMinus1ThrowsException()
    {
        MathUtility.getFactorial(-1);
        // chạy hàm này, thấy ngoại lệ bung ra, mừng rơi nước mắt
        // vì đưa -1 mà hàm ném ngoại lệ nghĩa là hàm chạy đúng do data cà chớn
        // hàm được thiết kế là n âm thì ném ngoại lệ
        // vậy giờ nếu đưa -1 mà ném ngoại lệ  => ném ngoại  lệ
    }




    // Khi test để ý mấy cái giá trị biên
    // giá trị biên là giá trị làm thay đổi cách xử lý


    // TDD loại 1
    // hàm kiểm thử code chính của mình, hàm này dân dev dùng để test code chính, code chính chính là hàm getFactorial() bên .core
    // Tên hàm kiểm thử mang luôn ý nghĩa của TEST  CASE
    // Ví dụ dưới này: cho tham số tự tế RightArg 0 thì hàm phải chạy ngon runs well
    // đoạn code này go là 1 test case là 1 đoạn code chuẩn
    public static void testFactorialGivenRightAgrument0ReturnsWell()
    {
        int n = 0;                   // 0!
        long expectedResult = 1;    // hy vọng trả về 1
        long actualResult = MathUtility.getFactorial(n);  // thực tế sẽ là mấy

        // đi so sánh 2 giá trị coi expected == actual??
        System.out.println("Expected: " + expectedResult + " vs. Actual: " + actualResult);
        System.out.println(expectedResult == actualResult); // true/false
    }
    public static void testFactorialGivenRightAgrument1ReturnsWell()
    {
        int n = 1;                   // 1!
        long expectedResult = 1;    // hy vọng trả về 1
        long actualResult = MathUtility.getFactorial(n);  // thực tế sẽ là mấy

        // đi so sánh 2 giá trị coi expected == actual??
        System.out.println("Expected: " + expectedResult + " vs. Actual: " + actualResult);
        System.out.println(expectedResult == actualResult); // true/false
    }
    public static void testFactorialGivenRightAgrument5ReturnsWell()
    {
        int n = 5;                   // 5!
        long expectedResult = 120;    // hy vọng trả về 120
        long actualResult = MathUtility.getFactorial(n);  // thực tế sẽ là mấy

        // đi so sánh 2 giá trị coi expected == actual??
        System.out.println("Expected: " + expectedResult + " vs. Actual: " + actualResult);
        System.out.println(expectedResult == actualResult); // true/false
    }


    // TDD viết TEST CASE SONG SONG VỚI VIỆC VIẾT CODE
    // Dân Dev phải TEST CODE của chính họ
    // Họ TEST CODE của HỌ như thế nào?
    // Trước khi TEST (TEST RUN) thì cần có TEST CASE
    // TEST CASE #1
    // Check getFactorial() WITH N = 0
    // STEPS:
    // (1) Given N = 0
    // (2) CALL getFactoral(0)
    //  EXPECTED RESULT/VALUE: 1

    // TEST CASE #2
    // Check getFactorial() WITH N = 1
    // STEPS:
    // (1) Given N = 1
    // (2) CALL getFactoral(1)
    //  EXPECTED RESULT/VALUE: 1

    // TEST CASE #3
    // Check getFactorial() WITH N = 5
    // STEPS:
    // (1) Given N = 5
    // (2) CALL getFactoral(5)
    //  EXPECTED RESULT/VALUE: 120

    // TEST CASSE #4
    // Check getFactorial() with N = -1
    // STEPS:
    // (1) GIVEN N = -1;
    // (2) CALL getFactorial(-1)
    // Expected RESULT/VALUE: AN EXCEPTION IS THROWN
    // Ko có value => ném ngoại lệ

    // TEST CASSE #5
    // Check getFactorial() with N = 21
    // STEPS:
    // (1) GIVEN N = 21;
    // (2) CALL getFactorial(21)
    // Expected RESULT/VALUE: AN EXCEPTION IS THROWN
    // Ko có value => ném ngoại lệ


}
