package KHURE.Lisanets_laba5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {

	private Map<String, String> store = new HashMap<>();
    
	/**
	 * Method adds numbers to phonebook
	 * @param number
	 * @param lastName
	 */
	public void add(String number, String lastName) {
		store.put(number, lastName);
	}

	/**
	 * Method finds numbers by lastname
	 * @param lastName
	 * @return
	 */
	public List<String> findNumbers(String lastName) {

		List<String> resultList = new ArrayList<>();

		for (Map.Entry<String, String> entry : store.entrySet()) {

			if (lastName.equals(entry.getValue())) {
				resultList.add(entry.getKey());
			}

		}

		return resultList;
	}

	/**
	 * Method finds lastname by number
	 * @param number
	 * @return
	 */
	public String findLastName(String number) {

		for (Map.Entry<String, String> entry : store.entrySet()) {

			if (number.equals(entry.getKey())) {
				return entry.getValue();
			}

		}

		return null;

	}

	/**
	 * Laba 6
	 * Method saves phonebook to the specify file
	 * @param fileName
	 * @throws IOException
	 */
	
	public void save(String fileName) throws IOException {

		File file = new File(fileName);

		if (!file.exists()) {
			file.createNewFile();
		}

		try (PrintWriter printWriter = new PrintWriter(file.getAbsolutePath())) {

			for (Map.Entry<String, String> entry : store.entrySet()) {

				printWriter.println(entry.getValue() + " " + entry.getKey());

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Laba 6
	 * Method loads phonebook from the specify file
	 * @param fileName
	 */
	public void load(String fileName) {

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
			String s;
			String[] arr;
			while ((s = bufferedReader.readLine()) != null) {
              
				arr = s.split(" ");
				store.put(arr[1], arr[0]);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * Laba 6
	 * Method reads lastname and number from the console and put it to phonebook
	 */
	public void readFromConsole(){
		
		System.out.println("Введите имя и номер, через пробел");
		
		String arr[];
						
		try(Scanner scanner = new Scanner(System.in)){
			
			arr = scanner.nextLine().split(" ");
			store.put(arr[1], arr[0]);
			
			
		}
		
	}
	
}
