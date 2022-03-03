package in.babuharish.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemsItem{

	@JsonProperty("tlc_num_items")
	private int tlcNumItems;

	@JsonProperty("tlc_name")
	private String tlcName;

	@JsonProperty("line_items")
	private List<LineItemsItem> lineItems;

	@JsonProperty("tlc_total")
	private double tlcTotal;

	public void setTlcNumItems(int tlcNumItems){
		this.tlcNumItems = tlcNumItems;
	}

	public int getTlcNumItems(){
		return tlcNumItems;
	}

	public void setTlcName(String tlcName){
		this.tlcName = tlcName;
	}

	public String getTlcName(){
		return tlcName;
	}

	public void setLineItems(List<LineItemsItem> lineItems){
		this.lineItems = lineItems;
	}

	public List<LineItemsItem> getLineItems(){
		return lineItems;
	}

	public void setTlcTotal(double tlcTotal){
		this.tlcTotal = tlcTotal;
	}

	public double getTlcTotal(){
		return tlcTotal;
	}

	@Override
 	public String toString(){
		return 
			"ItemsItem{" + 
			"tlc_num_items = '" + tlcNumItems + '\'' + 
			",tlc_name = '" + tlcName + '\'' + 
			",line_items = '" + lineItems + '\'' + 
			",tlc_total = '" + tlcTotal + '\'' + 
			"}";
		}
}