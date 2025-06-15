package heThongDatXe;

public class XeOTo implements PhuongTienGiaoThong {
    private String tenXe;
    private String mauXe;
    private int tocDoHienTai = 0;
    
    public XeOTo(String tenXe, String mauXe){
        this.tenXe = tenXe;
        this.mauXe = mauXe;
    }

    @Override
    public void khoiDong(){
        System.out.println("Xe Oto " + tenXe + " màu " + mauXe + " đã khởi động.");
    }

    @Override
    public void tangToc (int tocDoThem) {
        tocDoHienTai += tocDoThem; // Tăng tốc độ thêm 20 km/h
        System.out.println("Xe Oto " + tenXe + " Tăng tốc. Tốc độ hiện tại: " + tocDoHienTai + " km/h");
    }

    @Override
    public void dungLai(){
        tocDoHienTai = 0;
        System.out.println("Xe Oto" + tenXe + " đã dừng lại.");
    }

    public void hienThiThongTin(){
        System.out.println("Tên xe:"+ tenXe +", Màu xe: "+ mauXe);
    }

}
