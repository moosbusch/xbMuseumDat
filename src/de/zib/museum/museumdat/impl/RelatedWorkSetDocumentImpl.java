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
package de.zib.museum.museumdat.impl;  
/**
 * A document containing one relatedWorkSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class RelatedWorkSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.RelatedWorkSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelatedWorkSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATEDWORKSET$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "relatedWorkSet");
    
    
    /**
     * Gets the "relatedWorkSet" element
     */
    public de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet getRelatedWorkSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet target = null;
            target = (de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet)get_store().find_element_user(RELATEDWORKSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "relatedWorkSet" element
     */
    public void setRelatedWorkSet(de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet relatedWorkSet)
    {
        generatedSetterHelperImpl(relatedWorkSet, RELATEDWORKSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "relatedWorkSet" element
     */
    public de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet addNewRelatedWorkSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet target = null;
            target = (de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet)get_store().add_element_user(RELATEDWORKSET$0);
            return target;
        }
    }
    /**
     * An XML relatedWorkSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class RelatedWorkSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet
    {
        private static final long serialVersionUID = 1L;
        
        public RelatedWorkSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LINKRELATEDWORK$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "linkRelatedWork");
        private static final javax.xml.namespace.QName RELATEDWORKRELTYPE$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "relatedWorkRelType");
        private static final javax.xml.namespace.QName LABELRELATEDWORK$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "labelRelatedWork");
        private static final javax.xml.namespace.QName LOCRELATEDWORK$6 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "locRelatedWork");
        
        
        /**
         * Gets a List of "linkRelatedWork" elements
         */
        public java.util.List<de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork> getLinkRelatedWorkList()
        {
            final class LinkRelatedWorkList extends java.util.AbstractList<de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork>
            {
                @Override
                public de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork get(int i)
                    { return RelatedWorkSetImpl.this.getLinkRelatedWorkArray(i); }
                
                @Override
                public de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork set(int i, de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork o)
                {
                    de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork old = RelatedWorkSetImpl.this.getLinkRelatedWorkArray(i);
                    RelatedWorkSetImpl.this.setLinkRelatedWorkArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork o)
                    { RelatedWorkSetImpl.this.insertNewLinkRelatedWork(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork remove(int i)
                {
                    de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork old = RelatedWorkSetImpl.this.getLinkRelatedWorkArray(i);
                    RelatedWorkSetImpl.this.removeLinkRelatedWork(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RelatedWorkSetImpl.this.sizeOfLinkRelatedWorkArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LinkRelatedWorkList();
            }
        }
        
        /**
         * Gets array of all "linkRelatedWork" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork[] getLinkRelatedWorkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork> targetList = new java.util.ArrayList<de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork>();
                get_store().find_all_element_users(LINKRELATEDWORK$0, targetList);
                de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork[] result = new de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "linkRelatedWork" element
         */
        public de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork getLinkRelatedWorkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork target = null;
                target = (de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork)get_store().find_element_user(LINKRELATEDWORK$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "linkRelatedWork" element
         */
        public int sizeOfLinkRelatedWorkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LINKRELATEDWORK$0);
            }
        }
        
        /**
         * Sets array of all "linkRelatedWork" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLinkRelatedWorkArray(de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork[] linkRelatedWorkArray)
        {
            check_orphaned();
            arraySetterHelper(linkRelatedWorkArray, LINKRELATEDWORK$0);
        }
        
        /**
         * Sets ith "linkRelatedWork" element
         */
        public void setLinkRelatedWorkArray(int i, de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork linkRelatedWork)
        {
            generatedSetterHelperImpl(linkRelatedWork, LINKRELATEDWORK$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "linkRelatedWork" element
         */
        public de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork insertNewLinkRelatedWork(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork target = null;
                target = (de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork)get_store().insert_element_user(LINKRELATEDWORK$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "linkRelatedWork" element
         */
        public de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork addNewLinkRelatedWork()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork target = null;
                target = (de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork)get_store().add_element_user(LINKRELATEDWORK$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "linkRelatedWork" element
         */
        public void removeLinkRelatedWork(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LINKRELATEDWORK$0, i);
            }
        }
        
        /**
         * Gets the "relatedWorkRelType" element
         */
        public de.zib.museum.museumdat.RelatedWorkRelTypeDocument.RelatedWorkRelType getRelatedWorkRelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RelatedWorkRelTypeDocument.RelatedWorkRelType target = null;
                target = (de.zib.museum.museumdat.RelatedWorkRelTypeDocument.RelatedWorkRelType)get_store().find_element_user(RELATEDWORKRELTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "relatedWorkRelType" element
         */
        public boolean isSetRelatedWorkRelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RELATEDWORKRELTYPE$2) != 0;
            }
        }
        
        /**
         * Sets the "relatedWorkRelType" element
         */
        public void setRelatedWorkRelType(de.zib.museum.museumdat.RelatedWorkRelTypeDocument.RelatedWorkRelType relatedWorkRelType)
        {
            generatedSetterHelperImpl(relatedWorkRelType, RELATEDWORKRELTYPE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "relatedWorkRelType" element
         */
        public de.zib.museum.museumdat.RelatedWorkRelTypeDocument.RelatedWorkRelType addNewRelatedWorkRelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RelatedWorkRelTypeDocument.RelatedWorkRelType target = null;
                target = (de.zib.museum.museumdat.RelatedWorkRelTypeDocument.RelatedWorkRelType)get_store().add_element_user(RELATEDWORKRELTYPE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "relatedWorkRelType" element
         */
        public void unsetRelatedWorkRelType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RELATEDWORKRELTYPE$2, 0);
            }
        }
        
        /**
         * Gets a List of "labelRelatedWork" elements
         */
        public java.util.List<de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork> getLabelRelatedWorkList()
        {
            final class LabelRelatedWorkList extends java.util.AbstractList<de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork>
            {
                @Override
                public de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork get(int i)
                    { return RelatedWorkSetImpl.this.getLabelRelatedWorkArray(i); }
                
                @Override
                public de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork set(int i, de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork o)
                {
                    de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork old = RelatedWorkSetImpl.this.getLabelRelatedWorkArray(i);
                    RelatedWorkSetImpl.this.setLabelRelatedWorkArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork o)
                    { RelatedWorkSetImpl.this.insertNewLabelRelatedWork(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork remove(int i)
                {
                    de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork old = RelatedWorkSetImpl.this.getLabelRelatedWorkArray(i);
                    RelatedWorkSetImpl.this.removeLabelRelatedWork(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RelatedWorkSetImpl.this.sizeOfLabelRelatedWorkArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LabelRelatedWorkList();
            }
        }
        
        /**
         * Gets array of all "labelRelatedWork" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork[] getLabelRelatedWorkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork> targetList = new java.util.ArrayList<de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork>();
                get_store().find_all_element_users(LABELRELATEDWORK$4, targetList);
                de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork[] result = new de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "labelRelatedWork" element
         */
        public de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork getLabelRelatedWorkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork target = null;
                target = (de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork)get_store().find_element_user(LABELRELATEDWORK$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "labelRelatedWork" element
         */
        public int sizeOfLabelRelatedWorkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LABELRELATEDWORK$4);
            }
        }
        
        /**
         * Sets array of all "labelRelatedWork" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLabelRelatedWorkArray(de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork[] labelRelatedWorkArray)
        {
            check_orphaned();
            arraySetterHelper(labelRelatedWorkArray, LABELRELATEDWORK$4);
        }
        
        /**
         * Sets ith "labelRelatedWork" element
         */
        public void setLabelRelatedWorkArray(int i, de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork labelRelatedWork)
        {
            generatedSetterHelperImpl(labelRelatedWork, LABELRELATEDWORK$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "labelRelatedWork" element
         */
        public de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork insertNewLabelRelatedWork(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork target = null;
                target = (de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork)get_store().insert_element_user(LABELRELATEDWORK$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "labelRelatedWork" element
         */
        public de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork addNewLabelRelatedWork()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork target = null;
                target = (de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork)get_store().add_element_user(LABELRELATEDWORK$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "labelRelatedWork" element
         */
        public void removeLabelRelatedWork(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LABELRELATEDWORK$4, i);
            }
        }
        
        /**
         * Gets a List of "locRelatedWork" elements
         */
        public java.util.List<de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork> getLocRelatedWorkList()
        {
            final class LocRelatedWorkList extends java.util.AbstractList<de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork>
            {
                @Override
                public de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork get(int i)
                    { return RelatedWorkSetImpl.this.getLocRelatedWorkArray(i); }
                
                @Override
                public de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork set(int i, de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork o)
                {
                    de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork old = RelatedWorkSetImpl.this.getLocRelatedWorkArray(i);
                    RelatedWorkSetImpl.this.setLocRelatedWorkArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork o)
                    { RelatedWorkSetImpl.this.insertNewLocRelatedWork(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork remove(int i)
                {
                    de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork old = RelatedWorkSetImpl.this.getLocRelatedWorkArray(i);
                    RelatedWorkSetImpl.this.removeLocRelatedWork(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return RelatedWorkSetImpl.this.sizeOfLocRelatedWorkArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new LocRelatedWorkList();
            }
        }
        
        /**
         * Gets array of all "locRelatedWork" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork[] getLocRelatedWorkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork> targetList = new java.util.ArrayList<de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork>();
                get_store().find_all_element_users(LOCRELATEDWORK$6, targetList);
                de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork[] result = new de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "locRelatedWork" element
         */
        public de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork getLocRelatedWorkArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork target = null;
                target = (de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork)get_store().find_element_user(LOCRELATEDWORK$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "locRelatedWork" element
         */
        public int sizeOfLocRelatedWorkArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LOCRELATEDWORK$6);
            }
        }
        
        /**
         * Sets array of all "locRelatedWork" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLocRelatedWorkArray(de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork[] locRelatedWorkArray)
        {
            check_orphaned();
            arraySetterHelper(locRelatedWorkArray, LOCRELATEDWORK$6);
        }
        
        /**
         * Sets ith "locRelatedWork" element
         */
        public void setLocRelatedWorkArray(int i, de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork locRelatedWork)
        {
            generatedSetterHelperImpl(locRelatedWork, LOCRELATEDWORK$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "locRelatedWork" element
         */
        public de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork insertNewLocRelatedWork(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork target = null;
                target = (de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork)get_store().insert_element_user(LOCRELATEDWORK$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "locRelatedWork" element
         */
        public de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork addNewLocRelatedWork()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork target = null;
                target = (de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork)get_store().add_element_user(LOCRELATEDWORK$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "locRelatedWork" element
         */
        public void removeLocRelatedWork(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LOCRELATEDWORK$6, i);
            }
        }
    }
}
