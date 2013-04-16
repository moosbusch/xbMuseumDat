/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moosbusch.museum.museumdat.document.impl;

import de.zib.museum.museumdat.MuseumdatDocument.Museumdat;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import org.apache.xmlbeans.XmlException;
import org.moosbusch.museum.museumdat.document.spi.AbstractDocument;
import org.moosbusch.museum.museumdat.util.MuseumDatObjectFactory;

/**
 *
 * @author moosbusch
 */
public class DocumentImpl extends AbstractDocument {

    public DocumentImpl() {
    }

    public DocumentImpl(File f) throws IOException, XmlException {
        super(f);
    }

    public DocumentImpl(InputStream in) throws IOException, XmlException {
        super(in);
    }

    public DocumentImpl(URL url) throws IOException, XmlException {
        super(url);
    }

    @Override
    public void loadDocument(InputStream input) throws IOException, XmlException {
        setMuseumdatWrapDocument(
                MuseumDatObjectFactory.getInstance().loadMuseumDatWrapDocument(input));
    }

    @Override
    public void saveDocument(URL url) throws IOException {
        saveDocument(new BufferedOutputStream(
                url.openConnection().getOutputStream()));
    }

    @Override
    public void clearDocument() {
        setMuseumdatWrapDocument(
                MuseumDatObjectFactory.getInstance().createMuseumDatWrapDocument());
    }

    @Override
    public void addMuseumdat(Museumdat museumdat) {
        getMuseumdatWrapDocument().getMuseumdatWrap().getMuseumdatList().add(museumdat);
    }

    @Override
    public void removeMuseumdat(Museumdat museumdat) {
        getMuseumdatWrapDocument().getMuseumdatWrap().getMuseumdatList().remove(museumdat);
    }

    @Override
    public Collection<Museumdat> getMuseumdats() {
        return Collections.unmodifiableCollection(
                getMuseumdatWrapDocument().getMuseumdatWrap().getMuseumdatList());
    }
}
