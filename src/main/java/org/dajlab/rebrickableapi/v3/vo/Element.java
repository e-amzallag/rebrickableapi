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
 * Describes an element.
 * 
 * @author Erik Amzallag
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Element {

	/**
	 * Id of the element.
	 */
	@JsonProperty("element_id")
	private String elementId;

	/**
	 * Od of the design.
	 */
	@JsonProperty("design_id")
	private String designId;

	/**
	 * Url to the image.
	 */
	@JsonProperty("part_img_url")
	private String partImgUrl;

	/**
	 * Part.
	 */
	private Part part;

	/**
	 * Color.
	 */
	private Color color;

	/**
	 * @return the elementId
	 */
	public String getElementId() {
		return elementId;
	}

	/**
	 * @param elementId the elementId to set
	 */
	public void setElementId(String elementId) {
		this.elementId = elementId;
	}

	/**
	 * @return the designId
	 */
	public String getDesignId() {
		return designId;
	}

	/**
	 * @param designId the designId to set
	 */
	public void setDesignId(String designId) {
		this.designId = designId;
	}

	/**
	 * @return the partImgUrl
	 */
	public String getPartImgUrl() {
		return partImgUrl;
	}

	/**
	 * @param partImgUrl the partImgUrl to set
	 */
	public void setPartImgUrl(String partImgUrl) {
		this.partImgUrl = partImgUrl;
	}

	/**
	 * @return the part
	 */
	public Part getPart() {
		return part;
	}

	/**
	 * @param part the part to set
	 */
	public void setPart(Part part) {
		this.part = part;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

}
