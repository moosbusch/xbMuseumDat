/*
 * An XML attribute type.
 * Localname: pref
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.PrefAttribute
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
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
    @Inject(optional=true) public void setPref(de.zib.museum.museumdat.PrefAttribute.Pref.Enum pref)
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
