/*
 * An XML document type.
 * Localname: linkRelatedResource
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.LinkRelatedResourceDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one linkRelatedResource(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class LinkRelatedResourceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.LinkRelatedResourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public LinkRelatedResourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKRELATEDRESOURCE$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "linkRelatedResource");
    
    
    /**
     * Gets the "linkRelatedResource" element
     */
    public de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource getLinkRelatedResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource target = null;
            target = (de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource)get_store().find_element_user(LINKRELATEDRESOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "linkRelatedResource" element
     */
    @Inject(optional=true) public void setLinkRelatedResource(de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource linkRelatedResource)
    {
        generatedSetterHelperImpl(linkRelatedResource, LINKRELATEDRESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "linkRelatedResource" element
     */
    public de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource addNewLinkRelatedResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource target = null;
            target = (de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource)get_store().add_element_user(LINKRELATEDRESOURCE$0);
            return target;
        }
    }
    /**
     * An XML linkRelatedResource(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class LinkRelatedResourceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource
    {
        private static final long serialVersionUID = 1L;
        
        public LinkRelatedResourceImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RELATEDRESOURCERELTYPE$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "relatedResourceRelType");
        private static final javax.xml.namespace.QName LABELRELATEDRESOURCE$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "labelRelatedResource");
        private static final javax.xml.namespace.QName LINKSCHEME$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "linkscheme");
        
        
        /**
         * Gets the "relatedResourceRelType" element
         */
        public de.zib.museum.museumdat.RelatedResourceRelTypeDocument.RelatedResourceRelType getRelatedResourceRelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RelatedResourceRelTypeDocument.RelatedResourceRelType target = null;
                target = (de.zib.museum.museumdat.RelatedResourceRelTypeDocument.RelatedResourceRelType)get_store().find_element_user(RELATEDRESOURCERELTYPE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "relatedResourceRelType" element
         */
        public boolean isSetRelatedResourceRelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELATEDRESOURCERELTYPE$0) != 0;
            }
        }
        
        /**
         * Sets the "relatedResourceRelType" element
         */
        @Inject(optional=true) public void setRelatedResourceRelType(de.zib.museum.museumdat.RelatedResourceRelTypeDocument.RelatedResourceRelType relatedResourceRelType)
        {
            generatedSetterHelperImpl(relatedResourceRelType, RELATEDRESOURCERELTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "relatedResourceRelType" element
         */
        public de.zib.museum.museumdat.RelatedResourceRelTypeDocument.RelatedResourceRelType addNewRelatedResourceRelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RelatedResourceRelTypeDocument.RelatedResourceRelType target = null;
                target = (de.zib.museum.museumdat.RelatedResourceRelTypeDocument.RelatedResourceRelType)get_store().add_element_user(RELATEDRESOURCERELTYPE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "relatedResourceRelType" element
         */
        public void unsetRelatedResourceRelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELATEDRESOURCERELTYPE$0, 0);
            }
        }
        
        /**
         * Gets a List of "labelRelatedResource" elements
         */
        public java.util.List<de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource> getLabelRelatedResourceList()
        {
            final class LabelRelatedResourceList extends java.util.AbstractList<de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource>
            {
                @Override
                public de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource get(int i)
                    { return LinkRelatedResourceImpl.this.getLabelRelatedResourceArray(i); }
                
                @Override
                public de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource set(int i, de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource o)
                {
                    de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource old = LinkRelatedResourceImpl.this.getLabelRelatedResourceArray(i);
                    LinkRelatedResourceImpl.this.setLabelRelatedResourceArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource o)
                    { LinkRelatedResourceImpl.this.insertNewLabelRelatedResource(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource remove(int i)
                {
                    de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource old = LinkRelatedResourceImpl.this.getLabelRelatedResourceArray(i);
                    LinkRelatedResourceImpl.this.removeLabelRelatedResource(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return LinkRelatedResourceImpl.this.sizeOfLabelRelatedResourceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LabelRelatedResourceList();
            }
        }
        
        /**
         * Gets array of all "labelRelatedResource" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource[] getLabelRelatedResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource> targetList = new java.util.ArrayList<de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource>();
                get_store().find_all_element_users(LABELRELATEDRESOURCE$2, targetList);
                de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource[] result = new de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "labelRelatedResource" element
         */
        public de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource getLabelRelatedResourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource target = null;
                target = (de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource)get_store().find_element_user(LABELRELATEDRESOURCE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "labelRelatedResource" element
         */
        public int sizeOfLabelRelatedResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LABELRELATEDRESOURCE$2);
            }
        }
        
        /**
         * Sets array of all "labelRelatedResource" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setLabelRelatedResourceArray(de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource[] labelRelatedResourceArray)
        {
            check_orphaned();
            arraySetterHelper(labelRelatedResourceArray, LABELRELATEDRESOURCE$2);
        }
        
        /**
         * Sets ith "labelRelatedResource" element
         */
        @Inject(optional=true) public void setLabelRelatedResourceArray(int i, de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource labelRelatedResource)
        {
            generatedSetterHelperImpl(labelRelatedResource, LABELRELATEDRESOURCE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "labelRelatedResource" element
         */
        public de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource insertNewLabelRelatedResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource target = null;
                target = (de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource)get_store().insert_element_user(LABELRELATEDRESOURCE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "labelRelatedResource" element
         */
        public de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource addNewLabelRelatedResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource target = null;
                target = (de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource)get_store().add_element_user(LABELRELATEDRESOURCE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "labelRelatedResource" element
         */
        public void removeLabelRelatedResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LABELRELATEDRESOURCE$2, i);
            }
        }
        
        /**
         * Gets the "linkscheme" attribute
         */
        public java.lang.String getLinkscheme()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINKSCHEME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LINKSCHEME$4);
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
                return get_store().find_attribute_user(LINKSCHEME$4) != null;
            }
        }
        
        /**
         * Sets the "linkscheme" attribute
         */
        @Inject(optional=true) public void setLinkscheme(java.lang.String linkscheme)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LINKSCHEME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LINKSCHEME$4);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LINKSCHEME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LINKSCHEME$4);
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
                get_store().remove_attribute(LINKSCHEME$4);
            }
        }
    }
}
