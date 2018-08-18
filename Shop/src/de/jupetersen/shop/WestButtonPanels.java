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
				+ "\r\n" + "E-Mail: info@sophiekunterbunt.de\r\n" + "\r\n" + "Kleinunternehmer gemäß § 19 UStG\r\n"
				+ "\r\n" + "Finanzamt: Treptow, Köpenick / Berlin");
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
				+ "via DHL inkl. Sendungsnummer. Die Lieferzeit " + "beträgt 2-3 Werktage.\r\n" + "\r\n"
				+ "Versandkosten 4,90€\r\n" + "\r\n" + "Europa\r\n"
				+ "In europäische Länder versende ich die Boxenschilder"
				+ " ca 10-14 Tage nach dem Bestelleingang. Versand wird "
				+ "via Deutsche Post (Einschreiben) oder ab 3 Schildern"
				+ " via DHL inkl. Sendungsnummer. Die Lieferzeit beträgt" + " 5-7 Werktage.\r\n" + "\r\n"
				+ "Versandkosten 8,90€\r\n" + "\r\n" + "Für Schäden oder Verlust auf dem Transportweg"
				+ " übernehme ich die Haftung. Ich erstatte entweder"
				+ " das Geld zurück oder drucke das Schild auf meine"
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
				+ " Kreditkartendaten hinterlegen – so müssen " + "Sie diese nicht bei jedem Kauf neu eingeben. "
				+ "Sie bezahlen dann durch Angabe Ihrer " + "E-Mail-Adresse und eines Passworts und "
				+ "erhalten per E-Mail eine Zahlungsbestätigung. " + "Anschließend wird Ihre Bestellung "
				+ "sofort bearbeitet.\r\n" + "\r\n" + "Überweisung\r\n" + "Bei Bezahlung mit Vorkasse überweisen "
				+ "Sie den Betrag innerhalb von sieben " + "Kalendertagen. So lange ist die Ware für Sie "
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
		JTextArea text = new JTextArea("Alle Produkte, mit" + " Ausnahme für den Kunden individuell erstellte"
				+ " Artikel, welche Sie bei Sophie Kunterbunt bestellt"
				+ " haben, können innerhalb von 14 Tagen, nach Erhalt"
				+ " der Ware, ohne Angabe von Gründen, zurückgegeben"
				+ " werden. Die Frist beginnt mit Erhalt der Ware. " + "Zur Wahrung der Widerrufsfrist genügt die "
				+ "rechtzeitige Absendung des Widerrufs in" + " Textform (z.B.: Brief oder E-Mail). Der Widerruf"
				+ " ist zu richten an:\r\n" + "\r\n" + "Sophie Kunterbunt\r\n" + "Sophie Frey\r\n"
				+ "Hallberger Zeile 17\r\n" + "12437 Berlin\r\n" + "\r\n"
				+ "Vom Kunden geleistete Zahlungen werden innerhalb "
				+ "von 7 Werktagen nach Erhalt der zurückgesendeten "
				+ "Ware bei Überweisungen per Überweisung auf ein " + "vom Kunden zu benennendes Konto geleistet. "
				+ "Bei Zahlungen über Paypal werden die vom Kunden" + " geleisteten Zahlungen mittels Paypal innerhalb"
				+ " von 5 Werktagen nach Erhalt der " + "Ware zurückerstattet. Eventuell anfallende"
				+ " Gebühren sind vom Käufer zu tragen. " + "Die Rücksendung hat an die oben genannte "
				+ "Firmenanschrift zu erfolgen. " + "Die Rücksendungskosten sind vom "
				+ "Käufer zu tragen. Die Rücksendung " + "muss ausreichend frankiert sein.\r\n" + "\r\n"
				+ "Die Rücksendung der Ware hat in der" + " Originalverpackung zu erfolgen. "
				+ "Sollte dies nicht möglich sein, " + "so muss der Kunde für eine" + " Verpackung sorgen, welche eine "
				+ "Beschädigung der Ware ausschließt. " + "Für Schäden an der Ware, die auf eine "
				+ "unzureichende Verpackung zurückzuführen ist," + " haftet der Kunde.\r\n" + "\r\n"
				+ "Offensichtliche Mängel (insbesondere Beschädigungen,"
				+ " Falschlieferungen oder Mengenabweichungen), " + "Transportschäden oder sonstige Mängel müssen "
				+ "Sophie Kunterbunt unverzüglich nach Erhalt" + " der Ware schriftlich mitgeteilt werden. "
				+ "Die Mitteilung per " + "E-Mail an info@sophiekunterbunt.de ist " + "ausreichend.\r\n" +

				"\r\n" + "Ausgenommen von der Rücknahme sind alle Waren und "
				+ "Dienstleistungen, welche nach Kundenwünschen" + " angefertigt werden.");
		panelWiderrufsbelehrung.add(text);
		text.setBorder(null);
		text.setBackground(new Color(214, 217, 223));
		return panelWiderrufsbelehrung;
	}

	static JPanel getPanelDatenschutz() {
		JPanel panelDatenschutz = new JPanel(new MigLayout("", "[10]", "[10]"));
		JTextArea text = new JTextArea("Die Betreiber dieser " + "Seiten nehmen den Schutz Ihrer persönlichen"
				+ " Daten sehr ernst. Wir behandeln Ihre " + "personenbezogenen " + "Daten vertraulich und "
				+ "entsprechend der gesetzlichen Datenschutzvorschriften"
				+ " sowie dieser Datenschutzerklärung.<br>\r\n" + "Die Nutzung unserer "
				+ "Webseite ist in der Regel ohne" + " Angabe personenbezogener Daten möglich. "
				+ "Soweit auf unseren Seiten personenbezogene Daten" + " (beispielsweise Name, Anschrift "
				+ "oder E-Mail-Adressen) " + "erhoben werden, erfolgt dies,"
				+ " soweit möglich, stets auf freiwilliger Basis. " + "Diese Daten " + "werden ohne Ihre "
				+ "ausdrückliche Zustimmung nicht an Dritte" + " weitergegeben.\r\n"
				+ "Wir weisen darauf hin, dass die Datenübertragung"
				+ " im Internet (z.B. bei der Kommunikation per E-Mail)" + " Sicherheitslücken aufweisen kann. "
				+ "Ein lückenloser Schutz der Daten vor dem Zugriff " + "durch Dritte " + "ist nicht möglich.\r\n"
				+ "\r\n" + "Datenschutzerklärung\r\n" + "Wir freuen uns über Ihr Interesse " + "an unserem "
				+ "Online-Shop. Der Schutz Ihrer Privatsphäre ist "
				+ "für uns sehr wichtig. Nachstehend informieren wir"
				+ " Sie ausführlich über den Umgang mit Ihren Daten." + "\r\n" + "\r\n" + " \r\n" + "\r\n"
				+ "1. Zugriffsdaten und Hosting\r\n" + "\r\n" + "Sie können unsere "
				+ "Webseiten besuchen, ohne Angaben " + "zu Ihrer Person zu machen. Bei jedem Aufruf einer"
				+ " Webseite " + "speichert der Webserver lediglich " + "automatisch ein sogenanntes Server-Logfile, "
				+ "das z.B. den Namen" + " der angeforderten Datei, "
				+ "Ihre IP-Adresse, Datum und Uhrzeit des Abrufs, "
				+ "übertragene Datenmenge und den anfragenden Provider "
				+ "(Zugriffsdaten) enthält und den Abruf dokumentiert."
				+ "Diese Zugriffsdaten werden ausschließlich zum " + "Zwecke der "
				+ "Sicherstellung eines störungsfreien " + "Betriebs der Seite sowie der Verbesserung unseres "
				+ "Angebots ausgewertet. Dies dient gemäß Art. 6 Abs. "
				+ "1 S. 1 lit. f DSGVO der Wahrung unserer im Rahmen" + " einer " + "Interessensabwägung überwiegenden "
				+ "berechtigten Interessen an einer korrekten " + "Darstellung unseres"
				+ " Angebots. Alle Zugriffsdaten " + "werden spätestens sieben Tage nach Ende Ihres" + " Seitenbesuchs "
				+ "gelöscht.\r\n" + "\r\n" + "Hostingdienstleistungen durch einen Drittanbieter\r\n"
				+ "Im Rahmen einer Verarbeitung in unserem Auftrag " + "erbringt ein "
				+ "Drittanbieter für uns die Dienste " + "zum Hosting und zur Darstellung der Webseite. "
				+ "Dies dient der" + " Wahrung unserer im Rahmen einer "
				+ "Interessensabwägung überwiegenden berechtigten "
				+ "Interessen an einer korrekten Darstellung unseres "
				+ "Angebots. Alle Daten, die im Rahmen der Nutzung " + "dieser Webseite"
				+ " oder in dafür vorgesehenen " + "Formularen im Onlineshop wie folgend beschrieben "
				+ "erhoben werden, werden auf seinen Servern " + "verarbeitet. Eine Verarbeitung auf anderen "
				+ "Servern findet nur" + " in dem hier erläuterten " + "Rahmen statt.\r\n" + "\r\n"
				+ "Dieser Dienstleister sitzt innerhalb" + " eines Landes"
				+ " der Europäischen Union oder des Europäischen " + "Wirtschaftsraums." + "\r\n" +

				"2. Datenerhebung und -verwendung zur Vertragsabwicklung und bei " + "Eröffnung eines Kundenkontos\r\n"
				+ "Wir erheben personenbezogene Daten, wenn Sie uns " + "diese im "
				+ "Rahmen Ihrer Bestellung, bei einer " + "Kontaktaufnahme mit uns (z.B. per Kontaktformular"
				+ " oder E-Mail) oder bei Eröffnung eines Kundenkontos"
				+ " freiwillig mitteilen. Pflichtfelder werden als" + " solche"
				+ " gekennzeichnet, da wir in diesen Fällen" + " die Daten zwingend zur Vertragsabwicklung, bzw. "
				+ "zur Bearbeitung Ihrer Kontaktaufnahme oder Eröffnung "
				+ "des Kundenkontos benötigen und Sie ohne deren Angabe"
				+ " die Bestellung und/ oder die Kontoeröffnung " + "nicht " + "abschließen, bzw. die Kontaktaufnahme "
				+ "nicht versenden können. Welche Daten erhoben werden,"
				+ " ist aus den jeweiligen Eingabeformularen ersichtlich. Wir verwenden"
				+ " die von ihnen mitgeteilten Daten gemäß Art. 6 Abs. 1 S. 1 lit. "
				+ "b DSGVO zur Vertragsabwicklung und Bearbeitung Ihrer Anfragen. "
				+ "Nach vollständiger Abwicklung des Vertrages oder Löschung Ihres"
				+ " Kundenkontos werden Ihre Daten für die weitere Verarbeitung "
				+ "eingeschränkt und nach Ablauf der steuer- und handelsrechtlichen "
				+ "Aufbewahrungsfristen gelöscht, sofern Sie nicht ausdrücklich in eine"
				+ " weitere Nutzung Ihrer Daten eingewilligt haben oder wir uns eine "
				+ "darüber hinausgehende Datenverwendung vorbehalten, die gesetzlich"
				+ " erlaubt ist und über die wir Sie in dieser Erklärung informieren. "
				+ "Die Löschung Ihres Kundenkontos ist jederzeit möglich und kann"
				+ " entweder durch eine Nachricht an die unten beschriebene "
				+ "Kontaktmöglichkeit oder über eine dafür vorgesehene Funktion " + "im Kundenkonto erfolgen.\r\n"
				+ "3. Datenweitergabe\r\n" + "Zur Vertragserfüllung gemäß Art." + " 6 Abs. 1 S. 1 lit. b "
				+ "DSGVO geben wir Ihre Daten an das mit der Lieferung beauftragte"
				+ " Versandunternehmen weiter, soweit dies zur Lieferung bestellter "
				+ "Waren erforderlich ist. Je nach dem, welchen Zahlungsdienstleister"
				+ " Sie im Bestellprozess auswählen, geben wir zur Abwicklung von"
				+ " Zahlungen die hierfür erhobenen Zahlungsdaten an das mit der Zahlung beauftragte Kreditinstitut und ggf. von uns beauftragte Zahlungsdienstleister weiter bzw. an den ausgewählten Zahlungsdienst. Zum Teil erheben die ausgewählten Zahlungsdienstleister diese Daten auch selbst, soweit Sie dort ein Konto anlegen. In diesem Fall müssen Sie sich im Bestellprozess mit Ihren Zugangsdaten bei dem Zahlungsdienstleister anmelden. Es gilt insoweit die Datenschutzerklärung des jeweiligen Zahlungsdienstleisters.\r\n"
				+ "4. Cookies \r\n" + "Um den Besuch unserer Website attraktiv zu" + " gestalten"
				+ " und die Nutzung bestimmter Funktionen zu ermöglichen, "
				+ "um passende Produkte anzuzeigen oder zur Marktforschung "
				+ "verwenden wir auf verschiedenen Seiten sogenannte Cookies. "
				+ "Dies dient der Wahrung unserer im Rahmen einer Interessensabwägung "
				+ "überwiegenden berechtigten Interessen an einer optimierten "
				+ "Darstellung unseres Angebots gemäß Art. 6 Abs. 1 S. 1 lit. f DSGVO."
				+ " Cookies sind kleine Textdateien, die automatisch auf Ihrem "
				+ "Endgerät gespeichert werden. Einige der von uns verwendeten Cookies"
				+ " werden nach Ende der Browser-Sitzung, also nach Schließen "
				+ "Ihres Browsers, wieder gelöscht (sog. Sitzungs-Cookies). Andere "
				+ "Cookies verbleiben auf Ihrem Endgerät und ermöglichen uns, Ihren"
				+ " Browser beim nächsten Besuch wiederzuerkennen (persistente Cookies). Die Dauer der Speicherung können Sie der Übersicht in den Cookie-Einstellungen Ihres Webbrowsers entnehmen. Sie können Ihren Browser so einstellen, dass Sie über das Setzen von Cookies informiert werden und einzeln über deren Annahme entscheiden oder die Annahme von Cookies für bestimmte Fälle oder generell ausschließen. Jeder Browser unterscheidet sich in der Art, wie er die Cookie-Einstellungen verwaltet. Diese ist in dem Hilfemenü jedes Browsers beschrieben, welches Ihnen erläutert, wie Sie Ihre Cookie-Einstellungen ändern können. Diese finden Sie für die jeweiligen Browser unter den folgenden Links:\r\n"
				+ "Internet Explorer™: " + "http://windows.microsoft.com/de-DE/windows-"
				+ "vista/Block-or-allow-cookies\r\n" + "Safari™: " + "https://support.apple.com/kb/ph21411?locale="
				+ "de_DE\r\n" + "Chrome™: http://support.google.com/chrome"
				+ "/bin/answer.py?hl=de&hlrm=en&answer=95647\r\n" + "Firefox™ https://support.mozilla.org/de/kb/"
				+ "cookies-erlauben-und-ablehnen\r\n" + "Opera™ : http://help.opera.com/Windows/"
				+ "10.20/de/cookies.htmlBei der Nichtannahme von" + " Cookies kann die Funktionalität unserer Website"
				+ " eingeschränkt sein.\r\n" + " \r\n" + "\r\n" + "5. Social Media PlugIns\r\n" + "\r\n"
				+ "Verwendung von Social Plugins von Facebook, " + "Instagram unter Verwendung der Shariff-Lösung."
				+ "Auf unserer Website werden Social Buttons von " + "sozialen Netzwerken verwendet.\r\n" + "\r\n"
				+ "Dies dient der Wahrung unserer im Rahmen einer" + " Interessensabwägung überwiegenden berechtigten"
				+ " Interessen an einer optimalen Vermarktung unseres Angebots "
				+ "gemäß Art. 6 Abs. 1 S. 1 lit. f DSGVO. Um den Schutz Ihrer "
				+ "Daten beim Besuch unserer Website zu erhöhen, sind diese "
				+ "Buttons nicht uneingeschränkt als Plugins, sondern lediglich unter"
				+ " Verwendung eines HTML-Links in die Seite eingebunden. "
				+ "Diese Einbindung gewährleistet, dass beim Aufruf einer "
				+ "Seite unseres Webauftritts, die solche Buttons enthält, noch"
				+ " keine Verbindung mit den Servern des Anbieters des jeweiligen "
				+ "sozialen Netzwerks hergestellt wird.\r\n" + "\r\n"
				+ "Klicken Sie auf einen der Buttons, öffnet sich " + "ein neues Fenster Ihres Browsers und ruft die "
				+ "Seite des jeweiligen Diensteanbieters auf, " + "auf der Sie (ggf. nach Eingabe Ihrer Login-Daten)"
				+ " z.B. den Like- oder Share-Button betätigen können." + "\r\n" + "\r\n"
				+ "Zweck und Umfang der Datenerhebung und die weitere "
				+ "Verarbeitung und Nutzung der Daten durch die Anbieter auf deren "
				+ "Seiten sowie eine Kontaktmöglichkeit und Ihre diesbezüglichen"
				+ " Rechte und Einstellungsmöglichkeiten zum Schutz Ihrer Privatsphäre"
				+ " entnehmen Sie bitte den Datenschutzhinweisen der Anbieter."
				+ " http://www.facebook.com/policy.php\r\n" + "https://help.instagram.com/155833707900388\r\n" + "\r\n"
				+ " \r\n" + "\r\n" + "6. Versand von Bewertungserinnerungen per E-Mail\r\n"
				+ "Sofern Sie uns hierzu während oder nach Ihrer "
				+ "Bestellung Ihre ausdrückliche Einwilligung gemäß Art. 6 Abs. 1 S. 1"
				+ " lit. a DSGVO erteilt haben, verwenden wir Ihre E-Mail-Adresse zur"
				+ " Erinnerung zur Abgabe einer Bewertung Ihrer Bestellung über das"
				+ " von uns eingesetzte Bewertungssystem.\r\n" + "Diese Einwilligung kann jederzeit durch eine "
				+ "Nachricht an die unten beschriebene" + " Kontaktmöglichkeit widerrufen werden.\r\n"
				+ "7. Kontaktmöglichkeiten und Ihre Rechte\r\n" + "\r\n"
				+ "Als Betroffener haben Sie folgende Rechte:\r\n" + "\r\n"
				+ "gemäß Art. 15 DSGVO das Recht, in dem dort " + "bezeichneten Umfang Auskunft über Ihre von "
				+ "uns verarbeiteten personenbezogenen Daten zu " + "verlangen;\r\n"
				+ "gemäß Art. 16 DSGVO das Recht, unverzüglich die " + "Berichtigung unrichtiger oder Vervollständigung"
				+ " Ihrer bei uns gespeicherten personenbezogenen Daten" + " zu verlangen;\r\n"
				+ "gemäß Art. 17 DSGVO das Recht, die Löschung Ihrer"
				+ " bei uns gespeicherten personenbezogenen Daten zu "
				+ "verlangen, soweit nicht die weitere Verarbeitung\r\n"
				+ "– zur Ausübung des Rechts auf freie Meinungsäußerung" + " und Information;\r\n"
				+ "– zur Erfüllung einer rechtlichen Verpflichtung;\r\n"
				+ "– aus Gründen des öffentlichen Interesses oder\r\n"
				+ "– zur Geltendmachung, Ausübung oder Verteidigung " + "von Rechtsansprüchen\r\n"
				+ "erforderlich ist;\r\n" + "gemäß Art. 18 DSGVO das Recht, die" + " Einschränkung "
				+ "der Verarbeitung Ihrer personenbezogenen Daten zu" + " verlangen, soweit\r\n"
				+ "– die Richtigkeit der Daten von Ihnen bestritten " + "wird;\r\n"
				+ "– die Verarbeitung unrechtmäßig ist, Sie aber deren " + "Löschung ablehnen;\r\n"
				+ "– wir die Daten nicht mehr benötigen, Sie diese jedoch "
				+ "zur Geltendmachung, Ausübung oder Verteidigung von " + "Rechtsansprüchen benötigen oder\r\n"
				+ "– Sie gemäß Art. 21 DSGVO Widerspruch gegen die" + " Verarbeitung eingelegt haben;\r\n"
				+ "gemäß Art. 20 DSGVO das Recht, Ihre personenbezogenen "
				+ "Daten, die Sie uns bereitgestellt haben, in einem"
				+ " strukturierten, gängigen und maschinenlesebaren"
				+ " Format zu erhalten oder die Übermittlung an einen" + " anderen Verantwortlichen zu verlangen;\r\n"
				+ "gemäß Art. 77 DSGVO das Recht, sich bei einer "
				+ "Aufsichtsbehörde zu beschweren. In der Regel können "
				+ "Sie sich hierfür an die Aufsichtsbehörde Ihres" + " üblichen Aufenthaltsortes oder Arbeitsplatzes "
				+ "oder unseres Unternehmenssitzes wenden.\r\n" + "Bei Fragen zur Erhebung, Verarbeitung oder Nutzung "
				+ "Ihrer personenbezogenen Daten, bei Auskünften, "
				+ "Berichtigung, Sperrung oder Löschung von Daten sowie"
				+ " Widerruf erteilter Einwilligungen oder Widerspruch "
				+ "gegen eine bestimmte Datenverwendung wenden Sie" + " sich bitte direkt an uns über die Kontaktdaten"
				+ " in unserem Impressum.\r\n" + "\r\n" + "******************************************************"
				+ "**************\r\n" + "\r\n" + "Widerspruchsrecht\r\n" + "\r\n"
				+ "Soweit wir zur Wahrung unserer im Rahmen einer " + "Interessensabwägung überwiegenden berechtigten"
				+ " Interessen personenbezogene Daten wie oben" + " erläutert verarbeiten, können Sie dieser "
				+ "Verarbeitung mit Wirkung für die Zukunft " + "widersprechen. Erfolgt die Verarbeitung zu"
				+ " Zwecken des Direktmarketings, können Sie dieses " + "Recht jederzeit wie oben beschrieben ausüben. "
				+ "Soweit die Verarbeitung zu anderen Zwecken erfolgt, "
				+ "steht Ihnen ein Widerspruchsrecht nur bei Vorliegen "
				+ "von Gründen, die sich aus Ihrer besonderen Situation" + " ergeben, zu.\r\n" + "\r\n"
				+ "Nach Ausübung Ihres Widerspruchsrechts werden wir Ihre"
				+ " personenbezogenen Daten nicht weiter zu diesen " + "Zwecken verarbeiten, es sei denn, wir können "
				+ "zwingende schutzwürdige Gründe für die Verarbeitung"
				+ " nachweisen, die Ihre Interessen, Rechte und "
				+ "Freiheiten überwiegen, oder wenn die Verarbeitung der"
				+ " Geltendmachung, Ausübung oder Verteidigung von " + "Rechtsansprüchen dient.\r\n" + "\r\n"
				+ "Dies gilt nicht, wenn die Verarbeitung zu Zwecken "
				+ "des Direktmarketings erfolgt. Dann werden wir Ihre"
				+ " personenbezogenen Daten nicht weiter zu diesem " + "Zweck verarbeiten.\r\n" + "\r\n" + " \r\n"
				+ "\r\n" + "******************************************************" + "**************\r\n" + "\r\n"
				+ "Datenschutzerklärung erstellt mit dem Trusted Shops "
				+ "Rechtstexter in Kooperation mit Wilde Beuger " + "Solmecke Rechtsanwälte.");
		panelDatenschutz.add(text);
		text.setBorder(null);
		text.setBackground(new Color(214, 217, 223));
		return panelDatenschutz;
	}

	static JPanel getPanelAgbs() {
		JPanel panelAgbs = new JPanel(new MigLayout("", "[10]", "[10]"));
		JTextArea text = new JTextArea("1. Geltungsbereich\r\n" + "\r\n"
				+ "Für alle Bestellungen über unseren Online-Shop gelten die nachfolgenden" 
				+ "AGB.\r\n" + "\r\n"
				+ "2. Vertragspartner, Vertragsschluss\r\n" + "\r\n"
				+ "Der Kaufvertrag kommt zustande mit Sophie Kunterbunt.\r\n" + "\r\n"
				+ "Mit Einstellung der Produkte in den Online-Shop geben wir ein"
				+ " verbindliches Angebot zum Vertragsschluss über diese Artikel ab. "
				+ "Sie können unsere Produkte zunächst unverbindlich in den "
				+ "Warenkorb legen und Ihre Eingaben vor Absenden Ihrer verbindlichen"
				+ " Bestellung jederzeit korrigieren, indem Sie die hierfür im"
				+ " Bestellablauf vorgesehenen und erläuterten Korrekturhilfen nutzen. "
				+ "Der Vertrag kommt zustande, indem Sie durch Anklicken des "
				+ "Bestellbuttons das Angebot über die im Warenkorb enthaltenen "
				+ "Waren annehmen. Unmittelbar nach dem Absenden der Bestellung "
				+ "erhalten Sie noch einmal eine Bestätigung per E-Mail.\r\n" + "\r\n"
				+ "3. Vertragssprache, Vertragstextspeicherung\r\n" + "\r\n" + "Die für den " 
				+ "Vertragsschluss zur "
				+ "Verfügung stehende Sprache ist Deutsch.\r\n" 
				+ "Der Vertragstext wird von uns nicht gespeichert.\r\n"
				+ "\r\n" + "4. Lieferbedingungen\r\n" + "\r\n"
				+ "Zuzüglich zu den angegebenen Produktpreisen kommen noch Versandkosten"
				+ " hinzu. Näheres zur Höhe der Versandkosten erfahren Sie bei den " 
				+ "Angeboten.\r\n" + "\r\n"
				+ "Sie haben grundsätzlich die Möglichkeit der Abholung bei "
				+ "Sophie Kunterbunt / Sophie Frey, Hallberger Zeile 17 , 12437 Berlin,"
				+ " Deutschland zu den nachfolgend angegebenen Geschäftszeiten: " 
				+ "Nur nach Rücksprache.");
		panelAgbs.add(text);
		text.setBorder(null);
		text.setBackground(new Color(214, 217, 223));
		return panelAgbs;
	}

	static JPanel getPanelMaterialien() {
		JPanel panelMaterialien = new JPanel(new MigLayout("", "[10]", "[10]"));
		JTextArea text = new JTextArea("Die Acrylglas Schilder bestehen aus einer 4 mm \r\n"
				+ "dicken Kunstglas Platte. Im Gegensatz zu normalem Glas,\r\n" 
				+ "ist Acrylglas deutlich widerstandsfähiger und robuster.\r\n"
				+ "Diese Schilder eignen sich perfekt für eine belebte Stallgasse,\r\n"
				+ "da sie auch bei starker Beanspruchung, viel Berührung und vor \r\n"
				+ "allem viel Staub nicht kaputt gehen oder verblassen. \r\n"
				+ "Durch die glatte, beschichtete Oberfläche sieht es besonders \r\n"
				+ "hochwertig aus. \r\n"
				+ "Acrylglas ist außerdem mehrere Jahre Wetter-und UV Beständig.\r\n" 
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
				+ " 3 Die Qualität und Verarbeitung des Schildes ist einfach top.\r\n"
				+ " Sophie hat meine Bilder auf dem Schild richtig schön in Szene\r\n"
				+ " gesetzt und ist auf Wünsche eingegangen. Verpackt \r\n"
				+ " wurde das Ganze auch richtig süß und so das nichts \r\n"
				+ " kaputt oder zerkratzen konnte. Die Kommunikation war\r\n "
				+ " einwandfrei und ich würde immer wieder hier ein Schild " + "bestellen.\r\n");
		panelKundenstimmen.add(text);
		text.setBorder(null);
		text.setBackground(new Color(214, 217, 223));
		return panelKundenstimmen;
	}

}
