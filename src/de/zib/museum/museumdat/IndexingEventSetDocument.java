/*
 * An XML document type.
 * Localname: indexingEventSet
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.IndexingEventSetDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat;


/**
 * A document containing one indexingEventSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface IndexingEventSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingEventSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("indexingeventset6b8bdoctype");
    
    /**
     * Gets the "indexingEventSet" element
     */
    de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet getIndexingEventSet();
    
    /**
     * Sets the "indexingEventSet" element
     */
    void setIndexingEventSet(de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet indexingEventSet);
    
    /**
     * Appends and returns a new empty "indexingEventSet" element
     */
    de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet addNewIndexingEventSet();
    
    /**
     * An XML indexingEventSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface IndexingEventSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingEventSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("indexingeventset6c7felemtype");
        
        /**
         * Gets the "eventType" element
         */
        de.zib.museum.museumdat.EventTypeDocument.EventType getEventType();
        
        /**
         * Sets the "eventType" element
         */
        void setEventType(de.zib.museum.museumdat.EventTypeDocument.EventType eventType);
        
        /**
         * Appends and returns a new empty "eventType" element
         */
        de.zib.museum.museumdat.EventTypeDocument.EventType addNewEventType();
        
        /**
         * Gets a List of "indexingActorSet" elements
         */
        java.util.List<de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet> getIndexingActorSetList();
        
        /**
         * Gets array of all "indexingActorSet" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet[] getIndexingActorSetArray();
        
        /**
         * Gets ith "indexingActorSet" element
         */
        de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet getIndexingActorSetArray(int i);
        
        /**
         * Returns number of "indexingActorSet" element
         */
        int sizeOfIndexingActorSetArray();
        
        /**
         * Sets array of all "indexingActorSet" element
         */
        void setIndexingActorSetArray(de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet[] indexingActorSetArray);
        
        /**
         * Sets ith "indexingActorSet" element
         */
        void setIndexingActorSetArray(int i, de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet indexingActorSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "indexingActorSet" element
         */
        de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet insertNewIndexingActorSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "indexingActorSet" element
         */
        de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet addNewIndexingActorSet();
        
        /**
         * Removes the ith "indexingActorSet" element
         */
        void removeIndexingActorSet(int i);
        
        /**
         * Gets the "indexingDates" element
         */
        de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates getIndexingDates();
        
        /**
         * True if has "indexingDates" element
         */
        boolean isSetIndexingDates();
        
        /**
         * Sets the "indexingDates" element
         */
        void setIndexingDates(de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates indexingDates);
        
        /**
         * Appends and returns a new empty "indexingDates" element
         */
        de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates addNewIndexingDates();
        
        /**
         * Unsets the "indexingDates" element
         */
        void unsetIndexingDates();
        
        /**
         * Gets the "indexingLocationWrap" element
         */
        de.zib.museum.museumdat.IndexingLocationWrapDocument.IndexingLocationWrap getIndexingLocationWrap();
        
        /**
         * True if has "indexingLocationWrap" element
         */
        boolean isSetIndexingLocationWrap();
        
        /**
         * Sets the "indexingLocationWrap" element
         */
        void setIndexingLocationWrap(de.zib.museum.museumdat.IndexingLocationWrapDocument.IndexingLocationWrap indexingLocationWrap);
        
        /**
         * Appends and returns a new empty "indexingLocationWrap" element
         */
        de.zib.museum.museumdat.IndexingLocationWrapDocument.IndexingLocationWrap addNewIndexingLocationWrap();
        
        /**
         * Unsets the "indexingLocationWrap" element
         */
        void unsetIndexingLocationWrap();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet newInstance() {
              return (de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.IndexingEventSetDocument newInstance() {
          return (de.zib.museum.museumdat.IndexingEventSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.IndexingEventSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.IndexingEventSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.IndexingEventSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingEventSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingEventSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingEventSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.IndexingEventSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingEventSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingEventSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingEventSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingEventSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingEventSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingEventSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingEventSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingEventSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingEventSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingEventSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingEventSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingEventSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingEventSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingEventSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingEventSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingEventSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingEventSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingEventSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingEventSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingEventSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingEventSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingEventSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingEventSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.IndexingEventSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.IndexingEventSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.IndexingEventSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.IndexingEventSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
