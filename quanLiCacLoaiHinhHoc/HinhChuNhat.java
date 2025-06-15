package quanLiCacLoaiHinhHoc;

public class HinhChuNhat extends HinhHoc {
    private double chieuDai;
    private double chieuRong;

    //Constructor khởi tạo màu sắc, chiều dài và chiều rộng:
    public HinhChuNhat(String mauSac, double chieuDai, double chieuRong){
    super(mauSac);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich(){
        return chieuDai * chieuRong; // Công thức tính diện tích hình chữ nhật: S = chiều dài * chiều rộng

    }
}
