import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Scanner;

public class BCryptEncoder {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder= new BCryptPasswordEncoder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your string here:");
        String s = sc.nextLine();
        System.out.println(encoder.encode(s));
    }
}
