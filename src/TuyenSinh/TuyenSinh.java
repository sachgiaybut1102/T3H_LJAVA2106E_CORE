package TuyenSinh;

import java.util.Scanner;

public class TuyenSinh {
    private ThiSinh[] thiSinhs;
    private int n;
    private int currentIndex;
    private Scanner sc;

    public TuyenSinh() {
        sc = new Scanner(System.in);
    }

    public void run() {
        initThiSinhs();

        while (true) {
            int selector;
            boolean flag;

            do {
                flag = true;
                System.out.println("-------Chuc nang chinh cua he thong--------|");
                System.out.println("-------------------------------------------|");
                System.out.println("1. Them thi sinh                           |");
                System.out.println("2. Tim kiem thong tin theo so bao danh     |");
                System.out.println("3. Hien thi thong tin ve danh sach thi sinh|");
                System.out.println("4. Thoat khoi chuong trinh                 |");
                System.out.println("-------------------------------------------|");
                System.out.print("Lua chon chuc nang: ");
                selector = sc.nextInt();

                if (!(1 <= selector && selector <= 3)) {
                    System.out.println("Lua chon khong phu hop, vui long nhap lai!");
                    flag = false;
                }
            } while (!flag);


            switch (selector) {
                case 1:
                    if (currentIndex < thiSinhs.length) {
                        addThiSinh();
                    } else {
                        System.out.println("So luong thi sinh trong danh sach da day, khong the them duoc nua!");
                    }
                    break;
                case 2:
                    findBySoBaoDanh();
                    break;
                case 3:
                    showThiSinhs();
                    break;
                case 4:
                    return;
            }
        }
    }

    public void initThiSinhs() {
        boolean flag;

        do {
            flag = true;

            System.out.print("Nhap vao so luong thi sinh: ");
            n = sc.nextInt();

            if (!(0 < n && n <= 100)) {
                System.out.println("So luong thi sinh phai nam trong khoan 0 < n <= 100, vui long nhap lai!");
                flag = false;
            }

        } while (!flag);

        thiSinhs = new ThiSinh[n];
        currentIndex = 0;
    }

    public void addThiSinh() {
        int selector;
        boolean flag;

        do {
            flag = true;
            System.out.println("---------------Them can bo---------------|");
            System.out.println("-----------------------------------------|");
            System.out.println("1. Khoi A                                |");
            System.out.println("2. Khoi B                                |");
            System.out.println("3. Khoi C                                |");
            System.out.println("-----------------------------------------|");
            System.out.print("Lua chon loai thi sinh can them moi: ");
            selector = sc.nextInt();

            if (!(1 <= selector && selector <= 3)) {
                System.out.println("Lua chon khong phu hop, vui long nhap lai!");
                flag = false;
            }
        } while (!flag);

        ThiSinh thiSinh = initThiSinh();

        switch (selector) {
            case 1:
                thiSinh = new ThiSinhThiKhoiA(thiSinh.soBaoDanh, thiSinh.hoTen,
                        thiSinh.diaChi, thiSinh.mucUuTien, inputDiem("toan"), inputDiem("ly"),
                        inputDiem("hoa"));
                break;
            case 2:
                thiSinh = new ThiSinhThiKhoiB(thiSinh.soBaoDanh, thiSinh.hoTen,
                        thiSinh.diaChi, thiSinh.mucUuTien, inputDiem("toan"), inputDiem("hoa"),
                        inputDiem("sinh"));
                break;
            case 3:
                thiSinh = new ThiSinhThiKhoiA(thiSinh.soBaoDanh, thiSinh.hoTen,
                        thiSinh.diaChi, thiSinh.mucUuTien, inputDiem("van"), inputDiem("su"),
                        inputDiem("dia"));
                break;
        }

        thiSinhs[currentIndex] = thiSinh;
        currentIndex++;
    }

    private ThiSinh initThiSinh() {
        ThiSinh thiSinh = new ThiSinh();

        System.out.print("So bao danh: ");
        sc.nextLine();
        thiSinh.soBaoDanh = sc.nextLine();
        System.out.print("Ho ten: ");
        thiSinh.hoTen = sc.nextLine();
        System.out.print("Dia chi: ");
        thiSinh.diaChi = sc.nextLine();

        return thiSinh;
    }

    private void findBySoBaoDanh() {
        System.out.print("Nhap vao so bao danh can tim kiem: ");
        sc.nextLine();
        String soBaoDanh = sc.nextLine();

        for (int i = 0; i < currentIndex; i++) {
            if (thiSinhs[i].soBaoDanh.toLowerCase().equals(soBaoDanh.toLowerCase())) {
                System.out.println("Thong tin sinh vien thu " + (i + 1) + ":");
                thiSinhs[i].show();
            }
        }
    }

    private void showThiSinhs() {
        System.out.println("Danh sach thong tin sinh vien la:");
        for (int i = 0; i < currentIndex; i++) {
            System.out.println("Thong tin sinh vien thu " + (i + 1) + ":");
            thiSinhs[i].show();
        }
    }

    private float inputDiem(String tenMonThi) {
        boolean flag;
        float diemThi;

        do {
            flag = true;

            System.out.print("Nhap vao diem thi mon " + tenMonThi + ": ");
            diemThi = sc.nextInt();

            if (!(0 <= diemThi && diemThi <= 10)) {
                System.out.println("Diem thi phai trong khoang 0 đen 10, vui long nhap lai!");
                flag = false;
            }
        } while (!flag);

        return diemThi;
    }
}
