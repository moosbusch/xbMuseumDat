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
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.impl.store.Path;
import org.moosbusch.museum.document.AbstractMuseumXmlDocument;
import org.moosbusch.museum.museumdat.document.Document;
import org.moosbusch.museum.museumdat.util.MuseumDatObjectFactory;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractDocument<T extends MuseumDatObjectFactory>
    extends AbstractMuseumXmlDocument<T> implements Document<T> {

    private MuseumdatWrapDocument museumdatWrapDocument;
    private final String languageEncoding;
    private final String relatedEncoding;
    private final String encodingAnalog;

    public AbstractDocument() {
        this.languageEncoding = initLanguageEncoding();
        this.relatedEncoding = initRelatedEncoding();
        this.encodingAnalog = initEncodingAnalog();
    }

    public AbstractDocument(InputStream in)
            throws IOException, XmlException {
        super(in);
        this.languageEncoding = initLanguageEncoding();
        this.relatedEncoding = initRelatedEncoding();
        this.encodingAnalog = initEncodingAnalog();
    }

    private String initRelatedEncoding() {
        return createRelatedEncoding();
    }

    private String initLanguageEncoding() {
        return createLanguageEncoding();
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
    public XmlObject getObjectByXPath(String xpath) {
        XmlOptions options = new XmlOptions();
        options.put(Path.PATH_DELEGATE_INTERFACE, PATH_DELEGATE_INTERFACE_CLASS);
        XmlCursor cur = getMuseumdatWrapDocument().getMuseumdatWrap().newCursor();
        cur.selectPath(xpath, options);
        XmlObject result = cur.getObject();
        cur.dispose();

        return result;
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
