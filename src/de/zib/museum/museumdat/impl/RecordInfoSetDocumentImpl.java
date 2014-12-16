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
 * A document containing one recordInfoSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class RecordInfoSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.RecordInfoSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public RecordInfoSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECORDINFOSET$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "recordInfoSet");
    
    
    /**
     * Gets the "recordInfoSet" element
     */
    public de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet getRecordInfoSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet target = null;
            target = (de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet)get_store().find_element_user(RECORDINFOSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "recordInfoSet" element
     */
    public void setRecordInfoSet(de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet recordInfoSet)
    {
        generatedSetterHelperImpl(recordInfoSet, RECORDINFOSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "recordInfoSet" element
     */
    public de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet addNewRecordInfoSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet target = null;
            target = (de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet)get_store().add_element_user(RECORDINFOSET$0);
            return target;
        }
    }
    /**
     * An XML recordInfoSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class RecordInfoSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet
    {
        private static final long serialVersionUID = 1L;
        
        public RecordInfoSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RECORDINFOID$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "recordInfoID");
        private static final javax.xml.namespace.QName RECORDINFOLINK$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "recordInfoLink");
        private static final javax.xml.namespace.QName RECORDRELID$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "recordRelID");
        private static final javax.xml.namespace.QName RECORDMETADATALOC$6 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "recordMetadataLoc");
        private static final javax.xml.namespace.QName RECORDMETADATADATE$8 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "recordMetadataDate");
        private static final javax.xml.namespace.QName TYPE$10 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "type");
        
        
        /**
         * Gets a List of "recordInfoID" elements
         */
        public java.util.List<de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID> getRecordInfoIDList()
        {
            final class RecordInfoIDList extends java.util.AbstractList<de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID>
            {
                @Override
                public de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID get(int i)
                    { return RecordInfoSetImpl.this.getRecordInfoIDArray(i); }
                
                @Override
                public de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID set(int i, de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID o)
                {
                    de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID old = RecordInfoSetImpl.this.getRecordInfoIDArray(i);
                    RecordInfoSetImpl.this.setRecordInfoIDArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID o)
                    { RecordInfoSetImpl.this.insertNewRecordInfoID(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID remove(int i)
                {
                    de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID old = RecordInfoSetImpl.this.getRecordInfoIDArray(i);
                    RecordInfoSetImpl.this.removeRecordInfoID(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RecordInfoSetImpl.this.sizeOfRecordInfoIDArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RecordInfoIDList();
            }
        }
        
        /**
         * Gets array of all "recordInfoID" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID[] getRecordInfoIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID> targetList = new java.util.ArrayList<de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID>();
                get_store().find_all_element_users(RECORDINFOID$0, targetList);
                de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID[] result = new de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "recordInfoID" element
         */
        public de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID getRecordInfoIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID target = null;
                target = (de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID)get_store().find_element_user(RECORDINFOID$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "recordInfoID" element
         */
        public int sizeOfRecordInfoIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDINFOID$0);
            }
        }
        
        /**
         * Sets array of all "recordInfoID" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRecordInfoIDArray(de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID[] recordInfoIDArray)
        {
            check_orphaned();
            arraySetterHelper(recordInfoIDArray, RECORDINFOID$0);
        }
        
        /**
         * Sets ith "recordInfoID" element
         */
        public void setRecordInfoIDArray(int i, de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID recordInfoID)
        {
            generatedSetterHelperImpl(recordInfoID, RECORDINFOID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordInfoID" element
         */
        public de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID insertNewRecordInfoID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID target = null;
                target = (de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID)get_store().insert_element_user(RECORDINFOID$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordInfoID" element
         */
        public de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID addNewRecordInfoID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID target = null;
                target = (de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID)get_store().add_element_user(RECORDINFOID$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "recordInfoID" element
         */
        public void removeRecordInfoID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDINFOID$0, i);
            }
        }
        
        /**
         * Gets a List of "recordInfoLink" elements
         */
        public java.util.List<de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink> getRecordInfoLinkList()
        {
            final class RecordInfoLinkList extends java.util.AbstractList<de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink>
            {
                @Override
                public de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink get(int i)
                    { return RecordInfoSetImpl.this.getRecordInfoLinkArray(i); }
                
                @Override
                public de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink set(int i, de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink o)
                {
                    de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink old = RecordInfoSetImpl.this.getRecordInfoLinkArray(i);
                    RecordInfoSetImpl.this.setRecordInfoLinkArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink o)
                    { RecordInfoSetImpl.this.insertNewRecordInfoLink(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink remove(int i)
                {
                    de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink old = RecordInfoSetImpl.this.getRecordInfoLinkArray(i);
                    RecordInfoSetImpl.this.removeRecordInfoLink(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RecordInfoSetImpl.this.sizeOfRecordInfoLinkArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RecordInfoLinkList();
            }
        }
        
        /**
         * Gets array of all "recordInfoLink" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink[] getRecordInfoLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink> targetList = new java.util.ArrayList<de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink>();
                get_store().find_all_element_users(RECORDINFOLINK$2, targetList);
                de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink[] result = new de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "recordInfoLink" element
         */
        public de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink getRecordInfoLinkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink target = null;
                target = (de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink)get_store().find_element_user(RECORDINFOLINK$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "recordInfoLink" element
         */
        public int sizeOfRecordInfoLinkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDINFOLINK$2);
            }
        }
        
        /**
         * Sets array of all "recordInfoLink" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRecordInfoLinkArray(de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink[] recordInfoLinkArray)
        {
            check_orphaned();
            arraySetterHelper(recordInfoLinkArray, RECORDINFOLINK$2);
        }
        
        /**
         * Sets ith "recordInfoLink" element
         */
        public void setRecordInfoLinkArray(int i, de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink recordInfoLink)
        {
            generatedSetterHelperImpl(recordInfoLink, RECORDINFOLINK$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordInfoLink" element
         */
        public de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink insertNewRecordInfoLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink target = null;
                target = (de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink)get_store().insert_element_user(RECORDINFOLINK$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordInfoLink" element
         */
        public de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink addNewRecordInfoLink()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink target = null;
                target = (de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink)get_store().add_element_user(RECORDINFOLINK$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "recordInfoLink" element
         */
        public void removeRecordInfoLink(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDINFOLINK$2, i);
            }
        }
        
        /**
         * Gets a List of "recordRelID" elements
         */
        public java.util.List<de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID> getRecordRelIDList()
        {
            final class RecordRelIDList extends java.util.AbstractList<de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID>
            {
                @Override
                public de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID get(int i)
                    { return RecordInfoSetImpl.this.getRecordRelIDArray(i); }
                
                @Override
                public de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID set(int i, de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID o)
                {
                    de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID old = RecordInfoSetImpl.this.getRecordRelIDArray(i);
                    RecordInfoSetImpl.this.setRecordRelIDArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID o)
                    { RecordInfoSetImpl.this.insertNewRecordRelID(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID remove(int i)
                {
                    de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID old = RecordInfoSetImpl.this.getRecordRelIDArray(i);
                    RecordInfoSetImpl.this.removeRecordRelID(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RecordInfoSetImpl.this.sizeOfRecordRelIDArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RecordRelIDList();
            }
        }
        
        /**
         * Gets array of all "recordRelID" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID[] getRecordRelIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID> targetList = new java.util.ArrayList<de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID>();
                get_store().find_all_element_users(RECORDRELID$4, targetList);
                de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID[] result = new de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "recordRelID" element
         */
        public de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID getRecordRelIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID target = null;
                target = (de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID)get_store().find_element_user(RECORDRELID$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "recordRelID" element
         */
        public int sizeOfRecordRelIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDRELID$4);
            }
        }
        
        /**
         * Sets array of all "recordRelID" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRecordRelIDArray(de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID[] recordRelIDArray)
        {
            check_orphaned();
            arraySetterHelper(recordRelIDArray, RECORDRELID$4);
        }
        
        /**
         * Sets ith "recordRelID" element
         */
        public void setRecordRelIDArray(int i, de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID recordRelID)
        {
            generatedSetterHelperImpl(recordRelID, RECORDRELID$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordRelID" element
         */
        public de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID insertNewRecordRelID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID target = null;
                target = (de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID)get_store().insert_element_user(RECORDRELID$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordRelID" element
         */
        public de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID addNewRecordRelID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID target = null;
                target = (de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID)get_store().add_element_user(RECORDRELID$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "recordRelID" element
         */
        public void removeRecordRelID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDRELID$4, i);
            }
        }
        
        /**
         * Gets a List of "recordMetadataLoc" elements
         */
        public java.util.List<de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc> getRecordMetadataLocList()
        {
            final class RecordMetadataLocList extends java.util.AbstractList<de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc>
            {
                @Override
                public de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc get(int i)
                    { return RecordInfoSetImpl.this.getRecordMetadataLocArray(i); }
                
                @Override
                public de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc set(int i, de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc o)
                {
                    de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc old = RecordInfoSetImpl.this.getRecordMetadataLocArray(i);
                    RecordInfoSetImpl.this.setRecordMetadataLocArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc o)
                    { RecordInfoSetImpl.this.insertNewRecordMetadataLoc(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc remove(int i)
                {
                    de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc old = RecordInfoSetImpl.this.getRecordMetadataLocArray(i);
                    RecordInfoSetImpl.this.removeRecordMetadataLoc(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RecordInfoSetImpl.this.sizeOfRecordMetadataLocArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RecordMetadataLocList();
            }
        }
        
        /**
         * Gets array of all "recordMetadataLoc" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc[] getRecordMetadataLocArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc> targetList = new java.util.ArrayList<de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc>();
                get_store().find_all_element_users(RECORDMETADATALOC$6, targetList);
                de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc[] result = new de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "recordMetadataLoc" element
         */
        public de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc getRecordMetadataLocArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc target = null;
                target = (de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc)get_store().find_element_user(RECORDMETADATALOC$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "recordMetadataLoc" element
         */
        public int sizeOfRecordMetadataLocArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDMETADATALOC$6);
            }
        }
        
        /**
         * Sets array of all "recordMetadataLoc" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRecordMetadataLocArray(de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc[] recordMetadataLocArray)
        {
            check_orphaned();
            arraySetterHelper(recordMetadataLocArray, RECORDMETADATALOC$6);
        }
        
        /**
         * Sets ith "recordMetadataLoc" element
         */
        public void setRecordMetadataLocArray(int i, de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc recordMetadataLoc)
        {
            generatedSetterHelperImpl(recordMetadataLoc, RECORDMETADATALOC$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordMetadataLoc" element
         */
        public de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc insertNewRecordMetadataLoc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc target = null;
                target = (de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc)get_store().insert_element_user(RECORDMETADATALOC$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordMetadataLoc" element
         */
        public de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc addNewRecordMetadataLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc target = null;
                target = (de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc)get_store().add_element_user(RECORDMETADATALOC$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "recordMetadataLoc" element
         */
        public void removeRecordMetadataLoc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDMETADATALOC$6, i);
            }
        }
        
        /**
         * Gets a List of "recordMetadataDate" elements
         */
        public java.util.List<de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate> getRecordMetadataDateList()
        {
            final class RecordMetadataDateList extends java.util.AbstractList<de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate>
            {
                @Override
                public de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate get(int i)
                    { return RecordInfoSetImpl.this.getRecordMetadataDateArray(i); }
                
                @Override
                public de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate set(int i, de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate o)
                {
                    de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate old = RecordInfoSetImpl.this.getRecordMetadataDateArray(i);
                    RecordInfoSetImpl.this.setRecordMetadataDateArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate o)
                    { RecordInfoSetImpl.this.insertNewRecordMetadataDate(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate remove(int i)
                {
                    de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate old = RecordInfoSetImpl.this.getRecordMetadataDateArray(i);
                    RecordInfoSetImpl.this.removeRecordMetadataDate(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RecordInfoSetImpl.this.sizeOfRecordMetadataDateArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RecordMetadataDateList();
            }
        }
        
        /**
         * Gets array of all "recordMetadataDate" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate[] getRecordMetadataDateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate> targetList = new java.util.ArrayList<de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate>();
                get_store().find_all_element_users(RECORDMETADATADATE$8, targetList);
                de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate[] result = new de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "recordMetadataDate" element
         */
        public de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate getRecordMetadataDateArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate target = null;
                target = (de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate)get_store().find_element_user(RECORDMETADATADATE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "recordMetadataDate" element
         */
        public int sizeOfRecordMetadataDateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RECORDMETADATADATE$8);
            }
        }
        
        /**
         * Sets array of all "recordMetadataDate" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRecordMetadataDateArray(de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate[] recordMetadataDateArray)
        {
            check_orphaned();
            arraySetterHelper(recordMetadataDateArray, RECORDMETADATADATE$8);
        }
        
        /**
         * Sets ith "recordMetadataDate" element
         */
        public void setRecordMetadataDateArray(int i, de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate recordMetadataDate)
        {
            generatedSetterHelperImpl(recordMetadataDate, RECORDMETADATADATE$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordMetadataDate" element
         */
        public de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate insertNewRecordMetadataDate(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate target = null;
                target = (de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate)get_store().insert_element_user(RECORDMETADATADATE$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordMetadataDate" element
         */
        public de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate addNewRecordMetadataDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate target = null;
                target = (de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate)get_store().add_element_user(RECORDMETADATADATE$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "recordMetadataDate" element
         */
        public void removeRecordMetadataDate(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RECORDMETADATADATE$8, i);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$10);
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$10) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$10);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$10);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$10);
            }
        }
    }
}
