package org.dajlab.rebrickableapi.v3.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.dajlab.rebrickableapi.v3.service.lego.IElementsService;
import org.dajlab.rebrickableapi.v3.service.lego.impl.ElementsServiceImpl;
import org.dajlab.rebrickableapi.v3.vo.Element;
import org.junit.jupiter.api.Test;

public class ElementsServiceTest {

	@Test
	public void testGetElement() {
		IElementsService service = new ElementsServiceImpl("myApiKey");
		Element element;
		try {
			element = service.getElement("300101");
			assertNotNull(element);
			assertEquals("3001", element.getDesignId());

			element = service.getElement("6254555");
			assertNotNull(element);
			assertNotNull(element.getPart());
			assertEquals("Glass for Window 1 x 2 x 2 flat with Arched Gold Window print", element.getPart().getName());
			assertEquals("60601pr0005", element.getPart().getPartNum());
			assertNotNull(element.getPart().getExternalIds());
			assertTrue(element.getPart().getExternalIds().getBricklink().length > 0);
			assertEquals("60601pb017", element.getPart().getExternalIds().getBricklink()[0]);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

}
