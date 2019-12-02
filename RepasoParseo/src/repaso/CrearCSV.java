package repaso;

import java.io.FileWriter;
import java.io.IOException;

public class CrearCSV {

	public static void CreaCSV(String html) {

		try {
			// Abro stream, crea el fichero si no existe
			FileWriter fw = new FileWriter("Repaso.csv");

			fw.write(html);
			// Cierro el stream
			fw.close();

		} catch (IOException e) {
			System.out.println("Error E/S: " + e);
		}
	}
}
