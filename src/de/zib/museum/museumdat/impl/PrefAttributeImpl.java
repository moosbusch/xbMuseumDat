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
 * A document containing one pref(@http://museum.zib.de/museumdat) attribute.
 *
 * This is a complex type.
 */
public class PrefAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.PrefAttribute
{
    private static final long serialVersionUID = 1L;
    
    public PrefAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREF$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "pref");
    
    
    /**
     * Gets the "pref" attribute
     */
    public de.zib.museum.museumdat.PrefAttribute.Pref.Enum getPref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREF$0);
            if (target == null)
            {
                return null;
            }
            return (de.zib.museum.museumdat.PrefAttribute.Pref.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "pref" attribute
     */
    public de.zib.museum.museumdat.PrefAttribute.Pref xgetPref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.PrefAttribute.Pref target = null;
            target = (de.zib.museum.museumdat.PrefAttribute.Pref)get_store().find_attribute_user(PREF$0);
            return target;
        }
    }
    
    /**
     * True if has "pref" attribute
     */
    public boolean isSetPref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PREF$0) != null;
        }
    }
    
    /**
     * Sets the "pref" attribute
     */
    public void setPref(de.zib.museum.museumdat.PrefAttribute.Pref.Enum pref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PREF$0);
            }
            target.setEnumValue(pref);
        }
    }
    
    /**
     * Sets (as xml) the "pref" attribute
     */
    public void xsetPref(de.zib.museum.museumdat.PrefAttribute.Pref pref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.PrefAttribute.Pref target = null;
            target = (de.zib.museum.museumdat.PrefAttribute.Pref)get_store().find_attribute_user(PREF$0);
            if (target == null)
            {
                target = (de.zib.museum.museumdat.PrefAttribute.Pref)get_store().add_attribute_user(PREF$0);
            }
            target.set(pref);
        }
    }
    
    /**
     * Unsets the "pref" attribute
     */
    public void unsetPref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PREF$0);
        }
    }
    /**
     * An XML pref(@http://museum.zib.de/museumdat).
     *
     * This is an atomic type that is a restriction of de.zib.museum.museumdat.PrefAttribute$Pref.
     */
    public static class PrefImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements de.zib.museum.museumdat.PrefAttribute.Pref
    {
        private static final long serialVersionUID = 1L;
        
        public PrefImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected PrefImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
