/*
 * An XML document type.
 * Localname: attributionQualifierActor
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.AttributionQualifierActorDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one attributionQualifierActor(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class AttributionQualifierActorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.AttributionQualifierActorDocument
{
    private static final long serialVersionUID = 1L;
    
    public AttributionQualifierActorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ATTRIBUTIONQUALIFIERACTOR$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "attributionQualifierActor");
    
    
    /**
     * Gets the "attributionQualifierActor" element
     */
    public java.lang.String getAttributionQualifierActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTIONQUALIFIERACTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "attributionQualifierActor" element
     */
    public org.apache.xmlbeans.XmlString xgetAttributionQualifierActor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTIONQUALIFIERACTOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "attributionQualifierActor" element
     */
    @Inject(optional=true) public void setAttributionQualifierActor(java.lang.String attributionQualifierActor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTIONQUALIFIERACTOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTIONQUALIFIERACTOR$0);
            }
            target.setStringValue(attributionQualifierActor);
        }
    }
    
    /**
     * Sets (as xml) the "attributionQualifierActor" element
     */
    public void xsetAttributionQualifierActor(org.apache.xmlbeans.XmlString attributionQualifierActor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTIONQUALIFIERACTOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTIONQUALIFIERACTOR$0);
            }
            target.set(attributionQualifierActor);
        }
    }
}
