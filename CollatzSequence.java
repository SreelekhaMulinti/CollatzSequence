import java.util.*;
public class CollatzSequence{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int operations = 0;
		while(num != 1){
			System.out.print(num+" ");
			//If num is even, num = num/2
			if((num&1) == 0){
				num = num/2;
			} 
			//if num is odd,num = (3*num+1)
			else{
				num = 3*num+1;
			}
			operations++;
		}
		System.out.print(num+" "+operations);
	}
}
