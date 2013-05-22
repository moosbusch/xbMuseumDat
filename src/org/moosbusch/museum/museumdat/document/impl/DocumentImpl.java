/*

 *
 */
package org.moosbusch.museum.museumdat.document.impl;

import de.zib.museum.museumdat.MuseumdatWrapDocument;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.moosbusch.museum.museumdat.document.spi.AbstractDocument;
import org.moosbusch.museum.museumdat.inject.impl.MuseumDatObjectFactory;

/**
 *
 * @author moosbusch
 */
public class DocumentImpl extends AbstractDocument<MuseumDatObjectFactory> {

    public DocumentImpl() {
    }

    public DocumentImpl(InputStream in) throws IOException, XmlException {
        super(in);
    }

    @Override
    protected void addSchemaLocation(MuseumdatWrapDocument museumDatWrapDocument) {
        XmlCursor cursor = museumDatWrapDocument.newCursor();

        if (cursor.toFirstChild()) {
            cursor.setAttributeText(new QName(XML_SCHEMA_NS_URI,
                    SCHEMA_LOCATION_ATTR), MUSEUMDAT_SCHEMA_LOCATION);
        }

        cursor.dispose();
    }

    @Override
    protected MuseumdatWrapDocument loadDocumentImpl(InputStream in)
            throws IOException, XmlException {
        return MuseumdatWrapDocument.Factory.parse(in);
    }

    @Override
    protected void saveDocumentImpl(MuseumdatWrapDocument museumdatWrapDocument,
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

    @Override
    protected MuseumDatObjectFactory createObjectFactory() {
        return new MuseumDatObjectFactory();
    }

}
