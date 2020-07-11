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
package org.dajlab.rebrickableapi.v3.service.lego;

import org.dajlab.rebrickableapi.v3.vo.Element;
import org.dajlab.rebrickableapi.v3.vo.RebrickableException;

/**
 * Service for LEGO elements /api/v3/lego/elements/.
 * 
 *
 */
public interface IElementsService extends IService {

	/**
	 * Get details about a specific Element ID.
	 * 
	 * @see <a href=
	 *      "https://rebrickable.com/api/v3/swagger/#!/lego/lego_elements_read">lego/elements</a>
	 * @param elementId element ID
	 * @return the element, or null if not found
	 * @throws RebrickableException exception
	 */
	Element getElement(String elementId) throws RebrickableException;
}
