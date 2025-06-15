Lớp trừu tượng vs Giao diện (abstract class vs interface)

| Tiêu chí      | **Lớp trừu tượng (abstract class)**              | **Giao diện (interface)**                                                                |
| ------------- | ------------------------------------------------ | ---------------------------------------------------------------------------------------- |
| Từ khóa       | `abstract`                                       | `interface`                                                                              |
| Kế thừa       | Chỉ được kế thừa **một lớp trừu tượng**          | Có thể **implements nhiều interface**                                                    |
| Thành phần    | Có thể có **thuộc tính**, **phương thức cụ thể** | Chỉ chứa **hằng số** và **phương thức abstract** (từ Java 8+ có default, static methods) |
| Mục đích      | Dùng khi các lớp có quan hệ **"is-a"** chung     | Dùng để mô tả **hành vi chung** mà không cần quan hệ kế thừa                             |



Khi nào nên sử dụng mỗi loại?
-Lớp trừu tượng (abstract class): Khi có logic chung cần chia sẻ giữa các lớp con
-Giao diện (interface): Khi nhiều lớp khác nhau cần triển khai cùng hành vi    