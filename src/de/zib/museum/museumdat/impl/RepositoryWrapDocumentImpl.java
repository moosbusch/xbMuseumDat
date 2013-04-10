/*
 * An XML document type.
 * Localname: repositoryWrap
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.RepositoryWrapDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one repositoryWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class RepositoryWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.RepositoryWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public RepositoryWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPOSITORYWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "repositoryWrap");
    
    
    /**
     * Gets the "repositoryWrap" element
     */
    public de.zib.museum.museumdat.RepositoryWrapDocument.RepositoryWrap getRepositoryWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.RepositoryWrapDocument.RepositoryWrap target = null;
            target = (de.zib.museum.museumdat.RepositoryWrapDocument.RepositoryWrap)get_store().find_element_user(REPOSITORYWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "repositoryWrap" element
     */
    @Inject(optional=true) public void setRepositoryWrap(de.zib.museum.museumdat.RepositoryWrapDocument.RepositoryWrap repositoryWrap)
    {
        generatedSetterHelperImpl(repositoryWrap, REPOSITORYWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "repositoryWrap" element
     */
    public de.zib.museum.museumdat.RepositoryWrapDocument.RepositoryWrap addNewRepositoryWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.RepositoryWrapDocument.RepositoryWrap target = null;
            target = (de.zib.museum.museumdat.RepositoryWrapDocument.RepositoryWrap)get_store().add_element_user(REPOSITORYWRAP$0);
            return target;
        }
    }
    /**
     * An XML repositoryWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class RepositoryWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.RepositoryWrapDocument.RepositoryWrap
    {
        private static final long serialVersionUID = 1L;
        
        public RepositoryWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REPOSITORYSET$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "repositorySet");
        
        
        /**
         * Gets a List of "repositorySet" elements
         */
        public java.util.List<de.zib.museum.museumdat.RepositorySetDocument.RepositorySet> getRepositorySetList()
        {
            final class RepositorySetList extends java.util.AbstractList<de.zib.museum.museumdat.RepositorySetDocument.RepositorySet>
            {
                @Override
                public de.zib.museum.museumdat.RepositorySetDocument.RepositorySet get(int i)
                    { return RepositoryWrapImpl.this.getRepositorySetArray(i); }
                
                @Override
                public de.zib.museum.museumdat.RepositorySetDocument.RepositorySet set(int i, de.zib.museum.museumdat.RepositorySetDocument.RepositorySet o)
                {
                    de.zib.museum.museumdat.RepositorySetDocument.RepositorySet old = RepositoryWrapImpl.this.getRepositorySetArray(i);
                    RepositoryWrapImpl.this.setRepositorySetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.RepositorySetDocument.RepositorySet o)
                    { RepositoryWrapImpl.this.insertNewRepositorySet(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.RepositorySetDocument.RepositorySet remove(int i)
                {
                    de.zib.museum.museumdat.RepositorySetDocument.RepositorySet old = RepositoryWrapImpl.this.getRepositorySetArray(i);
                    RepositoryWrapImpl.this.removeRepositorySet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RepositoryWrapImpl.this.sizeOfRepositorySetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RepositorySetList();
            }
        }
        
        /**
         * Gets array of all "repositorySet" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.RepositorySetDocument.RepositorySet[] getRepositorySetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.RepositorySetDocument.RepositorySet> targetList = new java.util.ArrayList<de.zib.museum.museumdat.RepositorySetDocument.RepositorySet>();
                get_store().find_all_element_users(REPOSITORYSET$0, targetList);
                de.zib.museum.museumdat.RepositorySetDocument.RepositorySet[] result = new de.zib.museum.museumdat.RepositorySetDocument.RepositorySet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "repositorySet" element
         */
        public de.zib.museum.museumdat.RepositorySetDocument.RepositorySet getRepositorySetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RepositorySetDocument.RepositorySet target = null;
                target = (de.zib.museum.museumdat.RepositorySetDocument.RepositorySet)get_store().find_element_user(REPOSITORYSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "repositorySet" element
         */
        public int sizeOfRepositorySetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPOSITORYSET$0);
            }
        }
        
        /**
         * Sets array of all "repositorySet" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setRepositorySetArray(de.zib.museum.museumdat.RepositorySetDocument.RepositorySet[] repositorySetArray)
        {
            check_orphaned();
            arraySetterHelper(repositorySetArray, REPOSITORYSET$0);
        }
        
        /**
         * Sets ith "repositorySet" element
         */
        @Inject(optional=true) public void setRepositorySetArray(int i, de.zib.museum.museumdat.RepositorySetDocument.RepositorySet repositorySet)
        {
            generatedSetterHelperImpl(repositorySet, REPOSITORYSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "repositorySet" element
         */
        public de.zib.museum.museumdat.RepositorySetDocument.RepositorySet insertNewRepositorySet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RepositorySetDocument.RepositorySet target = null;
                target = (de.zib.museum.museumdat.RepositorySetDocument.RepositorySet)get_store().insert_element_user(REPOSITORYSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "repositorySet" element
         */
        public de.zib.museum.museumdat.RepositorySetDocument.RepositorySet addNewRepositorySet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RepositorySetDocument.RepositorySet target = null;
                target = (de.zib.museum.museumdat.RepositorySetDocument.RepositorySet)get_store().add_element_user(REPOSITORYSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "repositorySet" element
         */
        public void removeRepositorySet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPOSITORYSET$0, i);
            }
        }
    }
}
