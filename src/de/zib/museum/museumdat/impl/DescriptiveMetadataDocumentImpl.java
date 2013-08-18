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
 * A document containing one descriptiveMetadata(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class DescriptiveMetadataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.DescriptiveMetadataDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescriptiveMetadataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTIVEMETADATA$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "descriptiveMetadata");
    
    
    /**
     * Gets the "descriptiveMetadata" element
     */
    public de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata getDescriptiveMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata target = null;
            target = (de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata)get_store().find_element_user(DESCRIPTIVEMETADATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "descriptiveMetadata" element
     */
    @Inject(optional=true) public void setDescriptiveMetadata(de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata descriptiveMetadata)
    {
        generatedSetterHelperImpl(descriptiveMetadata, DESCRIPTIVEMETADATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "descriptiveMetadata" element
     */
    public de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata addNewDescriptiveMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata target = null;
            target = (de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata)get_store().add_element_user(DESCRIPTIVEMETADATA$0);
            return target;
        }
    }
    /**
     * An XML descriptiveMetadata(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class DescriptiveMetadataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata
    {
        private static final long serialVersionUID = 1L;
        
        public DescriptiveMetadataImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OBJECTCLASSIFICATIONWRAP$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "objectClassificationWrap");
        private static final javax.xml.namespace.QName IDENTIFICATIONWRAP$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "identificationWrap");
        private static final javax.xml.namespace.QName DESCRIPTIONWRAP$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "descriptionWrap");
        private static final javax.xml.namespace.QName EVENTWRAP$6 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "eventWrap");
        private static final javax.xml.namespace.QName RELATIONWRAP$8 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "relationWrap");
        
        
        /**
         * Gets the "objectClassificationWrap" element
         */
        public de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap getObjectClassificationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap target = null;
                target = (de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap)get_store().find_element_user(OBJECTCLASSIFICATIONWRAP$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "objectClassificationWrap" element
         */
        @Inject(optional=true) public void setObjectClassificationWrap(de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap objectClassificationWrap)
        {
            generatedSetterHelperImpl(objectClassificationWrap, OBJECTCLASSIFICATIONWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "objectClassificationWrap" element
         */
        public de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap addNewObjectClassificationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap target = null;
                target = (de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap)get_store().add_element_user(OBJECTCLASSIFICATIONWRAP$0);
                return target;
            }
        }
        
        /**
         * Gets the "identificationWrap" element
         */
        public de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap getIdentificationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap target = null;
                target = (de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap)get_store().find_element_user(IDENTIFICATIONWRAP$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "identificationWrap" element
         */
        @Inject(optional=true) public void setIdentificationWrap(de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap identificationWrap)
        {
            generatedSetterHelperImpl(identificationWrap, IDENTIFICATIONWRAP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "identificationWrap" element
         */
        public de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap addNewIdentificationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap target = null;
                target = (de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap)get_store().add_element_user(IDENTIFICATIONWRAP$2);
                return target;
            }
        }
        
        /**
         * Gets the "descriptionWrap" element
         */
        public de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap getDescriptionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap target = null;
                target = (de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap)get_store().find_element_user(DESCRIPTIONWRAP$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "descriptionWrap" element
         */
        public boolean isSetDescriptionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTIONWRAP$4) != 0;
            }
        }
        
        /**
         * Sets the "descriptionWrap" element
         */
        @Inject(optional=true) public void setDescriptionWrap(de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap descriptionWrap)
        {
            generatedSetterHelperImpl(descriptionWrap, DESCRIPTIONWRAP$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "descriptionWrap" element
         */
        public de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap addNewDescriptionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap target = null;
                target = (de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap)get_store().add_element_user(DESCRIPTIONWRAP$4);
                return target;
            }
        }
        
        /**
         * Unsets the "descriptionWrap" element
         */
        public void unsetDescriptionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTIONWRAP$4, 0);
            }
        }
        
        /**
         * Gets the "eventWrap" element
         */
        public de.zib.museum.museumdat.EventWrapDocument.EventWrap getEventWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.EventWrapDocument.EventWrap target = null;
                target = (de.zib.museum.museumdat.EventWrapDocument.EventWrap)get_store().find_element_user(EVENTWRAP$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "eventWrap" element
         */
        public boolean isSetEventWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EVENTWRAP$6) != 0;
            }
        }
        
        /**
         * Sets the "eventWrap" element
         */
        @Inject(optional=true) public void setEventWrap(de.zib.museum.museumdat.EventWrapDocument.EventWrap eventWrap)
        {
            generatedSetterHelperImpl(eventWrap, EVENTWRAP$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "eventWrap" element
         */
        public de.zib.museum.museumdat.EventWrapDocument.EventWrap addNewEventWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.EventWrapDocument.EventWrap target = null;
                target = (de.zib.museum.museumdat.EventWrapDocument.EventWrap)get_store().add_element_user(EVENTWRAP$6);
                return target;
            }
        }
        
        /**
         * Unsets the "eventWrap" element
         */
        public void unsetEventWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EVENTWRAP$6, 0);
            }
        }
        
        /**
         * Gets the "relationWrap" element
         */
        public de.zib.museum.museumdat.RelationWrapDocument.RelationWrap getRelationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RelationWrapDocument.RelationWrap target = null;
                target = (de.zib.museum.museumdat.RelationWrapDocument.RelationWrap)get_store().find_element_user(RELATIONWRAP$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "relationWrap" element
         */
        public boolean isSetRelationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELATIONWRAP$8) != 0;
            }
        }
        
        /**
         * Sets the "relationWrap" element
         */
        @Inject(optional=true) public void setRelationWrap(de.zib.museum.museumdat.RelationWrapDocument.RelationWrap relationWrap)
        {
            generatedSetterHelperImpl(relationWrap, RELATIONWRAP$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "relationWrap" element
         */
        public de.zib.museum.museumdat.RelationWrapDocument.RelationWrap addNewRelationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RelationWrapDocument.RelationWrap target = null;
                target = (de.zib.museum.museumdat.RelationWrapDocument.RelationWrap)get_store().add_element_user(RELATIONWRAP$8);
                return target;
            }
        }
        
        /**
         * Unsets the "relationWrap" element
         */
        public void unsetRelationWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELATIONWRAP$8, 0);
            }
        }
    }
}
