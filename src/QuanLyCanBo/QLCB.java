package QuanLyCanBo;

import java.util.Locale;
import java.util.Scanner;

public class QLCB {
    private CanBo[] canBos;
    private int n;
    private int currentIndex;
    private Scanner sc;

    public QLCB() {
        sc = new Scanner(System.in);
    }

    public void run() {
        initCanBos();

        while (true) {
            int selector;
            boolean flag;

            do {
                flag = true;
                System.out.println("-------Chuc nang chinh cua he thong------|");
                System.out.println("-----------------------------------------|");
                System.out.println("1. Them can bo                           |");
                System.out.println("2. Tim kiem thong tin theo ho ten        |");
                System.out.println("3. Hien thi thong tin ve danh sach can bo|");
                System.out.println("4. Thoat khoi chuong trinh               |");
                System.out.println("-----------------------------------------|");
                System.out.print("Lua chon chuc nang: ");
                selector = sc.nextInt();

                if (!(1 <= selector && selector <= 3)) {
                    System.out.println("Lua chon khong phu hop, vui long nhap lai!");
                    flag = false;
                }
            } while (!flag);



            switch (selector) {
                case 1:
                    if (currentIndex < canBos.length) {
                        addCanBo();
                    } else {
                        System.out.println("So luong can bo trong danh sach da day, khong the them duoc nua!");
                    }
                    break;
                case 2:
                    findByHoTen();
                    break;
                case 3:
                    showCanBos();
                    break;
                case 4:
                    return;
            }
        }
    }

    public void initCanBos() {
        boolean flag;

        do {
            flag = true;

            System.out.print("Nhap vao so luong can bo: ");
            n = sc.nextInt();

            if (!(0 < n && n <= 100)) {
                System.out.println("So luong can bo phai nam trong khoan 0 < n <= 100, vui long nhap lai!");
                flag = false;
            }

        } while (!flag);

        canBos = new CanBo[n];
        currentIndex = 0;
    }

    public void addCanBo() {
        int selector;
        boolean flag;

        do {
            flag = true;
            System.out.println("---------------Them can bo---------------|");
            System.out.println("-----------------------------------------|");
            System.out.println("1. Cong nhan                             |");
            System.out.println("2. Ky su                                 |");
            System.out.println("3. Nhan vien                             |");
            System.out.println("-----------------------------------------|");
            System.out.print("Lua chon loai can bo can them moi: ");
            selector = sc.nextInt();

            if (!(1 <= selector && selector <= 3)) {
                System.out.println("Lua chon khong phu hop, vui long nhap lai!");
                flag = false;
            }
        } while (!flag);

        CanBo canBo = initCanBo();

        switch (selector) {
            case 1:
                int bac;

                do {
                    flag = true;

                    System.out.print("Bac: ");
                    bac = sc.nextInt();

                    if (!(1 <= bac && bac <= 10)) {
                        System.out.println("So bac phai nam trong khoang 1 đen 10, vui long nhap lai!");
                        flag = false;
                    }
                } while (!flag);

                canBo = new CongNhan(canBo.hoTen, canBo.tuoi, canBo.gioiTinh, canBo.diaChi, bac);
                break;
            case 2:
                System.out.print("Nganh dao tao: ");
                String nganhDaoTao = sc.nextLine();

                canBo = new KySu(canBo.hoTen, canBo.tuoi, canBo.gioiTinh, canBo.diaChi, nganhDaoTao);
                break;
            case 3:
                System.out.print("Cong viec: ");
                String congViec = sc.nextLine();

                canBo = new NhanVien(canBo.hoTen, canBo.tuoi, canBo.gioiTinh, canBo.diaChi, congViec);
                break;
        }

        canBos[currentIndex] = canBo;
        currentIndex++;
    }

    private CanBo initCanBo() {
        CanBo canBo = new CanBo();

        System.out.print("Ho ten: ");
        sc.nextLine();
        canBo.hoTen = sc.nextLine();
        System.out.print("Tuoi: ");
        canBo.tuoi = sc.nextInt();
        System.out.print("Gioi tinh: ");
        sc.nextLine();
        String gioiTinh = sc.nextLine();
        canBo.gioiTinh = gioiTinh.equals("nam") ? true : false;
        System.out.print("Dia chi: ");
        canBo.diaChi = sc.nextLine();

        return canBo;
    }

    private void findByHoTen() {
        System.out.print("Nhap vao ho ten can tim kiem: ");
        sc.nextLine();
        String hoTen = sc.nextLine();

        int selector;
        boolean flag;

        do {
            flag = true;

            System.out.println("1. Tim kiem theo ten chinh xac");
            System.out.println("2. Tim kiem theo ten gan dung");

            System.out.print("Lua chon cach tim: ");
            selector = sc.nextInt();

            if (!(1 <= selector && selector <= 2)) {
                System.out.println("Lua chon khong phu hop, vui long nhap lai!");
                flag = false;
            }
        } while (!flag);

        switch (selector) {
            case 1:
                for (int i = 0; i < currentIndex; i++) {
                    if (canBos[i].getHoTen().equals(hoTen)) {
                        System.out.println("Thong tin can bo thu " + i + ":");
                        canBos[i].show();
                    }
                }
                break;
            case 2:
                for (int i = 0; i < currentIndex; i++) {
                    if (canBos[i].getHoTen().toLowerCase().contains(hoTen.toLowerCase())) {
                        System.out.println("Thong tin can bo thu " + i + ":");
                        canBos[i].show();
                    }
                }
                break;
        }
    }

    private void showCanBos() {
        System.out.println("Danh sach thong tin cac can bo la:");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println("Thong tin can bo thu " + i + ":");
            canBos[i].show();
        }
    }
}
