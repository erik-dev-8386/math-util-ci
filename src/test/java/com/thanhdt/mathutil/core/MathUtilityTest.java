package com.thanhdt.mathutil.core;

import org.junit.jupiter.api.Test;

import static com.thanhdt.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    // Class này xài bộ thư viện JUNIT, được tải trên mạng về tự động bởi MAVEN.
    // Bộ th viện JUNIT này dùng để TEST TỰ ĐỘNG CÁC HÀM CỦA CLASS CHÍNH NÓ SẼ
    // tự động các hàm của class chính
    // Nó sẽ tự chạy khi đóng gói app, để check xem các hàm có chạy đúng ko
    // đúng tức là EXPECTED == ACTUAL
    // Nếu có nhiều TEST CASE, thì nó sẽ gom STATUS của các TEST CASE lại thành 2 màu xanh đỏ, mắt dân DEV chỉ cần 2 màu xanh - PASSED đỏ - FAILED mà ko cần nhìn từng TEST CASE COI PASSED HAY FAILED
    // Y chang cho các ngôn ngữ lập trình khác - là chuẩn test code rồi
    // Bộ thư viện này còn gọi là FRAMEWORK, JUNIT TESTING FRAMEWORK

    // Nếu hàm static mà import static gọi hàm ko cần dấu chấm
    // import static là cách khai báo trước tên class chứa hàm static để ở dưới gọi hàm static ngắn gọn như bên pascal, gọi  hàm ko cần dấu chấm tên class
    // nếu có nhiều static




    // TEST CASE #1: VERIFY GETFACTORIAL WITH N = 0,EXPECTED VALUE


    @Test
    public void testFactorialGivenRightAgrument0ReturnsWell()
    {
        int n = 0;                   // 0!
        long expectedResult = 1;    // hy vọng trả về 1
        long actualResult = getFactorial(n);  // thực tế sẽ là mấy

        // đi so sánh 2 giá trị coi expected == actual??
//        System.out.println("Expected: " + expectedResult + " vs. Actual: " + actualResult);
//        System.out.println(expectedResult == actualResult); // true/false

        assertEquals(expectedResult,actualResult);
        // so sánh xem 2 đứa expected == actual ko nhưng ko viết sout()
        // hàm này của class thư viện JUnit : Java Unit Test từng hàm
        // Hàm static ko cần phải new
    }
    @Test
    public void testFactorialGivenRightAgrument1ReturnsWell()
    {
        assertEquals(1,getFactorial(1));
                        //    1!   hy vọng trả về 1
                        // assert là hàm so 2 giá trị có == nhau hay ko, của thư viện JUNIT
    }
    @Test
    public void testFactorialGivenRightAgrument4ReturnsWell()
    {
        assertEquals(24,getFactorial(4));
        //    4!   hy vọng trả về 24
        // assert là hàm so 2 giá trị có == nhau hay ko, của thư viện JUNIT
    }
    @Test
    public void testFactorialGivenRightAgrument5ReturnsWell()
    {
        assertEquals(120,getFactorial(5));
        //    5!   hy vọng trả về 120
        // assert là hàm so 2 giá trị có == nhau hay ko, của thư viện JUNIT
    }

}