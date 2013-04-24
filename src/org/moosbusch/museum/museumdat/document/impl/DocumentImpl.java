/*

 *
 */
package org.moosbusch.museum.museumdat.document.impl;

import java.io.IOException;
import java.io.InputStream;
import org.apache.xmlbeans.XmlException;
import org.moosbusch.museum.museumdat.document.spi.AbstractDocument;
import org.moosbusch.museum.museumdat.inject.impl.MuseumDatObjectFactory;

/**
 *
 * @author moosbusch
 */
public class DocumentImpl extends AbstractDocument<MuseumDatObjectFactory> {

    public DocumentImpl() {
    }

    public DocumentImpl(InputStream in) throws IOException, XmlException {
        super(in);
    }

    @Override
    protected MuseumDatObjectFactory createObjectFactory() {
        return new MuseumDatObjectFactory();
    }

}
