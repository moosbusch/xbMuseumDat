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
 * A document containing one indexingMeasurementsSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface IndexingMeasurementsSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingMeasurementsSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("indexingmeasurementsset051adoctype");
    
    /**
     * Gets the "indexingMeasurementsSet" element
     */
    de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet getIndexingMeasurementsSet();
    
    /**
     * Sets the "indexingMeasurementsSet" element
     */
    void setIndexingMeasurementsSet(de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet indexingMeasurementsSet);
    
    /**
     * Appends and returns a new empty "indexingMeasurementsSet" element
     */
    de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet addNewIndexingMeasurementsSet();
    
    /**
     * An XML indexingMeasurementsSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface IndexingMeasurementsSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingMeasurementsSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("indexingmeasurementssetbdd3elemtype");
        
        /**
         * Gets a List of "measurementsSet" elements
         */
        java.util.List<de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet> getMeasurementsSetList();
        
        /**
         * Gets array of all "measurementsSet" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet[] getMeasurementsSetArray();
        
        /**
         * Gets ith "measurementsSet" element
         */
        de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet getMeasurementsSetArray(int i);
        
        /**
         * Returns number of "measurementsSet" element
         */
        int sizeOfMeasurementsSetArray();
        
        /**
         * Sets array of all "measurementsSet" element
         */
        void setMeasurementsSetArray(de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet[] measurementsSetArray);
        
        /**
         * Sets ith "measurementsSet" element
         */
        void setMeasurementsSetArray(int i, de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet measurementsSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "measurementsSet" element
         */
        de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet insertNewMeasurementsSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "measurementsSet" element
         */
        de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet addNewMeasurementsSet();
        
        /**
         * Removes the ith "measurementsSet" element
         */
        void removeMeasurementsSet(int i);
        
        /**
         * Gets a List of "extentMeasurements" elements
         */
        java.util.List<de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements> getExtentMeasurementsList();
        
        /**
         * Gets array of all "extentMeasurements" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements[] getExtentMeasurementsArray();
        
        /**
         * Gets ith "extentMeasurements" element
         */
        de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements getExtentMeasurementsArray(int i);
        
        /**
         * Returns number of "extentMeasurements" element
         */
        int sizeOfExtentMeasurementsArray();
        
        /**
         * Sets array of all "extentMeasurements" element
         */
        void setExtentMeasurementsArray(de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements[] extentMeasurementsArray);
        
        /**
         * Sets ith "extentMeasurements" element
         */
        void setExtentMeasurementsArray(int i, de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements extentMeasurements);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extentMeasurements" element
         */
        de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements insertNewExtentMeasurements(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extentMeasurements" element
         */
        de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements addNewExtentMeasurements();
        
        /**
         * Removes the ith "extentMeasurements" element
         */
        void removeExtentMeasurements(int i);
        
        /**
         * Gets a List of "qualifierMeasurements" elements
         */
        java.util.List<java.lang.String> getQualifierMeasurementsList();
        
        /**
         * Gets array of all "qualifierMeasurements" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getQualifierMeasurementsArray();
        
        /**
         * Gets ith "qualifierMeasurements" element
         */
        java.lang.String getQualifierMeasurementsArray(int i);
        
        /**
         * Gets (as xml) a List of "qualifierMeasurements" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetQualifierMeasurementsList();
        
        /**
         * Gets (as xml) array of all "qualifierMeasurements" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetQualifierMeasurementsArray();
        
        /**
         * Gets (as xml) ith "qualifierMeasurements" element
         */
        org.apache.xmlbeans.XmlString xgetQualifierMeasurementsArray(int i);
        
        /**
         * Returns number of "qualifierMeasurements" element
         */
        int sizeOfQualifierMeasurementsArray();
        
        /**
         * Sets array of all "qualifierMeasurements" element
         */
        void setQualifierMeasurementsArray(java.lang.String[] qualifierMeasurementsArray);
        
        /**
         * Sets ith "qualifierMeasurements" element
         */
        void setQualifierMeasurementsArray(int i, java.lang.String qualifierMeasurements);
        
        /**
         * Sets (as xml) array of all "qualifierMeasurements" element
         */
        void xsetQualifierMeasurementsArray(org.apache.xmlbeans.XmlString[] qualifierMeasurementsArray);
        
        /**
         * Sets (as xml) ith "qualifierMeasurements" element
         */
        void xsetQualifierMeasurementsArray(int i, org.apache.xmlbeans.XmlString qualifierMeasurements);
        
        /**
         * Inserts the value as the ith "qualifierMeasurements" element
         */
        void insertQualifierMeasurements(int i, java.lang.String qualifierMeasurements);
        
        /**
         * Appends the value as the last "qualifierMeasurements" element
         */
        void addQualifierMeasurements(java.lang.String qualifierMeasurements);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "qualifierMeasurements" element
         */
        org.apache.xmlbeans.XmlString insertNewQualifierMeasurements(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "qualifierMeasurements" element
         */
        org.apache.xmlbeans.XmlString addNewQualifierMeasurements();
        
        /**
         * Removes the ith "qualifierMeasurements" element
         */
        void removeQualifierMeasurements(int i);
        
        /**
         * Gets a List of "formatMeasurements" elements
         */
        java.util.List<de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements> getFormatMeasurementsList();
        
        /**
         * Gets array of all "formatMeasurements" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements[] getFormatMeasurementsArray();
        
        /**
         * Gets ith "formatMeasurements" element
         */
        de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements getFormatMeasurementsArray(int i);
        
        /**
         * Returns number of "formatMeasurements" element
         */
        int sizeOfFormatMeasurementsArray();
        
        /**
         * Sets array of all "formatMeasurements" element
         */
        void setFormatMeasurementsArray(de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements[] formatMeasurementsArray);
        
        /**
         * Sets ith "formatMeasurements" element
         */
        void setFormatMeasurementsArray(int i, de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements formatMeasurements);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "formatMeasurements" element
         */
        de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements insertNewFormatMeasurements(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "formatMeasurements" element
         */
        de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements addNewFormatMeasurements();
        
        /**
         * Removes the ith "formatMeasurements" element
         */
        void removeFormatMeasurements(int i);
        
        /**
         * Gets a List of "shapeMeasurements" elements
         */
        java.util.List<de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements> getShapeMeasurementsList();
        
        /**
         * Gets array of all "shapeMeasurements" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements[] getShapeMeasurementsArray();
        
        /**
         * Gets ith "shapeMeasurements" element
         */
        de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements getShapeMeasurementsArray(int i);
        
        /**
         * Returns number of "shapeMeasurements" element
         */
        int sizeOfShapeMeasurementsArray();
        
        /**
         * Sets array of all "shapeMeasurements" element
         */
        void setShapeMeasurementsArray(de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements[] shapeMeasurementsArray);
        
        /**
         * Sets ith "shapeMeasurements" element
         */
        void setShapeMeasurementsArray(int i, de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements shapeMeasurements);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "shapeMeasurements" element
         */
        de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements insertNewShapeMeasurements(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "shapeMeasurements" element
         */
        de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements addNewShapeMeasurements();
        
        /**
         * Removes the ith "shapeMeasurements" element
         */
        void removeShapeMeasurements(int i);
        
        /**
         * Gets a List of "scaleMeasurements" elements
         */
        java.util.List<de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements> getScaleMeasurementsList();
        
        /**
         * Gets array of all "scaleMeasurements" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements[] getScaleMeasurementsArray();
        
        /**
         * Gets ith "scaleMeasurements" element
         */
        de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements getScaleMeasurementsArray(int i);
        
        /**
         * Returns number of "scaleMeasurements" element
         */
        int sizeOfScaleMeasurementsArray();
        
        /**
         * Sets array of all "scaleMeasurements" element
         */
        void setScaleMeasurementsArray(de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements[] scaleMeasurementsArray);
        
        /**
         * Sets ith "scaleMeasurements" element
         */
        void setScaleMeasurementsArray(int i, de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements scaleMeasurements);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "scaleMeasurements" element
         */
        de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements insertNewScaleMeasurements(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "scaleMeasurements" element
         */
        de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements addNewScaleMeasurements();
        
        /**
         * Removes the ith "scaleMeasurements" element
         */
        void removeScaleMeasurements(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet newInstance() {
              return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument newInstance() {
          return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.IndexingMeasurementsSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.IndexingMeasurementsSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
