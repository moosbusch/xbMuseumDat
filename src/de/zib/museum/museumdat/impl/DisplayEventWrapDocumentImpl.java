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
 * A document containing one displayEventWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class DisplayEventWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.DisplayEventWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisplayEventWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYEVENTWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "displayEventWrap");
    
    
    /**
     * Gets the "displayEventWrap" element
     */
    public de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap getDisplayEventWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap target = null;
            target = (de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap)get_store().find_element_user(DISPLAYEVENTWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "displayEventWrap" element
     */
    @Inject(optional=true) public void setDisplayEventWrap(de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap displayEventWrap)
    {
        generatedSetterHelperImpl(displayEventWrap, DISPLAYEVENTWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "displayEventWrap" element
     */
    public de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap addNewDisplayEventWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap target = null;
            target = (de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap)get_store().add_element_user(DISPLAYEVENTWRAP$0);
            return target;
        }
    }
    /**
     * An XML displayEventWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class DisplayEventWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap
    {
        private static final long serialVersionUID = 1L;
        
        public DisplayEventWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DISPLAYEVENT$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "displayEvent");
        
        
        /**
         * Gets a List of "displayEvent" elements
         */
        public java.util.List<de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent> getDisplayEventList()
        {
            final class DisplayEventList extends java.util.AbstractList<de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent>
            {
                @Override
                public de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent get(int i)
                    { return DisplayEventWrapImpl.this.getDisplayEventArray(i); }
                
                @Override
                public de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent set(int i, de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent o)
                {
                    de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent old = DisplayEventWrapImpl.this.getDisplayEventArray(i);
                    DisplayEventWrapImpl.this.setDisplayEventArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent o)
                    { DisplayEventWrapImpl.this.insertNewDisplayEvent(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent remove(int i)
                {
                    de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent old = DisplayEventWrapImpl.this.getDisplayEventArray(i);
                    DisplayEventWrapImpl.this.removeDisplayEvent(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return DisplayEventWrapImpl.this.sizeOfDisplayEventArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DisplayEventList();
            }
        }
        
        /**
         * Gets array of all "displayEvent" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent[] getDisplayEventArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent> targetList = new java.util.ArrayList<de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent>();
                get_store().find_all_element_users(DISPLAYEVENT$0, targetList);
                de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent[] result = new de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "displayEvent" element
         */
        public de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent getDisplayEventArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent target = null;
                target = (de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent)get_store().find_element_user(DISPLAYEVENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "displayEvent" element
         */
        public int sizeOfDisplayEventArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPLAYEVENT$0);
            }
        }
        
        /**
         * Sets array of all "displayEvent" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setDisplayEventArray(de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent[] displayEventArray)
        {
            check_orphaned();
            arraySetterHelper(displayEventArray, DISPLAYEVENT$0);
        }
        
        /**
         * Sets ith "displayEvent" element
         */
        @Inject(optional=true) public void setDisplayEventArray(int i, de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent displayEvent)
        {
            generatedSetterHelperImpl(displayEvent, DISPLAYEVENT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "displayEvent" element
         */
        public de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent insertNewDisplayEvent(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent target = null;
                target = (de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent)get_store().insert_element_user(DISPLAYEVENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "displayEvent" element
         */
        public de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent addNewDisplayEvent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent target = null;
                target = (de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent)get_store().add_element_user(DISPLAYEVENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "displayEvent" element
         */
        public void removeDisplayEvent(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPLAYEVENT$0, i);
            }
        }
    }
}
