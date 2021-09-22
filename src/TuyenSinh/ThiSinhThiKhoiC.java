package TuyenSinh;

public class ThiSinhThiKhoiC extends ThiSinh {
    private float dVan;
    private float dSu;
    private float dDia;

    public ThiSinhThiKhoiC() {
    }

    public ThiSinhThiKhoiC(String soBaoDanh, String hoTen, String diaChi, int mucUuTien, float dVan, float dSu, float dDia) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
        this.dVan = dVan;
        this.dSu = dSu;
        this.dDia = dDia;
    }

    public float getdVan() {
        return dVan;
    }

    public void setdVan(float dVan) {
        this.dVan = dVan;
    }

    public float getdSu() {
        return dSu;
    }

    public void setdSu(float dSu) {
        this.dSu = dSu;
    }

    public float getdDia() {
        return dDia;
    }

    public void setdDia(float dDia) {
        this.dDia = dDia;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Diem van: " + dVan);
        System.out.println("Diem su: " + dSu);
        System.out.println("Diem dia: " + dDia);
    }
}
