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
package de.zib.museum.museumdat.impl;  
/**
 * A document containing one museumdat(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class MuseumdatDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.MuseumdatDocument
{
    private static final long serialVersionUID = 1L;
    
    public MuseumdatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MUSEUMDAT$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "museumdat");
    
    
    /**
     * Gets the "museumdat" element
     */
    public de.zib.museum.museumdat.MuseumdatDocument.Museumdat getMuseumdat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.MuseumdatDocument.Museumdat target = null;
            target = (de.zib.museum.museumdat.MuseumdatDocument.Museumdat)get_store().find_element_user(MUSEUMDAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "museumdat" element
     */
    public void setMuseumdat(de.zib.museum.museumdat.MuseumdatDocument.Museumdat museumdat)
    {
        generatedSetterHelperImpl(museumdat, MUSEUMDAT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "museumdat" element
     */
    public de.zib.museum.museumdat.MuseumdatDocument.Museumdat addNewMuseumdat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.MuseumdatDocument.Museumdat target = null;
            target = (de.zib.museum.museumdat.MuseumdatDocument.Museumdat)get_store().add_element_user(MUSEUMDAT$0);
            return target;
        }
    }
    /**
     * An XML museumdat(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class MuseumdatImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.MuseumdatDocument.Museumdat
    {
        private static final long serialVersionUID = 1L;
        
        public MuseumdatImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTIVEMETADATA$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "descriptiveMetadata");
        private static final javax.xml.namespace.QName ADMINISTRATIVEMETADATA$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "administrativeMetadata");
        
        
        /**
         * Gets the "descriptiveMetadata" element
         */
        public de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata getDescriptiveMetadata()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata target = null;
                target = (de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata)get_store().find_element_user(DESCRIPTIVEMETADATA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "descriptiveMetadata" element
         */
        public void setDescriptiveMetadata(de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata descriptiveMetadata)
        {
            generatedSetterHelperImpl(descriptiveMetadata, DESCRIPTIVEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "descriptiveMetadata" element
         */
        public de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata addNewDescriptiveMetadata()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata target = null;
                target = (de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata)get_store().add_element_user(DESCRIPTIVEMETADATA$0);
                return target;
            }
        }
        
        /**
         * Gets the "administrativeMetadata" element
         */
        public de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata getAdministrativeMetadata()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata target = null;
                target = (de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata)get_store().find_element_user(ADMINISTRATIVEMETADATA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "administrativeMetadata" element
         */
        public void setAdministrativeMetadata(de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata administrativeMetadata)
        {
            generatedSetterHelperImpl(administrativeMetadata, ADMINISTRATIVEMETADATA$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "administrativeMetadata" element
         */
        public de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata addNewAdministrativeMetadata()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata target = null;
                target = (de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata)get_store().add_element_user(ADMINISTRATIVEMETADATA$2);
                return target;
            }
        }
    }
}
