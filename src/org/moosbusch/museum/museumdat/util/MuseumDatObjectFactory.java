/*

 *
 */
package org.moosbusch.museum.museumdat.util;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.zib.museum.museumdat.MuseumdatWrapDocument;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import org.apache.xmlbeans.ObjectFactory;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.moosbusch.museum.museumdat.inject.MuseumDatModule;

/**
 *
 * @author moosbusch
 */
public class MuseumDatObjectFactory implements ObjectFactory {

    public static final String MUSEUMDAT_NS_URI = "http://museum.zib.de/museumdat";
    public static final String MUSEUMDAT_NS_PREFIX = "museumdat";
    public static final String MUSEUMDAT_SCHEMA_URL =
            "/org/moosbusch/museum/schema/museumdat/museumdat-v1.0.xsd";

    public MuseumDatModule createModule() {
        return new MuseumDatModule();
    }

    private Injector createMuseumDatInjector() {
        return Guice.createInjector(createModule());
    }

    @SuppressWarnings("unchecked")
    public <T> T createMuseumDatObject(Class<?> type) {
        return (T) createMuseumDatInjector().getInstance(type);
    }

    public MuseumdatWrapDocument createMuseumDatWrapDocument() {
        return createMuseumDatObject(MuseumdatWrapDocument.class);
    }

    public MuseumdatWrapDocument loadMuseumDatWrapDocument(InputStream in)
            throws IOException, XmlException {
        return MuseumdatWrapDocument.Factory.parse(in);
    }

    public void saveMuseumDatWrapDocument(MuseumdatWrapDocument museumdatWrapDocument,
            OutputStream out) throws IOException {
        XmlOptions xmlOptions = new XmlOptions();
        HashMap<String, String> namespaceMap = new HashMap<String, String>();
        namespaceMap.put(MUSEUMDAT_NS_URI, MUSEUMDAT_NS_PREFIX);
        xmlOptions.setSaveSuggestedPrefixes(namespaceMap);
        xmlOptions.setSavePrettyPrint();
        xmlOptions.setValidateStrict();
        museumdatWrapDocument.save(out, xmlOptions);
    }

    @Override
    public final Object createObject(Class type) {
        return createMuseumDatObject(type);
    }

}
