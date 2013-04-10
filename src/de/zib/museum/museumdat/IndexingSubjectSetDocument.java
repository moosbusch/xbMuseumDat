/*
 * An XML document type.
 * Localname: indexingSubjectSet
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.IndexingSubjectSetDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat;


/**
 * A document containing one indexingSubjectSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface IndexingSubjectSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingSubjectSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("indexingsubjectset67dddoctype");
    
    /**
     * Gets the "indexingSubjectSet" element
     */
    de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet getIndexingSubjectSet();
    
    /**
     * Sets the "indexingSubjectSet" element
     */
    void setIndexingSubjectSet(de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet indexingSubjectSet);
    
    /**
     * Appends and returns a new empty "indexingSubjectSet" element
     */
    de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet addNewIndexingSubjectSet();
    
    /**
     * An XML indexingSubjectSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface IndexingSubjectSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingSubjectSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("indexingsubjectset9affelemtype");
        
        /**
         * Gets the "extentSubject" element
         */
        de.zib.museum.museumdat.ExtentSubjectDocument.ExtentSubject getExtentSubject();
        
        /**
         * True if has "extentSubject" element
         */
        boolean isSetExtentSubject();
        
        /**
         * Sets the "extentSubject" element
         */
        void setExtentSubject(de.zib.museum.museumdat.ExtentSubjectDocument.ExtentSubject extentSubject);
        
        /**
         * Appends and returns a new empty "extentSubject" element
         */
        de.zib.museum.museumdat.ExtentSubjectDocument.ExtentSubject addNewExtentSubject();
        
        /**
         * Unsets the "extentSubject" element
         */
        void unsetExtentSubject();
        
        /**
         * Gets a List of "subjectTerm" elements
         */
        java.util.List<de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm> getSubjectTermList();
        
        /**
         * Gets array of all "subjectTerm" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm[] getSubjectTermArray();
        
        /**
         * Gets ith "subjectTerm" element
         */
        de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm getSubjectTermArray(int i);
        
        /**
         * Returns number of "subjectTerm" element
         */
        int sizeOfSubjectTermArray();
        
        /**
         * Sets array of all "subjectTerm" element
         */
        void setSubjectTermArray(de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm[] subjectTermArray);
        
        /**
         * Sets ith "subjectTerm" element
         */
        void setSubjectTermArray(int i, de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm subjectTerm);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "subjectTerm" element
         */
        de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm insertNewSubjectTerm(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "subjectTerm" element
         */
        de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm addNewSubjectTerm();
        
        /**
         * Removes the ith "subjectTerm" element
         */
        void removeSubjectTerm(int i);
        
        /**
         * Gets the "type" attribute
         */
        java.lang.String getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        org.apache.xmlbeans.XmlString xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(java.lang.String type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(org.apache.xmlbeans.XmlString type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet newInstance() {
              return (de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.IndexingSubjectSetDocument newInstance() {
          return (de.zib.museum.museumdat.IndexingSubjectSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.IndexingSubjectSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.IndexingSubjectSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.IndexingSubjectSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingSubjectSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingSubjectSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingSubjectSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.IndexingSubjectSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingSubjectSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingSubjectSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingSubjectSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingSubjectSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingSubjectSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingSubjectSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingSubjectSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingSubjectSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingSubjectSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingSubjectSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingSubjectSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingSubjectSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingSubjectSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingSubjectSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingSubjectSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingSubjectSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingSubjectSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingSubjectSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingSubjectSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingSubjectSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingSubjectSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingSubjectSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingSubjectSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.IndexingSubjectSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.IndexingSubjectSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.IndexingSubjectSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.IndexingSubjectSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
