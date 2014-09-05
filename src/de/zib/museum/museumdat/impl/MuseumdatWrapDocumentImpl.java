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
import org.moosbusch.museum.inject.annotation.Language;
import org.moosbusch.museum.inject.annotation.LanguageEncoding;
import org.moosbusch.museum.inject.annotation.RelatedEncoding;
/**
 * A document containing one museumdatWrap(@http://museum.zib.de/museumdat) element.
 *
 * This is a complex type.
 */
public class MuseumdatWrapDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.MuseumdatWrapDocument
{
    private static final long serialVersionUID = 1L;

    public MuseumdatWrapDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }

    private static final javax.xml.namespace.QName MUSEUMDATWRAP$0 =
        new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "museumdatWrap");


    /**
     * Gets the "museumdatWrap" element
     */
    public de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap getMuseumdatWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap target = null;
            target = (de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap)get_store().find_element_user(MUSEUMDATWRAP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }

    /**
     * Sets the "museumdatWrap" element
     */
    @Inject(optional=true) public void setMuseumdatWrap(de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap museumdatWrap)
    {
        generatedSetterHelperImpl(museumdatWrap, MUSEUMDATWRAP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }

    /**
     * Appends and returns a new empty "museumdatWrap" element
     */
    public de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap addNewMuseumdatWrap()
    {
        synchronized (monitor())
        {
            check_orphaned();
            de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap target = null;
            target = (de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap)get_store().add_element_user(MUSEUMDATWRAP$0);
            return target;
        }
    }
    /**
     * An XML museumdatWrap(@http://museum.zib.de/museumdat).
     *
     * This is a complex type.
     */
    public static class MuseumdatWrapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap
    {
        private static final long serialVersionUID = 1L;

        public MuseumdatWrapImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }

        private static final javax.xml.namespace.QName MUSEUMDAT$0 =
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "museumdat");
        private static final javax.xml.namespace.QName RELATEDENCODING$2 =
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "relatedencoding");
        private static final javax.xml.namespace.QName LANGENCODING$4 =
            new javax.xml.namespace.QName("http://museum.zib.de/museumdat", "langencoding");
        private static final javax.xml.namespace.QName LANG$6 =
            new javax.xml.namespace.QName("http://www.w3.org/XML/1998/namespace", "lang");


        /**
         * Gets a List of "museumdat" elements
         */
        public java.util.List<de.zib.museum.museumdat.MuseumdatDocument.Museumdat> getMuseumdatList()
        {
            final class MuseumdatList extends java.util.AbstractList<de.zib.museum.museumdat.MuseumdatDocument.Museumdat>
            {
                @Override
                public de.zib.museum.museumdat.MuseumdatDocument.Museumdat get(int i)
                    { return MuseumdatWrapImpl.this.getMuseumdatArray(i); }

                @Override
                public de.zib.museum.museumdat.MuseumdatDocument.Museumdat set(int i, de.zib.museum.museumdat.MuseumdatDocument.Museumdat o)
                {
                    de.zib.museum.museumdat.MuseumdatDocument.Museumdat old = MuseumdatWrapImpl.this.getMuseumdatArray(i);
                    MuseumdatWrapImpl.this.setMuseumdatArray(i, o);
                    return old;
                }

                @Override
                public void add(int i, de.zib.museum.museumdat.MuseumdatDocument.Museumdat o)
                    { MuseumdatWrapImpl.this.insertNewMuseumdat(i).set(o); }

                @Override
                public de.zib.museum.museumdat.MuseumdatDocument.Museumdat remove(int i)
                {
                    de.zib.museum.museumdat.MuseumdatDocument.Museumdat old = MuseumdatWrapImpl.this.getMuseumdatArray(i);
                    MuseumdatWrapImpl.this.removeMuseumdat(i);
                    return old;
                }

                @Override
                public int size()
                    { return MuseumdatWrapImpl.this.sizeOfMuseumdatArray(); }

            }

            synchronized (monitor())
            {
                check_orphaned();
                return new MuseumdatList();
            }
        }

        /**
         * Gets array of all "museumdat" elements
         * @deprecated
         */
        @Deprecated
        public de.zib.museum.museumdat.MuseumdatDocument.Museumdat[] getMuseumdatArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<de.zib.museum.museumdat.MuseumdatDocument.Museumdat> targetList = new java.util.ArrayList<de.zib.museum.museumdat.MuseumdatDocument.Museumdat>();
                get_store().find_all_element_users(MUSEUMDAT$0, targetList);
                de.zib.museum.museumdat.MuseumdatDocument.Museumdat[] result = new de.zib.museum.museumdat.MuseumdatDocument.Museumdat[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }

        /**
         * Gets ith "museumdat" element
         */
        public de.zib.museum.museumdat.MuseumdatDocument.Museumdat getMuseumdatArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.MuseumdatDocument.Museumdat target = null;
                target = (de.zib.museum.museumdat.MuseumdatDocument.Museumdat)get_store().find_element_user(MUSEUMDAT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }

        /**
         * Returns number of "museumdat" element
         */
        public int sizeOfMuseumdatArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(MUSEUMDAT$0);
            }
        }

        /**
         * Sets array of all "museumdat" element  WARNING: This method is not atomicaly synchronized.
         */
        @Inject(optional=true) public void setMuseumdatArray(de.zib.museum.museumdat.MuseumdatDocument.Museumdat[] museumdatArray)
        {
            check_orphaned();
            arraySetterHelper(museumdatArray, MUSEUMDAT$0);
        }

        /**
         * Sets ith "museumdat" element
         */
        @Inject(optional=true) public void setMuseumdatArray(int i, de.zib.museum.museumdat.MuseumdatDocument.Museumdat museumdat)
        {
            generatedSetterHelperImpl(museumdat, MUSEUMDAT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }

        /**
         * Inserts and returns a new empty value (as xml) as the ith "museumdat" element
         */
        public de.zib.museum.museumdat.MuseumdatDocument.Museumdat insertNewMuseumdat(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.MuseumdatDocument.Museumdat target = null;
                target = (de.zib.museum.museumdat.MuseumdatDocument.Museumdat)get_store().insert_element_user(MUSEUMDAT$0, i);
                return target;
            }
        }

        /**
         * Appends and returns a new empty value (as xml) as the last "museumdat" element
         */
        public de.zib.museum.museumdat.MuseumdatDocument.Museumdat addNewMuseumdat()
        {
            synchronized (monitor())
            {
                check_orphaned();
                de.zib.museum.museumdat.MuseumdatDocument.Museumdat target = null;
                target = (de.zib.museum.museumdat.MuseumdatDocument.Museumdat)get_store().add_element_user(MUSEUMDAT$0);
                return target;
            }
        }

        /**
         * Removes the ith "museumdat" element
         */
        public void removeMuseumdat(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(MUSEUMDAT$0, i);
            }
        }

        /**
         * Gets the "relatedencoding" attribute
         */
        public java.lang.String getRelatedencoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATEDENCODING$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "relatedencoding" attribute
         */
        public org.apache.xmlbeans.XmlString xgetRelatedencoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELATEDENCODING$2);
                return target;
            }
        }

        /**
         * True if has "relatedencoding" attribute
         */
        public boolean isSetRelatedencoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RELATEDENCODING$2) != null;
            }
        }

        /**
         * Sets the "relatedencoding" attribute
         */
        @Inject(optional=true) public void setRelatedencoding(@RelatedEncoding java.lang.String relatedencoding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELATEDENCODING$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELATEDENCODING$2);
                }
                target.setStringValue(relatedencoding);
            }
        }

        /**
         * Sets (as xml) the "relatedencoding" attribute
         */
        public void xsetRelatedencoding(org.apache.xmlbeans.XmlString relatedencoding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(RELATEDENCODING$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(RELATEDENCODING$2);
                }
                target.set(relatedencoding);
            }
        }

        /**
         * Unsets the "relatedencoding" attribute
         */
        public void unsetRelatedencoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RELATEDENCODING$2);
            }
        }

        /**
         * Gets the "langencoding" attribute
         */
        public java.lang.String getLangencoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGENCODING$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "langencoding" attribute
         */
        public org.apache.xmlbeans.XmlString xgetLangencoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANGENCODING$4);
                return target;
            }
        }

        /**
         * True if has "langencoding" attribute
         */
        public boolean isSetLangencoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANGENCODING$4) != null;
            }
        }

        /**
         * Sets the "langencoding" attribute
         */
        @Inject(optional=true) public void setLangencoding(@LanguageEncoding java.lang.String langencoding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGENCODING$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGENCODING$4);
                }
                target.setStringValue(langencoding);
            }
        }

        /**
         * Sets (as xml) the "langencoding" attribute
         */
        public void xsetLangencoding(org.apache.xmlbeans.XmlString langencoding)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(LANGENCODING$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(LANGENCODING$4);
                }
                target.set(langencoding);
            }
        }

        /**
         * Unsets the "langencoding" attribute
         */
        public void unsetLangencoding()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANGENCODING$4);
            }
        }

        /**
         * Gets the "lang" attribute
         */
        public java.lang.String getLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$6);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }

        /**
         * Gets (as xml) the "lang" attribute
         */
        public org.apache.xmlbeans.XmlLanguage xgetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$6);
                return target;
            }
        }

        /**
         * True if has "lang" attribute
         */
        public boolean isSetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(LANG$6) != null;
            }
        }

        /**
         * Sets the "lang" attribute
         */
        @Inject(optional=true) public void setLang(@Language java.lang.String lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANG$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANG$6);
                }
                target.setStringValue(lang);
            }
        }

        /**
         * Sets (as xml) the "lang" attribute
         */
        public void xsetLang(org.apache.xmlbeans.XmlLanguage lang)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlLanguage target = null;
                target = (org.apache.xmlbeans.XmlLanguage)get_store().find_attribute_user(LANG$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlLanguage)get_store().add_attribute_user(LANG$6);
                }
                target.set(lang);
            }
        }

        /**
         * Unsets the "lang" attribute
         */
        public void unsetLang()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(LANG$6);
            }
        }
    }
}
