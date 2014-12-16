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
 * A document containing one locRelatedWork(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class LocRelatedWorkDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.LocRelatedWorkDocument
{
    private static final long serialVersionUID = 1L;
    
    public LocRelatedWorkDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCRELATEDWORK$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "locRelatedWork");
    
    
    /**
     * Gets the "locRelatedWork" element
     */
    public de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork getLocRelatedWork()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork target = null;
            target = (de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork)get_store().find_element_user(LOCRELATEDWORK$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "locRelatedWork" element
     */
    public void setLocRelatedWork(de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork locRelatedWork)
    {
        generatedSetterHelperImpl(locRelatedWork, LOCRELATEDWORK$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "locRelatedWork" element
     */
    public de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork addNewLocRelatedWork()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork target = null;
            target = (de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork)get_store().add_element_user(LOCRELATEDWORK$0);
            return target;
        }
    }
    /**
     * An XML locRelatedWork(@http://museum.zib.de/museumdat).
     *
     * This is an atomic type that is a restriction of de.zib.museum.museumdat.LocRelatedWorkDocument$LocRelatedWork.
     */
    public static class LocRelatedWorkImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork
    {
        private static final long serialVersionUID = 1L;
        
        public LocRelatedWorkImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected LocRelatedWorkImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName RELWORKID$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "relWorkID");
        private static final javax.xml.namespace.QName TERMSOURCE$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "termsource");
        private static final javax.xml.namespace.QName LOCID$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "locID");
        private static final javax.xml.namespace.QName LOCIDTYPE$6 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "locIDtype");
        private static final javax.xml.namespace.QName ENCODINGANALOG$8 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "encodinganalog");
        private static final javax.xml.namespace.QName LABEL$10 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "label");
        private static final javax.xml.namespace.QName LANG$12 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        
        
        /**
         * Gets the "relWorkID" attribute
         */
        public java.lang.String getRelWorkID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELWORKID$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "relWorkID" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRelWorkID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELWORKID$0);
                return target;
            }
        }
        
        /**
         * True if has "relWorkID" attribute
         */
        public boolean isSetRelWorkID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RELWORKID$0) != null;
            }
        }
        
        /**
         * Sets the "relWorkID" attribute
         */
        public void setRelWorkID(java.lang.String relWorkID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELWORKID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELWORKID$0);
                }
                target.setStringValue(relWorkID);
            }
        }
        
        /**
         * Sets (as xml) the "relWorkID" attribute
         */
        public void xsetRelWorkID(org.apache.xmlbeans.XmlString relWorkID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELWORKID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RELWORKID$0);
                }
                target.set(relWorkID);
            }
        }
        
        /**
         * Unsets the "relWorkID" attribute
         */
        public void unsetRelWorkID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RELWORKID$0);
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
         * Gets the "locID" attribute
         */
        public java.lang.String getLocID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCID$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "locID" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLocID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCID$4);
                return target;
            }
        }
        
        /**
         * True if has "locID" attribute
         */
        public boolean isSetLocID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOCID$4) != null;
            }
        }
        
        /**
         * Sets the "locID" attribute
         */
        public void setLocID(java.lang.String locID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCID$4);
                }
                target.setStringValue(locID);
            }
        }
        
        /**
         * Sets (as xml) the "locID" attribute
         */
        public void xsetLocID(org.apache.xmlbeans.XmlString locID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCID$4);
                }
                target.set(locID);
            }
        }
        
        /**
         * Unsets the "locID" attribute
         */
        public void unsetLocID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOCID$4);
            }
        }
        
        /**
         * Gets the "locIDtype" attribute
         */
        public java.lang.String getLocIDtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCIDTYPE$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "locIDtype" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLocIDtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCIDTYPE$6);
                return target;
            }
        }
        
        /**
         * True if has "locIDtype" attribute
         */
        public boolean isSetLocIDtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LOCIDTYPE$6) != null;
            }
        }
        
        /**
         * Sets the "locIDtype" attribute
         */
        public void setLocIDtype(java.lang.String locIDtype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCIDTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCIDTYPE$6);
                }
                target.setStringValue(locIDtype);
            }
        }
        
        /**
         * Sets (as xml) the "locIDtype" attribute
         */
        public void xsetLocIDtype(org.apache.xmlbeans.XmlString locIDtype)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCIDTYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCIDTYPE$6);
                }
                target.set(locIDtype);
            }
        }
        
        /**
         * Unsets the "locIDtype" attribute
         */
        public void unsetLocIDtype()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LOCIDTYPE$6);
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
