
public class LogicCodingBat1 {

	//cigarParty

	public boolean cigarParty(int cigars, boolean isWeekend) {
		  if ( isWeekend && cigars>40)
		  {
		    return true;
		  }
		  else if(cigars>39 && cigars<61)
		  {
		    return true;
		  }
		    else 
		    {
		      return false;
		    }
		}
	
	
	//dateFashion
	
	public int dateFashion(int you, int date) {
		  if (you<3 || date<3) 
		  {
		    return 0;
		  } 
		  else if (you>7 || date>7) 
		  {
		    return 2;
		  } 
		  else 
		  {
		    return 1;
		  }
		}

	//squirrelPlay

	public boolean squirrelPlay(int temp, boolean isSummer) {
		 
		  if (temp>59 && temp<91) 
		  {
		    return true;
		  } 
		  else if (isSummer && (temp<101&&temp>59)) 
		  {
		    return true;
		  } 
		  else 
		  {
		    return false;
		  }

		}

	//caughtSpeeding
	
	public int caughtSpeeding(int speed, boolean isBirthday) {
		  if (isBirthday)
		  {
		    speed-=5;
		  }
		  if (speed<61) 
		  {
		    return 0;
		  } 
		  else if (speed>61 && speed<81) 
		  {
		    return 1;
		  } 
		    else if(speed>81)
		  {
		    return 2;
		  }
		  else 
		  {
		    return 0;
		  }
		}
	
	
	//sortaSum
	
	public int sortaSum(int a, int b) {
		  if (a+b<10 || a+b>19)
		  {
		    return (a+b);
		  }
		    else
		    {
		      return 20;
		    }
		}

	
}
