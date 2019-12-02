package repaso;

import java.util.ArrayList;


public class CrearHtml {

	public static String pintar(ArrayList<Tráfico> lista) {

		String html = "<html>";

		for (Tráfico trafic : lista) {
			html += "<table border=1>";
			html += "<tr><td>Descripción</td><td>" + trafic.getDesc() + "</td></tr>";
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
