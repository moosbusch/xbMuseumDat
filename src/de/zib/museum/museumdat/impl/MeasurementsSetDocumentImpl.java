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
 * A document containing one measurementsSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class MeasurementsSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.MeasurementsSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public MeasurementsSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASUREMENTSSET$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "measurementsSet");
    
    
    /**
     * Gets the "measurementsSet" element
     */
    public de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet getMeasurementsSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet target = null;
            target = (de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet)get_store().find_element_user(MEASUREMENTSSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "measurementsSet" element
     */
    public void setMeasurementsSet(de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet measurementsSet)
    {
        generatedSetterHelperImpl(measurementsSet, MEASUREMENTSSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "measurementsSet" element
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
     * An XML measurementsSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class MeasurementsSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet
    {
        private static final long serialVersionUID = 1L;
        
        public MeasurementsSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName UNIT$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "unit");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "type");
        private static final javax.xml.namespace.QName VALUE$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "value");
        private static final javax.xml.namespace.QName ENCODINGANALOG$6 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "encodinganalog");
        private static final javax.xml.namespace.QName LABEL$8 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "label");
        private static final javax.xml.namespace.QName LANG$10 = 
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");
        
        
        /**
         * Gets the "unit" attribute
         */
        public java.lang.String getUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIT$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "unit" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUnit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIT$0);
                return target;
            }
        }
        
        /**
         * Sets the "unit" attribute
         */
        public void setUnit(java.lang.String unit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIT$0);
                }
                target.setStringValue(unit);
            }
        }
        
        /**
         * Sets (as xml) the "unit" attribute
         */
        public void xsetUnit(org.apache.xmlbeans.XmlString unit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(UNIT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(UNIT$0);
                }
                target.set(unit);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$2);
                }
                target.set(type);
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$4);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$4);
                }
                target.set(value);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$6);
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
                return get_store().find_attribute_user(ENCODINGANALOG$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCODINGANALOG$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCODINGANALOG$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ENCODINGANALOG$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ENCODINGANALOG$6);
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
                get_store().remove_attribute(ENCODINGANALOG$6);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$8);
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
                return get_store().find_attribute_user(LABEL$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LABEL$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LABEL$8);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LABEL$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LABEL$8);
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
                get_store().remove_attribute(LABEL$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$10);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$10);
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
                return get_store().find_attribute_user(LANG$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$10);
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
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$10);
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
                get_store().remove_attribute(LANG$10);
            }
        }
    }
}
