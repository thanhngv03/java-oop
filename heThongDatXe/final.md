2. Từ khóa final trong Java có thể được sử dụng với biến, phương thức và lớp. Nêu ý nghĩa 
của final trong từng trường hợp. (2 điểm) 

| Trường hợp              | Ý nghĩa                                              |
| ----------------------- | ---------------------------------------------------- |
| `final` với biến        | Không thể thay đổi giá trị sau khi đã gán. (Hằng số) |
| `final` với phương thức | Không thể ghi đè (override) phương thức đó ở lớp con |
| `final` với lớp         | Không thể kế thừa lớp đó                             |

Ví dụ:

```java
final class HinhVuong {
    public final void tinhDienTich() {
        System.out.println("Tính diện tích hình vuông");
    }
}

// class HinhVuongCon extends HinhVuong {} ❌ lỗi: không kế thừa được

public class ViDuFinal {
    public static final double PI = 3.14; // hằng số
}
