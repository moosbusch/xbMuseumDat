/*
 * An XML document type.
 * Localname: descriptionWrap
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.DescriptionWrapDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one descriptionWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class DescriptionWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.DescriptionWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public DescriptionWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DESCRIPTIONWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "descriptionWrap");
    
    
    /**
     * Gets the "descriptionWrap" element
     */
    public de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap getDescriptionWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap target = null;
            target = (de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap)get_store().find_element_user(DESCRIPTIONWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "descriptionWrap" element
     */
    @Inject(optional=true) public void setDescriptionWrap(de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap descriptionWrap)
    {
        generatedSetterHelperImpl(descriptionWrap, DESCRIPTIONWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap)get_store().add_element_user(DESCRIPTIONWRAP$0);
            return target;
        }
    }
    /**
     * An XML descriptionWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class DescriptionWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap
    {
        private static final long serialVersionUID = 1L;
        
        public DescriptionWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DISPLAYCREATOR$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "displayCreator");
        private static final javax.xml.namespace.QName DISPLAYCREATIONDATE$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "displayCreationDate");
        private static final javax.xml.namespace.QName DISPLAYCREATIONLOCATION$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "displayCreationLocation");
        private static final javax.xml.namespace.QName DISPLAYMEASUREMENTS$6 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "displayMeasurements");
        private static final javax.xml.namespace.QName DISPLAYMATERIALSTECH$8 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "displayMaterialsTech");
        private static final javax.xml.namespace.QName DISPLAYSTATEEDITIONWRAP$10 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "displayStateEditionWrap");
        private static final javax.xml.namespace.QName DISPLAYEVENTWRAP$12 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "displayEventWrap");
        private static final javax.xml.namespace.QName DESCRIPTIVENOTEWRAP$14 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "descriptiveNoteWrap");
        
        
        /**
         * Gets the "displayCreator" element
         */
        public de.zib.museum.museumdat.DisplayCreatorDocument.DisplayCreator getDisplayCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayCreatorDocument.DisplayCreator target = null;
                target = (de.zib.museum.museumdat.DisplayCreatorDocument.DisplayCreator)get_store().find_element_user(DISPLAYCREATOR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "displayCreator" element
         */
        public boolean isSetDisplayCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPLAYCREATOR$0) != 0;
            }
        }
        
        /**
         * Sets the "displayCreator" element
         */
        @Inject(optional=true) public void setDisplayCreator(de.zib.museum.museumdat.DisplayCreatorDocument.DisplayCreator displayCreator)
        {
            generatedSetterHelperImpl(displayCreator, DISPLAYCREATOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "displayCreator" element
         */
        public de.zib.museum.museumdat.DisplayCreatorDocument.DisplayCreator addNewDisplayCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayCreatorDocument.DisplayCreator target = null;
                target = (de.zib.museum.museumdat.DisplayCreatorDocument.DisplayCreator)get_store().add_element_user(DISPLAYCREATOR$0);
                return target;
            }
        }
        
        /**
         * Unsets the "displayCreator" element
         */
        public void unsetDisplayCreator()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPLAYCREATOR$0, 0);
            }
        }
        
        /**
         * Gets the "displayCreationDate" element
         */
        public de.zib.museum.museumdat.DisplayCreationDateDocument.DisplayCreationDate getDisplayCreationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayCreationDateDocument.DisplayCreationDate target = null;
                target = (de.zib.museum.museumdat.DisplayCreationDateDocument.DisplayCreationDate)get_store().find_element_user(DISPLAYCREATIONDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "displayCreationDate" element
         */
        public boolean isSetDisplayCreationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPLAYCREATIONDATE$2) != 0;
            }
        }
        
        /**
         * Sets the "displayCreationDate" element
         */
        @Inject(optional=true) public void setDisplayCreationDate(de.zib.museum.museumdat.DisplayCreationDateDocument.DisplayCreationDate displayCreationDate)
        {
            generatedSetterHelperImpl(displayCreationDate, DISPLAYCREATIONDATE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "displayCreationDate" element
         */
        public de.zib.museum.museumdat.DisplayCreationDateDocument.DisplayCreationDate addNewDisplayCreationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayCreationDateDocument.DisplayCreationDate target = null;
                target = (de.zib.museum.museumdat.DisplayCreationDateDocument.DisplayCreationDate)get_store().add_element_user(DISPLAYCREATIONDATE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "displayCreationDate" element
         */
        public void unsetDisplayCreationDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPLAYCREATIONDATE$2, 0);
            }
        }
        
        /**
         * Gets the "displayCreationLocation" element
         */
        public de.zib.museum.museumdat.DisplayCreationLocationDocument.DisplayCreationLocation getDisplayCreationLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayCreationLocationDocument.DisplayCreationLocation target = null;
                target = (de.zib.museum.museumdat.DisplayCreationLocationDocument.DisplayCreationLocation)get_store().find_element_user(DISPLAYCREATIONLOCATION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "displayCreationLocation" element
         */
        public boolean isSetDisplayCreationLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPLAYCREATIONLOCATION$4) != 0;
            }
        }
        
        /**
         * Sets the "displayCreationLocation" element
         */
        @Inject(optional=true) public void setDisplayCreationLocation(de.zib.museum.museumdat.DisplayCreationLocationDocument.DisplayCreationLocation displayCreationLocation)
        {
            generatedSetterHelperImpl(displayCreationLocation, DISPLAYCREATIONLOCATION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "displayCreationLocation" element
         */
        public de.zib.museum.museumdat.DisplayCreationLocationDocument.DisplayCreationLocation addNewDisplayCreationLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayCreationLocationDocument.DisplayCreationLocation target = null;
                target = (de.zib.museum.museumdat.DisplayCreationLocationDocument.DisplayCreationLocation)get_store().add_element_user(DISPLAYCREATIONLOCATION$4);
                return target;
            }
        }
        
        /**
         * Unsets the "displayCreationLocation" element
         */
        public void unsetDisplayCreationLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPLAYCREATIONLOCATION$4, 0);
            }
        }
        
        /**
         * Gets the "displayMeasurements" element
         */
        public de.zib.museum.museumdat.DisplayMeasurementsDocument.DisplayMeasurements getDisplayMeasurements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayMeasurementsDocument.DisplayMeasurements target = null;
                target = (de.zib.museum.museumdat.DisplayMeasurementsDocument.DisplayMeasurements)get_store().find_element_user(DISPLAYMEASUREMENTS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "displayMeasurements" element
         */
        public boolean isSetDisplayMeasurements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPLAYMEASUREMENTS$6) != 0;
            }
        }
        
        /**
         * Sets the "displayMeasurements" element
         */
        @Inject(optional=true) public void setDisplayMeasurements(de.zib.museum.museumdat.DisplayMeasurementsDocument.DisplayMeasurements displayMeasurements)
        {
            generatedSetterHelperImpl(displayMeasurements, DISPLAYMEASUREMENTS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "displayMeasurements" element
         */
        public de.zib.museum.museumdat.DisplayMeasurementsDocument.DisplayMeasurements addNewDisplayMeasurements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayMeasurementsDocument.DisplayMeasurements target = null;
                target = (de.zib.museum.museumdat.DisplayMeasurementsDocument.DisplayMeasurements)get_store().add_element_user(DISPLAYMEASUREMENTS$6);
                return target;
            }
        }
        
        /**
         * Unsets the "displayMeasurements" element
         */
        public void unsetDisplayMeasurements()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPLAYMEASUREMENTS$6, 0);
            }
        }
        
        /**
         * Gets the "displayMaterialsTech" element
         */
        public de.zib.museum.museumdat.DisplayMaterialsTechDocument.DisplayMaterialsTech getDisplayMaterialsTech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayMaterialsTechDocument.DisplayMaterialsTech target = null;
                target = (de.zib.museum.museumdat.DisplayMaterialsTechDocument.DisplayMaterialsTech)get_store().find_element_user(DISPLAYMATERIALSTECH$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "displayMaterialsTech" element
         */
        public boolean isSetDisplayMaterialsTech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPLAYMATERIALSTECH$8) != 0;
            }
        }
        
        /**
         * Sets the "displayMaterialsTech" element
         */
        @Inject(optional=true) public void setDisplayMaterialsTech(de.zib.museum.museumdat.DisplayMaterialsTechDocument.DisplayMaterialsTech displayMaterialsTech)
        {
            generatedSetterHelperImpl(displayMaterialsTech, DISPLAYMATERIALSTECH$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "displayMaterialsTech" element
         */
        public de.zib.museum.museumdat.DisplayMaterialsTechDocument.DisplayMaterialsTech addNewDisplayMaterialsTech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayMaterialsTechDocument.DisplayMaterialsTech target = null;
                target = (de.zib.museum.museumdat.DisplayMaterialsTechDocument.DisplayMaterialsTech)get_store().add_element_user(DISPLAYMATERIALSTECH$8);
                return target;
            }
        }
        
        /**
         * Unsets the "displayMaterialsTech" element
         */
        public void unsetDisplayMaterialsTech()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPLAYMATERIALSTECH$8, 0);
            }
        }
        
        /**
         * Gets the "displayStateEditionWrap" element
         */
        public de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap getDisplayStateEditionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap target = null;
                target = (de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap)get_store().find_element_user(DISPLAYSTATEEDITIONWRAP$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "displayStateEditionWrap" element
         */
        public boolean isSetDisplayStateEditionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPLAYSTATEEDITIONWRAP$10) != 0;
            }
        }
        
        /**
         * Sets the "displayStateEditionWrap" element
         */
        @Inject(optional=true) public void setDisplayStateEditionWrap(de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap displayStateEditionWrap)
        {
            generatedSetterHelperImpl(displayStateEditionWrap, DISPLAYSTATEEDITIONWRAP$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "displayStateEditionWrap" element
         */
        public de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap addNewDisplayStateEditionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap target = null;
                target = (de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap)get_store().add_element_user(DISPLAYSTATEEDITIONWRAP$10);
                return target;
            }
        }
        
        /**
         * Unsets the "displayStateEditionWrap" element
         */
        public void unsetDisplayStateEditionWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPLAYSTATEEDITIONWRAP$10, 0);
            }
        }
        
        /**
         * Gets the "displayEventWrap" element
         */
        public de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap getDisplayEventWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap target = null;
                target = (de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap)get_store().find_element_user(DISPLAYEVENTWRAP$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "displayEventWrap" element
         */
        public boolean isSetDisplayEventWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPLAYEVENTWRAP$12) != 0;
            }
        }
        
        /**
         * Sets the "displayEventWrap" element
         */
        @Inject(optional=true) public void setDisplayEventWrap(de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap displayEventWrap)
        {
            generatedSetterHelperImpl(displayEventWrap, DISPLAYEVENTWRAP$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "displayEventWrap" element
         */
        public de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap addNewDisplayEventWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap target = null;
                target = (de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap)get_store().add_element_user(DISPLAYEVENTWRAP$12);
                return target;
            }
        }
        
        /**
         * Unsets the "displayEventWrap" element
         */
        public void unsetDisplayEventWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPLAYEVENTWRAP$12, 0);
            }
        }
        
        /**
         * Gets the "descriptiveNoteWrap" element
         */
        public de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap getDescriptiveNoteWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap target = null;
                target = (de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap)get_store().find_element_user(DESCRIPTIVENOTEWRAP$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "descriptiveNoteWrap" element
         */
        public boolean isSetDescriptiveNoteWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DESCRIPTIVENOTEWRAP$14) != 0;
            }
        }
        
        /**
         * Sets the "descriptiveNoteWrap" element
         */
        @Inject(optional=true) public void setDescriptiveNoteWrap(de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap descriptiveNoteWrap)
        {
            generatedSetterHelperImpl(descriptiveNoteWrap, DESCRIPTIVENOTEWRAP$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap)get_store().add_element_user(DESCRIPTIVENOTEWRAP$14);
                return target;
            }
        }
        
        /**
         * Unsets the "descriptiveNoteWrap" element
         */
        public void unsetDescriptiveNoteWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DESCRIPTIVENOTEWRAP$14, 0);
            }
        }
    }
}
