package TuyenSinh;

public class ThiSinhThiKhoiB extends ThiSinh{
    private float dToan;
    private float dHoa;
    private float dSinh;

    public ThiSinhThiKhoiB() {
    }

    public ThiSinhThiKhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien, float dToan, float dHoa, float dSinh) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
        this.dToan = dToan;
        this.dHoa = dHoa;
        this.dSinh = dSinh;
    }

    public float getdToan() {
        return dToan;
    }

    public void setdToan(float dToan) {
        this.dToan = dToan;
    }

    public float getdHoa() {
        return dHoa;
    }

    public void setdHoa(float dHoa) {
        this.dHoa = dHoa;
    }

    public float getdSinh() {
        return dSinh;
    }

    public void setdSinh(float dSinh) {
        this.dSinh = dSinh;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Diem toan: " + dToan);
        System.out.println("Diem hoa: " + dHoa);
        System.out.println("Diem sinh: " + dSinh);
    }
}
