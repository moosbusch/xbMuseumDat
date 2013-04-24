/*

 *
 */
package org.moosbusch.museum.museumdat.document.spi;

import de.zib.museum.museumdat.MuseumdatDocument.Museumdat;
import de.zib.museum.museumdat.MuseumdatWrapDocument;
import de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import org.apache.xmlbeans.XmlException;
import org.moosbusch.museum.document.spi.AbstractMuseumXmlDocument;
import org.moosbusch.museum.museumdat.document.Document;
import org.moosbusch.museum.museumdat.inject.impl.MuseumDatObjectFactory;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractDocument<T extends MuseumDatObjectFactory>
        extends AbstractMuseumXmlDocument<MuseumdatWrapDocument,T, MuseumdatWrap,
        Museumdat> implements Document<T> {

    public AbstractDocument() {
    }

    public AbstractDocument(InputStream in)
            throws IOException, XmlException {
        super(in);
    }

    public MuseumdatWrap getRootElement() {
        synchronized (getRootWrapperElement().monitor()) {
            return getRootWrapperElement().getMuseumdatWrap();
        }
    }

    @Override
    public Collection<Museumdat> getItems() {
        synchronized (getRootWrapperElement().monitor()) {
            return getRootWrapperElement().getMuseumdatWrap().getMuseumdatList();
        }
    }
}
