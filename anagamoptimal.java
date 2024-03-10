import java.util.Arrays;
import java.util.Scanner;
public class anagamoptimal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();//aabbcc
        String s2 = sc.next();//abcabc

        int f1[]= new int[128];
        int f2[]= new int[128];

        for(int i=0;i<s1.length();i++){
            f1[s1.charAt(i)]++;
        }
        for(int i =0;i<s2.length();i++){
            f2[s2.charAt(i)]++;
        }
        int flag = 0;
        for(int i=0;i<128;i++){
            if(f1[i] != f2[i]){
                flag = 1;
                break;
            }
        }
        if(flag ==0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }

    
}
