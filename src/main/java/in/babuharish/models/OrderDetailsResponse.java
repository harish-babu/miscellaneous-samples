package in.babuharish.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderDetailsResponse{

	@JsonProperty("response")
	private Response response;

	@JsonProperty("message")
	private String message;

	@JsonProperty("status")
	private int status;

	public void setResponse(Response response){
		this.response = response;
	}

	public Response getResponse(){
		return response;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"OrderDetailsResponse{" + 
			"response = '" + response + '\'' + 
			",message = '" + message + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}