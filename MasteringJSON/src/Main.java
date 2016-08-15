
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class Main {

	public static void main(String[] args) {

		JSONObject transactions = new JSONObject();
		for (int i = 0; i < 2000; i++) {
			
			
			JSONObject transaction = new JSONObject();
			transaction.put("fileName", "file_" + i);

			transaction.put("status", "status_" + i);

			transaction.put("time", "time_" + i);

			transactions.put("TxID_"+i, transaction);
			
			
		}
		
		try {

			FileWriter file = new FileWriter("C:/Jenson/CMD WS/test.json");
			file.write(transactions.toJSONString());
			file.flush();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		
	
		System.out.println("Done");
		
		
		 JSONObject transaction = (JSONObject)
		 transactions.get("TxID_8000");
		
		 System.out.println(transaction.get("fileName"));
		 System.out.println(transaction.get("time"));
		 System.out.println(transaction.get("status"));
	}

}
