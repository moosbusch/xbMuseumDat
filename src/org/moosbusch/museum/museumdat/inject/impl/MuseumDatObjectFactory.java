/*

 *
 */
package org.moosbusch.museum.museumdat.inject.impl;

import de.zib.museum.museumdat.MuseumdatWrapDocument;
import org.moosbusch.museum.inject.spi.AbstractXmlObjectFactory;
import org.moosbusch.museum.museumdat.inject.MuseumDatModule;

/**
 *
 * @author moosbusch
 */
public class MuseumDatObjectFactory extends AbstractXmlObjectFactory<MuseumDatModule, MuseumdatWrapDocument> {

    @Override
    protected MuseumDatModule createModule() {
        return new MuseumDatModuleImpl();
    }

    @Override
    public MuseumdatWrapDocument createRootElement() {
        return createTypedObject(MuseumdatWrapDocument.class);
    }
}
