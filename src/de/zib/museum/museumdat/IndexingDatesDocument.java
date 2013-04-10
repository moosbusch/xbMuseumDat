/*
 * An XML document type.
 * Localname: indexingDates
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.IndexingDatesDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat;


/**
 * A document containing one indexingDates(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface IndexingDatesDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingDatesDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("indexingdates3b40doctype");
    
    /**
     * Gets the "indexingDates" element
     */
    de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates getIndexingDates();
    
    /**
     * Sets the "indexingDates" element
     */
    void setIndexingDates(de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates indexingDates);
    
    /**
     * Appends and returns a new empty "indexingDates" element
     */
    de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates addNewIndexingDates();
    
    /**
     * An XML indexingDates(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface IndexingDates extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingDates.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("indexingdatesbc1felemtype");
        
        /**
         * Gets the "earliestDate" element
         */
        de.zib.museum.museumdat.EarliestDateDocument.EarliestDate getEarliestDate();
        
        /**
         * Sets the "earliestDate" element
         */
        void setEarliestDate(de.zib.museum.museumdat.EarliestDateDocument.EarliestDate earliestDate);
        
        /**
         * Appends and returns a new empty "earliestDate" element
         */
        de.zib.museum.museumdat.EarliestDateDocument.EarliestDate addNewEarliestDate();
        
        /**
         * Gets the "latestDate" element
         */
        de.zib.museum.museumdat.LatestDateDocument.LatestDate getLatestDate();
        
        /**
         * Sets the "latestDate" element
         */
        void setLatestDate(de.zib.museum.museumdat.LatestDateDocument.LatestDate latestDate);
        
        /**
         * Appends and returns a new empty "latestDate" element
         */
        de.zib.museum.museumdat.LatestDateDocument.LatestDate addNewLatestDate();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates newInstance() {
              return (de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.IndexingDatesDocument newInstance() {
          return (de.zib.museum.museumdat.IndexingDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.IndexingDatesDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.IndexingDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.IndexingDatesDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingDatesDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.IndexingDatesDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingDatesDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingDatesDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingDatesDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingDatesDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingDatesDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingDatesDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingDatesDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingDatesDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingDatesDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingDatesDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingDatesDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.IndexingDatesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.IndexingDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.IndexingDatesDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.IndexingDatesDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
