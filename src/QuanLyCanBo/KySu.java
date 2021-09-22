package QuanLyCanBo;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String hoTen, int tuoi, boolean gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Nganh dao tao: " + nganhDaoTao);
    }
}
