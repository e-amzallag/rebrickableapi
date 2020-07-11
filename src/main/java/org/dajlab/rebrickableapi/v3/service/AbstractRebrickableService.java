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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.dajlab.rebrickableapi.v3.enumeration.Method;
import org.dajlab.rebrickableapi.v3.service.lego.IService;
import org.dajlab.rebrickableapi.v3.vo.RebrickableException;

/**
 * Abstract service.
 * 
 *
 */
public abstract class AbstractRebrickableService implements IService {

	/**
	 * Private key.
	 */
	private String key;

	/**
	 * API Base URL.
	 * 
	 * @see <a href= "https://rebrickable.com/api/v3/docs">Documentation V3</a>
	 */
	private static final String API_BASE_URL = "https://rebrickable.com/api/v3";

	/**
	 * Constructor.
	 * 
	 * @param privateKey your Rebrickable private key.
	 */
	protected AbstractRebrickableService(String privateKey) {
		this.key = privateKey;
	}

	/**
	 * Call the service and return the response.
	 * 
	 * @param method http methode
	 * @param uri    uri
	 * @return the string representation of the JSON response
	 * @throws RebrickableException exception
	 */
	protected String returnJsonResponse(Method method, String uri) throws RebrickableException {

		return returnJsonResponse(method, uri, null);
	}

	/**
	 * Call the service and return the response.
	 * 
	 * @param method     http methode
	 * @param uri        uri
	 * @param parameters request parameters
	 * @return the string representation of the JSON response
	 * @throws RebrickableException exception
	 */
	protected String returnJsonResponse(Method method, String uri, Map<String, String> parameters)
			throws RebrickableException {

		String baseUrl = API_BASE_URL + uri + "?key=" + key;

		if (parameters != null) {
			StringBuilder params = new StringBuilder();
			for (Entry<String, String> param : parameters.entrySet()) {
				params.append(param.getKey() + "=" + param.getValue());
			}
			baseUrl = baseUrl + "&" + params;
		}

		return callRestService(method, baseUrl);
	}

	/**
	 * Call the REST service with the full url.
	 * 
	 * @param method http method
	 * @param url    the url, complete with paramaters and key.
	 * @return the string representation of the JSON response
	 * @throws RebrickableException exception
	 */
	private String callRestService(Method method, String url) throws RebrickableException {
		try {
			URL fullurl = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) fullurl.openConnection();
			conn.setRequestMethod(method.name());
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RebrickableException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			return new BufferedReader(new InputStreamReader(conn.getInputStream())).lines()
					.collect(Collectors.joining("\n"));
		} catch (Exception e) {
			throw new RebrickableException(e.getMessage());
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @param key key
	 */
	@Override
	public void setKey(String key) {
		this.key = key;
	}

}
