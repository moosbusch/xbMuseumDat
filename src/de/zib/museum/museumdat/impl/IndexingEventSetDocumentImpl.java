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
 * A document containing one indexingEventSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class IndexingEventSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingEventSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingEventSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGEVENTSET$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingEventSet");
    
    
    /**
     * Gets the "indexingEventSet" element
     */
    public de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet getIndexingEventSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet target = null;
            target = (de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet)get_store().find_element_user(INDEXINGEVENTSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingEventSet" element
     */
    @Inject(optional=true) public void setIndexingEventSet(de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet indexingEventSet)
    {
        generatedSetterHelperImpl(indexingEventSet, INDEXINGEVENTSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingEventSet" element
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
     * An XML indexingEventSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class IndexingEventSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingEventSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EVENTTYPE$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "eventType");
        private static final javax.xml.namespace.QName INDEXINGACTORSET$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingActorSet");
        private static final javax.xml.namespace.QName INDEXINGDATES$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingDates");
        private static final javax.xml.namespace.QName INDEXINGLOCATIONWRAP$6 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingLocationWrap");
        
        
        /**
         * Gets the "eventType" element
         */
        public de.zib.museum.museumdat.EventTypeDocument.EventType getEventType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.EventTypeDocument.EventType target = null;
                target = (de.zib.museum.museumdat.EventTypeDocument.EventType)get_store().find_element_user(EVENTTYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "eventType" element
         */
        @Inject(optional=true) public void setEventType(de.zib.museum.museumdat.EventTypeDocument.EventType eventType)
        {
            generatedSetterHelperImpl(eventType, EVENTTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "eventType" element
         */
        public de.zib.museum.museumdat.EventTypeDocument.EventType addNewEventType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.EventTypeDocument.EventType target = null;
                target = (de.zib.museum.museumdat.EventTypeDocument.EventType)get_store().add_element_user(EVENTTYPE$0);
                return target;
            }
        }
        
        /**
         * Gets a List of "indexingActorSet" elements
         */
        public java.util.List<de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet> getIndexingActorSetList()
        {
            final class IndexingActorSetList extends java.util.AbstractList<de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet>
            {
                @Override
                public de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet get(int i)
                    { return IndexingEventSetImpl.this.getIndexingActorSetArray(i); }
                
                @Override
                public de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet set(int i, de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet o)
                {
                    de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet old = IndexingEventSetImpl.this.getIndexingActorSetArray(i);
                    IndexingEventSetImpl.this.setIndexingActorSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet o)
                    { IndexingEventSetImpl.this.insertNewIndexingActorSet(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet remove(int i)
                {
                    de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet old = IndexingEventSetImpl.this.getIndexingActorSetArray(i);
                    IndexingEventSetImpl.this.removeIndexingActorSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingEventSetImpl.this.sizeOfIndexingActorSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new IndexingActorSetList();
            }
        }
        
        /**
         * Gets array of all "indexingActorSet" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet[] getIndexingActorSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet> targetList = new java.util.ArrayList<de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet>();
                get_store().find_all_element_users(INDEXINGACTORSET$2, targetList);
                de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet[] result = new de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "indexingActorSet" element
         */
        public de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet getIndexingActorSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet target = null;
                target = (de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet)get_store().find_element_user(INDEXINGACTORSET$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "indexingActorSet" element
         */
        public int sizeOfIndexingActorSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGACTORSET$2);
            }
        }
        
        /**
         * Sets array of all "indexingActorSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setIndexingActorSetArray(de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet[] indexingActorSetArray)
        {
            check_orphaned();
            arraySetterHelper(indexingActorSetArray, INDEXINGACTORSET$2);
        }
        
        /**
         * Sets ith "indexingActorSet" element
         */
        @Inject(optional=true) public void setIndexingActorSetArray(int i, de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet indexingActorSet)
        {
            generatedSetterHelperImpl(indexingActorSet, INDEXINGACTORSET$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indexingActorSet" element
         */
        public de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet insertNewIndexingActorSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet target = null;
                target = (de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet)get_store().insert_element_user(INDEXINGACTORSET$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indexingActorSet" element
         */
        public de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet addNewIndexingActorSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet target = null;
                target = (de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet)get_store().add_element_user(INDEXINGACTORSET$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "indexingActorSet" element
         */
        public void removeIndexingActorSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGACTORSET$2, i);
            }
        }
        
        /**
         * Gets the "indexingDates" element
         */
        public de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates getIndexingDates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates target = null;
                target = (de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates)get_store().find_element_user(INDEXINGDATES$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "indexingDates" element
         */
        public boolean isSetIndexingDates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGDATES$4) != 0;
            }
        }
        
        /**
         * Sets the "indexingDates" element
         */
        @Inject(optional=true) public void setIndexingDates(de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates indexingDates)
        {
            generatedSetterHelperImpl(indexingDates, INDEXINGDATES$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "indexingDates" element
         */
        public de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates addNewIndexingDates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates target = null;
                target = (de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates)get_store().add_element_user(INDEXINGDATES$4);
                return target;
            }
        }
        
        /**
         * Unsets the "indexingDates" element
         */
        public void unsetIndexingDates()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGDATES$4, 0);
            }
        }
        
        /**
         * Gets the "indexingLocationWrap" element
         */
        public de.zib.museum.museumdat.IndexingLocationWrapDocument.IndexingLocationWrap getIndexingLocationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingLocationWrapDocument.IndexingLocationWrap target = null;
                target = (de.zib.museum.museumdat.IndexingLocationWrapDocument.IndexingLocationWrap)get_store().find_element_user(INDEXINGLOCATIONWRAP$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "indexingLocationWrap" element
         */
        public boolean isSetIndexingLocationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGLOCATIONWRAP$6) != 0;
            }
        }
        
        /**
         * Sets the "indexingLocationWrap" element
         */
        @Inject(optional=true) public void setIndexingLocationWrap(de.zib.museum.museumdat.IndexingLocationWrapDocument.IndexingLocationWrap indexingLocationWrap)
        {
            generatedSetterHelperImpl(indexingLocationWrap, INDEXINGLOCATIONWRAP$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (de.zib.museum.museumdat.IndexingLocationWrapDocument.IndexingLocationWrap)get_store().add_element_user(INDEXINGLOCATIONWRAP$6);
                return target;
            }
        }
        
        /**
         * Unsets the "indexingLocationWrap" element
         */
        public void unsetIndexingLocationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGLOCATIONWRAP$6, 0);
            }
        }
    }
}
