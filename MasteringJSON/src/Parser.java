import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Parser {
	public static void main(String[] args)  {
		JSONParser parser = new JSONParser();

		try {

			Object obj = parser.parse(new FileReader("C:/Jenson/CMD WS/test.json"));

			JSONObject transactions = (JSONObject) obj;

			JSONObject transaction = (JSONObject)
					 transactions.get("TxID_8000");
					
					 System.out.println(transaction.get("fileName"));
					 System.out.println(transaction.get("time"));
					 System.out.println(transaction.get("status"));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
