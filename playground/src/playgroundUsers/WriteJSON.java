package playgroundUsers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JSONObject obj = new JSONObject();
		obj.put("Name", "Prince of Persia");
		obj.put("Type", "Action-Adventure");
		
		JSONArray jsonList = new JSONArray();
		
		jsonList.add(obj);
		
		obj.put("Games", jsonList);
		
		try {
			
			File f = new File("C:\\Users\\rober\\Desktop\\games.json");
			
			FileOutputStream fos = new FileOutputStream(f);
			
			ObjectOutputStream objOutStream = new ObjectOutputStream(fos);
			
			objOutStream.writeObject(jsonList);
			
			objOutStream.close();
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
		
			
	}

}
