/*
 * An XML document type.
 * Localname: recordWrap
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.RecordWrapDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat;


/**
 * A document containing one recordWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface RecordWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecordWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("recordwrap5588doctype");
    
    /**
     * Gets the "recordWrap" element
     */
    de.zib.museum.museumdat.RecordWrapDocument.RecordWrap getRecordWrap();
    
    /**
     * Sets the "recordWrap" element
     */
    void setRecordWrap(de.zib.museum.museumdat.RecordWrapDocument.RecordWrap recordWrap);
    
    /**
     * Appends and returns a new empty "recordWrap" element
     */
    de.zib.museum.museumdat.RecordWrapDocument.RecordWrap addNewRecordWrap();
    
    /**
     * An XML recordWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface RecordWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecordWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("recordwrapf9dfelemtype");
        
        /**
         * Gets a List of "recordID" elements
         */
        java.util.List<de.zib.museum.museumdat.RecordIDDocument.RecordID> getRecordIDList();
        
        /**
         * Gets array of all "recordID" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.RecordIDDocument.RecordID[] getRecordIDArray();
        
        /**
         * Gets ith "recordID" element
         */
        de.zib.museum.museumdat.RecordIDDocument.RecordID getRecordIDArray(int i);
        
        /**
         * Returns number of "recordID" element
         */
        int sizeOfRecordIDArray();
        
        /**
         * Sets array of all "recordID" element
         */
        void setRecordIDArray(de.zib.museum.museumdat.RecordIDDocument.RecordID[] recordIDArray);
        
        /**
         * Sets ith "recordID" element
         */
        void setRecordIDArray(int i, de.zib.museum.museumdat.RecordIDDocument.RecordID recordID);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordID" element
         */
        de.zib.museum.museumdat.RecordIDDocument.RecordID insertNewRecordID(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordID" element
         */
        de.zib.museum.museumdat.RecordIDDocument.RecordID addNewRecordID();
        
        /**
         * Removes the ith "recordID" element
         */
        void removeRecordID(int i);
        
        /**
         * Gets the "recordType" element
         */
        de.zib.museum.museumdat.RecordTypeDocument.RecordType getRecordType();
        
        /**
         * Sets the "recordType" element
         */
        void setRecordType(de.zib.museum.museumdat.RecordTypeDocument.RecordType recordType);
        
        /**
         * Appends and returns a new empty "recordType" element
         */
        de.zib.museum.museumdat.RecordTypeDocument.RecordType addNewRecordType();
        
        /**
         * Gets a List of "recordSource" elements
         */
        java.util.List<de.zib.museum.museumdat.RecordSourceDocument.RecordSource> getRecordSourceList();
        
        /**
         * Gets array of all "recordSource" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.RecordSourceDocument.RecordSource[] getRecordSourceArray();
        
        /**
         * Gets ith "recordSource" element
         */
        de.zib.museum.museumdat.RecordSourceDocument.RecordSource getRecordSourceArray(int i);
        
        /**
         * Returns number of "recordSource" element
         */
        int sizeOfRecordSourceArray();
        
        /**
         * Sets array of all "recordSource" element
         */
        void setRecordSourceArray(de.zib.museum.museumdat.RecordSourceDocument.RecordSource[] recordSourceArray);
        
        /**
         * Sets ith "recordSource" element
         */
        void setRecordSourceArray(int i, de.zib.museum.museumdat.RecordSourceDocument.RecordSource recordSource);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordSource" element
         */
        de.zib.museum.museumdat.RecordSourceDocument.RecordSource insertNewRecordSource(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordSource" element
         */
        de.zib.museum.museumdat.RecordSourceDocument.RecordSource addNewRecordSource();
        
        /**
         * Removes the ith "recordSource" element
         */
        void removeRecordSource(int i);
        
        /**
         * Gets a List of "recordInfoSet" elements
         */
        java.util.List<de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet> getRecordInfoSetList();
        
        /**
         * Gets array of all "recordInfoSet" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet[] getRecordInfoSetArray();
        
        /**
         * Gets ith "recordInfoSet" element
         */
        de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet getRecordInfoSetArray(int i);
        
        /**
         * Returns number of "recordInfoSet" element
         */
        int sizeOfRecordInfoSetArray();
        
        /**
         * Sets array of all "recordInfoSet" element
         */
        void setRecordInfoSetArray(de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet[] recordInfoSetArray);
        
        /**
         * Sets ith "recordInfoSet" element
         */
        void setRecordInfoSetArray(int i, de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet recordInfoSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordInfoSet" element
         */
        de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet insertNewRecordInfoSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordInfoSet" element
         */
        de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet addNewRecordInfoSet();
        
        /**
         * Removes the ith "recordInfoSet" element
         */
        void removeRecordInfoSet(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.RecordWrapDocument.RecordWrap newInstance() {
              return (de.zib.museum.museumdat.RecordWrapDocument.RecordWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.RecordWrapDocument.RecordWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.RecordWrapDocument.RecordWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.RecordWrapDocument newInstance() {
          return (de.zib.museum.museumdat.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.RecordWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.RecordWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.RecordWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.RecordWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.RecordWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.RecordWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.RecordWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.RecordWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.RecordWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.RecordWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.RecordWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.RecordWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.RecordWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.RecordWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.RecordWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.RecordWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.RecordWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.RecordWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
