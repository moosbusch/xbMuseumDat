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
 * A document containing one eventWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class EventWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.EventWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public EventWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENTWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "eventWrap");
    
    
    /**
     * Gets the "eventWrap" element
     */
    public de.zib.museum.museumdat.EventWrapDocument.EventWrap getEventWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.EventWrapDocument.EventWrap target = null;
            target = (de.zib.museum.museumdat.EventWrapDocument.EventWrap)get_store().find_element_user(EVENTWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "eventWrap" element
     */
    @Inject(optional=true) public void setEventWrap(de.zib.museum.museumdat.EventWrapDocument.EventWrap eventWrap)
    {
        generatedSetterHelperImpl(eventWrap, EVENTWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (de.zib.museum.museumdat.EventWrapDocument.EventWrap)get_store().add_element_user(EVENTWRAP$0);
            return target;
        }
    }
    /**
     * An XML eventWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class EventWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.EventWrapDocument.EventWrap
    {
        private static final long serialVersionUID = 1L;
        
        public EventWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INDEXINGEVENTWRAP$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingEventWrap");
        private static final javax.xml.namespace.QName INDEXINGMEASUREMENTSWRAP$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingMeasurementsWrap");
        private static final javax.xml.namespace.QName INDEXINGMATERIALSTECHWRAP$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingMaterialsTechWrap");
        private static final javax.xml.namespace.QName STYLEWRAP$6 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "styleWrap");
        private static final javax.xml.namespace.QName CULTUREWRAP$8 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "cultureWrap");
        
        
        /**
         * Gets the "indexingEventWrap" element
         */
        public de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap getIndexingEventWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap target = null;
                target = (de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap)get_store().find_element_user(INDEXINGEVENTWRAP$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "indexingEventWrap" element
         */
        public boolean isSetIndexingEventWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGEVENTWRAP$0) != 0;
            }
        }
        
        /**
         * Sets the "indexingEventWrap" element
         */
        @Inject(optional=true) public void setIndexingEventWrap(de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap indexingEventWrap)
        {
            generatedSetterHelperImpl(indexingEventWrap, INDEXINGEVENTWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "indexingEventWrap" element
         */
        public de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap addNewIndexingEventWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap target = null;
                target = (de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap)get_store().add_element_user(INDEXINGEVENTWRAP$0);
                return target;
            }
        }
        
        /**
         * Unsets the "indexingEventWrap" element
         */
        public void unsetIndexingEventWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGEVENTWRAP$0, 0);
            }
        }
        
        /**
         * Gets the "indexingMeasurementsWrap" element
         */
        public de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap getIndexingMeasurementsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap target = null;
                target = (de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap)get_store().find_element_user(INDEXINGMEASUREMENTSWRAP$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "indexingMeasurementsWrap" element
         */
        public boolean isSetIndexingMeasurementsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGMEASUREMENTSWRAP$2) != 0;
            }
        }
        
        /**
         * Sets the "indexingMeasurementsWrap" element
         */
        @Inject(optional=true) public void setIndexingMeasurementsWrap(de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap indexingMeasurementsWrap)
        {
            generatedSetterHelperImpl(indexingMeasurementsWrap, INDEXINGMEASUREMENTSWRAP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "indexingMeasurementsWrap" element
         */
        public de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap addNewIndexingMeasurementsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap target = null;
                target = (de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap)get_store().add_element_user(INDEXINGMEASUREMENTSWRAP$2);
                return target;
            }
        }
        
        /**
         * Unsets the "indexingMeasurementsWrap" element
         */
        public void unsetIndexingMeasurementsWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGMEASUREMENTSWRAP$2, 0);
            }
        }
        
        /**
         * Gets the "indexingMaterialsTechWrap" element
         */
        public de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap getIndexingMaterialsTechWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap target = null;
                target = (de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap)get_store().find_element_user(INDEXINGMATERIALSTECHWRAP$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "indexingMaterialsTechWrap" element
         */
        public boolean isSetIndexingMaterialsTechWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGMATERIALSTECHWRAP$4) != 0;
            }
        }
        
        /**
         * Sets the "indexingMaterialsTechWrap" element
         */
        @Inject(optional=true) public void setIndexingMaterialsTechWrap(de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap indexingMaterialsTechWrap)
        {
            generatedSetterHelperImpl(indexingMaterialsTechWrap, INDEXINGMATERIALSTECHWRAP$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "indexingMaterialsTechWrap" element
         */
        public de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap addNewIndexingMaterialsTechWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap target = null;
                target = (de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap)get_store().add_element_user(INDEXINGMATERIALSTECHWRAP$4);
                return target;
            }
        }
        
        /**
         * Unsets the "indexingMaterialsTechWrap" element
         */
        public void unsetIndexingMaterialsTechWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGMATERIALSTECHWRAP$4, 0);
            }
        }
        
        /**
         * Gets the "styleWrap" element
         */
        public de.zib.museum.museumdat.StyleWrapDocument.StyleWrap getStyleWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.StyleWrapDocument.StyleWrap target = null;
                target = (de.zib.museum.museumdat.StyleWrapDocument.StyleWrap)get_store().find_element_user(STYLEWRAP$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "styleWrap" element
         */
        public boolean isSetStyleWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(STYLEWRAP$6) != 0;
            }
        }
        
        /**
         * Sets the "styleWrap" element
         */
        @Inject(optional=true) public void setStyleWrap(de.zib.museum.museumdat.StyleWrapDocument.StyleWrap styleWrap)
        {
            generatedSetterHelperImpl(styleWrap, STYLEWRAP$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (de.zib.museum.museumdat.StyleWrapDocument.StyleWrap)get_store().add_element_user(STYLEWRAP$6);
                return target;
            }
        }
        
        /**
         * Unsets the "styleWrap" element
         */
        public void unsetStyleWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(STYLEWRAP$6, 0);
            }
        }
        
        /**
         * Gets the "cultureWrap" element
         */
        public de.zib.museum.museumdat.CultureWrapDocument.CultureWrap getCultureWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.CultureWrapDocument.CultureWrap target = null;
                target = (de.zib.museum.museumdat.CultureWrapDocument.CultureWrap)get_store().find_element_user(CULTUREWRAP$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "cultureWrap" element
         */
        public boolean isSetCultureWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CULTUREWRAP$8) != 0;
            }
        }
        
        /**
         * Sets the "cultureWrap" element
         */
        @Inject(optional=true) public void setCultureWrap(de.zib.museum.museumdat.CultureWrapDocument.CultureWrap cultureWrap)
        {
            generatedSetterHelperImpl(cultureWrap, CULTUREWRAP$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "cultureWrap" element
         */
        public de.zib.museum.museumdat.CultureWrapDocument.CultureWrap addNewCultureWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.CultureWrapDocument.CultureWrap target = null;
                target = (de.zib.museum.museumdat.CultureWrapDocument.CultureWrap)get_store().add_element_user(CULTUREWRAP$8);
                return target;
            }
        }
        
        /**
         * Unsets the "cultureWrap" element
         */
        public void unsetCultureWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CULTUREWRAP$8, 0);
            }
        }
    }
}
