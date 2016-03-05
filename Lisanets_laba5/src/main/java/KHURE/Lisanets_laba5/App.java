package KHURE.Lisanets_laba5;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
      PhoneBook phoneBook = new PhoneBook();
      
//      phoneBook.add("0973144127", "Lisanets");
//      phoneBook.add("0973141111", "Ivanov");
      
     
      
    //  phoneBook.save("/home/pavel/workspace/Lisanets_laba5/file.txt");
   //   phoneBook.load("/home/pavel/workspace/Lisanets_laba5/file.txt");
      
   //   System.err.println(phoneBook.findLastName("0973144127"));
   //   System.err.println(phoneBook.findNumbers("Ivanov"));
  
        phoneBook.readFromConsole();
        System.out.println(phoneBook.findLastName("0973144127"));
      
    }
}
