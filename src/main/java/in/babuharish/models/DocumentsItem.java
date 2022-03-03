package in.babuharish.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DocumentsItem{

	@JsonProperty("display_url")
	private String displayUrl;

	@JsonProperty("number")
	private String number;

	@JsonProperty("description")
	private String description;

	@JsonProperty("id")
	private int id;

	@JsonProperty("display_name")
	private String displayName;

	@JsonProperty("url")
	private String url;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("status")
	private String status;

	public void setDisplayUrl(String displayUrl){
		this.displayUrl = displayUrl;
	}

	public String getDisplayUrl(){
		return displayUrl;
	}

	public void setNumber(String number){
		this.number = number;
	}

	public String getNumber(){
		return number;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setDisplayName(String displayName){
		this.displayName = displayName;
	}

	public String getDisplayName(){
		return displayName;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"DocumentsItem{" + 
			"display_url = '" + displayUrl + '\'' + 
			",number = '" + number + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",display_name = '" + displayName + '\'' + 
			",url = '" + url + '\'' + 
			",slug = '" + slug + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}