/*
 * An XML document type.
 * Localname: indexingSubjectWrap
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.IndexingSubjectWrapDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one indexingSubjectWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class IndexingSubjectWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingSubjectWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingSubjectWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGSUBJECTWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingSubjectWrap");
    
    
    /**
     * Gets the "indexingSubjectWrap" element
     */
    public de.zib.museum.museumdat.IndexingSubjectWrapDocument.IndexingSubjectWrap getIndexingSubjectWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingSubjectWrapDocument.IndexingSubjectWrap target = null;
            target = (de.zib.museum.museumdat.IndexingSubjectWrapDocument.IndexingSubjectWrap)get_store().find_element_user(INDEXINGSUBJECTWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingSubjectWrap" element
     */
    @Inject(optional=true) public void setIndexingSubjectWrap(de.zib.museum.museumdat.IndexingSubjectWrapDocument.IndexingSubjectWrap indexingSubjectWrap)
    {
        generatedSetterHelperImpl(indexingSubjectWrap, INDEXINGSUBJECTWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingSubjectWrap" element
     */
    public de.zib.museum.museumdat.IndexingSubjectWrapDocument.IndexingSubjectWrap addNewIndexingSubjectWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingSubjectWrapDocument.IndexingSubjectWrap target = null;
            target = (de.zib.museum.museumdat.IndexingSubjectWrapDocument.IndexingSubjectWrap)get_store().add_element_user(INDEXINGSUBJECTWRAP$0);
            return target;
        }
    }
    /**
     * An XML indexingSubjectWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class IndexingSubjectWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingSubjectWrapDocument.IndexingSubjectWrap
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingSubjectWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INDEXINGSUBJECTSET$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingSubjectSet");
        
        
        /**
         * Gets a List of "indexingSubjectSet" elements
         */
        public java.util.List<de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet> getIndexingSubjectSetList()
        {
            final class IndexingSubjectSetList extends java.util.AbstractList<de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet>
            {
                @Override
                public de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet get(int i)
                    { return IndexingSubjectWrapImpl.this.getIndexingSubjectSetArray(i); }
                
                @Override
                public de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet set(int i, de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet o)
                {
                    de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet old = IndexingSubjectWrapImpl.this.getIndexingSubjectSetArray(i);
                    IndexingSubjectWrapImpl.this.setIndexingSubjectSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet o)
                    { IndexingSubjectWrapImpl.this.insertNewIndexingSubjectSet(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet remove(int i)
                {
                    de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet old = IndexingSubjectWrapImpl.this.getIndexingSubjectSetArray(i);
                    IndexingSubjectWrapImpl.this.removeIndexingSubjectSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingSubjectWrapImpl.this.sizeOfIndexingSubjectSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new IndexingSubjectSetList();
            }
        }
        
        /**
         * Gets array of all "indexingSubjectSet" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet[] getIndexingSubjectSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet> targetList = new java.util.ArrayList<de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet>();
                get_store().find_all_element_users(INDEXINGSUBJECTSET$0, targetList);
                de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet[] result = new de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "indexingSubjectSet" element
         */
        public de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet getIndexingSubjectSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet target = null;
                target = (de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet)get_store().find_element_user(INDEXINGSUBJECTSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "indexingSubjectSet" element
         */
        public int sizeOfIndexingSubjectSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGSUBJECTSET$0);
            }
        }
        
        /**
         * Sets array of all "indexingSubjectSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setIndexingSubjectSetArray(de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet[] indexingSubjectSetArray)
        {
            check_orphaned();
            arraySetterHelper(indexingSubjectSetArray, INDEXINGSUBJECTSET$0);
        }
        
        /**
         * Sets ith "indexingSubjectSet" element
         */
        @Inject(optional=true) public void setIndexingSubjectSetArray(int i, de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet indexingSubjectSet)
        {
            generatedSetterHelperImpl(indexingSubjectSet, INDEXINGSUBJECTSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indexingSubjectSet" element
         */
        public de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet insertNewIndexingSubjectSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet target = null;
                target = (de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet)get_store().insert_element_user(INDEXINGSUBJECTSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indexingSubjectSet" element
         */
        public de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet addNewIndexingSubjectSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet target = null;
                target = (de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet)get_store().add_element_user(INDEXINGSUBJECTSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "indexingSubjectSet" element
         */
        public void removeIndexingSubjectSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGSUBJECTSET$0, i);
            }
        }
    }
}
