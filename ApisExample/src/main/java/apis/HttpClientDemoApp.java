package apis;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class HttpClientDemoApp {
	
	public static void main (String[] args) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://swapi.dev/api/planets/1/")).GET()
				.build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		//System.out.println(response.body());

		String json = response.body();
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		Planet tatooine = gson.fromJson(json, Planet.class);
		System.out.println(tatooine);
		//System.out.println(tatooine.getResident(0));
		for (int i=0;i<=8;i++) {
			System.out.println(tatooine.getResident(i));
		}
	}

}
