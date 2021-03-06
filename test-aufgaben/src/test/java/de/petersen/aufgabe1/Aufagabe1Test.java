package de.petersen.aufgabe1;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import de.petersen.Testbase;

/**
 * @author sascha
 *
 *  HIER NICHTS ÄNDERN!
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Aufagabe1Test extends Testbase {
	private static Class<?> firmaClass;
	private static Object object = null;
	
	@Test
	public void test01KlasseFirma() throws Exception {
		try {
			firmaClass = Class.forName("de.petersen.aufgabe1.Firma");
			assertTrue(firmaClass != null);
		} catch (Exception exception) {
			fail("Klasse Firma nicht vorhanden oder nicht im richtigen Package");
		}
	}

	@Test
	public void test02NameVorhanden() throws Exception {
		testField(firmaClass, "Name", "name", String.class);
	}
	
	@Test
	public void test03GruendungsdatumVorhanden() throws Exception {
		testField(firmaClass, "Gründungsdatum", "gruendungsdatum", LocalDate.class);
	}
	
	@Test
	public void test04AnzahlMitarbeiterVorhanden() throws Exception {
		testField(firmaClass, "Anzahl Mitarbeiter", "anzahlMitarbeiter", int.class);
	}

	@Test
	public void test05KonstruktorVorhanden() throws Exception {
		assertNotNull("Konstruktor vorhanden", firmaClass.getConstructor(String.class, LocalDate.class));
	}

	@Test
	public void test06ObjectVorhanden() throws Exception {
		object = firmaClass.getConstructor(String.class, LocalDate.class).newInstance("Testfirma", LocalDate.now());
		assertNotNull(object);
	}

	@Test
	public void test07NameDerFirma() throws Exception {
		Field name = firmaClass.getDeclaredField("name");
		name.setAccessible(true);
		assertEquals("Name der Firma: ", "Testfirma", name.get(object));
	}
	
	@Test
	public void test08GruendungsdatumDerFirma() throws Exception {
		Field datum = firmaClass.getDeclaredField("gruendungsdatum");
		datum.setAccessible(true);
		assertEquals("Gründungsdatum der Firma: ", LocalDate.now(), datum.get(object));
	}

	@Test
	public void test09AnzahlDerMitarbeiter0() throws Exception {
		Field anzahlMitarbeiter = firmaClass.getDeclaredField("anzahlMitarbeiter");
		anzahlMitarbeiter.setAccessible(true);
		assertEquals("Anzahl der Mitarbeiter: ", 1, anzahlMitarbeiter.get(object));
	}

	@Test
	public void test10MethodeMitarbeiterEinstellenVorhanden() throws Exception {
		try {
			Method mitarbeiterEinstellen = firmaClass.getDeclaredMethod("mitarbeiterEinstellen");
			mitarbeiterEinstellen.setAccessible(true);
			mitarbeiterEinstellen.invoke(object);
			
			Field anzahlMitarbeiter = firmaClass.getDeclaredField("anzahlMitarbeiter");
			anzahlMitarbeiter.setAccessible(true);
			assertEquals("Anzahl der Mitarbeiter: ", 2, anzahlMitarbeiter.get(object));
		} catch (Exception exception) {
			fail("Methode 'mitarbeiterEinstellen' nicht vorhanden");
		}
	}
	
	@Test
	public void test11MethodeMitarbeiterKuendigenVorhanden() throws Exception {
		try {
			Method mitarbeiterKuendigen = firmaClass.getDeclaredMethod("mitarbeiterKuendigen");
			mitarbeiterKuendigen.setAccessible(true);
			mitarbeiterKuendigen.invoke(object);
			
			Field anzahlMitarbeiter = firmaClass.getDeclaredField("anzahlMitarbeiter");
			anzahlMitarbeiter.setAccessible(true);
			assertEquals("Anzahl der Mitarbeiter: ", 1, anzahlMitarbeiter.get(object));
		} catch (Exception exception) {
			fail("Methode 'mitarbeiterKuendigen' nicht vorhanden");
		}
	}

	
}
