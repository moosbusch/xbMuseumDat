/*

 *
 */
package org.moosbusch.museum.museumdat.document;

import de.zib.museum.museumdat.MuseumdatDocument.Museumdat;
import de.zib.museum.museumdat.MuseumdatWrapDocument;
import de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap;
import org.moosbusch.museum.document.MuseumXmlDocument;
import org.moosbusch.museum.museumdat.inject.impl.MuseumDatObjectFactory;

/**
 *
 * @author moosbusch
 */
public interface Document<T extends MuseumDatObjectFactory>
    extends MuseumXmlDocument<MuseumdatWrapDocument, T, MuseumdatWrap, Museumdat> {

    public static final String DEFAULT_LANGUAGE_ENCODING = "RFC3066";
    public static final String DEFAULT_RELATED_ENCODING = "DC";
    public static final String DEFAULT_ENCODING_ANALOG = "DC";
}
