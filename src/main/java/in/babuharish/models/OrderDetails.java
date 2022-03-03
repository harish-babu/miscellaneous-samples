package in.babuharish.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderDetails{

	@JsonProperty("order_status")
	private String orderStatus;

	@JsonProperty("total")
	private int total;

	@JsonProperty("delivery_charges")
	private int deliveryCharges;

	@JsonProperty("total_savings")
	private double totalSavings;

	@JsonProperty("order_source")
	private String orderSource;

	@JsonProperty("sub_total")
	private double subTotal;

	@JsonProperty("food_value")
	private int foodValue;

	@JsonProperty("total_items")
	private int totalItems;

	@JsonProperty("payment_method")
	private String paymentMethod;

	public void setOrderStatus(String orderStatus){
		this.orderStatus = orderStatus;
	}

	public String getOrderStatus(){
		return orderStatus;
	}

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setDeliveryCharges(int deliveryCharges){
		this.deliveryCharges = deliveryCharges;
	}

	public int getDeliveryCharges(){
		return deliveryCharges;
	}

	public void setTotalSavings(double totalSavings){
		this.totalSavings = totalSavings;
	}

	public double getTotalSavings(){
		return totalSavings;
	}

	public void setOrderSource(String orderSource){
		this.orderSource = orderSource;
	}

	public String getOrderSource(){
		return orderSource;
	}

	public void setSubTotal(double subTotal){
		this.subTotal = subTotal;
	}

	public double getSubTotal(){
		return subTotal;
	}

	public void setFoodValue(int foodValue){
		this.foodValue = foodValue;
	}

	public int getFoodValue(){
		return foodValue;
	}

	public void setTotalItems(int totalItems){
		this.totalItems = totalItems;
	}

	public int getTotalItems(){
		return totalItems;
	}

	public void setPaymentMethod(String paymentMethod){
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentMethod(){
		return paymentMethod;
	}

	@Override
 	public String toString(){
		return 
			"OrderDetails{" + 
			"order_status = '" + orderStatus + '\'' + 
			",total = '" + total + '\'' + 
			",delivery_charges = '" + deliveryCharges + '\'' + 
			",total_savings = '" + totalSavings + '\'' + 
			",order_source = '" + orderSource + '\'' + 
			",sub_total = '" + subTotal + '\'' + 
			",food_value = '" + foodValue + '\'' + 
			",total_items = '" + totalItems + '\'' + 
			",payment_method = '" + paymentMethod + '\'' + 
			"}";
		}
}