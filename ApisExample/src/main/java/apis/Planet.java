package apis;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Planet {
	String name;
	String climate;
	String terrain;
	int diameter;
	String[] residents;

	public Planet(String name, String climate, String terrain, int diameter, String[] residents) {
		super();
		this.name = name;
		this.climate = climate;
		this.terrain = terrain;
		this.diameter = diameter;
		this.residents = residents;
	}

	public int getDiameter() {
		return diameter;
	}

	public String getName() {
		return name;
	}

	public String getClimate() {
		return climate;
	}

	public String getTerrain() {
		return terrain;
	}

	public String[] getResidents() {
		return this.residents;
	}

	public Person getResident(int index) throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(this.getResidents()[index])).GET().build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		String json = response.body();
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		Person person = gson.fromJson(json, Person.class);

		return person;
	}

	@Override
	public String toString() {
		return "Planet [name=" + name + ", climate=" + climate + ", terrain=" + terrain + ", diameter=" + diameter
				+ "]";
	}

}
