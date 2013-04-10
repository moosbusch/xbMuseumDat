/*
 * An XML document type.
 * Localname: nameActorSet
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.NameActorSetDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one nameActorSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class NameActorSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.NameActorSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public NameActorSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMEACTORSET$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "nameActorSet");
    
    
    /**
     * Gets the "nameActorSet" element
     */
    public de.zib.museum.museumdat.NameActorSetDocument.NameActorSet getNameActorSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.NameActorSetDocument.NameActorSet target = null;
            target = (de.zib.museum.museumdat.NameActorSetDocument.NameActorSet)get_store().find_element_user(NAMEACTORSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nameActorSet" element
     */
    @Inject(optional=true) public void setNameActorSet(de.zib.museum.museumdat.NameActorSetDocument.NameActorSet nameActorSet)
    {
        generatedSetterHelperImpl(nameActorSet, NAMEACTORSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "nameActorSet" element
     */
    public de.zib.museum.museumdat.NameActorSetDocument.NameActorSet addNewNameActorSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.NameActorSetDocument.NameActorSet target = null;
            target = (de.zib.museum.museumdat.NameActorSetDocument.NameActorSet)get_store().add_element_user(NAMEACTORSET$0);
            return target;
        }
    }
    /**
     * An XML nameActorSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class NameActorSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.NameActorSetDocument.NameActorSet
    {
        private static final long serialVersionUID = 1L;
        
        public NameActorSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAMEACTOR$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "nameActor");
        private static final javax.xml.namespace.QName SOURCENAMEACTOR$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "sourceNameActor");
        
        
        /**
         * Gets the "nameActor" element
         */
        public de.zib.museum.museumdat.NameActorDocument.NameActor getNameActor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.NameActorDocument.NameActor target = null;
                target = (de.zib.museum.museumdat.NameActorDocument.NameActor)get_store().find_element_user(NAMEACTOR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "nameActor" element
         */
        @Inject(optional=true) public void setNameActor(de.zib.museum.museumdat.NameActorDocument.NameActor nameActor)
        {
            generatedSetterHelperImpl(nameActor, NAMEACTOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "nameActor" element
         */
        public de.zib.museum.museumdat.NameActorDocument.NameActor addNewNameActor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.NameActorDocument.NameActor target = null;
                target = (de.zib.museum.museumdat.NameActorDocument.NameActor)get_store().add_element_user(NAMEACTOR$0);
                return target;
            }
        }
        
        /**
         * Gets a List of "sourceNameActor" elements
         */
        public java.util.List<de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor> getSourceNameActorList()
        {
            final class SourceNameActorList extends java.util.AbstractList<de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor>
            {
                @Override
                public de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor get(int i)
                    { return NameActorSetImpl.this.getSourceNameActorArray(i); }
                
                @Override
                public de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor set(int i, de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor o)
                {
                    de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor old = NameActorSetImpl.this.getSourceNameActorArray(i);
                    NameActorSetImpl.this.setSourceNameActorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor o)
                    { NameActorSetImpl.this.insertNewSourceNameActor(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor remove(int i)
                {
                    de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor old = NameActorSetImpl.this.getSourceNameActorArray(i);
                    NameActorSetImpl.this.removeSourceNameActor(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return NameActorSetImpl.this.sizeOfSourceNameActorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SourceNameActorList();
            }
        }
        
        /**
         * Gets array of all "sourceNameActor" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor[] getSourceNameActorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor> targetList = new java.util.ArrayList<de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor>();
                get_store().find_all_element_users(SOURCENAMEACTOR$2, targetList);
                de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor[] result = new de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "sourceNameActor" element
         */
        public de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor getSourceNameActorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor target = null;
                target = (de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor)get_store().find_element_user(SOURCENAMEACTOR$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "sourceNameActor" element
         */
        public int sizeOfSourceNameActorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCENAMEACTOR$2);
            }
        }
        
        /**
         * Sets array of all "sourceNameActor" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setSourceNameActorArray(de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor[] sourceNameActorArray)
        {
            check_orphaned();
            arraySetterHelper(sourceNameActorArray, SOURCENAMEACTOR$2);
        }
        
        /**
         * Sets ith "sourceNameActor" element
         */
        @Inject(optional=true) public void setSourceNameActorArray(int i, de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor sourceNameActor)
        {
            generatedSetterHelperImpl(sourceNameActor, SOURCENAMEACTOR$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceNameActor" element
         */
        public de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor insertNewSourceNameActor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor target = null;
                target = (de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor)get_store().insert_element_user(SOURCENAMEACTOR$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceNameActor" element
         */
        public de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor addNewSourceNameActor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor target = null;
                target = (de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor)get_store().add_element_user(SOURCENAMEACTOR$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "sourceNameActor" element
         */
        public void removeSourceNameActor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCENAMEACTOR$2, i);
            }
        }
    }
}
