package webadv.s99201105.p02;

/**
 * Hello world!
 *
 */
import org.apache.commons.codec.digest.DigestUtils;
import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException{

        String username ,pwd;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号：");
        username = sc.nextLine();
        System.out.println("请输入密码：");
        pwd = sc.nextLine();

        FileReader fr = new FileReader("D://2.txt");
        BufferedReader br = new BufferedReader(fr);
        String inputName = br.readLine();
        String inputPwd = br.readLine();
        br.close();
        fr.close();

        if (username.equals(inputName)&&sha256hex(pwd).equals(inputPwd)){
            System.out.println("登录成功！");
        }else {
            System.out.println("登录失败！");
        }
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}

