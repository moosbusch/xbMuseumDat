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
package org.moosbusch.museum.document.museumdat.impl;

import de.zib.museum.museumdat.MuseumdatWrapDocument;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.moosbusch.museum.document.museumdat.spi.AbstractMuseumDatXmlDocument;
import org.moosbusch.museum.inject.museumdat.impl.DefaultMuseumDatObjectFactory;

/**
 *
 * @author moosbusch
 */
public class DefaultMuseumDatXmlDocument extends AbstractMuseumDatXmlDocument<DefaultMuseumDatObjectFactory> {

    public DefaultMuseumDatXmlDocument() {
    }

    public DefaultMuseumDatXmlDocument(InputStream in) throws IOException, XmlException {
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
    protected DefaultMuseumDatObjectFactory createObjectFactory() {
        return new DefaultMuseumDatObjectFactory();
    }

}
