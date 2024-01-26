import java.util.*;
public class question_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		
		//1 + (1 + 2) + (1+ 2 +3) ..... + (1 + 2 + 3 + .... + n)
		
		int n = sc.nextInt();
		int sum=0;
		for(int a=1;a<=n;a++) {
			for(int b=1;b<=a;b++) {
				sum = sum + b;
			}
		}
		System.out.println("Sum of the series "+sum);
	}

}

