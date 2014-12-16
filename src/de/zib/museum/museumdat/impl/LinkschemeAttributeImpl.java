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
 * A document containing one linkscheme(@http://museum.zib.de/museumdat) attribute.
 *
 * This is a complex type.
 */
public class LinkschemeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.LinkschemeAttribute
{
    private static final long serialVersionUID = 1L;
    
    public LinkschemeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKSCHEME$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "linkscheme");
    
    
    /**
     * Gets the "linkscheme" attribute
     */
    public java.lang.String getLinkscheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINKSCHEME$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "linkscheme" attribute
     */
    public org.apache.xmlbeans.XmlString xgetLinkscheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LINKSCHEME$0);
            return target;
        }
    }
    
    /**
     * True if has "linkscheme" attribute
     */
    public boolean isSetLinkscheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LINKSCHEME$0) != null;
        }
    }
    
    /**
     * Sets the "linkscheme" attribute
     */
    public void setLinkscheme(java.lang.String linkscheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINKSCHEME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINKSCHEME$0);
            }
            target.setStringValue(linkscheme);
        }
    }
    
    /**
     * Sets (as xml) the "linkscheme" attribute
     */
    public void xsetLinkscheme(org.apache.xmlbeans.XmlString linkscheme)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LINKSCHEME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LINKSCHEME$0);
            }
            target.set(linkscheme);
        }
    }
    
    /**
     * Unsets the "linkscheme" attribute
     */
    public void unsetLinkscheme()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LINKSCHEME$0);
        }
    }
}
