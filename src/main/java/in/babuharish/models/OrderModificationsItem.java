package in.babuharish.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderModificationsItem{

	@JsonProperty("message")
	private String message;

	@JsonProperty("type")
	private String type;

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	@Override
 	public String toString(){
		return 
			"OrderModificationsItem{" + 
			"message = '" + message + '\'' + 
			",type = '" + type + '\'' + 
			"}";
		}
}