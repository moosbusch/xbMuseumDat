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
 * A document containing one indexingMeasurementsSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class IndexingMeasurementsSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingMeasurementsSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingMeasurementsSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGMEASUREMENTSSET$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingMeasurementsSet");
    
    
    /**
     * Gets the "indexingMeasurementsSet" element
     */
    public de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet getIndexingMeasurementsSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet target = null;
            target = (de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet)get_store().find_element_user(INDEXINGMEASUREMENTSSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingMeasurementsSet" element
     */
    public void setIndexingMeasurementsSet(de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet indexingMeasurementsSet)
    {
        generatedSetterHelperImpl(indexingMeasurementsSet, INDEXINGMEASUREMENTSSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingMeasurementsSet" element
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
     * An XML indexingMeasurementsSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class IndexingMeasurementsSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingMeasurementsSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName MEASUREMENTSSET$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "measurementsSet");
        private static final javax.xml.namespace.QName EXTENTMEASUREMENTS$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "extentMeasurements");
        private static final javax.xml.namespace.QName QUALIFIERMEASUREMENTS$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "qualifierMeasurements");
        private static final javax.xml.namespace.QName FORMATMEASUREMENTS$6 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "formatMeasurements");
        private static final javax.xml.namespace.QName SHAPEMEASUREMENTS$8 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "shapeMeasurements");
        private static final javax.xml.namespace.QName SCALEMEASUREMENTS$10 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "scaleMeasurements");
        
        
        /**
         * Gets a List of "measurementsSet" elements
         */
        public java.util.List<de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet> getMeasurementsSetList()
        {
            final class MeasurementsSetList extends java.util.AbstractList<de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet>
            {
                @Override
                public de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet get(int i)
                    { return IndexingMeasurementsSetImpl.this.getMeasurementsSetArray(i); }
                
                @Override
                public de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet set(int i, de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet o)
                {
                    de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet old = IndexingMeasurementsSetImpl.this.getMeasurementsSetArray(i);
                    IndexingMeasurementsSetImpl.this.setMeasurementsSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet o)
                    { IndexingMeasurementsSetImpl.this.insertNewMeasurementsSet(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet remove(int i)
                {
                    de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet old = IndexingMeasurementsSetImpl.this.getMeasurementsSetArray(i);
                    IndexingMeasurementsSetImpl.this.removeMeasurementsSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsSetImpl.this.sizeOfMeasurementsSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new MeasurementsSetList();
            }
        }
        
        /**
         * Gets array of all "measurementsSet" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet[] getMeasurementsSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet> targetList = new java.util.ArrayList<de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet>();
                get_store().find_all_element_users(MEASUREMENTSSET$0, targetList);
                de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet[] result = new de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "measurementsSet" element
         */
        public de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet getMeasurementsSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet target = null;
                target = (de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet)get_store().find_element_user(MEASUREMENTSSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "measurementsSet" element
         */
        public int sizeOfMeasurementsSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MEASUREMENTSSET$0);
            }
        }
        
        /**
         * Sets array of all "measurementsSet" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setMeasurementsSetArray(de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet[] measurementsSetArray)
        {
            check_orphaned();
            arraySetterHelper(measurementsSetArray, MEASUREMENTSSET$0);
        }
        
        /**
         * Sets ith "measurementsSet" element
         */
        public void setMeasurementsSetArray(int i, de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet measurementsSet)
        {
            generatedSetterHelperImpl(measurementsSet, MEASUREMENTSSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "measurementsSet" element
         */
        public de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet insertNewMeasurementsSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet target = null;
                target = (de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet)get_store().insert_element_user(MEASUREMENTSSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "measurementsSet" element
         */
        public de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet addNewMeasurementsSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet target = null;
                target = (de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet)get_store().add_element_user(MEASUREMENTSSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "measurementsSet" element
         */
        public void removeMeasurementsSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MEASUREMENTSSET$0, i);
            }
        }
        
        /**
         * Gets a List of "extentMeasurements" elements
         */
        public java.util.List<de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements> getExtentMeasurementsList()
        {
            final class ExtentMeasurementsList extends java.util.AbstractList<de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements>
            {
                @Override
                public de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements get(int i)
                    { return IndexingMeasurementsSetImpl.this.getExtentMeasurementsArray(i); }
                
                @Override
                public de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements set(int i, de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements o)
                {
                    de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements old = IndexingMeasurementsSetImpl.this.getExtentMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.setExtentMeasurementsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements o)
                    { IndexingMeasurementsSetImpl.this.insertNewExtentMeasurements(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements remove(int i)
                {
                    de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements old = IndexingMeasurementsSetImpl.this.getExtentMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.removeExtentMeasurements(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsSetImpl.this.sizeOfExtentMeasurementsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ExtentMeasurementsList();
            }
        }
        
        /**
         * Gets array of all "extentMeasurements" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements[] getExtentMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements> targetList = new java.util.ArrayList<de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements>();
                get_store().find_all_element_users(EXTENTMEASUREMENTS$2, targetList);
                de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements[] result = new de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "extentMeasurements" element
         */
        public de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements getExtentMeasurementsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements target = null;
                target = (de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements)get_store().find_element_user(EXTENTMEASUREMENTS$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "extentMeasurements" element
         */
        public int sizeOfExtentMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTENTMEASUREMENTS$2);
            }
        }
        
        /**
         * Sets array of all "extentMeasurements" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setExtentMeasurementsArray(de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements[] extentMeasurementsArray)
        {
            check_orphaned();
            arraySetterHelper(extentMeasurementsArray, EXTENTMEASUREMENTS$2);
        }
        
        /**
         * Sets ith "extentMeasurements" element
         */
        public void setExtentMeasurementsArray(int i, de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements extentMeasurements)
        {
            generatedSetterHelperImpl(extentMeasurements, EXTENTMEASUREMENTS$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extentMeasurements" element
         */
        public de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements insertNewExtentMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements target = null;
                target = (de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements)get_store().insert_element_user(EXTENTMEASUREMENTS$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extentMeasurements" element
         */
        public de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements addNewExtentMeasurements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements target = null;
                target = (de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements)get_store().add_element_user(EXTENTMEASUREMENTS$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "extentMeasurements" element
         */
        public void removeExtentMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTENTMEASUREMENTS$2, i);
            }
        }
        
        /**
         * Gets a List of "qualifierMeasurements" elements
         */
        public java.util.List<java.lang.String> getQualifierMeasurementsList()
        {
            final class QualifierMeasurementsList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return IndexingMeasurementsSetImpl.this.getQualifierMeasurementsArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = IndexingMeasurementsSetImpl.this.getQualifierMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.setQualifierMeasurementsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { IndexingMeasurementsSetImpl.this.insertQualifierMeasurements(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = IndexingMeasurementsSetImpl.this.getQualifierMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.removeQualifierMeasurements(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsSetImpl.this.sizeOfQualifierMeasurementsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new QualifierMeasurementsList();
            }
        }
        
        /**
         * Gets array of all "qualifierMeasurements" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getQualifierMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(QUALIFIERMEASUREMENTS$4, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "qualifierMeasurements" element
         */
        public java.lang.String getQualifierMeasurementsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUALIFIERMEASUREMENTS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "qualifierMeasurements" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetQualifierMeasurementsList()
        {
            final class QualifierMeasurementsList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return IndexingMeasurementsSetImpl.this.xgetQualifierMeasurementsArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = IndexingMeasurementsSetImpl.this.xgetQualifierMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.xsetQualifierMeasurementsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { IndexingMeasurementsSetImpl.this.insertNewQualifierMeasurements(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = IndexingMeasurementsSetImpl.this.xgetQualifierMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.removeQualifierMeasurements(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsSetImpl.this.sizeOfQualifierMeasurementsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new QualifierMeasurementsList();
            }
        }
        
        /**
         * Gets array of all "qualifierMeasurements" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetQualifierMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(QUALIFIERMEASUREMENTS$4, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "qualifierMeasurements" element
         */
        public org.apache.xmlbeans.XmlString xgetQualifierMeasurementsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUALIFIERMEASUREMENTS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "qualifierMeasurements" element
         */
        public int sizeOfQualifierMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUALIFIERMEASUREMENTS$4);
            }
        }
        
        /**
         * Sets array of all "qualifierMeasurements" element
         */
        public void setQualifierMeasurementsArray(java.lang.String[] qualifierMeasurementsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(qualifierMeasurementsArray, QUALIFIERMEASUREMENTS$4);
            }
        }
        
        /**
         * Sets ith "qualifierMeasurements" element
         */
        public void setQualifierMeasurementsArray(int i, java.lang.String qualifierMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUALIFIERMEASUREMENTS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(qualifierMeasurements);
            }
        }
        
        /**
         * Sets (as xml) array of all "qualifierMeasurements" element
         */
        public void xsetQualifierMeasurementsArray(org.apache.xmlbeans.XmlString[]qualifierMeasurementsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(qualifierMeasurementsArray, QUALIFIERMEASUREMENTS$4);
            }
        }
        
        /**
         * Sets (as xml) ith "qualifierMeasurements" element
         */
        public void xsetQualifierMeasurementsArray(int i, org.apache.xmlbeans.XmlString qualifierMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUALIFIERMEASUREMENTS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(qualifierMeasurements);
            }
        }
        
        /**
         * Inserts the value as the ith "qualifierMeasurements" element
         */
        public void insertQualifierMeasurements(int i, java.lang.String qualifierMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(QUALIFIERMEASUREMENTS$4, i);
                target.setStringValue(qualifierMeasurements);
            }
        }
        
        /**
         * Appends the value as the last "qualifierMeasurements" element
         */
        public void addQualifierMeasurements(java.lang.String qualifierMeasurements)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUALIFIERMEASUREMENTS$4);
                target.setStringValue(qualifierMeasurements);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "qualifierMeasurements" element
         */
        public org.apache.xmlbeans.XmlString insertNewQualifierMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(QUALIFIERMEASUREMENTS$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "qualifierMeasurements" element
         */
        public org.apache.xmlbeans.XmlString addNewQualifierMeasurements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUALIFIERMEASUREMENTS$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "qualifierMeasurements" element
         */
        public void removeQualifierMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUALIFIERMEASUREMENTS$4, i);
            }
        }
        
        /**
         * Gets a List of "formatMeasurements" elements
         */
        public java.util.List<de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements> getFormatMeasurementsList()
        {
            final class FormatMeasurementsList extends java.util.AbstractList<de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements>
            {
                @Override
                public de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements get(int i)
                    { return IndexingMeasurementsSetImpl.this.getFormatMeasurementsArray(i); }
                
                @Override
                public de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements set(int i, de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements o)
                {
                    de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements old = IndexingMeasurementsSetImpl.this.getFormatMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.setFormatMeasurementsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements o)
                    { IndexingMeasurementsSetImpl.this.insertNewFormatMeasurements(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements remove(int i)
                {
                    de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements old = IndexingMeasurementsSetImpl.this.getFormatMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.removeFormatMeasurements(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsSetImpl.this.sizeOfFormatMeasurementsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new FormatMeasurementsList();
            }
        }
        
        /**
         * Gets array of all "formatMeasurements" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements[] getFormatMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements> targetList = new java.util.ArrayList<de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements>();
                get_store().find_all_element_users(FORMATMEASUREMENTS$6, targetList);
                de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements[] result = new de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "formatMeasurements" element
         */
        public de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements getFormatMeasurementsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements target = null;
                target = (de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements)get_store().find_element_user(FORMATMEASUREMENTS$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "formatMeasurements" element
         */
        public int sizeOfFormatMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FORMATMEASUREMENTS$6);
            }
        }
        
        /**
         * Sets array of all "formatMeasurements" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setFormatMeasurementsArray(de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements[] formatMeasurementsArray)
        {
            check_orphaned();
            arraySetterHelper(formatMeasurementsArray, FORMATMEASUREMENTS$6);
        }
        
        /**
         * Sets ith "formatMeasurements" element
         */
        public void setFormatMeasurementsArray(int i, de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements formatMeasurements)
        {
            generatedSetterHelperImpl(formatMeasurements, FORMATMEASUREMENTS$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "formatMeasurements" element
         */
        public de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements insertNewFormatMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements target = null;
                target = (de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements)get_store().insert_element_user(FORMATMEASUREMENTS$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "formatMeasurements" element
         */
        public de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements addNewFormatMeasurements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements target = null;
                target = (de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements)get_store().add_element_user(FORMATMEASUREMENTS$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "formatMeasurements" element
         */
        public void removeFormatMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FORMATMEASUREMENTS$6, i);
            }
        }
        
        /**
         * Gets a List of "shapeMeasurements" elements
         */
        public java.util.List<de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements> getShapeMeasurementsList()
        {
            final class ShapeMeasurementsList extends java.util.AbstractList<de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements>
            {
                @Override
                public de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements get(int i)
                    { return IndexingMeasurementsSetImpl.this.getShapeMeasurementsArray(i); }
                
                @Override
                public de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements set(int i, de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements o)
                {
                    de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements old = IndexingMeasurementsSetImpl.this.getShapeMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.setShapeMeasurementsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements o)
                    { IndexingMeasurementsSetImpl.this.insertNewShapeMeasurements(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements remove(int i)
                {
                    de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements old = IndexingMeasurementsSetImpl.this.getShapeMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.removeShapeMeasurements(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsSetImpl.this.sizeOfShapeMeasurementsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ShapeMeasurementsList();
            }
        }
        
        /**
         * Gets array of all "shapeMeasurements" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements[] getShapeMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements> targetList = new java.util.ArrayList<de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements>();
                get_store().find_all_element_users(SHAPEMEASUREMENTS$8, targetList);
                de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements[] result = new de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "shapeMeasurements" element
         */
        public de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements getShapeMeasurementsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements target = null;
                target = (de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements)get_store().find_element_user(SHAPEMEASUREMENTS$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "shapeMeasurements" element
         */
        public int sizeOfShapeMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SHAPEMEASUREMENTS$8);
            }
        }
        
        /**
         * Sets array of all "shapeMeasurements" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setShapeMeasurementsArray(de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements[] shapeMeasurementsArray)
        {
            check_orphaned();
            arraySetterHelper(shapeMeasurementsArray, SHAPEMEASUREMENTS$8);
        }
        
        /**
         * Sets ith "shapeMeasurements" element
         */
        public void setShapeMeasurementsArray(int i, de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements shapeMeasurements)
        {
            generatedSetterHelperImpl(shapeMeasurements, SHAPEMEASUREMENTS$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "shapeMeasurements" element
         */
        public de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements insertNewShapeMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements target = null;
                target = (de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements)get_store().insert_element_user(SHAPEMEASUREMENTS$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "shapeMeasurements" element
         */
        public de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements addNewShapeMeasurements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements target = null;
                target = (de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements)get_store().add_element_user(SHAPEMEASUREMENTS$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "shapeMeasurements" element
         */
        public void removeShapeMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SHAPEMEASUREMENTS$8, i);
            }
        }
        
        /**
         * Gets a List of "scaleMeasurements" elements
         */
        public java.util.List<de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements> getScaleMeasurementsList()
        {
            final class ScaleMeasurementsList extends java.util.AbstractList<de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements>
            {
                @Override
                public de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements get(int i)
                    { return IndexingMeasurementsSetImpl.this.getScaleMeasurementsArray(i); }
                
                @Override
                public de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements set(int i, de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements o)
                {
                    de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements old = IndexingMeasurementsSetImpl.this.getScaleMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.setScaleMeasurementsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements o)
                    { IndexingMeasurementsSetImpl.this.insertNewScaleMeasurements(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements remove(int i)
                {
                    de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements old = IndexingMeasurementsSetImpl.this.getScaleMeasurementsArray(i);
                    IndexingMeasurementsSetImpl.this.removeScaleMeasurements(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMeasurementsSetImpl.this.sizeOfScaleMeasurementsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ScaleMeasurementsList();
            }
        }
        
        /**
         * Gets array of all "scaleMeasurements" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements[] getScaleMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements> targetList = new java.util.ArrayList<de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements>();
                get_store().find_all_element_users(SCALEMEASUREMENTS$10, targetList);
                de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements[] result = new de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "scaleMeasurements" element
         */
        public de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements getScaleMeasurementsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements target = null;
                target = (de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements)get_store().find_element_user(SCALEMEASUREMENTS$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "scaleMeasurements" element
         */
        public int sizeOfScaleMeasurementsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCALEMEASUREMENTS$10);
            }
        }
        
        /**
         * Sets array of all "scaleMeasurements" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setScaleMeasurementsArray(de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements[] scaleMeasurementsArray)
        {
            check_orphaned();
            arraySetterHelper(scaleMeasurementsArray, SCALEMEASUREMENTS$10);
        }
        
        /**
         * Sets ith "scaleMeasurements" element
         */
        public void setScaleMeasurementsArray(int i, de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements scaleMeasurements)
        {
            generatedSetterHelperImpl(scaleMeasurements, SCALEMEASUREMENTS$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "scaleMeasurements" element
         */
        public de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements insertNewScaleMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements target = null;
                target = (de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements)get_store().insert_element_user(SCALEMEASUREMENTS$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "scaleMeasurements" element
         */
        public de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements addNewScaleMeasurements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements target = null;
                target = (de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements)get_store().add_element_user(SCALEMEASUREMENTS$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "scaleMeasurements" element
         */
        public void removeScaleMeasurements(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCALEMEASUREMENTS$10, i);
            }
        }
    }
}
