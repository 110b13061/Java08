import java.util.*;
public class class07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==0) {		
			System.out.println("此數為0");
		}
		else if(a%2!=0){
			System.out.println("此數為奇數");
		}
		else if(a%2==0){
			System.out.println("此數為偶數");
		}

        sc.close();
    }
}
