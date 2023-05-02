import java.util.*;

public class A1113363_0421_1{
    public static void main(String[] argv){
        Scanner sc = new Scanner(System.in);

        System.out.println("請輸入電子信箱");
        String email = sc.nextLine();

        if(email.matches("[a-z]+@[a-z.]+")){
            System.out.println("正確");
        }else{
            System.out.println("錯誤");
        }
    }
}
