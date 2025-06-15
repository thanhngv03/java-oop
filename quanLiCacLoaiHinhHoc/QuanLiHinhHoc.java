package quanLiCacLoaiHinhHoc;

public class QuanLiHinhHoc {
    public static void main(String[] args){

        //Tạo một đối tượng có hình tròn:
        HinhTron hinhTron = new HinhTron("Red", 5.0);
        HinhChuNhat hinhChuNhat = new HinhChuNhat("Xanh", 4.0, 6.0);

        //Hiển thị màu sắc của hình tròn:
        System.out.println("\nHình tròn:");
        hinhTron.hienThiMauSac();
        System.out.println("Diện tích của hình tròn:" + hinhTron.tinhDienTich());

        //Hiển thị màu sắc của hình chữ nhật:
        System.out.println("\nHình chữ nhật:");
        hinhChuNhat.hienThiMauSac();
        System.out.println("Diện tích của hcn: " + hinhChuNhat.tinhDienTich());


    }
    
}
