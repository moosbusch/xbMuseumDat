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
 * A document containing one indexingLocationSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class IndexingLocationSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingLocationSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingLocationSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGLOCATIONSET$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingLocationSet");
    
    
    /**
     * Gets the "indexingLocationSet" element
     */
    public de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet getIndexingLocationSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet target = null;
            target = (de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet)get_store().find_element_user(INDEXINGLOCATIONSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingLocationSet" element
     */
    public void setIndexingLocationSet(de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet indexingLocationSet)
    {
        generatedSetterHelperImpl(indexingLocationSet, INDEXINGLOCATIONSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingLocationSet" element
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
     * An XML indexingLocationSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class IndexingLocationSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingLocationSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAMELOCATIONSET$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "nameLocationSet");
        private static final javax.xml.namespace.QName POLITICALENTITY$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "politicalEntity");
        private static final javax.xml.namespace.QName GEOGRAPHICALENTITY$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "geographicalEntity");
        
        
        /**
         * Gets a List of "nameLocationSet" elements
         */
        public java.util.List<de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet> getNameLocationSetList()
        {
            final class NameLocationSetList extends java.util.AbstractList<de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet>
            {
                @Override
                public de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet get(int i)
                    { return IndexingLocationSetImpl.this.getNameLocationSetArray(i); }
                
                @Override
                public de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet set(int i, de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet o)
                {
                    de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet old = IndexingLocationSetImpl.this.getNameLocationSetArray(i);
                    IndexingLocationSetImpl.this.setNameLocationSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet o)
                    { IndexingLocationSetImpl.this.insertNewNameLocationSet(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet remove(int i)
                {
                    de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet old = IndexingLocationSetImpl.this.getNameLocationSetArray(i);
                    IndexingLocationSetImpl.this.removeNameLocationSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingLocationSetImpl.this.sizeOfNameLocationSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new NameLocationSetList();
            }
        }
        
        /**
         * Gets array of all "nameLocationSet" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet[] getNameLocationSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet> targetList = new java.util.ArrayList<de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet>();
                get_store().find_all_element_users(NAMELOCATIONSET$0, targetList);
                de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet[] result = new de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "nameLocationSet" element
         */
        public de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet getNameLocationSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet target = null;
                target = (de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet)get_store().find_element_user(NAMELOCATIONSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "nameLocationSet" element
         */
        public int sizeOfNameLocationSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAMELOCATIONSET$0);
            }
        }
        
        /**
         * Sets array of all "nameLocationSet" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setNameLocationSetArray(de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet[] nameLocationSetArray)
        {
            check_orphaned();
            arraySetterHelper(nameLocationSetArray, NAMELOCATIONSET$0);
        }
        
        /**
         * Sets ith "nameLocationSet" element
         */
        public void setNameLocationSetArray(int i, de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet nameLocationSet)
        {
            generatedSetterHelperImpl(nameLocationSet, NAMELOCATIONSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "nameLocationSet" element
         */
        public de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet insertNewNameLocationSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet target = null;
                target = (de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet)get_store().insert_element_user(NAMELOCATIONSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "nameLocationSet" element
         */
        public de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet addNewNameLocationSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet target = null;
                target = (de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet)get_store().add_element_user(NAMELOCATIONSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "nameLocationSet" element
         */
        public void removeNameLocationSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAMELOCATIONSET$0, i);
            }
        }
        
        /**
         * Gets the "politicalEntity" attribute
         */
        public java.lang.String getPoliticalEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POLITICALENTITY$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "politicalEntity" attribute
         */
        public org.apache.xmlbeans.XmlString xgetPoliticalEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POLITICALENTITY$2);
                return target;
            }
        }
        
        /**
         * True if has "politicalEntity" attribute
         */
        public boolean isSetPoliticalEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(POLITICALENTITY$2) != null;
            }
        }
        
        /**
         * Sets the "politicalEntity" attribute
         */
        public void setPoliticalEntity(java.lang.String politicalEntity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POLITICALENTITY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POLITICALENTITY$2);
                }
                target.setStringValue(politicalEntity);
            }
        }
        
        /**
         * Sets (as xml) the "politicalEntity" attribute
         */
        public void xsetPoliticalEntity(org.apache.xmlbeans.XmlString politicalEntity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(POLITICALENTITY$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(POLITICALENTITY$2);
                }
                target.set(politicalEntity);
            }
        }
        
        /**
         * Unsets the "politicalEntity" attribute
         */
        public void unsetPoliticalEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(POLITICALENTITY$2);
            }
        }
        
        /**
         * Gets the "geographicalEntity" attribute
         */
        public java.lang.String getGeographicalEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOGRAPHICALENTITY$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "geographicalEntity" attribute
         */
        public org.apache.xmlbeans.XmlString xgetGeographicalEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GEOGRAPHICALENTITY$4);
                return target;
            }
        }
        
        /**
         * True if has "geographicalEntity" attribute
         */
        public boolean isSetGeographicalEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(GEOGRAPHICALENTITY$4) != null;
            }
        }
        
        /**
         * Sets the "geographicalEntity" attribute
         */
        public void setGeographicalEntity(java.lang.String geographicalEntity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GEOGRAPHICALENTITY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GEOGRAPHICALENTITY$4);
                }
                target.setStringValue(geographicalEntity);
            }
        }
        
        /**
         * Sets (as xml) the "geographicalEntity" attribute
         */
        public void xsetGeographicalEntity(org.apache.xmlbeans.XmlString geographicalEntity)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GEOGRAPHICALENTITY$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GEOGRAPHICALENTITY$4);
                }
                target.set(geographicalEntity);
            }
        }
        
        /**
         * Unsets the "geographicalEntity" attribute
         */
        public void unsetGeographicalEntity()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(GEOGRAPHICALENTITY$4);
            }
        }
    }
}
