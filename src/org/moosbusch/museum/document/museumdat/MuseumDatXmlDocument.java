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
package org.moosbusch.museum.document.museumdat;

import de.zib.museum.museumdat.MuseumdatDocument.Museumdat;
import de.zib.museum.museumdat.MuseumdatWrapDocument;
import de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap;
import org.moosbusch.museum.document.MuseumXmlDocument;
import org.moosbusch.museum.document.MuseumXmlDocument;
import org.moosbusch.museum.inject.museumdat.impl.DefaultMuseumDatObjectFactory;

/**
 *
 * @author moosbusch
 */
public interface MuseumDatXmlDocument<T extends DefaultMuseumDatObjectFactory>
    extends MuseumXmlDocument<MuseumdatWrapDocument, T, MuseumdatWrap, Museumdat> {

    public static final String MUSEUMDAT_NS_URI = "http://museum.zib.de/museumdat";
    public static final String MUSEUMDAT_NS_PREFIX = "museumdat";
    public static final String MUSEUMDAT_SCHEMA_LOCATION =
            "http://museum.zib.de/museumdat http://museum.zib.de/museumdat/museumdat-v1.0.xsd";
    public static final String DEFAULT_LANGUAGE_ENCODING = "RFC3066";
    public static final String DEFAULT_ENCODING_ANALOG = "DC";
}
