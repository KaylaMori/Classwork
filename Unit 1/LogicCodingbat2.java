
public class LogicCodingbat2 {

	//alarmClock
	public String alarmClock(int day, boolean vacation) {
		  if (vacation) 
		  {
		    if (day > 0 && day < 6)
		    {
		      return "10:00";
		    }
		    
		      else
		     {
		        return "off";
		      }
		    
		  } 
		  
		  else if (day > 0 && day < 6)
		  {
		    return "7:00";
		  }
		  
		    else
		    {
		      return "10:00";
		    }

		}
	
	
	
	//in1to10
	public boolean in1To10(int n, boolean outsideMode) {
		 if (outsideMode)
		  {
		    if (n<2||n>9)
		    {
		      return true;
		    }
		    
		    else
		    {
		      return false;
		    }
		  }  
		 
		  else if (n>0 && n<11)
		  {
		    return true;
		  }
		    else
		    {
		      return false;
		    }
		 
		}
	
	//old35
	public boolean old35(int n) {
		  if (n%3==0 && n%5==0)
		  {
		    return false;
		  }
		  else if ((n%3==0 || n%5==0) && (n%3==0 || n%5==0))
		  {
		    return true;
		  }

		    else
		    {
		      return false;
		    }
		}
	

}
