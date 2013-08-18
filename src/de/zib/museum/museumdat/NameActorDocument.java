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
 * A document containing one nameActor(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface NameActorDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NameActorDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("nameactora18bdoctype");
    
    /**
     * Gets the "nameActor" element
     */
    de.zib.museum.museumdat.NameActorDocument.NameActor getNameActor();
    
    /**
     * Sets the "nameActor" element
     */
    void setNameActor(de.zib.museum.museumdat.NameActorDocument.NameActor nameActor);
    
    /**
     * Appends and returns a new empty "nameActor" element
     */
    de.zib.museum.museumdat.NameActorDocument.NameActor addNewNameActor();
    
    /**
     * An XML nameActor(@http://museum.zib.de/museumdat).
     *
     * This is an atomic type that is a restriction of de.zib.museum.museumdat.NameActorDocument$NameActor.
     */
    public interface NameActor extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NameActor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("nameactor1f35elemtype");
        
        /**
         * Gets the "pref" attribute
         */
        de.zib.museum.museumdat.PrefAttribute.Pref.Enum getPref();
        
        /**
         * Gets (as xml) the "pref" attribute
         */
        de.zib.museum.museumdat.PrefAttribute.Pref xgetPref();
        
        /**
         * True if has "pref" attribute
         */
        boolean isSetPref();
        
        /**
         * Sets the "pref" attribute
         */
        void setPref(de.zib.museum.museumdat.PrefAttribute.Pref.Enum pref);
        
        /**
         * Sets (as xml) the "pref" attribute
         */
        void xsetPref(de.zib.museum.museumdat.PrefAttribute.Pref pref);
        
        /**
         * Unsets the "pref" attribute
         */
        void unsetPref();
        
        /**
         * Gets the "type" attribute
         */
        de.zib.museum.museumdat.NameActorDocument.NameActor.Type.Enum getType();
        
        /**
         * Gets (as xml) the "type" attribute
         */
        de.zib.museum.museumdat.NameActorDocument.NameActor.Type xgetType();
        
        /**
         * True if has "type" attribute
         */
        boolean isSetType();
        
        /**
         * Sets the "type" attribute
         */
        void setType(de.zib.museum.museumdat.NameActorDocument.NameActor.Type.Enum type);
        
        /**
         * Sets (as xml) the "type" attribute
         */
        void xsetType(de.zib.museum.museumdat.NameActorDocument.NameActor.Type type);
        
        /**
         * Unsets the "type" attribute
         */
        void unsetType();
        
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
         * Gets the "termsourceID" attribute
         */
        java.lang.String getTermsourceID();
        
        /**
         * Gets (as xml) the "termsourceID" attribute
         */
        org.apache.xmlbeans.XmlString xgetTermsourceID();
        
        /**
         * True if has "termsourceID" attribute
         */
        boolean isSetTermsourceID();
        
        /**
         * Sets the "termsourceID" attribute
         */
        void setTermsourceID(java.lang.String termsourceID);
        
        /**
         * Sets (as xml) the "termsourceID" attribute
         */
        void xsetTermsourceID(org.apache.xmlbeans.XmlString termsourceID);
        
        /**
         * Unsets the "termsourceID" attribute
         */
        void unsetTermsourceID();
        
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
         * An XML type(@http://museum.zib.de/museumdat).
         *
         * This is an atomic type that is a restriction of de.zib.museum.museumdat.NameActorDocument$NameActor$Type.
         */
        public interface Type extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("type00abattrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum PERSONAL_NAME = Enum.forString("personalName");
            static final Enum CORPORATE_NAME = Enum.forString("corporateName");
            
            static final int INT_PERSONAL_NAME = Enum.INT_PERSONAL_NAME;
            static final int INT_CORPORATE_NAME = Enum.INT_CORPORATE_NAME;
            
            /**
             * Enumeration value class for de.zib.museum.museumdat.NameActorDocument$NameActor$Type.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PERSONAL_NAME
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
                
                static final int INT_PERSONAL_NAME = 1;
                static final int INT_CORPORATE_NAME = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("personalName", INT_PERSONAL_NAME),
                      new Enum("corporateName", INT_CORPORATE_NAME),
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
                public static de.zib.museum.museumdat.NameActorDocument.NameActor.Type newValue(java.lang.Object obj) {
                  return (de.zib.museum.museumdat.NameActorDocument.NameActor.Type) type.newValue( obj ); }
                
                public static de.zib.museum.museumdat.NameActorDocument.NameActor.Type newInstance() {
                  return (de.zib.museum.museumdat.NameActorDocument.NameActor.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static de.zib.museum.museumdat.NameActorDocument.NameActor.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (de.zib.museum.museumdat.NameActorDocument.NameActor.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.NameActorDocument.NameActor newInstance() {
              return (de.zib.museum.museumdat.NameActorDocument.NameActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.NameActorDocument.NameActor newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.NameActorDocument.NameActor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.NameActorDocument newInstance() {
          return (de.zib.museum.museumdat.NameActorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.NameActorDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.NameActorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.NameActorDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.NameActorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.NameActorDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.NameActorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.NameActorDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.NameActorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.NameActorDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.NameActorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.NameActorDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.NameActorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.NameActorDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.NameActorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.NameActorDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.NameActorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.NameActorDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.NameActorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.NameActorDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.NameActorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.NameActorDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.NameActorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.NameActorDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.NameActorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.NameActorDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.NameActorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.NameActorDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.NameActorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.NameActorDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.NameActorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.NameActorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.NameActorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.NameActorDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.NameActorDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
