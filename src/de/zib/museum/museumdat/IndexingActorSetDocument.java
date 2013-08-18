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
 * A document containing one indexingActorSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface IndexingActorSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingActorSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("indexingactorset0c26doctype");
    
    /**
     * Gets the "indexingActorSet" element
     */
    de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet getIndexingActorSet();
    
    /**
     * Sets the "indexingActorSet" element
     */
    void setIndexingActorSet(de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet indexingActorSet);
    
    /**
     * Appends and returns a new empty "indexingActorSet" element
     */
    de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet addNewIndexingActorSet();
    
    /**
     * An XML indexingActorSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface IndexingActorSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IndexingActorSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("indexingactorset389felemtype");
        
        /**
         * Gets a List of "nameActorSet" elements
         */
        java.util.List<de.zib.museum.museumdat.NameActorSetDocument.NameActorSet> getNameActorSetList();
        
        /**
         * Gets array of all "nameActorSet" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.NameActorSetDocument.NameActorSet[] getNameActorSetArray();
        
        /**
         * Gets ith "nameActorSet" element
         */
        de.zib.museum.museumdat.NameActorSetDocument.NameActorSet getNameActorSetArray(int i);
        
        /**
         * Returns number of "nameActorSet" element
         */
        int sizeOfNameActorSetArray();
        
        /**
         * Sets array of all "nameActorSet" element
         */
        void setNameActorSetArray(de.zib.museum.museumdat.NameActorSetDocument.NameActorSet[] nameActorSetArray);
        
        /**
         * Sets ith "nameActorSet" element
         */
        void setNameActorSetArray(int i, de.zib.museum.museumdat.NameActorSetDocument.NameActorSet nameActorSet);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "nameActorSet" element
         */
        de.zib.museum.museumdat.NameActorSetDocument.NameActorSet insertNewNameActorSet(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "nameActorSet" element
         */
        de.zib.museum.museumdat.NameActorSetDocument.NameActorSet addNewNameActorSet();
        
        /**
         * Removes the ith "nameActorSet" element
         */
        void removeNameActorSet(int i);
        
        /**
         * Gets a List of "nationalityActor" elements
         */
        java.util.List<de.zib.museum.museumdat.NationalityActorDocument.NationalityActor> getNationalityActorList();
        
        /**
         * Gets array of all "nationalityActor" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.NationalityActorDocument.NationalityActor[] getNationalityActorArray();
        
        /**
         * Gets ith "nationalityActor" element
         */
        de.zib.museum.museumdat.NationalityActorDocument.NationalityActor getNationalityActorArray(int i);
        
        /**
         * Returns number of "nationalityActor" element
         */
        int sizeOfNationalityActorArray();
        
        /**
         * Sets array of all "nationalityActor" element
         */
        void setNationalityActorArray(de.zib.museum.museumdat.NationalityActorDocument.NationalityActor[] nationalityActorArray);
        
        /**
         * Sets ith "nationalityActor" element
         */
        void setNationalityActorArray(int i, de.zib.museum.museumdat.NationalityActorDocument.NationalityActor nationalityActor);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "nationalityActor" element
         */
        de.zib.museum.museumdat.NationalityActorDocument.NationalityActor insertNewNationalityActor(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "nationalityActor" element
         */
        de.zib.museum.museumdat.NationalityActorDocument.NationalityActor addNewNationalityActor();
        
        /**
         * Removes the ith "nationalityActor" element
         */
        void removeNationalityActor(int i);
        
        /**
         * Gets a List of "vitalDatesActor" elements
         */
        java.util.List<de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor> getVitalDatesActorList();
        
        /**
         * Gets array of all "vitalDatesActor" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor[] getVitalDatesActorArray();
        
        /**
         * Gets ith "vitalDatesActor" element
         */
        de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor getVitalDatesActorArray(int i);
        
        /**
         * Returns number of "vitalDatesActor" element
         */
        int sizeOfVitalDatesActorArray();
        
        /**
         * Sets array of all "vitalDatesActor" element
         */
        void setVitalDatesActorArray(de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor[] vitalDatesActorArray);
        
        /**
         * Sets ith "vitalDatesActor" element
         */
        void setVitalDatesActorArray(int i, de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor vitalDatesActor);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "vitalDatesActor" element
         */
        de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor insertNewVitalDatesActor(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "vitalDatesActor" element
         */
        de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor addNewVitalDatesActor();
        
        /**
         * Removes the ith "vitalDatesActor" element
         */
        void removeVitalDatesActor(int i);
        
        /**
         * Gets the "genderActor" element
         */
        de.zib.museum.museumdat.GenderActorDocument.GenderActor getGenderActor();
        
        /**
         * True if has "genderActor" element
         */
        boolean isSetGenderActor();
        
        /**
         * Sets the "genderActor" element
         */
        void setGenderActor(de.zib.museum.museumdat.GenderActorDocument.GenderActor genderActor);
        
        /**
         * Appends and returns a new empty "genderActor" element
         */
        de.zib.museum.museumdat.GenderActorDocument.GenderActor addNewGenderActor();
        
        /**
         * Unsets the "genderActor" element
         */
        void unsetGenderActor();
        
        /**
         * Gets a List of "roleActor" elements
         */
        java.util.List<de.zib.museum.museumdat.RoleActorDocument.RoleActor> getRoleActorList();
        
        /**
         * Gets array of all "roleActor" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.RoleActorDocument.RoleActor[] getRoleActorArray();
        
        /**
         * Gets ith "roleActor" element
         */
        de.zib.museum.museumdat.RoleActorDocument.RoleActor getRoleActorArray(int i);
        
        /**
         * Returns number of "roleActor" element
         */
        int sizeOfRoleActorArray();
        
        /**
         * Sets array of all "roleActor" element
         */
        void setRoleActorArray(de.zib.museum.museumdat.RoleActorDocument.RoleActor[] roleActorArray);
        
        /**
         * Sets ith "roleActor" element
         */
        void setRoleActorArray(int i, de.zib.museum.museumdat.RoleActorDocument.RoleActor roleActor);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "roleActor" element
         */
        de.zib.museum.museumdat.RoleActorDocument.RoleActor insertNewRoleActor(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "roleActor" element
         */
        de.zib.museum.museumdat.RoleActorDocument.RoleActor addNewRoleActor();
        
        /**
         * Removes the ith "roleActor" element
         */
        void removeRoleActor(int i);
        
        /**
         * Gets a List of "attributionQualifierActor" elements
         */
        java.util.List<java.lang.String> getAttributionQualifierActorList();
        
        /**
         * Gets array of all "attributionQualifierActor" elements
         * @deprecated
         */
        @Deprecated
        java.lang.String[] getAttributionQualifierActorArray();
        
        /**
         * Gets ith "attributionQualifierActor" element
         */
        java.lang.String getAttributionQualifierActorArray(int i);
        
        /**
         * Gets (as xml) a List of "attributionQualifierActor" elements
         */
        java.util.List<org.apache.xmlbeans.XmlString> xgetAttributionQualifierActorList();
        
        /**
         * Gets (as xml) array of all "attributionQualifierActor" elements
         * @deprecated
         */
        @Deprecated
        org.apache.xmlbeans.XmlString[] xgetAttributionQualifierActorArray();
        
        /**
         * Gets (as xml) ith "attributionQualifierActor" element
         */
        org.apache.xmlbeans.XmlString xgetAttributionQualifierActorArray(int i);
        
        /**
         * Returns number of "attributionQualifierActor" element
         */
        int sizeOfAttributionQualifierActorArray();
        
        /**
         * Sets array of all "attributionQualifierActor" element
         */
        void setAttributionQualifierActorArray(java.lang.String[] attributionQualifierActorArray);
        
        /**
         * Sets ith "attributionQualifierActor" element
         */
        void setAttributionQualifierActorArray(int i, java.lang.String attributionQualifierActor);
        
        /**
         * Sets (as xml) array of all "attributionQualifierActor" element
         */
        void xsetAttributionQualifierActorArray(org.apache.xmlbeans.XmlString[] attributionQualifierActorArray);
        
        /**
         * Sets (as xml) ith "attributionQualifierActor" element
         */
        void xsetAttributionQualifierActorArray(int i, org.apache.xmlbeans.XmlString attributionQualifierActor);
        
        /**
         * Inserts the value as the ith "attributionQualifierActor" element
         */
        void insertAttributionQualifierActor(int i, java.lang.String attributionQualifierActor);
        
        /**
         * Appends the value as the last "attributionQualifierActor" element
         */
        void addAttributionQualifierActor(java.lang.String attributionQualifierActor);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "attributionQualifierActor" element
         */
        org.apache.xmlbeans.XmlString insertNewAttributionQualifierActor(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "attributionQualifierActor" element
         */
        org.apache.xmlbeans.XmlString addNewAttributionQualifierActor();
        
        /**
         * Removes the ith "attributionQualifierActor" element
         */
        void removeAttributionQualifierActor(int i);
        
        /**
         * Gets a List of "extentActor" elements
         */
        java.util.List<de.zib.museum.museumdat.ExtentActorDocument.ExtentActor> getExtentActorList();
        
        /**
         * Gets array of all "extentActor" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.ExtentActorDocument.ExtentActor[] getExtentActorArray();
        
        /**
         * Gets ith "extentActor" element
         */
        de.zib.museum.museumdat.ExtentActorDocument.ExtentActor getExtentActorArray(int i);
        
        /**
         * Returns number of "extentActor" element
         */
        int sizeOfExtentActorArray();
        
        /**
         * Sets array of all "extentActor" element
         */
        void setExtentActorArray(de.zib.museum.museumdat.ExtentActorDocument.ExtentActor[] extentActorArray);
        
        /**
         * Sets ith "extentActor" element
         */
        void setExtentActorArray(int i, de.zib.museum.museumdat.ExtentActorDocument.ExtentActor extentActor);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extentActor" element
         */
        de.zib.museum.museumdat.ExtentActorDocument.ExtentActor insertNewExtentActor(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extentActor" element
         */
        de.zib.museum.museumdat.ExtentActorDocument.ExtentActor addNewExtentActor();
        
        /**
         * Removes the ith "extentActor" element
         */
        void removeExtentActor(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet newInstance() {
              return (de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.IndexingActorSetDocument newInstance() {
          return (de.zib.museum.museumdat.IndexingActorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.IndexingActorSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.IndexingActorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.IndexingActorSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingActorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingActorSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingActorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.IndexingActorSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingActorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingActorSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingActorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingActorSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingActorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingActorSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingActorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingActorSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingActorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingActorSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingActorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingActorSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingActorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingActorSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.IndexingActorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingActorSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingActorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingActorSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingActorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.IndexingActorSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingActorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.IndexingActorSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.IndexingActorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.IndexingActorSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.IndexingActorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.IndexingActorSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.IndexingActorSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
