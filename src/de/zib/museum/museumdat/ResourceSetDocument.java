/*
 * An XML document type.
 * Localname: resourceSet
 * Namespace: http://museum.zib.de/museumdat
 * Java type: de.zib.museum.museumdat.ResourceSetDocument
 *
 * Automatically generated - do not modify.
 */
package de.zib.museum.museumdat;


/**
 * A document containing one resourceSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public interface ResourceSetDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceSetDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("resourcesetfec1doctype");
    
    /**
     * Gets the "resourceSet" element
     */
    de.zib.museum.museumdat.ResourceSetDocument.ResourceSet getResourceSet();
    
    /**
     * Sets the "resourceSet" element
     */
    void setResourceSet(de.zib.museum.museumdat.ResourceSetDocument.ResourceSet resourceSet);
    
    /**
     * Appends and returns a new empty "resourceSet" element
     */
    de.zib.museum.museumdat.ResourceSetDocument.ResourceSet addNewResourceSet();
    
    /**
     * An XML resourceSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public interface ResourceSet extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA3BA01EB72591092E4171C5BCB38F1DD").resolveHandle("resourceset84e1elemtype");
        
        /**
         * Gets the "linkResource" element
         */
        de.zib.museum.museumdat.LinkResourceDocument.LinkResource getLinkResource();
        
        /**
         * True if has "linkResource" element
         */
        boolean isSetLinkResource();
        
        /**
         * Sets the "linkResource" element
         */
        void setLinkResource(de.zib.museum.museumdat.LinkResourceDocument.LinkResource linkResource);
        
        /**
         * Appends and returns a new empty "linkResource" element
         */
        de.zib.museum.museumdat.LinkResourceDocument.LinkResource addNewLinkResource();
        
        /**
         * Unsets the "linkResource" element
         */
        void unsetLinkResource();
        
        /**
         * Gets the "resourceID" element
         */
        de.zib.museum.museumdat.ResourceIDDocument.ResourceID getResourceID();
        
        /**
         * True if has "resourceID" element
         */
        boolean isSetResourceID();
        
        /**
         * Sets the "resourceID" element
         */
        void setResourceID(de.zib.museum.museumdat.ResourceIDDocument.ResourceID resourceID);
        
        /**
         * Appends and returns a new empty "resourceID" element
         */
        de.zib.museum.museumdat.ResourceIDDocument.ResourceID addNewResourceID();
        
        /**
         * Unsets the "resourceID" element
         */
        void unsetResourceID();
        
        /**
         * Gets a List of "resourceRelType" elements
         */
        java.util.List<de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType> getResourceRelTypeList();
        
        /**
         * Gets array of all "resourceRelType" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType[] getResourceRelTypeArray();
        
        /**
         * Gets ith "resourceRelType" element
         */
        de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType getResourceRelTypeArray(int i);
        
        /**
         * Returns number of "resourceRelType" element
         */
        int sizeOfResourceRelTypeArray();
        
        /**
         * Sets array of all "resourceRelType" element
         */
        void setResourceRelTypeArray(de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType[] resourceRelTypeArray);
        
        /**
         * Sets ith "resourceRelType" element
         */
        void setResourceRelTypeArray(int i, de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType resourceRelType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceRelType" element
         */
        de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType insertNewResourceRelType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceRelType" element
         */
        de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType addNewResourceRelType();
        
        /**
         * Removes the ith "resourceRelType" element
         */
        void removeResourceRelType(int i);
        
        /**
         * Gets a List of "resourceType" elements
         */
        java.util.List<de.zib.museum.museumdat.ResourceTypeDocument.ResourceType> getResourceTypeList();
        
        /**
         * Gets array of all "resourceType" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.ResourceTypeDocument.ResourceType[] getResourceTypeArray();
        
        /**
         * Gets ith "resourceType" element
         */
        de.zib.museum.museumdat.ResourceTypeDocument.ResourceType getResourceTypeArray(int i);
        
        /**
         * Returns number of "resourceType" element
         */
        int sizeOfResourceTypeArray();
        
        /**
         * Sets array of all "resourceType" element
         */
        void setResourceTypeArray(de.zib.museum.museumdat.ResourceTypeDocument.ResourceType[] resourceTypeArray);
        
        /**
         * Sets ith "resourceType" element
         */
        void setResourceTypeArray(int i, de.zib.museum.museumdat.ResourceTypeDocument.ResourceType resourceType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceType" element
         */
        de.zib.museum.museumdat.ResourceTypeDocument.ResourceType insertNewResourceType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceType" element
         */
        de.zib.museum.museumdat.ResourceTypeDocument.ResourceType addNewResourceType();
        
        /**
         * Removes the ith "resourceType" element
         */
        void removeResourceType(int i);
        
        /**
         * Gets a List of "rightsResource" elements
         */
        java.util.List<de.zib.museum.museumdat.RightsResourceDocument.RightsResource> getRightsResourceList();
        
        /**
         * Gets array of all "rightsResource" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.RightsResourceDocument.RightsResource[] getRightsResourceArray();
        
        /**
         * Gets ith "rightsResource" element
         */
        de.zib.museum.museumdat.RightsResourceDocument.RightsResource getRightsResourceArray(int i);
        
        /**
         * Returns number of "rightsResource" element
         */
        int sizeOfRightsResourceArray();
        
        /**
         * Sets array of all "rightsResource" element
         */
        void setRightsResourceArray(de.zib.museum.museumdat.RightsResourceDocument.RightsResource[] rightsResourceArray);
        
        /**
         * Sets ith "rightsResource" element
         */
        void setRightsResourceArray(int i, de.zib.museum.museumdat.RightsResourceDocument.RightsResource rightsResource);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "rightsResource" element
         */
        de.zib.museum.museumdat.RightsResourceDocument.RightsResource insertNewRightsResource(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "rightsResource" element
         */
        de.zib.museum.museumdat.RightsResourceDocument.RightsResource addNewRightsResource();
        
        /**
         * Removes the ith "rightsResource" element
         */
        void removeRightsResource(int i);
        
        /**
         * Gets the "resourceViewDescription" element
         */
        de.zib.museum.museumdat.ResourceViewDescriptionDocument.ResourceViewDescription getResourceViewDescription();
        
        /**
         * True if has "resourceViewDescription" element
         */
        boolean isSetResourceViewDescription();
        
        /**
         * Sets the "resourceViewDescription" element
         */
        void setResourceViewDescription(de.zib.museum.museumdat.ResourceViewDescriptionDocument.ResourceViewDescription resourceViewDescription);
        
        /**
         * Appends and returns a new empty "resourceViewDescription" element
         */
        de.zib.museum.museumdat.ResourceViewDescriptionDocument.ResourceViewDescription addNewResourceViewDescription();
        
        /**
         * Unsets the "resourceViewDescription" element
         */
        void unsetResourceViewDescription();
        
        /**
         * Gets a List of "resourceViewType" elements
         */
        java.util.List<de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType> getResourceViewTypeList();
        
        /**
         * Gets array of all "resourceViewType" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType[] getResourceViewTypeArray();
        
        /**
         * Gets ith "resourceViewType" element
         */
        de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType getResourceViewTypeArray(int i);
        
        /**
         * Returns number of "resourceViewType" element
         */
        int sizeOfResourceViewTypeArray();
        
        /**
         * Sets array of all "resourceViewType" element
         */
        void setResourceViewTypeArray(de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType[] resourceViewTypeArray);
        
        /**
         * Sets ith "resourceViewType" element
         */
        void setResourceViewTypeArray(int i, de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType resourceViewType);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceViewType" element
         */
        de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType insertNewResourceViewType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceViewType" element
         */
        de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType addNewResourceViewType();
        
        /**
         * Removes the ith "resourceViewType" element
         */
        void removeResourceViewType(int i);
        
        /**
         * Gets a List of "resourceViewSubjectTerm" elements
         */
        java.util.List<de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm> getResourceViewSubjectTermList();
        
        /**
         * Gets array of all "resourceViewSubjectTerm" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm[] getResourceViewSubjectTermArray();
        
        /**
         * Gets ith "resourceViewSubjectTerm" element
         */
        de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm getResourceViewSubjectTermArray(int i);
        
        /**
         * Returns number of "resourceViewSubjectTerm" element
         */
        int sizeOfResourceViewSubjectTermArray();
        
        /**
         * Sets array of all "resourceViewSubjectTerm" element
         */
        void setResourceViewSubjectTermArray(de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm[] resourceViewSubjectTermArray);
        
        /**
         * Sets ith "resourceViewSubjectTerm" element
         */
        void setResourceViewSubjectTermArray(int i, de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm resourceViewSubjectTerm);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceViewSubjectTerm" element
         */
        de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm insertNewResourceViewSubjectTerm(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceViewSubjectTerm" element
         */
        de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm addNewResourceViewSubjectTerm();
        
        /**
         * Removes the ith "resourceViewSubjectTerm" element
         */
        void removeResourceViewSubjectTerm(int i);
        
        /**
         * Gets the "resourceViewDate" element
         */
        de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate getResourceViewDate();
        
        /**
         * True if has "resourceViewDate" element
         */
        boolean isSetResourceViewDate();
        
        /**
         * Sets the "resourceViewDate" element
         */
        void setResourceViewDate(de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate resourceViewDate);
        
        /**
         * Appends and returns a new empty "resourceViewDate" element
         */
        de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate addNewResourceViewDate();
        
        /**
         * Unsets the "resourceViewDate" element
         */
        void unsetResourceViewDate();
        
        /**
         * Gets a List of "resourceSource" elements
         */
        java.util.List<de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource> getResourceSourceList();
        
        /**
         * Gets array of all "resourceSource" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource[] getResourceSourceArray();
        
        /**
         * Gets ith "resourceSource" element
         */
        de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource getResourceSourceArray(int i);
        
        /**
         * Returns number of "resourceSource" element
         */
        int sizeOfResourceSourceArray();
        
        /**
         * Sets array of all "resourceSource" element
         */
        void setResourceSourceArray(de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource[] resourceSourceArray);
        
        /**
         * Sets ith "resourceSource" element
         */
        void setResourceSourceArray(int i, de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource resourceSource);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceSource" element
         */
        de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource insertNewResourceSource(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceSource" element
         */
        de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource addNewResourceSource();
        
        /**
         * Removes the ith "resourceSource" element
         */
        void removeResourceSource(int i);
        
        /**
         * Gets a List of "linkRelatedResource" elements
         */
        java.util.List<de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource> getLinkRelatedResourceList();
        
        /**
         * Gets array of all "linkRelatedResource" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource[] getLinkRelatedResourceArray();
        
        /**
         * Gets ith "linkRelatedResource" element
         */
        de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource getLinkRelatedResourceArray(int i);
        
        /**
         * Returns number of "linkRelatedResource" element
         */
        int sizeOfLinkRelatedResourceArray();
        
        /**
         * Sets array of all "linkRelatedResource" element
         */
        void setLinkRelatedResourceArray(de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource[] linkRelatedResourceArray);
        
        /**
         * Sets ith "linkRelatedResource" element
         */
        void setLinkRelatedResourceArray(int i, de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource linkRelatedResource);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "linkRelatedResource" element
         */
        de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource insertNewLinkRelatedResource(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "linkRelatedResource" element
         */
        de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource addNewLinkRelatedResource();
        
        /**
         * Removes the ith "linkRelatedResource" element
         */
        void removeLinkRelatedResource(int i);
        
        /**
         * Gets a List of "resourceMetadataLoc" elements
         */
        java.util.List<de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc> getResourceMetadataLocList();
        
        /**
         * Gets array of all "resourceMetadataLoc" elements
         * @deprecated
         */
        @Deprecated
        de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc[] getResourceMetadataLocArray();
        
        /**
         * Gets ith "resourceMetadataLoc" element
         */
        de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc getResourceMetadataLocArray(int i);
        
        /**
         * Returns number of "resourceMetadataLoc" element
         */
        int sizeOfResourceMetadataLocArray();
        
        /**
         * Sets array of all "resourceMetadataLoc" element
         */
        void setResourceMetadataLocArray(de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc[] resourceMetadataLocArray);
        
        /**
         * Sets ith "resourceMetadataLoc" element
         */
        void setResourceMetadataLocArray(int i, de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc resourceMetadataLoc);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resourceMetadataLoc" element
         */
        de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc insertNewResourceMetadataLoc(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resourceMetadataLoc" element
         */
        de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc addNewResourceMetadataLoc();
        
        /**
         * Removes the ith "resourceMetadataLoc" element
         */
        void removeResourceMetadataLoc(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static de.zib.museum.museumdat.ResourceSetDocument.ResourceSet newInstance() {
              return (de.zib.museum.museumdat.ResourceSetDocument.ResourceSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static de.zib.museum.museumdat.ResourceSetDocument.ResourceSet newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (de.zib.museum.museumdat.ResourceSetDocument.ResourceSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static de.zib.museum.museumdat.ResourceSetDocument newInstance() {
          return (de.zib.museum.museumdat.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static de.zib.museum.museumdat.ResourceSetDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (de.zib.museum.museumdat.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static de.zib.museum.museumdat.ResourceSetDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static de.zib.museum.museumdat.ResourceSetDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static de.zib.museum.museumdat.ResourceSetDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static de.zib.museum.museumdat.ResourceSetDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static de.zib.museum.museumdat.ResourceSetDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static de.zib.museum.museumdat.ResourceSetDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static de.zib.museum.museumdat.ResourceSetDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static de.zib.museum.museumdat.ResourceSetDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static de.zib.museum.museumdat.ResourceSetDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static de.zib.museum.museumdat.ResourceSetDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (de.zib.museum.museumdat.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static de.zib.museum.museumdat.ResourceSetDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static de.zib.museum.museumdat.ResourceSetDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static de.zib.museum.museumdat.ResourceSetDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static de.zib.museum.museumdat.ResourceSetDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (de.zib.museum.museumdat.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.ResourceSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static de.zib.museum.museumdat.ResourceSetDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (de.zib.museum.museumdat.ResourceSetDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
