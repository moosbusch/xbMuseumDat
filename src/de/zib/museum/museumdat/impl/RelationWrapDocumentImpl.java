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
package de.zib.museum.museumdat.impl;  import com.google.inject.Inject;
/**
 * A document containing one relationWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class RelationWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.RelationWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelationWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATIONWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "relationWrap");
    
    
    /**
     * Gets the "relationWrap" element
     */
    public de.zib.museum.museumdat.RelationWrapDocument.RelationWrap getRelationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.RelationWrapDocument.RelationWrap target = null;
            target = (de.zib.museum.museumdat.RelationWrapDocument.RelationWrap)get_store().find_element_user(RELATIONWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "relationWrap" element
     */
    @Inject(optional=true) public void setRelationWrap(de.zib.museum.museumdat.RelationWrapDocument.RelationWrap relationWrap)
    {
        generatedSetterHelperImpl(relationWrap, RELATIONWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "relationWrap" element
     */
    public de.zib.museum.museumdat.RelationWrapDocument.RelationWrap addNewRelationWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.RelationWrapDocument.RelationWrap target = null;
            target = (de.zib.museum.museumdat.RelationWrapDocument.RelationWrap)get_store().add_element_user(RELATIONWRAP$0);
            return target;
        }
    }
    /**
     * An XML relationWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class RelationWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.RelationWrapDocument.RelationWrap
    {
        private static final long serialVersionUID = 1L;
        
        public RelationWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INDEXINGSUBJECTWRAP$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingSubjectWrap");
        private static final javax.xml.namespace.QName RELATEDWORKSWRAP$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "relatedWorksWrap");
        
        
        /**
         * Gets the "indexingSubjectWrap" element
         */
        public de.zib.museum.museumdat.IndexingSubjectWrapDocument.IndexingSubjectWrap getIndexingSubjectWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingSubjectWrapDocument.IndexingSubjectWrap target = null;
                target = (de.zib.museum.museumdat.IndexingSubjectWrapDocument.IndexingSubjectWrap)get_store().find_element_user(INDEXINGSUBJECTWRAP$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "indexingSubjectWrap" element
         */
        public boolean isSetIndexingSubjectWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INDEXINGSUBJECTWRAP$0) != 0;
            }
        }
        
        /**
         * Sets the "indexingSubjectWrap" element
         */
        @Inject(optional=true) public void setIndexingSubjectWrap(de.zib.museum.museumdat.IndexingSubjectWrapDocument.IndexingSubjectWrap indexingSubjectWrap)
        {
            generatedSetterHelperImpl(indexingSubjectWrap, INDEXINGSUBJECTWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "indexingSubjectWrap" element
         */
        public de.zib.museum.museumdat.IndexingSubjectWrapDocument.IndexingSubjectWrap addNewIndexingSubjectWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.IndexingSubjectWrapDocument.IndexingSubjectWrap target = null;
                target = (de.zib.museum.museumdat.IndexingSubjectWrapDocument.IndexingSubjectWrap)get_store().add_element_user(INDEXINGSUBJECTWRAP$0);
                return target;
            }
        }
        
        /**
         * Unsets the "indexingSubjectWrap" element
         */
        public void unsetIndexingSubjectWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INDEXINGSUBJECTWRAP$0, 0);
            }
        }
        
        /**
         * Gets the "relatedWorksWrap" element
         */
        public de.zib.museum.museumdat.RelatedWorksWrapDocument.RelatedWorksWrap getRelatedWorksWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RelatedWorksWrapDocument.RelatedWorksWrap target = null;
                target = (de.zib.museum.museumdat.RelatedWorksWrapDocument.RelatedWorksWrap)get_store().find_element_user(RELATEDWORKSWRAP$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "relatedWorksWrap" element
         */
        public boolean isSetRelatedWorksWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELATEDWORKSWRAP$2) != 0;
            }
        }
        
        /**
         * Sets the "relatedWorksWrap" element
         */
        @Inject(optional=true) public void setRelatedWorksWrap(de.zib.museum.museumdat.RelatedWorksWrapDocument.RelatedWorksWrap relatedWorksWrap)
        {
            generatedSetterHelperImpl(relatedWorksWrap, RELATEDWORKSWRAP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "relatedWorksWrap" element
         */
        public de.zib.museum.museumdat.RelatedWorksWrapDocument.RelatedWorksWrap addNewRelatedWorksWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RelatedWorksWrapDocument.RelatedWorksWrap target = null;
                target = (de.zib.museum.museumdat.RelatedWorksWrapDocument.RelatedWorksWrap)get_store().add_element_user(RELATEDWORKSWRAP$2);
                return target;
            }
        }
        
        /**
         * Unsets the "relatedWorksWrap" element
         */
        public void unsetRelatedWorksWrap()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELATEDWORKSWRAP$2, 0);
            }
        }
    }
}
