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
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one resourceSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class ResourceSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.ResourceSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResourceSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESOURCESET$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "resourceSet");
    
    
    /**
     * Gets the "resourceSet" element
     */
    public de.zib.museum.museumdat.ResourceSetDocument.ResourceSet getResourceSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.ResourceSetDocument.ResourceSet target = null;
            target = (de.zib.museum.museumdat.ResourceSetDocument.ResourceSet)get_store().find_element_user(RESOURCESET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resourceSet" element
     */
    @Inject(optional=true) public void setResourceSet(de.zib.museum.museumdat.ResourceSetDocument.ResourceSet resourceSet)
    {
        generatedSetterHelperImpl(resourceSet, RESOURCESET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resourceSet" element
     */
    public de.zib.museum.museumdat.ResourceSetDocument.ResourceSet addNewResourceSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.ResourceSetDocument.ResourceSet target = null;
            target = (de.zib.museum.museumdat.ResourceSetDocument.ResourceSet)get_store().add_element_user(RESOURCESET$0);
            return target;
        }
    }
    /**
     * An XML resourceSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class ResourceSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.ResourceSetDocument.ResourceSet
    {
        private static final long serialVersionUID = 1L;
        
        public ResourceSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LINKRESOURCE$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "linkResource");
        private static final javax.xml.namespace.QName RESOURCEID$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "resourceID");
        private static final javax.xml.namespace.QName RESOURCERELTYPE$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "resourceRelType");
        private static final javax.xml.namespace.QName RESOURCETYPE$6 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "resourceType");
        private static final javax.xml.namespace.QName RIGHTSRESOURCE$8 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "rightsResource");
        private static final javax.xml.namespace.QName RESOURCEVIEWDESCRIPTION$10 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "resourceViewDescription");
        private static final javax.xml.namespace.QName RESOURCEVIEWTYPE$12 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "resourceViewType");
        private static final javax.xml.namespace.QName RESOURCEVIEWSUBJECTTERM$14 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "resourceViewSubjectTerm");
        private static final javax.xml.namespace.QName RESOURCEVIEWDATE$16 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "resourceViewDate");
        private static final javax.xml.namespace.QName RESOURCESOURCE$18 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "resourceSource");
        private static final javax.xml.namespace.QName LINKRELATEDRESOURCE$20 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "linkRelatedResource");
        private static final javax.xml.namespace.QName RESOURCEMETADATALOC$22 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "resourceMetadataLoc");
        
        
        /**
         * Gets the "linkResource" element
         */
        public de.zib.museum.museumdat.LinkResourceDocument.LinkResource getLinkResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LinkResourceDocument.LinkResource target = null;
                target = (de.zib.museum.museumdat.LinkResourceDocument.LinkResource)get_store().find_element_user(LINKRESOURCE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "linkResource" element
         */
        public boolean isSetLinkResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINKRESOURCE$0) != 0;
            }
        }
        
        /**
         * Sets the "linkResource" element
         */
        @Inject(optional=true) public void setLinkResource(de.zib.museum.museumdat.LinkResourceDocument.LinkResource linkResource)
        {
            generatedSetterHelperImpl(linkResource, LINKRESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "linkResource" element
         */
        public de.zib.museum.museumdat.LinkResourceDocument.LinkResource addNewLinkResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LinkResourceDocument.LinkResource target = null;
                target = (de.zib.museum.museumdat.LinkResourceDocument.LinkResource)get_store().add_element_user(LINKRESOURCE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "linkResource" element
         */
        public void unsetLinkResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINKRESOURCE$0, 0);
            }
        }
        
        /**
         * Gets the "resourceID" element
         */
        public de.zib.museum.museumdat.ResourceIDDocument.ResourceID getResourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceIDDocument.ResourceID target = null;
                target = (de.zib.museum.museumdat.ResourceIDDocument.ResourceID)get_store().find_element_user(RESOURCEID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "resourceID" element
         */
        public boolean isSetResourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCEID$2) != 0;
            }
        }
        
        /**
         * Sets the "resourceID" element
         */
        @Inject(optional=true) public void setResourceID(de.zib.museum.museumdat.ResourceIDDocument.ResourceID resourceID)
        {
            generatedSetterHelperImpl(resourceID, RESOURCEID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "resourceID" element
         */
        public de.zib.museum.museumdat.ResourceIDDocument.ResourceID addNewResourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceIDDocument.ResourceID target = null;
                target = (de.zib.museum.museumdat.ResourceIDDocument.ResourceID)get_store().add_element_user(RESOURCEID$2);
                return target;
            }
        }
        
        /**
         * Unsets the "resourceID" element
         */
        public void unsetResourceID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCEID$2, 0);
            }
        }
        
        /**
         * Gets a List of "resourceRelType" elements
         */
        public java.util.List<de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType> getResourceRelTypeList()
        {
            final class ResourceRelTypeList extends java.util.AbstractList<de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType>
            {
                @Override
                public de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType get(int i)
                    { return ResourceSetImpl.this.getResourceRelTypeArray(i); }
                
                @Override
                public de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType set(int i, de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType o)
                {
                    de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType old = ResourceSetImpl.this.getResourceRelTypeArray(i);
                    ResourceSetImpl.this.setResourceRelTypeArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType o)
                    { ResourceSetImpl.this.insertNewResourceRelType(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType remove(int i)
                {
                    de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType old = ResourceSetImpl.this.getResourceRelTypeArray(i);
                    ResourceSetImpl.this.removeResourceRelType(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceSetImpl.this.sizeOfResourceRelTypeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResourceRelTypeList();
            }
        }
        
        /**
         * Gets array of all "resourceRelType" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType[] getResourceRelTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType> targetList = new java.util.ArrayList<de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType>();
                get_store().find_all_element_users(RESOURCERELTYPE$4, targetList);
                de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType[] result = new de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resourceRelType" element
         */
        public de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType getResourceRelTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType target = null;
                target = (de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType)get_store().find_element_user(RESOURCERELTYPE$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resourceRelType" element
         */
        public int sizeOfResourceRelTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCERELTYPE$4);
            }
        }
        
        /**
         * Sets array of all "resourceRelType" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setResourceRelTypeArray(de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType[] resourceRelTypeArray)
        {
            check_orphaned();
            arraySetterHelper(resourceRelTypeArray, RESOURCERELTYPE$4);
        }
        
        /**
         * Sets ith "resourceRelType" element
         */
        @Inject(optional=true) public void setResourceRelTypeArray(int i, de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType resourceRelType)
        {
            generatedSetterHelperImpl(resourceRelType, RESOURCERELTYPE$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceRelType" element
         */
        public de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType insertNewResourceRelType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType target = null;
                target = (de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType)get_store().insert_element_user(RESOURCERELTYPE$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceRelType" element
         */
        public de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType addNewResourceRelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType target = null;
                target = (de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType)get_store().add_element_user(RESOURCERELTYPE$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "resourceRelType" element
         */
        public void removeResourceRelType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCERELTYPE$4, i);
            }
        }
        
        /**
         * Gets a List of "resourceType" elements
         */
        public java.util.List<de.zib.museum.museumdat.ResourceTypeDocument.ResourceType> getResourceTypeList()
        {
            final class ResourceTypeList extends java.util.AbstractList<de.zib.museum.museumdat.ResourceTypeDocument.ResourceType>
            {
                @Override
                public de.zib.museum.museumdat.ResourceTypeDocument.ResourceType get(int i)
                    { return ResourceSetImpl.this.getResourceTypeArray(i); }
                
                @Override
                public de.zib.museum.museumdat.ResourceTypeDocument.ResourceType set(int i, de.zib.museum.museumdat.ResourceTypeDocument.ResourceType o)
                {
                    de.zib.museum.museumdat.ResourceTypeDocument.ResourceType old = ResourceSetImpl.this.getResourceTypeArray(i);
                    ResourceSetImpl.this.setResourceTypeArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.ResourceTypeDocument.ResourceType o)
                    { ResourceSetImpl.this.insertNewResourceType(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.ResourceTypeDocument.ResourceType remove(int i)
                {
                    de.zib.museum.museumdat.ResourceTypeDocument.ResourceType old = ResourceSetImpl.this.getResourceTypeArray(i);
                    ResourceSetImpl.this.removeResourceType(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceSetImpl.this.sizeOfResourceTypeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResourceTypeList();
            }
        }
        
        /**
         * Gets array of all "resourceType" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.ResourceTypeDocument.ResourceType[] getResourceTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.ResourceTypeDocument.ResourceType> targetList = new java.util.ArrayList<de.zib.museum.museumdat.ResourceTypeDocument.ResourceType>();
                get_store().find_all_element_users(RESOURCETYPE$6, targetList);
                de.zib.museum.museumdat.ResourceTypeDocument.ResourceType[] result = new de.zib.museum.museumdat.ResourceTypeDocument.ResourceType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resourceType" element
         */
        public de.zib.museum.museumdat.ResourceTypeDocument.ResourceType getResourceTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceTypeDocument.ResourceType target = null;
                target = (de.zib.museum.museumdat.ResourceTypeDocument.ResourceType)get_store().find_element_user(RESOURCETYPE$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resourceType" element
         */
        public int sizeOfResourceTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCETYPE$6);
            }
        }
        
        /**
         * Sets array of all "resourceType" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setResourceTypeArray(de.zib.museum.museumdat.ResourceTypeDocument.ResourceType[] resourceTypeArray)
        {
            check_orphaned();
            arraySetterHelper(resourceTypeArray, RESOURCETYPE$6);
        }
        
        /**
         * Sets ith "resourceType" element
         */
        @Inject(optional=true) public void setResourceTypeArray(int i, de.zib.museum.museumdat.ResourceTypeDocument.ResourceType resourceType)
        {
            generatedSetterHelperImpl(resourceType, RESOURCETYPE$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceType" element
         */
        public de.zib.museum.museumdat.ResourceTypeDocument.ResourceType insertNewResourceType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceTypeDocument.ResourceType target = null;
                target = (de.zib.museum.museumdat.ResourceTypeDocument.ResourceType)get_store().insert_element_user(RESOURCETYPE$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceType" element
         */
        public de.zib.museum.museumdat.ResourceTypeDocument.ResourceType addNewResourceType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceTypeDocument.ResourceType target = null;
                target = (de.zib.museum.museumdat.ResourceTypeDocument.ResourceType)get_store().add_element_user(RESOURCETYPE$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "resourceType" element
         */
        public void removeResourceType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCETYPE$6, i);
            }
        }
        
        /**
         * Gets a List of "rightsResource" elements
         */
        public java.util.List<de.zib.museum.museumdat.RightsResourceDocument.RightsResource> getRightsResourceList()
        {
            final class RightsResourceList extends java.util.AbstractList<de.zib.museum.museumdat.RightsResourceDocument.RightsResource>
            {
                @Override
                public de.zib.museum.museumdat.RightsResourceDocument.RightsResource get(int i)
                    { return ResourceSetImpl.this.getRightsResourceArray(i); }
                
                @Override
                public de.zib.museum.museumdat.RightsResourceDocument.RightsResource set(int i, de.zib.museum.museumdat.RightsResourceDocument.RightsResource o)
                {
                    de.zib.museum.museumdat.RightsResourceDocument.RightsResource old = ResourceSetImpl.this.getRightsResourceArray(i);
                    ResourceSetImpl.this.setRightsResourceArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.RightsResourceDocument.RightsResource o)
                    { ResourceSetImpl.this.insertNewRightsResource(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.RightsResourceDocument.RightsResource remove(int i)
                {
                    de.zib.museum.museumdat.RightsResourceDocument.RightsResource old = ResourceSetImpl.this.getRightsResourceArray(i);
                    ResourceSetImpl.this.removeRightsResource(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceSetImpl.this.sizeOfRightsResourceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RightsResourceList();
            }
        }
        
        /**
         * Gets array of all "rightsResource" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.RightsResourceDocument.RightsResource[] getRightsResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.RightsResourceDocument.RightsResource> targetList = new java.util.ArrayList<de.zib.museum.museumdat.RightsResourceDocument.RightsResource>();
                get_store().find_all_element_users(RIGHTSRESOURCE$8, targetList);
                de.zib.museum.museumdat.RightsResourceDocument.RightsResource[] result = new de.zib.museum.museumdat.RightsResourceDocument.RightsResource[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "rightsResource" element
         */
        public de.zib.museum.museumdat.RightsResourceDocument.RightsResource getRightsResourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RightsResourceDocument.RightsResource target = null;
                target = (de.zib.museum.museumdat.RightsResourceDocument.RightsResource)get_store().find_element_user(RIGHTSRESOURCE$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "rightsResource" element
         */
        public int sizeOfRightsResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RIGHTSRESOURCE$8);
            }
        }
        
        /**
         * Sets array of all "rightsResource" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setRightsResourceArray(de.zib.museum.museumdat.RightsResourceDocument.RightsResource[] rightsResourceArray)
        {
            check_orphaned();
            arraySetterHelper(rightsResourceArray, RIGHTSRESOURCE$8);
        }
        
        /**
         * Sets ith "rightsResource" element
         */
        @Inject(optional=true) public void setRightsResourceArray(int i, de.zib.museum.museumdat.RightsResourceDocument.RightsResource rightsResource)
        {
            generatedSetterHelperImpl(rightsResource, RIGHTSRESOURCE$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "rightsResource" element
         */
        public de.zib.museum.museumdat.RightsResourceDocument.RightsResource insertNewRightsResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RightsResourceDocument.RightsResource target = null;
                target = (de.zib.museum.museumdat.RightsResourceDocument.RightsResource)get_store().insert_element_user(RIGHTSRESOURCE$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "rightsResource" element
         */
        public de.zib.museum.museumdat.RightsResourceDocument.RightsResource addNewRightsResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RightsResourceDocument.RightsResource target = null;
                target = (de.zib.museum.museumdat.RightsResourceDocument.RightsResource)get_store().add_element_user(RIGHTSRESOURCE$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "rightsResource" element
         */
        public void removeRightsResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RIGHTSRESOURCE$8, i);
            }
        }
        
        /**
         * Gets the "resourceViewDescription" element
         */
        public de.zib.museum.museumdat.ResourceViewDescriptionDocument.ResourceViewDescription getResourceViewDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceViewDescriptionDocument.ResourceViewDescription target = null;
                target = (de.zib.museum.museumdat.ResourceViewDescriptionDocument.ResourceViewDescription)get_store().find_element_user(RESOURCEVIEWDESCRIPTION$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "resourceViewDescription" element
         */
        public boolean isSetResourceViewDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCEVIEWDESCRIPTION$10) != 0;
            }
        }
        
        /**
         * Sets the "resourceViewDescription" element
         */
        @Inject(optional=true) public void setResourceViewDescription(de.zib.museum.museumdat.ResourceViewDescriptionDocument.ResourceViewDescription resourceViewDescription)
        {
            generatedSetterHelperImpl(resourceViewDescription, RESOURCEVIEWDESCRIPTION$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "resourceViewDescription" element
         */
        public de.zib.museum.museumdat.ResourceViewDescriptionDocument.ResourceViewDescription addNewResourceViewDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceViewDescriptionDocument.ResourceViewDescription target = null;
                target = (de.zib.museum.museumdat.ResourceViewDescriptionDocument.ResourceViewDescription)get_store().add_element_user(RESOURCEVIEWDESCRIPTION$10);
                return target;
            }
        }
        
        /**
         * Unsets the "resourceViewDescription" element
         */
        public void unsetResourceViewDescription()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCEVIEWDESCRIPTION$10, 0);
            }
        }
        
        /**
         * Gets a List of "resourceViewType" elements
         */
        public java.util.List<de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType> getResourceViewTypeList()
        {
            final class ResourceViewTypeList extends java.util.AbstractList<de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType>
            {
                @Override
                public de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType get(int i)
                    { return ResourceSetImpl.this.getResourceViewTypeArray(i); }
                
                @Override
                public de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType set(int i, de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType o)
                {
                    de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType old = ResourceSetImpl.this.getResourceViewTypeArray(i);
                    ResourceSetImpl.this.setResourceViewTypeArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType o)
                    { ResourceSetImpl.this.insertNewResourceViewType(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType remove(int i)
                {
                    de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType old = ResourceSetImpl.this.getResourceViewTypeArray(i);
                    ResourceSetImpl.this.removeResourceViewType(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceSetImpl.this.sizeOfResourceViewTypeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResourceViewTypeList();
            }
        }
        
        /**
         * Gets array of all "resourceViewType" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType[] getResourceViewTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType> targetList = new java.util.ArrayList<de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType>();
                get_store().find_all_element_users(RESOURCEVIEWTYPE$12, targetList);
                de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType[] result = new de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resourceViewType" element
         */
        public de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType getResourceViewTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType target = null;
                target = (de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType)get_store().find_element_user(RESOURCEVIEWTYPE$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resourceViewType" element
         */
        public int sizeOfResourceViewTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCEVIEWTYPE$12);
            }
        }
        
        /**
         * Sets array of all "resourceViewType" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setResourceViewTypeArray(de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType[] resourceViewTypeArray)
        {
            check_orphaned();
            arraySetterHelper(resourceViewTypeArray, RESOURCEVIEWTYPE$12);
        }
        
        /**
         * Sets ith "resourceViewType" element
         */
        @Inject(optional=true) public void setResourceViewTypeArray(int i, de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType resourceViewType)
        {
            generatedSetterHelperImpl(resourceViewType, RESOURCEVIEWTYPE$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceViewType" element
         */
        public de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType insertNewResourceViewType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType target = null;
                target = (de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType)get_store().insert_element_user(RESOURCEVIEWTYPE$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceViewType" element
         */
        public de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType addNewResourceViewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType target = null;
                target = (de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType)get_store().add_element_user(RESOURCEVIEWTYPE$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "resourceViewType" element
         */
        public void removeResourceViewType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCEVIEWTYPE$12, i);
            }
        }
        
        /**
         * Gets a List of "resourceViewSubjectTerm" elements
         */
        public java.util.List<de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm> getResourceViewSubjectTermList()
        {
            final class ResourceViewSubjectTermList extends java.util.AbstractList<de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm>
            {
                @Override
                public de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm get(int i)
                    { return ResourceSetImpl.this.getResourceViewSubjectTermArray(i); }
                
                @Override
                public de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm set(int i, de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm o)
                {
                    de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm old = ResourceSetImpl.this.getResourceViewSubjectTermArray(i);
                    ResourceSetImpl.this.setResourceViewSubjectTermArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm o)
                    { ResourceSetImpl.this.insertNewResourceViewSubjectTerm(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm remove(int i)
                {
                    de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm old = ResourceSetImpl.this.getResourceViewSubjectTermArray(i);
                    ResourceSetImpl.this.removeResourceViewSubjectTerm(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceSetImpl.this.sizeOfResourceViewSubjectTermArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResourceViewSubjectTermList();
            }
        }
        
        /**
         * Gets array of all "resourceViewSubjectTerm" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm[] getResourceViewSubjectTermArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm> targetList = new java.util.ArrayList<de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm>();
                get_store().find_all_element_users(RESOURCEVIEWSUBJECTTERM$14, targetList);
                de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm[] result = new de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resourceViewSubjectTerm" element
         */
        public de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm getResourceViewSubjectTermArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm target = null;
                target = (de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm)get_store().find_element_user(RESOURCEVIEWSUBJECTTERM$14, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resourceViewSubjectTerm" element
         */
        public int sizeOfResourceViewSubjectTermArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCEVIEWSUBJECTTERM$14);
            }
        }
        
        /**
         * Sets array of all "resourceViewSubjectTerm" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setResourceViewSubjectTermArray(de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm[] resourceViewSubjectTermArray)
        {
            check_orphaned();
            arraySetterHelper(resourceViewSubjectTermArray, RESOURCEVIEWSUBJECTTERM$14);
        }
        
        /**
         * Sets ith "resourceViewSubjectTerm" element
         */
        @Inject(optional=true) public void setResourceViewSubjectTermArray(int i, de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm resourceViewSubjectTerm)
        {
            generatedSetterHelperImpl(resourceViewSubjectTerm, RESOURCEVIEWSUBJECTTERM$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceViewSubjectTerm" element
         */
        public de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm insertNewResourceViewSubjectTerm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm target = null;
                target = (de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm)get_store().insert_element_user(RESOURCEVIEWSUBJECTTERM$14, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceViewSubjectTerm" element
         */
        public de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm addNewResourceViewSubjectTerm()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm target = null;
                target = (de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm)get_store().add_element_user(RESOURCEVIEWSUBJECTTERM$14);
                return target;
            }
        }
        
        /**
         * Removes the ith "resourceViewSubjectTerm" element
         */
        public void removeResourceViewSubjectTerm(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCEVIEWSUBJECTTERM$14, i);
            }
        }
        
        /**
         * Gets the "resourceViewDate" element
         */
        public de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate getResourceViewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate target = null;
                target = (de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate)get_store().find_element_user(RESOURCEVIEWDATE$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "resourceViewDate" element
         */
        public boolean isSetResourceViewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCEVIEWDATE$16) != 0;
            }
        }
        
        /**
         * Sets the "resourceViewDate" element
         */
        @Inject(optional=true) public void setResourceViewDate(de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate resourceViewDate)
        {
            generatedSetterHelperImpl(resourceViewDate, RESOURCEVIEWDATE$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "resourceViewDate" element
         */
        public de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate addNewResourceViewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate target = null;
                target = (de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate)get_store().add_element_user(RESOURCEVIEWDATE$16);
                return target;
            }
        }
        
        /**
         * Unsets the "resourceViewDate" element
         */
        public void unsetResourceViewDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCEVIEWDATE$16, 0);
            }
        }
        
        /**
         * Gets a List of "resourceSource" elements
         */
        public java.util.List<de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource> getResourceSourceList()
        {
            final class ResourceSourceList extends java.util.AbstractList<de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource>
            {
                @Override
                public de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource get(int i)
                    { return ResourceSetImpl.this.getResourceSourceArray(i); }
                
                @Override
                public de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource set(int i, de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource o)
                {
                    de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource old = ResourceSetImpl.this.getResourceSourceArray(i);
                    ResourceSetImpl.this.setResourceSourceArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource o)
                    { ResourceSetImpl.this.insertNewResourceSource(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource remove(int i)
                {
                    de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource old = ResourceSetImpl.this.getResourceSourceArray(i);
                    ResourceSetImpl.this.removeResourceSource(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceSetImpl.this.sizeOfResourceSourceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResourceSourceList();
            }
        }
        
        /**
         * Gets array of all "resourceSource" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource[] getResourceSourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource> targetList = new java.util.ArrayList<de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource>();
                get_store().find_all_element_users(RESOURCESOURCE$18, targetList);
                de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource[] result = new de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resourceSource" element
         */
        public de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource getResourceSourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource target = null;
                target = (de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource)get_store().find_element_user(RESOURCESOURCE$18, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resourceSource" element
         */
        public int sizeOfResourceSourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCESOURCE$18);
            }
        }
        
        /**
         * Sets array of all "resourceSource" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setResourceSourceArray(de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource[] resourceSourceArray)
        {
            check_orphaned();
            arraySetterHelper(resourceSourceArray, RESOURCESOURCE$18);
        }
        
        /**
         * Sets ith "resourceSource" element
         */
        @Inject(optional=true) public void setResourceSourceArray(int i, de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource resourceSource)
        {
            generatedSetterHelperImpl(resourceSource, RESOURCESOURCE$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceSource" element
         */
        public de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource insertNewResourceSource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource target = null;
                target = (de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource)get_store().insert_element_user(RESOURCESOURCE$18, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceSource" element
         */
        public de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource addNewResourceSource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource target = null;
                target = (de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource)get_store().add_element_user(RESOURCESOURCE$18);
                return target;
            }
        }
        
        /**
         * Removes the ith "resourceSource" element
         */
        public void removeResourceSource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCESOURCE$18, i);
            }
        }
        
        /**
         * Gets a List of "linkRelatedResource" elements
         */
        public java.util.List<de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource> getLinkRelatedResourceList()
        {
            final class LinkRelatedResourceList extends java.util.AbstractList<de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource>
            {
                @Override
                public de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource get(int i)
                    { return ResourceSetImpl.this.getLinkRelatedResourceArray(i); }
                
                @Override
                public de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource set(int i, de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource o)
                {
                    de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource old = ResourceSetImpl.this.getLinkRelatedResourceArray(i);
                    ResourceSetImpl.this.setLinkRelatedResourceArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource o)
                    { ResourceSetImpl.this.insertNewLinkRelatedResource(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource remove(int i)
                {
                    de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource old = ResourceSetImpl.this.getLinkRelatedResourceArray(i);
                    ResourceSetImpl.this.removeLinkRelatedResource(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceSetImpl.this.sizeOfLinkRelatedResourceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LinkRelatedResourceList();
            }
        }
        
        /**
         * Gets array of all "linkRelatedResource" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource[] getLinkRelatedResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource> targetList = new java.util.ArrayList<de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource>();
                get_store().find_all_element_users(LINKRELATEDRESOURCE$20, targetList);
                de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource[] result = new de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "linkRelatedResource" element
         */
        public de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource getLinkRelatedResourceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource target = null;
                target = (de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource)get_store().find_element_user(LINKRELATEDRESOURCE$20, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "linkRelatedResource" element
         */
        public int sizeOfLinkRelatedResourceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINKRELATEDRESOURCE$20);
            }
        }
        
        /**
         * Sets array of all "linkRelatedResource" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setLinkRelatedResourceArray(de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource[] linkRelatedResourceArray)
        {
            check_orphaned();
            arraySetterHelper(linkRelatedResourceArray, LINKRELATEDRESOURCE$20);
        }
        
        /**
         * Sets ith "linkRelatedResource" element
         */
        @Inject(optional=true) public void setLinkRelatedResourceArray(int i, de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource linkRelatedResource)
        {
            generatedSetterHelperImpl(linkRelatedResource, LINKRELATEDRESOURCE$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "linkRelatedResource" element
         */
        public de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource insertNewLinkRelatedResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource target = null;
                target = (de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource)get_store().insert_element_user(LINKRELATEDRESOURCE$20, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "linkRelatedResource" element
         */
        public de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource addNewLinkRelatedResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource target = null;
                target = (de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource)get_store().add_element_user(LINKRELATEDRESOURCE$20);
                return target;
            }
        }
        
        /**
         * Removes the ith "linkRelatedResource" element
         */
        public void removeLinkRelatedResource(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINKRELATEDRESOURCE$20, i);
            }
        }
        
        /**
         * Gets a List of "resourceMetadataLoc" elements
         */
        public java.util.List<de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc> getResourceMetadataLocList()
        {
            final class ResourceMetadataLocList extends java.util.AbstractList<de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc>
            {
                @Override
                public de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc get(int i)
                    { return ResourceSetImpl.this.getResourceMetadataLocArray(i); }
                
                @Override
                public de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc set(int i, de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc o)
                {
                    de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc old = ResourceSetImpl.this.getResourceMetadataLocArray(i);
                    ResourceSetImpl.this.setResourceMetadataLocArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc o)
                    { ResourceSetImpl.this.insertNewResourceMetadataLoc(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc remove(int i)
                {
                    de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc old = ResourceSetImpl.this.getResourceMetadataLocArray(i);
                    ResourceSetImpl.this.removeResourceMetadataLoc(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResourceSetImpl.this.sizeOfResourceMetadataLocArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResourceMetadataLocList();
            }
        }
        
        /**
         * Gets array of all "resourceMetadataLoc" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc[] getResourceMetadataLocArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc> targetList = new java.util.ArrayList<de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc>();
                get_store().find_all_element_users(RESOURCEMETADATALOC$22, targetList);
                de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc[] result = new de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resourceMetadataLoc" element
         */
        public de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc getResourceMetadataLocArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc target = null;
                target = (de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc)get_store().find_element_user(RESOURCEMETADATALOC$22, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resourceMetadataLoc" element
         */
        public int sizeOfResourceMetadataLocArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCEMETADATALOC$22);
            }
        }
        
        /**
         * Sets array of all "resourceMetadataLoc" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setResourceMetadataLocArray(de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc[] resourceMetadataLocArray)
        {
            check_orphaned();
            arraySetterHelper(resourceMetadataLocArray, RESOURCEMETADATALOC$22);
        }
        
        /**
         * Sets ith "resourceMetadataLoc" element
         */
        @Inject(optional=true) public void setResourceMetadataLocArray(int i, de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc resourceMetadataLoc)
        {
            generatedSetterHelperImpl(resourceMetadataLoc, RESOURCEMETADATALOC$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceMetadataLoc" element
         */
        public de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc insertNewResourceMetadataLoc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc target = null;
                target = (de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc)get_store().insert_element_user(RESOURCEMETADATALOC$22, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceMetadataLoc" element
         */
        public de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc addNewResourceMetadataLoc()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc target = null;
                target = (de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc)get_store().add_element_user(RESOURCEMETADATALOC$22);
                return target;
            }
        }
        
        /**
         * Removes the ith "resourceMetadataLoc" element
         */
        public void removeResourceMetadataLoc(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCEMETADATALOC$22, i);
            }
        }
    }
}
