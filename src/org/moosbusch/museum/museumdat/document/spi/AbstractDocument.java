/*

 *
 */
package org.moosbusch.museum.museumdat.document.spi;

import de.zib.museum.museumdat.MuseumdatDocument;
import de.zib.museum.museumdat.MuseumdatWrapDocument;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Collections;
import org.apache.xmlbeans.XmlException;
import org.moosbusch.museum.museumdat.document.Document;
import org.moosbusch.museum.museumdat.util.MuseumDatObjectFactory;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractDocument implements Document {

    private MuseumdatWrapDocument museumdatWrapDocument;
    private final String language;
    private final String languageEncoding;
    private final String relatedEncoding;
    private final String encodingAnalog;

    public AbstractDocument() {
        this.language = initLanguage();
        this.languageEncoding = initLanguageEncoding();
        this.relatedEncoding = initRelatedEncoding();
        this.encodingAnalog = initEncodingAnalog();
        init();
    }

    public AbstractDocument(InputStream in) throws IOException, XmlException {
        this.language = initLanguage();
        this.languageEncoding = initLanguageEncoding();
        this.relatedEncoding = initRelatedEncoding();
        this.encodingAnalog = initEncodingAnalog();
        init(in);
    }

    private void init() {
        clearDocument();
    }

    private void init(InputStream in) throws IOException, XmlException {
        loadDocument(in);
    }

    private String initRelatedEncoding() {
        return createRelatedEncoding();
    }

    private String initLanguageEncoding() {
        return createLanguageEncoding();
    }

    private String initLanguage() {
        return createLanguage();
    }

    private String initEncodingAnalog() {
        return createEncodingAnalog();
    }

    protected abstract String createRelatedEncoding();

    protected abstract String createLanguageEncoding();

    protected abstract String createLanguage();

    protected abstract String createEncodingAnalog();

    protected MuseumdatWrapDocument getMuseumdatWrapDocument() {
        return museumdatWrapDocument;
    }

    protected void setMuseumdatWrapDocument(MuseumdatWrapDocument museumdatWrapDocument) {
        this.museumdatWrapDocument = museumdatWrapDocument;
    }

    @Override
    public void loadDocument(InputStream input) throws IOException, XmlException {
        setMuseumdatWrapDocument(
                new MuseumDatObjectFactory().loadMuseumDatWrapDocument(input));
    }

    @Override
    public void saveDocument(OutputStream output) throws IOException {
        new MuseumDatObjectFactory().saveMuseumDatWrapDocument(
                getMuseumdatWrapDocument(), output);
        output.flush();
        output.close();
    }

    @Override
    public void clearDocument() {
        setMuseumdatWrapDocument(
                new MuseumDatObjectFactory().createMuseumDatWrapDocument());
    }

    @Override
    public void addMuseumdat(MuseumdatDocument.Museumdat museumdat) {
        getMuseumdatWrapDocument().getMuseumdatWrap().getMuseumdatList().add(museumdat);
    }

    @Override
    public void removeMuseumdat(MuseumdatDocument.Museumdat museumdat) {
        getMuseumdatWrapDocument().getMuseumdatWrap().getMuseumdatList().remove(museumdat);
    }

    @Override
    public Collection<MuseumdatDocument.Museumdat> getMuseumdats() {
        return Collections.unmodifiableCollection(
                getMuseumdatWrapDocument().getMuseumdatWrap().getMuseumdatList());
    }

    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    public String getLanguageEncoding() {
        return languageEncoding;
    }

    @Override
    public String getRelatedEncoding() {
        return relatedEncoding;
    }

    public String getEncodingAnalog() {
        return encodingAnalog;
    }

}
