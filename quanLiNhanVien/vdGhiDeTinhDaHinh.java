package quanLiNhanVien;

public class vdGhiDeTinhDaHinh {
    class NhanVien {
    public void lamViec() {
        System.out.println("Nhân viên làm việc chung.");
    }
}

class LapTrinhVien extends NhanVien {
    @Override
    public void lamViec() {
        System.out.println("Lập trình viên viết code.");
    }
}

class KeToan extends NhanVien {
    @Override
    public void lamViec() {
        System.out.println("Kế toán xử lý sổ sách.");
    }
}

public class Demo {
    public static void main(String[] args) {
        NhanVien[] ds = {
            new LapTrinhVien(),
            new KeToan()
        };

        for (NhanVien nv : ds) {
            nv.lamViec(); // đa hình: gọi đúng hàm theo đối tượng thực tế
        }
    }
}

    
}
