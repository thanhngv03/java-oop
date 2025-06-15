package quanLiNhanVien;

public class vdStatic {
    class SinhVien {
    private String ten;
    public static int soLuong = 0; // biến static

    public SinhVien(String ten) {
        this.ten = ten;
        soLuong++;
    }

    public static void hienThiSoLuong() {
        System.out.println("Tổng số sinh viên: " + soLuong);
    }
}

public class DemoStatic {
    public static void main(String[] args) {
        new SinhVien("Nam");
        new SinhVien("Linh");
        SinhVien.hienThiSoLuong(); // gọi phương thức static
    }
}

}

