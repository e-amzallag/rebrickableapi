/*
 * Copyright 2020 Erik Amzallag
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.dajlab.rebrickableapi.v3.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Set.
 * 
 * @author Erik Amzallag
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Set {

	/**
	 * Set number.
	 */
	@JsonProperty("set_num")
	private String setNumber;

	/**
	 * Name.
	 */
	private String name;
	/**
	 * Year.
	 */
	private int year;
	/**
	 * Theme id.
	 */
	@JsonProperty("theme_id")
	private int themeId;
	/**
	 * Number of parts.
	 */
	@JsonProperty("num_parts")
	private int numberParts;
	/**
	 * Image url.
	 */
	@JsonProperty("set_img_url")
	private String setImageUrl;
	/**
	 * Set url.
	 */
	@JsonProperty("set_url")
	private String setUrl;

	/**
	 * @return the setNumber
	 */
	public String getSetNumber() {
		return setNumber;
	}

	/**
	 * @param setNumber the setNumber to set
	 */
	public void setSetNumber(String setNumber) {
		this.setNumber = setNumber;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the themeId
	 */
	public int getThemeId() {
		return themeId;
	}

	/**
	 * @param themeId the themeId to set
	 */
	public void setThemeId(int themeId) {
		this.themeId = themeId;
	}

	/**
	 * @return the numberParts
	 */
	public int getNumberParts() {
		return numberParts;
	}

	/**
	 * @param numberParts the numberParts to set
	 */
	public void setNumberParts(int numberParts) {
		this.numberParts = numberParts;
	}

	/**
	 * @return the setImageUrl
	 */
	public String getSetImageUrl() {
		return setImageUrl;
	}

	/**
	 * @param setImageUrl the setImageUrl to set
	 */
	public void setSetImageUrl(String setImageUrl) {
		this.setImageUrl = setImageUrl;
	}

	/**
	 * @return the setUrl
	 */
	public String getSetUrl() {
		return setUrl;
	}

	/**
	 * @param setUrl the setUrl to set
	 */
	public void setSetUrl(String setUrl) {
		this.setUrl = setUrl;
	}

}
