/**
 * 
 */
package de.petersen.aufgabe2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.time.LocalDate;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import de.petersen.Testbase;

/**
 * @author julia
 * 
 * HIER NICHTS ÄNDERN!
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Aufgabe2Test extends Testbase {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	private static Class<?> mitarbeiterClass;
	private static Object object = null;
	
	@Before
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void restoreStreams() {
	    System.setOut(System.out);
	}
	
	@Test
	public void test01KlasseVorhanden() {
		try {
			mitarbeiterClass = Class.forName("de.petersen.aufgabe2.Mitarbeiter");
			assertTrue(mitarbeiterClass != null);
		} catch (Exception exception) {
			fail("Klasse Mitarbeiter nicht vorhanden oder nicht im richtigen Package");
		}
	}
	
	@Test
	public void test02NameVorhanden() throws Exception {
		testField(mitarbeiterClass, "Name", "name", String.class);
	}
	
	@Test
	public void test03VornameVorhanden() throws Exception {
		testField(mitarbeiterClass, "Vorname", "vorname", String.class);
	}
	
	@Test
	public void test04GeburtsdatumVorhanden() throws Exception {
		testField(mitarbeiterClass, "Geburtsdatum", "geburtsdatum", LocalDate.class);
	}
	
	@Test
	public void test05IDVorhanden() throws Exception {
		testField(mitarbeiterClass, "Id", "id", int.class);
	}
	
	@Test
	public void test06RolleVorhanden() throws Exception {
		testField(mitarbeiterClass, "Rolle", "rolle", String.class);
	}
	
	@Test
	public void test07KonstruktorVorhanden() throws Exception {
		assertNotNull("Konstruktor vorhanden", mitarbeiterClass.getConstructor(int.class, String.class, String.class));
	}

	@Test
	public void test08ObjectVorhanden() throws Exception {
		object = mitarbeiterClass.getConstructor(int.class, String.class, String.class).newInstance(12345, "Sascha", "Petersen");
		assertNotNull(object);
	}
	
	@Test
	public void test09SetterGeburtsdatumVorhanden() throws Exception {
		Method method = mitarbeiterClass.getDeclaredMethod("setGeburtsdatum", LocalDate.class);
		method.setAccessible(true);
		method.invoke(object, LocalDate.of(1983, 7, 4));
	}

	@Test
	public void test10MitarbeiterdatenAusgebenVorhanden() throws Exception {
		try {
			 mitarbeiterClass.getDeclaredMethod("mitarbeiterdatenAusgeben");
			 assertTrue(true);
		} catch (Exception exception) {
			fail("Methode 'mitarbeiterdatenAusgeben' nicht vorhanden");
		}
	}
	
	@Test
	public void test11AusgabeRichtig() throws Exception {
		Method method = mitarbeiterClass.getDeclaredMethod("mitarbeiterdatenAusgeben");
		method.setAccessible(true);
		method.invoke(object);
		System.err.println(outContent.toString());
		assertEquals("12345 - Sascha Petersen, geb. am 04.07.1983" + System.lineSeparator(), outContent.toString());
	}
	
	
}
