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
package org.dajlab.rebrickableapi.v3.service;

import org.dajlab.rebrickableapi.v3.service.lego.IElementsService;
import org.dajlab.rebrickableapi.v3.service.lego.ISetsService;
import org.dajlab.rebrickableapi.v3.service.lego.impl.ElementsServiceImpl;
import org.dajlab.rebrickableapi.v3.service.lego.impl.SetsServiceImpl;

/**
 * Implementation.
 * 
 *
 */
public class RebrickableServiceImpl implements IRebrickableService {

	/**
	 * Elements service.
	 */
	private IElementsService elementsService;

	/**
	 * Sets service.
	 */
	private ISetsService setsService;

	/**
	 * Constructor.
	 * 
	 * @param privateKey your Rebrickable private key.
	 */
	public RebrickableServiceImpl(String privateKey) {
		elementsService = new ElementsServiceImpl(privateKey);
		setsService = new SetsServiceImpl(privateKey);
	}

	/**
	 * #{@inheritDoc}
	 */
	@Override
	public IElementsService getElements() {

		return elementsService;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ISetsService getSets() {

		return setsService;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setKey(String key) {
		elementsService.setKey(key);
		setsService.setKey(key);
	}

}
