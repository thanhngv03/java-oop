package heThongDatXe;

public class DatXe {
    public static void main(String[] args) {
        XeOTo xeOto = new XeOTo("BMW","Xanh");
        XeMay xeMay = new XeMay("Wave","Đen");

         System.out.println("\n=== Thông tin Xe Ô Tô ===");
         xeOto.hienThiThongTin();
         xeOto.khoiDong();
         xeOto.tangToc(50);
         xeOto.dungLai();

         System.out.println("\n=== Thông tin Xe Máy ===");
         xeMay.hienThiThongTin();
         xeMay.khoiDong();
         xeMay.tangToc(20);
         xeMay.dungLai();
    }
}