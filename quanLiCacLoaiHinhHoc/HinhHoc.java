package quanLiCacLoaiHinhHoc;

public abstract class HinhHoc {
    protected String mauSac;

    //Constructor khởi tạo màu sắc:
    public HinhHoc(String mauSac){
        this.mauSac = mauSac;
    }
    //Phương thức trừu tượng để tính diện tích:
    public abstract double tinhDienTich();

    public void hienThiMauSac(){
        System.out.println("Màu sắc của hình học này là: " + mauSac);
    }

}
