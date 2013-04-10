/*
 * An XML attribute type.
 * Localname: locID
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.LocIDAttribute
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one locID(@http://museum.zib.de/museumdat) attribute.
 *
 * This is a complex type.
 */
public class LocIDAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.LocIDAttribute
{
    private static final long serialVersionUID = 1L;
    
    public LocIDAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOCID$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "locID");
    
    
    /**
     * Gets the "locID" attribute
     */
    public java.lang.String getLocID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCID$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCID$0);
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
            return get_store().find_attribute_user(LOCID$0) != null;
        }
    }
    
    /**
     * Sets the "locID" attribute
     */
    @Inject(optional=true) public void setLocID(java.lang.String locID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCID$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LOCID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LOCID$0);
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
            get_store().remove_attribute(LOCID$0);
        }
    }
}
