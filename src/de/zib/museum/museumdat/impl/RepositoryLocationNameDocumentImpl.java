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
 * A document containing one repositoryLocationName(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class RepositoryLocationNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.RepositoryLocationNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public RepositoryLocationNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPOSITORYLOCATIONNAME$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "repositoryLocationName");
    
    
    /**
     * Gets the "repositoryLocationName" element
     */
    public de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName getRepositoryLocationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName target = null;
            target = (de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName)get_store().find_element_user(REPOSITORYLOCATIONNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "repositoryLocationName" element
     */
    public void setRepositoryLocationName(de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName repositoryLocationName)
    {
        generatedSetterHelperImpl(repositoryLocationName, REPOSITORYLOCATIONNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "repositoryLocationName" element
     */
    public de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName addNewRepositoryLocationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName target = null;
            target = (de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName)get_store().add_element_user(REPOSITORYLOCATIONNAME$0);
            return target;
        }
    }
    /**
     * An XML repositoryLocationName(@http://museum.zib.de/museumdat).
     *
     * This is an atomic type that is a restriction of de.zib.museum.museumdat.RepositoryLocationNameDocument$RepositoryLocationName.
     */
    public static class RepositoryLocationNameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName
    {
        private static final long serialVersionUID = 1L;
        
        public RepositoryLocationNameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected RepositoryLocationNameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName ENCODINGANALOG$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "encodinganalog");
        private static final javax.xml.namespace.QName LABEL$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "label");
        private static final javax.xml.namespace.QName LANG$4 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        
        
        /**
         * Gets the "encodinganalog" attribute
         */
        public java.lang.String getEncodinganalog()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$0);
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
                return get_store().find_attribute_user(ENCODINGANALOG$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGANALOG$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODINGANALOG$0);
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
                get_store().remove_attribute(ENCODINGANALOG$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$2);
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
                return get_store().find_attribute_user(LABEL$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$2);
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
                get_store().remove_attribute(LABEL$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$4);
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
                return get_store().find_attribute_user(LANG$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$4);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$4);
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
                get_store().remove_attribute(LANG$4);
            }
        }
    }
}
