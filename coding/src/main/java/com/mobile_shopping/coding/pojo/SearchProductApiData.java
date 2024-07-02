package com.mobile_shopping.coding.pojo;

import lombok.Data;

@Data
public class SearchProductApiData {

	private String searchText;

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

}
