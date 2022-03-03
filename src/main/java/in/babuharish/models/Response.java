package in.babuharish.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("slot_info")
	private SlotInfo slotInfo;

	@JsonProperty("comments")
	private String comments;

	@JsonProperty("documents")
	private List<DocumentsItem> documents;

	@JsonProperty("addon_url")
	private String addonUrl;

	@JsonProperty("order_number")
	private String orderNumber;

	@JsonProperty("flags")
	private int flags;

	@JsonProperty("credit_details")
	private List<CreditDetailsItem> creditDetails;

	@JsonProperty("fulfillment_info")
	private FulfillmentInfo fulfillmentInfo;

	@JsonProperty("order_details")
	private OrderDetails orderDetails;

	@JsonProperty("order_modifications")
	private List<OrderModificationsItem> orderModifications;

	@JsonProperty("can_pay")
	private boolean canPay;

	@JsonProperty("addon_merged_status")
	private String addonMergedStatus;

	@JsonProperty("member_details")
	private MemberDetails memberDetails;

	@JsonProperty("base_img_url")
	private String baseImgUrl;

	@JsonProperty("order_id")
	private int orderId;

	@JsonProperty("items")
	private List<ItemsItem> items;

	@JsonProperty("invoice_number")
	private String invoiceNumber;

	@JsonProperty("invoice_url")
	private String invoiceUrl;

	public void setSlotInfo(SlotInfo slotInfo){
		this.slotInfo = slotInfo;
	}

	public SlotInfo getSlotInfo(){
		return slotInfo;
	}

	public void setComments(String comments){
		this.comments = comments;
	}

	public String getComments(){
		return comments;
	}

	public void setDocuments(List<DocumentsItem> documents){
		this.documents = documents;
	}

	public List<DocumentsItem> getDocuments(){
		return documents;
	}

	public void setAddonUrl(String addonUrl){
		this.addonUrl = addonUrl;
	}

	public String getAddonUrl(){
		return addonUrl;
	}

	public void setOrderNumber(String orderNumber){
		this.orderNumber = orderNumber;
	}

	public String getOrderNumber(){
		return orderNumber;
	}

	public void setFlags(int flags){
		this.flags = flags;
	}

	public int getFlags(){
		return flags;
	}

	public void setCreditDetails(List<CreditDetailsItem> creditDetails){
		this.creditDetails = creditDetails;
	}

	public List<CreditDetailsItem> getCreditDetails(){
		return creditDetails;
	}

	public void setFulfillmentInfo(FulfillmentInfo fulfillmentInfo){
		this.fulfillmentInfo = fulfillmentInfo;
	}

	public FulfillmentInfo getFulfillmentInfo(){
		return fulfillmentInfo;
	}

	public void setOrderDetails(OrderDetails orderDetails){
		this.orderDetails = orderDetails;
	}

	public OrderDetails getOrderDetails(){
		return orderDetails;
	}

	public void setOrderModifications(List<OrderModificationsItem> orderModifications){
		this.orderModifications = orderModifications;
	}

	public List<OrderModificationsItem> getOrderModifications(){
		return orderModifications;
	}

	public void setCanPay(boolean canPay){
		this.canPay = canPay;
	}

	public boolean isCanPay(){
		return canPay;
	}

	public void setAddonMergedStatus(String addonMergedStatus){
		this.addonMergedStatus = addonMergedStatus;
	}

	public String getAddonMergedStatus(){
		return addonMergedStatus;
	}

	public void setMemberDetails(MemberDetails memberDetails){
		this.memberDetails = memberDetails;
	}

	public MemberDetails getMemberDetails(){
		return memberDetails;
	}

	public void setBaseImgUrl(String baseImgUrl){
		this.baseImgUrl = baseImgUrl;
	}

	public String getBaseImgUrl(){
		return baseImgUrl;
	}

	public void setOrderId(int orderId){
		this.orderId = orderId;
	}

	public int getOrderId(){
		return orderId;
	}

	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	public List<ItemsItem> getItems(){
		return items;
	}

	public void setInvoiceNumber(String invoiceNumber){
		this.invoiceNumber = invoiceNumber;
	}

	public String getInvoiceNumber(){
		return invoiceNumber;
	}

	public void setInvoiceUrl(String invoiceUrl){
		this.invoiceUrl = invoiceUrl;
	}

	public String getInvoiceUrl(){
		return invoiceUrl;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"slot_info = '" + slotInfo + '\'' + 
			",comments = '" + comments + '\'' + 
			",documents = '" + documents + '\'' + 
			",addon_url = '" + addonUrl + '\'' + 
			",order_number = '" + orderNumber + '\'' + 
			",flags = '" + flags + '\'' + 
			",credit_details = '" + creditDetails + '\'' + 
			",fulfillment_info = '" + fulfillmentInfo + '\'' + 
			",order_details = '" + orderDetails + '\'' + 
			",order_modifications = '" + orderModifications + '\'' + 
			",can_pay = '" + canPay + '\'' + 
			",addon_merged_status = '" + addonMergedStatus + '\'' + 
			",member_details = '" + memberDetails + '\'' + 
			",base_img_url = '" + baseImgUrl + '\'' + 
			",order_id = '" + orderId + '\'' + 
			",items = '" + items + '\'' + 
			",invoice_number = '" + invoiceNumber + '\'' + 
			",invoice_url = '" + invoiceUrl + '\'' + 
			"}";
		}
}