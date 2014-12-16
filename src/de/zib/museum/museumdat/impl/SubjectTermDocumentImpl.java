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
 * A document containing one subjectTerm(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class SubjectTermDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.SubjectTermDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubjectTermDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBJECTTERM$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "subjectTerm");
    
    
    /**
     * Gets the "subjectTerm" element
     */
    public de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm getSubjectTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm target = null;
            target = (de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm)get_store().find_element_user(SUBJECTTERM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subjectTerm" element
     */
    public void setSubjectTerm(de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm subjectTerm)
    {
        generatedSetterHelperImpl(subjectTerm, SUBJECTTERM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subjectTerm" element
     */
    public de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm addNewSubjectTerm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm target = null;
            target = (de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm)get_store().add_element_user(SUBJECTTERM$0);
            return target;
        }
    }
    /**
     * An XML subjectTerm(@http://museum.zib.de/museumdat).
     *
     * This is an atomic type that is a restriction of de.zib.museum.museumdat.SubjectTermDocument$SubjectTerm.
     */
    public static class SubjectTermImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm
    {
        private static final long serialVersionUID = 1L;
        
        public SubjectTermImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected SubjectTermImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "type");
        private static final javax.xml.namespace.QName TERMSOURCE$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "termsource");
        private static final javax.xml.namespace.QName TERMSOURCEID$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "termsourceID");
        private static final javax.xml.namespace.QName IMPORTED$6 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "imported");
        private static final javax.xml.namespace.QName ENCODINGANALOG$8 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "encodinganalog");
        private static final javax.xml.namespace.QName LABEL$10 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "label");
        private static final javax.xml.namespace.QName LANG$12 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        
        
        /**
         * Gets the "type" attribute
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
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
                return get_store().find_attribute_user(TYPE$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$0);
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
                get_store().remove_attribute(TYPE$0);
            }
        }
        
        /**
         * Gets the "termsource" attribute
         */
        public java.lang.String getTermsource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "termsource" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTermsource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCE$2);
                return target;
            }
        }
        
        /**
         * True if has "termsource" attribute
         */
        public boolean isSetTermsource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TERMSOURCE$2) != null;
            }
        }
        
        /**
         * Sets the "termsource" attribute
         */
        public void setTermsource(java.lang.String termsource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TERMSOURCE$2);
                }
                target.setStringValue(termsource);
            }
        }
        
        /**
         * Sets (as xml) the "termsource" attribute
         */
        public void xsetTermsource(org.apache.xmlbeans.XmlString termsource)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TERMSOURCE$2);
                }
                target.set(termsource);
            }
        }
        
        /**
         * Unsets the "termsource" attribute
         */
        public void unsetTermsource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TERMSOURCE$2);
            }
        }
        
        /**
         * Gets the "termsourceID" attribute
         */
        public java.lang.String getTermsourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCEID$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "termsourceID" attribute
         */
        public org.apache.xmlbeans.XmlString xgetTermsourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCEID$4);
                return target;
            }
        }
        
        /**
         * True if has "termsourceID" attribute
         */
        public boolean isSetTermsourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TERMSOURCEID$4) != null;
            }
        }
        
        /**
         * Sets the "termsourceID" attribute
         */
        public void setTermsourceID(java.lang.String termsourceID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCEID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TERMSOURCEID$4);
                }
                target.setStringValue(termsourceID);
            }
        }
        
        /**
         * Sets (as xml) the "termsourceID" attribute
         */
        public void xsetTermsourceID(org.apache.xmlbeans.XmlString termsourceID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCEID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TERMSOURCEID$4);
                }
                target.set(termsourceID);
            }
        }
        
        /**
         * Unsets the "termsourceID" attribute
         */
        public void unsetTermsourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TERMSOURCEID$4);
            }
        }
        
        /**
         * Gets the "imported" attribute
         */
        public de.zib.museum.museumdat.ImportedAttribute.Imported.Enum getImported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMPORTED$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IMPORTED$6);
                }
                if (target == null)
                {
                    return null;
                }
                return (de.zib.museum.museumdat.ImportedAttribute.Imported.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "imported" attribute
         */
        public de.zib.museum.museumdat.ImportedAttribute.Imported xgetImported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ImportedAttribute.Imported target = null;
                target = (de.zib.museum.museumdat.ImportedAttribute.Imported)get_store().find_attribute_user(IMPORTED$6);
                if (target == null)
                {
                    target = (de.zib.museum.museumdat.ImportedAttribute.Imported)get_default_attribute_value(IMPORTED$6);
                }
                return target;
            }
        }
        
        /**
         * True if has "imported" attribute
         */
        public boolean isSetImported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IMPORTED$6) != null;
            }
        }
        
        /**
         * Sets the "imported" attribute
         */
        public void setImported(de.zib.museum.museumdat.ImportedAttribute.Imported.Enum imported)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMPORTED$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMPORTED$6);
                }
                target.setEnumValue(imported);
            }
        }
        
        /**
         * Sets (as xml) the "imported" attribute
         */
        public void xsetImported(de.zib.museum.museumdat.ImportedAttribute.Imported imported)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ImportedAttribute.Imported target = null;
                target = (de.zib.museum.museumdat.ImportedAttribute.Imported)get_store().find_attribute_user(IMPORTED$6);
                if (target == null)
                {
                    target = (de.zib.museum.museumdat.ImportedAttribute.Imported)get_store().add_attribute_user(IMPORTED$6);
                }
                target.set(imported);
            }
        }
        
        /**
         * Unsets the "imported" attribute
         */
        public void unsetImported()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IMPORTED$6);
            }
        }
        
        /**
         * Gets the "encodinganalog" attribute
         */
        public java.lang.String getEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$8);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "encodinganalog" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$8);
                return target;
            }
        }
        
        /**
         * True if has "encodinganalog" attribute
         */
        public boolean isSetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ENCODINGANALOG$8) != null;
            }
        }
        
        /**
         * Sets the "encodinganalog" attribute
         */
        public void setEncodinganalog(java.lang.String encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGANALOG$8);
                }
                target.setStringValue(encodinganalog);
            }
        }
        
        /**
         * Sets (as xml) the "encodinganalog" attribute
         */
        public void xsetEncodinganalog(org.apache.xmlbeans.XmlString encodinganalog)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODINGANALOG$8);
                }
                target.set(encodinganalog);
            }
        }
        
        /**
         * Unsets the "encodinganalog" attribute
         */
        public void unsetEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ENCODINGANALOG$8);
            }
        }
        
        /**
         * Gets the "label" attribute
         */
        public java.lang.String getLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "label" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$10);
                return target;
            }
        }
        
        /**
         * True if has "label" attribute
         */
        public boolean isSetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LABEL$10) != null;
            }
        }
        
        /**
         * Sets the "label" attribute
         */
        public void setLabel(java.lang.String label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$10);
                }
                target.setStringValue(label);
            }
        }
        
        /**
         * Sets (as xml) the "label" attribute
         */
        public void xsetLabel(org.apache.xmlbeans.XmlString label)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$10);
                }
                target.set(label);
            }
        }
        
        /**
         * Unsets the "label" attribute
         */
        public void unsetLabel()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LABEL$10);
            }
        }
        
        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.XmlLanguage xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$12);
                return target;
            }
        }
        
        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG$12) != null;
            }
        }
        
        /**
         * Sets the "lang" attribute
         */
        public void setLang(java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$12);
                }
                target.setStringValue(lang);
            }
        }
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$12);
                }
                target.set(lang);
            }
        }
        
        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG$12);
            }
        }
    }
}
