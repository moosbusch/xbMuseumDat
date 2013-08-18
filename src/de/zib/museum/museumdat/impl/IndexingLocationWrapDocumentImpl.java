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
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one indexingLocationWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class IndexingLocationWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingLocationWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingLocationWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGLOCATIONWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingLocationWrap");
    
    
    /**
     * Gets the "indexingLocationWrap" element
     */
    public de.zib.museum.museumdat.IndexingLocationWrapDocument.IndexingLocationWrap getIndexingLocationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingLocationWrapDocument.IndexingLocationWrap target = null;
            target = (de.zib.museum.museumdat.IndexingLocationWrapDocument.IndexingLocationWrap)get_store().find_element_user(INDEXINGLOCATIONWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingLocationWrap" element
     */
    @Inject(optional=true) public void setIndexingLocationWrap(de.zib.museum.museumdat.IndexingLocationWrapDocument.IndexingLocationWrap indexingLocationWrap)
    {
        generatedSetterHelperImpl(indexingLocationWrap, INDEXINGLOCATIONWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingLocationWrap" element
     */
    public de.zib.museum.museumdat.IndexingLocationWrapDocument.IndexingLocationWrap addNewIndexingLocationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingLocationWrapDocument.IndexingLocationWrap target = null;
            target = (de.zib.museum.museumdat.IndexingLocationWrapDocument.IndexingLocationWrap)get_store().add_element_user(INDEXINGLOCATIONWRAP$0);
            return target;
        }
    }
    /**
     * An XML indexingLocationWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class IndexingLocationWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingLocationWrapDocument.IndexingLocationWrap
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingLocationWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INDEXINGLOCATIONSET$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingLocationSet");
        
        
        /**
         * Gets a List of "indexingLocationSet" elements
         */
        public java.util.List<de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet> getIndexingLocationSetList()
        {
            final class IndexingLocationSetList extends java.util.AbstractList<de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet>
            {
                @Override
                public de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet get(int i)
                    { return IndexingLocationWrapImpl.this.getIndexingLocationSetArray(i); }
                
                @Override
                public de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet set(int i, de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet o)
                {
                    de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet old = IndexingLocationWrapImpl.this.getIndexingLocationSetArray(i);
                    IndexingLocationWrapImpl.this.setIndexingLocationSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet o)
                    { IndexingLocationWrapImpl.this.insertNewIndexingLocationSet(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet remove(int i)
                {
                    de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet old = IndexingLocationWrapImpl.this.getIndexingLocationSetArray(i);
                    IndexingLocationWrapImpl.this.removeIndexingLocationSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingLocationWrapImpl.this.sizeOfIndexingLocationSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new IndexingLocationSetList();
            }
        }
        
        /**
         * Gets array of all "indexingLocationSet" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet[] getIndexingLocationSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet> targetList = new java.util.ArrayList<de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet>();
                get_store().find_all_element_users(INDEXINGLOCATIONSET$0, targetList);
                de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet[] result = new de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "indexingLocationSet" element
         */
        public de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet getIndexingLocationSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet target = null;
                target = (de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet)get_store().find_element_user(INDEXINGLOCATIONSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "indexingLocationSet" element
         */
        public int sizeOfIndexingLocationSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGLOCATIONSET$0);
            }
        }
        
        /**
         * Sets array of all "indexingLocationSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setIndexingLocationSetArray(de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet[] indexingLocationSetArray)
        {
            check_orphaned();
            arraySetterHelper(indexingLocationSetArray, INDEXINGLOCATIONSET$0);
        }
        
        /**
         * Sets ith "indexingLocationSet" element
         */
        @Inject(optional=true) public void setIndexingLocationSetArray(int i, de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet indexingLocationSet)
        {
            generatedSetterHelperImpl(indexingLocationSet, INDEXINGLOCATIONSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indexingLocationSet" element
         */
        public de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet insertNewIndexingLocationSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet target = null;
                target = (de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet)get_store().insert_element_user(INDEXINGLOCATIONSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indexingLocationSet" element
         */
        public de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet addNewIndexingLocationSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet target = null;
                target = (de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet)get_store().add_element_user(INDEXINGLOCATIONSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "indexingLocationSet" element
         */
        public void removeIndexingLocationSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGLOCATIONSET$0, i);
            }
        }
    }
}
