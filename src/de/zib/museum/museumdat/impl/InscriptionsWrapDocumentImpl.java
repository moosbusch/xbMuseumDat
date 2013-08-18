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
 * A document containing one inscriptionsWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class InscriptionsWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.InscriptionsWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public InscriptionsWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSCRIPTIONSWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "inscriptionsWrap");
    
    
    /**
     * Gets the "inscriptionsWrap" element
     */
    public de.zib.museum.museumdat.InscriptionsWrapDocument.InscriptionsWrap getInscriptionsWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.InscriptionsWrapDocument.InscriptionsWrap target = null;
            target = (de.zib.museum.museumdat.InscriptionsWrapDocument.InscriptionsWrap)get_store().find_element_user(INSCRIPTIONSWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "inscriptionsWrap" element
     */
    @Inject(optional=true) public void setInscriptionsWrap(de.zib.museum.museumdat.InscriptionsWrapDocument.InscriptionsWrap inscriptionsWrap)
    {
        generatedSetterHelperImpl(inscriptionsWrap, INSCRIPTIONSWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "inscriptionsWrap" element
     */
    public de.zib.museum.museumdat.InscriptionsWrapDocument.InscriptionsWrap addNewInscriptionsWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.InscriptionsWrapDocument.InscriptionsWrap target = null;
            target = (de.zib.museum.museumdat.InscriptionsWrapDocument.InscriptionsWrap)get_store().add_element_user(INSCRIPTIONSWRAP$0);
            return target;
        }
    }
    /**
     * An XML inscriptionsWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class InscriptionsWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.InscriptionsWrapDocument.InscriptionsWrap
    {
        private static final long serialVersionUID = 1L;
        
        public InscriptionsWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INSCRIPTIONS$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "inscriptions");
        
        
        /**
         * Gets a List of "inscriptions" elements
         */
        public java.util.List<de.zib.museum.museumdat.InscriptionsDocument.Inscriptions> getInscriptionsList()
        {
            final class InscriptionsList extends java.util.AbstractList<de.zib.museum.museumdat.InscriptionsDocument.Inscriptions>
            {
                @Override
                public de.zib.museum.museumdat.InscriptionsDocument.Inscriptions get(int i)
                    { return InscriptionsWrapImpl.this.getInscriptionsArray(i); }
                
                @Override
                public de.zib.museum.museumdat.InscriptionsDocument.Inscriptions set(int i, de.zib.museum.museumdat.InscriptionsDocument.Inscriptions o)
                {
                    de.zib.museum.museumdat.InscriptionsDocument.Inscriptions old = InscriptionsWrapImpl.this.getInscriptionsArray(i);
                    InscriptionsWrapImpl.this.setInscriptionsArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.InscriptionsDocument.Inscriptions o)
                    { InscriptionsWrapImpl.this.insertNewInscriptions(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.InscriptionsDocument.Inscriptions remove(int i)
                {
                    de.zib.museum.museumdat.InscriptionsDocument.Inscriptions old = InscriptionsWrapImpl.this.getInscriptionsArray(i);
                    InscriptionsWrapImpl.this.removeInscriptions(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return InscriptionsWrapImpl.this.sizeOfInscriptionsArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new InscriptionsList();
            }
        }
        
        /**
         * Gets array of all "inscriptions" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.InscriptionsDocument.Inscriptions[] getInscriptionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.InscriptionsDocument.Inscriptions> targetList = new java.util.ArrayList<de.zib.museum.museumdat.InscriptionsDocument.Inscriptions>();
                get_store().find_all_element_users(INSCRIPTIONS$0, targetList);
                de.zib.museum.museumdat.InscriptionsDocument.Inscriptions[] result = new de.zib.museum.museumdat.InscriptionsDocument.Inscriptions[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "inscriptions" element
         */
        public de.zib.museum.museumdat.InscriptionsDocument.Inscriptions getInscriptionsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.InscriptionsDocument.Inscriptions target = null;
                target = (de.zib.museum.museumdat.InscriptionsDocument.Inscriptions)get_store().find_element_user(INSCRIPTIONS$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "inscriptions" element
         */
        public int sizeOfInscriptionsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(INSCRIPTIONS$0);
            }
        }
        
        /**
         * Sets array of all "inscriptions" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setInscriptionsArray(de.zib.museum.museumdat.InscriptionsDocument.Inscriptions[] inscriptionsArray)
        {
            check_orphaned();
            arraySetterHelper(inscriptionsArray, INSCRIPTIONS$0);
        }
        
        /**
         * Sets ith "inscriptions" element
         */
        @Inject(optional=true) public void setInscriptionsArray(int i, de.zib.museum.museumdat.InscriptionsDocument.Inscriptions inscriptions)
        {
            generatedSetterHelperImpl(inscriptions, INSCRIPTIONS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "inscriptions" element
         */
        public de.zib.museum.museumdat.InscriptionsDocument.Inscriptions insertNewInscriptions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.InscriptionsDocument.Inscriptions target = null;
                target = (de.zib.museum.museumdat.InscriptionsDocument.Inscriptions)get_store().insert_element_user(INSCRIPTIONS$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "inscriptions" element
         */
        public de.zib.museum.museumdat.InscriptionsDocument.Inscriptions addNewInscriptions()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.InscriptionsDocument.Inscriptions target = null;
                target = (de.zib.museum.museumdat.InscriptionsDocument.Inscriptions)get_store().add_element_user(INSCRIPTIONS$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "inscriptions" element
         */
        public void removeInscriptions(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(INSCRIPTIONS$0, i);
            }
        }
    }
}
