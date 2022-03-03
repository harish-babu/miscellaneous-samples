package in.babuharish.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlotInfo{

	@JsonProperty("date")
	private String date;

	@JsonProperty("shipment_time")
	private String shipmentTime;

	@JsonProperty("time")
	private String time;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setShipmentTime(String shipmentTime){
		this.shipmentTime = shipmentTime;
	}

	public String getShipmentTime(){
		return shipmentTime;
	}

	public void setTime(String time){
		this.time = time;
	}

	public String getTime(){
		return time;
	}

	@Override
 	public String toString(){
		return 
			"SlotInfo{" + 
			"date = '" + date + '\'' + 
			",shipment_time = '" + shipmentTime + '\'' + 
			",time = '" + time + '\'' + 
			"}";
		}
}