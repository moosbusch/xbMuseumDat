/*

 *
 */
package org.moosbusch.museum.museumdat.document.impl;

import java.io.IOException;
import java.io.InputStream;
import org.apache.xmlbeans.XmlException;
import org.moosbusch.museum.museumdat.document.Document;
import org.moosbusch.museum.museumdat.document.spi.AbstractDocument;

/**
 *
 * @author moosbusch
 */
public class DocumentImpl extends AbstractDocument {

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

}
