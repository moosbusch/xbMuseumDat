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
package io.github.moosbusch.museum.document.museumdat.impl;

import de.zib.museum.museumdat.MuseumdatWrapDocument;
import io.github.moosbusch.museum.document.spi.AbstractMuseumXmlObjectFactory;
import io.github.moosbusch.museum.inject.museumdat.MuseumDatModule;
import io.github.moosbusch.museum.inject.museumdat.impl.DefaultMuseumDatModule;

/**
 *
 * @author moosbusch
 */
public class DefaultMuseumDatObjectFactory extends AbstractMuseumXmlObjectFactory<MuseumDatModule, MuseumdatWrapDocument> {

    @Override
    protected MuseumDatModule createModule() {
        return new DefaultMuseumDatModule();
    }

    @Override
    public MuseumdatWrapDocument createRootWrapperElement() {
        return createTypedObject(MuseumdatWrapDocument.class);
    }
}
