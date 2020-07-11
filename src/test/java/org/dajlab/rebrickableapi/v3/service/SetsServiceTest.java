package org.dajlab.rebrickableapi.v3.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.dajlab.rebrickableapi.v3.service.lego.ISetsService;
import org.dajlab.rebrickableapi.v3.service.lego.impl.SetsServiceImpl;
import org.dajlab.rebrickableapi.v3.vo.Set;
import org.junit.jupiter.api.Test;

public class SetsServiceTest {

	private ISetsService service = new SetsServiceImpl("myApiKey");

	@Test
	public void testGetSet() {

		Set set;
		try {
			set = service.getSet("21316-1");
			assertNotNull(set);
			System.out.println("Name = " + set.getName());
			System.out.println("Number of part = " + set.getNumberParts());
			System.out.println("Year = " + set.getYear());
			System.out.println("URL picture = " + set.getSetImageUrl());
			assertEquals("The Flintstones", set.getName());
			assertEquals(748, set.getNumberParts());
			assertEquals(2019, set.getYear());
			assertEquals("https://cdn.rebrickable.com/media/sets/21316-1/14778.jpg", set.getSetImageUrl());
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}

	}

}
