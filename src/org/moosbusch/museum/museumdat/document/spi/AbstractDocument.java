/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moosbusch.museum.museumdat.document.spi;

import com.google.inject.Inject;
import de.zib.museum.museumdat.MuseumdatWrapDocument;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import org.apache.xmlbeans.XmlException;
import org.moosbusch.museum.museumdat.document.Document;
import org.moosbusch.museum.museumdat.inject.annotation.Language;
import org.moosbusch.museum.museumdat.inject.annotation.LanguageEncoding;
import org.moosbusch.museum.museumdat.inject.annotation.RelatedEncoding;
import org.moosbusch.museum.museumdat.util.MuseumDatObjectFactory;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractDocument implements Document {

    private MuseumdatWrapDocument museumdatWrapDocument;
    @Inject
    @Language
    private String language;
    @Inject
    @LanguageEncoding
    private String languageEncoding;
    @Inject
    @RelatedEncoding
    private String relatedEncoding;

    public AbstractDocument() {
        init();
    }

    public AbstractDocument(File f) throws IOException, XmlException {
        init(f);
    }

    public AbstractDocument(InputStream in) throws IOException, XmlException {
        init(in);
    }

    public AbstractDocument(URL url) throws IOException, XmlException {
        init(url);
    }

    private void init() {
        clearDocument();
    }

    private void init(File f) throws IOException, XmlException {
        loadDocument(f);
    }

    private void init(InputStream in) throws IOException, XmlException {
        loadDocument(in);
    }

    private void init(URL url) throws IOException, XmlException {
        loadDocument(url);
    }

    protected MuseumdatWrapDocument getMuseumdatWrapDocument() {
        return museumdatWrapDocument;
    }

    protected void setMuseumdatWrapDocument(MuseumdatWrapDocument museumdatWrapDocument) {
        this.museumdatWrapDocument = museumdatWrapDocument;
    }

    @Override
    public void loadDocument(File file) throws IOException, XmlException {
        loadDocument(new BufferedInputStream(new FileInputStream(file)));
    }

    @Override
    public void loadDocument(URL url) throws IOException, XmlException {
        loadDocument(new BufferedInputStream(url.openStream()));
    }

    @Override
    public void saveDocument(File file) throws IOException {
        saveDocument(new BufferedOutputStream(new FileOutputStream(file)));
    }

    @Override
    public void saveDocument(OutputStream output) throws IOException {
        MuseumDatObjectFactory.getInstance().saveMuseumDatWrapDocument(
                getMuseumdatWrapDocument(), output);
        output.flush();
        output.close();
    }

    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    @Inject
    public void setLanguage(@Language String language) {
        this.language = language;
    }

    @Override
    public String getLanguageEncoding() {
        return languageEncoding;
    }

    @Override
    @Inject
    public void setDefaultLanguageEncoding(@LanguageEncoding String languageEncoding) {
        this.languageEncoding = languageEncoding;
    }

    @Override
    public String getDefaultRelatedEncoding() {
        return relatedEncoding;
    }

    @Override
    @Inject
    public void setDefaultRelatedEncoding(@RelatedEncoding String relatedEncoding) {
        this.relatedEncoding = relatedEncoding;
    }
}
