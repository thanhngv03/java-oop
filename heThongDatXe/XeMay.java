package heThongDatXe;

public class XeMay implements PhuongTienGiaoThong {
    private String tenXeMay;
    private String mauXeMay;
    private int tocDoHienTai = 0;

    public XeMay(String tenXeMay, String mauXeMay){
        this.tenXeMay = tenXeMay;
        this.mauXeMay = mauXeMay;
    }

    @Override
    public void khoiDong(){
        System.out.println("Xe máy " + tenXeMay + " nổ máy. ");
    }

    @Override
    public void tangToc(int tocDoThem) {
        tocDoHienTai += tocDoThem;
        System.out.println("Xe máy " + tenXeMay + " vặn ga. Tốc độ: "+ tocDoHienTai + " km/h");
    }

    @Override
    public void dungLai(){
        tocDoHienTai = 0;
        System.out.println("Xe máy " + tenXeMay + " đã dừng lại.");
    }
    
}
