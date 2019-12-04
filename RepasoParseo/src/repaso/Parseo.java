package repaso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;


public class Parseo {

	static URL url;
	
	public static void Parsero() {
		Tráfico tarfic;
		ArrayList<Tráfico> lista = new ArrayList<Tráfico>();
		SAXBuilder b = new SAXBuilder();
		
		try {
			
			url = new URL("http://informo.munimadrid.es/informo/tmadrid/pm.xml");
			URLConnection conex;
			conex = url.openConnection();
			BufferedReader bf= new BufferedReader(new InputStreamReader(conex.getInputStream()));
		Document documento = b.build(bf);
		Element e = documento.getRootElement();
			List <Element> listaPm=e.getChildren("pm");
			
			for (Element element : listaPm) {
				//Descripciones
				Element descrip=element.getChild("descripcion");
				String descripciones=descrip.getValue();
				//Intensidades
				Element inten=element.getChild("intensidad");
				String intensidades=inten.getValue();
				Tráfico t=new Tráfico(descripciones, intensidades);
				lista.add(t);
			}
			String html=CrearHtml.pintar(lista);
			Conexion.insertarDatos(lista);
		} catch (Exception e) {
			// TODO: handle exception
		}
			
		
		
		
	}

}
