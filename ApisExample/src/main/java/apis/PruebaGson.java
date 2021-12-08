package apis;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PruebaGson {
	
	public static void main (String [] args) {
		String json = "{username: 'Pablo', password: '********'}";
		
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		
		User yael =gson.fromJson(json, User.class);
		
		System.out.println(yael);
	}


}