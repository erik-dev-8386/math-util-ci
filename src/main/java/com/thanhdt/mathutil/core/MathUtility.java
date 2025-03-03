package com.thanhdt.mathutil.core;

public class MathUtility {
    // class này cung cấp các hàm liên quan đến toán học
    // class này là bộ thư viện chứa các hàm toán học giống class Math trong JDK
    // thư viện chứa hàm tính toán mà ko cần lưu trữ kết quả, chỉ trả về kết quả, thì nên được thiết kế là hàm static, ví dụ Math.sqrt(), Math.abs()
    // class này tạm làm hàm tính giai thừa n!
    // hàm tính n!
    // n! = 1.2.3.4...n, trong đó
    // 0! = 1! = 1
    // 20! vừa đủ kiểu long, 21! kiểu long chứa ko nổi, tràn
    // mình ko tính quá 20! vì 21Q kiểu long chứa ko nổi, sẽ tính sai
    // quy ước hàm này chỉ tính n từ 0...20
    // code hàm thì cx đồng thời phải kiểm thử hàm; muốn kiểm thử phải có test case!!!
    // hàm nhận vào n, trả về n! (n trong đoạn từ  [0....20]
    public static long getFactorial(int n) {
        // kĩ thuật nhồi con heo đất, ốc nhồi thịt, tiếp chiêu
        // kĩ thuật nhân dồn, cộng dồn giá trị
        if (n < 0 || n > 20)
            // ném ra ngoại lệ
            throw new IllegalArgumentException("Invalid n, n must be in the range [0, 20]");
        // hàm ko trả về giá trị => IllegalException

        long result = 1; //bài tổng thì ban đầu
        if (n == 0)
            return 1; //thoát sớm khi có thể, return ngay khi có thể
        // if và for nếu chỉ có 1 lệnh ko cần {..... 1 lệnh }
        // return sớm thì ko cần else luôn

        // n = 1 2 3 4 -> nhân dồn vào result = result * i
        for (int i = 1; i <= n; i++) {
            //result = result * i;
            result *= i;  // nhân dồn từ 1 đến n, i tăng từ 1 2 3, dồn vào result
        }
        return result;
    }
}
