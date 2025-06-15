package quanLiThongTinSachTrongThuVien.Sach;

public class ThuVien {
    public static void main(String[] args) {
        Sach sach1= new Sach("S001", "Lap trinh Java co ban", "Nguyen Van A", 2009, 3);
        Sach sach2= new Sach("S002", "Lap trinh Java Nang cao", "Nguyen Van A", 2010, 5);
 
    
    //Hien thi thong tin doi tuong sach o tren
        System.out.println("- Thong tin sach 1: ");
        sach1.hienThiThongTin();
        System.out.println("- Thong tin sach 2: ");
        sach2.hienThiThongTin();

    //Cap nhat so luong sach tang len 5
        sach1.setsoLuong(sach1.getsoLuong() + 5);
    
    //Hien thi lai thong tin sach sau cap nhat
        System.out.println("Hien thi thong tin sau cap nhat cua sach 1");
        sach1.hienThiThongTin();
   }
}
