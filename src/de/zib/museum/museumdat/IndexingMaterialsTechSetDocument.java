/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.zib.museum.museumdat;


/**
 * A document containing one indexingMaterialsTechSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface IndexingMaterialsTechSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingMaterialsTechSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("indexingmaterialstechset00d3doctype");
    
    /**
     * Gets the "indexingMaterialsTechSet" element
     */
    de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet getIndexingMaterialsTechSet();
    
    /**
     * Sets the "indexingMaterialsTechSet" element
     */
    void setIndexingMaterialsTechSet(de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet indexingMaterialsTechSet);
    
    /**
     * Appends and returns a new empty "indexingMaterialsTechSet" element
     */
    de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet addNewIndexingMaterialsTechSet();
    
    /**
     * An XML indexingMaterialsTechSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface IndexingMaterialsTechSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingMaterialsTechSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("indexingmaterialstechset5c7felemtype");
        
        /**
         * Gets a List of "termMaterialsTech" elements
         */
        java.util.List<de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech> getTermMaterialsTechList();
        
        /**
         * Gets array of all "termMaterialsTech" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech[] getTermMaterialsTechArray();
        
        /**
         * Gets ith "termMaterialsTech" element
         */
        de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech getTermMaterialsTechArray(int i);
        
        /**
         * Returns number of "termMaterialsTech" element
         */
        int sizeOfTermMaterialsTechArray();
        
        /**
         * Sets array of all "termMaterialsTech" element
         */
        void setTermMaterialsTechArray(de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech[] termMaterialsTechArray);
        
        /**
         * Sets ith "termMaterialsTech" element
         */
        void setTermMaterialsTechArray(int i, de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech termMaterialsTech);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "termMaterialsTech" element
         */
        de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech insertNewTermMaterialsTech(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "termMaterialsTech" element
         */
        de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech addNewTermMaterialsTech();
        
        /**
         * Removes the ith "termMaterialsTech" element
         */
        void removeTermMaterialsTech(int i);
        
        /**
         * Gets a List of "extentMaterialsTech" elements
         */
        java.util.List<de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech> getExtentMaterialsTechList();
        
        /**
         * Gets array of all "extentMaterialsTech" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech[] getExtentMaterialsTechArray();
        
        /**
         * Gets ith "extentMaterialsTech" element
         */
        de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech getExtentMaterialsTechArray(int i);
        
        /**
         * Returns number of "extentMaterialsTech" element
         */
        int sizeOfExtentMaterialsTechArray();
        
        /**
         * Sets array of all "extentMaterialsTech" element
         */
        void setExtentMaterialsTechArray(de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech[] extentMaterialsTechArray);
        
        /**
         * Sets ith "extentMaterialsTech" element
         */
        void setExtentMaterialsTechArray(int i, de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech extentMaterialsTech);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extentMaterialsTech" element
         */
        de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech insertNewExtentMaterialsTech(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extentMaterialsTech" element
         */
        de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech addNewExtentMaterialsTech();
        
        /**
         * Removes the ith "extentMaterialsTech" element
         */
        void removeExtentMaterialsTech(int i);
        
        /**
         * Gets a List of "sourceMaterialsTech" elements
         */
        java.util.List<de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech> getSourceMaterialsTechList();
        
        /**
         * Gets array of all "sourceMaterialsTech" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech[] getSourceMaterialsTechArray();
        
        /**
         * Gets ith "sourceMaterialsTech" element
         */
        de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech getSourceMaterialsTechArray(int i);
        
        /**
         * Returns number of "sourceMaterialsTech" element
         */
        int sizeOfSourceMaterialsTechArray();
        
        /**
         * Sets array of all "sourceMaterialsTech" element
         */
        void setSourceMaterialsTechArray(de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech[] sourceMaterialsTechArray);
        
        /**
         * Sets ith "sourceMaterialsTech" element
         */
        void setSourceMaterialsTechArray(int i, de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech sourceMaterialsTech);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceMaterialsTech" element
         */
        de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech insertNewSourceMaterialsTech(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceMaterialsTech" element
         */
        de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech addNewSourceMaterialsTech();
        
        /**
         * Removes the ith "sourceMaterialsTech" element
         */
        void removeSourceMaterialsTech(int i);
        
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
            public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet newInstance() {
              return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument newInstance() {
          return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.IndexingMaterialsTechSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.IndexingMaterialsTechSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
