/*
 * An XML document type.
 * Localname: nameLocationSet
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.NameLocationSetDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat;


/**
 * A document containing one nameLocationSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface NameLocationSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NameLocationSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("namelocationset6513doctype");
    
    /**
     * Gets the "nameLocationSet" element
     */
    de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet getNameLocationSet();
    
    /**
     * Sets the "nameLocationSet" element
     */
    void setNameLocationSet(de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet nameLocationSet);
    
    /**
     * Appends and returns a new empty "nameLocationSet" element
     */
    de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet addNewNameLocationSet();
    
    /**
     * An XML nameLocationSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface NameLocationSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NameLocationSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("namelocationset2985elemtype");
        
        /**
         * Gets the "nameLocation" element
         */
        de.zib.museum.museumdat.NameLocationDocument.NameLocation getNameLocation();
        
        /**
         * Sets the "nameLocation" element
         */
        void setNameLocation(de.zib.museum.museumdat.NameLocationDocument.NameLocation nameLocation);
        
        /**
         * Appends and returns a new empty "nameLocation" element
         */
        de.zib.museum.museumdat.NameLocationDocument.NameLocation addNewNameLocation();
        
        /**
         * Gets a List of "sourceNameLocation" elements
         */
        java.util.List<de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation> getSourceNameLocationList();
        
        /**
         * Gets array of all "sourceNameLocation" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation[] getSourceNameLocationArray();
        
        /**
         * Gets ith "sourceNameLocation" element
         */
        de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation getSourceNameLocationArray(int i);
        
        /**
         * Returns number of "sourceNameLocation" element
         */
        int sizeOfSourceNameLocationArray();
        
        /**
         * Sets array of all "sourceNameLocation" element
         */
        void setSourceNameLocationArray(de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation[] sourceNameLocationArray);
        
        /**
         * Sets ith "sourceNameLocation" element
         */
        void setSourceNameLocationArray(int i, de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation sourceNameLocation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceNameLocation" element
         */
        de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation insertNewSourceNameLocation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceNameLocation" element
         */
        de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation addNewSourceNameLocation();
        
        /**
         * Removes the ith "sourceNameLocation" element
         */
        void removeSourceNameLocation(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet newInstance() {
              return (de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.NameLocationSetDocument newInstance() {
          return (de.zib.museum.museumdat.NameLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.NameLocationSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.NameLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.NameLocationSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.NameLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.NameLocationSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.NameLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.NameLocationSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.NameLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.NameLocationSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.NameLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.NameLocationSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.NameLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.NameLocationSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.NameLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.NameLocationSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.NameLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.NameLocationSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.NameLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.NameLocationSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.NameLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.NameLocationSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.NameLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.NameLocationSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.NameLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.NameLocationSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.NameLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.NameLocationSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.NameLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.NameLocationSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.NameLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.NameLocationSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.NameLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.NameLocationSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.NameLocationSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
