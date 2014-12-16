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
 * A document containing one recordWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class RecordWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.RecordWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public RecordWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECORDWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "recordWrap");
    
    
    /**
     * Gets the "recordWrap" element
     */
    public de.zib.museum.museumdat.RecordWrapDocument.RecordWrap getRecordWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.RecordWrapDocument.RecordWrap target = null;
            target = (de.zib.museum.museumdat.RecordWrapDocument.RecordWrap)get_store().find_element_user(RECORDWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "recordWrap" element
     */
    public void setRecordWrap(de.zib.museum.museumdat.RecordWrapDocument.RecordWrap recordWrap)
    {
        generatedSetterHelperImpl(recordWrap, RECORDWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "recordWrap" element
     */
    public de.zib.museum.museumdat.RecordWrapDocument.RecordWrap addNewRecordWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.RecordWrapDocument.RecordWrap target = null;
            target = (de.zib.museum.museumdat.RecordWrapDocument.RecordWrap)get_store().add_element_user(RECORDWRAP$0);
            return target;
        }
    }
    /**
     * An XML recordWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class RecordWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.RecordWrapDocument.RecordWrap
    {
        private static final long serialVersionUID = 1L;
        
        public RecordWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RECORDID$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "recordID");
        private static final javax.xml.namespace.QName RECORDTYPE$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "recordType");
        private static final javax.xml.namespace.QName RECORDSOURCE$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "recordSource");
        private static final javax.xml.namespace.QName RECORDINFOSET$6 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "recordInfoSet");
        
        
        /**
         * Gets a List of "recordID" elements
         */
        public java.util.List<de.zib.museum.museumdat.RecordIDDocument.RecordID> getRecordIDList()
        {
            final class RecordIDList extends java.util.AbstractList<de.zib.museum.museumdat.RecordIDDocument.RecordID>
            {
                @Override
                public de.zib.museum.museumdat.RecordIDDocument.RecordID get(int i)
                    { return RecordWrapImpl.this.getRecordIDArray(i); }
                
                @Override
                public de.zib.museum.museumdat.RecordIDDocument.RecordID set(int i, de.zib.museum.museumdat.RecordIDDocument.RecordID o)
                {
                    de.zib.museum.museumdat.RecordIDDocument.RecordID old = RecordWrapImpl.this.getRecordIDArray(i);
                    RecordWrapImpl.this.setRecordIDArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.RecordIDDocument.RecordID o)
                    { RecordWrapImpl.this.insertNewRecordID(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.RecordIDDocument.RecordID remove(int i)
                {
                    de.zib.museum.museumdat.RecordIDDocument.RecordID old = RecordWrapImpl.this.getRecordIDArray(i);
                    RecordWrapImpl.this.removeRecordID(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RecordWrapImpl.this.sizeOfRecordIDArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RecordIDList();
            }
        }
        
        /**
         * Gets array of all "recordID" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.RecordIDDocument.RecordID[] getRecordIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.RecordIDDocument.RecordID> targetList = new java.util.ArrayList<de.zib.museum.museumdat.RecordIDDocument.RecordID>();
                get_store().find_all_element_users(RECORDID$0, targetList);
                de.zib.museum.museumdat.RecordIDDocument.RecordID[] result = new de.zib.museum.museumdat.RecordIDDocument.RecordID[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "recordID" element
         */
        public de.zib.museum.museumdat.RecordIDDocument.RecordID getRecordIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordIDDocument.RecordID target = null;
                target = (de.zib.museum.museumdat.RecordIDDocument.RecordID)get_store().find_element_user(RECORDID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "recordID" element
         */
        public int sizeOfRecordIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDID$0);
            }
        }
        
        /**
         * Sets array of all "recordID" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRecordIDArray(de.zib.museum.museumdat.RecordIDDocument.RecordID[] recordIDArray)
        {
            check_orphaned();
            arraySetterHelper(recordIDArray, RECORDID$0);
        }
        
        /**
         * Sets ith "recordID" element
         */
        public void setRecordIDArray(int i, de.zib.museum.museumdat.RecordIDDocument.RecordID recordID)
        {
            generatedSetterHelperImpl(recordID, RECORDID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordID" element
         */
        public de.zib.museum.museumdat.RecordIDDocument.RecordID insertNewRecordID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordIDDocument.RecordID target = null;
                target = (de.zib.museum.museumdat.RecordIDDocument.RecordID)get_store().insert_element_user(RECORDID$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordID" element
         */
        public de.zib.museum.museumdat.RecordIDDocument.RecordID addNewRecordID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordIDDocument.RecordID target = null;
                target = (de.zib.museum.museumdat.RecordIDDocument.RecordID)get_store().add_element_user(RECORDID$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "recordID" element
         */
        public void removeRecordID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDID$0, i);
            }
        }
        
        /**
         * Gets the "recordType" element
         */
        public de.zib.museum.museumdat.RecordTypeDocument.RecordType getRecordType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordTypeDocument.RecordType target = null;
                target = (de.zib.museum.museumdat.RecordTypeDocument.RecordType)get_store().find_element_user(RECORDTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "recordType" element
         */
        public void setRecordType(de.zib.museum.museumdat.RecordTypeDocument.RecordType recordType)
        {
            generatedSetterHelperImpl(recordType, RECORDTYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "recordType" element
         */
        public de.zib.museum.museumdat.RecordTypeDocument.RecordType addNewRecordType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordTypeDocument.RecordType target = null;
                target = (de.zib.museum.museumdat.RecordTypeDocument.RecordType)get_store().add_element_user(RECORDTYPE$2);
                return target;
            }
        }
        
        /**
         * Gets a List of "recordSource" elements
         */
        public java.util.List<de.zib.museum.museumdat.RecordSourceDocument.RecordSource> getRecordSourceList()
        {
            final class RecordSourceList extends java.util.AbstractList<de.zib.museum.museumdat.RecordSourceDocument.RecordSource>
            {
                @Override
                public de.zib.museum.museumdat.RecordSourceDocument.RecordSource get(int i)
                    { return RecordWrapImpl.this.getRecordSourceArray(i); }
                
                @Override
                public de.zib.museum.museumdat.RecordSourceDocument.RecordSource set(int i, de.zib.museum.museumdat.RecordSourceDocument.RecordSource o)
                {
                    de.zib.museum.museumdat.RecordSourceDocument.RecordSource old = RecordWrapImpl.this.getRecordSourceArray(i);
                    RecordWrapImpl.this.setRecordSourceArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.RecordSourceDocument.RecordSource o)
                    { RecordWrapImpl.this.insertNewRecordSource(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.RecordSourceDocument.RecordSource remove(int i)
                {
                    de.zib.museum.museumdat.RecordSourceDocument.RecordSource old = RecordWrapImpl.this.getRecordSourceArray(i);
                    RecordWrapImpl.this.removeRecordSource(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RecordWrapImpl.this.sizeOfRecordSourceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RecordSourceList();
            }
        }
        
        /**
         * Gets array of all "recordSource" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.RecordSourceDocument.RecordSource[] getRecordSourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.RecordSourceDocument.RecordSource> targetList = new java.util.ArrayList<de.zib.museum.museumdat.RecordSourceDocument.RecordSource>();
                get_store().find_all_element_users(RECORDSOURCE$4, targetList);
                de.zib.museum.museumdat.RecordSourceDocument.RecordSource[] result = new de.zib.museum.museumdat.RecordSourceDocument.RecordSource[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "recordSource" element
         */
        public de.zib.museum.museumdat.RecordSourceDocument.RecordSource getRecordSourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordSourceDocument.RecordSource target = null;
                target = (de.zib.museum.museumdat.RecordSourceDocument.RecordSource)get_store().find_element_user(RECORDSOURCE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "recordSource" element
         */
        public int sizeOfRecordSourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDSOURCE$4);
            }
        }
        
        /**
         * Sets array of all "recordSource" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRecordSourceArray(de.zib.museum.museumdat.RecordSourceDocument.RecordSource[] recordSourceArray)
        {
            check_orphaned();
            arraySetterHelper(recordSourceArray, RECORDSOURCE$4);
        }
        
        /**
         * Sets ith "recordSource" element
         */
        public void setRecordSourceArray(int i, de.zib.museum.museumdat.RecordSourceDocument.RecordSource recordSource)
        {
            generatedSetterHelperImpl(recordSource, RECORDSOURCE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordSource" element
         */
        public de.zib.museum.museumdat.RecordSourceDocument.RecordSource insertNewRecordSource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordSourceDocument.RecordSource target = null;
                target = (de.zib.museum.museumdat.RecordSourceDocument.RecordSource)get_store().insert_element_user(RECORDSOURCE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordSource" element
         */
        public de.zib.museum.museumdat.RecordSourceDocument.RecordSource addNewRecordSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordSourceDocument.RecordSource target = null;
                target = (de.zib.museum.museumdat.RecordSourceDocument.RecordSource)get_store().add_element_user(RECORDSOURCE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "recordSource" element
         */
        public void removeRecordSource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDSOURCE$4, i);
            }
        }
        
        /**
         * Gets a List of "recordInfoSet" elements
         */
        public java.util.List<de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet> getRecordInfoSetList()
        {
            final class RecordInfoSetList extends java.util.AbstractList<de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet>
            {
                @Override
                public de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet get(int i)
                    { return RecordWrapImpl.this.getRecordInfoSetArray(i); }
                
                @Override
                public de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet set(int i, de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet o)
                {
                    de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet old = RecordWrapImpl.this.getRecordInfoSetArray(i);
                    RecordWrapImpl.this.setRecordInfoSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet o)
                    { RecordWrapImpl.this.insertNewRecordInfoSet(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet remove(int i)
                {
                    de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet old = RecordWrapImpl.this.getRecordInfoSetArray(i);
                    RecordWrapImpl.this.removeRecordInfoSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RecordWrapImpl.this.sizeOfRecordInfoSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RecordInfoSetList();
            }
        }
        
        /**
         * Gets array of all "recordInfoSet" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet[] getRecordInfoSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet> targetList = new java.util.ArrayList<de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet>();
                get_store().find_all_element_users(RECORDINFOSET$6, targetList);
                de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet[] result = new de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "recordInfoSet" element
         */
        public de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet getRecordInfoSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet target = null;
                target = (de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet)get_store().find_element_user(RECORDINFOSET$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "recordInfoSet" element
         */
        public int sizeOfRecordInfoSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDINFOSET$6);
            }
        }
        
        /**
         * Sets array of all "recordInfoSet" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRecordInfoSetArray(de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet[] recordInfoSetArray)
        {
            check_orphaned();
            arraySetterHelper(recordInfoSetArray, RECORDINFOSET$6);
        }
        
        /**
         * Sets ith "recordInfoSet" element
         */
        public void setRecordInfoSetArray(int i, de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet recordInfoSet)
        {
            generatedSetterHelperImpl(recordInfoSet, RECORDINFOSET$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordInfoSet" element
         */
        public de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet insertNewRecordInfoSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet target = null;
                target = (de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet)get_store().insert_element_user(RECORDINFOSET$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordInfoSet" element
         */
        public de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet addNewRecordInfoSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet target = null;
                target = (de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet)get_store().add_element_user(RECORDINFOSET$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "recordInfoSet" element
         */
        public void removeRecordInfoSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDINFOSET$6, i);
            }
        }
    }
}
