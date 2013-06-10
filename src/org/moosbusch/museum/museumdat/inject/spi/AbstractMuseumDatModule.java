/*
 *
 *
 */
package org.moosbusch.museum.museumdat.inject.spi;

import org.moosbusch.museum.document.XmlDocument;
import org.moosbusch.museum.inject.spi.AbstractXmlModule;
import org.moosbusch.museum.museumdat.inject.MuseumDatModule;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractMuseumDatModule extends AbstractXmlModule implements MuseumDatModule {

    private final String languageEncoding;
    private final String relatedEncoding;
    private final String encodingAnalog;

    public AbstractMuseumDatModule() {
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

    protected abstract String createEncodingAnalog();

    @Override
    protected String createLanguage() {
        return XmlDocument.DEFAULT_LANGUAGE;
    }

    @Override
    public String getLanguageEncoding() {
        return languageEncoding;
    }

    @Override
    public String getRelatedEncoding() {
        return relatedEncoding;
    }

    @Override
    public String getEncodingAnalog() {
        return encodingAnalog;
    }

}
