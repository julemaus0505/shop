package de.jupetersen.shop;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import net.miginfocom.swing.MigLayout;

public class WestButtonPanels {

	static JPanel getPanelImpressum() {
		JPanel panelImpressum = new JPanel(new MigLayout("", "[100]", "[100]"));
		JTextArea text = new JTextArea("Sophie Kunterbunt\r\n" + "\r\n" + "www.sophiekunterbunt.de\r\n" + "\r\n"
				+ "Inhaber: Sophie Frey\r\n" + "Hallberger Zeile 17\r\n" + "12437 Berlin\r\n" + "Deutschland\r\n"
				+ "\r\n" + "E-Mail: info@sophiekunterbunt.de\r\n" + "\r\n" + "Kleinunternehmer gem�� � 19 UStG\r\n"
				+ "\r\n" + "Finanzamt: Treptow, K�penick / Berlin");
		panelImpressum.add(text);
		text.setBorder(null);
		text.setBackground(new Color(214, 217, 223));
		return panelImpressum;

	}

	static JPanel getPanelVersandUndLieferzeit() {
		JPanel panelVersandUndLieferzeit = new JPanel(new MigLayout("", "[50]", "[50]"));
		JTextArea text = new JTextArea("Deutschland \r\n" + "Innerhalb Deutschlands versende ich die Boxenschilder"
				+ " ca 10-12 Tage nach Geldeingang. Versand wird "
				+ "via Deutsche Post (Einschreiben) oder ab 3 Schildern "
				+ "via DHL inkl. Sendungsnummer. Die Lieferzeit " + "betr�gt 2-3 Werktage.\r\n" + "\r\n"
				+ "Versandkosten 4,90�\r\n" + "\r\n" + "Europa\r\n"
				+ "In europ�ische L�nder versende ich die Boxenschilder"
				+ " ca 10-14 Tage nach dem Bestelleingang. Versand wird "
				+ "via Deutsche Post (Einschreiben) oder ab 3 Schildern"
				+ " via DHL inkl. Sendungsnummer. Die Lieferzeit betr�gt" + " 5-7 Werktage.\r\n" + "\r\n"
				+ "Versandkosten 8,90�\r\n" + "\r\n" + "F�r Sch�den oder Verlust auf dem Transportweg"
				+ " �bernehme ich die Haftung. Ich erstatte entweder"
				+ " das Geld zur�ck oder drucke das Schild auf meine"
				+ " Kosten erneut. Sollte das Schild 20 Tage nach " + "Geldeingang noch nicht bei dir angekommen sein, "
				+ "schreibe mir bitte eine " + "E-Mail an info@sophiekunterbunt.de");
		panelVersandUndLieferzeit.add(text);
		text.setBorder(null);
		text.setBackground(new Color(214, 217, 223));
		return panelVersandUndLieferzeit;
	}

	static JPanel getPanelBezahlmethoden() {
		JPanel panelBezahlmethoden = new JPanel(new MigLayout("", "[50]", "[50]"));
		JTextArea text = new JTextArea("PayPal\r\n" + "Mit PayPal zahlen Sie bargeldlos ganz einfach "
				+ "und sicher. Zur Nutzung legen Sie einmalig ein " + "PayPal-Konto an, indem Sie Ihre Bank- oder"
				+ " Kreditkartendaten hinterlegen � so m�ssen " + "Sie diese nicht bei jedem Kauf neu eingeben. "
				+ "Sie bezahlen dann durch Angabe Ihrer " + "E-Mail-Adresse und eines Passworts und "
				+ "erhalten per E-Mail eine Zahlungsbest�tigung. " + "Anschlie�end wird Ihre Bestellung "
				+ "sofort bearbeitet.\r\n" + "\r\n" + "�berweisung\r\n" + "Bei Bezahlung mit Vorkasse �berweisen "
				+ "Sie den Betrag innerhalb von sieben " + "Kalendertagen. So lange ist die Ware f�r Sie "
				+ "reserviert. Der zu zahlende Betrag setzt sich " + "aus dem Warenwert und anfallenden "
				+ "Versand- und Servicekosten zusammen.\r\n" + "Die Zahlungsverbindung und den Verwendungszweck"
				+ " erhalten Sie nach Absenden der " + "Bestellung per E-Mail.");
		panelBezahlmethoden.add(text);
		text.setBorder(null);
		text.setBackground(new Color(214, 217, 223));
		return panelBezahlmethoden;
	}

	static JPanel getPanelWiderrufsbelehrung() {
		JPanel panelWiderrufsbelehrung = new JPanel(new MigLayout("", "[10]", "[10]"));
		JTextArea text = new JTextArea("Alle Produkte, mit" + " Ausnahme f�r den Kunden individuell erstellte"
				+ " Artikel, welche Sie bei Sophie Kunterbunt bestellt"
				+ " haben, k�nnen innerhalb von 14 Tagen, nach Erhalt"
				+ " der Ware, ohne Angabe von Gr�nden, zur�ckgegeben"
				+ " werden. Die Frist beginnt mit Erhalt der Ware. " + "Zur Wahrung der Widerrufsfrist gen�gt die "
				+ "rechtzeitige Absendung des Widerrufs in" + " Textform (z.B.: Brief oder E-Mail). Der Widerruf"
				+ " ist zu richten an:\r\n" + "\r\n" + "Sophie Kunterbunt\r\n" + "Sophie Frey\r\n"
				+ "Hallberger Zeile 17\r\n" + "12437 Berlin\r\n" + "\r\n"
				+ "Vom Kunden geleistete Zahlungen werden innerhalb "
				+ "von 7 Werktagen nach Erhalt der zur�ckgesendeten "
				+ "Ware bei �berweisungen per �berweisung auf ein " + "vom Kunden zu benennendes Konto geleistet. "
				+ "Bei Zahlungen �ber Paypal werden die vom Kunden" + " geleisteten Zahlungen mittels Paypal innerhalb"
				+ " von 5 Werktagen nach Erhalt der " + "Ware zur�ckerstattet. Eventuell anfallende"
				+ " Geb�hren sind vom K�ufer zu tragen. " + "Die R�cksendung hat an die oben genannte "
				+ "Firmenanschrift zu erfolgen. " + "Die R�cksendungskosten sind vom "
				+ "K�ufer zu tragen. Die R�cksendung " + "muss ausreichend frankiert sein.\r\n" + "\r\n"
				+ "Die R�cksendung der Ware hat in der" + " Originalverpackung zu erfolgen. "
				+ "Sollte dies nicht m�glich sein, " + "so muss der Kunde f�r eine" + " Verpackung sorgen, welche eine "
				+ "Besch�digung der Ware ausschlie�t. " + "F�r Sch�den an der Ware, die auf eine "
				+ "unzureichende Verpackung zur�ckzuf�hren ist," + " haftet der Kunde.\r\n" + "\r\n"
				+ "Offensichtliche M�ngel (insbesondere Besch�digungen,"
				+ " Falschlieferungen oder Mengenabweichungen), " + "Transportsch�den oder sonstige M�ngel m�ssen "
				+ "Sophie Kunterbunt unverz�glich nach Erhalt" + " der Ware schriftlich mitgeteilt werden. "
				+ "Die Mitteilung per " + "E-Mail an info@sophiekunterbunt.de ist " + "ausreichend.\r\n" +

				"\r\n" + "Ausgenommen von der R�cknahme sind alle Waren und "
				+ "Dienstleistungen, welche nach Kundenw�nschen" + " angefertigt werden.");
		panelWiderrufsbelehrung.add(text);
		text.setBorder(null);
		text.setBackground(new Color(214, 217, 223));
		return panelWiderrufsbelehrung;
	}

	static JPanel getPanelDatenschutz() {
		JPanel panelDatenschutz = new JPanel(new MigLayout("", "[10]", "[10]"));
		JTextArea text = new JTextArea("Die Betreiber dieser " + "Seiten nehmen den Schutz Ihrer pers�nlichen"
				+ " Daten sehr ernst. Wir behandeln Ihre " + "personenbezogenen " + "Daten vertraulich und "
				+ "entsprechend der gesetzlichen Datenschutzvorschriften"
				+ " sowie dieser Datenschutzerkl�rung.<br>\r\n" + "Die Nutzung unserer "
				+ "Webseite ist in der Regel ohne" + " Angabe personenbezogener Daten m�glich. "
				+ "Soweit auf unseren Seiten personenbezogene Daten" + " (beispielsweise Name, Anschrift "
				+ "oder E-Mail-Adressen) " + "erhoben werden, erfolgt dies,"
				+ " soweit m�glich, stets auf freiwilliger Basis. " + "Diese Daten " + "werden ohne Ihre "
				+ "ausdr�ckliche Zustimmung nicht an Dritte" + " weitergegeben.\r\n"
				+ "Wir weisen darauf hin, dass die Daten�bertragung"
				+ " im Internet (z.B. bei der Kommunikation per E-Mail)" + " Sicherheitsl�cken aufweisen kann. "
				+ "Ein l�ckenloser Schutz der Daten vor dem Zugriff " + "durch Dritte " + "ist nicht m�glich.\r\n"
				+ "\r\n" + "Datenschutzerkl�rung\r\n" + "Wir freuen uns �ber Ihr Interesse " + "an unserem "
				+ "Online-Shop. Der Schutz Ihrer Privatsph�re ist "
				+ "f�r uns sehr wichtig. Nachstehend informieren wir"
				+ " Sie ausf�hrlich �ber den Umgang mit Ihren Daten." + "\r\n" + "\r\n" + " \r\n" + "\r\n"
				+ "1. Zugriffsdaten und Hosting\r\n" + "\r\n" + "Sie k�nnen unsere "
				+ "Webseiten besuchen, ohne Angaben " + "zu Ihrer Person zu machen. Bei jedem Aufruf einer"
				+ " Webseite " + "speichert der Webserver lediglich " + "automatisch ein sogenanntes Server-Logfile, "
				+ "das z.B. den Namen" + " der angeforderten Datei, "
				+ "Ihre IP-Adresse, Datum und Uhrzeit des Abrufs, "
				+ "�bertragene Datenmenge und den anfragenden Provider "
				+ "(Zugriffsdaten) enth�lt und den Abruf dokumentiert."
				+ "Diese Zugriffsdaten werden ausschlie�lich zum " + "Zwecke der "
				+ "Sicherstellung eines st�rungsfreien " + "Betriebs der Seite sowie der Verbesserung unseres "
				+ "Angebots ausgewertet. Dies dient gem�� Art. 6 Abs. "
				+ "1 S. 1 lit. f DSGVO der Wahrung unserer im Rahmen" + " einer " + "Interessensabw�gung �berwiegenden "
				+ "berechtigten Interessen an einer korrekten " + "Darstellung unseres"
				+ " Angebots. Alle Zugriffsdaten " + "werden sp�testens sieben Tage nach Ende Ihres" + " Seitenbesuchs "
				+ "gel�scht.\r\n" + "\r\n" + "Hostingdienstleistungen durch einen Drittanbieter\r\n"
				+ "Im Rahmen einer Verarbeitung in unserem Auftrag " + "erbringt ein "
				+ "Drittanbieter f�r uns die Dienste " + "zum Hosting und zur Darstellung der Webseite. "
				+ "Dies dient der" + " Wahrung unserer im Rahmen einer "
				+ "Interessensabw�gung �berwiegenden berechtigten "
				+ "Interessen an einer korrekten Darstellung unseres "
				+ "Angebots. Alle Daten, die im Rahmen der Nutzung " + "dieser Webseite"
				+ " oder in daf�r vorgesehenen " + "Formularen im Onlineshop wie folgend beschrieben "
				+ "erhoben werden, werden auf seinen Servern " + "verarbeitet. Eine Verarbeitung auf anderen "
				+ "Servern findet nur" + " in dem hier erl�uterten " + "Rahmen statt.\r\n" + "\r\n"
				+ "Dieser Dienstleister sitzt innerhalb" + " eines Landes"
				+ " der Europ�ischen Union oder des Europ�ischen " + "Wirtschaftsraums." + "\r\n" +

				"2. Datenerhebung und -verwendung zur Vertragsabwicklung und bei " + "Er�ffnung eines Kundenkontos\r\n"
				+ "Wir erheben personenbezogene Daten, wenn Sie uns " + "diese im "
				+ "Rahmen Ihrer Bestellung, bei einer " + "Kontaktaufnahme mit uns (z.B. per Kontaktformular"
				+ " oder E-Mail) oder bei Er�ffnung eines Kundenkontos"
				+ " freiwillig mitteilen. Pflichtfelder werden als" + " solche"
				+ " gekennzeichnet, da wir in diesen F�llen" + " die Daten zwingend zur Vertragsabwicklung, bzw. "
				+ "zur Bearbeitung Ihrer Kontaktaufnahme oder Er�ffnung "
				+ "des Kundenkontos ben�tigen und Sie ohne deren Angabe"
				+ " die Bestellung und/ oder die Kontoer�ffnung " + "nicht " + "abschlie�en, bzw. die Kontaktaufnahme "
				+ "nicht versenden k�nnen. Welche Daten erhoben werden,"
				+ " ist aus den jeweiligen Eingabeformularen ersichtlich. Wir verwenden"
				+ " die von ihnen mitgeteilten Daten gem�� Art. 6 Abs. 1 S. 1 lit. "
				+ "b DSGVO zur Vertragsabwicklung und Bearbeitung Ihrer Anfragen. "
				+ "Nach vollst�ndiger Abwicklung des Vertrages oder L�schung Ihres"
				+ " Kundenkontos werden Ihre Daten f�r die weitere Verarbeitung "
				+ "eingeschr�nkt und nach Ablauf der steuer- und handelsrechtlichen "
				+ "Aufbewahrungsfristen gel�scht, sofern Sie nicht ausdr�cklich in eine"
				+ " weitere Nutzung Ihrer Daten eingewilligt haben oder wir uns eine "
				+ "dar�ber hinausgehende Datenverwendung vorbehalten, die gesetzlich"
				+ " erlaubt ist und �ber die wir Sie in dieser Erkl�rung informieren. "
				+ "Die L�schung Ihres Kundenkontos ist jederzeit m�glich und kann"
				+ " entweder durch eine Nachricht an die unten beschriebene "
				+ "Kontaktm�glichkeit oder �ber eine daf�r vorgesehene Funktion " + "im Kundenkonto erfolgen.\r\n"
				+ "3. Datenweitergabe\r\n" + "Zur Vertragserf�llung gem�� Art." + " 6 Abs. 1 S. 1 lit. b "
				+ "DSGVO geben wir Ihre Daten an das mit der Lieferung beauftragte"
				+ " Versandunternehmen weiter, soweit dies zur Lieferung bestellter "
				+ "Waren erforderlich ist. Je nach dem, welchen Zahlungsdienstleister"
				+ " Sie im Bestellprozess ausw�hlen, geben wir zur Abwicklung von"
				+ " Zahlungen die hierf�r erhobenen Zahlungsdaten an das mit der Zahlung beauftragte Kreditinstitut und ggf. von uns beauftragte Zahlungsdienstleister weiter bzw. an den ausgew�hlten Zahlungsdienst. Zum Teil erheben die ausgew�hlten Zahlungsdienstleister diese Daten auch selbst, soweit Sie dort ein Konto anlegen. In diesem Fall m�ssen Sie sich im Bestellprozess mit Ihren Zugangsdaten bei dem Zahlungsdienstleister anmelden. Es gilt insoweit die Datenschutzerkl�rung des jeweiligen Zahlungsdienstleisters.\r\n"
				+ "4. Cookies \r\n" + "Um den Besuch unserer Website attraktiv zu" + " gestalten"
				+ " und die Nutzung bestimmter Funktionen zu erm�glichen, "
				+ "um passende Produkte anzuzeigen oder zur Marktforschung "
				+ "verwenden wir auf verschiedenen Seiten sogenannte Cookies. "
				+ "Dies dient der Wahrung unserer im Rahmen einer Interessensabw�gung "
				+ "�berwiegenden berechtigten Interessen an einer optimierten "
				+ "Darstellung unseres Angebots gem�� Art. 6 Abs. 1 S. 1 lit. f DSGVO."
				+ " Cookies sind kleine Textdateien, die automatisch auf Ihrem "
				+ "Endger�t gespeichert werden. Einige der von uns verwendeten Cookies"
				+ " werden nach Ende der Browser-Sitzung, also nach Schlie�en "
				+ "Ihres Browsers, wieder gel�scht (sog. Sitzungs-Cookies). Andere "
				+ "Cookies verbleiben auf Ihrem Endger�t und erm�glichen uns, Ihren"
				+ " Browser beim n�chsten Besuch wiederzuerkennen (persistente Cookies). Die Dauer der Speicherung k�nnen Sie der �bersicht in den Cookie-Einstellungen Ihres Webbrowsers entnehmen. Sie k�nnen Ihren Browser so einstellen, dass Sie �ber das Setzen von Cookies informiert werden und einzeln �ber deren Annahme entscheiden oder die Annahme von Cookies f�r bestimmte F�lle oder generell ausschlie�en. Jeder Browser unterscheidet sich in der Art, wie er die Cookie-Einstellungen verwaltet. Diese ist in dem Hilfemen� jedes Browsers beschrieben, welches Ihnen erl�utert, wie Sie Ihre Cookie-Einstellungen �ndern k�nnen. Diese finden Sie f�r die jeweiligen Browser unter den folgenden Links:\r\n"
				+ "Internet Explorer�: " + "http://windows.microsoft.com/de-DE/windows-"
				+ "vista/Block-or-allow-cookies\r\n" + "Safari�: " + "https://support.apple.com/kb/ph21411?locale="
				+ "de_DE\r\n" + "Chrome�: http://support.google.com/chrome"
				+ "/bin/answer.py?hl=de&hlrm=en&answer=95647\r\n" + "Firefox� https://support.mozilla.org/de/kb/"
				+ "cookies-erlauben-und-ablehnen\r\n" + "Opera� : http://help.opera.com/Windows/"
				+ "10.20/de/cookies.htmlBei der Nichtannahme von" + " Cookies kann die Funktionalit�t unserer Website"
				+ " eingeschr�nkt sein.\r\n" + " \r\n" + "\r\n" + "5. Social Media PlugIns\r\n" + "\r\n"
				+ "Verwendung von Social Plugins von Facebook, " + "Instagram unter Verwendung der Shariff-L�sung."
				+ "Auf unserer Website werden Social Buttons von " + "sozialen Netzwerken verwendet.\r\n" + "\r\n"
				+ "Dies dient der Wahrung unserer im Rahmen einer" + " Interessensabw�gung �berwiegenden berechtigten"
				+ " Interessen an einer optimalen Vermarktung unseres Angebots "
				+ "gem�� Art. 6 Abs. 1 S. 1 lit. f DSGVO. Um den Schutz Ihrer "
				+ "Daten beim Besuch unserer Website zu erh�hen, sind diese "
				+ "Buttons nicht uneingeschr�nkt als Plugins, sondern lediglich unter"
				+ " Verwendung eines HTML-Links in die Seite eingebunden. "
				+ "Diese Einbindung gew�hrleistet, dass beim Aufruf einer "
				+ "Seite unseres Webauftritts, die solche Buttons enth�lt, noch"
				+ " keine Verbindung mit den Servern des Anbieters des jeweiligen "
				+ "sozialen Netzwerks hergestellt wird.\r\n" + "\r\n"
				+ "Klicken Sie auf einen der Buttons, �ffnet sich " + "ein neues Fenster Ihres Browsers und ruft die "
				+ "Seite des jeweiligen Diensteanbieters auf, " + "auf der Sie (ggf. nach Eingabe Ihrer Login-Daten)"
				+ " z.B. den Like- oder Share-Button bet�tigen k�nnen." + "\r\n" + "\r\n"
				+ "Zweck und Umfang der Datenerhebung und die weitere "
				+ "Verarbeitung und Nutzung der Daten durch die Anbieter auf deren "
				+ "Seiten sowie eine Kontaktm�glichkeit und Ihre diesbez�glichen"
				+ " Rechte und Einstellungsm�glichkeiten zum Schutz Ihrer Privatsph�re"
				+ " entnehmen Sie bitte den Datenschutzhinweisen der Anbieter."
				+ " http://www.facebook.com/policy.php\r\n" + "https://help.instagram.com/155833707900388\r\n" + "\r\n"
				+ " \r\n" + "\r\n" + "6. Versand von Bewertungserinnerungen per E-Mail\r\n"
				+ "Sofern Sie uns hierzu w�hrend oder nach Ihrer "
				+ "Bestellung Ihre ausdr�ckliche Einwilligung gem�� Art. 6 Abs. 1 S. 1"
				+ " lit. a DSGVO erteilt haben, verwenden wir Ihre E-Mail-Adresse zur"
				+ " Erinnerung zur Abgabe einer Bewertung Ihrer Bestellung �ber das"
				+ " von uns eingesetzte Bewertungssystem.\r\n" + "Diese Einwilligung kann jederzeit durch eine "
				+ "Nachricht an die unten beschriebene" + " Kontaktm�glichkeit widerrufen werden.\r\n"
				+ "7. Kontaktm�glichkeiten und Ihre Rechte\r\n" + "\r\n"
				+ "Als Betroffener haben Sie folgende Rechte:\r\n" + "\r\n"
				+ "gem�� Art. 15 DSGVO das Recht, in dem dort " + "bezeichneten Umfang Auskunft �ber Ihre von "
				+ "uns verarbeiteten personenbezogenen Daten zu " + "verlangen;\r\n"
				+ "gem�� Art. 16 DSGVO das Recht, unverz�glich die " + "Berichtigung unrichtiger oder Vervollst�ndigung"
				+ " Ihrer bei uns gespeicherten personenbezogenen Daten" + " zu verlangen;\r\n"
				+ "gem�� Art. 17 DSGVO das Recht, die L�schung Ihrer"
				+ " bei uns gespeicherten personenbezogenen Daten zu "
				+ "verlangen, soweit nicht die weitere Verarbeitung\r\n"
				+ "� zur Aus�bung des Rechts auf freie Meinungs�u�erung" + " und Information;\r\n"
				+ "� zur Erf�llung einer rechtlichen Verpflichtung;\r\n"
				+ "� aus Gr�nden des �ffentlichen Interesses oder\r\n"
				+ "� zur Geltendmachung, Aus�bung oder Verteidigung " + "von Rechtsanspr�chen\r\n"
				+ "erforderlich ist;\r\n" + "gem�� Art. 18 DSGVO das Recht, die" + " Einschr�nkung "
				+ "der Verarbeitung Ihrer personenbezogenen Daten zu" + " verlangen, soweit\r\n"
				+ "� die Richtigkeit der Daten von Ihnen bestritten " + "wird;\r\n"
				+ "� die Verarbeitung unrechtm��ig ist, Sie aber deren " + "L�schung ablehnen;\r\n"
				+ "� wir die Daten nicht mehr ben�tigen, Sie diese jedoch "
				+ "zur Geltendmachung, Aus�bung oder Verteidigung von " + "Rechtsanspr�chen ben�tigen oder\r\n"
				+ "� Sie gem�� Art. 21 DSGVO Widerspruch gegen die" + " Verarbeitung eingelegt haben;\r\n"
				+ "gem�� Art. 20 DSGVO das Recht, Ihre personenbezogenen "
				+ "Daten, die Sie uns bereitgestellt haben, in einem"
				+ " strukturierten, g�ngigen und maschinenlesebaren"
				+ " Format zu erhalten oder die �bermittlung an einen" + " anderen Verantwortlichen zu verlangen;\r\n"
				+ "gem�� Art. 77 DSGVO das Recht, sich bei einer "
				+ "Aufsichtsbeh�rde zu beschweren. In der Regel k�nnen "
				+ "Sie sich hierf�r an die Aufsichtsbeh�rde Ihres" + " �blichen Aufenthaltsortes oder Arbeitsplatzes "
				+ "oder unseres Unternehmenssitzes wenden.\r\n" + "Bei Fragen zur Erhebung, Verarbeitung oder Nutzung "
				+ "Ihrer personenbezogenen Daten, bei Ausk�nften, "
				+ "Berichtigung, Sperrung oder L�schung von Daten sowie"
				+ " Widerruf erteilter Einwilligungen oder Widerspruch "
				+ "gegen eine bestimmte Datenverwendung wenden Sie" + " sich bitte direkt an uns �ber die Kontaktdaten"
				+ " in unserem Impressum.\r\n" + "\r\n" + "******************************************************"
				+ "**************\r\n" + "\r\n" + "Widerspruchsrecht\r\n" + "\r\n"
				+ "Soweit wir zur Wahrung unserer im Rahmen einer " + "Interessensabw�gung �berwiegenden berechtigten"
				+ " Interessen personenbezogene Daten wie oben" + " erl�utert verarbeiten, k�nnen Sie dieser "
				+ "Verarbeitung mit Wirkung f�r die Zukunft " + "widersprechen. Erfolgt die Verarbeitung zu"
				+ " Zwecken des Direktmarketings, k�nnen Sie dieses " + "Recht jederzeit wie oben beschrieben aus�ben. "
				+ "Soweit die Verarbeitung zu anderen Zwecken erfolgt, "
				+ "steht Ihnen ein Widerspruchsrecht nur bei Vorliegen "
				+ "von Gr�nden, die sich aus Ihrer besonderen Situation" + " ergeben, zu.\r\n" + "\r\n"
				+ "Nach Aus�bung Ihres Widerspruchsrechts werden wir Ihre"
				+ " personenbezogenen Daten nicht weiter zu diesen " + "Zwecken verarbeiten, es sei denn, wir k�nnen "
				+ "zwingende schutzw�rdige Gr�nde f�r die Verarbeitung"
				+ " nachweisen, die Ihre Interessen, Rechte und "
				+ "Freiheiten �berwiegen, oder wenn die Verarbeitung der"
				+ " Geltendmachung, Aus�bung oder Verteidigung von " + "Rechtsanspr�chen dient.\r\n" + "\r\n"
				+ "Dies gilt nicht, wenn die Verarbeitung zu Zwecken "
				+ "des Direktmarketings erfolgt. Dann werden wir Ihre"
				+ " personenbezogenen Daten nicht weiter zu diesem " + "Zweck verarbeiten.\r\n" + "\r\n" + " \r\n"
				+ "\r\n" + "******************************************************" + "**************\r\n" + "\r\n"
				+ "Datenschutzerkl�rung erstellt mit dem Trusted Shops "
				+ "Rechtstexter in Kooperation mit Wilde Beuger " + "Solmecke Rechtsanw�lte.");
		panelDatenschutz.add(text);
		text.setBorder(null);
		text.setBackground(new Color(214, 217, 223));
		return panelDatenschutz;
	}

	static JPanel getPanelAgbs() {
		JPanel panelAgbs = new JPanel(new MigLayout("", "[10]", "[10]"));
		JTextArea text = new JTextArea("1. Geltungsbereich\r\n" + "\r\n"
				+ "F�r alle Bestellungen �ber unseren Online-Shop gelten die nachfolgenden" 
				+ "AGB.\r\n" + "\r\n"
				+ "2. Vertragspartner, Vertragsschluss\r\n" + "\r\n"
				+ "Der Kaufvertrag kommt zustande mit Sophie Kunterbunt.\r\n" + "\r\n"
				+ "Mit Einstellung der Produkte in den Online-Shop geben wir ein"
				+ " verbindliches Angebot zum Vertragsschluss �ber diese Artikel ab. "
				+ "Sie k�nnen unsere Produkte zun�chst unverbindlich in den "
				+ "Warenkorb legen und Ihre Eingaben vor Absenden Ihrer verbindlichen"
				+ " Bestellung jederzeit korrigieren, indem Sie die hierf�r im"
				+ " Bestellablauf vorgesehenen und erl�uterten Korrekturhilfen nutzen. "
				+ "Der Vertrag kommt zustande, indem Sie durch Anklicken des "
				+ "Bestellbuttons das Angebot �ber die im Warenkorb enthaltenen "
				+ "Waren annehmen. Unmittelbar nach dem Absenden der Bestellung "
				+ "erhalten Sie noch einmal eine Best�tigung per E-Mail.\r\n" + "\r\n"
				+ "3. Vertragssprache, Vertragstextspeicherung\r\n" + "\r\n" + "Die f�r den " 
				+ "Vertragsschluss zur "
				+ "Verf�gung stehende Sprache ist Deutsch.\r\n" 
				+ "Der Vertragstext wird von uns nicht gespeichert.\r\n"
				+ "\r\n" + "4. Lieferbedingungen\r\n" + "\r\n"
				+ "Zuz�glich zu den angegebenen Produktpreisen kommen noch Versandkosten"
				+ " hinzu. N�heres zur H�he der Versandkosten erfahren Sie bei den " 
				+ "Angeboten.\r\n" + "\r\n"
				+ "Sie haben grunds�tzlich die M�glichkeit der Abholung bei "
				+ "Sophie Kunterbunt / Sophie Frey, Hallberger Zeile 17 , 12437 Berlin,"
				+ " Deutschland zu den nachfolgend angegebenen Gesch�ftszeiten: " 
				+ "Nur nach R�cksprache.");
		panelAgbs.add(text);
		text.setBorder(null);
		text.setBackground(new Color(214, 217, 223));
		return panelAgbs;
	}

	static JPanel getPanelMaterialien() {
		JPanel panelMaterialien = new JPanel(new MigLayout("", "[10]", "[10]"));
		JTextArea text = new JTextArea("Die Acrylglas Schilder bestehen aus einer 4 mm \r\n"
				+ "dicken Kunstglas Platte. Im Gegensatz zu normalem Glas,\r\n" 
				+ "ist Acrylglas deutlich widerstandsf�higer und robuster.\r\n"
				+ "Diese Schilder eignen sich perfekt f�r eine belebte Stallgasse,\r\n"
				+ "da sie auch bei starker Beanspruchung, viel Ber�hrung und vor \r\n"
				+ "allem viel Staub nicht kaputt gehen oder verblassen. \r\n"
				+ "Durch die glatte, beschichtete Oberfl�che sieht es besonders \r\n"
				+ "hochwertig aus. \r\n"
				+ "Acrylglas ist au�erdem mehrere Jahre Wetter-und UV Best�ndig.\r\n" 
				+ "Mein absoluter Favorit.\r\n");
		panelMaterialien.add(text);
		text.setBorder(null);
		text.setBackground(new Color(214, 217, 223));
		return panelMaterialien;
	}

	static JPanel getPanelGalerie() {
		JPanel panelGalerie = new JPanel(new MigLayout("", "[10]", "[10]"));
		JTextArea text = new JTextArea("Galerie Fotos sind hier auf meiner Seite \r\n"
		+ "zusehen.\r\n");
		panelGalerie.add(text);
		text.setBorder(null);
		text.setBackground(new Color(214, 217, 223));
		return panelGalerie;

	}

	static JPanel getPanelKundenstimmen() {
		JPanel panelKundenstimmen = new JPanel(new MigLayout("", "[10]", "[10]"));
		JTextArea text = new JTextArea("CAROLIN L. \r\n"
				+ "\r\n"
				+ "Heute konnte ich endlich mein\r\n"
				+ " Boxenschild, bzw. eigentlich Offenstallschild, auspacken!\r\n"
				+ " Und was soll ich sagen? Ich bin begeistert!  \r\n"
				+ " 3 Die Qualit�t und Verarbeitung des Schildes ist einfach top.\r\n"
				+ " Sophie hat meine Bilder auf dem Schild richtig sch�n in Szene\r\n"
				+ " gesetzt und ist auf W�nsche eingegangen. Verpackt \r\n"
				+ " wurde das Ganze auch richtig s�� und so das nichts \r\n"
				+ " kaputt oder zerkratzen konnte. Die Kommunikation war\r\n "
				+ " einwandfrei und ich w�rde immer wieder hier ein Schild " + "bestellen.\r\n");
		panelKundenstimmen.add(text);
		text.setBorder(null);
		text.setBackground(new Color(214, 217, 223));
		return panelKundenstimmen;
	}

}
