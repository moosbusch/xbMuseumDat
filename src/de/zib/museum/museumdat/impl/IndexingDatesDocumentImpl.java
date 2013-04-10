/*
 * An XML document type.
 * Localname: indexingDates
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.IndexingDatesDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one indexingDates(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class IndexingDatesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingDatesDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingDatesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGDATES$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingDates");
    
    
    /**
     * Gets the "indexingDates" element
     */
    public de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates getIndexingDates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates target = null;
            target = (de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates)get_store().find_element_user(INDEXINGDATES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingDates" element
     */
    @Inject(optional=true) public void setIndexingDates(de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates indexingDates)
    {
        generatedSetterHelperImpl(indexingDates, INDEXINGDATES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingDates" element
     */
    public de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates addNewIndexingDates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates target = null;
            target = (de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates)get_store().add_element_user(INDEXINGDATES$0);
            return target;
        }
    }
    /**
     * An XML indexingDates(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class IndexingDatesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingDatesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName EARLIESTDATE$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "earliestDate");
        private static final javax.xml.namespace.QName LATESTDATE$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "latestDate");
        
        
        /**
         * Gets the "earliestDate" element
         */
        public de.zib.museum.museumdat.EarliestDateDocument.EarliestDate getEarliestDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.EarliestDateDocument.EarliestDate target = null;
                target = (de.zib.museum.museumdat.EarliestDateDocument.EarliestDate)get_store().find_element_user(EARLIESTDATE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "earliestDate" element
         */
        @Inject(optional=true) public void setEarliestDate(de.zib.museum.museumdat.EarliestDateDocument.EarliestDate earliestDate)
        {
            generatedSetterHelperImpl(earliestDate, EARLIESTDATE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "earliestDate" element
         */
        public de.zib.museum.museumdat.EarliestDateDocument.EarliestDate addNewEarliestDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.EarliestDateDocument.EarliestDate target = null;
                target = (de.zib.museum.museumdat.EarliestDateDocument.EarliestDate)get_store().add_element_user(EARLIESTDATE$0);
                return target;
            }
        }
        
        /**
         * Gets the "latestDate" element
         */
        public de.zib.museum.museumdat.LatestDateDocument.LatestDate getLatestDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LatestDateDocument.LatestDate target = null;
                target = (de.zib.museum.museumdat.LatestDateDocument.LatestDate)get_store().find_element_user(LATESTDATE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "latestDate" element
         */
        @Inject(optional=true) public void setLatestDate(de.zib.museum.museumdat.LatestDateDocument.LatestDate latestDate)
        {
            generatedSetterHelperImpl(latestDate, LATESTDATE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "latestDate" element
         */
        public de.zib.museum.museumdat.LatestDateDocument.LatestDate addNewLatestDate()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LatestDateDocument.LatestDate target = null;
                target = (de.zib.museum.museumdat.LatestDateDocument.LatestDate)get_store().add_element_user(LATESTDATE$2);
                return target;
            }
        }
    }
}
