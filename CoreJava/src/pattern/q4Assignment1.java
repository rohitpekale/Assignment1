package pattern;

public class q4Assignment1 {

	public static void main(String[] args) {
		int n=21;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==(n-1) ||
				   (i-j>=(n-1)/2)  ||
					
				  i+j>=(3*n-1)/2
					)
				{
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
