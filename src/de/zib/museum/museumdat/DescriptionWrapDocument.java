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
 * A document containing one descriptionWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface DescriptionWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptionWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("descriptionwrap8f0fdoctype");
    
    /**
     * Gets the "descriptionWrap" element
     */
    de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap getDescriptionWrap();
    
    /**
     * Sets the "descriptionWrap" element
     */
    void setDescriptionWrap(de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap descriptionWrap);
    
    /**
     * Appends and returns a new empty "descriptionWrap" element
     */
    de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap addNewDescriptionWrap();
    
    /**
     * An XML descriptionWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface DescriptionWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptionWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("descriptionwrap767delemtype");
        
        /**
         * Gets the "displayCreator" element
         */
        de.zib.museum.museumdat.DisplayCreatorDocument.DisplayCreator getDisplayCreator();
        
        /**
         * True if has "displayCreator" element
         */
        boolean isSetDisplayCreator();
        
        /**
         * Sets the "displayCreator" element
         */
        void setDisplayCreator(de.zib.museum.museumdat.DisplayCreatorDocument.DisplayCreator displayCreator);
        
        /**
         * Appends and returns a new empty "displayCreator" element
         */
        de.zib.museum.museumdat.DisplayCreatorDocument.DisplayCreator addNewDisplayCreator();
        
        /**
         * Unsets the "displayCreator" element
         */
        void unsetDisplayCreator();
        
        /**
         * Gets the "displayCreationDate" element
         */
        de.zib.museum.museumdat.DisplayCreationDateDocument.DisplayCreationDate getDisplayCreationDate();
        
        /**
         * True if has "displayCreationDate" element
         */
        boolean isSetDisplayCreationDate();
        
        /**
         * Sets the "displayCreationDate" element
         */
        void setDisplayCreationDate(de.zib.museum.museumdat.DisplayCreationDateDocument.DisplayCreationDate displayCreationDate);
        
        /**
         * Appends and returns a new empty "displayCreationDate" element
         */
        de.zib.museum.museumdat.DisplayCreationDateDocument.DisplayCreationDate addNewDisplayCreationDate();
        
        /**
         * Unsets the "displayCreationDate" element
         */
        void unsetDisplayCreationDate();
        
        /**
         * Gets the "displayCreationLocation" element
         */
        de.zib.museum.museumdat.DisplayCreationLocationDocument.DisplayCreationLocation getDisplayCreationLocation();
        
        /**
         * True if has "displayCreationLocation" element
         */
        boolean isSetDisplayCreationLocation();
        
        /**
         * Sets the "displayCreationLocation" element
         */
        void setDisplayCreationLocation(de.zib.museum.museumdat.DisplayCreationLocationDocument.DisplayCreationLocation displayCreationLocation);
        
        /**
         * Appends and returns a new empty "displayCreationLocation" element
         */
        de.zib.museum.museumdat.DisplayCreationLocationDocument.DisplayCreationLocation addNewDisplayCreationLocation();
        
        /**
         * Unsets the "displayCreationLocation" element
         */
        void unsetDisplayCreationLocation();
        
        /**
         * Gets the "displayMeasurements" element
         */
        de.zib.museum.museumdat.DisplayMeasurementsDocument.DisplayMeasurements getDisplayMeasurements();
        
        /**
         * True if has "displayMeasurements" element
         */
        boolean isSetDisplayMeasurements();
        
        /**
         * Sets the "displayMeasurements" element
         */
        void setDisplayMeasurements(de.zib.museum.museumdat.DisplayMeasurementsDocument.DisplayMeasurements displayMeasurements);
        
        /**
         * Appends and returns a new empty "displayMeasurements" element
         */
        de.zib.museum.museumdat.DisplayMeasurementsDocument.DisplayMeasurements addNewDisplayMeasurements();
        
        /**
         * Unsets the "displayMeasurements" element
         */
        void unsetDisplayMeasurements();
        
        /**
         * Gets the "displayMaterialsTech" element
         */
        de.zib.museum.museumdat.DisplayMaterialsTechDocument.DisplayMaterialsTech getDisplayMaterialsTech();
        
        /**
         * True if has "displayMaterialsTech" element
         */
        boolean isSetDisplayMaterialsTech();
        
        /**
         * Sets the "displayMaterialsTech" element
         */
        void setDisplayMaterialsTech(de.zib.museum.museumdat.DisplayMaterialsTechDocument.DisplayMaterialsTech displayMaterialsTech);
        
        /**
         * Appends and returns a new empty "displayMaterialsTech" element
         */
        de.zib.museum.museumdat.DisplayMaterialsTechDocument.DisplayMaterialsTech addNewDisplayMaterialsTech();
        
        /**
         * Unsets the "displayMaterialsTech" element
         */
        void unsetDisplayMaterialsTech();
        
        /**
         * Gets the "displayStateEditionWrap" element
         */
        de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap getDisplayStateEditionWrap();
        
        /**
         * True if has "displayStateEditionWrap" element
         */
        boolean isSetDisplayStateEditionWrap();
        
        /**
         * Sets the "displayStateEditionWrap" element
         */
        void setDisplayStateEditionWrap(de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap displayStateEditionWrap);
        
        /**
         * Appends and returns a new empty "displayStateEditionWrap" element
         */
        de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap addNewDisplayStateEditionWrap();
        
        /**
         * Unsets the "displayStateEditionWrap" element
         */
        void unsetDisplayStateEditionWrap();
        
        /**
         * Gets the "displayEventWrap" element
         */
        de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap getDisplayEventWrap();
        
        /**
         * True if has "displayEventWrap" element
         */
        boolean isSetDisplayEventWrap();
        
        /**
         * Sets the "displayEventWrap" element
         */
        void setDisplayEventWrap(de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap displayEventWrap);
        
        /**
         * Appends and returns a new empty "displayEventWrap" element
         */
        de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap addNewDisplayEventWrap();
        
        /**
         * Unsets the "displayEventWrap" element
         */
        void unsetDisplayEventWrap();
        
        /**
         * Gets the "descriptiveNoteWrap" element
         */
        de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap getDescriptiveNoteWrap();
        
        /**
         * True if has "descriptiveNoteWrap" element
         */
        boolean isSetDescriptiveNoteWrap();
        
        /**
         * Sets the "descriptiveNoteWrap" element
         */
        void setDescriptiveNoteWrap(de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap descriptiveNoteWrap);
        
        /**
         * Appends and returns a new empty "descriptiveNoteWrap" element
         */
        de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap addNewDescriptiveNoteWrap();
        
        /**
         * Unsets the "descriptiveNoteWrap" element
         */
        void unsetDescriptiveNoteWrap();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap newInstance() {
              return (de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.DescriptionWrapDocument newInstance() {
          return (de.zib.museum.museumdat.DescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.DescriptionWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.DescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.DescriptionWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptionWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.DescriptionWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptionWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptionWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptionWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptionWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptionWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptionWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptionWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptionWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptionWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptionWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptionWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.DescriptionWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.DescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.DescriptionWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.DescriptionWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
