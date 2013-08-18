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
 * A document containing one repositorySet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface RepositorySetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RepositorySetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("repositorysetdcbddoctype");
    
    /**
     * Gets the "repositorySet" element
     */
    de.zib.museum.museumdat.RepositorySetDocument.RepositorySet getRepositorySet();
    
    /**
     * Sets the "repositorySet" element
     */
    void setRepositorySet(de.zib.museum.museumdat.RepositorySetDocument.RepositorySet repositorySet);
    
    /**
     * Appends and returns a new empty "repositorySet" element
     */
    de.zib.museum.museumdat.RepositorySetDocument.RepositorySet addNewRepositorySet();
    
    /**
     * An XML repositorySet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface RepositorySet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RepositorySet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("repositoryset6519elemtype");
        
        /**
         * Gets the "repositoryName" element
         */
        de.zib.museum.museumdat.RepositoryNameDocument.RepositoryName getRepositoryName();
        
        /**
         * True if has "repositoryName" element
         */
        boolean isSetRepositoryName();
        
        /**
         * Sets the "repositoryName" element
         */
        void setRepositoryName(de.zib.museum.museumdat.RepositoryNameDocument.RepositoryName repositoryName);
        
        /**
         * Appends and returns a new empty "repositoryName" element
         */
        de.zib.museum.museumdat.RepositoryNameDocument.RepositoryName addNewRepositoryName();
        
        /**
         * Unsets the "repositoryName" element
         */
        void unsetRepositoryName();
        
        /**
         * Gets a List of "workID" elements
         */
        java.util.List<de.zib.museum.museumdat.WorkIDDocument.WorkID> getWorkIDList();
        
        /**
         * Gets array of all "workID" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.WorkIDDocument.WorkID[] getWorkIDArray();
        
        /**
         * Gets ith "workID" element
         */
        de.zib.museum.museumdat.WorkIDDocument.WorkID getWorkIDArray(int i);
        
        /**
         * Returns number of "workID" element
         */
        int sizeOfWorkIDArray();
        
        /**
         * Sets array of all "workID" element
         */
        void setWorkIDArray(de.zib.museum.museumdat.WorkIDDocument.WorkID[] workIDArray);
        
        /**
         * Sets ith "workID" element
         */
        void setWorkIDArray(int i, de.zib.museum.museumdat.WorkIDDocument.WorkID workID);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "workID" element
         */
        de.zib.museum.museumdat.WorkIDDocument.WorkID insertNewWorkID(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "workID" element
         */
        de.zib.museum.museumdat.WorkIDDocument.WorkID addNewWorkID();
        
        /**
         * Removes the ith "workID" element
         */
        void removeWorkID(int i);
        
        /**
         * Gets the "repositoryLocationName" element
         */
        de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName getRepositoryLocationName();
        
        /**
         * True if has "repositoryLocationName" element
         */
        boolean isSetRepositoryLocationName();
        
        /**
         * Sets the "repositoryLocationName" element
         */
        void setRepositoryLocationName(de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName repositoryLocationName);
        
        /**
         * Appends and returns a new empty "repositoryLocationName" element
         */
        de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName addNewRepositoryLocationName();
        
        /**
         * Unsets the "repositoryLocationName" element
         */
        void unsetRepositoryLocationName();
        
        /**
         * Gets the "type" attribute
         */
        de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
        /**
         * An XML type(@http://museum.zib.de/museumdat).
         *
         * This is an atomic type that is a restriction of de.zib.museum.museumdat.RepositorySetDocument$RepositorySet$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("type708fattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum CURRENT = Enum.forString("current");
            static final Enum FORMER = Enum.forString("former");
            
            static final int INT_CURRENT = Enum.INT_CURRENT;
            static final int INT_FORMER = Enum.INT_FORMER;
            
            /**
             * Enumeration value class for de.zib.museum.museumdat.RepositorySetDocument$RepositorySet$Type.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_CURRENT
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_CURRENT = 1;
                static final int INT_FORMER = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("current", INT_CURRENT),
                      new Enum("former", INT_FORMER),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type newValue(java.lang.Object obj) {
                  return (de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type) type.newValue( obj ); }
                
                public static de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type newInstance() {
                  return (de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (de.zib.museum.museumdat.RepositorySetDocument.RepositorySet.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.RepositorySetDocument.RepositorySet newInstance() {
              return (de.zib.museum.museumdat.RepositorySetDocument.RepositorySet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.RepositorySetDocument.RepositorySet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.RepositorySetDocument.RepositorySet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.RepositorySetDocument newInstance() {
          return (de.zib.museum.museumdat.RepositorySetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.RepositorySetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.RepositorySetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.RepositorySetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RepositorySetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.RepositorySetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RepositorySetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.RepositorySetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RepositorySetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.RepositorySetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RepositorySetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.RepositorySetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RepositorySetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.RepositorySetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RepositorySetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.RepositorySetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RepositorySetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.RepositorySetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RepositorySetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.RepositorySetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RepositorySetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.RepositorySetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.RepositorySetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.RepositorySetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RepositorySetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.RepositorySetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RepositorySetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.RepositorySetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RepositorySetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.RepositorySetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.RepositorySetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.RepositorySetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.RepositorySetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.RepositorySetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.RepositorySetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
