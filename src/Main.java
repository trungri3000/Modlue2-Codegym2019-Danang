import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String[] students = {"kien", "Hoang", "Dung", "Hung"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten can tim : ");
        String name = scanner.nextLine();
        boolean truename = false;
        for(int i =0 ; i<students.length ;i++) {
            if (students[i].equals(name))
            {
                System.out.println("Ten hoc sinh co trong list la" + name + (i + 1));
                truename = true;
                break;
            }
        }
        if (!truename){
            System.out.println("khong tim thay ten "+ name + "trong list");
        }

    }
}
