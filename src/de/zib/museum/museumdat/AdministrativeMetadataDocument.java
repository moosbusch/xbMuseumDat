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
 * A document containing one administrativeMetadata(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface AdministrativeMetadataDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdministrativeMetadataDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("administrativemetadata1886doctype");
    
    /**
     * Gets the "administrativeMetadata" element
     */
    de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata getAdministrativeMetadata();
    
    /**
     * Sets the "administrativeMetadata" element
     */
    void setAdministrativeMetadata(de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata administrativeMetadata);
    
    /**
     * Appends and returns a new empty "administrativeMetadata" element
     */
    de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata addNewAdministrativeMetadata();
    
    /**
     * An XML administrativeMetadata(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface AdministrativeMetadata extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AdministrativeMetadata.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("administrativemetadata529felemtype");
        
        /**
         * Gets a List of "rightsWork" elements
         */
        java.util.List<de.zib.museum.museumdat.RightsWorkDocument.RightsWork> getRightsWorkList();
        
        /**
         * Gets array of all "rightsWork" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.RightsWorkDocument.RightsWork[] getRightsWorkArray();
        
        /**
         * Gets ith "rightsWork" element
         */
        de.zib.museum.museumdat.RightsWorkDocument.RightsWork getRightsWorkArray(int i);
        
        /**
         * Returns number of "rightsWork" element
         */
        int sizeOfRightsWorkArray();
        
        /**
         * Sets array of all "rightsWork" element
         */
        void setRightsWorkArray(de.zib.museum.museumdat.RightsWorkDocument.RightsWork[] rightsWorkArray);
        
        /**
         * Sets ith "rightsWork" element
         */
        void setRightsWorkArray(int i, de.zib.museum.museumdat.RightsWorkDocument.RightsWork rightsWork);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "rightsWork" element
         */
        de.zib.museum.museumdat.RightsWorkDocument.RightsWork insertNewRightsWork(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "rightsWork" element
         */
        de.zib.museum.museumdat.RightsWorkDocument.RightsWork addNewRightsWork();
        
        /**
         * Removes the ith "rightsWork" element
         */
        void removeRightsWork(int i);
        
        /**
         * Gets the "recordWrap" element
         */
        de.zib.museum.museumdat.RecordWrapDocument.RecordWrap getRecordWrap();
        
        /**
         * Sets the "recordWrap" element
         */
        void setRecordWrap(de.zib.museum.museumdat.RecordWrapDocument.RecordWrap recordWrap);
        
        /**
         * Appends and returns a new empty "recordWrap" element
         */
        de.zib.museum.museumdat.RecordWrapDocument.RecordWrap addNewRecordWrap();
        
        /**
         * Gets the "resourceWrap" element
         */
        de.zib.museum.museumdat.ResourceWrapDocument.ResourceWrap getResourceWrap();
        
        /**
         * True if has "resourceWrap" element
         */
        boolean isSetResourceWrap();
        
        /**
         * Sets the "resourceWrap" element
         */
        void setResourceWrap(de.zib.museum.museumdat.ResourceWrapDocument.ResourceWrap resourceWrap);
        
        /**
         * Appends and returns a new empty "resourceWrap" element
         */
        de.zib.museum.museumdat.ResourceWrapDocument.ResourceWrap addNewResourceWrap();
        
        /**
         * Unsets the "resourceWrap" element
         */
        void unsetResourceWrap();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata newInstance() {
              return (de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.AdministrativeMetadataDocument newInstance() {
          return (de.zib.museum.museumdat.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.AdministrativeMetadataDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.AdministrativeMetadataDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.AdministrativeMetadataDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.AdministrativeMetadataDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.AdministrativeMetadataDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.AdministrativeMetadataDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.AdministrativeMetadataDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.AdministrativeMetadataDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.AdministrativeMetadataDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.AdministrativeMetadataDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.AdministrativeMetadataDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.AdministrativeMetadataDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.AdministrativeMetadataDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.AdministrativeMetadataDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.AdministrativeMetadataDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.AdministrativeMetadataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.AdministrativeMetadataDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.AdministrativeMetadataDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
