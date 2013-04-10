/*
 * An XML document type.
 * Localname: identificationWrap
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.IdentificationWrapDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one identificationWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class IdentificationWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IdentificationWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public IdentificationWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFICATIONWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "identificationWrap");
    
    
    /**
     * Gets the "identificationWrap" element
     */
    public de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap getIdentificationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap target = null;
            target = (de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap)get_store().find_element_user(IDENTIFICATIONWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "identificationWrap" element
     */
    @Inject(optional=true) public void setIdentificationWrap(de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap identificationWrap)
    {
        generatedSetterHelperImpl(identificationWrap, IDENTIFICATIONWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "identificationWrap" element
     */
    public de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap addNewIdentificationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap target = null;
            target = (de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap)get_store().add_element_user(IDENTIFICATIONWRAP$0);
            return target;
        }
    }
    /**
     * An XML identificationWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class IdentificationWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap
    {
        private static final long serialVersionUID = 1L;
        
        public IdentificationWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TITLEWRAP$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "titleWrap");
        private static final javax.xml.namespace.QName INSCRIPTIONSWRAP$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "inscriptionsWrap");
        private static final javax.xml.namespace.QName REPOSITORYWRAP$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "repositoryWrap");
        
        
        /**
         * Gets the "titleWrap" element
         */
        public de.zib.museum.museumdat.TitleWrapDocument.TitleWrap getTitleWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.TitleWrapDocument.TitleWrap target = null;
                target = (de.zib.museum.museumdat.TitleWrapDocument.TitleWrap)get_store().find_element_user(TITLEWRAP$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "titleWrap" element
         */
        @Inject(optional=true) public void setTitleWrap(de.zib.museum.museumdat.TitleWrapDocument.TitleWrap titleWrap)
        {
            generatedSetterHelperImpl(titleWrap, TITLEWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "titleWrap" element
         */
        public de.zib.museum.museumdat.TitleWrapDocument.TitleWrap addNewTitleWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.TitleWrapDocument.TitleWrap target = null;
                target = (de.zib.museum.museumdat.TitleWrapDocument.TitleWrap)get_store().add_element_user(TITLEWRAP$0);
                return target;
            }
        }
        
        /**
         * Gets the "inscriptionsWrap" element
         */
        public de.zib.museum.museumdat.InscriptionsWrapDocument.InscriptionsWrap getInscriptionsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.InscriptionsWrapDocument.InscriptionsWrap target = null;
                target = (de.zib.museum.museumdat.InscriptionsWrapDocument.InscriptionsWrap)get_store().find_element_user(INSCRIPTIONSWRAP$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "inscriptionsWrap" element
         */
        public boolean isSetInscriptionsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INSCRIPTIONSWRAP$2) != 0;
            }
        }
        
        /**
         * Sets the "inscriptionsWrap" element
         */
        @Inject(optional=true) public void setInscriptionsWrap(de.zib.museum.museumdat.InscriptionsWrapDocument.InscriptionsWrap inscriptionsWrap)
        {
            generatedSetterHelperImpl(inscriptionsWrap, INSCRIPTIONSWRAP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "inscriptionsWrap" element
         */
        public de.zib.museum.museumdat.InscriptionsWrapDocument.InscriptionsWrap addNewInscriptionsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.InscriptionsWrapDocument.InscriptionsWrap target = null;
                target = (de.zib.museum.museumdat.InscriptionsWrapDocument.InscriptionsWrap)get_store().add_element_user(INSCRIPTIONSWRAP$2);
                return target;
            }
        }
        
        /**
         * Unsets the "inscriptionsWrap" element
         */
        public void unsetInscriptionsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INSCRIPTIONSWRAP$2, 0);
            }
        }
        
        /**
         * Gets the "repositoryWrap" element
         */
        public de.zib.museum.museumdat.RepositoryWrapDocument.RepositoryWrap getRepositoryWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RepositoryWrapDocument.RepositoryWrap target = null;
                target = (de.zib.museum.museumdat.RepositoryWrapDocument.RepositoryWrap)get_store().find_element_user(REPOSITORYWRAP$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "repositoryWrap" element
         */
        public boolean isSetRepositoryWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPOSITORYWRAP$4) != 0;
            }
        }
        
        /**
         * Sets the "repositoryWrap" element
         */
        @Inject(optional=true) public void setRepositoryWrap(de.zib.museum.museumdat.RepositoryWrapDocument.RepositoryWrap repositoryWrap)
        {
            generatedSetterHelperImpl(repositoryWrap, REPOSITORYWRAP$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "repositoryWrap" element
         */
        public de.zib.museum.museumdat.RepositoryWrapDocument.RepositoryWrap addNewRepositoryWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RepositoryWrapDocument.RepositoryWrap target = null;
                target = (de.zib.museum.museumdat.RepositoryWrapDocument.RepositoryWrap)get_store().add_element_user(REPOSITORYWRAP$4);
                return target;
            }
        }
        
        /**
         * Unsets the "repositoryWrap" element
         */
        public void unsetRepositoryWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPOSITORYWRAP$4, 0);
            }
        }
    }
}