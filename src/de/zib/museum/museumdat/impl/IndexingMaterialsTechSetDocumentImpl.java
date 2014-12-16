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
 * A document containing one indexingMaterialsTechSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class IndexingMaterialsTechSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingMaterialsTechSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingMaterialsTechSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGMATERIALSTECHSET$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingMaterialsTechSet");
    
    
    /**
     * Gets the "indexingMaterialsTechSet" element
     */
    public de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet getIndexingMaterialsTechSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet target = null;
            target = (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet)get_store().find_element_user(INDEXINGMATERIALSTECHSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingMaterialsTechSet" element
     */
    public void setIndexingMaterialsTechSet(de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet indexingMaterialsTechSet)
    {
        generatedSetterHelperImpl(indexingMaterialsTechSet, INDEXINGMATERIALSTECHSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingMaterialsTechSet" element
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
     * An XML indexingMaterialsTechSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class IndexingMaterialsTechSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingMaterialsTechSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TERMMATERIALSTECH$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "termMaterialsTech");
        private static final javax.xml.namespace.QName EXTENTMATERIALSTECH$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "extentMaterialsTech");
        private static final javax.xml.namespace.QName SOURCEMATERIALSTECH$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "sourceMaterialsTech");
        private static final javax.xml.namespace.QName TYPE$6 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "type");
        
        
        /**
         * Gets a List of "termMaterialsTech" elements
         */
        public java.util.List<de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech> getTermMaterialsTechList()
        {
            final class TermMaterialsTechList extends java.util.AbstractList<de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech>
            {
                @Override
                public de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech get(int i)
                    { return IndexingMaterialsTechSetImpl.this.getTermMaterialsTechArray(i); }
                
                @Override
                public de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech set(int i, de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech o)
                {
                    de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech old = IndexingMaterialsTechSetImpl.this.getTermMaterialsTechArray(i);
                    IndexingMaterialsTechSetImpl.this.setTermMaterialsTechArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech o)
                    { IndexingMaterialsTechSetImpl.this.insertNewTermMaterialsTech(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech remove(int i)
                {
                    de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech old = IndexingMaterialsTechSetImpl.this.getTermMaterialsTechArray(i);
                    IndexingMaterialsTechSetImpl.this.removeTermMaterialsTech(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMaterialsTechSetImpl.this.sizeOfTermMaterialsTechArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new TermMaterialsTechList();
            }
        }
        
        /**
         * Gets array of all "termMaterialsTech" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech[] getTermMaterialsTechArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech> targetList = new java.util.ArrayList<de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech>();
                get_store().find_all_element_users(TERMMATERIALSTECH$0, targetList);
                de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech[] result = new de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "termMaterialsTech" element
         */
        public de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech getTermMaterialsTechArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech target = null;
                target = (de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech)get_store().find_element_user(TERMMATERIALSTECH$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "termMaterialsTech" element
         */
        public int sizeOfTermMaterialsTechArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TERMMATERIALSTECH$0);
            }
        }
        
        /**
         * Sets array of all "termMaterialsTech" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTermMaterialsTechArray(de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech[] termMaterialsTechArray)
        {
            check_orphaned();
            arraySetterHelper(termMaterialsTechArray, TERMMATERIALSTECH$0);
        }
        
        /**
         * Sets ith "termMaterialsTech" element
         */
        public void setTermMaterialsTechArray(int i, de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech termMaterialsTech)
        {
            generatedSetterHelperImpl(termMaterialsTech, TERMMATERIALSTECH$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "termMaterialsTech" element
         */
        public de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech insertNewTermMaterialsTech(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech target = null;
                target = (de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech)get_store().insert_element_user(TERMMATERIALSTECH$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "termMaterialsTech" element
         */
        public de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech addNewTermMaterialsTech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech target = null;
                target = (de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech)get_store().add_element_user(TERMMATERIALSTECH$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "termMaterialsTech" element
         */
        public void removeTermMaterialsTech(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TERMMATERIALSTECH$0, i);
            }
        }
        
        /**
         * Gets a List of "extentMaterialsTech" elements
         */
        public java.util.List<de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech> getExtentMaterialsTechList()
        {
            final class ExtentMaterialsTechList extends java.util.AbstractList<de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech>
            {
                @Override
                public de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech get(int i)
                    { return IndexingMaterialsTechSetImpl.this.getExtentMaterialsTechArray(i); }
                
                @Override
                public de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech set(int i, de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech o)
                {
                    de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech old = IndexingMaterialsTechSetImpl.this.getExtentMaterialsTechArray(i);
                    IndexingMaterialsTechSetImpl.this.setExtentMaterialsTechArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech o)
                    { IndexingMaterialsTechSetImpl.this.insertNewExtentMaterialsTech(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech remove(int i)
                {
                    de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech old = IndexingMaterialsTechSetImpl.this.getExtentMaterialsTechArray(i);
                    IndexingMaterialsTechSetImpl.this.removeExtentMaterialsTech(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMaterialsTechSetImpl.this.sizeOfExtentMaterialsTechArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ExtentMaterialsTechList();
            }
        }
        
        /**
         * Gets array of all "extentMaterialsTech" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech[] getExtentMaterialsTechArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech> targetList = new java.util.ArrayList<de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech>();
                get_store().find_all_element_users(EXTENTMATERIALSTECH$2, targetList);
                de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech[] result = new de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "extentMaterialsTech" element
         */
        public de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech getExtentMaterialsTechArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech target = null;
                target = (de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech)get_store().find_element_user(EXTENTMATERIALSTECH$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "extentMaterialsTech" element
         */
        public int sizeOfExtentMaterialsTechArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTENTMATERIALSTECH$2);
            }
        }
        
        /**
         * Sets array of all "extentMaterialsTech" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setExtentMaterialsTechArray(de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech[] extentMaterialsTechArray)
        {
            check_orphaned();
            arraySetterHelper(extentMaterialsTechArray, EXTENTMATERIALSTECH$2);
        }
        
        /**
         * Sets ith "extentMaterialsTech" element
         */
        public void setExtentMaterialsTechArray(int i, de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech extentMaterialsTech)
        {
            generatedSetterHelperImpl(extentMaterialsTech, EXTENTMATERIALSTECH$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extentMaterialsTech" element
         */
        public de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech insertNewExtentMaterialsTech(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech target = null;
                target = (de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech)get_store().insert_element_user(EXTENTMATERIALSTECH$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extentMaterialsTech" element
         */
        public de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech addNewExtentMaterialsTech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech target = null;
                target = (de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech)get_store().add_element_user(EXTENTMATERIALSTECH$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "extentMaterialsTech" element
         */
        public void removeExtentMaterialsTech(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTENTMATERIALSTECH$2, i);
            }
        }
        
        /**
         * Gets a List of "sourceMaterialsTech" elements
         */
        public java.util.List<de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech> getSourceMaterialsTechList()
        {
            final class SourceMaterialsTechList extends java.util.AbstractList<de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech>
            {
                @Override
                public de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech get(int i)
                    { return IndexingMaterialsTechSetImpl.this.getSourceMaterialsTechArray(i); }
                
                @Override
                public de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech set(int i, de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech o)
                {
                    de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech old = IndexingMaterialsTechSetImpl.this.getSourceMaterialsTechArray(i);
                    IndexingMaterialsTechSetImpl.this.setSourceMaterialsTechArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech o)
                    { IndexingMaterialsTechSetImpl.this.insertNewSourceMaterialsTech(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech remove(int i)
                {
                    de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech old = IndexingMaterialsTechSetImpl.this.getSourceMaterialsTechArray(i);
                    IndexingMaterialsTechSetImpl.this.removeSourceMaterialsTech(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingMaterialsTechSetImpl.this.sizeOfSourceMaterialsTechArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SourceMaterialsTechList();
            }
        }
        
        /**
         * Gets array of all "sourceMaterialsTech" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech[] getSourceMaterialsTechArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech> targetList = new java.util.ArrayList<de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech>();
                get_store().find_all_element_users(SOURCEMATERIALSTECH$4, targetList);
                de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech[] result = new de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "sourceMaterialsTech" element
         */
        public de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech getSourceMaterialsTechArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech target = null;
                target = (de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech)get_store().find_element_user(SOURCEMATERIALSTECH$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "sourceMaterialsTech" element
         */
        public int sizeOfSourceMaterialsTechArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCEMATERIALSTECH$4);
            }
        }
        
        /**
         * Sets array of all "sourceMaterialsTech" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSourceMaterialsTechArray(de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech[] sourceMaterialsTechArray)
        {
            check_orphaned();
            arraySetterHelper(sourceMaterialsTechArray, SOURCEMATERIALSTECH$4);
        }
        
        /**
         * Sets ith "sourceMaterialsTech" element
         */
        public void setSourceMaterialsTechArray(int i, de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech sourceMaterialsTech)
        {
            generatedSetterHelperImpl(sourceMaterialsTech, SOURCEMATERIALSTECH$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceMaterialsTech" element
         */
        public de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech insertNewSourceMaterialsTech(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech target = null;
                target = (de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech)get_store().insert_element_user(SOURCEMATERIALSTECH$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceMaterialsTech" element
         */
        public de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech addNewSourceMaterialsTech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech target = null;
                target = (de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech)get_store().add_element_user(SOURCEMATERIALSTECH$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "sourceMaterialsTech" element
         */
        public void removeSourceMaterialsTech(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCEMATERIALSTECH$4, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
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
                return get_store().find_attribute_user(TYPE$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$6);
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
                get_store().remove_attribute(TYPE$6);
            }
        }
    }
}
