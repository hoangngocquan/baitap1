import java.util.Scanner;
//inport: thu vien
//java.util.Scanner cung cấp chức năng nhập dữ liệu từ bàn phím.
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();

        // Chuyển đổi chuỗi sang chữ hoa
        String chuoiVietHoa = chuoi.toUpperCase();

        // In ra chuỗi viết hoa
        System.out.println("Chuỗi viết hoa: " + chuoiVietHoa);
    }
}
