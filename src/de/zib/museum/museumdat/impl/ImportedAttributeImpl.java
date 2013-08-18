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
 * A document containing one imported(@http://museum.zib.de/museumdat) attribute.
 *
 * This is a complex type.
 */
public class ImportedAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.ImportedAttribute
{
    private static final long serialVersionUID = 1L;
    
    public ImportedAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORTED$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "imported");
    
    
    /**
     * Gets the "imported" attribute
     */
    public de.zib.museum.museumdat.ImportedAttribute.Imported.Enum getImported()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMPORTED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(IMPORTED$0);
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
            target = (de.zib.museum.museumdat.ImportedAttribute.Imported)get_store().find_attribute_user(IMPORTED$0);
            if (target == null)
            {
                target = (de.zib.museum.museumdat.ImportedAttribute.Imported)get_default_attribute_value(IMPORTED$0);
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
            return get_store().find_attribute_user(IMPORTED$0) != null;
        }
    }
    
    /**
     * Sets the "imported" attribute
     */
    @Inject(optional=true) public void setImported(de.zib.museum.museumdat.ImportedAttribute.Imported.Enum imported)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IMPORTED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IMPORTED$0);
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
            target = (de.zib.museum.museumdat.ImportedAttribute.Imported)get_store().find_attribute_user(IMPORTED$0);
            if (target == null)
            {
                target = (de.zib.museum.museumdat.ImportedAttribute.Imported)get_store().add_attribute_user(IMPORTED$0);
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
            get_store().remove_attribute(IMPORTED$0);
        }
    }
    /**
     * An XML imported(@http://museum.zib.de/museumdat).
     *
     * This is an atomic type that is a restriction of de.zib.museum.museumdat.ImportedAttribute$Imported.
     */
    public static class ImportedImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements de.zib.museum.museumdat.ImportedAttribute.Imported
    {
        private static final long serialVersionUID = 1L;
        
        public ImportedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ImportedImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
