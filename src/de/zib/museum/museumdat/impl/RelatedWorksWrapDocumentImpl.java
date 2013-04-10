/*
 * An XML document type.
 * Localname: relatedWorksWrap
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.RelatedWorksWrapDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one relatedWorksWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class RelatedWorksWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.RelatedWorksWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelatedWorksWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDWORKSWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "relatedWorksWrap");
    
    
    /**
     * Gets the "relatedWorksWrap" element
     */
    public de.zib.museum.museumdat.RelatedWorksWrapDocument.RelatedWorksWrap getRelatedWorksWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.RelatedWorksWrapDocument.RelatedWorksWrap target = null;
            target = (de.zib.museum.museumdat.RelatedWorksWrapDocument.RelatedWorksWrap)get_store().find_element_user(RELATEDWORKSWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "relatedWorksWrap" element
     */
    @Inject(optional=true) public void setRelatedWorksWrap(de.zib.museum.museumdat.RelatedWorksWrapDocument.RelatedWorksWrap relatedWorksWrap)
    {
        generatedSetterHelperImpl(relatedWorksWrap, RELATEDWORKSWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "relatedWorksWrap" element
     */
    public de.zib.museum.museumdat.RelatedWorksWrapDocument.RelatedWorksWrap addNewRelatedWorksWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.RelatedWorksWrapDocument.RelatedWorksWrap target = null;
            target = (de.zib.museum.museumdat.RelatedWorksWrapDocument.RelatedWorksWrap)get_store().add_element_user(RELATEDWORKSWRAP$0);
            return target;
        }
    }
    /**
     * An XML relatedWorksWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class RelatedWorksWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.RelatedWorksWrapDocument.RelatedWorksWrap
    {
        private static final long serialVersionUID = 1L;
        
        public RelatedWorksWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RELATEDWORKSET$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "relatedWorkSet");
        
        
        /**
         * Gets a List of "relatedWorkSet" elements
         */
        public java.util.List<de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet> getRelatedWorkSetList()
        {
            final class RelatedWorkSetList extends java.util.AbstractList<de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet>
            {
                @Override
                public de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet get(int i)
                    { return RelatedWorksWrapImpl.this.getRelatedWorkSetArray(i); }
                
                @Override
                public de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet set(int i, de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet o)
                {
                    de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet old = RelatedWorksWrapImpl.this.getRelatedWorkSetArray(i);
                    RelatedWorksWrapImpl.this.setRelatedWorkSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet o)
                    { RelatedWorksWrapImpl.this.insertNewRelatedWorkSet(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet remove(int i)
                {
                    de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet old = RelatedWorksWrapImpl.this.getRelatedWorkSetArray(i);
                    RelatedWorksWrapImpl.this.removeRelatedWorkSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RelatedWorksWrapImpl.this.sizeOfRelatedWorkSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RelatedWorkSetList();
            }
        }
        
        /**
         * Gets array of all "relatedWorkSet" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet[] getRelatedWorkSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet> targetList = new java.util.ArrayList<de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet>();
                get_store().find_all_element_users(RELATEDWORKSET$0, targetList);
                de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet[] result = new de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "relatedWorkSet" element
         */
        public de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet getRelatedWorkSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet target = null;
                target = (de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet)get_store().find_element_user(RELATEDWORKSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "relatedWorkSet" element
         */
        public int sizeOfRelatedWorkSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELATEDWORKSET$0);
            }
        }
        
        /**
         * Sets array of all "relatedWorkSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setRelatedWorkSetArray(de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet[] relatedWorkSetArray)
        {
            check_orphaned();
            arraySetterHelper(relatedWorkSetArray, RELATEDWORKSET$0);
        }
        
        /**
         * Sets ith "relatedWorkSet" element
         */
        @Inject(optional=true) public void setRelatedWorkSetArray(int i, de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet relatedWorkSet)
        {
            generatedSetterHelperImpl(relatedWorkSet, RELATEDWORKSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "relatedWorkSet" element
         */
        public de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet insertNewRelatedWorkSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet target = null;
                target = (de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet)get_store().insert_element_user(RELATEDWORKSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "relatedWorkSet" element
         */
        public de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet addNewRelatedWorkSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet target = null;
                target = (de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet)get_store().add_element_user(RELATEDWORKSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "relatedWorkSet" element
         */
        public void removeRelatedWorkSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELATEDWORKSET$0, i);
            }
        }
    }
}
