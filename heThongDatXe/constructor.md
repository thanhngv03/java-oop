1. Giải thích vai trò của Constructor trong Java. Phân biệt constructor mặc định (default 
constructor) và constructor có tham số. Có thể nạp chồng constructor không? Vì sao?

* Constructor trong Java:
    - Là một phương thức đặc biệt trong Java,
    - Được gọi tự động khi một đối tượng được tạo,
    - Dùng để khởi tạo giá trị ban đầu cho các thuộc tính của đối tượng.

* Phân biệt constructor mặc định và constructor có tham số:
    - Contructor mặc định(default constructor):
        + Không có tham số
        + Nếu không định nghĩa constructor nào, Java sẽ tự động tạo một constructor mặc định.
    - Constructor có tham số  (Parameterized constructor):
        + Có tham số để gán giá trị cho các thuộc tính ngay khi khởi tạo đối tượng.
       
* Có thể nạp chồng constructor không?
    - Có, 
    - Vì có thể có danh sách tham số khác nhau (số lượng, kiểu dữ liệu)
    - Nên có thể định nghĩa nhiều constructor 
    -        