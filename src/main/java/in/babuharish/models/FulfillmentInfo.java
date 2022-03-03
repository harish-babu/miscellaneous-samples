package in.babuharish.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FulfillmentInfo{

	@JsonProperty("icon_url")
	private Object iconUrl;

	@JsonProperty("fulfilled_by_info_page")
	private String fulfilledByInfoPage;

	@JsonProperty("tc2")
	private String tc2;

	@JsonProperty("tc1")
	private String tc1;

	@JsonProperty("fulfilled_by")
	private String fulfilledBy;

	@JsonProperty("display_name")
	private String displayName;

	@JsonProperty("type")
	private String type;

	@JsonProperty("fulfillment_id")
	private int fulfillmentId;

	public void setIconUrl(Object iconUrl){
		this.iconUrl = iconUrl;
	}

	public Object getIconUrl(){
		return iconUrl;
	}

	public void setFulfilledByInfoPage(String fulfilledByInfoPage){
		this.fulfilledByInfoPage = fulfilledByInfoPage;
	}

	public String getFulfilledByInfoPage(){
		return fulfilledByInfoPage;
	}

	public void setTc2(String tc2){
		this.tc2 = tc2;
	}

	public String getTc2(){
		return tc2;
	}

	public void setTc1(String tc1){
		this.tc1 = tc1;
	}

	public String getTc1(){
		return tc1;
	}

	public void setFulfilledBy(String fulfilledBy){
		this.fulfilledBy = fulfilledBy;
	}

	public String getFulfilledBy(){
		return fulfilledBy;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setFulfillmentId(int fulfillmentId){
		this.fulfillmentId = fulfillmentId;
	}

	public int getFulfillmentId(){
		return fulfillmentId;
	}

	@Override
 	public String toString(){
		return 
			"FulfillmentInfo{" + 
			"icon_url = '" + iconUrl + '\'' + 
			",fulfilled_by_info_page = '" + fulfilledByInfoPage + '\'' + 
			",tc2 = '" + tc2 + '\'' + 
			",tc1 = '" + tc1 + '\'' + 
			",fulfilled_by = '" + fulfilledBy + '\'' + 
			",display_name = '" + displayName + '\'' + 
			",type = '" + type + '\'' + 
			",fulfillment_id = '" + fulfillmentId + '\'' + 
			"}";
		}
}