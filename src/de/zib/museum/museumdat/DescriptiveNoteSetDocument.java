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
 * A document containing one descriptiveNoteSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface DescriptiveNoteSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptiveNoteSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("descriptivenoteset04ffdoctype");
    
    /**
     * Gets the "descriptiveNoteSet" element
     */
    de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet getDescriptiveNoteSet();
    
    /**
     * Sets the "descriptiveNoteSet" element
     */
    void setDescriptiveNoteSet(de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet descriptiveNoteSet);
    
    /**
     * Appends and returns a new empty "descriptiveNoteSet" element
     */
    de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet addNewDescriptiveNoteSet();
    
    /**
     * An XML descriptiveNoteSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface DescriptiveNoteSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptiveNoteSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("descriptivenoteset843felemtype");
        
        /**
         * Gets the "descriptiveNote" element
         */
        de.zib.museum.museumdat.DescriptiveNoteDocument.DescriptiveNote getDescriptiveNote();
        
        /**
         * True if has "descriptiveNote" element
         */
        boolean isSetDescriptiveNote();
        
        /**
         * Sets the "descriptiveNote" element
         */
        void setDescriptiveNote(de.zib.museum.museumdat.DescriptiveNoteDocument.DescriptiveNote descriptiveNote);
        
        /**
         * Appends and returns a new empty "descriptiveNote" element
         */
        de.zib.museum.museumdat.DescriptiveNoteDocument.DescriptiveNote addNewDescriptiveNote();
        
        /**
         * Unsets the "descriptiveNote" element
         */
        void unsetDescriptiveNote();
        
        /**
         * Gets a List of "sourceDescriptiveNote" elements
         */
        java.util.List<de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote> getSourceDescriptiveNoteList();
        
        /**
         * Gets array of all "sourceDescriptiveNote" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote[] getSourceDescriptiveNoteArray();
        
        /**
         * Gets ith "sourceDescriptiveNote" element
         */
        de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote getSourceDescriptiveNoteArray(int i);
        
        /**
         * Returns number of "sourceDescriptiveNote" element
         */
        int sizeOfSourceDescriptiveNoteArray();
        
        /**
         * Sets array of all "sourceDescriptiveNote" element
         */
        void setSourceDescriptiveNoteArray(de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote[] sourceDescriptiveNoteArray);
        
        /**
         * Sets ith "sourceDescriptiveNote" element
         */
        void setSourceDescriptiveNoteArray(int i, de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote sourceDescriptiveNote);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceDescriptiveNote" element
         */
        de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote insertNewSourceDescriptiveNote(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceDescriptiveNote" element
         */
        de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote addNewSourceDescriptiveNote();
        
        /**
         * Removes the ith "sourceDescriptiveNote" element
         */
        void removeSourceDescriptiveNote(int i);
        
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
            public static de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet newInstance() {
              return (de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.DescriptiveNoteSetDocument newInstance() {
          return (de.zib.museum.museumdat.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.DescriptiveNoteSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.DescriptiveNoteSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveNoteSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.DescriptiveNoteSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.DescriptiveNoteSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.DescriptiveNoteSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
