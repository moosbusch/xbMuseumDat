/*
 * An XML document type.
 * Localname: titleSet
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.TitleSetDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one titleSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class TitleSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.TitleSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public TitleSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLESET$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "titleSet");
    
    
    /**
     * Gets the "titleSet" element
     */
    public de.zib.museum.museumdat.TitleSetDocument.TitleSet getTitleSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.TitleSetDocument.TitleSet target = null;
            target = (de.zib.museum.museumdat.TitleSetDocument.TitleSet)get_store().find_element_user(TITLESET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "titleSet" element
     */
    @Inject(optional=true) public void setTitleSet(de.zib.museum.museumdat.TitleSetDocument.TitleSet titleSet)
    {
        generatedSetterHelperImpl(titleSet, TITLESET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "titleSet" element
     */
    public de.zib.museum.museumdat.TitleSetDocument.TitleSet addNewTitleSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.TitleSetDocument.TitleSet target = null;
            target = (de.zib.museum.museumdat.TitleSetDocument.TitleSet)get_store().add_element_user(TITLESET$0);
            return target;
        }
    }
    /**
     * An XML titleSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class TitleSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.TitleSetDocument.TitleSet
    {
        private static final long serialVersionUID = 1L;
        
        public TitleSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TITLE$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "title");
        private static final javax.xml.namespace.QName SOURCETITLE$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "sourceTitle");
        
        
        /**
         * Gets the "title" element
         */
        public de.zib.museum.museumdat.TitleDocument.Title getTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.TitleDocument.Title target = null;
                target = (de.zib.museum.museumdat.TitleDocument.Title)get_store().find_element_user(TITLE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "title" element
         */
        @Inject(optional=true) public void setTitle(de.zib.museum.museumdat.TitleDocument.Title title)
        {
            generatedSetterHelperImpl(title, TITLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "title" element
         */
        public de.zib.museum.museumdat.TitleDocument.Title addNewTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.TitleDocument.Title target = null;
                target = (de.zib.museum.museumdat.TitleDocument.Title)get_store().add_element_user(TITLE$0);
                return target;
            }
        }
        
        /**
         * Gets a List of "sourceTitle" elements
         */
        public java.util.List<de.zib.museum.museumdat.SourceTitleDocument.SourceTitle> getSourceTitleList()
        {
            final class SourceTitleList extends java.util.AbstractList<de.zib.museum.museumdat.SourceTitleDocument.SourceTitle>
            {
                @Override
                public de.zib.museum.museumdat.SourceTitleDocument.SourceTitle get(int i)
                    { return TitleSetImpl.this.getSourceTitleArray(i); }
                
                @Override
                public de.zib.museum.museumdat.SourceTitleDocument.SourceTitle set(int i, de.zib.museum.museumdat.SourceTitleDocument.SourceTitle o)
                {
                    de.zib.museum.museumdat.SourceTitleDocument.SourceTitle old = TitleSetImpl.this.getSourceTitleArray(i);
                    TitleSetImpl.this.setSourceTitleArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.SourceTitleDocument.SourceTitle o)
                    { TitleSetImpl.this.insertNewSourceTitle(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.SourceTitleDocument.SourceTitle remove(int i)
                {
                    de.zib.museum.museumdat.SourceTitleDocument.SourceTitle old = TitleSetImpl.this.getSourceTitleArray(i);
                    TitleSetImpl.this.removeSourceTitle(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return TitleSetImpl.this.sizeOfSourceTitleArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SourceTitleList();
            }
        }
        
        /**
         * Gets array of all "sourceTitle" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.SourceTitleDocument.SourceTitle[] getSourceTitleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.SourceTitleDocument.SourceTitle> targetList = new java.util.ArrayList<de.zib.museum.museumdat.SourceTitleDocument.SourceTitle>();
                get_store().find_all_element_users(SOURCETITLE$2, targetList);
                de.zib.museum.museumdat.SourceTitleDocument.SourceTitle[] result = new de.zib.museum.museumdat.SourceTitleDocument.SourceTitle[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "sourceTitle" element
         */
        public de.zib.museum.museumdat.SourceTitleDocument.SourceTitle getSourceTitleArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SourceTitleDocument.SourceTitle target = null;
                target = (de.zib.museum.museumdat.SourceTitleDocument.SourceTitle)get_store().find_element_user(SOURCETITLE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "sourceTitle" element
         */
        public int sizeOfSourceTitleArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCETITLE$2);
            }
        }
        
        /**
         * Sets array of all "sourceTitle" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setSourceTitleArray(de.zib.museum.museumdat.SourceTitleDocument.SourceTitle[] sourceTitleArray)
        {
            check_orphaned();
            arraySetterHelper(sourceTitleArray, SOURCETITLE$2);
        }
        
        /**
         * Sets ith "sourceTitle" element
         */
        @Inject(optional=true) public void setSourceTitleArray(int i, de.zib.museum.museumdat.SourceTitleDocument.SourceTitle sourceTitle)
        {
            generatedSetterHelperImpl(sourceTitle, SOURCETITLE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceTitle" element
         */
        public de.zib.museum.museumdat.SourceTitleDocument.SourceTitle insertNewSourceTitle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SourceTitleDocument.SourceTitle target = null;
                target = (de.zib.museum.museumdat.SourceTitleDocument.SourceTitle)get_store().insert_element_user(SOURCETITLE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceTitle" element
         */
        public de.zib.museum.museumdat.SourceTitleDocument.SourceTitle addNewSourceTitle()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SourceTitleDocument.SourceTitle target = null;
                target = (de.zib.museum.museumdat.SourceTitleDocument.SourceTitle)get_store().add_element_user(SOURCETITLE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "sourceTitle" element
         */
        public void removeSourceTitle(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCETITLE$2, i);
            }
        }
    }
}
