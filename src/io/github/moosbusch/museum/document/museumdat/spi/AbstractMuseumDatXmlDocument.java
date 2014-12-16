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
package io.github.moosbusch.museum.document.museumdat.spi;

import de.zib.museum.museumdat.MuseumdatDocument.Museumdat;
import de.zib.museum.museumdat.MuseumdatWrapDocument;
import de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import org.apache.xmlbeans.XmlException;
import io.github.moosbusch.museum.document.museumdat.MuseumDatXmlDocument;
import io.github.moosbusch.museum.document.spi.AbstractMuseumXmlDocument;
import io.github.moosbusch.museum.document.museumdat.impl.DefaultMuseumDatObjectFactory;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractMuseumDatXmlDocument<T extends DefaultMuseumDatObjectFactory>
        extends AbstractMuseumXmlDocument<MuseumdatWrapDocument, T, MuseumdatWrap, Museumdat> implements MuseumDatXmlDocument<T> {

    public AbstractMuseumDatXmlDocument() {
    }

    public AbstractMuseumDatXmlDocument(InputStream in)
            throws IOException, XmlException {
        super(in);
    }

    protected abstract void addSchemaLocation(MuseumdatWrapDocument museumDatWrapDocument);

    @Override
    public MuseumdatWrap getRootElement() {
        return getRootWrapperElement().getMuseumdatWrap();
    }

    @Override
    public Collection<Museumdat> getRecords() {
        return getRootWrapperElement().getMuseumdatWrap().getMuseumdatList();
    }
}
