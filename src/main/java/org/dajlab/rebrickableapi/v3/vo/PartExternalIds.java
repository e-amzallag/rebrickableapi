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
 * External ids.
 * 
 * @author Erik Amzallag
 * 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PartExternalIds {

	/**
	 * Bricklink ID.
	 */
	@JsonProperty("BrickLink")
	private String[] bricklink;

	/**
	 * @return the bricklink
	 */
	public String[] getBricklink() {
		return bricklink;
	}

	/**
	 * @param bricklink the bricklink to set
	 */
	public void setBricklink(String[] bricklink) {
		this.bricklink = bricklink;
	}

}
