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
 * A document containing one displayStateEditionWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface DisplayStateEditionWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DisplayStateEditionWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("displaystateeditionwrap135cdoctype");
    
    /**
     * Gets the "displayStateEditionWrap" element
     */
    de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap getDisplayStateEditionWrap();
    
    /**
     * Sets the "displayStateEditionWrap" element
     */
    void setDisplayStateEditionWrap(de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap displayStateEditionWrap);
    
    /**
     * Appends and returns a new empty "displayStateEditionWrap" element
     */
    de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap addNewDisplayStateEditionWrap();
    
    /**
     * An XML displayStateEditionWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface DisplayStateEditionWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DisplayStateEditionWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("displaystateeditionwrapabd7elemtype");
        
        /**
         * Gets a List of "displayState" elements
         */
        java.util.List<de.zib.museum.museumdat.DisplayStateDocument.DisplayState> getDisplayStateList();
        
        /**
         * Gets array of all "displayState" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.DisplayStateDocument.DisplayState[] getDisplayStateArray();
        
        /**
         * Gets ith "displayState" element
         */
        de.zib.museum.museumdat.DisplayStateDocument.DisplayState getDisplayStateArray(int i);
        
        /**
         * Returns number of "displayState" element
         */
        int sizeOfDisplayStateArray();
        
        /**
         * Sets array of all "displayState" element
         */
        void setDisplayStateArray(de.zib.museum.museumdat.DisplayStateDocument.DisplayState[] displayStateArray);
        
        /**
         * Sets ith "displayState" element
         */
        void setDisplayStateArray(int i, de.zib.museum.museumdat.DisplayStateDocument.DisplayState displayState);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "displayState" element
         */
        de.zib.museum.museumdat.DisplayStateDocument.DisplayState insertNewDisplayState(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "displayState" element
         */
        de.zib.museum.museumdat.DisplayStateDocument.DisplayState addNewDisplayState();
        
        /**
         * Removes the ith "displayState" element
         */
        void removeDisplayState(int i);
        
        /**
         * Gets a List of "displayEdition" elements
         */
        java.util.List<de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition> getDisplayEditionList();
        
        /**
         * Gets array of all "displayEdition" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition[] getDisplayEditionArray();
        
        /**
         * Gets ith "displayEdition" element
         */
        de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition getDisplayEditionArray(int i);
        
        /**
         * Returns number of "displayEdition" element
         */
        int sizeOfDisplayEditionArray();
        
        /**
         * Sets array of all "displayEdition" element
         */
        void setDisplayEditionArray(de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition[] displayEditionArray);
        
        /**
         * Sets ith "displayEdition" element
         */
        void setDisplayEditionArray(int i, de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition displayEdition);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "displayEdition" element
         */
        de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition insertNewDisplayEdition(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "displayEdition" element
         */
        de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition addNewDisplayEdition();
        
        /**
         * Removes the ith "displayEdition" element
         */
        void removeDisplayEdition(int i);
        
        /**
         * Gets a List of "sourceStateEdition" elements
         */
        java.util.List<de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition> getSourceStateEditionList();
        
        /**
         * Gets array of all "sourceStateEdition" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition[] getSourceStateEditionArray();
        
        /**
         * Gets ith "sourceStateEdition" element
         */
        de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition getSourceStateEditionArray(int i);
        
        /**
         * Returns number of "sourceStateEdition" element
         */
        int sizeOfSourceStateEditionArray();
        
        /**
         * Sets array of all "sourceStateEdition" element
         */
        void setSourceStateEditionArray(de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition[] sourceStateEditionArray);
        
        /**
         * Sets ith "sourceStateEdition" element
         */
        void setSourceStateEditionArray(int i, de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition sourceStateEdition);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceStateEdition" element
         */
        de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition insertNewSourceStateEdition(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceStateEdition" element
         */
        de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition addNewSourceStateEdition();
        
        /**
         * Removes the ith "sourceStateEdition" element
         */
        void removeSourceStateEdition(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap newInstance() {
              return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument newInstance() {
          return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.DisplayStateEditionWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.DisplayStateEditionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
