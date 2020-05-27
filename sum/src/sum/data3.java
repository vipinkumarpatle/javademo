package sum;

public class data3 {
	public static void main1(String args[])
	{
		 int i, j; 
		  
	        int n = 0;
			// outer loop to handle number of rows 
	        //  n in this case 
	        for(i=0; i<n; i++) 
	        { 
	  
	            //  inner loop to handle number of columns 
	            //  values changing acc. to outer loop     
	            for(j=0; j<=i; j++) 
	            { 
	                // printing stars 
	                System.out.print("* "); 
	            } 
	  
	            // ending line after each row 
	            System.out.println(); 
	        } 
	   } 
	  
	    // Driver Function 
	    public static void main(String args[]) 
	    { 
	        int n = 5; 
	        printStars(n); 
	    }

		private static void printStars(int n) {
			// TODO Auto-generated method stub
			
		} 
	
	}


