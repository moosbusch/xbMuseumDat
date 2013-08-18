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
 * A document containing one relatedWorkSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface RelatedWorkSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelatedWorkSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("relatedworkset97fddoctype");
    
    /**
     * Gets the "relatedWorkSet" element
     */
    de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet getRelatedWorkSet();
    
    /**
     * Sets the "relatedWorkSet" element
     */
    void setRelatedWorkSet(de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet relatedWorkSet);
    
    /**
     * Appends and returns a new empty "relatedWorkSet" element
     */
    de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet addNewRelatedWorkSet();
    
    /**
     * An XML relatedWorkSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface RelatedWorkSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelatedWorkSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("relatedworksetc77felemtype");
        
        /**
         * Gets a List of "linkRelatedWork" elements
         */
        java.util.List<de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork> getLinkRelatedWorkList();
        
        /**
         * Gets array of all "linkRelatedWork" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork[] getLinkRelatedWorkArray();
        
        /**
         * Gets ith "linkRelatedWork" element
         */
        de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork getLinkRelatedWorkArray(int i);
        
        /**
         * Returns number of "linkRelatedWork" element
         */
        int sizeOfLinkRelatedWorkArray();
        
        /**
         * Sets array of all "linkRelatedWork" element
         */
        void setLinkRelatedWorkArray(de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork[] linkRelatedWorkArray);
        
        /**
         * Sets ith "linkRelatedWork" element
         */
        void setLinkRelatedWorkArray(int i, de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork linkRelatedWork);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "linkRelatedWork" element
         */
        de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork insertNewLinkRelatedWork(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "linkRelatedWork" element
         */
        de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork addNewLinkRelatedWork();
        
        /**
         * Removes the ith "linkRelatedWork" element
         */
        void removeLinkRelatedWork(int i);
        
        /**
         * Gets the "relatedWorkRelType" element
         */
        de.zib.museum.museumdat.RelatedWorkRelTypeDocument.RelatedWorkRelType getRelatedWorkRelType();
        
        /**
         * True if has "relatedWorkRelType" element
         */
        boolean isSetRelatedWorkRelType();
        
        /**
         * Sets the "relatedWorkRelType" element
         */
        void setRelatedWorkRelType(de.zib.museum.museumdat.RelatedWorkRelTypeDocument.RelatedWorkRelType relatedWorkRelType);
        
        /**
         * Appends and returns a new empty "relatedWorkRelType" element
         */
        de.zib.museum.museumdat.RelatedWorkRelTypeDocument.RelatedWorkRelType addNewRelatedWorkRelType();
        
        /**
         * Unsets the "relatedWorkRelType" element
         */
        void unsetRelatedWorkRelType();
        
        /**
         * Gets a List of "labelRelatedWork" elements
         */
        java.util.List<de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork> getLabelRelatedWorkList();
        
        /**
         * Gets array of all "labelRelatedWork" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork[] getLabelRelatedWorkArray();
        
        /**
         * Gets ith "labelRelatedWork" element
         */
        de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork getLabelRelatedWorkArray(int i);
        
        /**
         * Returns number of "labelRelatedWork" element
         */
        int sizeOfLabelRelatedWorkArray();
        
        /**
         * Sets array of all "labelRelatedWork" element
         */
        void setLabelRelatedWorkArray(de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork[] labelRelatedWorkArray);
        
        /**
         * Sets ith "labelRelatedWork" element
         */
        void setLabelRelatedWorkArray(int i, de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork labelRelatedWork);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "labelRelatedWork" element
         */
        de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork insertNewLabelRelatedWork(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "labelRelatedWork" element
         */
        de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork addNewLabelRelatedWork();
        
        /**
         * Removes the ith "labelRelatedWork" element
         */
        void removeLabelRelatedWork(int i);
        
        /**
         * Gets a List of "locRelatedWork" elements
         */
        java.util.List<de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork> getLocRelatedWorkList();
        
        /**
         * Gets array of all "locRelatedWork" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork[] getLocRelatedWorkArray();
        
        /**
         * Gets ith "locRelatedWork" element
         */
        de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork getLocRelatedWorkArray(int i);
        
        /**
         * Returns number of "locRelatedWork" element
         */
        int sizeOfLocRelatedWorkArray();
        
        /**
         * Sets array of all "locRelatedWork" element
         */
        void setLocRelatedWorkArray(de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork[] locRelatedWorkArray);
        
        /**
         * Sets ith "locRelatedWork" element
         */
        void setLocRelatedWorkArray(int i, de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork locRelatedWork);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "locRelatedWork" element
         */
        de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork insertNewLocRelatedWork(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "locRelatedWork" element
         */
        de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork addNewLocRelatedWork();
        
        /**
         * Removes the ith "locRelatedWork" element
         */
        void removeLocRelatedWork(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet newInstance() {
              return (de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.RelatedWorkSetDocument newInstance() {
          return (de.zib.museum.museumdat.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.RelatedWorkSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.RelatedWorkSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.RelatedWorkSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.RelatedWorkSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.RelatedWorkSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.RelatedWorkSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.RelatedWorkSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.RelatedWorkSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.RelatedWorkSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.RelatedWorkSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.RelatedWorkSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.RelatedWorkSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.RelatedWorkSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.RelatedWorkSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.RelatedWorkSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.RelatedWorkSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.RelatedWorkSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.RelatedWorkSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
