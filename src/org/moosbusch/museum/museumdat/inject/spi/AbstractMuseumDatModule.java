/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moosbusch.museum.museumdat.inject.spi;

import org.moosbusch.museum.document.MuseumXmlDocument;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlModule;
import org.moosbusch.museum.museumdat.inject.MuseumDatModule;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractMuseumDatModule extends AbstractMuseumXmlModule implements MuseumDatModule {

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
        return MuseumXmlDocument.DEFAULT_LANGUAGE;
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
