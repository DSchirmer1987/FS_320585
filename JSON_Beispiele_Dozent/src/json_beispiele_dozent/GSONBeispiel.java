package json_beispiele_dozent;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GSONBeispiel {
	public static void objectToJSON(Object obj, String filename) {
		Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().setVersion(3.0).create();
		try (FileWriter fw = new FileWriter(filename)){
			gson.toJson(obj, fw);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Employee JSONtoObject(String filename) {
		Gson gson = new Gson();
		Employee obj = null;
		
		try(FileReader fr = new FileReader(filename)){
			obj = gson.fromJson(fr, Employee.class);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	
	public static ArrayList<Employee> JSONtoList(String filename){
		Gson gson = new Gson();
		ArrayList<Employee> list = new ArrayList<>();
		try(FileReader fr = new FileReader(filename)){
			list = gson.fromJson(fr, new TypeToken<ArrayList<Employee>>() {}.getType());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
