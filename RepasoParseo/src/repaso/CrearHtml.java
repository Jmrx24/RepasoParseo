package repaso;

import java.util.ArrayList;


public class CrearHtml {

	public static String pintar(ArrayList<Tr�fico> lista) {

		String html = "<html>";

		for (Tr�fico trafic : lista) {
			html += "<table border=1>";
			html += "<tr><td>Descripci�n</td><td>" + trafic.getDesc() + "</td></tr>";
			System.out.println(trafic.getDesc());
			html += "<tr><td>Intensidad</td><td>" + trafic.getIntensidad() + "</td></tr>";
			System.out.println(trafic.getIntensidad());
			html += "</table>";

		}

		html += "</html>";
		CrearCSV.CreaCSV(html);
		return html;
	}

}
