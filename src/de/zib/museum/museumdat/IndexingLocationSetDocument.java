/*
 * An XML document type.
 * Localname: indexingLocationSet
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.IndexingLocationSetDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat;


/**
 * A document containing one indexingLocationSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface IndexingLocationSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingLocationSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("indexinglocationsete598doctype");
    
    /**
     * Gets the "indexingLocationSet" element
     */
    de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet getIndexingLocationSet();
    
    /**
     * Sets the "indexingLocationSet" element
     */
    void setIndexingLocationSet(de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet indexingLocationSet);
    
    /**
     * Appends and returns a new empty "indexingLocationSet" element
     */
    de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet addNewIndexingLocationSet();
    
    /**
     * An XML indexingLocationSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface IndexingLocationSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingLocationSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("indexinglocationsetd84felemtype");
        
        /**
         * Gets a List of "nameLocationSet" elements
         */
        java.util.List<de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet> getNameLocationSetList();
        
        /**
         * Gets array of all "nameLocationSet" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet[] getNameLocationSetArray();
        
        /**
         * Gets ith "nameLocationSet" element
         */
        de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet getNameLocationSetArray(int i);
        
        /**
         * Returns number of "nameLocationSet" element
         */
        int sizeOfNameLocationSetArray();
        
        /**
         * Sets array of all "nameLocationSet" element
         */
        void setNameLocationSetArray(de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet[] nameLocationSetArray);
        
        /**
         * Sets ith "nameLocationSet" element
         */
        void setNameLocationSetArray(int i, de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet nameLocationSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "nameLocationSet" element
         */
        de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet insertNewNameLocationSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "nameLocationSet" element
         */
        de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet addNewNameLocationSet();
        
        /**
         * Removes the ith "nameLocationSet" element
         */
        void removeNameLocationSet(int i);
        
        /**
         * Gets the "politicalEntity" attribute
         */
        java.lang.String getPoliticalEntity();
        
        /**
         * Gets (as xml) the "politicalEntity" attribute
         */
        org.apache.xmlbeans.XmlString xgetPoliticalEntity();
        
        /**
         * True if has "politicalEntity" attribute
         */
        boolean isSetPoliticalEntity();
        
        /**
         * Sets the "politicalEntity" attribute
         */
        void setPoliticalEntity(java.lang.String politicalEntity);
        
        /**
         * Sets (as xml) the "politicalEntity" attribute
         */
        void xsetPoliticalEntity(org.apache.xmlbeans.XmlString politicalEntity);
        
        /**
         * Unsets the "politicalEntity" attribute
         */
        void unsetPoliticalEntity();
        
        /**
         * Gets the "geographicalEntity" attribute
         */
        java.lang.String getGeographicalEntity();
        
        /**
         * Gets (as xml) the "geographicalEntity" attribute
         */
        org.apache.xmlbeans.XmlString xgetGeographicalEntity();
        
        /**
         * True if has "geographicalEntity" attribute
         */
        boolean isSetGeographicalEntity();
        
        /**
         * Sets the "geographicalEntity" attribute
         */
        void setGeographicalEntity(java.lang.String geographicalEntity);
        
        /**
         * Sets (as xml) the "geographicalEntity" attribute
         */
        void xsetGeographicalEntity(org.apache.xmlbeans.XmlString geographicalEntity);
        
        /**
         * Unsets the "geographicalEntity" attribute
         */
        void unsetGeographicalEntity();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet newInstance() {
              return (de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.IndexingLocationSetDocument newInstance() {
          return (de.zib.museum.museumdat.IndexingLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.IndexingLocationSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.IndexingLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.IndexingLocationSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingLocationSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.IndexingLocationSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingLocationSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingLocationSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingLocationSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingLocationSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingLocationSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingLocationSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingLocationSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingLocationSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingLocationSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingLocationSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingLocationSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.IndexingLocationSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.IndexingLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.IndexingLocationSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.IndexingLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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