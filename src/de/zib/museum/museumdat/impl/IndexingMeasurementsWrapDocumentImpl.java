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
 * A document containing one indexingMeasurementsWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class IndexingMeasurementsWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingMeasurementsWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingMeasurementsWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGMEASUREMENTSWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingMeasurementsWrap");
    
    
    /**
     * Gets the "indexingMeasurementsWrap" element
     */
    public de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap getIndexingMeasurementsWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap target = null;
            target = (de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap)get_store().find_element_user(INDEXINGMEASUREMENTSWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingMeasurementsWrap" element
     */
    public void setIndexingMeasurementsWrap(de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap indexingMeasurementsWrap)
    {
        generatedSetterHelperImpl(indexingMeasurementsWrap, INDEXINGMEASUREMENTSWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingMeasurementsWrap" element
     */
    public de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap addNewIndexingMeasurementsWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap target = null;
            target = (de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap)get_store().add_element_user(INDEXINGMEASUREMENTSWRAP$0);
            return target;
        }
    }
    /**
     * An XML indexingMeasurementsWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class IndexingMeasurementsWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingMeasurementsWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INDEXINGMEASUREMENTSSET$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingMeasurementsSet");
        
        
        /**
         * Gets a List of "indexingMeasurementsSet" elements
         */
        public java.util.List<de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet> getIndexingMeasurementsSetList()
        {
            final class IndexingMeasurementsSetList extends java.util.AbstractList<de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet>
            {
                @Override
                public de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet get(int i)
                    { return IndexingMeasurementsWrapImpl.this.getIndexingMeasurementsSetArray(i); }
                
                @Override
                public de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet set(int i, de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet o)
                {
                    de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet old = IndexingMeasurementsWrapImpl.this.getIndexingMeasurementsSetArray(i);
                    IndexingMeasurementsWrapImpl.this.setIndexingMeasurementsSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet o)
                    { IndexingMeasurementsWrapImpl.this.insertNewIndexingMeasurementsSet(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet remove(int i)
                {
                    de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet old = IndexingMeasurementsWrapImpl.this.getIndexingMeasurementsSetArray(i);
                    IndexingMeasurementsWrapImpl.this.removeIndexingMeasurementsSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsWrapImpl.this.sizeOfIndexingMeasurementsSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new IndexingMeasurementsSetList();
            }
        }
        
        /**
         * Gets array of all "indexingMeasurementsSet" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet[] getIndexingMeasurementsSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet> targetList = new java.util.ArrayList<de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet>();
                get_store().find_all_element_users(INDEXINGMEASUREMENTSSET$0, targetList);
                de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet[] result = new de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "indexingMeasurementsSet" element
         */
        public de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet getIndexingMeasurementsSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet target = null;
                target = (de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet)get_store().find_element_user(INDEXINGMEASUREMENTSSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "indexingMeasurementsSet" element
         */
        public int sizeOfIndexingMeasurementsSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGMEASUREMENTSSET$0);
            }
        }
        
        /**
         * Sets array of all "indexingMeasurementsSet" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setIndexingMeasurementsSetArray(de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet[] indexingMeasurementsSetArray)
        {
            check_orphaned();
            arraySetterHelper(indexingMeasurementsSetArray, INDEXINGMEASUREMENTSSET$0);
        }
        
        /**
         * Sets ith "indexingMeasurementsSet" element
         */
        public void setIndexingMeasurementsSetArray(int i, de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet indexingMeasurementsSet)
        {
            generatedSetterHelperImpl(indexingMeasurementsSet, INDEXINGMEASUREMENTSSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indexingMeasurementsSet" element
         */
        public de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet insertNewIndexingMeasurementsSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet target = null;
                target = (de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet)get_store().insert_element_user(INDEXINGMEASUREMENTSSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indexingMeasurementsSet" element
         */
        public de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet addNewIndexingMeasurementsSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet target = null;
                target = (de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet)get_store().add_element_user(INDEXINGMEASUREMENTSSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "indexingMeasurementsSet" element
         */
        public void removeIndexingMeasurementsSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGMEASUREMENTSSET$0, i);
            }
        }
    }
}
