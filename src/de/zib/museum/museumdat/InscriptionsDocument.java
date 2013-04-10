/*
 * An XML document type.
 * Localname: inscriptions
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.InscriptionsDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat;


/**
 * A document containing one inscriptions(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface InscriptionsDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InscriptionsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("inscriptionsbc68doctype");
    
    /**
     * Gets the "inscriptions" element
     */
    de.zib.museum.museumdat.InscriptionsDocument.Inscriptions getInscriptions();
    
    /**
     * Sets the "inscriptions" element
     */
    void setInscriptions(de.zib.museum.museumdat.InscriptionsDocument.Inscriptions inscriptions);
    
    /**
     * Appends and returns a new empty "inscriptions" element
     */
    de.zib.museum.museumdat.InscriptionsDocument.Inscriptions addNewInscriptions();
    
    /**
     * An XML inscriptions(@http://museum.zib.de/museumdat).
     *
     * This is an atomic type that is a restriction of de.zib.museum.museumdat.InscriptionsDocument$Inscriptions.
     */
    public interface Inscriptions extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Inscriptions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("inscriptions585felemtype");
        
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
            public static de.zib.museum.museumdat.InscriptionsDocument.Inscriptions newInstance() {
              return (de.zib.museum.museumdat.InscriptionsDocument.Inscriptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.InscriptionsDocument.Inscriptions newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.InscriptionsDocument.Inscriptions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.InscriptionsDocument newInstance() {
          return (de.zib.museum.museumdat.InscriptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.InscriptionsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.InscriptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.InscriptionsDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.InscriptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.InscriptionsDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.InscriptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.InscriptionsDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.InscriptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.InscriptionsDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.InscriptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.InscriptionsDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.InscriptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.InscriptionsDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.InscriptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.InscriptionsDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.InscriptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.InscriptionsDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.InscriptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.InscriptionsDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.InscriptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.InscriptionsDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.InscriptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.InscriptionsDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.InscriptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.InscriptionsDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.InscriptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.InscriptionsDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.InscriptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.InscriptionsDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.InscriptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.InscriptionsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.InscriptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.InscriptionsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.InscriptionsDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
