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
 * A document containing one resourceViewDate(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class ResourceViewDateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.ResourceViewDateDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceViewDateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCEVIEWDATE$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "resourceViewDate");
    
    
    /**
     * Gets the "resourceViewDate" element
     */
    public de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate getResourceViewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate target = null;
            target = (de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate)get_store().find_element_user(RESOURCEVIEWDATE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resourceViewDate" element
     */
    public void setResourceViewDate(de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate resourceViewDate)
    {
        generatedSetterHelperImpl(resourceViewDate, RESOURCEVIEWDATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resourceViewDate" element
     */
    public de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate addNewResourceViewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate target = null;
            target = (de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate)get_store().add_element_user(RESOURCEVIEWDATE$0);
            return target;
        }
    }
    /**
     * An XML resourceViewDate(@http://museum.zib.de/museumdat).
     *
     * This is an atomic type that is a restriction of de.zib.museum.museumdat.ResourceViewDateDocument$ResourceViewDate.
     */
    public static class ResourceViewDateImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate
    {
        private static final long serialVersionUID = 1L;
        
        public ResourceViewDateImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected ResourceViewDateImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName EARLIESTDATE$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "earliestdate");
        private static final javax.xml.namespace.QName LATESTDATE$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "latestdate");
        private static final javax.xml.namespace.QName ENCODINGANALOG$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "encodinganalog");
        private static final javax.xml.namespace.QName LABEL$6 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "label");
        private static final javax.xml.namespace.QName LANG$8 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        
        
        /**
         * Gets the "earliestdate" attribute
         */
        public java.lang.String getEarliestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EARLIESTDATE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "earliestdate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetEarliestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EARLIESTDATE$0);
                return target;
            }
        }
        
        /**
         * True if has "earliestdate" attribute
         */
        public boolean isSetEarliestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EARLIESTDATE$0) != null;
            }
        }
        
        /**
         * Sets the "earliestdate" attribute
         */
        public void setEarliestdate(java.lang.String earliestdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EARLIESTDATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EARLIESTDATE$0);
                }
                target.setStringValue(earliestdate);
            }
        }
        
        /**
         * Sets (as xml) the "earliestdate" attribute
         */
        public void xsetEarliestdate(org.apache.xmlbeans.XmlString earliestdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(EARLIESTDATE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(EARLIESTDATE$0);
                }
                target.set(earliestdate);
            }
        }
        
        /**
         * Unsets the "earliestdate" attribute
         */
        public void unsetEarliestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EARLIESTDATE$0);
            }
        }
        
        /**
         * Gets the "latestdate" attribute
         */
        public java.lang.String getLatestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATESTDATE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "latestdate" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLatestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LATESTDATE$2);
                return target;
            }
        }
        
        /**
         * True if has "latestdate" attribute
         */
        public boolean isSetLatestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LATESTDATE$2) != null;
            }
        }
        
        /**
         * Sets the "latestdate" attribute
         */
        public void setLatestdate(java.lang.String latestdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LATESTDATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LATESTDATE$2);
                }
                target.setStringValue(latestdate);
            }
        }
        
        /**
         * Sets (as xml) the "latestdate" attribute
         */
        public void xsetLatestdate(org.apache.xmlbeans.XmlString latestdate)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LATESTDATE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LATESTDATE$2);
                }
                target.set(latestdate);
            }
        }
        
        /**
         * Unsets the "latestdate" attribute
         */
        public void unsetLatestdate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LATESTDATE$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$4);
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
                return get_store().find_attribute_user(ENCODINGANALOG$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGANALOG$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODINGANALOG$4);
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
                get_store().remove_attribute(ENCODINGANALOG$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$6);
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
                return get_store().find_attribute_user(LABEL$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$6);
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
                get_store().remove_attribute(LABEL$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$8);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$8);
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
                return get_store().find_attribute_user(LANG$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$8);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$8);
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
                get_store().remove_attribute(LANG$8);
            }
        }
    }
}
