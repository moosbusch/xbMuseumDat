/*
 * An XML document type.
 * Localname: eventWrap
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.EventWrapDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat;


/**
 * A document containing one eventWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface EventWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("eventwrapea71doctype");
    
    /**
     * Gets the "eventWrap" element
     */
    de.zib.museum.museumdat.EventWrapDocument.EventWrap getEventWrap();
    
    /**
     * Sets the "eventWrap" element
     */
    void setEventWrap(de.zib.museum.museumdat.EventWrapDocument.EventWrap eventWrap);
    
    /**
     * Appends and returns a new empty "eventWrap" element
     */
    de.zib.museum.museumdat.EventWrapDocument.EventWrap addNewEventWrap();
    
    /**
     * An XML eventWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface EventWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EventWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("eventwrap8801elemtype");
        
        /**
         * Gets the "indexingEventWrap" element
         */
        de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap getIndexingEventWrap();
        
        /**
         * True if has "indexingEventWrap" element
         */
        boolean isSetIndexingEventWrap();
        
        /**
         * Sets the "indexingEventWrap" element
         */
        void setIndexingEventWrap(de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap indexingEventWrap);
        
        /**
         * Appends and returns a new empty "indexingEventWrap" element
         */
        de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap addNewIndexingEventWrap();
        
        /**
         * Unsets the "indexingEventWrap" element
         */
        void unsetIndexingEventWrap();
        
        /**
         * Gets the "indexingMeasurementsWrap" element
         */
        de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap getIndexingMeasurementsWrap();
        
        /**
         * True if has "indexingMeasurementsWrap" element
         */
        boolean isSetIndexingMeasurementsWrap();
        
        /**
         * Sets the "indexingMeasurementsWrap" element
         */
        void setIndexingMeasurementsWrap(de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap indexingMeasurementsWrap);
        
        /**
         * Appends and returns a new empty "indexingMeasurementsWrap" element
         */
        de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap addNewIndexingMeasurementsWrap();
        
        /**
         * Unsets the "indexingMeasurementsWrap" element
         */
        void unsetIndexingMeasurementsWrap();
        
        /**
         * Gets the "indexingMaterialsTechWrap" element
         */
        de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap getIndexingMaterialsTechWrap();
        
        /**
         * True if has "indexingMaterialsTechWrap" element
         */
        boolean isSetIndexingMaterialsTechWrap();
        
        /**
         * Sets the "indexingMaterialsTechWrap" element
         */
        void setIndexingMaterialsTechWrap(de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap indexingMaterialsTechWrap);
        
        /**
         * Appends and returns a new empty "indexingMaterialsTechWrap" element
         */
        de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap addNewIndexingMaterialsTechWrap();
        
        /**
         * Unsets the "indexingMaterialsTechWrap" element
         */
        void unsetIndexingMaterialsTechWrap();
        
        /**
         * Gets the "styleWrap" element
         */
        de.zib.museum.museumdat.StyleWrapDocument.StyleWrap getStyleWrap();
        
        /**
         * True if has "styleWrap" element
         */
        boolean isSetStyleWrap();
        
        /**
         * Sets the "styleWrap" element
         */
        void setStyleWrap(de.zib.museum.museumdat.StyleWrapDocument.StyleWrap styleWrap);
        
        /**
         * Appends and returns a new empty "styleWrap" element
         */
        de.zib.museum.museumdat.StyleWrapDocument.StyleWrap addNewStyleWrap();
        
        /**
         * Unsets the "styleWrap" element
         */
        void unsetStyleWrap();
        
        /**
         * Gets the "cultureWrap" element
         */
        de.zib.museum.museumdat.CultureWrapDocument.CultureWrap getCultureWrap();
        
        /**
         * True if has "cultureWrap" element
         */
        boolean isSetCultureWrap();
        
        /**
         * Sets the "cultureWrap" element
         */
        void setCultureWrap(de.zib.museum.museumdat.CultureWrapDocument.CultureWrap cultureWrap);
        
        /**
         * Appends and returns a new empty "cultureWrap" element
         */
        de.zib.museum.museumdat.CultureWrapDocument.CultureWrap addNewCultureWrap();
        
        /**
         * Unsets the "cultureWrap" element
         */
        void unsetCultureWrap();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.EventWrapDocument.EventWrap newInstance() {
              return (de.zib.museum.museumdat.EventWrapDocument.EventWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.EventWrapDocument.EventWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.EventWrapDocument.EventWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.EventWrapDocument newInstance() {
          return (de.zib.museum.museumdat.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.EventWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.EventWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.EventWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.EventWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.EventWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.EventWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.EventWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.EventWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.EventWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.EventWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.EventWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.EventWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.EventWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.EventWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.EventWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.EventWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.EventWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.EventWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
