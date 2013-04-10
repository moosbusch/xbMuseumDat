/*
 * An XML document type.
 * Localname: descriptiveMetadata
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.DescriptiveMetadataDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat;


/**
 * A document containing one descriptiveMetadata(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface DescriptiveMetadataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptiveMetadataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("descriptivemetadataa63adoctype");
    
    /**
     * Gets the "descriptiveMetadata" element
     */
    de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata getDescriptiveMetadata();
    
    /**
     * Sets the "descriptiveMetadata" element
     */
    void setDescriptiveMetadata(de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata descriptiveMetadata);
    
    /**
     * Appends and returns a new empty "descriptiveMetadata" element
     */
    de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata addNewDescriptiveMetadata();
    
    /**
     * An XML descriptiveMetadata(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface DescriptiveMetadata extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DescriptiveMetadata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("descriptivemetadata5413elemtype");
        
        /**
         * Gets the "objectClassificationWrap" element
         */
        de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap getObjectClassificationWrap();
        
        /**
         * Sets the "objectClassificationWrap" element
         */
        void setObjectClassificationWrap(de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap objectClassificationWrap);
        
        /**
         * Appends and returns a new empty "objectClassificationWrap" element
         */
        de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap addNewObjectClassificationWrap();
        
        /**
         * Gets the "identificationWrap" element
         */
        de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap getIdentificationWrap();
        
        /**
         * Sets the "identificationWrap" element
         */
        void setIdentificationWrap(de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap identificationWrap);
        
        /**
         * Appends and returns a new empty "identificationWrap" element
         */
        de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap addNewIdentificationWrap();
        
        /**
         * Gets the "descriptionWrap" element
         */
        de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap getDescriptionWrap();
        
        /**
         * True if has "descriptionWrap" element
         */
        boolean isSetDescriptionWrap();
        
        /**
         * Sets the "descriptionWrap" element
         */
        void setDescriptionWrap(de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap descriptionWrap);
        
        /**
         * Appends and returns a new empty "descriptionWrap" element
         */
        de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap addNewDescriptionWrap();
        
        /**
         * Unsets the "descriptionWrap" element
         */
        void unsetDescriptionWrap();
        
        /**
         * Gets the "eventWrap" element
         */
        de.zib.museum.museumdat.EventWrapDocument.EventWrap getEventWrap();
        
        /**
         * True if has "eventWrap" element
         */
        boolean isSetEventWrap();
        
        /**
         * Sets the "eventWrap" element
         */
        void setEventWrap(de.zib.museum.museumdat.EventWrapDocument.EventWrap eventWrap);
        
        /**
         * Appends and returns a new empty "eventWrap" element
         */
        de.zib.museum.museumdat.EventWrapDocument.EventWrap addNewEventWrap();
        
        /**
         * Unsets the "eventWrap" element
         */
        void unsetEventWrap();
        
        /**
         * Gets the "relationWrap" element
         */
        de.zib.museum.museumdat.RelationWrapDocument.RelationWrap getRelationWrap();
        
        /**
         * True if has "relationWrap" element
         */
        boolean isSetRelationWrap();
        
        /**
         * Sets the "relationWrap" element
         */
        void setRelationWrap(de.zib.museum.museumdat.RelationWrapDocument.RelationWrap relationWrap);
        
        /**
         * Appends and returns a new empty "relationWrap" element
         */
        de.zib.museum.museumdat.RelationWrapDocument.RelationWrap addNewRelationWrap();
        
        /**
         * Unsets the "relationWrap" element
         */
        void unsetRelationWrap();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata newInstance() {
              return (de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.DescriptiveMetadataDocument newInstance() {
          return (de.zib.museum.museumdat.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveMetadataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.DescriptiveMetadataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveMetadataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.DescriptiveMetadataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveMetadataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptiveMetadataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveMetadataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptiveMetadataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveMetadataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptiveMetadataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveMetadataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptiveMetadataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveMetadataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.DescriptiveMetadataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.DescriptiveMetadataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.DescriptiveMetadataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.DescriptiveMetadataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.DescriptiveMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
