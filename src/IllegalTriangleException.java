import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        System.out.println("Hãy nhập z: ");
        int z = scanner.nextInt();
        IllegalTriangleException iLT = new IllegalTriangleException();
        iLT.caculate(x, y, z);
        System.out.println("Tam giá hợp lệ");
    }

    private void caculate(int x, int y, int z){
        try {
            if (x <= 0 || y <= 0 || z <= 0) {
                System.out.println("Số nhập vào phải lớn hơn 0");
            }
            if (x + y <= z || x + z <= y || y + z <= x) {
                System.out.println("Tổng của hai cạnh phải lớn hơn cạnh còn lại");
            }
        } catch (Exception e) {
            System.out.println("Tam giác hợp lệ");
        }
    }
}
