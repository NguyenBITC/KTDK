import java.util.ArrayList;
import java.util.Scanner;

public class QLNL {
      Scanner sc = new Scanner(System.in);
    ArrayList<Person> list = new ArrayList<>();
     public void them(){
        System.out.print("Nhap ten: ");
       String ten =  sc.nextLine();
         System.out.print("Nhap tuoi: ");
       int tuoi = sc.nextInt(); 
       if (tuoi >= 0 && tuoi < 18 ) {
        System.out.println("khong du tuoi, vui long nhap lai");
        return; 
        
        }
       sc.nextLine();
        System.out.print(" Nhap gioi tinh: ");
        String gioitinh = sc.nextLine();
       
       Person person1 = new Person(ten, tuoi, gioitinh);
        list.add(person1);
        int count = 0;
        count++;
     }
     public boolean timkiemtheohoten(String hoten) {
        for (Person person : list) {
            if (person.getHoten().equals(hoten)) {
                System.out.println("Nguoi duoc tim thay: " + person.getHoten());
                return true;
            }
        }
        System.out.println("Khong tim thay");
        return false;
    }
     public void hienthi(){
        for (Person person : list) {
            
            System.out.println("Ten:"+ person.getHoten());
            System.out.println("Tuoi: "+ person.getTuoi());
            System.out.println("Gioi tinh: "+ person.getGioitinh());
        }
        
     }
}
