/*

 *
 */
package org.moosbusch.museum.museumdat.inject.impl;

import de.zib.museum.museumdat.MuseumdatWrapDocument;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlObjectFactory;
import org.moosbusch.museum.museumdat.inject.MuseumDatModule;

/**
 *
 * @author moosbusch
 */
public class MuseumDatObjectFactory extends AbstractMuseumXmlObjectFactory
            <MuseumDatModule, MuseumdatWrapDocument> {

    public static final String MUSEUMDAT_NS_URI = "http://museum.zib.de/museumdat";
    public static final String MUSEUMDAT_NS_PREFIX = "museumdat";
    public static final String MUSEUMDAT_SCHEMA_URL =
            "/org/moosbusch/museum/schema/museumdat/museumdat-v1.0.xsd";

    @Override
    public MuseumDatModule getModule() {
        return new MuseumDatModuleImpl();
    }

    @Override
    public MuseumdatWrapDocument createRootElement() {
        return createTypedObject(MuseumdatWrapDocument.class);
    }

    public MuseumdatWrapDocument loadDocument(InputStream in)
            throws IOException, XmlException {
        return MuseumdatWrapDocument.Factory.parse(in);
    }

    public void saveDocument(MuseumdatWrapDocument museumdatWrapDocument,
            OutputStream out) throws IOException {
        XmlOptions xmlOptions = new XmlOptions();
        HashMap<String, String> namespaceMap = new HashMap<String, String>();
        namespaceMap.put(MUSEUMDAT_NS_URI, MUSEUMDAT_NS_PREFIX);
        xmlOptions.setSaveSuggestedPrefixes(namespaceMap);
        xmlOptions.setSavePrettyPrint();
        xmlOptions.setValidateStrict();
        museumdatWrapDocument.save(out, xmlOptions);
    }

}
