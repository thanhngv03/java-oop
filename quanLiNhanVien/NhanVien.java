package quanLiNhanVien;

public class NhanVien {
    private String maNhanVien;
    private String hoTen;
    private double luongCoBan;

    //Constructor khởi tạo các thuộc tính:
    public NhanVien(String maNhanVien, String hoTen, double luongCoBan){
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
    }
    
    public String getmaNhanVien(){
        return maNhanVien;
    }

    public String gethoTen(){
        return hoTen;
    }

    public double getluongCoBan(){
        return luongCoBan;
    }

    public double tinhLuong(){
        return luongCoBan; // Phương thức này có thể được ghi đè trong các lớp con để tính lương cụ thể
    }

    public void hienThiThongTin(){
        System.out.println("Mã nhân viên: " + maNhanVien);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Lương cơ bản: " + luongCoBan);
    }
   
}