package quanLiThongTinSachTrongThuVien.Sach;

public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    //Constructor khong tham số
    public Sach(){
    }

    //Constructor có tham số
    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan= namXuatBan;
        this.soLuong=soLuong;
    }

    //Tao getter va setter
    public String getmaSach(){
        return maSach;
    }

    public void setmaSach(String maSach) {
        this.maSach = maSach;
    }

    public String gettenSach (){
        return tenSach;
    }

    public void settenSach(String tenSach){
        this.tenSach= tenSach;
    }

    public String gettacGia(){
        return tacGia;
    }
    public void settacGia(String tacGia){
        this.tacGia= tacGia;
    }

    public int getnamXuatBan(){
        return namXuatBan;
    }
    public void setnamXuatBan(int namXuatBan){
        this.namXuatBan = namXuatBan;
    }

    public int getsoLuong(){
        return soLuong;
    }
    public void setsoLuong(int soLuong){
        this.soLuong = soLuong;
    }

    //Phuong thuc hien thi thong tin
    public void hienThiThongTin(){
        System.out.println("Ma sach:" + maSach);
        System.out.println("Ten sach:" + tenSach);
        System.out.println("Tac gia:" + tacGia);
        System.out.println("Nam xuat ban:" + namXuatBan);
        System.out.println("So luong:" + soLuong);
    }
    
}

