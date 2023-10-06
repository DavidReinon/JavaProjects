package AE01;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public class GestioFitxers {

	private File directori;
	private ArrayList<String> informacioArchius = new ArrayList<String>();

	public GestioFitxers(File dir) {
		directori = dir;
	}

	public void llistarFitxersTxt() {

		if (!directori.exists() || !directori.isDirectory()) {
			return;
		}
		FiltroExtensionV1 filter = new FiltroExtensionV1("txt");
		File[] archiusTxt = directori.listFiles(filter);

		if (archiusTxt != null) {
			for (File archivo : archiusTxt) {
				String nombre = archivo.getName();
				String extensio = "txt";
				long grandaria = archivo.length();
				Date dataUltimaModificacio = new Date(archivo.lastModified());

				String mostrar = ("Nom: " + nombre + " Extension: " + extensio + " Grandaria:" + grandaria
						+ "\nUltima modificació: " + dataUltimaModificacio);
				informacioArchius.add(mostrar);
			}
		}
	}

}
