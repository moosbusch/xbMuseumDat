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
 * A document containing one administrativeMetadata(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class AdministrativeMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.AdministrativeMetadataDocument
{
    private static final long serialVersionUID = 1L;

    public AdministrativeMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName ADMINISTRATIVEMETADATA$0 =
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "administrativeMetadata");


    /**
     * Gets the "administrativeMetadata" element
     */
    public de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata getAdministrativeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata target = null;
            target = (de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata)get_store().find_element_user(ADMINISTRATIVEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "administrativeMetadata" element
     */
    @Inject(optional=true) public void setAdministrativeMetadata(de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata administrativeMetadata)
    {
        generatedSetterHelperImpl(administrativeMetadata, ADMINISTRATIVEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "administrativeMetadata" element
     */
    public de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata addNewAdministrativeMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata target = null;
            target = (de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata)get_store().add_element_user(ADMINISTRATIVEMETADATA$0);
            return target;
        }
    }
    /**
     * An XML administrativeMetadata(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class AdministrativeMetadataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata
    {
        private static final long serialVersionUID = 1L;

        public AdministrativeMetadataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName RIGHTSWORK$0 =
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "rightsWork");
        private static final javax.xml.namespace.QName RECORDWRAP$2 =
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "recordWrap");
        private static final javax.xml.namespace.QName RESOURCEWRAP$4 =
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "resourceWrap");


        /**
         * Gets a List of "rightsWork" elements
         */
        public java.util.List<de.zib.museum.museumdat.RightsWorkDocument.RightsWork> getRightsWorkList()
        {
            final class RightsWorkList extends java.util.AbstractList<de.zib.museum.museumdat.RightsWorkDocument.RightsWork>
            {
                @Override
                public de.zib.museum.museumdat.RightsWorkDocument.RightsWork get(int i)
                    { return AdministrativeMetadataImpl.this.getRightsWorkArray(i); }

                @Override
                public de.zib.museum.museumdat.RightsWorkDocument.RightsWork set(int i, de.zib.museum.museumdat.RightsWorkDocument.RightsWork o)
                {
                    de.zib.museum.museumdat.RightsWorkDocument.RightsWork old = AdministrativeMetadataImpl.this.getRightsWorkArray(i);
                    AdministrativeMetadataImpl.this.setRightsWorkArray(i, o);
                    return old;
                }

                @Override
                public void add(int i, de.zib.museum.museumdat.RightsWorkDocument.RightsWork o)
                    { AdministrativeMetadataImpl.this.insertNewRightsWork(i).set(o); }

                @Override
                public de.zib.museum.museumdat.RightsWorkDocument.RightsWork remove(int i)
                {
                    de.zib.museum.museumdat.RightsWorkDocument.RightsWork old = AdministrativeMetadataImpl.this.getRightsWorkArray(i);
                    AdministrativeMetadataImpl.this.removeRightsWork(i);
                    return old;
                }

                @Override
                public int size()
                    { return AdministrativeMetadataImpl.this.sizeOfRightsWorkArray(); }

            }

            synchronized (monitor())
            {
                check_orphaned();
                return new RightsWorkList();
            }
        }

        /**
         * Gets array of all "rightsWork" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.RightsWorkDocument.RightsWork[] getRightsWorkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.RightsWorkDocument.RightsWork> targetList = new java.util.ArrayList<de.zib.museum.museumdat.RightsWorkDocument.RightsWork>();
                get_store().find_all_element_users(RIGHTSWORK$0, targetList);
                de.zib.museum.museumdat.RightsWorkDocument.RightsWork[] result = new de.zib.museum.museumdat.RightsWorkDocument.RightsWork[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }

        /**
         * Gets ith "rightsWork" element
         */
        public de.zib.museum.museumdat.RightsWorkDocument.RightsWork getRightsWorkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RightsWorkDocument.RightsWork target = null;
                target = (de.zib.museum.museumdat.RightsWorkDocument.RightsWork)get_store().find_element_user(RIGHTSWORK$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "rightsWork" element
         */
        public int sizeOfRightsWorkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RIGHTSWORK$0);
            }
        }

        /**
         * Sets array of all "rightsWork" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setRightsWorkArray(de.zib.museum.museumdat.RightsWorkDocument.RightsWork[] rightsWorkArray)
        {
            check_orphaned();
            arraySetterHelper(rightsWorkArray, RIGHTSWORK$0);
        }

        /**
         * Sets ith "rightsWork" element
         */
        @Inject(optional=true) public void setRightsWorkArray(int i, de.zib.museum.museumdat.RightsWorkDocument.RightsWork rightsWork)
        {
            generatedSetterHelperImpl(rightsWork, RIGHTSWORK$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "rightsWork" element
         */
        public de.zib.museum.museumdat.RightsWorkDocument.RightsWork insertNewRightsWork(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RightsWorkDocument.RightsWork target = null;
                target = (de.zib.museum.museumdat.RightsWorkDocument.RightsWork)get_store().insert_element_user(RIGHTSWORK$0, i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "rightsWork" element
         */
        public de.zib.museum.museumdat.RightsWorkDocument.RightsWork addNewRightsWork()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RightsWorkDocument.RightsWork target = null;
                target = (de.zib.museum.museumdat.RightsWorkDocument.RightsWork)get_store().add_element_user(RIGHTSWORK$0);
                return target;
            }
        }

        /**
         * Removes the ith "rightsWork" element
         */
        public void removeRightsWork(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RIGHTSWORK$0, i);
            }
        }

        /**
         * Gets the "recordWrap" element
         */
        public de.zib.museum.museumdat.RecordWrapDocument.RecordWrap getRecordWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordWrapDocument.RecordWrap target = null;
                target = (de.zib.museum.museumdat.RecordWrapDocument.RecordWrap)get_store().find_element_user(RECORDWRAP$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }

        /**
         * Sets the "recordWrap" element
         */
        @Inject(optional=true) public void setRecordWrap(de.zib.museum.museumdat.RecordWrapDocument.RecordWrap recordWrap)
        {
            generatedSetterHelperImpl(recordWrap, RECORDWRAP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }

        /**
         * Appends and returns a new empty "recordWrap" element
         */
        public de.zib.museum.museumdat.RecordWrapDocument.RecordWrap addNewRecordWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RecordWrapDocument.RecordWrap target = null;
                target = (de.zib.museum.museumdat.RecordWrapDocument.RecordWrap)get_store().add_element_user(RECORDWRAP$2);
                return target;
            }
        }

        /**
         * Gets the "resourceWrap" element
         */
        public de.zib.museum.museumdat.ResourceWrapDocument.ResourceWrap getResourceWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceWrapDocument.ResourceWrap target = null;
                target = (de.zib.museum.museumdat.ResourceWrapDocument.ResourceWrap)get_store().find_element_user(RESOURCEWRAP$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }

        /**
         * True if has "resourceWrap" element
         */
        public boolean isSetResourceWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCEWRAP$4) != 0;
            }
        }

        /**
         * Sets the "resourceWrap" element
         */
        @Inject(optional=true) public void setResourceWrap(de.zib.museum.museumdat.ResourceWrapDocument.ResourceWrap resourceWrap)
        {
            generatedSetterHelperImpl(resourceWrap, RESOURCEWRAP$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }

        /**
         * Appends and returns a new empty "resourceWrap" element
         */
        public de.zib.museum.museumdat.ResourceWrapDocument.ResourceWrap addNewResourceWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ResourceWrapDocument.ResourceWrap target = null;
                target = (de.zib.museum.museumdat.ResourceWrapDocument.ResourceWrap)get_store().add_element_user(RESOURCEWRAP$4);
                return target;
            }
        }

        /**
         * Unsets the "resourceWrap" element
         */
        public void unsetResourceWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCEWRAP$4, 0);
            }
        }
    }
}
