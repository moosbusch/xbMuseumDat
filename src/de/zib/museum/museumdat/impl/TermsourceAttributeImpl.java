/*
 * An XML attribute type.
 * Localname: termsource
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.TermsourceAttribute
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one termsource(@http://museum.zib.de/museumdat) attribute.
 *
 * This is a complex type.
 */
public class TermsourceAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.TermsourceAttribute
{
    private static final long serialVersionUID = 1L;
    
    public TermsourceAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TERMSOURCE$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "termsource");
    
    
    /**
     * Gets the "termsource" attribute
     */
    public java.lang.String getTermsource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCE$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCE$0);
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
            return get_store().find_attribute_user(TERMSOURCE$0) != null;
        }
    }
    
    /**
     * Sets the "termsource" attribute
     */
    @Inject(optional=true) public void setTermsource(java.lang.String termsource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TERMSOURCE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TERMSOURCE$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TERMSOURCE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TERMSOURCE$0);
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
            get_store().remove_attribute(TERMSOURCE$0);
        }
    }
}
