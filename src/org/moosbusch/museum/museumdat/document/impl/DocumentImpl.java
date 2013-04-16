/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moosbusch.museum.museumdat.document.impl;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
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

    public DocumentImpl(File f) throws IOException, XmlException {
        super(f);
    }

    public DocumentImpl(InputStream in) throws IOException, XmlException {
        super(in);
    }

    public DocumentImpl(URL url) throws IOException, XmlException {
        super(url);
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
