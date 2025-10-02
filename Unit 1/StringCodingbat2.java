public class StringCodingbat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//1: makeOutWord
	public String makeOutWord(String out, String word) 
	{
	 String str = word;
	 String sto = out;
	 
	int lengthOfWord = str.length();
	 
	 String inputWord = str.substring (0,lengthOfWord);
	 String firstTwo = sto.substring (0,2);
	 String lastTwo = sto.substring(2,4);

	 String makeOutWord = firstTwo + inputWord  + lastTwo;
	 
	 return makeOutWord;
	}
	
	//2: extraEnd
	public String extraEnd(String str) {
		  int lengthOfString = str.length();
		  String lastTwo = str.substring(lengthOfString-2, lengthOfString);
		  return lastTwo + lastTwo + lastTwo;
		}
	
	//4: withoutEnd
	public String withoutEnd(String str) {
		  int lengthOfString = str.length();
		  String middleWord = str.substring (1,lengthOfString - 1);
		  return middleWord;
		}

}
