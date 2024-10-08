package com.server.cafeV.webapp.model;

import java.util.List;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;



@JsonTypeInfo(
use = JsonTypeInfo.Id.NAME,
include = JsonTypeInfo.As.EXISTING_PROPERTY,
property = "inputType", visible=true)
@JsonSubTypes({
	@Type(value=FormInputBasic.class, name="text"),
	@Type(value=FormInputBasic.class, name="checkbox"),
	@Type(value=FormInputBasic.class, name="number"),
	@Type(value=FormInputRange.class, name="range"),
	@Type(value=FormInputSearch.class, name="search"),
	@Type(value=FormInputSelect.class, name="select"),
	@Type(value=FormInputGroup.class, name="group")
})

public abstract class FormInput {
	
	@Nullable
	public String id;
	public String inputName;

	public String inputType;
	public Boolean queryClause;

	public String getInputType() {
		return inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	public FormInput(String name, String type) {
		this.inputName = name;
	}

	public FormInput() {
		
	}
	
	public String getInputName() {
		return inputName;
	}


	public void setInputName(String inputName) {
		this.inputName = inputName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getQueryClause() {
		return queryClause;
	}

	public void setQueryClause(Boolean queryClause) {
		this.queryClause = queryClause;
	}


	


//	public String getInputType() {
//		return inputType;
//	}
//
//
//	public void setInputType(String inputType) {
//		this.inputType = inputType;
//	}
	
	
	
//	private String type;
//	@Nullable
//	private int min;
//	@Nullable
//	private int max;
//	@Nullable
//	private List<String> data;
//	@Nullable
//	private EnumOption options;
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
////	public int getMin() {
////		return min;
////	}
//
//	public void setMin(int min) {
//		this.min = min;
//	}
//
////	public int getMax() {
////		return max;
////	}
//
//	public void setMax(int max) {
//		this.max = max;
//	}
//
////	public List<String> getData() {
////		return data;
////	}
//
//	public void setData(List<String> data) {
//	if(data!=null) {
//		this.data = data;
//	}
//	
//		
//	}
//
//	public EnumOption getOptions() {
//		return options;
//	}
//
//	public void setOptions(EnumOption options) {
//		this.options = options;
//	}
//	

	
}