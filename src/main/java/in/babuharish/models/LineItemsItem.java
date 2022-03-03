package in.babuharish.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LineItemsItem{

	@JsonProperty("p_img_url")
	private String pImgUrl;

	@JsonProperty("promo_info")
	private PromoInfo promoInfo;

	@JsonProperty("sku_type")
	private String skuType;

	@JsonProperty("p_applied_type")
	private int pAppliedType;

	@JsonProperty("p_brand")
	private String pBrand;

	@JsonProperty("p_desc")
	private String pDesc;

	@JsonProperty("mrp")
	private double mrp;

	@JsonProperty("dis_val")
	private String disVal;

	@JsonProperty("sale_price")
	private double salePrice;

	@JsonProperty("tlc_n")
	private String tlcN;

	@JsonProperty("saving")
	private double saving;

	@JsonProperty("llc_s")
	private String llcS;

	@JsonProperty("llc_n")
	private String llcN;

	@JsonProperty("pc_n")
	private String pcN;

	@JsonProperty("gift_msg")
	private String giftMsg;

	@JsonProperty("w")
	private String W;

	@JsonProperty("total_q")
	private int totalQ;

	@JsonProperty("sku")
	private int sku;

	@JsonProperty("pack_desc")
	private String packDesc;

	@JsonProperty("is_express")
	private boolean isExpress;

	public void setPImgUrl(String pImgUrl){
		this.pImgUrl = pImgUrl;
	}

	public String getPImgUrl(){
		return pImgUrl;
	}

	public void setPromoInfo(PromoInfo promoInfo){
		this.promoInfo = promoInfo;
	}

	public PromoInfo getPromoInfo(){
		return promoInfo;
	}

	public void setSkuType(String skuType){
		this.skuType = skuType;
	}

	public String getSkuType(){
		return skuType;
	}

	public void setPAppliedType(int pAppliedType){
		this.pAppliedType = pAppliedType;
	}

	public int getPAppliedType(){
		return pAppliedType;
	}

	public void setPBrand(String pBrand){
		this.pBrand = pBrand;
	}

	public String getPBrand(){
		return pBrand;
	}

	public void setPDesc(String pDesc){
		this.pDesc = pDesc;
	}

	public String getPDesc(){
		return pDesc;
	}

	public void setMrp(double mrp){
		this.mrp = mrp;
	}

	public double getMrp(){
		return mrp;
	}

	public void setDisVal(String disVal){
		this.disVal = disVal;
	}

	public String getDisVal(){
		return disVal;
	}

	public void setSalePrice(double salePrice){
		this.salePrice = salePrice;
	}

	public double getSalePrice(){
		return salePrice;
	}

	public void setTlcN(String tlcN){
		this.tlcN = tlcN;
	}

	public String getTlcN(){
		return tlcN;
	}

	public void setSaving(double saving){
		this.saving = saving;
	}

	public double getSaving(){
		return saving;
	}

	public void setLlcS(String llcS){
		this.llcS = llcS;
	}

	public String getLlcS(){
		return llcS;
	}

	public void setLlcN(String llcN){
		this.llcN = llcN;
	}

	public String getLlcN(){
		return llcN;
	}

	public void setPcN(String pcN){
		this.pcN = pcN;
	}

	public String getPcN(){
		return pcN;
	}

	public void setGiftMsg(String giftMsg){
		this.giftMsg = giftMsg;
	}

	public String getGiftMsg(){
		return giftMsg;
	}

	public void setW(String W){
		this.W = W;
	}

	public String getW(){
		return W;
	}

	public void setTotalQ(int totalQ){
		this.totalQ = totalQ;
	}

	public int getTotalQ(){
		return totalQ;
	}

	public void setSku(int sku){
		this.sku = sku;
	}

	public int getSku(){
		return sku;
	}

	public void setPackDesc(String packDesc){
		this.packDesc = packDesc;
	}

	public String getPackDesc(){
		return packDesc;
	}

	public void setIsExpress(boolean isExpress){
		this.isExpress = isExpress;
	}

	public boolean isIsExpress(){
		return isExpress;
	}

	@Override
 	public String toString(){
		return 
			"LineItemsItem{" + 
			"p_img_url = '" + pImgUrl + '\'' + 
			",promo_info = '" + promoInfo + '\'' + 
			",sku_type = '" + skuType + '\'' + 
			",p_applied_type = '" + pAppliedType + '\'' + 
			",p_brand = '" + pBrand + '\'' + 
			",p_desc = '" + pDesc + '\'' + 
			",mrp = '" + mrp + '\'' + 
			",dis_val = '" + disVal + '\'' + 
			",sale_price = '" + salePrice + '\'' + 
			",tlc_n = '" + tlcN + '\'' + 
			",saving = '" + saving + '\'' + 
			",llc_s = '" + llcS + '\'' + 
			",llc_n = '" + llcN + '\'' + 
			",pc_n = '" + pcN + '\'' + 
			",gift_msg = '" + giftMsg + '\'' + 
			",w = '" + W + '\'' + 
			",total_q = '" + totalQ + '\'' + 
			",sku = '" + sku + '\'' + 
			",pack_desc = '" + packDesc + '\'' + 
			",is_express = '" + isExpress + '\'' + 
			"}";
		}
}