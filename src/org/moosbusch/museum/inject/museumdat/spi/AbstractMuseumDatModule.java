/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.moosbusch.museum.inject.museumdat.spi;

import org.moosbusch.museum.document.MuseumXmlDocument;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlModule;
import org.moosbusch.museum.inject.museumdat.MuseumDatModule;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlModule;

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

    @Override
    public String getEncodingAnalog() {
        return encodingAnalog;
    }

}
