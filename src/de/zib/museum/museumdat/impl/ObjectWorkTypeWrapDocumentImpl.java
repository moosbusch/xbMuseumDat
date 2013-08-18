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
 * A document containing one objectWorkTypeWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class ObjectWorkTypeWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.ObjectWorkTypeWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public ObjectWorkTypeWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OBJECTWORKTYPEWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "objectWorkTypeWrap");
    
    
    /**
     * Gets the "objectWorkTypeWrap" element
     */
    public de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap getObjectWorkTypeWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap target = null;
            target = (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap)get_store().find_element_user(OBJECTWORKTYPEWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "objectWorkTypeWrap" element
     */
    @Inject(optional=true) public void setObjectWorkTypeWrap(de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap objectWorkTypeWrap)
    {
        generatedSetterHelperImpl(objectWorkTypeWrap, OBJECTWORKTYPEWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "objectWorkTypeWrap" element
     */
    public de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap addNewObjectWorkTypeWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap target = null;
            target = (de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap)get_store().add_element_user(OBJECTWORKTYPEWRAP$0);
            return target;
        }
    }
    /**
     * An XML objectWorkTypeWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class ObjectWorkTypeWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap
    {
        private static final long serialVersionUID = 1L;
        
        public ObjectWorkTypeWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OBJECTWORKTYPE$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "objectWorkType");
        
        
        /**
         * Gets a List of "objectWorkType" elements
         */
        public java.util.List<de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType> getObjectWorkTypeList()
        {
            final class ObjectWorkTypeList extends java.util.AbstractList<de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType>
            {
                @Override
                public de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType get(int i)
                    { return ObjectWorkTypeWrapImpl.this.getObjectWorkTypeArray(i); }
                
                @Override
                public de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType set(int i, de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType o)
                {
                    de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType old = ObjectWorkTypeWrapImpl.this.getObjectWorkTypeArray(i);
                    ObjectWorkTypeWrapImpl.this.setObjectWorkTypeArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType o)
                    { ObjectWorkTypeWrapImpl.this.insertNewObjectWorkType(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType remove(int i)
                {
                    de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType old = ObjectWorkTypeWrapImpl.this.getObjectWorkTypeArray(i);
                    ObjectWorkTypeWrapImpl.this.removeObjectWorkType(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ObjectWorkTypeWrapImpl.this.sizeOfObjectWorkTypeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ObjectWorkTypeList();
            }
        }
        
        /**
         * Gets array of all "objectWorkType" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType[] getObjectWorkTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType> targetList = new java.util.ArrayList<de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType>();
                get_store().find_all_element_users(OBJECTWORKTYPE$0, targetList);
                de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType[] result = new de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "objectWorkType" element
         */
        public de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType getObjectWorkTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType target = null;
                target = (de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType)get_store().find_element_user(OBJECTWORKTYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "objectWorkType" element
         */
        public int sizeOfObjectWorkTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OBJECTWORKTYPE$0);
            }
        }
        
        /**
         * Sets array of all "objectWorkType" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setObjectWorkTypeArray(de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType[] objectWorkTypeArray)
        {
            check_orphaned();
            arraySetterHelper(objectWorkTypeArray, OBJECTWORKTYPE$0);
        }
        
        /**
         * Sets ith "objectWorkType" element
         */
        @Inject(optional=true) public void setObjectWorkTypeArray(int i, de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType objectWorkType)
        {
            generatedSetterHelperImpl(objectWorkType, OBJECTWORKTYPE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "objectWorkType" element
         */
        public de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType insertNewObjectWorkType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType target = null;
                target = (de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType)get_store().insert_element_user(OBJECTWORKTYPE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "objectWorkType" element
         */
        public de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType addNewObjectWorkType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType target = null;
                target = (de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType)get_store().add_element_user(OBJECTWORKTYPE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "objectWorkType" element
         */
        public void removeObjectWorkType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OBJECTWORKTYPE$0, i);
            }
        }
    }
}
