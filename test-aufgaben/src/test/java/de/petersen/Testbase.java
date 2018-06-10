package de.petersen;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;

public class Testbase {
	protected void testField(Class<?> firmaClass, String eigenschaft, String fieldname, Class<?> typClass) {
		try {
			Field field = firmaClass.getDeclaredField(fieldname);
			assertTrue("Feld '" + eigenschaft + "' vorhanden", field != null);
			assertTrue(eigenschaft + " ist vom Typ "+typClass.getSimpleName(), typClass.isAssignableFrom(field.getType()));
		} catch (Exception exception) {
			fail("Feld " + eigenschaft + " nicht vorhanden");
		}
	}
}
