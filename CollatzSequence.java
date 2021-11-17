import java.util.*;
public class CollatzSequence{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n != 1){
			System.out.print(n+" ");
			//If n is even, n = n/2
			if((n&1) == 0){
				n = n/2;
			} 
			//if n is odd,n = (3n+1)
			else{
				n = 3*n+1;
			}
		}
		System.out.print(n+" ");
	}
}
