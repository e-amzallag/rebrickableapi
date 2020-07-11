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
package org.dajlab.rebrickableapi.v3.service.lego.impl;

import org.dajlab.rebrickableapi.v3.enumeration.Method;
import org.dajlab.rebrickableapi.v3.service.AbstractRebrickableService;
import org.dajlab.rebrickableapi.v3.service.lego.IElementsService;
import org.dajlab.rebrickableapi.v3.vo.Element;
import org.dajlab.rebrickableapi.v3.vo.RebrickableException;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Implementation of {@link IElementsService}
 * 
 *
 */
public class ElementsServiceImpl extends AbstractRebrickableService implements IElementsService {

	/**
	 * Uri.
	 */
	private static final String BASE_URI = "/lego/elements/";

	/**
	 * Constructor.
	 * 
	 * @param privateKey private key
	 */
	public ElementsServiceImpl(String privateKey) {
		super(privateKey);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Element getElement(String elementId) throws RebrickableException {

		String uri = BASE_URI + elementId + "/";
		String output = returnJsonResponse(Method.GET, uri);
		try {
			if (output != null) {
				ObjectMapper mapper = new ObjectMapper();
				return mapper.readValue(output, Element.class);
			}
		} catch (Exception e) {
			throw new RebrickableException(e.getMessage());
		}
		return null;
	}

}
