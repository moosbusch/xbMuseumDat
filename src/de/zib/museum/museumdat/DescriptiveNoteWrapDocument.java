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
 * A document containing one descriptiveNoteWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface DescriptiveNoteWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptiveNoteWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("descriptivenotewrapb06ddoctype");
    
    /**
     * Gets the "descriptiveNoteWrap" element
     */
    de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap getDescriptiveNoteWrap();
    
    /**
     * Sets the "descriptiveNoteWrap" element
     */
    void setDescriptiveNoteWrap(de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap descriptiveNoteWrap);
    
    /**
     * Appends and returns a new empty "descriptiveNoteWrap" element
     */
    de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap addNewDescriptiveNoteWrap();
    
    /**
     * An XML descriptiveNoteWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface DescriptiveNoteWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptiveNoteWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("descriptivenotewrap7039elemtype");
        
        /**
         * Gets a List of "descriptiveNoteSet" elements
         */
        java.util.List<de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet> getDescriptiveNoteSetList();
        
        /**
         * Gets array of all "descriptiveNoteSet" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet[] getDescriptiveNoteSetArray();
        
        /**
         * Gets ith "descriptiveNoteSet" element
         */
        de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet getDescriptiveNoteSetArray(int i);
        
        /**
         * Returns number of "descriptiveNoteSet" element
         */
        int sizeOfDescriptiveNoteSetArray();
        
        /**
         * Sets array of all "descriptiveNoteSet" element
         */
        void setDescriptiveNoteSetArray(de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet[] descriptiveNoteSetArray);
        
        /**
         * Sets ith "descriptiveNoteSet" element
         */
        void setDescriptiveNoteSetArray(int i, de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet descriptiveNoteSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "descriptiveNoteSet" element
         */
        de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet insertNewDescriptiveNoteSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "descriptiveNoteSet" element
         */
        de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet addNewDescriptiveNoteSet();
        
        /**
         * Removes the ith "descriptiveNoteSet" element
         */
        void removeDescriptiveNoteSet(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap newInstance() {
              return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument newInstance() {
          return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.DescriptiveNoteWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.DescriptiveNoteWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
