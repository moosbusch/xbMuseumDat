/*
 * An XML document type.
 * Localname: styleWrap
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.StyleWrapDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one styleWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class StyleWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.StyleWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public StyleWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STYLEWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "styleWrap");
    
    
    /**
     * Gets the "styleWrap" element
     */
    public de.zib.museum.museumdat.StyleWrapDocument.StyleWrap getStyleWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.StyleWrapDocument.StyleWrap target = null;
            target = (de.zib.museum.museumdat.StyleWrapDocument.StyleWrap)get_store().find_element_user(STYLEWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "styleWrap" element
     */
    @Inject(optional=true) public void setStyleWrap(de.zib.museum.museumdat.StyleWrapDocument.StyleWrap styleWrap)
    {
        generatedSetterHelperImpl(styleWrap, STYLEWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "styleWrap" element
     */
    public de.zib.museum.museumdat.StyleWrapDocument.StyleWrap addNewStyleWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.StyleWrapDocument.StyleWrap target = null;
            target = (de.zib.museum.museumdat.StyleWrapDocument.StyleWrap)get_store().add_element_user(STYLEWRAP$0);
            return target;
        }
    }
    /**
     * An XML styleWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class StyleWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.StyleWrapDocument.StyleWrap
    {
        private static final long serialVersionUID = 1L;
        
        public StyleWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName STYLE$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "style");
        
        
        /**
         * Gets a List of "style" elements
         */
        public java.util.List<de.zib.museum.museumdat.StyleDocument.Style> getStyleList()
        {
            final class StyleList extends java.util.AbstractList<de.zib.museum.museumdat.StyleDocument.Style>
            {
                @Override
                public de.zib.museum.museumdat.StyleDocument.Style get(int i)
                    { return StyleWrapImpl.this.getStyleArray(i); }
                
                @Override
                public de.zib.museum.museumdat.StyleDocument.Style set(int i, de.zib.museum.museumdat.StyleDocument.Style o)
                {
                    de.zib.museum.museumdat.StyleDocument.Style old = StyleWrapImpl.this.getStyleArray(i);
                    StyleWrapImpl.this.setStyleArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.StyleDocument.Style o)
                    { StyleWrapImpl.this.insertNewStyle(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.StyleDocument.Style remove(int i)
                {
                    de.zib.museum.museumdat.StyleDocument.Style old = StyleWrapImpl.this.getStyleArray(i);
                    StyleWrapImpl.this.removeStyle(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return StyleWrapImpl.this.sizeOfStyleArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new StyleList();
            }
        }
        
        /**
         * Gets array of all "style" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.StyleDocument.Style[] getStyleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.StyleDocument.Style> targetList = new java.util.ArrayList<de.zib.museum.museumdat.StyleDocument.Style>();
                get_store().find_all_element_users(STYLE$0, targetList);
                de.zib.museum.museumdat.StyleDocument.Style[] result = new de.zib.museum.museumdat.StyleDocument.Style[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "style" element
         */
        public de.zib.museum.museumdat.StyleDocument.Style getStyleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.StyleDocument.Style target = null;
                target = (de.zib.museum.museumdat.StyleDocument.Style)get_store().find_element_user(STYLE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "style" element
         */
        public int sizeOfStyleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STYLE$0);
            }
        }
        
        /**
         * Sets array of all "style" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setStyleArray(de.zib.museum.museumdat.StyleDocument.Style[] styleArray)
        {
            check_orphaned();
            arraySetterHelper(styleArray, STYLE$0);
        }
        
        /**
         * Sets ith "style" element
         */
        @Inject(optional=true) public void setStyleArray(int i, de.zib.museum.museumdat.StyleDocument.Style style)
        {
            generatedSetterHelperImpl(style, STYLE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "style" element
         */
        public de.zib.museum.museumdat.StyleDocument.Style insertNewStyle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.StyleDocument.Style target = null;
                target = (de.zib.museum.museumdat.StyleDocument.Style)get_store().insert_element_user(STYLE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "style" element
         */
        public de.zib.museum.museumdat.StyleDocument.Style addNewStyle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.StyleDocument.Style target = null;
                target = (de.zib.museum.museumdat.StyleDocument.Style)get_store().add_element_user(STYLE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "style" element
         */
        public void removeStyle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STYLE$0, i);
            }
        }
    }
}
