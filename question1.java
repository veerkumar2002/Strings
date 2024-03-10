import java.util.Scanner;
public class question1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String str = sc.nextLine();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        System.out.println("count of vowels is:" + count);
    }
}