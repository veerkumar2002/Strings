import java.util.Arrays;
import java.util.Scanner;
public class anagambrute {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if(s1.length()!= s2.length()){
            System.out.println(false);

        }else{
            char s1char[]=s1.toCharArray();
            Arrays.sort(s1char);
            
            char s2char[]=s2.toCharArray();
            Arrays.sort(s2char);

            int flag=0;
            for(int i=0;i<s1.length();i++){
                if(s1char[i] != s2char[i]){
                    flag =1;break;
                }
            }
            if(flag == 0){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }

        }
    }
    
}
