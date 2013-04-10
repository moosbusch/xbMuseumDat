/*
 * An XML document type.
 * Localname: objectWorkTypeWrap
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.ObjectWorkTypeWrapDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat;


/**
 * A document containing one objectWorkTypeWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface ObjectWorkTypeWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectWorkTypeWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("objectworktypewrapadefdoctype");
    
    /**
     * Gets the "objectWorkTypeWrap" element
     */
    de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap getObjectWorkTypeWrap();
    
    /**
     * Sets the "objectWorkTypeWrap" element
     */
    void setObjectWorkTypeWrap(de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap objectWorkTypeWrap);
    
    /**
     * Appends and returns a new empty "objectWorkTypeWrap" element
     */
    de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap addNewObjectWorkTypeWrap();
    
    /**
     * An XML objectWorkTypeWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface ObjectWorkTypeWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObjectWorkTypeWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("objectworktypewrap7a3felemtype");
        
        /**
         * Gets a List of "objectWorkType" elements
         */
        java.util.List<de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType> getObjectWorkTypeList();
        
        /**
         * Gets array of all "objectWorkType" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType[] getObjectWorkTypeArray();
        
        /**
         * Gets ith "objectWorkType" element
         */
        de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType getObjectWorkTypeArray(int i);
        
        /**
         * Returns number of "objectWorkType" element
         */
        int sizeOfObjectWorkTypeArray();
        
        /**
         * Sets array of all "objectWorkType" element
         */
        void setObjectWorkTypeArray(de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType[] objectWorkTypeArray);
        
        /**
         * Sets ith "objectWorkType" element
         */
        void setObjectWorkTypeArray(int i, de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType objectWorkType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "objectWorkType" element
         */
        de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType insertNewObjectWorkType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "objectWorkType" element
         */
        de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType addNewObjectWorkType();
        
        /**
         * Removes the ith "objectWorkType" element
         */
        void removeObjectWorkType(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap newInstance() {
              return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument newInstance() {
          return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.ObjectWorkTypeWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
