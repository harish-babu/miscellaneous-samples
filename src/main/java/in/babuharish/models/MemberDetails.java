package in.babuharish.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MemberDetails{

	@JsonProperty("area")
	private String area;

	@JsonProperty("zipcode")
	private int zipcode;

	@JsonProperty("city")
	private String city;

	@JsonProperty("address2")
	private String address2;

	@JsonProperty("address1")
	private String address1;

	@JsonProperty("mobile")
	private String mobile;

	@JsonProperty("name")
	private String name;

	@JsonProperty("residential_complex")
	private String residentialComplex;

	@JsonProperty("landmark")
	private String landmark;

	public void setArea(String area){
		this.area = area;
	}

	public String getArea(){
		return area;
	}

	public void setZipcode(int zipcode){
		this.zipcode = zipcode;
	}

	public int getZipcode(){
		return zipcode;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}

	public void setAddress2(String address2){
		this.address2 = address2;
	}

	public String getAddress2(){
		return address2;
	}

	public void setAddress1(String address1){
		this.address1 = address1;
	}

	public String getAddress1(){
		return address1;
	}

	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	public String getMobile(){
		return mobile;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setResidentialComplex(String residentialComplex){
		this.residentialComplex = residentialComplex;
	}

	public String getResidentialComplex(){
		return residentialComplex;
	}

	public void setLandmark(String landmark){
		this.landmark = landmark;
	}

	public String getLandmark(){
		return landmark;
	}

	@Override
 	public String toString(){
		return 
			"MemberDetails{" + 
			"area = '" + area + '\'' + 
			",zipcode = '" + zipcode + '\'' + 
			",city = '" + city + '\'' + 
			",address2 = '" + address2 + '\'' + 
			",address1 = '" + address1 + '\'' + 
			",mobile = '" + mobile + '\'' + 
			",name = '" + name + '\'' + 
			",residential_complex = '" + residentialComplex + '\'' + 
			",landmark = '" + landmark + '\'' + 
			"}";
		}
}