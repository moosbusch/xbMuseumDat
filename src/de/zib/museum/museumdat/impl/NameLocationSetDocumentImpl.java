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
 * A document containing one nameLocationSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class NameLocationSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.NameLocationSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public NameLocationSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAMELOCATIONSET$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "nameLocationSet");
    
    
    /**
     * Gets the "nameLocationSet" element
     */
    public de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet getNameLocationSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet target = null;
            target = (de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet)get_store().find_element_user(NAMELOCATIONSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "nameLocationSet" element
     */
    public void setNameLocationSet(de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet nameLocationSet)
    {
        generatedSetterHelperImpl(nameLocationSet, NAMELOCATIONSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "nameLocationSet" element
     */
    public de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet addNewNameLocationSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet target = null;
            target = (de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet)get_store().add_element_user(NAMELOCATIONSET$0);
            return target;
        }
    }
    /**
     * An XML nameLocationSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class NameLocationSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet
    {
        private static final long serialVersionUID = 1L;
        
        public NameLocationSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAMELOCATION$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "nameLocation");
        private static final javax.xml.namespace.QName SOURCENAMELOCATION$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "sourceNameLocation");
        
        
        /**
         * Gets the "nameLocation" element
         */
        public de.zib.museum.museumdat.NameLocationDocument.NameLocation getNameLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.NameLocationDocument.NameLocation target = null;
                target = (de.zib.museum.museumdat.NameLocationDocument.NameLocation)get_store().find_element_user(NAMELOCATION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "nameLocation" element
         */
        public void setNameLocation(de.zib.museum.museumdat.NameLocationDocument.NameLocation nameLocation)
        {
            generatedSetterHelperImpl(nameLocation, NAMELOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "nameLocation" element
         */
        public de.zib.museum.museumdat.NameLocationDocument.NameLocation addNewNameLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.NameLocationDocument.NameLocation target = null;
                target = (de.zib.museum.museumdat.NameLocationDocument.NameLocation)get_store().add_element_user(NAMELOCATION$0);
                return target;
            }
        }
        
        /**
         * Gets a List of "sourceNameLocation" elements
         */
        public java.util.List<de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation> getSourceNameLocationList()
        {
            final class SourceNameLocationList extends java.util.AbstractList<de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation>
            {
                @Override
                public de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation get(int i)
                    { return NameLocationSetImpl.this.getSourceNameLocationArray(i); }
                
                @Override
                public de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation set(int i, de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation o)
                {
                    de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation old = NameLocationSetImpl.this.getSourceNameLocationArray(i);
                    NameLocationSetImpl.this.setSourceNameLocationArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation o)
                    { NameLocationSetImpl.this.insertNewSourceNameLocation(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation remove(int i)
                {
                    de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation old = NameLocationSetImpl.this.getSourceNameLocationArray(i);
                    NameLocationSetImpl.this.removeSourceNameLocation(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return NameLocationSetImpl.this.sizeOfSourceNameLocationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SourceNameLocationList();
            }
        }
        
        /**
         * Gets array of all "sourceNameLocation" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation[] getSourceNameLocationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation> targetList = new java.util.ArrayList<de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation>();
                get_store().find_all_element_users(SOURCENAMELOCATION$2, targetList);
                de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation[] result = new de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "sourceNameLocation" element
         */
        public de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation getSourceNameLocationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation target = null;
                target = (de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation)get_store().find_element_user(SOURCENAMELOCATION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "sourceNameLocation" element
         */
        public int sizeOfSourceNameLocationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCENAMELOCATION$2);
            }
        }
        
        /**
         * Sets array of all "sourceNameLocation" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSourceNameLocationArray(de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation[] sourceNameLocationArray)
        {
            check_orphaned();
            arraySetterHelper(sourceNameLocationArray, SOURCENAMELOCATION$2);
        }
        
        /**
         * Sets ith "sourceNameLocation" element
         */
        public void setSourceNameLocationArray(int i, de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation sourceNameLocation)
        {
            generatedSetterHelperImpl(sourceNameLocation, SOURCENAMELOCATION$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceNameLocation" element
         */
        public de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation insertNewSourceNameLocation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation target = null;
                target = (de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation)get_store().insert_element_user(SOURCENAMELOCATION$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceNameLocation" element
         */
        public de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation addNewSourceNameLocation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation target = null;
                target = (de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation)get_store().add_element_user(SOURCENAMELOCATION$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "sourceNameLocation" element
         */
        public void removeSourceNameLocation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCENAMELOCATION$2, i);
            }
        }
    }
}
