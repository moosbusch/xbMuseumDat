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
 * A document containing one qualifierMeasurements(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class QualifierMeasurementsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.QualifierMeasurementsDocument
{
    private static final long serialVersionUID = 1L;
    
    public QualifierMeasurementsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUALIFIERMEASUREMENTS$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "qualifierMeasurements");
    
    
    /**
     * Gets the "qualifierMeasurements" element
     */
    public java.lang.String getQualifierMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUALIFIERMEASUREMENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "qualifierMeasurements" element
     */
    public org.apache.xmlbeans.XmlString xgetQualifierMeasurements()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUALIFIERMEASUREMENTS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "qualifierMeasurements" element
     */
    public void setQualifierMeasurements(java.lang.String qualifierMeasurements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUALIFIERMEASUREMENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUALIFIERMEASUREMENTS$0);
            }
            target.setStringValue(qualifierMeasurements);
        }
    }
    
    /**
     * Sets (as xml) the "qualifierMeasurements" element
     */
    public void xsetQualifierMeasurements(org.apache.xmlbeans.XmlString qualifierMeasurements)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUALIFIERMEASUREMENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUALIFIERMEASUREMENTS$0);
            }
            target.set(qualifierMeasurements);
        }
    }
}
