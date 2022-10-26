package pattern;

public class q1Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=12;
	for(int i=0;i<n;i++) {
		//for letter I
		for(int j=0;j<n;j++) {
			if( (j==(n-1)/4 ) ||
				(i==0 && j<(n-1)/2) ||
				(i==(n-1) && j<(n-1)/2)
					
					) 
			
			{
				System.out.print("#");
			}
			else {
				System.out.print(" ");
			}
		}
			//For space
			for(int j=0;j<n/4;j++) {  //To increase space between two letters.
				System.out.print("");
			}
			//for letter N
			for(int j=0;j<n;j++) {
				if(  (j==0) ||
					 (j==(n-1))||
					 (i==j)
						)
				{
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
			}
			//for space
			for(int j=0;j<n/4;j++) {  //To increase space between two letters.
				System.out.print("  ");
			}
			
			//for letter E
			for(int j=0; j<n; j++) {
				if( (j==0) ||
					(i==0 && j<(3*n-1)/4) ||
					(i==(n-1)/2 && j<(3*n-1)/4)||
					(i==(n-1)&& j<(3*n-1)/4) )
				   
				{
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
				
			}
			//for space
			for(int j=0;j<n/4;j++) {  //To increase space between two letters.
				System.out.print("");
			}
			//for letter U
			for(int j=0;j<n;j++) {
				if( j==0 && i<(n-1) ||
					( j==(3*n-1)/4 && i<(n-1))||
					(i==(n-1) && j>0 && j<(3*n-1)/4)
						
						) 
				
				{
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
			}
			//for space
			for(int j=0;j<n/4;j++) {  //To increase space between two letters.
				System.out.print(" ");
			}
			// for letter R
			for(int j=0;j<n;j++) {
					
				if(   (i==0 && j>0 && j<(3*n-1)/4    ) ||
						  (j==0   && i>0                 ) ||
						  ( i==(n-1)/2  && j<(3*n-1)/4      ) ||
						  ( j==(3*n-1)/4 && i>0 &&i<(n-1)/2  ) ||
						  (    i-j==(n-1)/3 && i>(n-1)/2 )
						  )
				{
					System.out.print("#");
				}
				else
					{
						System.out.print(" ");
					}
				
			}
			//for space
			for(int j=0;j<n/4;j++) {  //To increase space between two letters.
				System.out.print(" ");
			} 
			//for letter O
			for(int j=0;j<n;j++) {
				if(  (i==0 && j<3*(n-1)/4 ) &&(j>0)||
				     (j==0 && i>0 && i<(n-1)) ||
				     (i==(n-1)&& j<(3*n-1)/4)&& j>0||
				     (j==(3*n-1)/4)&& i<(n-1) && i>0)
				{
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
			}
			//for space
			for(int j=0;j<n/4;j++) {  //To increase space between two letters.
				System.out.print(" ");
			} 
			//for letter N
			for(int j=0;j<n;j++) {
				if(  (j==0) ||
					 (j==(n-1))||
					 (i==j)
						)
				{
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
			}			
		System.out.println();				
		}		
	}
}
