/*
 * An XML document type.
 * Localname: objectClassificationWrap
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.ObjectClassificationWrapDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one objectClassificationWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class ObjectClassificationWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.ObjectClassificationWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObjectClassificationWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTCLASSIFICATIONWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "objectClassificationWrap");
    
    
    /**
     * Gets the "objectClassificationWrap" element
     */
    public de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap getObjectClassificationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap target = null;
            target = (de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap)get_store().find_element_user(OBJECTCLASSIFICATIONWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "objectClassificationWrap" element
     */
    @Inject(optional=true) public void setObjectClassificationWrap(de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap objectClassificationWrap)
    {
        generatedSetterHelperImpl(objectClassificationWrap, OBJECTCLASSIFICATIONWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "objectClassificationWrap" element
     */
    public de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap addNewObjectClassificationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap target = null;
            target = (de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap)get_store().add_element_user(OBJECTCLASSIFICATIONWRAP$0);
            return target;
        }
    }
    /**
     * An XML objectClassificationWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class ObjectClassificationWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap
    {
        private static final long serialVersionUID = 1L;
        
        public ObjectClassificationWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OBJECTWORKTYPEWRAP$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "objectWorkTypeWrap");
        private static final javax.xml.namespace.QName CLASSIFICATIONWRAP$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "classificationWrap");
        
        
        /**
         * Gets the "objectWorkTypeWrap" element
         */
        public de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap getObjectWorkTypeWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap target = null;
                target = (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap)get_store().find_element_user(OBJECTWORKTYPEWRAP$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "objectWorkTypeWrap" element
         */
        @Inject(optional=true) public void setObjectWorkTypeWrap(de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap objectWorkTypeWrap)
        {
            generatedSetterHelperImpl(objectWorkTypeWrap, OBJECTWORKTYPEWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "objectWorkTypeWrap" element
         */
        public de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap addNewObjectWorkTypeWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap target = null;
                target = (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap)get_store().add_element_user(OBJECTWORKTYPEWRAP$0);
                return target;
            }
        }
        
        /**
         * Gets the "classificationWrap" element
         */
        public de.zib.museum.museumdat.ClassificationWrapDocument.ClassificationWrap getClassificationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ClassificationWrapDocument.ClassificationWrap target = null;
                target = (de.zib.museum.museumdat.ClassificationWrapDocument.ClassificationWrap)get_store().find_element_user(CLASSIFICATIONWRAP$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "classificationWrap" element
         */
        public boolean isSetClassificationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLASSIFICATIONWRAP$2) != 0;
            }
        }
        
        /**
         * Sets the "classificationWrap" element
         */
        @Inject(optional=true) public void setClassificationWrap(de.zib.museum.museumdat.ClassificationWrapDocument.ClassificationWrap classificationWrap)
        {
            generatedSetterHelperImpl(classificationWrap, CLASSIFICATIONWRAP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "classificationWrap" element
         */
        public de.zib.museum.museumdat.ClassificationWrapDocument.ClassificationWrap addNewClassificationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ClassificationWrapDocument.ClassificationWrap target = null;
                target = (de.zib.museum.museumdat.ClassificationWrapDocument.ClassificationWrap)get_store().add_element_user(CLASSIFICATIONWRAP$2);
                return target;
            }
        }
        
        /**
         * Unsets the "classificationWrap" element
         */
        public void unsetClassificationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLASSIFICATIONWRAP$2, 0);
            }
        }
    }
}
