package kr.co.tproject.template.aggregator_service.face.impl;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

import kr.co.tproject.template.aggregator_service.face.ProductInformationClient;

public class ProductInformationClientImpl implements ProductInformationClient{

	@Override
	public String getProductTitle() {
		
		HttpRequest request = HttpRequest.newBuilder()
				.GET()
				.uri(URI.create("http://localhost:51515/information"))
				.build();
		HttpClient client = HttpClient.newHttpClient();
		return null;
	}
}
