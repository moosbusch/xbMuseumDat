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
 * A document containing one indexingEventWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class IndexingEventWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingEventWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingEventWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGEVENTWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingEventWrap");
    
    
    /**
     * Gets the "indexingEventWrap" element
     */
    public de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap getIndexingEventWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap target = null;
            target = (de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap)get_store().find_element_user(INDEXINGEVENTWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingEventWrap" element
     */
    public void setIndexingEventWrap(de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap indexingEventWrap)
    {
        generatedSetterHelperImpl(indexingEventWrap, INDEXINGEVENTWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingEventWrap" element
     */
    public de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap addNewIndexingEventWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap target = null;
            target = (de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap)get_store().add_element_user(INDEXINGEVENTWRAP$0);
            return target;
        }
    }
    /**
     * An XML indexingEventWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class IndexingEventWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingEventWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INDEXINGEVENTSET$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingEventSet");
        
        
        /**
         * Gets a List of "indexingEventSet" elements
         */
        public java.util.List<de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet> getIndexingEventSetList()
        {
            final class IndexingEventSetList extends java.util.AbstractList<de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet>
            {
                @Override
                public de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet get(int i)
                    { return IndexingEventWrapImpl.this.getIndexingEventSetArray(i); }
                
                @Override
                public de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet set(int i, de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet o)
                {
                    de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet old = IndexingEventWrapImpl.this.getIndexingEventSetArray(i);
                    IndexingEventWrapImpl.this.setIndexingEventSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet o)
                    { IndexingEventWrapImpl.this.insertNewIndexingEventSet(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet remove(int i)
                {
                    de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet old = IndexingEventWrapImpl.this.getIndexingEventSetArray(i);
                    IndexingEventWrapImpl.this.removeIndexingEventSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingEventWrapImpl.this.sizeOfIndexingEventSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new IndexingEventSetList();
            }
        }
        
        /**
         * Gets array of all "indexingEventSet" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet[] getIndexingEventSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet> targetList = new java.util.ArrayList<de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet>();
                get_store().find_all_element_users(INDEXINGEVENTSET$0, targetList);
                de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet[] result = new de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "indexingEventSet" element
         */
        public de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet getIndexingEventSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet target = null;
                target = (de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet)get_store().find_element_user(INDEXINGEVENTSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "indexingEventSet" element
         */
        public int sizeOfIndexingEventSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGEVENTSET$0);
            }
        }
        
        /**
         * Sets array of all "indexingEventSet" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setIndexingEventSetArray(de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet[] indexingEventSetArray)
        {
            check_orphaned();
            arraySetterHelper(indexingEventSetArray, INDEXINGEVENTSET$0);
        }
        
        /**
         * Sets ith "indexingEventSet" element
         */
        public void setIndexingEventSetArray(int i, de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet indexingEventSet)
        {
            generatedSetterHelperImpl(indexingEventSet, INDEXINGEVENTSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indexingEventSet" element
         */
        public de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet insertNewIndexingEventSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet target = null;
                target = (de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet)get_store().insert_element_user(INDEXINGEVENTSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indexingEventSet" element
         */
        public de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet addNewIndexingEventSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet target = null;
                target = (de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet)get_store().add_element_user(INDEXINGEVENTSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "indexingEventSet" element
         */
        public void removeIndexingEventSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGEVENTSET$0, i);
            }
        }
    }
}
