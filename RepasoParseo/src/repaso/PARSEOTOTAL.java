package repaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class PARSEOTOTAL {
	static URL url;
	public static void ParseoTotal() {
		ArrayList<Tráfico> lista = new ArrayList<Tráfico>();
		SAXBuilder b = new SAXBuilder();
		try {
			url = new URL("http://informo.munimadrid.es/informo/tmadrid/pm.xml");
			URLConnection conex;
			conex = url.openConnection();
			BufferedReader bf= new BufferedReader(new InputStreamReader(conex.getInputStream()));
		Document documento = b.build(bf);
		Element element_r = documento.getRootElement();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	
}
