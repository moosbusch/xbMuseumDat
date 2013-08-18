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
 * A document containing one displayStateEditionWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class DisplayStateEditionWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.DisplayStateEditionWrapDocument
{
    private static final long serialVersionUID = 1L;
    
    public DisplayStateEditionWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISPLAYSTATEEDITIONWRAP$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "displayStateEditionWrap");
    
    
    /**
     * Gets the "displayStateEditionWrap" element
     */
    public de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap getDisplayStateEditionWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap target = null;
            target = (de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap)get_store().find_element_user(DISPLAYSTATEEDITIONWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "displayStateEditionWrap" element
     */
    @Inject(optional=true) public void setDisplayStateEditionWrap(de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap displayStateEditionWrap)
    {
        generatedSetterHelperImpl(displayStateEditionWrap, DISPLAYSTATEEDITIONWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "displayStateEditionWrap" element
     */
    public de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap addNewDisplayStateEditionWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap target = null;
            target = (de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap)get_store().add_element_user(DISPLAYSTATEEDITIONWRAP$0);
            return target;
        }
    }
    /**
     * An XML displayStateEditionWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class DisplayStateEditionWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap
    {
        private static final long serialVersionUID = 1L;
        
        public DisplayStateEditionWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DISPLAYSTATE$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "displayState");
        private static final javax.xml.namespace.QName DISPLAYEDITION$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "displayEdition");
        private static final javax.xml.namespace.QName SOURCESTATEEDITION$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "sourceStateEdition");
        
        
        /**
         * Gets a List of "displayState" elements
         */
        public java.util.List<de.zib.museum.museumdat.DisplayStateDocument.DisplayState> getDisplayStateList()
        {
            final class DisplayStateList extends java.util.AbstractList<de.zib.museum.museumdat.DisplayStateDocument.DisplayState>
            {
                @Override
                public de.zib.museum.museumdat.DisplayStateDocument.DisplayState get(int i)
                    { return DisplayStateEditionWrapImpl.this.getDisplayStateArray(i); }
                
                @Override
                public de.zib.museum.museumdat.DisplayStateDocument.DisplayState set(int i, de.zib.museum.museumdat.DisplayStateDocument.DisplayState o)
                {
                    de.zib.museum.museumdat.DisplayStateDocument.DisplayState old = DisplayStateEditionWrapImpl.this.getDisplayStateArray(i);
                    DisplayStateEditionWrapImpl.this.setDisplayStateArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.DisplayStateDocument.DisplayState o)
                    { DisplayStateEditionWrapImpl.this.insertNewDisplayState(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.DisplayStateDocument.DisplayState remove(int i)
                {
                    de.zib.museum.museumdat.DisplayStateDocument.DisplayState old = DisplayStateEditionWrapImpl.this.getDisplayStateArray(i);
                    DisplayStateEditionWrapImpl.this.removeDisplayState(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return DisplayStateEditionWrapImpl.this.sizeOfDisplayStateArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DisplayStateList();
            }
        }
        
        /**
         * Gets array of all "displayState" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.DisplayStateDocument.DisplayState[] getDisplayStateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.DisplayStateDocument.DisplayState> targetList = new java.util.ArrayList<de.zib.museum.museumdat.DisplayStateDocument.DisplayState>();
                get_store().find_all_element_users(DISPLAYSTATE$0, targetList);
                de.zib.museum.museumdat.DisplayStateDocument.DisplayState[] result = new de.zib.museum.museumdat.DisplayStateDocument.DisplayState[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "displayState" element
         */
        public de.zib.museum.museumdat.DisplayStateDocument.DisplayState getDisplayStateArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayStateDocument.DisplayState target = null;
                target = (de.zib.museum.museumdat.DisplayStateDocument.DisplayState)get_store().find_element_user(DISPLAYSTATE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "displayState" element
         */
        public int sizeOfDisplayStateArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPLAYSTATE$0);
            }
        }
        
        /**
         * Sets array of all "displayState" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setDisplayStateArray(de.zib.museum.museumdat.DisplayStateDocument.DisplayState[] displayStateArray)
        {
            check_orphaned();
            arraySetterHelper(displayStateArray, DISPLAYSTATE$0);
        }
        
        /**
         * Sets ith "displayState" element
         */
        @Inject(optional=true) public void setDisplayStateArray(int i, de.zib.museum.museumdat.DisplayStateDocument.DisplayState displayState)
        {
            generatedSetterHelperImpl(displayState, DISPLAYSTATE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "displayState" element
         */
        public de.zib.museum.museumdat.DisplayStateDocument.DisplayState insertNewDisplayState(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayStateDocument.DisplayState target = null;
                target = (de.zib.museum.museumdat.DisplayStateDocument.DisplayState)get_store().insert_element_user(DISPLAYSTATE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "displayState" element
         */
        public de.zib.museum.museumdat.DisplayStateDocument.DisplayState addNewDisplayState()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayStateDocument.DisplayState target = null;
                target = (de.zib.museum.museumdat.DisplayStateDocument.DisplayState)get_store().add_element_user(DISPLAYSTATE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "displayState" element
         */
        public void removeDisplayState(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPLAYSTATE$0, i);
            }
        }
        
        /**
         * Gets a List of "displayEdition" elements
         */
        public java.util.List<de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition> getDisplayEditionList()
        {
            final class DisplayEditionList extends java.util.AbstractList<de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition>
            {
                @Override
                public de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition get(int i)
                    { return DisplayStateEditionWrapImpl.this.getDisplayEditionArray(i); }
                
                @Override
                public de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition set(int i, de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition o)
                {
                    de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition old = DisplayStateEditionWrapImpl.this.getDisplayEditionArray(i);
                    DisplayStateEditionWrapImpl.this.setDisplayEditionArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition o)
                    { DisplayStateEditionWrapImpl.this.insertNewDisplayEdition(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition remove(int i)
                {
                    de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition old = DisplayStateEditionWrapImpl.this.getDisplayEditionArray(i);
                    DisplayStateEditionWrapImpl.this.removeDisplayEdition(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return DisplayStateEditionWrapImpl.this.sizeOfDisplayEditionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new DisplayEditionList();
            }
        }
        
        /**
         * Gets array of all "displayEdition" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition[] getDisplayEditionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition> targetList = new java.util.ArrayList<de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition>();
                get_store().find_all_element_users(DISPLAYEDITION$2, targetList);
                de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition[] result = new de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "displayEdition" element
         */
        public de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition getDisplayEditionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition target = null;
                target = (de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition)get_store().find_element_user(DISPLAYEDITION$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "displayEdition" element
         */
        public int sizeOfDisplayEditionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPLAYEDITION$2);
            }
        }
        
        /**
         * Sets array of all "displayEdition" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setDisplayEditionArray(de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition[] displayEditionArray)
        {
            check_orphaned();
            arraySetterHelper(displayEditionArray, DISPLAYEDITION$2);
        }
        
        /**
         * Sets ith "displayEdition" element
         */
        @Inject(optional=true) public void setDisplayEditionArray(int i, de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition displayEdition)
        {
            generatedSetterHelperImpl(displayEdition, DISPLAYEDITION$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "displayEdition" element
         */
        public de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition insertNewDisplayEdition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition target = null;
                target = (de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition)get_store().insert_element_user(DISPLAYEDITION$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "displayEdition" element
         */
        public de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition addNewDisplayEdition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition target = null;
                target = (de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition)get_store().add_element_user(DISPLAYEDITION$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "displayEdition" element
         */
        public void removeDisplayEdition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPLAYEDITION$2, i);
            }
        }
        
        /**
         * Gets a List of "sourceStateEdition" elements
         */
        public java.util.List<de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition> getSourceStateEditionList()
        {
            final class SourceStateEditionList extends java.util.AbstractList<de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition>
            {
                @Override
                public de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition get(int i)
                    { return DisplayStateEditionWrapImpl.this.getSourceStateEditionArray(i); }
                
                @Override
                public de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition set(int i, de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition o)
                {
                    de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition old = DisplayStateEditionWrapImpl.this.getSourceStateEditionArray(i);
                    DisplayStateEditionWrapImpl.this.setSourceStateEditionArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition o)
                    { DisplayStateEditionWrapImpl.this.insertNewSourceStateEdition(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition remove(int i)
                {
                    de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition old = DisplayStateEditionWrapImpl.this.getSourceStateEditionArray(i);
                    DisplayStateEditionWrapImpl.this.removeSourceStateEdition(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return DisplayStateEditionWrapImpl.this.sizeOfSourceStateEditionArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SourceStateEditionList();
            }
        }
        
        /**
         * Gets array of all "sourceStateEdition" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition[] getSourceStateEditionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition> targetList = new java.util.ArrayList<de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition>();
                get_store().find_all_element_users(SOURCESTATEEDITION$4, targetList);
                de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition[] result = new de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "sourceStateEdition" element
         */
        public de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition getSourceStateEditionArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition target = null;
                target = (de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition)get_store().find_element_user(SOURCESTATEEDITION$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "sourceStateEdition" element
         */
        public int sizeOfSourceStateEditionArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOURCESTATEEDITION$4);
            }
        }
        
        /**
         * Sets array of all "sourceStateEdition" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setSourceStateEditionArray(de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition[] sourceStateEditionArray)
        {
            check_orphaned();
            arraySetterHelper(sourceStateEditionArray, SOURCESTATEEDITION$4);
        }
        
        /**
         * Sets ith "sourceStateEdition" element
         */
        @Inject(optional=true) public void setSourceStateEditionArray(int i, de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition sourceStateEdition)
        {
            generatedSetterHelperImpl(sourceStateEdition, SOURCESTATEEDITION$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "sourceStateEdition" element
         */
        public de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition insertNewSourceStateEdition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition target = null;
                target = (de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition)get_store().insert_element_user(SOURCESTATEEDITION$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "sourceStateEdition" element
         */
        public de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition addNewSourceStateEdition()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition target = null;
                target = (de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition)get_store().add_element_user(SOURCESTATEEDITION$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "sourceStateEdition" element
         */
        public void removeSourceStateEdition(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOURCESTATEEDITION$4, i);
            }
        }
    }
}
