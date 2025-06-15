package quanLiNhanVien;

public class CongTy {
    public static void main(String[] args){
        //Tao một đối tượng nhân viên va Quanly:
        NhanVien nv1 = new NhanVien("NV001","Nguyen Van A", 3000 );
        NhanVien nv2 = new QuanLy("QL001", "Tran Thi B", 5000, 2000);

        // Su dung 1 mang de luu tru:
        NhanVien[] dsNhanVien = { nv1, nv2 };

        for (NhanVien nv : dsNhanVien){
            System.out.println("\nThông tin nhân viên:");
            nv.hienThiThongTin(); // Gọi phương thức hiển thị thông tin của nhân viên
        }
    }
    
}
