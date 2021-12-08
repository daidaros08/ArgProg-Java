package apis;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class AuthClientDemoApp {
	public static void main(String[] args) throws IOException, InterruptedException {
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://the-one-api.dev/v2/character/5cd99d4bde3Deff6eb66fe9e")).GET()
				.setHeader("Authorization", "Bearer 0fMTAwrR1CuGzymy9M1g").build();
		HttpClient client = HttpClient.newHttpClient();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		String json = response.body();
		System.out.println(json);
		/*
		 * GsonBuilder builder = new GsonBuilder(); Gson gson = builder.create(); Planet
		 * tatooine = gson.fromJson(json, Planet.class); System.out.println(tatooine);
		 * // System.out.println(tatooine.getResident(0)); for (int i = 0; i <= 8; i++)
		 * { System.out.println(tatooine.getResident(i)); }
		 */
	}

}
