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
 * A document containing one recordInfoSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface RecordInfoSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecordInfoSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("recordinfoset20d2doctype");
    
    /**
     * Gets the "recordInfoSet" element
     */
    de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet getRecordInfoSet();
    
    /**
     * Sets the "recordInfoSet" element
     */
    void setRecordInfoSet(de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet recordInfoSet);
    
    /**
     * Appends and returns a new empty "recordInfoSet" element
     */
    de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet addNewRecordInfoSet();
    
    /**
     * An XML recordInfoSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface RecordInfoSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecordInfoSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("recordinfoset2343elemtype");
        
        /**
         * Gets a List of "recordInfoID" elements
         */
        java.util.List<de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID> getRecordInfoIDList();
        
        /**
         * Gets array of all "recordInfoID" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID[] getRecordInfoIDArray();
        
        /**
         * Gets ith "recordInfoID" element
         */
        de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID getRecordInfoIDArray(int i);
        
        /**
         * Returns number of "recordInfoID" element
         */
        int sizeOfRecordInfoIDArray();
        
        /**
         * Sets array of all "recordInfoID" element
         */
        void setRecordInfoIDArray(de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID[] recordInfoIDArray);
        
        /**
         * Sets ith "recordInfoID" element
         */
        void setRecordInfoIDArray(int i, de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID recordInfoID);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordInfoID" element
         */
        de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID insertNewRecordInfoID(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordInfoID" element
         */
        de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID addNewRecordInfoID();
        
        /**
         * Removes the ith "recordInfoID" element
         */
        void removeRecordInfoID(int i);
        
        /**
         * Gets a List of "recordInfoLink" elements
         */
        java.util.List<de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink> getRecordInfoLinkList();
        
        /**
         * Gets array of all "recordInfoLink" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink[] getRecordInfoLinkArray();
        
        /**
         * Gets ith "recordInfoLink" element
         */
        de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink getRecordInfoLinkArray(int i);
        
        /**
         * Returns number of "recordInfoLink" element
         */
        int sizeOfRecordInfoLinkArray();
        
        /**
         * Sets array of all "recordInfoLink" element
         */
        void setRecordInfoLinkArray(de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink[] recordInfoLinkArray);
        
        /**
         * Sets ith "recordInfoLink" element
         */
        void setRecordInfoLinkArray(int i, de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink recordInfoLink);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordInfoLink" element
         */
        de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink insertNewRecordInfoLink(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordInfoLink" element
         */
        de.zib.museum.museumdat.RecordInfoLinkDocument.RecordInfoLink addNewRecordInfoLink();
        
        /**
         * Removes the ith "recordInfoLink" element
         */
        void removeRecordInfoLink(int i);
        
        /**
         * Gets a List of "recordRelID" elements
         */
        java.util.List<de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID> getRecordRelIDList();
        
        /**
         * Gets array of all "recordRelID" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID[] getRecordRelIDArray();
        
        /**
         * Gets ith "recordRelID" element
         */
        de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID getRecordRelIDArray(int i);
        
        /**
         * Returns number of "recordRelID" element
         */
        int sizeOfRecordRelIDArray();
        
        /**
         * Sets array of all "recordRelID" element
         */
        void setRecordRelIDArray(de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID[] recordRelIDArray);
        
        /**
         * Sets ith "recordRelID" element
         */
        void setRecordRelIDArray(int i, de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID recordRelID);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordRelID" element
         */
        de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID insertNewRecordRelID(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordRelID" element
         */
        de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID addNewRecordRelID();
        
        /**
         * Removes the ith "recordRelID" element
         */
        void removeRecordRelID(int i);
        
        /**
         * Gets a List of "recordMetadataLoc" elements
         */
        java.util.List<de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc> getRecordMetadataLocList();
        
        /**
         * Gets array of all "recordMetadataLoc" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc[] getRecordMetadataLocArray();
        
        /**
         * Gets ith "recordMetadataLoc" element
         */
        de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc getRecordMetadataLocArray(int i);
        
        /**
         * Returns number of "recordMetadataLoc" element
         */
        int sizeOfRecordMetadataLocArray();
        
        /**
         * Sets array of all "recordMetadataLoc" element
         */
        void setRecordMetadataLocArray(de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc[] recordMetadataLocArray);
        
        /**
         * Sets ith "recordMetadataLoc" element
         */
        void setRecordMetadataLocArray(int i, de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc recordMetadataLoc);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordMetadataLoc" element
         */
        de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc insertNewRecordMetadataLoc(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordMetadataLoc" element
         */
        de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc addNewRecordMetadataLoc();
        
        /**
         * Removes the ith "recordMetadataLoc" element
         */
        void removeRecordMetadataLoc(int i);
        
        /**
         * Gets a List of "recordMetadataDate" elements
         */
        java.util.List<de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate> getRecordMetadataDateList();
        
        /**
         * Gets array of all "recordMetadataDate" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate[] getRecordMetadataDateArray();
        
        /**
         * Gets ith "recordMetadataDate" element
         */
        de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate getRecordMetadataDateArray(int i);
        
        /**
         * Returns number of "recordMetadataDate" element
         */
        int sizeOfRecordMetadataDateArray();
        
        /**
         * Sets array of all "recordMetadataDate" element
         */
        void setRecordMetadataDateArray(de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate[] recordMetadataDateArray);
        
        /**
         * Sets ith "recordMetadataDate" element
         */
        void setRecordMetadataDateArray(int i, de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate recordMetadataDate);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "recordMetadataDate" element
         */
        de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate insertNewRecordMetadataDate(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "recordMetadataDate" element
         */
        de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate addNewRecordMetadataDate();
        
        /**
         * Removes the ith "recordMetadataDate" element
         */
        void removeRecordMetadataDate(int i);
        
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
            public static de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet newInstance() {
              return (de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.RecordInfoSetDocument newInstance() {
          return (de.zib.museum.museumdat.RecordInfoSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.RecordInfoSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.RecordInfoSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.RecordInfoSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RecordInfoSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.RecordInfoSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RecordInfoSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.RecordInfoSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RecordInfoSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.RecordInfoSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RecordInfoSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.RecordInfoSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RecordInfoSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.RecordInfoSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RecordInfoSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.RecordInfoSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RecordInfoSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.RecordInfoSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RecordInfoSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.RecordInfoSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RecordInfoSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.RecordInfoSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RecordInfoSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.RecordInfoSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RecordInfoSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.RecordInfoSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RecordInfoSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.RecordInfoSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RecordInfoSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.RecordInfoSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RecordInfoSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.RecordInfoSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.RecordInfoSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.RecordInfoSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.RecordInfoSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
