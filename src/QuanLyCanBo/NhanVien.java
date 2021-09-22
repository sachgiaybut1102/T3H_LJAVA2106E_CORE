package QuanLyCanBo;

public class NhanVien extends CanBo {
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int tuoi, boolean gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Cong viec: " + congViec);
    }
}
