/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moosbusch.museum.museumdat.document;

import de.zib.museum.museumdat.MuseumdatDocument.Museumdat;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Collection;
import org.apache.xmlbeans.XmlException;

/**
 *
 * @author moosbusch
 */
public interface Document {

    public void addMuseumdat(Museumdat museumdat);

    public void removeMuseumdat(Museumdat museumdat);

    public Collection<Museumdat> getMuseumdats();

    public void loadDocument(File file) throws IOException, XmlException;

    public void loadDocument(URL url) throws IOException, XmlException;

    public void loadDocument(InputStream input) throws IOException, XmlException;

    public void saveDocument(File file) throws IOException;

    public void saveDocument(URL url) throws IOException;

    public void saveDocument(OutputStream output) throws IOException;

    public void clearDocument();
}