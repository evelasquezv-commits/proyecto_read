
package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.github.mertakdut.BookSection;
import com.github.mertakdut.Reader;

public class LectorEpub {

    public boolean esArchivoEpub(Path archivo) {
        if (archivo == null || archivo.getFileName() == null) {
            return false;
        }

        return archivo.getFileName()
                .toString()
                .toLowerCase(Locale.ROOT)
                .endsWith(".epub");
    }

    public List<String> leerContenido(Path archivo) throws IOException {
        if (!esArchivoEpub(archivo)) {
            throw new IllegalArgumentException(
                    "El archivo debe tener formato EPUB."
            );
        }

        if (!Files.isRegularFile(archivo)) {
            throw new IOException(
                    "El archivo no existe o no es un archivo válido: " + archivo
            );
        }

        List<String> secciones = new ArrayList<>();

        try {
            Reader lector = new Reader();
            lector.setMaxContentPerSection(1000);
            lector.setIsIncludingTextContent(true);
            lector.setFullContent(archivo.toAbsolutePath().toString());

            int pagina = 0;

            while (true) {
                BookSection seccion = lector.readSection(pagina);

                if (seccion == null) {
                    break;
                }

                String texto = seccion.getSectionTextContent();

                if (texto != null && !texto.isBlank()) {
                    secciones.add(texto);
                }

                pagina++;
            }

        } catch (Exception e) {
            throw new IOException(
                    "No se pudo completar la lectura del EPUB: "
                            + e.getMessage(),
                    e
            );
        }

        return secciones;
    }
}
