import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float length, width;
        Scanner sc = new Scanner(System.in);
        length = sc.nextFloat();
        width = sc.nextFloat();
        System.out.println("area is "+length*width);
        sc.close();
    }
}
