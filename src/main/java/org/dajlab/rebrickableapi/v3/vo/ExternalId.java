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
 * External ID.
 * 
 * @author Erik Amzallag
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalId {

	/**
	 * External ids.
	 */
	@JsonProperty("ext_ids")
	private Integer[] extIds;

	/**
	 * Extrnal descriptions.
	 */
	@JsonProperty("ext_descrs")
	private String[][] extDescrs;

	/**
	 * @return the extIds
	 */
	public Integer[] getExtIds() {
		return extIds;
	}

	/**
	 * @param extIds the extIds to set
	 */
	public void setExtIds(Integer[] extIds) {
		this.extIds = extIds;
	}

	/**
	 * @return the extDescrs
	 */
	public String[][] getExtDescrs() {
		return extDescrs;
	}

	/**
	 * @param extDescrs the extDescrs to set
	 */
	public void setExtDescrs(String[][] extDescrs) {
		this.extDescrs = extDescrs;
	}
}
