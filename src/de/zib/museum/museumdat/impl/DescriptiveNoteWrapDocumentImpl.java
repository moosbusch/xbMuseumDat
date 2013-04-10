/*
 * An XML document type.
 * Localname: descriptiveNoteWrap
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.DescriptiveNoteWrapDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one descriptiveNoteWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class DescriptiveNoteWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.DescriptiveNoteWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescriptiveNoteWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTIVENOTEWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "descriptiveNoteWrap");
    
    
    /**
     * Gets the "descriptiveNoteWrap" element
     */
    public de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap getDescriptiveNoteWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap target = null;
            target = (de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap)get_store().find_element_user(DESCRIPTIVENOTEWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "descriptiveNoteWrap" element
     */
    @Inject(optional=true) public void setDescriptiveNoteWrap(de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap descriptiveNoteWrap)
    {
        generatedSetterHelperImpl(descriptiveNoteWrap, DESCRIPTIVENOTEWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "descriptiveNoteWrap" element
     */
    public de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap addNewDescriptiveNoteWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap target = null;
            target = (de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap)get_store().add_element_user(DESCRIPTIVENOTEWRAP$0);
            return target;
        }
    }
    /**
     * An XML descriptiveNoteWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class DescriptiveNoteWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap
    {
        private static final long serialVersionUID = 1L;
        
        public DescriptiveNoteWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DESCRIPTIVENOTESET$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "descriptiveNoteSet");
        
        
        /**
         * Gets a List of "descriptiveNoteSet" elements
         */
        public java.util.List<de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet> getDescriptiveNoteSetList()
        {
            final class DescriptiveNoteSetList extends java.util.AbstractList<de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet>
            {
                @Override
                public de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet get(int i)
                    { return DescriptiveNoteWrapImpl.this.getDescriptiveNoteSetArray(i); }
                
                @Override
                public de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet set(int i, de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet o)
                {
                    de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet old = DescriptiveNoteWrapImpl.this.getDescriptiveNoteSetArray(i);
                    DescriptiveNoteWrapImpl.this.setDescriptiveNoteSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet o)
                    { DescriptiveNoteWrapImpl.this.insertNewDescriptiveNoteSet(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet remove(int i)
                {
                    de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet old = DescriptiveNoteWrapImpl.this.getDescriptiveNoteSetArray(i);
                    DescriptiveNoteWrapImpl.this.removeDescriptiveNoteSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return DescriptiveNoteWrapImpl.this.sizeOfDescriptiveNoteSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DescriptiveNoteSetList();
            }
        }
        
        /**
         * Gets array of all "descriptiveNoteSet" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet[] getDescriptiveNoteSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet> targetList = new java.util.ArrayList<de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet>();
                get_store().find_all_element_users(DESCRIPTIVENOTESET$0, targetList);
                de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet[] result = new de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "descriptiveNoteSet" element
         */
        public de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet getDescriptiveNoteSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet target = null;
                target = (de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet)get_store().find_element_user(DESCRIPTIVENOTESET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "descriptiveNoteSet" element
         */
        public int sizeOfDescriptiveNoteSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTIVENOTESET$0);
            }
        }
        
        /**
         * Sets array of all "descriptiveNoteSet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setDescriptiveNoteSetArray(de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet[] descriptiveNoteSetArray)
        {
            check_orphaned();
            arraySetterHelper(descriptiveNoteSetArray, DESCRIPTIVENOTESET$0);
        }
        
        /**
         * Sets ith "descriptiveNoteSet" element
         */
        @Inject(optional=true) public void setDescriptiveNoteSetArray(int i, de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet descriptiveNoteSet)
        {
            generatedSetterHelperImpl(descriptiveNoteSet, DESCRIPTIVENOTESET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "descriptiveNoteSet" element
         */
        public de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet insertNewDescriptiveNoteSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet target = null;
                target = (de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet)get_store().insert_element_user(DESCRIPTIVENOTESET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "descriptiveNoteSet" element
         */
        public de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet addNewDescriptiveNoteSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet target = null;
                target = (de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet)get_store().add_element_user(DESCRIPTIVENOTESET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "descriptiveNoteSet" element
         */
        public void removeDescriptiveNoteSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTIVENOTESET$0, i);
            }
        }
    }
}
