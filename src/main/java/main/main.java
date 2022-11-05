package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class main {
	
	public static void main(String[] args) throws IOException{
		final String url = "https://www.exchangerates.org.uk/US-Dollar-USD-currency-table.html";
		
		Document doc = Jsoup.connect(url).get();
		
		ArrayList<String> datas = new ArrayList<String>();
		clearList(datas);
		
		Element table = doc.select("table").get(1);
		Elements rows = table.select("tr");
		
		for(Element row: rows) {
			datas.add(row.text());
		}
		
		ArrayList<Double> numbers = new ArrayList<Double>();
		clearList(numbers);
		
		regex reg = new regex();
		
		for(String s: datas) {
			numbers.add(reg.numbers(s));
		}
		
//		System.out.println(numbers.toString());
		
		
	}
	
	public static void clearList(ArrayList list) {
    	if(!list.isEmpty()) {
			list.removeAll(list);
		}
    }
	
	public static void run() {
		System.out.println("WELCOME TO CURRENCY EXCHANGE");
		System.out.println("Here you can convert your $");
		System.out.println("#############################\n");
		
		System.out.println("Type 1 : Dollars to Australian Dollars.");
		System.out.println("Type 2 : Dollars to British Pounds.");
		System.out.println("Type 3 : Dollars to Canadian Dollars");
		System.out.println("Type 4 : Dollars to Yuan");
		System.out.println("Type 5 : Dollars to Euros");
		System.out.println("Type 6 : Dollars to Hong Kong Dollars");
		System.out.println("Type 7 : Dollars to Rupees");
		System.out.println("Type 8 : Dollars to Yen");
		System.out.println("Type 9 : Dollars to New Zealand Dollars");
		System.out.println("Type 10: Dollars to South African Rands");
		System.out.println("Type 11: Dollars to Swiss Francs");
		System.out.println("Type 12: Dollars to Lira");
		System.out.println("Type 13: Dollars to Dhirams");
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
		}catch(Exception e) {
			
		}
	}
}
