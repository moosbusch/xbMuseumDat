/*
 * An XML document type.
 * Localname: classificationWrap
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.ClassificationWrapDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one classificationWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class ClassificationWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.ClassificationWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClassificationWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLASSIFICATIONWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "classificationWrap");
    
    
    /**
     * Gets the "classificationWrap" element
     */
    public de.zib.museum.museumdat.ClassificationWrapDocument.ClassificationWrap getClassificationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.ClassificationWrapDocument.ClassificationWrap target = null;
            target = (de.zib.museum.museumdat.ClassificationWrapDocument.ClassificationWrap)get_store().find_element_user(CLASSIFICATIONWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "classificationWrap" element
     */
    @Inject(optional=true) public void setClassificationWrap(de.zib.museum.museumdat.ClassificationWrapDocument.ClassificationWrap classificationWrap)
    {
        generatedSetterHelperImpl(classificationWrap, CLASSIFICATIONWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (de.zib.museum.museumdat.ClassificationWrapDocument.ClassificationWrap)get_store().add_element_user(CLASSIFICATIONWRAP$0);
            return target;
        }
    }
    /**
     * An XML classificationWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class ClassificationWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.ClassificationWrapDocument.ClassificationWrap
    {
        private static final long serialVersionUID = 1L;
        
        public ClassificationWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CLASSIFICATION$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "classification");
        
        
        /**
         * Gets a List of "classification" elements
         */
        public java.util.List<de.zib.museum.museumdat.ClassificationDocument.Classification> getClassificationList()
        {
            final class ClassificationList extends java.util.AbstractList<de.zib.museum.museumdat.ClassificationDocument.Classification>
            {
                @Override
                public de.zib.museum.museumdat.ClassificationDocument.Classification get(int i)
                    { return ClassificationWrapImpl.this.getClassificationArray(i); }
                
                @Override
                public de.zib.museum.museumdat.ClassificationDocument.Classification set(int i, de.zib.museum.museumdat.ClassificationDocument.Classification o)
                {
                    de.zib.museum.museumdat.ClassificationDocument.Classification old = ClassificationWrapImpl.this.getClassificationArray(i);
                    ClassificationWrapImpl.this.setClassificationArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.ClassificationDocument.Classification o)
                    { ClassificationWrapImpl.this.insertNewClassification(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.ClassificationDocument.Classification remove(int i)
                {
                    de.zib.museum.museumdat.ClassificationDocument.Classification old = ClassificationWrapImpl.this.getClassificationArray(i);
                    ClassificationWrapImpl.this.removeClassification(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ClassificationWrapImpl.this.sizeOfClassificationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ClassificationList();
            }
        }
        
        /**
         * Gets array of all "classification" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.ClassificationDocument.Classification[] getClassificationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.ClassificationDocument.Classification> targetList = new java.util.ArrayList<de.zib.museum.museumdat.ClassificationDocument.Classification>();
                get_store().find_all_element_users(CLASSIFICATION$0, targetList);
                de.zib.museum.museumdat.ClassificationDocument.Classification[] result = new de.zib.museum.museumdat.ClassificationDocument.Classification[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "classification" element
         */
        public de.zib.museum.museumdat.ClassificationDocument.Classification getClassificationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ClassificationDocument.Classification target = null;
                target = (de.zib.museum.museumdat.ClassificationDocument.Classification)get_store().find_element_user(CLASSIFICATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "classification" element
         */
        public int sizeOfClassificationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CLASSIFICATION$0);
            }
        }
        
        /**
         * Sets array of all "classification" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setClassificationArray(de.zib.museum.museumdat.ClassificationDocument.Classification[] classificationArray)
        {
            check_orphaned();
            arraySetterHelper(classificationArray, CLASSIFICATION$0);
        }
        
        /**
         * Sets ith "classification" element
         */
        @Inject(optional=true) public void setClassificationArray(int i, de.zib.museum.museumdat.ClassificationDocument.Classification classification)
        {
            generatedSetterHelperImpl(classification, CLASSIFICATION$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "classification" element
         */
        public de.zib.museum.museumdat.ClassificationDocument.Classification insertNewClassification(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ClassificationDocument.Classification target = null;
                target = (de.zib.museum.museumdat.ClassificationDocument.Classification)get_store().insert_element_user(CLASSIFICATION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "classification" element
         */
        public de.zib.museum.museumdat.ClassificationDocument.Classification addNewClassification()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ClassificationDocument.Classification target = null;
                target = (de.zib.museum.museumdat.ClassificationDocument.Classification)get_store().add_element_user(CLASSIFICATION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "classification" element
         */
        public void removeClassification(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CLASSIFICATION$0, i);
            }
        }
    }
}