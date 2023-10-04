package Seccio1;

import java.io.File;
import java.io.FilenameFilter;

public class filtroExtensionV1 implements FilenameFilter {
	String extension;

	filtroExtensionV1(String extension) {
		this.extension = extension;
	}

	public boolean accept(File dir, String name) {
		return name.endsWith(extension);
	}
}
