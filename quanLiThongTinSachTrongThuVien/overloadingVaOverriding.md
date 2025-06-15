So sánh

| Đặc điểm     | Nạp chồng phương thức (Overloading)           | Ghi đè phương thức (Overriding)     |
| ------------ | --------------------------------------------- | ----------------------------------- |
| Định nghĩa   | Nhiều phương thức cùng tên nhưng khác tham số | Ghi đè lại phương thức của lớp cha  |
| Quan hệ      | Cùng một lớp                                  | Giữa lớp cha và lớp con             |
| Tham số      | Khác nhau (số lượng, kiểu...)                 | Giống hệt                           |
| Tính đa hình | Đa hình *biên dịch* (compile-time)            | Đa hình *thời gian chạy* (run-time) |

Ví dụ Overloading:
    public class Maytinh{
        public int cong (int a, int b){
            return a + b;
        }
        public double cong(double a, double b){
            return a + b;
        } 
    }

Ví dụ Overriding:
    class DongVat{
        public void keu(){
            system.out.println("Dong vat keu");
        }
    }

    class Meo extends DongVat{
        @Override
        public void keu(){
            system.out.println("meo meo");
        }
    }    