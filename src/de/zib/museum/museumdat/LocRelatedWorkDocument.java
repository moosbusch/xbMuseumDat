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
 * A document containing one locRelatedWork(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface LocRelatedWorkDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocRelatedWorkDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("locrelatedwork7ba7doctype");
    
    /**
     * Gets the "locRelatedWork" element
     */
    de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork getLocRelatedWork();
    
    /**
     * Sets the "locRelatedWork" element
     */
    void setLocRelatedWork(de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork locRelatedWork);
    
    /**
     * Appends and returns a new empty "locRelatedWork" element
     */
    de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork addNewLocRelatedWork();
    
    /**
     * An XML locRelatedWork(@http://museum.zib.de/museumdat).
     *
     * This is an atomic type that is a restriction of de.zib.museum.museumdat.LocRelatedWorkDocument$LocRelatedWork.
     */
    public interface LocRelatedWork extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LocRelatedWork.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("locrelatedwork50bfelemtype");
        
        /**
         * Gets the "relWorkID" attribute
         */
        java.lang.String getRelWorkID();
        
        /**
         * Gets (as xml) the "relWorkID" attribute
         */
        org.apache.xmlbeans.XmlString xgetRelWorkID();
        
        /**
         * True if has "relWorkID" attribute
         */
        boolean isSetRelWorkID();
        
        /**
         * Sets the "relWorkID" attribute
         */
        void setRelWorkID(java.lang.String relWorkID);
        
        /**
         * Sets (as xml) the "relWorkID" attribute
         */
        void xsetRelWorkID(org.apache.xmlbeans.XmlString relWorkID);
        
        /**
         * Unsets the "relWorkID" attribute
         */
        void unsetRelWorkID();
        
        /**
         * Gets the "termsource" attribute
         */
        java.lang.String getTermsource();
        
        /**
         * Gets (as xml) the "termsource" attribute
         */
        org.apache.xmlbeans.XmlString xgetTermsource();
        
        /**
         * True if has "termsource" attribute
         */
        boolean isSetTermsource();
        
        /**
         * Sets the "termsource" attribute
         */
        void setTermsource(java.lang.String termsource);
        
        /**
         * Sets (as xml) the "termsource" attribute
         */
        void xsetTermsource(org.apache.xmlbeans.XmlString termsource);
        
        /**
         * Unsets the "termsource" attribute
         */
        void unsetTermsource();
        
        /**
         * Gets the "locID" attribute
         */
        java.lang.String getLocID();
        
        /**
         * Gets (as xml) the "locID" attribute
         */
        org.apache.xmlbeans.XmlString xgetLocID();
        
        /**
         * True if has "locID" attribute
         */
        boolean isSetLocID();
        
        /**
         * Sets the "locID" attribute
         */
        void setLocID(java.lang.String locID);
        
        /**
         * Sets (as xml) the "locID" attribute
         */
        void xsetLocID(org.apache.xmlbeans.XmlString locID);
        
        /**
         * Unsets the "locID" attribute
         */
        void unsetLocID();
        
        /**
         * Gets the "locIDtype" attribute
         */
        java.lang.String getLocIDtype();
        
        /**
         * Gets (as xml) the "locIDtype" attribute
         */
        org.apache.xmlbeans.XmlString xgetLocIDtype();
        
        /**
         * True if has "locIDtype" attribute
         */
        boolean isSetLocIDtype();
        
        /**
         * Sets the "locIDtype" attribute
         */
        void setLocIDtype(java.lang.String locIDtype);
        
        /**
         * Sets (as xml) the "locIDtype" attribute
         */
        void xsetLocIDtype(org.apache.xmlbeans.XmlString locIDtype);
        
        /**
         * Unsets the "locIDtype" attribute
         */
        void unsetLocIDtype();
        
        /**
         * Gets the "encodinganalog" attribute
         */
        java.lang.String getEncodinganalog();
        
        /**
         * Gets (as xml) the "encodinganalog" attribute
         */
        org.apache.xmlbeans.XmlString xgetEncodinganalog();
        
        /**
         * True if has "encodinganalog" attribute
         */
        boolean isSetEncodinganalog();
        
        /**
         * Sets the "encodinganalog" attribute
         */
        void setEncodinganalog(java.lang.String encodinganalog);
        
        /**
         * Sets (as xml) the "encodinganalog" attribute
         */
        void xsetEncodinganalog(org.apache.xmlbeans.XmlString encodinganalog);
        
        /**
         * Unsets the "encodinganalog" attribute
         */
        void unsetEncodinganalog();
        
        /**
         * Gets the "label" attribute
         */
        java.lang.String getLabel();
        
        /**
         * Gets (as xml) the "label" attribute
         */
        org.apache.xmlbeans.XmlString xgetLabel();
        
        /**
         * True if has "label" attribute
         */
        boolean isSetLabel();
        
        /**
         * Sets the "label" attribute
         */
        void setLabel(java.lang.String label);
        
        /**
         * Sets (as xml) the "label" attribute
         */
        void xsetLabel(org.apache.xmlbeans.XmlString label);
        
        /**
         * Unsets the "label" attribute
         */
        void unsetLabel();
        
        /**
         * Gets the "lang" attribute
         */
        java.lang.String getLang();
        
        /**
         * Gets (as xml) the "lang" attribute
         */
        org.apache.xmlbeans.XmlLanguage xgetLang();
        
        /**
         * True if has "lang" attribute
         */
        boolean isSetLang();
        
        /**
         * Sets the "lang" attribute
         */
        void setLang(java.lang.String lang);
        
        /**
         * Sets (as xml) the "lang" attribute
         */
        void xsetLang(org.apache.xmlbeans.XmlLanguage lang);
        
        /**
         * Unsets the "lang" attribute
         */
        void unsetLang();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork newInstance() {
              return (de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.LocRelatedWorkDocument newInstance() {
          return (de.zib.museum.museumdat.LocRelatedWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.LocRelatedWorkDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.LocRelatedWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.LocRelatedWorkDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.LocRelatedWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.LocRelatedWorkDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.LocRelatedWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.LocRelatedWorkDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.LocRelatedWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.LocRelatedWorkDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.LocRelatedWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.LocRelatedWorkDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.LocRelatedWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.LocRelatedWorkDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.LocRelatedWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.LocRelatedWorkDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.LocRelatedWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.LocRelatedWorkDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.LocRelatedWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.LocRelatedWorkDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.LocRelatedWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.LocRelatedWorkDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.LocRelatedWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.LocRelatedWorkDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.LocRelatedWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.LocRelatedWorkDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.LocRelatedWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.LocRelatedWorkDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.LocRelatedWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.LocRelatedWorkDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.LocRelatedWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.LocRelatedWorkDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.LocRelatedWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.LocRelatedWorkDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.LocRelatedWorkDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
