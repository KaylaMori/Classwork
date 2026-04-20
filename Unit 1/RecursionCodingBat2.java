
public class RecursionCodingBat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//Triangle 
	
	public int triangle(int rows) {
		   if (rows==0)
		  {
		    return 0;
		  }
		  else
		  {
		    return rows+triangle(rows-1);
		  }
		}

	//sumDigits
	
	public int sumDigits(int n) {
		   if (n==0)
		  {
		    return 0;
		  }
		  else
		  {
		    return (n%10) + sumDigits(n/10);
		  }

		}
	
	//powerN
	
	public int powerN(int base, int n) {
		   if (n==0)
		  {
		    return 1;
		  }
		  else
		  {
		    return base * powerN(base, n-1);
		  }
		}
}
