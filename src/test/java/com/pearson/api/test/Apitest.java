package com.pearson.api.test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

public class Apitest {
	
	

	public static void main(String[] args) {
		String url = "http://api-parccpreviewer.testnav.com/api/ticket?token=Checksum&secret=F19G42ZCBW805";		
		Response response = RestAssured.given()
				.get(url);		
		System.out.println("Response : " + response.getBody().asString());
		System.out.println("StatusCode : " + response.getStatusCode());
		if("success".equalsIgnoreCase(response.getStatusLine()))
		{
			System.out.println("we are successful");
		}
	}
}
