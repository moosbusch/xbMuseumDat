/*

 *
 */
package org.moosbusch.museum.museumdat.inject.impl;

import de.zib.museum.museumdat.MuseumdatWrapDocument;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlObjectFactory;
import org.moosbusch.museum.museumdat.inject.MuseumDatModule;

/**
 *
 * @author moosbusch
 */
public class MuseumDatObjectFactory extends AbstractMuseumXmlObjectFactory<MuseumDatModule, MuseumdatWrapDocument> {

    public static final String MUSEUMDAT_NS_URI = "http://museum.zib.de/museumdat";
    public static final String MUSEUMDAT_NS_PREFIX = "museumdat";
    public static final String MUSEUMDAT_SCHEMA_LOCATION =
            "http://museum.zib.de/museumdat http://museum.zib.de/museumdat/museumdat-v1.0.xsd";

    @Override
    protected MuseumDatModule createModule() {
        return new MuseumDatModuleImpl();
    }

    protected void addSchemaLocation(MuseumdatWrapDocument museumDatWrapDocument) {
        XmlCursor cursor = museumDatWrapDocument.newCursor();

        if (cursor.toFirstChild()) {
            cursor.setAttributeText(new QName(XML_SCHEMA_NS_URI,
                    SCHEMA_LOCATION_ATTR), MUSEUMDAT_SCHEMA_LOCATION);
        }

        cursor.dispose();
    }

    @Override
    public MuseumdatWrapDocument createRootElement() {
        return createTypedObject(MuseumdatWrapDocument.class);
    }

    @Override
    public MuseumdatWrapDocument loadDocument(InputStream in)
            throws IOException, XmlException {
        return MuseumdatWrapDocument.Factory.parse(in);
    }

    @Override
    public void saveDocument(MuseumdatWrapDocument museumdatWrapDocument,
            OutputStream out) throws IOException {
        XmlOptions xmlOptions = new XmlOptions();
        HashMap<String, String> namespaceMap = new HashMap<String, String>();
        namespaceMap.put(MUSEUMDAT_NS_URI, MUSEUMDAT_NS_PREFIX);
        xmlOptions.setSaveSuggestedPrefixes(namespaceMap);
        xmlOptions.setSavePrettyPrint();
        xmlOptions.setValidateStrict();
        addSchemaLocation(museumdatWrapDocument);
        museumdatWrapDocument.save(out, xmlOptions);
    }
}
