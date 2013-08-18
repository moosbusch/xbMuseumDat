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
 * A document containing one cultureWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class CultureWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.CultureWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public CultureWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CULTUREWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "cultureWrap");
    
    
    /**
     * Gets the "cultureWrap" element
     */
    public de.zib.museum.museumdat.CultureWrapDocument.CultureWrap getCultureWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.CultureWrapDocument.CultureWrap target = null;
            target = (de.zib.museum.museumdat.CultureWrapDocument.CultureWrap)get_store().find_element_user(CULTUREWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cultureWrap" element
     */
    @Inject(optional=true) public void setCultureWrap(de.zib.museum.museumdat.CultureWrapDocument.CultureWrap cultureWrap)
    {
        generatedSetterHelperImpl(cultureWrap, CULTUREWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "cultureWrap" element
     */
    public de.zib.museum.museumdat.CultureWrapDocument.CultureWrap addNewCultureWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.CultureWrapDocument.CultureWrap target = null;
            target = (de.zib.museum.museumdat.CultureWrapDocument.CultureWrap)get_store().add_element_user(CULTUREWRAP$0);
            return target;
        }
    }
    /**
     * An XML cultureWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class CultureWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.CultureWrapDocument.CultureWrap
    {
        private static final long serialVersionUID = 1L;
        
        public CultureWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CULTURE$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "culture");
        
        
        /**
         * Gets a List of "culture" elements
         */
        public java.util.List<de.zib.museum.museumdat.CultureDocument.Culture> getCultureList()
        {
            final class CultureList extends java.util.AbstractList<de.zib.museum.museumdat.CultureDocument.Culture>
            {
                @Override
                public de.zib.museum.museumdat.CultureDocument.Culture get(int i)
                    { return CultureWrapImpl.this.getCultureArray(i); }
                
                @Override
                public de.zib.museum.museumdat.CultureDocument.Culture set(int i, de.zib.museum.museumdat.CultureDocument.Culture o)
                {
                    de.zib.museum.museumdat.CultureDocument.Culture old = CultureWrapImpl.this.getCultureArray(i);
                    CultureWrapImpl.this.setCultureArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.CultureDocument.Culture o)
                    { CultureWrapImpl.this.insertNewCulture(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.CultureDocument.Culture remove(int i)
                {
                    de.zib.museum.museumdat.CultureDocument.Culture old = CultureWrapImpl.this.getCultureArray(i);
                    CultureWrapImpl.this.removeCulture(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return CultureWrapImpl.this.sizeOfCultureArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new CultureList();
            }
        }
        
        /**
         * Gets array of all "culture" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.CultureDocument.Culture[] getCultureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.CultureDocument.Culture> targetList = new java.util.ArrayList<de.zib.museum.museumdat.CultureDocument.Culture>();
                get_store().find_all_element_users(CULTURE$0, targetList);
                de.zib.museum.museumdat.CultureDocument.Culture[] result = new de.zib.museum.museumdat.CultureDocument.Culture[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "culture" element
         */
        public de.zib.museum.museumdat.CultureDocument.Culture getCultureArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.CultureDocument.Culture target = null;
                target = (de.zib.museum.museumdat.CultureDocument.Culture)get_store().find_element_user(CULTURE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "culture" element
         */
        public int sizeOfCultureArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CULTURE$0);
            }
        }
        
        /**
         * Sets array of all "culture" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setCultureArray(de.zib.museum.museumdat.CultureDocument.Culture[] cultureArray)
        {
            check_orphaned();
            arraySetterHelper(cultureArray, CULTURE$0);
        }
        
        /**
         * Sets ith "culture" element
         */
        @Inject(optional=true) public void setCultureArray(int i, de.zib.museum.museumdat.CultureDocument.Culture culture)
        {
            generatedSetterHelperImpl(culture, CULTURE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "culture" element
         */
        public de.zib.museum.museumdat.CultureDocument.Culture insertNewCulture(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.CultureDocument.Culture target = null;
                target = (de.zib.museum.museumdat.CultureDocument.Culture)get_store().insert_element_user(CULTURE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "culture" element
         */
        public de.zib.museum.museumdat.CultureDocument.Culture addNewCulture()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.CultureDocument.Culture target = null;
                target = (de.zib.museum.museumdat.CultureDocument.Culture)get_store().add_element_user(CULTURE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "culture" element
         */
        public void removeCulture(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CULTURE$0, i);
            }
        }
    }
}
