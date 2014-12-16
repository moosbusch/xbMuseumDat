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
 * A document containing one indexingActorSet(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class IndexingActorSetDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingActorSetDocument
{
    private static final long serialVersionUID = 1L;
    
    public IndexingActorSetDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDEXINGACTORSET$0 = 
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "indexingActorSet");
    
    
    /**
     * Gets the "indexingActorSet" element
     */
    public de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet getIndexingActorSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet target = null;
            target = (de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet)get_store().find_element_user(INDEXINGACTORSET$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "indexingActorSet" element
     */
    public void setIndexingActorSet(de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet indexingActorSet)
    {
        generatedSetterHelperImpl(indexingActorSet, INDEXINGACTORSET$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "indexingActorSet" element
     */
    public de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet addNewIndexingActorSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet target = null;
            target = (de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet)get_store().add_element_user(INDEXINGACTORSET$0);
            return target;
        }
    }
    /**
     * An XML indexingActorSet(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class IndexingActorSetImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet
    {
        private static final long serialVersionUID = 1L;
        
        public IndexingActorSetImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAMEACTORSET$0 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "nameActorSet");
        private static final javax.xml.namespace.QName NATIONALITYACTOR$2 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "nationalityActor");
        private static final javax.xml.namespace.QName VITALDATESACTOR$4 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "vitalDatesActor");
        private static final javax.xml.namespace.QName GENDERACTOR$6 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "genderActor");
        private static final javax.xml.namespace.QName ROLEACTOR$8 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "roleActor");
        private static final javax.xml.namespace.QName ATTRIBUTIONQUALIFIERACTOR$10 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "attributionQualifierActor");
        private static final javax.xml.namespace.QName EXTENTACTOR$12 = 
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "extentActor");
        
        
        /**
         * Gets a List of "nameActorSet" elements
         */
        public java.util.List<de.zib.museum.museumdat.NameActorSetDocument.NameActorSet> getNameActorSetList()
        {
            final class NameActorSetList extends java.util.AbstractList<de.zib.museum.museumdat.NameActorSetDocument.NameActorSet>
            {
                @Override
                public de.zib.museum.museumdat.NameActorSetDocument.NameActorSet get(int i)
                    { return IndexingActorSetImpl.this.getNameActorSetArray(i); }
                
                @Override
                public de.zib.museum.museumdat.NameActorSetDocument.NameActorSet set(int i, de.zib.museum.museumdat.NameActorSetDocument.NameActorSet o)
                {
                    de.zib.museum.museumdat.NameActorSetDocument.NameActorSet old = IndexingActorSetImpl.this.getNameActorSetArray(i);
                    IndexingActorSetImpl.this.setNameActorSetArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.NameActorSetDocument.NameActorSet o)
                    { IndexingActorSetImpl.this.insertNewNameActorSet(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.NameActorSetDocument.NameActorSet remove(int i)
                {
                    de.zib.museum.museumdat.NameActorSetDocument.NameActorSet old = IndexingActorSetImpl.this.getNameActorSetArray(i);
                    IndexingActorSetImpl.this.removeNameActorSet(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingActorSetImpl.this.sizeOfNameActorSetArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new NameActorSetList();
            }
        }
        
        /**
         * Gets array of all "nameActorSet" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.NameActorSetDocument.NameActorSet[] getNameActorSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.NameActorSetDocument.NameActorSet> targetList = new java.util.ArrayList<de.zib.museum.museumdat.NameActorSetDocument.NameActorSet>();
                get_store().find_all_element_users(NAMEACTORSET$0, targetList);
                de.zib.museum.museumdat.NameActorSetDocument.NameActorSet[] result = new de.zib.museum.museumdat.NameActorSetDocument.NameActorSet[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "nameActorSet" element
         */
        public de.zib.museum.museumdat.NameActorSetDocument.NameActorSet getNameActorSetArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.NameActorSetDocument.NameActorSet target = null;
                target = (de.zib.museum.museumdat.NameActorSetDocument.NameActorSet)get_store().find_element_user(NAMEACTORSET$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "nameActorSet" element
         */
        public int sizeOfNameActorSetArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NAMEACTORSET$0);
            }
        }
        
        /**
         * Sets array of all "nameActorSet" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setNameActorSetArray(de.zib.museum.museumdat.NameActorSetDocument.NameActorSet[] nameActorSetArray)
        {
            check_orphaned();
            arraySetterHelper(nameActorSetArray, NAMEACTORSET$0);
        }
        
        /**
         * Sets ith "nameActorSet" element
         */
        public void setNameActorSetArray(int i, de.zib.museum.museumdat.NameActorSetDocument.NameActorSet nameActorSet)
        {
            generatedSetterHelperImpl(nameActorSet, NAMEACTORSET$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "nameActorSet" element
         */
        public de.zib.museum.museumdat.NameActorSetDocument.NameActorSet insertNewNameActorSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.NameActorSetDocument.NameActorSet target = null;
                target = (de.zib.museum.museumdat.NameActorSetDocument.NameActorSet)get_store().insert_element_user(NAMEACTORSET$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "nameActorSet" element
         */
        public de.zib.museum.museumdat.NameActorSetDocument.NameActorSet addNewNameActorSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.NameActorSetDocument.NameActorSet target = null;
                target = (de.zib.museum.museumdat.NameActorSetDocument.NameActorSet)get_store().add_element_user(NAMEACTORSET$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "nameActorSet" element
         */
        public void removeNameActorSet(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NAMEACTORSET$0, i);
            }
        }
        
        /**
         * Gets a List of "nationalityActor" elements
         */
        public java.util.List<de.zib.museum.museumdat.NationalityActorDocument.NationalityActor> getNationalityActorList()
        {
            final class NationalityActorList extends java.util.AbstractList<de.zib.museum.museumdat.NationalityActorDocument.NationalityActor>
            {
                @Override
                public de.zib.museum.museumdat.NationalityActorDocument.NationalityActor get(int i)
                    { return IndexingActorSetImpl.this.getNationalityActorArray(i); }
                
                @Override
                public de.zib.museum.museumdat.NationalityActorDocument.NationalityActor set(int i, de.zib.museum.museumdat.NationalityActorDocument.NationalityActor o)
                {
                    de.zib.museum.museumdat.NationalityActorDocument.NationalityActor old = IndexingActorSetImpl.this.getNationalityActorArray(i);
                    IndexingActorSetImpl.this.setNationalityActorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.NationalityActorDocument.NationalityActor o)
                    { IndexingActorSetImpl.this.insertNewNationalityActor(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.NationalityActorDocument.NationalityActor remove(int i)
                {
                    de.zib.museum.museumdat.NationalityActorDocument.NationalityActor old = IndexingActorSetImpl.this.getNationalityActorArray(i);
                    IndexingActorSetImpl.this.removeNationalityActor(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingActorSetImpl.this.sizeOfNationalityActorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new NationalityActorList();
            }
        }
        
        /**
         * Gets array of all "nationalityActor" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.NationalityActorDocument.NationalityActor[] getNationalityActorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.NationalityActorDocument.NationalityActor> targetList = new java.util.ArrayList<de.zib.museum.museumdat.NationalityActorDocument.NationalityActor>();
                get_store().find_all_element_users(NATIONALITYACTOR$2, targetList);
                de.zib.museum.museumdat.NationalityActorDocument.NationalityActor[] result = new de.zib.museum.museumdat.NationalityActorDocument.NationalityActor[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "nationalityActor" element
         */
        public de.zib.museum.museumdat.NationalityActorDocument.NationalityActor getNationalityActorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.NationalityActorDocument.NationalityActor target = null;
                target = (de.zib.museum.museumdat.NationalityActorDocument.NationalityActor)get_store().find_element_user(NATIONALITYACTOR$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "nationalityActor" element
         */
        public int sizeOfNationalityActorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(NATIONALITYACTOR$2);
            }
        }
        
        /**
         * Sets array of all "nationalityActor" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setNationalityActorArray(de.zib.museum.museumdat.NationalityActorDocument.NationalityActor[] nationalityActorArray)
        {
            check_orphaned();
            arraySetterHelper(nationalityActorArray, NATIONALITYACTOR$2);
        }
        
        /**
         * Sets ith "nationalityActor" element
         */
        public void setNationalityActorArray(int i, de.zib.museum.museumdat.NationalityActorDocument.NationalityActor nationalityActor)
        {
            generatedSetterHelperImpl(nationalityActor, NATIONALITYACTOR$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "nationalityActor" element
         */
        public de.zib.museum.museumdat.NationalityActorDocument.NationalityActor insertNewNationalityActor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.NationalityActorDocument.NationalityActor target = null;
                target = (de.zib.museum.museumdat.NationalityActorDocument.NationalityActor)get_store().insert_element_user(NATIONALITYACTOR$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "nationalityActor" element
         */
        public de.zib.museum.museumdat.NationalityActorDocument.NationalityActor addNewNationalityActor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.NationalityActorDocument.NationalityActor target = null;
                target = (de.zib.museum.museumdat.NationalityActorDocument.NationalityActor)get_store().add_element_user(NATIONALITYACTOR$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "nationalityActor" element
         */
        public void removeNationalityActor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(NATIONALITYACTOR$2, i);
            }
        }
        
        /**
         * Gets a List of "vitalDatesActor" elements
         */
        public java.util.List<de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor> getVitalDatesActorList()
        {
            final class VitalDatesActorList extends java.util.AbstractList<de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor>
            {
                @Override
                public de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor get(int i)
                    { return IndexingActorSetImpl.this.getVitalDatesActorArray(i); }
                
                @Override
                public de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor set(int i, de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor o)
                {
                    de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor old = IndexingActorSetImpl.this.getVitalDatesActorArray(i);
                    IndexingActorSetImpl.this.setVitalDatesActorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor o)
                    { IndexingActorSetImpl.this.insertNewVitalDatesActor(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor remove(int i)
                {
                    de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor old = IndexingActorSetImpl.this.getVitalDatesActorArray(i);
                    IndexingActorSetImpl.this.removeVitalDatesActor(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingActorSetImpl.this.sizeOfVitalDatesActorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new VitalDatesActorList();
            }
        }
        
        /**
         * Gets array of all "vitalDatesActor" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor[] getVitalDatesActorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor> targetList = new java.util.ArrayList<de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor>();
                get_store().find_all_element_users(VITALDATESACTOR$4, targetList);
                de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor[] result = new de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "vitalDatesActor" element
         */
        public de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor getVitalDatesActorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor target = null;
                target = (de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor)get_store().find_element_user(VITALDATESACTOR$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "vitalDatesActor" element
         */
        public int sizeOfVitalDatesActorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(VITALDATESACTOR$4);
            }
        }
        
        /**
         * Sets array of all "vitalDatesActor" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setVitalDatesActorArray(de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor[] vitalDatesActorArray)
        {
            check_orphaned();
            arraySetterHelper(vitalDatesActorArray, VITALDATESACTOR$4);
        }
        
        /**
         * Sets ith "vitalDatesActor" element
         */
        public void setVitalDatesActorArray(int i, de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor vitalDatesActor)
        {
            generatedSetterHelperImpl(vitalDatesActor, VITALDATESACTOR$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "vitalDatesActor" element
         */
        public de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor insertNewVitalDatesActor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor target = null;
                target = (de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor)get_store().insert_element_user(VITALDATESACTOR$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "vitalDatesActor" element
         */
        public de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor addNewVitalDatesActor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor target = null;
                target = (de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor)get_store().add_element_user(VITALDATESACTOR$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "vitalDatesActor" element
         */
        public void removeVitalDatesActor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(VITALDATESACTOR$4, i);
            }
        }
        
        /**
         * Gets the "genderActor" element
         */
        public de.zib.museum.museumdat.GenderActorDocument.GenderActor getGenderActor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.GenderActorDocument.GenderActor target = null;
                target = (de.zib.museum.museumdat.GenderActorDocument.GenderActor)get_store().find_element_user(GENDERACTOR$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "genderActor" element
         */
        public boolean isSetGenderActor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(GENDERACTOR$6) != 0;
            }
        }
        
        /**
         * Sets the "genderActor" element
         */
        public void setGenderActor(de.zib.museum.museumdat.GenderActorDocument.GenderActor genderActor)
        {
            generatedSetterHelperImpl(genderActor, GENDERACTOR$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "genderActor" element
         */
        public de.zib.museum.museumdat.GenderActorDocument.GenderActor addNewGenderActor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.GenderActorDocument.GenderActor target = null;
                target = (de.zib.museum.museumdat.GenderActorDocument.GenderActor)get_store().add_element_user(GENDERACTOR$6);
                return target;
            }
        }
        
        /**
         * Unsets the "genderActor" element
         */
        public void unsetGenderActor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(GENDERACTOR$6, 0);
            }
        }
        
        /**
         * Gets a List of "roleActor" elements
         */
        public java.util.List<de.zib.museum.museumdat.RoleActorDocument.RoleActor> getRoleActorList()
        {
            final class RoleActorList extends java.util.AbstractList<de.zib.museum.museumdat.RoleActorDocument.RoleActor>
            {
                @Override
                public de.zib.museum.museumdat.RoleActorDocument.RoleActor get(int i)
                    { return IndexingActorSetImpl.this.getRoleActorArray(i); }
                
                @Override
                public de.zib.museum.museumdat.RoleActorDocument.RoleActor set(int i, de.zib.museum.museumdat.RoleActorDocument.RoleActor o)
                {
                    de.zib.museum.museumdat.RoleActorDocument.RoleActor old = IndexingActorSetImpl.this.getRoleActorArray(i);
                    IndexingActorSetImpl.this.setRoleActorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.RoleActorDocument.RoleActor o)
                    { IndexingActorSetImpl.this.insertNewRoleActor(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.RoleActorDocument.RoleActor remove(int i)
                {
                    de.zib.museum.museumdat.RoleActorDocument.RoleActor old = IndexingActorSetImpl.this.getRoleActorArray(i);
                    IndexingActorSetImpl.this.removeRoleActor(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingActorSetImpl.this.sizeOfRoleActorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RoleActorList();
            }
        }
        
        /**
         * Gets array of all "roleActor" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.RoleActorDocument.RoleActor[] getRoleActorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.RoleActorDocument.RoleActor> targetList = new java.util.ArrayList<de.zib.museum.museumdat.RoleActorDocument.RoleActor>();
                get_store().find_all_element_users(ROLEACTOR$8, targetList);
                de.zib.museum.museumdat.RoleActorDocument.RoleActor[] result = new de.zib.museum.museumdat.RoleActorDocument.RoleActor[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "roleActor" element
         */
        public de.zib.museum.museumdat.RoleActorDocument.RoleActor getRoleActorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RoleActorDocument.RoleActor target = null;
                target = (de.zib.museum.museumdat.RoleActorDocument.RoleActor)get_store().find_element_user(ROLEACTOR$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "roleActor" element
         */
        public int sizeOfRoleActorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ROLEACTOR$8);
            }
        }
        
        /**
         * Sets array of all "roleActor" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRoleActorArray(de.zib.museum.museumdat.RoleActorDocument.RoleActor[] roleActorArray)
        {
            check_orphaned();
            arraySetterHelper(roleActorArray, ROLEACTOR$8);
        }
        
        /**
         * Sets ith "roleActor" element
         */
        public void setRoleActorArray(int i, de.zib.museum.museumdat.RoleActorDocument.RoleActor roleActor)
        {
            generatedSetterHelperImpl(roleActor, ROLEACTOR$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "roleActor" element
         */
        public de.zib.museum.museumdat.RoleActorDocument.RoleActor insertNewRoleActor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RoleActorDocument.RoleActor target = null;
                target = (de.zib.museum.museumdat.RoleActorDocument.RoleActor)get_store().insert_element_user(ROLEACTOR$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "roleActor" element
         */
        public de.zib.museum.museumdat.RoleActorDocument.RoleActor addNewRoleActor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.RoleActorDocument.RoleActor target = null;
                target = (de.zib.museum.museumdat.RoleActorDocument.RoleActor)get_store().add_element_user(ROLEACTOR$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "roleActor" element
         */
        public void removeRoleActor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ROLEACTOR$8, i);
            }
        }
        
        /**
         * Gets a List of "attributionQualifierActor" elements
         */
        public java.util.List<java.lang.String> getAttributionQualifierActorList()
        {
            final class AttributionQualifierActorList extends java.util.AbstractList<java.lang.String>
            {
                @Override
                public java.lang.String get(int i)
                    { return IndexingActorSetImpl.this.getAttributionQualifierActorArray(i); }
                
                @Override
                public java.lang.String set(int i, java.lang.String o)
                {
                    java.lang.String old = IndexingActorSetImpl.this.getAttributionQualifierActorArray(i);
                    IndexingActorSetImpl.this.setAttributionQualifierActorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, java.lang.String o)
                    { IndexingActorSetImpl.this.insertAttributionQualifierActor(i, o); }
                
                @Override
                public java.lang.String remove(int i)
                {
                    java.lang.String old = IndexingActorSetImpl.this.getAttributionQualifierActorArray(i);
                    IndexingActorSetImpl.this.removeAttributionQualifierActor(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingActorSetImpl.this.sizeOfAttributionQualifierActorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AttributionQualifierActorList();
            }
        }
        
        /**
         * Gets array of all "attributionQualifierActor" elements
         * @deprecated
         */
        @Deprecated
        public java.lang.String[] getAttributionQualifierActorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(ATTRIBUTIONQUALIFIERACTOR$10, targetList);
                java.lang.String[] result = new java.lang.String[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                return result;
            }
        }
        
        /**
         * Gets ith "attributionQualifierActor" element
         */
        public java.lang.String getAttributionQualifierActorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTIONQUALIFIERACTOR$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "attributionQualifierActor" elements
         */
        public java.util.List<org.apache.xmlbeans.XmlString> xgetAttributionQualifierActorList()
        {
            final class AttributionQualifierActorList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
            {
                @Override
                public org.apache.xmlbeans.XmlString get(int i)
                    { return IndexingActorSetImpl.this.xgetAttributionQualifierActorArray(i); }
                
                @Override
                public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
                {
                    org.apache.xmlbeans.XmlString old = IndexingActorSetImpl.this.xgetAttributionQualifierActorArray(i);
                    IndexingActorSetImpl.this.xsetAttributionQualifierActorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.apache.xmlbeans.XmlString o)
                    { IndexingActorSetImpl.this.insertNewAttributionQualifierActor(i).set(o); }
                
                @Override
                public org.apache.xmlbeans.XmlString remove(int i)
                {
                    org.apache.xmlbeans.XmlString old = IndexingActorSetImpl.this.xgetAttributionQualifierActorArray(i);
                    IndexingActorSetImpl.this.removeAttributionQualifierActor(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingActorSetImpl.this.sizeOfAttributionQualifierActorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AttributionQualifierActorList();
            }
        }
        
        /**
         * Gets array of all "attributionQualifierActor" elements
         * @deprecated
         */
        @Deprecated
        public org.apache.xmlbeans.XmlString[] xgetAttributionQualifierActorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
                get_store().find_all_element_users(ATTRIBUTIONQUALIFIERACTOR$10, targetList);
                org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "attributionQualifierActor" element
         */
        public org.apache.xmlbeans.XmlString xgetAttributionQualifierActorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTIONQUALIFIERACTOR$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "attributionQualifierActor" element
         */
        public int sizeOfAttributionQualifierActorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ATTRIBUTIONQUALIFIERACTOR$10);
            }
        }
        
        /**
         * Sets array of all "attributionQualifierActor" element
         */
        public void setAttributionQualifierActorArray(java.lang.String[] attributionQualifierActorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(attributionQualifierActorArray, ATTRIBUTIONQUALIFIERACTOR$10);
            }
        }
        
        /**
         * Sets ith "attributionQualifierActor" element
         */
        public void setAttributionQualifierActorArray(int i, java.lang.String attributionQualifierActor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTIONQUALIFIERACTOR$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setStringValue(attributionQualifierActor);
            }
        }
        
        /**
         * Sets (as xml) array of all "attributionQualifierActor" element
         */
        public void xsetAttributionQualifierActorArray(org.apache.xmlbeans.XmlString[]attributionQualifierActorArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(attributionQualifierActorArray, ATTRIBUTIONQUALIFIERACTOR$10);
            }
        }
        
        /**
         * Sets (as xml) ith "attributionQualifierActor" element
         */
        public void xsetAttributionQualifierActorArray(int i, org.apache.xmlbeans.XmlString attributionQualifierActor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ATTRIBUTIONQUALIFIERACTOR$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(attributionQualifierActor);
            }
        }
        
        /**
         * Inserts the value as the ith "attributionQualifierActor" element
         */
        public void insertAttributionQualifierActor(int i, java.lang.String attributionQualifierActor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ATTRIBUTIONQUALIFIERACTOR$10, i);
                target.setStringValue(attributionQualifierActor);
            }
        }
        
        /**
         * Appends the value as the last "attributionQualifierActor" element
         */
        public void addAttributionQualifierActor(java.lang.String attributionQualifierActor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTIONQUALIFIERACTOR$10);
                target.setStringValue(attributionQualifierActor);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "attributionQualifierActor" element
         */
        public org.apache.xmlbeans.XmlString insertNewAttributionQualifierActor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ATTRIBUTIONQUALIFIERACTOR$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "attributionQualifierActor" element
         */
        public org.apache.xmlbeans.XmlString addNewAttributionQualifierActor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ATTRIBUTIONQUALIFIERACTOR$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "attributionQualifierActor" element
         */
        public void removeAttributionQualifierActor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ATTRIBUTIONQUALIFIERACTOR$10, i);
            }
        }
        
        /**
         * Gets a List of "extentActor" elements
         */
        public java.util.List<de.zib.museum.museumdat.ExtentActorDocument.ExtentActor> getExtentActorList()
        {
            final class ExtentActorList extends java.util.AbstractList<de.zib.museum.museumdat.ExtentActorDocument.ExtentActor>
            {
                @Override
                public de.zib.museum.museumdat.ExtentActorDocument.ExtentActor get(int i)
                    { return IndexingActorSetImpl.this.getExtentActorArray(i); }
                
                @Override
                public de.zib.museum.museumdat.ExtentActorDocument.ExtentActor set(int i, de.zib.museum.museumdat.ExtentActorDocument.ExtentActor o)
                {
                    de.zib.museum.museumdat.ExtentActorDocument.ExtentActor old = IndexingActorSetImpl.this.getExtentActorArray(i);
                    IndexingActorSetImpl.this.setExtentActorArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, de.zib.museum.museumdat.ExtentActorDocument.ExtentActor o)
                    { IndexingActorSetImpl.this.insertNewExtentActor(i).set(o); }
                
                @Override
                public de.zib.museum.museumdat.ExtentActorDocument.ExtentActor remove(int i)
                {
                    de.zib.museum.museumdat.ExtentActorDocument.ExtentActor old = IndexingActorSetImpl.this.getExtentActorArray(i);
                    IndexingActorSetImpl.this.removeExtentActor(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return IndexingActorSetImpl.this.sizeOfExtentActorArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ExtentActorList();
            }
        }
        
        /**
         * Gets array of all "extentActor" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.ExtentActorDocument.ExtentActor[] getExtentActorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.ExtentActorDocument.ExtentActor> targetList = new java.util.ArrayList<de.zib.museum.museumdat.ExtentActorDocument.ExtentActor>();
                get_store().find_all_element_users(EXTENTACTOR$12, targetList);
                de.zib.museum.museumdat.ExtentActorDocument.ExtentActor[] result = new de.zib.museum.museumdat.ExtentActorDocument.ExtentActor[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "extentActor" element
         */
        public de.zib.museum.museumdat.ExtentActorDocument.ExtentActor getExtentActorArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ExtentActorDocument.ExtentActor target = null;
                target = (de.zib.museum.museumdat.ExtentActorDocument.ExtentActor)get_store().find_element_user(EXTENTACTOR$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "extentActor" element
         */
        public int sizeOfExtentActorArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(EXTENTACTOR$12);
            }
        }
        
        /**
         * Sets array of all "extentActor" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setExtentActorArray(de.zib.museum.museumdat.ExtentActorDocument.ExtentActor[] extentActorArray)
        {
            check_orphaned();
            arraySetterHelper(extentActorArray, EXTENTACTOR$12);
        }
        
        /**
         * Sets ith "extentActor" element
         */
        public void setExtentActorArray(int i, de.zib.museum.museumdat.ExtentActorDocument.ExtentActor extentActor)
        {
            generatedSetterHelperImpl(extentActor, EXTENTACTOR$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "extentActor" element
         */
        public de.zib.museum.museumdat.ExtentActorDocument.ExtentActor insertNewExtentActor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ExtentActorDocument.ExtentActor target = null;
                target = (de.zib.museum.museumdat.ExtentActorDocument.ExtentActor)get_store().insert_element_user(EXTENTACTOR$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "extentActor" element
         */
        public de.zib.museum.museumdat.ExtentActorDocument.ExtentActor addNewExtentActor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.ExtentActorDocument.ExtentActor target = null;
                target = (de.zib.museum.museumdat.ExtentActorDocument.ExtentActor)get_store().add_element_user(EXTENTACTOR$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "extentActor" element
         */
        public void removeExtentActor(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(EXTENTACTOR$12, i);
            }
        }
    }
}
