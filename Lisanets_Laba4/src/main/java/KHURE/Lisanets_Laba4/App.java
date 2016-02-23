package KHURE.Lisanets_Laba4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	String str = "string and something string or       string";
    	
    	StringUtills stringUtills = new StringUtills();
    
    	System.out.println(stringUtills.reverse("string"));
    	
    	System.out.println(stringUtills.findDifChar("asdfg", "acfbh"));
      	
    	System.out.println(stringUtills.changeSubstring(str, "string", "int"));
    
    	stringUtills.demoInColumn(str);
    	
    	
    	
    	
    }
}
