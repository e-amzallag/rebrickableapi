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
 * Describe a part.
 * 
 * @author Erik Amzallag
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Part {

	/**
	 * Part number.
	 */
	@JsonProperty("part_num")
	private String partNum;

	/**
	 * Part name.
	 */
	private String name;

	/**
	 * Externals Ids.
	 */
	@JsonProperty("external_ids")
	private PartExternalIds externalIds;

	/**
	 * @return the partNum
	 */
	public String getPartNum() {
		return partNum;
	}

	/**
	 * @param partNum the partNum to set
	 */
	public void setPartNum(String partNum) {
		this.partNum = partNum;
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
	 * @return the externalIds
	 */
	public PartExternalIds getExternalIds() {
		return externalIds;
	}

	/**
	 * @param externalIds the externalIds to set
	 */
	public void setExternalIds(PartExternalIds externalIds) {
		this.externalIds = externalIds;
	}

}
