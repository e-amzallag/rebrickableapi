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

/**
 * Services for Rebrickable.
 * 
 * @see <a href="https://rebrickable.com/api/v3/docs/">API Doc</a>
 * 
 *
 */
public interface IRebrickableService {

	/**
	 * Elements service.
	 * 
	 * @return the elements service.
	 */
	IElementsService getElements();

	/**
	 * Sets service.
	 * 
	 * @return the sets service.
	 */
	ISetsService getSets();

	/**
	 * Set the API key.
	 * 
	 * @param key key
	 */
	void setKey(String key);
}
