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
 * A document containing one repositorySet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class RepositorySetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.RepositorySetDocument
{
    private static final long serialVersionUID = 1L;
    
    public RepositorySetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPOSITORYSET$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "repositorySet");
    
    
    /**
     * Gets the "repositorySet" element
     */
    public de.zib.museum.museumdat.RepositorySetDocument.RepositorySet getRepositorySet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.RepositorySetDocument.RepositorySet target = null;
            target = (de.zib.museum.museumdat.RepositorySetDocument.RepositorySet)get_store().find_element_user(REPOSITORYSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "repositorySet" element
     */
    public void setRepositorySet(de.zib.museum.museumdat.RepositorySetDocument.RepositorySet repositorySet)
    {
        generatedSetterHelperImpl(repositorySet, REPOSITORYSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "repositorySet" element
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
     * An XML repositorySet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class RepositorySetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.RepositorySetDocument.RepositorySet
    {
        private static final long serialVersionUID = 1L;
        
        public RepositorySetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REPOSITORYNAME$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "repositoryName");
        private static final javax.xml.namespace.QName WORKID$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "workID");
        private static final javax.xml.namespace.QName REPOSITORYLOCATIONNAME$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "repositoryLocationName");
        private static final javax.xml.namespace.QName TYPE$6 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "type");
        
        
        /**
         * Gets the "repositoryName" element
         */
        public de.zib.museum.museumdat.RepositoryNameDocument.RepositoryName getRepositoryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RepositoryNameDocument.RepositoryName target = null;
                target = (de.zib.museum.museumdat.RepositoryNameDocument.RepositoryName)get_store().find_element_user(REPOSITORYNAME$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "repositoryName" element
         */
        public boolean isSetRepositoryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPOSITORYNAME$0) != 0;
            }
        }
        
        /**
         * Sets the "repositoryName" element
         */
        public void setRepositoryName(de.zib.museum.museumdat.RepositoryNameDocument.RepositoryName repositoryName)
        {
            generatedSetterHelperImpl(repositoryName, REPOSITORYNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "repositoryName" element
         */
        public de.zib.museum.museumdat.RepositoryNameDocument.RepositoryName addNewRepositoryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RepositoryNameDocument.RepositoryName target = null;
                target = (de.zib.museum.museumdat.RepositoryNameDocument.RepositoryName)get_store().add_element_user(REPOSITORYNAME$0);
                return target;
            }
        }
        
        /**
         * Unsets the "repositoryName" element
         */
        public void unsetRepositoryName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPOSITORYNAME$0, 0);
            }
        }
        
        /**
         * Gets a List of "workID" elements
         */
        public java.util.List<de.zib.museum.museumdat.WorkIDDocument.WorkID> getWorkIDList()
        {
            final class WorkIDList extends java.util.AbstractList<de.zib.museum.museumdat.WorkIDDocument.WorkID>
            {
                @Override
                public de.zib.museum.museumdat.WorkIDDocument.WorkID get(int i)
                    { return RepositorySetImpl.this.getWorkIDArray(i); }
                
                @Override
                public de.zib.museum.museumdat.WorkIDDocument.WorkID set(int i, de.zib.museum.museumdat.WorkIDDocument.WorkID o)
                {
                    de.zib.museum.museumdat.WorkIDDocument.WorkID old = RepositorySetImpl.this.getWorkIDArray(i);
                    RepositorySetImpl.this.setWorkIDArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.WorkIDDocument.WorkID o)
                    { RepositorySetImpl.this.insertNewWorkID(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.WorkIDDocument.WorkID remove(int i)
                {
                    de.zib.museum.museumdat.WorkIDDocument.WorkID old = RepositorySetImpl.this.getWorkIDArray(i);
                    RepositorySetImpl.this.removeWorkID(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RepositorySetImpl.this.sizeOfWorkIDArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new WorkIDList();
            }
        }
        
        /**
         * Gets array of all "workID" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.WorkIDDocument.WorkID[] getWorkIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.WorkIDDocument.WorkID> targetList = new java.util.ArrayList<de.zib.museum.museumdat.WorkIDDocument.WorkID>();
                get_store().find_all_element_users(WORKID$2, targetList);
                de.zib.museum.museumdat.WorkIDDocument.WorkID[] result = new de.zib.museum.museumdat.WorkIDDocument.WorkID[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "workID" element
         */
        public de.zib.museum.museumdat.WorkIDDocument.WorkID getWorkIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.WorkIDDocument.WorkID target = null;
                target = (de.zib.museum.museumdat.WorkIDDocument.WorkID)get_store().find_element_user(WORKID$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "workID" element
         */
        public int sizeOfWorkIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(WORKID$2);
            }
        }
        
        /**
         * Sets array of all "workID" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setWorkIDArray(de.zib.museum.museumdat.WorkIDDocument.WorkID[] workIDArray)
        {
            check_orphaned();
            arraySetterHelper(workIDArray, WORKID$2);
        }
        
        /**
         * Sets ith "workID" element
         */
        public void setWorkIDArray(int i, de.zib.museum.museumdat.WorkIDDocument.WorkID workID)
        {
            generatedSetterHelperImpl(workID, WORKID$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "workID" element
         */
        public de.zib.museum.museumdat.WorkIDDocument.WorkID insertNewWorkID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.WorkIDDocument.WorkID target = null;
                target = (de.zib.museum.museumdat.WorkIDDocument.WorkID)get_store().insert_element_user(WORKID$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "workID" element
         */
        public de.zib.museum.museumdat.WorkIDDocument.WorkID addNewWorkID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.WorkIDDocument.WorkID target = null;
                target = (de.zib.museum.museumdat.WorkIDDocument.WorkID)get_store().add_element_user(WORKID$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "workID" element
         */
        public void removeWorkID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(WORKID$2, i);
            }
        }
        
        /**
         * Gets the "repositoryLocationName" element
         */
        public de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName getRepositoryLocationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName target = null;
                target = (de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName)get_store().find_element_user(REPOSITORYLOCATIONNAME$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "repositoryLocationName" element
         */
        public boolean isSetRepositoryLocationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REPOSITORYLOCATIONNAME$4) != 0;
            }
        }
        
        /**
         * Sets the "repositoryLocationName" element
         */
        public void setRepositoryLocationName(de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName repositoryLocationName)
        {
            generatedSetterHelperImpl(repositoryLocationName, REPOSITORYLOCATIONNAME$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "repositoryLocationName" element
         */
        public de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName addNewRepositoryLocationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName target = null;
                target = (de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName)get_store().add_element_user(REPOSITORYLOCATIONNAME$4);
                return target;
            }
        }
        
        /**
         * Unsets the "repositoryLocationName" element
         */
        public void unsetRepositoryLocationName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REPOSITORYLOCATIONNAME$4, 0);
            }
        }
        
        /**
         * Gets the "type" attribute
         */
        public de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type.Enum getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    return null;
                }
                return (de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" attribute
         */
        public de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type target = null;
                target = (de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type)get_store().find_attribute_user(TYPE$6);
                return target;
            }
        }
        
        /**
         * True if has "type" attribute
         */
        public boolean isSetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(TYPE$6) != null;
            }
        }
        
        /**
         * Sets the "type" attribute
         */
        public void setType(de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" attribute
         */
        public void xsetType(de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type target = null;
                target = (de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type)get_store().find_attribute_user(TYPE$6);
                if (target == null)
                {
                    target = (de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type)get_store().add_attribute_user(TYPE$6);
                }
                target.set(type);
            }
        }
        
        /**
         * Unsets the "type" attribute
         */
        public void unsetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(TYPE$6);
            }
        }
        /**
         * An XML type(@http://museum.zib.de/museumdat).
         *
         * This is an atomic type that is a restriction of de.zib.museum.museumdat.RepositorySetDocument$RepositorySet$Type.
         */
        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type
        {
            private static final long serialVersionUID = 1L;
            
            public TypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
