/*

 *
 */
package org.moosbusch.museum.museumdat.document.impl;

import java.io.IOException;
import java.io.InputStream;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.impl.store.Path;
import static org.moosbusch.museum.document.MuseumXmlDocument.PATH_DELEGATE_INTERFACE_CLASS;
import org.moosbusch.museum.museumdat.document.Document;
import org.moosbusch.museum.museumdat.document.spi.AbstractDocument;
import org.moosbusch.museum.museumdat.util.MuseumDatObjectFactory;

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
    protected String createRelatedEncoding() {
        return Document.DEFAULT_RELATED_ENCODING;
    }

    @Override
    protected String createLanguageEncoding() {
        return Document.DEFAULT_LANGUAGE_ENCODING;
    }

    @Override
    protected String createLanguage() {
        return Document.DEFAULT_LANGUAGE;
    }

    @Override
    protected String createEncodingAnalog() {
        return Document.DEFAULT_ENCODING_ANALOG;
    }

    @Override
    protected MuseumDatObjectFactory createObjectFactory() {
        return new MuseumDatObjectFactory();
    }

    @Override
    public Object getObjectByXPath(String xpath) {
        XmlOptions options = new XmlOptions();
        options.put(Path.PATH_DELEGATE_INTERFACE, PATH_DELEGATE_INTERFACE_CLASS);
        XmlCursor cur = getMuseumdatWrapDocument().getMuseumdatWrap().newCursor();
        cur.selectPath(xpath, options);
        Object result = cur.getSelectionCount();
        cur.dispose();

        return result;
    }

}
