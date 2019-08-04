import java.util.*;
public class Generator{static int g=0; 
public static void main(String[] args) {

    System,out.println(genpass(new 
    Scanner(System.in).nextInt()));

}

    static String genpass(int line) {
        String
    }
ps = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*abcdefghijklmnopqrstuvwxyz";
return (line>g++)?ps.charAt(new Random().nextInt(68))+genpass(line):"";
}