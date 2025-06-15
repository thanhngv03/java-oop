package quanLiCacLoaiHinhHoc;

public class HinhTron extends HinhHoc {
    private double banKinh;

    //Constructor khởi tạo màu sắc và bán kính:
    public HinhTron(String mauSac, double banKinh){
        super(mauSac);
        this.banKinh = banKinh;
    }

    @Override
    public double tinhDienTich(){
        return Math.PI * banKinh * banKinh; // Công thức tính diện tích hình tròn: S = π * r^2
    }
    
}
