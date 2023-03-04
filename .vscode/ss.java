import java.io.Console;
import java.util.*;

 class SS {
    public static void main(String[] args) {
        String str; char ch[];
        Console s = System .console();
        System.out.println("enter uername");
        str=s.readLine();
        System.out.println("enter a password");
        ch = s.readPassword();
        String a = String.valueOf(ch);
        System.out.println("username:" +str);
        System.out.println("password:" +a);

    }
}
