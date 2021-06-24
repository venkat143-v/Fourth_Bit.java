public class Fourth_Bit {
	public static void main(String[] args) {
		int num =77;
		// write code here
		int c =0;
		while(num != 0)
		{
			int r = num%2;   //  r = 1
			num = num/2; // num = 11
			c=c+1;
			if(c==4)
				System.out.println(r);
		}
}}