/*
 * An XML document type.
 * Localname: indexingMaterialsTechWrap
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one indexingMaterialsTechWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class IndexingMaterialsTechWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingMaterialsTechWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGMATERIALSTECHWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingMaterialsTechWrap");
    
    
    /**
     * Gets the "indexingMaterialsTechWrap" element
     */
    public de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap getIndexingMaterialsTechWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap target = null;
            target = (de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap)get_store().find_element_user(INDEXINGMATERIALSTECHWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingMaterialsTechWrap" element
     */
    @Inject(optional=true) public void setIndexingMaterialsTechWrap(de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap indexingMaterialsTechWrap)
    {
        generatedSetterHelperImpl(indexingMaterialsTechWrap, INDEXINGMATERIALSTECHWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingMaterialsTechWrap" element
     */
    public de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap addNewIndexingMaterialsTechWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap target = null;
            target = (de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap)get_store().add_element_user(INDEXINGMATERIALSTECHWRAP$0);
            return target;
        }
    }
    /**
     * An XML indexingMaterialsTechWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class IndexingMaterialsTechWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingMaterialsTechWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INDEXINGMATERIALSTECHSET$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingMaterialsTechSet");
        
        
        /**
         * Gets a List of "indexingMaterialsTechSet" elements
         */
        public java.util.List<de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet> getIndexingMaterialsTechSetList()
        {
            final class IndexingMaterialsTechSetList extends java.util.AbstractList<de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet>
            {
                @Override
                public de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet get(int i)
                    { return IndexingMaterialsTechWrapImpl.this.getIndexingMaterialsTechSetArray(i); }
                
                @Override
                public de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet set(int i, de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet o)
                {
                    de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet old = IndexingMaterialsTechWrapImpl.this.getIndexingMaterialsTechSetArray(i);
                    IndexingMaterialsTechWrapImpl.this.setIndexingMaterialsTechSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet o)
                    { IndexingMaterialsTechWrapImpl.this.insertNewIndexingMaterialsTechSet(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet remove(int i)
                {
                    de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet old = IndexingMaterialsTechWrapImpl.this.getIndexingMaterialsTechSetArray(i);
                    IndexingMaterialsTechWrapImpl.this.removeIndexingMaterialsTechSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMaterialsTechWrapImpl.this.sizeOfIndexingMaterialsTechSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new IndexingMaterialsTechSetList();
            }
        }
        
        /**
         * Gets array of all "indexingMaterialsTechSet" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet[] getIndexingMaterialsTechSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet> targetList = new java.util.ArrayList<de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet>();
                get_store().find_all_element_users(INDEXINGMATERIALSTECHSET$0, targetList);
                de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet[] result = new de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "indexingMaterialsTechSet" element
         */
        public de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet getIndexingMaterialsTechSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet target = null;
                target = (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet)get_store().find_element_user(INDEXINGMATERIALSTECHSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "indexingMaterialsTechSet" element
         */
        public int sizeOfIndexingMaterialsTechSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGMATERIALSTECHSET$0);
            }
        }
        
        /**
         * Sets array of all "indexingMaterialsTechSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setIndexingMaterialsTechSetArray(de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet[] indexingMaterialsTechSetArray)
        {
            check_orphaned();
            arraySetterHelper(indexingMaterialsTechSetArray, INDEXINGMATERIALSTECHSET$0);
        }
        
        /**
         * Sets ith "indexingMaterialsTechSet" element
         */
        @Inject(optional=true) public void setIndexingMaterialsTechSetArray(int i, de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet indexingMaterialsTechSet)
        {
            generatedSetterHelperImpl(indexingMaterialsTechSet, INDEXINGMATERIALSTECHSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indexingMaterialsTechSet" element
         */
        public de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet insertNewIndexingMaterialsTechSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet target = null;
                target = (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet)get_store().insert_element_user(INDEXINGMATERIALSTECHSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indexingMaterialsTechSet" element
         */
        public de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet addNewIndexingMaterialsTechSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet target = null;
                target = (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet)get_store().add_element_user(INDEXINGMATERIALSTECHSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "indexingMaterialsTechSet" element
         */
        public void removeIndexingMaterialsTechSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGMATERIALSTECHSET$0, i);
            }
        }
    }
}
