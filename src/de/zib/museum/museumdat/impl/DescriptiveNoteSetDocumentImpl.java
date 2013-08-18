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
 * A document containing one descriptiveNoteSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class DescriptiveNoteSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.DescriptiveNoteSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescriptiveNoteSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTIVENOTESET$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "descriptiveNoteSet");
    
    
    /**
     * Gets the "descriptiveNoteSet" element
     */
    public de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet getDescriptiveNoteSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet target = null;
            target = (de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet)get_store().find_element_user(DESCRIPTIVENOTESET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "descriptiveNoteSet" element
     */
    @Inject(optional=true) public void setDescriptiveNoteSet(de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet descriptiveNoteSet)
    {
        generatedSetterHelperImpl(descriptiveNoteSet, DESCRIPTIVENOTESET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "descriptiveNoteSet" element
     */
    public de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet addNewDescriptiveNoteSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet target = null;
            target = (de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet)get_store().add_element_user(DESCRIPTIVENOTESET$0);
            return target;
        }
    }
    /**
     * An XML descriptiveNoteSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class DescriptiveNoteSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet
    {
        private static final long serialVersionUID = 1L;
        
        public DescriptiveNoteSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTIVENOTE$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "descriptiveNote");
        private static final javax.xml.namespace.QName SOURCEDESCRIPTIVENOTE$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "sourceDescriptiveNote");
        private static final javax.xml.namespace.QName TYPE$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "type");
        
        
        /**
         * Gets the "descriptiveNote" element
         */
        public de.zib.museum.museumdat.DescriptiveNoteDocument.DescriptiveNote getDescriptiveNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DescriptiveNoteDocument.DescriptiveNote target = null;
                target = (de.zib.museum.museumdat.DescriptiveNoteDocument.DescriptiveNote)get_store().find_element_user(DESCRIPTIVENOTE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "descriptiveNote" element
         */
        public boolean isSetDescriptiveNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTIVENOTE$0) != 0;
            }
        }
        
        /**
         * Sets the "descriptiveNote" element
         */
        @Inject(optional=true) public void setDescriptiveNote(de.zib.museum.museumdat.DescriptiveNoteDocument.DescriptiveNote descriptiveNote)
        {
            generatedSetterHelperImpl(descriptiveNote, DESCRIPTIVENOTE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "descriptiveNote" element
         */
        public de.zib.museum.museumdat.DescriptiveNoteDocument.DescriptiveNote addNewDescriptiveNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DescriptiveNoteDocument.DescriptiveNote target = null;
                target = (de.zib.museum.museumdat.DescriptiveNoteDocument.DescriptiveNote)get_store().add_element_user(DESCRIPTIVENOTE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "descriptiveNote" element
         */
        public void unsetDescriptiveNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTIVENOTE$0, 0);
            }
        }
        
        /**
         * Gets a List of "sourceDescriptiveNote" elements
         */
        public java.util.List<de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote> getSourceDescriptiveNoteList()
        {
            final class SourceDescriptiveNoteList extends java.util.AbstractList<de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote>
            {
                @Override
                public de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote get(int i)
                    { return DescriptiveNoteSetImpl.this.getSourceDescriptiveNoteArray(i); }
                
                @Override
                public de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote set(int i, de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote o)
                {
                    de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote old = DescriptiveNoteSetImpl.this.getSourceDescriptiveNoteArray(i);
                    DescriptiveNoteSetImpl.this.setSourceDescriptiveNoteArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote o)
                    { DescriptiveNoteSetImpl.this.insertNewSourceDescriptiveNote(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote remove(int i)
                {
                    de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote old = DescriptiveNoteSetImpl.this.getSourceDescriptiveNoteArray(i);
                    DescriptiveNoteSetImpl.this.removeSourceDescriptiveNote(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return DescriptiveNoteSetImpl.this.sizeOfSourceDescriptiveNoteArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SourceDescriptiveNoteList();
            }
        }
        
        /**
         * Gets array of all "sourceDescriptiveNote" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote[] getSourceDescriptiveNoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote> targetList = new java.util.ArrayList<de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote>();
                get_store().find_all_element_users(SOURCEDESCRIPTIVENOTE$2, targetList);
                de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote[] result = new de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "sourceDescriptiveNote" element
         */
        public de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote getSourceDescriptiveNoteArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote target = null;
                target = (de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote)get_store().find_element_user(SOURCEDESCRIPTIVENOTE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "sourceDescriptiveNote" element
         */
        public int sizeOfSourceDescriptiveNoteArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCEDESCRIPTIVENOTE$2);
            }
        }
        
        /**
         * Sets array of all "sourceDescriptiveNote" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setSourceDescriptiveNoteArray(de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote[] sourceDescriptiveNoteArray)
        {
            check_orphaned();
            arraySetterHelper(sourceDescriptiveNoteArray, SOURCEDESCRIPTIVENOTE$2);
        }
        
        /**
         * Sets ith "sourceDescriptiveNote" element
         */
        @Inject(optional=true) public void setSourceDescriptiveNoteArray(int i, de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote sourceDescriptiveNote)
        {
            generatedSetterHelperImpl(sourceDescriptiveNote, SOURCEDESCRIPTIVENOTE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceDescriptiveNote" element
         */
        public de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote insertNewSourceDescriptiveNote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote target = null;
                target = (de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote)get_store().insert_element_user(SOURCEDESCRIPTIVENOTE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceDescriptiveNote" element
         */
        public de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote addNewSourceDescriptiveNote()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote target = null;
                target = (de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote)get_store().add_element_user(SOURCEDESCRIPTIVENOTE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "sourceDescriptiveNote" element
         */
        public void removeSourceDescriptiveNote(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCEDESCRIPTIVENOTE$2, i);
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
