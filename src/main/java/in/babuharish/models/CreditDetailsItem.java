package in.babuharish.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreditDetailsItem{

	@JsonProperty("type")
	private String type;

	@JsonProperty("credit_value")
	private String creditValue;

	@JsonProperty("mesg")
	private String mesg;

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setCreditValue(String creditValue){
		this.creditValue = creditValue;
	}

	public String getCreditValue(){
		return creditValue;
	}

	public void setMesg(String mesg){
		this.mesg = mesg;
	}

	public String getMesg(){
		return mesg;
	}

	@Override
 	public String toString(){
		return 
			"CreditDetailsItem{" + 
			"type = '" + type + '\'' + 
			",credit_value = '" + creditValue + '\'' + 
			",mesg = '" + mesg + '\'' + 
			"}";
		}
}