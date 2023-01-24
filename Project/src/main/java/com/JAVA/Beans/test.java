package com.JAVA.Beans;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class test {

	public static void main(String[] args) throws IOException, InterruptedException  {
		int a=10;
		System.out.println(a);
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://actor-movie-api1.p.rapidapi.com/getid/Tom%20Holland?apiKey=62ffac58c57333a136053150eaa1b587"))
				.header("X-RapidAPI-Key", "09453a0079msh58d41173cffee70p173c43jsn06a903c513a6")
				.header("X-RapidAPI-Host", "actor-movie-api1.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
		System.out.println(response.body());
		
	

	}

}
