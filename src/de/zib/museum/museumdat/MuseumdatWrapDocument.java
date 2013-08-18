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
 * A document containing one museumdatWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface MuseumdatWrapDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MuseumdatWrapDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("museumdatwrapd866doctype");
    
    /**
     * Gets the "museumdatWrap" element
     */
    de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap getMuseumdatWrap();
    
    /**
     * Sets the "museumdatWrap" element
     */
    void setMuseumdatWrap(de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap museumdatWrap);
    
    /**
     * Appends and returns a new empty "museumdatWrap" element
     */
    de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap addNewMuseumdatWrap();
    
    /**
     * An XML museumdatWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface MuseumdatWrap extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MuseumdatWrap.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("museumdatwrapea6belemtype");
        
        /**
         * Gets a List of "museumdat" elements
         */
        java.util.List<de.zib.museum.museumdat.MuseumdatDocument.Museumdat> getMuseumdatList();
        
        /**
         * Gets array of all "museumdat" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.MuseumdatDocument.Museumdat[] getMuseumdatArray();
        
        /**
         * Gets ith "museumdat" element
         */
        de.zib.museum.museumdat.MuseumdatDocument.Museumdat getMuseumdatArray(int i);
        
        /**
         * Returns number of "museumdat" element
         */
        int sizeOfMuseumdatArray();
        
        /**
         * Sets array of all "museumdat" element
         */
        void setMuseumdatArray(de.zib.museum.museumdat.MuseumdatDocument.Museumdat[] museumdatArray);
        
        /**
         * Sets ith "museumdat" element
         */
        void setMuseumdatArray(int i, de.zib.museum.museumdat.MuseumdatDocument.Museumdat museumdat);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "museumdat" element
         */
        de.zib.museum.museumdat.MuseumdatDocument.Museumdat insertNewMuseumdat(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "museumdat" element
         */
        de.zib.museum.museumdat.MuseumdatDocument.Museumdat addNewMuseumdat();
        
        /**
         * Removes the ith "museumdat" element
         */
        void removeMuseumdat(int i);
        
        /**
         * Gets the "relatedencoding" attribute
         */
        java.lang.String getRelatedencoding();
        
        /**
         * Gets (as xml) the "relatedencoding" attribute
         */
        org.apache.xmlbeans.XmlString xgetRelatedencoding();
        
        /**
         * True if has "relatedencoding" attribute
         */
        boolean isSetRelatedencoding();
        
        /**
         * Sets the "relatedencoding" attribute
         */
        void setRelatedencoding(java.lang.String relatedencoding);
        
        /**
         * Sets (as xml) the "relatedencoding" attribute
         */
        void xsetRelatedencoding(org.apache.xmlbeans.XmlString relatedencoding);
        
        /**
         * Unsets the "relatedencoding" attribute
         */
        void unsetRelatedencoding();
        
        /**
         * Gets the "langencoding" attribute
         */
        java.lang.String getLangencoding();
        
        /**
         * Gets (as xml) the "langencoding" attribute
         */
        org.apache.xmlbeans.XmlString xgetLangencoding();
        
        /**
         * True if has "langencoding" attribute
         */
        boolean isSetLangencoding();
        
        /**
         * Sets the "langencoding" attribute
         */
        void setLangencoding(java.lang.String langencoding);
        
        /**
         * Sets (as xml) the "langencoding" attribute
         */
        void xsetLangencoding(org.apache.xmlbeans.XmlString langencoding);
        
        /**
         * Unsets the "langencoding" attribute
         */
        void unsetLangencoding();
        
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
            public static de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap newInstance() {
              return (de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.MuseumdatWrapDocument newInstance() {
          return (de.zib.museum.museumdat.MuseumdatWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.MuseumdatWrapDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.MuseumdatWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.MuseumdatWrapDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.MuseumdatWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.MuseumdatWrapDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.MuseumdatWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.MuseumdatWrapDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.MuseumdatWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.MuseumdatWrapDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.MuseumdatWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.MuseumdatWrapDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.MuseumdatWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.MuseumdatWrapDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.MuseumdatWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.MuseumdatWrapDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.MuseumdatWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.MuseumdatWrapDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.MuseumdatWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.MuseumdatWrapDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.MuseumdatWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.MuseumdatWrapDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.MuseumdatWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.MuseumdatWrapDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.MuseumdatWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.MuseumdatWrapDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.MuseumdatWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.MuseumdatWrapDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.MuseumdatWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.MuseumdatWrapDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.MuseumdatWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.MuseumdatWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.MuseumdatWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.MuseumdatWrapDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.MuseumdatWrapDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
