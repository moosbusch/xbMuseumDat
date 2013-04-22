/*

 *
 */
package org.moosbusch.museum.museumdat.document;

import de.zib.museum.museumdat.MuseumdatDocument.Museumdat;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Locale;
import org.apache.xmlbeans.XmlException;
import org.moosbusch.museum.document.MuseumXmlDocument;
import org.moosbusch.museum.museumdat.util.MuseumDatObjectFactory;

/**
 *
 * @author moosbusch
 */
public interface Document<T extends MuseumDatObjectFactory> extends MuseumXmlDocument<T> {

    public static final String DEFAULT_LANGUAGE_ENCODING = "RFC3066";
    public static final String DEFAULT_RELATED_ENCODING = "DC";
    public static final String DEFAULT_ENCODING_ANALOG = "DC";

    public void addMuseumdat(Museumdat museumdat);

    public void removeMuseumdat(Museumdat museumdat);

    public Collection<Museumdat> getMuseumdats();

    public String getLanguageEncoding();

    public String getRelatedEncoding();

    public String getEncodingAnalog();
}
