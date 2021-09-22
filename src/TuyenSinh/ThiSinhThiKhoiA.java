package TuyenSinh;

public class ThiSinhThiKhoiA extends ThiSinh {
    private float dToan;
    private float dLy;
    private float dHoa;

    public ThiSinhThiKhoiA() {
    }

    public ThiSinhThiKhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien, float dToan, float dLy, float dHoa) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
        this.dToan = dToan;
        this.dLy = dLy;
        this.dHoa = dHoa;
    }

    public float getdToan() {
        return dToan;
    }

    public void setdToan(float dToan) {
        this.dToan = dToan;
    }

    public float getdLy() {
        return dLy;
    }

    public void setdLy(float dLy) {
        this.dLy = dLy;
    }

    public float getdHoa() {
        return dHoa;
    }

    public void setdHoa(float dHoa) {
        this.dHoa = dHoa;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Diem toan: " + dToan);
        System.out.println("Diem ly: " + dLy);
        System.out.println("Diem hoa: " + dHoa);
    }
}
