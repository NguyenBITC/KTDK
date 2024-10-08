import java.util.Scanner;

public class Control {
    QLNL qlnl = new QLNL();
    public void Controller(){
        while (true) {
            System.out.println("Ban muon thuc hien chuc nang gi");
            System.out.println("1: Them nguoi moi");
            System.out.println("2: Tim kiem Ho Ten");
            System.out.println("3: Hien thi thong tin");
            System.out.println("4: Dung chuong trinh");
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();
            switch (option) {
                case "1":
                    qlnl.them();
                    break;
                case "2": 
                    System.out.println("Nhap ten nguoi can tim: ");
                    String idcantim = sc.nextLine();
                    qlnl.timkiemtheohoten(idcantim);
                    break;
                case "3":
                    qlnl.hienthi();
                    break;
                case "4":
                    break;
                default:
                    break;
                
            }
        }
    }
}
