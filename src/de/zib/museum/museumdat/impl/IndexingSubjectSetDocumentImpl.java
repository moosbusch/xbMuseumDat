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
 * A document containing one indexingSubjectSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class IndexingSubjectSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingSubjectSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingSubjectSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGSUBJECTSET$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingSubjectSet");
    
    
    /**
     * Gets the "indexingSubjectSet" element
     */
    public de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet getIndexingSubjectSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet target = null;
            target = (de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet)get_store().find_element_user(INDEXINGSUBJECTSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingSubjectSet" element
     */
    @Inject(optional=true) public void setIndexingSubjectSet(de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet indexingSubjectSet)
    {
        generatedSetterHelperImpl(indexingSubjectSet, INDEXINGSUBJECTSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingSubjectSet" element
     */
    public de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet addNewIndexingSubjectSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet target = null;
            target = (de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet)get_store().add_element_user(INDEXINGSUBJECTSET$0);
            return target;
        }
    }
    /**
     * An XML indexingSubjectSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class IndexingSubjectSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingSubjectSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EXTENTSUBJECT$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "extentSubject");
        private static final javax.xml.namespace.QName SUBJECTTERM$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "subjectTerm");
        private static final javax.xml.namespace.QName TYPE$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "type");
        
        
        /**
         * Gets the "extentSubject" element
         */
        public de.zib.museum.museumdat.ExtentSubjectDocument.ExtentSubject getExtentSubject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ExtentSubjectDocument.ExtentSubject target = null;
                target = (de.zib.museum.museumdat.ExtentSubjectDocument.ExtentSubject)get_store().find_element_user(EXTENTSUBJECT$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "extentSubject" element
         */
        public boolean isSetExtentSubject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTENTSUBJECT$0) != 0;
            }
        }
        
        /**
         * Sets the "extentSubject" element
         */
        @Inject(optional=true) public void setExtentSubject(de.zib.museum.museumdat.ExtentSubjectDocument.ExtentSubject extentSubject)
        {
            generatedSetterHelperImpl(extentSubject, EXTENTSUBJECT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "extentSubject" element
         */
        public de.zib.museum.museumdat.ExtentSubjectDocument.ExtentSubject addNewExtentSubject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ExtentSubjectDocument.ExtentSubject target = null;
                target = (de.zib.museum.museumdat.ExtentSubjectDocument.ExtentSubject)get_store().add_element_user(EXTENTSUBJECT$0);
                return target;
            }
        }
        
        /**
         * Unsets the "extentSubject" element
         */
        public void unsetExtentSubject()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTENTSUBJECT$0, 0);
            }
        }
        
        /**
         * Gets a List of "subjectTerm" elements
         */
        public java.util.List<de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm> getSubjectTermList()
        {
            final class SubjectTermList extends java.util.AbstractList<de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm>
            {
                @Override
                public de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm get(int i)
                    { return IndexingSubjectSetImpl.this.getSubjectTermArray(i); }
                
                @Override
                public de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm set(int i, de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm o)
                {
                    de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm old = IndexingSubjectSetImpl.this.getSubjectTermArray(i);
                    IndexingSubjectSetImpl.this.setSubjectTermArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm o)
                    { IndexingSubjectSetImpl.this.insertNewSubjectTerm(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm remove(int i)
                {
                    de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm old = IndexingSubjectSetImpl.this.getSubjectTermArray(i);
                    IndexingSubjectSetImpl.this.removeSubjectTerm(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingSubjectSetImpl.this.sizeOfSubjectTermArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SubjectTermList();
            }
        }
        
        /**
         * Gets array of all "subjectTerm" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm[] getSubjectTermArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm> targetList = new java.util.ArrayList<de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm>();
                get_store().find_all_element_users(SUBJECTTERM$2, targetList);
                de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm[] result = new de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "subjectTerm" element
         */
        public de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm getSubjectTermArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm target = null;
                target = (de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm)get_store().find_element_user(SUBJECTTERM$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "subjectTerm" element
         */
        public int sizeOfSubjectTermArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SUBJECTTERM$2);
            }
        }
        
        /**
         * Sets array of all "subjectTerm" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setSubjectTermArray(de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm[] subjectTermArray)
        {
            check_orphaned();
            arraySetterHelper(subjectTermArray, SUBJECTTERM$2);
        }
        
        /**
         * Sets ith "subjectTerm" element
         */
        @Inject(optional=true) public void setSubjectTermArray(int i, de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm subjectTerm)
        {
            generatedSetterHelperImpl(subjectTerm, SUBJECTTERM$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "subjectTerm" element
         */
        public de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm insertNewSubjectTerm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm target = null;
                target = (de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm)get_store().insert_element_user(SUBJECTTERM$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "subjectTerm" element
         */
        public de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm addNewSubjectTerm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm target = null;
                target = (de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm)get_store().add_element_user(SUBJECTTERM$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "subjectTerm" element
         */
        public void removeSubjectTerm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SUBJECTTERM$2, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
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
                return get_store().find_attribute_user(TYPE$4) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        @Inject(optional=true) public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$4);
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
                get_store().remove_attribute(TYPE$4);
            }
        }
    }
}
