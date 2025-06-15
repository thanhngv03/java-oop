package quanLiNhanVien;

public class QuanLy extends NhanVien {
    private double phuCapChucVu;

    //Constructor để khởi tạo các thuộc tính của NhanVien và phuCapChucVu. 
    public QuanLy(String maNhanVien, String hoTen, double luongCoBan, double phuCapChucVu){
        super(maNhanVien,hoTen,luongCoBan);
        this.phuCapChucVu = phuCapChucVu;
    }

    @Override
    public double tinhLuong(){
        return getluongCoBan() + phuCapChucVu; // Tính lương của nhân viên quản lý bằng lương cơ bản cộng với phụ cấp chức vụ
    }
    
    @Override
    public void hienThiThongTin(){
        super.hienThiThongTin(); //Goi phương thức hienThiThongTin của lớp cha NhanVien
        System.out.println("Phụ cấp chức vụ: " + phuCapChucVu);
    }
}
