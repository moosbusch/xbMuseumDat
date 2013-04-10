/*
 * An XML attribute type.
 * Localname: locIDtype
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.LocIDtypeAttribute
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one locIDtype(@http://museum.zib.de/museumdat) attribute.
 *
 * This is a complex type.
 */
public class LocIDtypeAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.LocIDtypeAttribute
{
    private static final long serialVersionUID = 1L;
    
    public LocIDtypeAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCIDTYPE$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "locIDtype");
    
    
    /**
     * Gets the "locIDtype" attribute
     */
    public java.lang.String getLocIDtype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCIDTYPE$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCIDTYPE$0);
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
            return get_store().find_attribute_user(LOCIDTYPE$0) != null;
        }
    }
    
    /**
     * Sets the "locIDtype" attribute
     */
    @Inject(optional=true) public void setLocIDtype(java.lang.String locIDtype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCIDTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCIDTYPE$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCIDTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCIDTYPE$0);
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
            get_store().remove_attribute(LOCIDTYPE$0);
        }
    }
}
