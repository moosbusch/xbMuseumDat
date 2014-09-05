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
package org.moosbusch.museum.inject.museumdat.impl;

import com.google.inject.Provides;
import de.zib.museum.museumdat.AdministrativeMetadataDocument;
import de.zib.museum.museumdat.AdministrativeMetadataDocument.AdministrativeMetadata;
import de.zib.museum.museumdat.ClassificationDocument;
import de.zib.museum.museumdat.ClassificationDocument.Classification;
import de.zib.museum.museumdat.ClassificationWrapDocument;
import de.zib.museum.museumdat.ClassificationWrapDocument.ClassificationWrap;
import de.zib.museum.museumdat.CultureDocument;
import de.zib.museum.museumdat.CultureDocument.Culture;
import de.zib.museum.museumdat.CultureWrapDocument;
import de.zib.museum.museumdat.CultureWrapDocument.CultureWrap;
import de.zib.museum.museumdat.DescriptionWrapDocument;
import de.zib.museum.museumdat.DescriptionWrapDocument.DescriptionWrap;
import de.zib.museum.museumdat.DescriptiveMetadataDocument;
import de.zib.museum.museumdat.DescriptiveMetadataDocument.DescriptiveMetadata;
import de.zib.museum.museumdat.DescriptiveNoteDocument;
import de.zib.museum.museumdat.DescriptiveNoteDocument.DescriptiveNote;
import de.zib.museum.museumdat.DescriptiveNoteSetDocument;
import de.zib.museum.museumdat.DescriptiveNoteSetDocument.DescriptiveNoteSet;
import de.zib.museum.museumdat.DescriptiveNoteWrapDocument;
import de.zib.museum.museumdat.DescriptiveNoteWrapDocument.DescriptiveNoteWrap;
import de.zib.museum.museumdat.DisplayCreationDateDocument;
import de.zib.museum.museumdat.DisplayCreationDateDocument.DisplayCreationDate;
import de.zib.museum.museumdat.DisplayCreationLocationDocument;
import de.zib.museum.museumdat.DisplayCreationLocationDocument.DisplayCreationLocation;
import de.zib.museum.museumdat.DisplayCreatorDocument;
import de.zib.museum.museumdat.DisplayCreatorDocument.DisplayCreator;
import de.zib.museum.museumdat.DisplayEditionDocument;
import de.zib.museum.museumdat.DisplayEditionDocument.DisplayEdition;
import de.zib.museum.museumdat.DisplayEventDocument;
import de.zib.museum.museumdat.DisplayEventDocument.DisplayEvent;
import de.zib.museum.museumdat.DisplayEventWrapDocument;
import de.zib.museum.museumdat.DisplayEventWrapDocument.DisplayEventWrap;
import de.zib.museum.museumdat.DisplayMaterialsTechDocument;
import de.zib.museum.museumdat.DisplayMaterialsTechDocument.DisplayMaterialsTech;
import de.zib.museum.museumdat.DisplayMeasurementsDocument;
import de.zib.museum.museumdat.DisplayMeasurementsDocument.DisplayMeasurements;
import de.zib.museum.museumdat.DisplayStateDocument;
import de.zib.museum.museumdat.DisplayStateDocument.DisplayState;
import de.zib.museum.museumdat.DisplayStateEditionWrapDocument;
import de.zib.museum.museumdat.DisplayStateEditionWrapDocument.DisplayStateEditionWrap;
import de.zib.museum.museumdat.EarliestDateDocument;
import de.zib.museum.museumdat.EarliestDateDocument.EarliestDate;
import de.zib.museum.museumdat.EncodinganalogAttribute;
import de.zib.museum.museumdat.EventTypeDocument;
import de.zib.museum.museumdat.EventTypeDocument.EventType;
import de.zib.museum.museumdat.EventWrapDocument;
import de.zib.museum.museumdat.EventWrapDocument.EventWrap;
import de.zib.museum.museumdat.ExtentActorDocument;
import de.zib.museum.museumdat.ExtentActorDocument.ExtentActor;
import de.zib.museum.museumdat.ExtentMaterialsTechDocument;
import de.zib.museum.museumdat.ExtentMaterialsTechDocument.ExtentMaterialsTech;
import de.zib.museum.museumdat.ExtentMeasurementsDocument;
import de.zib.museum.museumdat.ExtentMeasurementsDocument.ExtentMeasurements;
import de.zib.museum.museumdat.ExtentSubjectDocument;
import de.zib.museum.museumdat.ExtentSubjectDocument.ExtentSubject;
import de.zib.museum.museumdat.FormatMeasurementsDocument;
import de.zib.museum.museumdat.FormatMeasurementsDocument.FormatMeasurements;
import de.zib.museum.museumdat.GenderActorDocument;
import de.zib.museum.museumdat.GenderActorDocument.GenderActor;
import de.zib.museum.museumdat.GeographicalEntityAttribute;
import de.zib.museum.museumdat.IdentificationWrapDocument;
import de.zib.museum.museumdat.IdentificationWrapDocument.IdentificationWrap;
import de.zib.museum.museumdat.ImportedAttribute;
import de.zib.museum.museumdat.IndexingActorSetDocument;
import de.zib.museum.museumdat.IndexingActorSetDocument.IndexingActorSet;
import de.zib.museum.museumdat.IndexingDatesDocument;
import de.zib.museum.museumdat.IndexingDatesDocument.IndexingDates;
import de.zib.museum.museumdat.IndexingEventSetDocument;
import de.zib.museum.museumdat.IndexingEventSetDocument.IndexingEventSet;
import de.zib.museum.museumdat.IndexingEventWrapDocument;
import de.zib.museum.museumdat.IndexingEventWrapDocument.IndexingEventWrap;
import de.zib.museum.museumdat.IndexingLocationSetDocument;
import de.zib.museum.museumdat.IndexingLocationSetDocument.IndexingLocationSet;
import de.zib.museum.museumdat.IndexingLocationWrapDocument;
import de.zib.museum.museumdat.IndexingLocationWrapDocument.IndexingLocationWrap;
import de.zib.museum.museumdat.IndexingMaterialsTechSetDocument;
import de.zib.museum.museumdat.IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet;
import de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument;
import de.zib.museum.museumdat.IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap;
import de.zib.museum.museumdat.IndexingMeasurementsSetDocument;
import de.zib.museum.museumdat.IndexingMeasurementsSetDocument.IndexingMeasurementsSet;
import de.zib.museum.museumdat.IndexingMeasurementsWrapDocument;
import de.zib.museum.museumdat.IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap;
import de.zib.museum.museumdat.IndexingSubjectSetDocument;
import de.zib.museum.museumdat.IndexingSubjectSetDocument.IndexingSubjectSet;
import de.zib.museum.museumdat.IndexingSubjectWrapDocument;
import de.zib.museum.museumdat.IndexingSubjectWrapDocument.IndexingSubjectWrap;
import de.zib.museum.museumdat.InscriptionsDocument;
import de.zib.museum.museumdat.InscriptionsDocument.Inscriptions;
import de.zib.museum.museumdat.InscriptionsWrapDocument;
import de.zib.museum.museumdat.InscriptionsWrapDocument.InscriptionsWrap;
import de.zib.museum.museumdat.LabelAttribute;
import de.zib.museum.museumdat.LabelRelatedResourceDocument;
import de.zib.museum.museumdat.LabelRelatedResourceDocument.LabelRelatedResource;
import de.zib.museum.museumdat.LabelRelatedWorkDocument;
import de.zib.museum.museumdat.LabelRelatedWorkDocument.LabelRelatedWork;
import de.zib.museum.museumdat.LangAttribute;
import de.zib.museum.museumdat.LatestDateDocument;
import de.zib.museum.museumdat.LatestDateDocument.LatestDate;
import de.zib.museum.museumdat.LinkRelatedResourceDocument;
import de.zib.museum.museumdat.LinkRelatedResourceDocument.LinkRelatedResource;
import de.zib.museum.museumdat.LinkRelatedWorkDocument;
import de.zib.museum.museumdat.LinkRelatedWorkDocument.LinkRelatedWork;
import de.zib.museum.museumdat.LinkResourceDocument;
import de.zib.museum.museumdat.LinkResourceDocument.LinkResource;
import de.zib.museum.museumdat.LinkschemeAttribute;
import de.zib.museum.museumdat.LocIDAttribute;
import de.zib.museum.museumdat.LocIDtypeAttribute;
import de.zib.museum.museumdat.LocRelatedWorkDocument;
import de.zib.museum.museumdat.LocRelatedWorkDocument.LocRelatedWork;
import de.zib.museum.museumdat.MeasurementsSetDocument;
import de.zib.museum.museumdat.MeasurementsSetDocument.MeasurementsSet;
import de.zib.museum.museumdat.MuseumdatDocument;
import de.zib.museum.museumdat.MuseumdatDocument.Museumdat;
import de.zib.museum.museumdat.MuseumdatWrapDocument;
import de.zib.museum.museumdat.MuseumdatWrapDocument.MuseumdatWrap;
import de.zib.museum.museumdat.NameActorDocument;
import de.zib.museum.museumdat.NameActorDocument.NameActor;
import de.zib.museum.museumdat.NameActorSetDocument;
import de.zib.museum.museumdat.NameActorSetDocument.NameActorSet;
import de.zib.museum.museumdat.NameLocationDocument;
import de.zib.museum.museumdat.NameLocationDocument.NameLocation;
import de.zib.museum.museumdat.NameLocationSetDocument;
import de.zib.museum.museumdat.NameLocationSetDocument.NameLocationSet;
import de.zib.museum.museumdat.NationalityActorDocument;
import de.zib.museum.museumdat.NationalityActorDocument.NationalityActor;
import de.zib.museum.museumdat.ObjectClassificationWrapDocument;
import de.zib.museum.museumdat.ObjectClassificationWrapDocument.ObjectClassificationWrap;
import de.zib.museum.museumdat.ObjectWorkTypeDocument;
import de.zib.museum.museumdat.ObjectWorkTypeDocument.ObjectWorkType;
import de.zib.museum.museumdat.ObjectWorkTypeWrapDocument;
import de.zib.museum.museumdat.ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap;
import de.zib.museum.museumdat.PoliticalEntityAttribute;
import de.zib.museum.museumdat.PrefAttribute;
import de.zib.museum.museumdat.RecordIDDocument;
import de.zib.museum.museumdat.RecordIDDocument.RecordID;
import de.zib.museum.museumdat.RecordInfoIDDocument;
import de.zib.museum.museumdat.RecordInfoIDDocument.RecordInfoID;
import de.zib.museum.museumdat.RecordInfoSetDocument;
import de.zib.museum.museumdat.RecordInfoSetDocument.RecordInfoSet;
import de.zib.museum.museumdat.RecordMetadataDateDocument;
import de.zib.museum.museumdat.RecordMetadataDateDocument.RecordMetadataDate;
import de.zib.museum.museumdat.RecordMetadataLocDocument;
import de.zib.museum.museumdat.RecordMetadataLocDocument.RecordMetadataLoc;
import de.zib.museum.museumdat.RecordRelIDDocument;
import de.zib.museum.museumdat.RecordRelIDDocument.RecordRelID;
import de.zib.museum.museumdat.RecordSourceDocument;
import de.zib.museum.museumdat.RecordSourceDocument.RecordSource;
import de.zib.museum.museumdat.RecordTypeDocument;
import de.zib.museum.museumdat.RecordTypeDocument.RecordType;
import de.zib.museum.museumdat.RecordWrapDocument;
import de.zib.museum.museumdat.RecordWrapDocument.RecordWrap;
import de.zib.museum.museumdat.RelatedResourceRelTypeDocument;
import de.zib.museum.museumdat.RelatedResourceRelTypeDocument.RelatedResourceRelType;
import de.zib.museum.museumdat.RelatedWorkRelTypeDocument;
import de.zib.museum.museumdat.RelatedWorkRelTypeDocument.RelatedWorkRelType;
import de.zib.museum.museumdat.RelatedWorkSetDocument;
import de.zib.museum.museumdat.RelatedWorkSetDocument.RelatedWorkSet;
import de.zib.museum.museumdat.RelatedWorksWrapDocument;
import de.zib.museum.museumdat.RelatedWorksWrapDocument.RelatedWorksWrap;
import de.zib.museum.museumdat.RelationWrapDocument;
import de.zib.museum.museumdat.RelationWrapDocument.RelationWrap;
import de.zib.museum.museumdat.RepositoryLocationNameDocument;
import de.zib.museum.museumdat.RepositoryLocationNameDocument.RepositoryLocationName;
import de.zib.museum.museumdat.RepositoryNameDocument;
import de.zib.museum.museumdat.RepositoryNameDocument.RepositoryName;
import de.zib.museum.museumdat.RepositorySetDocument;
import de.zib.museum.museumdat.RepositorySetDocument.RepositorySet;
import de.zib.museum.museumdat.RepositoryWrapDocument;
import de.zib.museum.museumdat.RepositoryWrapDocument.RepositoryWrap;
import de.zib.museum.museumdat.ResourceIDDocument;
import de.zib.museum.museumdat.ResourceIDDocument.ResourceID;
import de.zib.museum.museumdat.ResourceMetadataLocDocument;
import de.zib.museum.museumdat.ResourceMetadataLocDocument.ResourceMetadataLoc;
import de.zib.museum.museumdat.ResourceRelTypeDocument;
import de.zib.museum.museumdat.ResourceRelTypeDocument.ResourceRelType;
import de.zib.museum.museumdat.ResourceSetDocument;
import de.zib.museum.museumdat.ResourceSetDocument.ResourceSet;
import de.zib.museum.museumdat.ResourceSourceDocument;
import de.zib.museum.museumdat.ResourceSourceDocument.ResourceSource;
import de.zib.museum.museumdat.ResourceTypeDocument;
import de.zib.museum.museumdat.ResourceTypeDocument.ResourceType;
import de.zib.museum.museumdat.ResourceViewDateDocument;
import de.zib.museum.museumdat.ResourceViewDateDocument.ResourceViewDate;
import de.zib.museum.museumdat.ResourceViewDescriptionDocument;
import de.zib.museum.museumdat.ResourceViewDescriptionDocument.ResourceViewDescription;
import de.zib.museum.museumdat.ResourceViewSubjectTermDocument;
import de.zib.museum.museumdat.ResourceViewSubjectTermDocument.ResourceViewSubjectTerm;
import de.zib.museum.museumdat.ResourceViewTypeDocument;
import de.zib.museum.museumdat.ResourceViewTypeDocument.ResourceViewType;
import de.zib.museum.museumdat.ResourceWrapDocument;
import de.zib.museum.museumdat.ResourceWrapDocument.ResourceWrap;
import de.zib.museum.museumdat.RightsResourceDocument;
import de.zib.museum.museumdat.RightsResourceDocument.RightsResource;
import de.zib.museum.museumdat.RightsWorkDocument;
import de.zib.museum.museumdat.RightsWorkDocument.RightsWork;
import de.zib.museum.museumdat.RoleActorDocument;
import de.zib.museum.museumdat.RoleActorDocument.RoleActor;
import de.zib.museum.museumdat.ScaleMeasurementsDocument;
import de.zib.museum.museumdat.ScaleMeasurementsDocument.ScaleMeasurements;
import de.zib.museum.museumdat.ShapeMeasurementsDocument;
import de.zib.museum.museumdat.ShapeMeasurementsDocument.ShapeMeasurements;
import de.zib.museum.museumdat.SourceDescriptiveNoteDocument;
import de.zib.museum.museumdat.SourceDescriptiveNoteDocument.SourceDescriptiveNote;
import de.zib.museum.museumdat.SourceMaterialsTechDocument;
import de.zib.museum.museumdat.SourceMaterialsTechDocument.SourceMaterialsTech;
import de.zib.museum.museumdat.SourceNameActorDocument;
import de.zib.museum.museumdat.SourceNameActorDocument.SourceNameActor;
import de.zib.museum.museumdat.SourceNameLocationDocument;
import de.zib.museum.museumdat.SourceNameLocationDocument.SourceNameLocation;
import de.zib.museum.museumdat.SourceStateEditionDocument;
import de.zib.museum.museumdat.SourceStateEditionDocument.SourceStateEdition;
import de.zib.museum.museumdat.SourceTitleDocument;
import de.zib.museum.museumdat.SourceTitleDocument.SourceTitle;
import de.zib.museum.museumdat.StyleDocument;
import de.zib.museum.museumdat.StyleDocument.Style;
import de.zib.museum.museumdat.StyleWrapDocument;
import de.zib.museum.museumdat.StyleWrapDocument.StyleWrap;
import de.zib.museum.museumdat.SubjectTermDocument;
import de.zib.museum.museumdat.SubjectTermDocument.SubjectTerm;
import de.zib.museum.museumdat.TermMaterialsTechDocument;
import de.zib.museum.museumdat.TermMaterialsTechDocument.TermMaterialsTech;
import de.zib.museum.museumdat.TermsourceAttribute;
import de.zib.museum.museumdat.TermsourceIDAttribute;
import de.zib.museum.museumdat.TitleDocument;
import de.zib.museum.museumdat.TitleDocument.Title;
import de.zib.museum.museumdat.TitleSetDocument;
import de.zib.museum.museumdat.TitleSetDocument.TitleSet;
import de.zib.museum.museumdat.TitleWrapDocument;
import de.zib.museum.museumdat.TitleWrapDocument.TitleWrap;
import de.zib.museum.museumdat.TypeAttribute;
import de.zib.museum.museumdat.VitalDatesActorDocument;
import de.zib.museum.museumdat.VitalDatesActorDocument.VitalDatesActor;
import de.zib.museum.museumdat.WorkIDDocument;
import de.zib.museum.museumdat.WorkIDDocument.WorkID;
import org.moosbusch.museum.document.MuseumXmlDocument;
import org.moosbusch.museum.inject.annotation.Language;
import org.moosbusch.museum.document.museumdat.MuseumDatXmlDocument;
import org.moosbusch.museum.document.museumdat.impl.DefaultMuseumDatXmlDocument;
import org.moosbusch.museum.inject.annotation.EncodingAnalog;
import org.moosbusch.museum.inject.annotation.LanguageEncoding;
import org.moosbusch.museum.inject.annotation.RelatedEncoding;
import org.moosbusch.museum.inject.museumdat.spi.AbstractMuseumDatModule;

/**
 *
 * @author moosbusch
 */
public class DefaultMuseumDatModule extends AbstractMuseumDatModule {

    @Override
    protected void configureImpl() {
        binder().bind(String.class).annotatedWith(Language.class).toInstance(
                getLanguage());
        binder().bind(String.class).annotatedWith(LanguageEncoding.class).toInstance(
                getLanguageEncoding());
        binder().bind(String.class).annotatedWith(RelatedEncoding.class).toInstance(
                getRelatedEncoding());
        binder().bind(String.class).annotatedWith(EncodingAnalog.class).toInstance(
                getEncodingAnalog());
    }

    @Provides
    @Override
    public MuseumDatXmlDocument<? extends DefaultMuseumDatObjectFactory> createDocument() {
        return new DefaultMuseumDatXmlDocument();
    }

    @Override
    protected String createRelatedEncoding() {
        return MuseumXmlDocument.DEFAULT_RELATED_ENCODING;
    }

    @Override
    protected String createLanguageEncoding() {
        return MuseumDatXmlDocument.DEFAULT_LANGUAGE_ENCODING;
    }

    @Override
    protected String createEncodingAnalog() {
        return MuseumDatXmlDocument.DEFAULT_ENCODING_ANALOG;
    }

    @Provides
    @Override
    public EncodinganalogAttribute createMuseumDatEncodingAnalogAttribute() {
        EncodinganalogAttribute result = EncodinganalogAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public GeographicalEntityAttribute createMuseumDatGeographicalEntityAttribute() {
        GeographicalEntityAttribute result = GeographicalEntityAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ImportedAttribute createMuseumDatImportedAttribute() {
        ImportedAttribute result = ImportedAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LabelAttribute createMuseumDatLabelAttribute() {
        LabelAttribute result = LabelAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LangAttribute createMuseumDatLangAttribute() {
        LangAttribute result = LangAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LinkschemeAttribute createMuseumDatLinkschemeAttribute() {
        LinkschemeAttribute result = LinkschemeAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LocIDAttribute createMuseumDatLocIDAttribute() {
        LocIDAttribute result = LocIDAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LocIDtypeAttribute createMuseumDatLocIDTypeAttribute() {
        LocIDtypeAttribute result = LocIDtypeAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public TermsourceAttribute createMuseumDatTermSourceAttribute() {
        TermsourceAttribute result = TermsourceAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public TermsourceIDAttribute createMuseumDatTermSourceIDAttribute() {
        TermsourceIDAttribute result = TermsourceIDAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public PoliticalEntityAttribute createMuseumDatPoliticalEntityAttribute() {
        PoliticalEntityAttribute result = PoliticalEntityAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public TypeAttribute createMuseumDatTypeAttribute() {
        TypeAttribute result = TypeAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public PrefAttribute createMuseumDatPrefAttribute() {
        PrefAttribute result = PrefAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ObjectWorkTypeDocument createMuseumDatObjectWorkTypeDocument() {
        ObjectWorkTypeDocument result = ObjectWorkTypeDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ObjectWorkType createMuseumDatObjectWorkType() {
        ObjectWorkType result = ObjectWorkTypeDocument.ObjectWorkType.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public RepositoryLocationNameDocument createMuseumDatRepositoryLocationNameDocument() {
        RepositoryLocationNameDocument result = RepositoryLocationNameDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public RepositoryLocationName createMuseumDatRepositoryLocationName() {
        RepositoryLocationName result = RepositoryLocationNameDocument.RepositoryLocationName.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LinkResourceDocument createMuseumDatLinkResourceDocument() {
        LinkResourceDocument result = LinkResourceDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LinkResource createMuseumDatLinkResource() {
        LinkResource result = LinkResourceDocument.LinkResource.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public GenderActorDocument createMuseumDatGenderActorDocument() {
        GenderActorDocument result = GenderActorDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public GenderActor createMuseumDatGenderActor() {
        GenderActor result = GenderActorDocument.GenderActor.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public IndexingDatesDocument createMuseumDatIndexingDatesDocument() {
        IndexingDatesDocument result = IndexingDatesDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public IndexingDates createMuseumDatIndexingDates() {
        IndexingDates result = IndexingDatesDocument.IndexingDates.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public EarliestDateDocument createMuseumDatEarliestDateDocument() {
        EarliestDateDocument result = EarliestDateDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public EarliestDate createMuseumDatEarliestDate() {
        EarliestDate result = EarliestDateDocument.EarliestDate.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LatestDateDocument createMuseumDatLatestDateDocument() {
        LatestDateDocument result = LatestDateDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LatestDate createMuseumDatLatestDate() {
        LatestDate result = LatestDateDocument.LatestDate.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public MeasurementsSetDocument createMuseumDatMeasurementsSetDocument() {
        MeasurementsSetDocument result = MeasurementsSetDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public MeasurementsSet createMuseumDatMeasurementsSet() {
        MeasurementsSet result = MeasurementsSetDocument.MeasurementsSet.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public SourceMaterialsTechDocument createMuseumDatSourceMaterialsTechDocument() {
        SourceMaterialsTechDocument result = SourceMaterialsTechDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public SourceMaterialsTech createMuseumDatSourceMaterialsTech() {
        SourceMaterialsTech result = SourceMaterialsTechDocument.SourceMaterialsTech.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public NationalityActorDocument createMuseumDatNationalityActorDocument() {
        NationalityActorDocument result = NationalityActorDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public NationalityActor createMuseumDatNationalityActor() {
        NationalityActor result = NationalityActorDocument.NationalityActor.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public RelatedWorkRelTypeDocument createMuseumDatRelatedWorkRelTypeDocument() {
        RelatedWorkRelTypeDocument result = RelatedWorkRelTypeDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public RelatedWorkRelType createMuseumDatRelatedWorkRelType() {
        RelatedWorkRelType result = RelatedWorkRelTypeDocument.RelatedWorkRelType.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ResourceWrapDocument createMuseumDatResourceWrapDocument() {
        ResourceWrapDocument result = ResourceWrapDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ResourceWrap createMuseumDatResourceWrap() {
        ResourceWrap result = ResourceWrapDocument.ResourceWrap.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ResourceSetDocument createMuseumDatResourceSetDocument() {
        ResourceSetDocument result = ResourceSetDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ResourceSet createMuseumDatResourceSet() {
        ResourceSet result = ResourceSetDocument.ResourceSet.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ResourceIDDocument createMuseumDatResourceIDDocument() {
        ResourceIDDocument result = ResourceIDDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ResourceID createMuseumDatResourceID() {
        ResourceID result = ResourceIDDocument.ResourceID.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ResourceRelTypeDocument createMuseumDatResourceRelTypeDocument() {
        ResourceRelTypeDocument result = ResourceRelTypeDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ResourceRelType createMuseumDatResourceRelType() {
        ResourceRelType result = ResourceRelTypeDocument.ResourceRelType.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceTypeDocument createMuseumDatResourceTypeDocument() {
        ResourceTypeDocument result = ResourceTypeDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceType createMuseumDatResourceType() {
        ResourceType result = ResourceTypeDocument.ResourceType.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RightsResourceDocument createMuseumDatRightsResourceDocument() {
        RightsResourceDocument result = RightsResourceDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RightsResource createMuseumDatRightsResource() {
        RightsResource result = RightsResourceDocument.RightsResource.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewDescriptionDocument createMuseumDatResourceViewDescriptionDocument() {
        ResourceViewDescriptionDocument result = ResourceViewDescriptionDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewDescription createMuseumDatResourceViewDescription() {
        ResourceViewDescription result = ResourceViewDescriptionDocument.ResourceViewDescription.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewTypeDocument createMuseumDatResourceViewTypeDocument() {
        ResourceViewTypeDocument result = ResourceViewTypeDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewType createMuseumDatResourceViewType() {
        ResourceViewType result = ResourceViewTypeDocument.ResourceViewType.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewSubjectTermDocument createMuseumDatResourceViewSubjectTermDocument() {
        ResourceViewSubjectTermDocument result = ResourceViewSubjectTermDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewSubjectTerm createMuseumDatResourceViewSubjectTerm() {
        ResourceViewSubjectTerm result = ResourceViewSubjectTermDocument.ResourceViewSubjectTerm.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewDateDocument createMuseumDatResourceViewDateDocument() {
        ResourceViewDateDocument result = ResourceViewDateDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewDate createMuseumDatResourceViewDate() {
        ResourceViewDate result = ResourceViewDateDocument.ResourceViewDate.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceSourceDocument createMuseumDatResourceSourceDocument() {
        ResourceSourceDocument result = ResourceSourceDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceSource createMuseumDatResourceSource() {
        ResourceSource result = ResourceSourceDocument.ResourceSource.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LinkRelatedResourceDocument createMuseumDatLinkRelatedResourceDocument() {
        LinkRelatedResourceDocument result = LinkRelatedResourceDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LinkRelatedResource createMuseumDatLinkRelatedResource() {
        LinkRelatedResource result = LinkRelatedResourceDocument.LinkRelatedResource.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelatedResourceRelTypeDocument createMuseumDatRelatedResourceRelTypeDocument() {
        RelatedResourceRelTypeDocument result = RelatedResourceRelTypeDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelatedResourceRelType createMuseumDatRelatedResourceRelType() {
        RelatedResourceRelType result = RelatedResourceRelTypeDocument.RelatedResourceRelType.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LabelRelatedResourceDocument createMuseumDatLabelRelatedResourceDocument() {
        LabelRelatedResourceDocument result = LabelRelatedResourceDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LabelRelatedResource createMuseumDatLabelRelatedResource() {
        LabelRelatedResource result = LabelRelatedResourceDocument.LabelRelatedResource.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceMetadataLocDocument createMuseumDatResourceMetadataLocDocument() {
        ResourceMetadataLocDocument result = ResourceMetadataLocDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceMetadataLoc createMuseumDatResourceMetadataLoc() {
        ResourceMetadataLoc result = ResourceMetadataLocDocument.ResourceMetadataLoc.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TermMaterialsTechDocument createMuseumDatTermMaterialsTechDocument() {
        TermMaterialsTechDocument result = TermMaterialsTechDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TermMaterialsTech createMuseumDatTermMaterialsTech() {
        TermMaterialsTech result = TermMaterialsTechDocument.TermMaterialsTech.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingSubjectSetDocument createMuseumDatIndexingSubjectSetDocument() {
        IndexingSubjectSetDocument result = IndexingSubjectSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingSubjectSet createMuseumDatIndexingSubjectSet() {
        IndexingSubjectSet result = IndexingSubjectSetDocument.IndexingSubjectSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentSubjectDocument createMuseumDatExtentSubjectDocument() {
        ExtentSubjectDocument result = ExtentSubjectDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentSubject createMuseumDatExtentSubject() {
        ExtentSubject result = ExtentSubjectDocument.ExtentSubject.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SubjectTermDocument createMuseumDatSubjectTermDocument() {
        SubjectTermDocument result = SubjectTermDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SubjectTerm createMuseumDatSubjectTerm() {
        SubjectTerm result = SubjectTermDocument.SubjectTerm.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayCreatorDocument createMuseumDatDisplayCreatorDocument() {
        DisplayCreatorDocument result = DisplayCreatorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayCreator createMuseumDatDisplayCreator() {
        DisplayCreator result = DisplayCreatorDocument.DisplayCreator.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentMeasurementsDocument createMuseumDatExtentMeasurementsDocument() {
        ExtentMeasurementsDocument result = ExtentMeasurementsDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentMeasurements createMuseumDatExtentMeasurements() {
        ExtentMeasurements result = ExtentMeasurementsDocument.ExtentMeasurements.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentMaterialsTechDocument createMuseumDatExtentMaterialsTechDocument() {
        ExtentMaterialsTechDocument result = ExtentMaterialsTechDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentMaterialsTech createMuseumDatExtentMaterialsTech() {
        ExtentMaterialsTech result = ExtentMaterialsTechDocument.ExtentMaterialsTech.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ShapeMeasurementsDocument createMuseumDatShapeMeasurementsDocument() {
        ShapeMeasurementsDocument result = ShapeMeasurementsDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ShapeMeasurements createMuseumDatShapeMeasurements() {
        ShapeMeasurements result = ShapeMeasurementsDocument.ShapeMeasurements.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RepositoryWrapDocument createMuseumDatRepositoryWrapDocument() {
        RepositoryWrapDocument result = RepositoryWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RepositoryWrap createMuseumDatRepositoryWrap() {
        RepositoryWrap result = RepositoryWrapDocument.RepositoryWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RepositorySetDocument createMuseumDatRepositorySetDocument() {
        RepositorySetDocument result = RepositorySetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RepositorySet createMuseumDatRepositorySet() {
        RepositorySet result = RepositorySetDocument.RepositorySet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RepositoryNameDocument createMuseumDatRepositoryNameDocument() {
        RepositoryNameDocument result = RepositoryNameDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RepositoryName createMuseumDatRepositoryName() {
        RepositoryName result = RepositoryNameDocument.RepositoryName.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public WorkIDDocument createMuseumDatWorkIDDocument() {
        WorkIDDocument result = WorkIDDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public WorkID createMuseumDatWorkID() {
        WorkID result = WorkIDDocument.WorkID.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public FormatMeasurementsDocument createMuseumDatFormatMeasurementsDocument() {
        FormatMeasurementsDocument result = FormatMeasurementsDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public FormatMeasurements createMuseumDatFormatMeasurements() {
        FormatMeasurements result = FormatMeasurementsDocument.FormatMeasurements.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public NameActorDocument createMuseumDatNameActorDocument() {
        NameActorDocument result = NameActorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public NameActor createMuseumDatNameActor() {
        NameActor result = NameActorDocument.NameActor.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public StyleWrapDocument createMuseumDatStyleWrapDocument() {
        StyleWrapDocument result = StyleWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public StyleWrap createMuseumDatStyleWrap() {
        StyleWrap result = StyleWrapDocument.StyleWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public StyleDocument createMuseumDatStyleDocument() {
        StyleDocument result = StyleDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public Style createMuseumDatStyle() {
        Style result = StyleDocument.Style.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMaterialsTechWrapDocument createMuseumDatIndexingMaterialsTechWrapDocument() {
        IndexingMaterialsTechWrapDocument result = IndexingMaterialsTechWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMaterialsTechWrap createMuseumDatIndexingMaterialsTechWrap() {
        IndexingMaterialsTechWrap result = IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMaterialsTechSetDocument createMuseumDatIndexingMaterialsTechSetDocument() {
        IndexingMaterialsTechSetDocument result = IndexingMaterialsTechSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMaterialsTechSet createMuseumDatIndexingMaterialsTechSet() {
        IndexingMaterialsTechSet result = IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LocRelatedWorkDocument createMuseumDatLocRelatedWorkDocument() {
        LocRelatedWorkDocument result = LocRelatedWorkDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LocRelatedWork createMuseumDatLocRelatedWork() {
        LocRelatedWork result = LocRelatedWorkDocument.LocRelatedWork.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayEventWrapDocument createMuseumDatDisplayEventWrapDocument() {
        DisplayEventWrapDocument result = DisplayEventWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayEventWrap createMuseumDatDisplayEventWrap() {
        DisplayEventWrap result = DisplayEventWrapDocument.DisplayEventWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayEventDocument createMuseumDatDisplayEventDocument() {
        DisplayEventDocument result = DisplayEventDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayEvent createMuseumDatDisplayEvent() {
        DisplayEvent result = DisplayEventDocument.DisplayEvent.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public CultureDocument createMuseumDatCultureDocument() {
        CultureDocument result = CultureDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public Culture createMuseumDatCulture() {
        Culture result = CultureDocument.Culture.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordRelIDDocument createMuseumDatRecordRelIDDocument() {
        RecordRelIDDocument result = RecordRelIDDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordRelID createMuseumDatRecordRelID() {
        RecordRelID result = RecordRelIDDocument.RecordRelID.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ObjectClassificationWrapDocument createMuseumDatObjectClassificationWrapDocument() {
        ObjectClassificationWrapDocument result = ObjectClassificationWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ObjectClassificationWrap createMuseumDatObjectClassificationWrap() {
        ObjectClassificationWrap result = ObjectClassificationWrapDocument.ObjectClassificationWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ObjectWorkTypeWrapDocument createMuseumDatObjectWorkTypeWrapDocument() {
        ObjectWorkTypeWrapDocument result = ObjectWorkTypeWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ObjectWorkTypeWrap createMuseumDatObjectWorkTypeWrap() {
        ObjectWorkTypeWrap result = ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ClassificationWrapDocument createMuseumDatClassificationWrapDocument() {
        ClassificationWrapDocument result = ClassificationWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ClassificationWrap createMuseumDatClassificationWrap() {
        ClassificationWrap result = ClassificationWrapDocument.ClassificationWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ClassificationDocument createMuseumDatClassificationDocument() {
        ClassificationDocument result = ClassificationDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public Classification createMuseumDatClassification() {
        Classification result = ClassificationDocument.Classification.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveNoteWrapDocument createMuseumDatDescriptiveNoteWrapDocument() {
        DescriptiveNoteWrapDocument result = DescriptiveNoteWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveNoteWrap createMuseumDatDescriptiveNoteWrap() {
        DescriptiveNoteWrap result = DescriptiveNoteWrapDocument.DescriptiveNoteWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveNoteSetDocument createMuseumDatDescriptiveNoteSetDocument() {
        DescriptiveNoteSetDocument result = DescriptiveNoteSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveNoteSet createMuseumDatDescriptiveNoteSet() {
        DescriptiveNoteSet result = DescriptiveNoteSetDocument.DescriptiveNoteSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveNoteDocument createMuseumDatDescriptiveNoteDocument() {
        DescriptiveNoteDocument result = DescriptiveNoteDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveNote createMuseumDatDescriptiveNote() {
        DescriptiveNote result = DescriptiveNoteDocument.DescriptiveNote.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceDescriptiveNoteDocument createMuseumDatSourceDescriptiveNoteDocument() {
        SourceDescriptiveNoteDocument result = SourceDescriptiveNoteDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceDescriptiveNote createMuseumDatSourceDescriptiveNote() {
        SourceDescriptiveNote result = SourceDescriptiveNoteDocument.SourceDescriptiveNote.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMeasurementsWrapDocument createMuseumDatIndexingMeasurementsWrapDocument() {
        IndexingMeasurementsWrapDocument result = IndexingMeasurementsWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMeasurementsWrap createMuseumDatIndexingMeasurementsWrap() {
        IndexingMeasurementsWrap result = IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMeasurementsSetDocument createMuseumDatIndexingMeasurementsSetDocument() {
        IndexingMeasurementsSetDocument result = IndexingMeasurementsSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMeasurementsSet createMuseumDatIndexingMeasurementsSet() {
        IndexingMeasurementsSet result = IndexingMeasurementsSetDocument.IndexingMeasurementsSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ScaleMeasurementsDocument createMuseumDatScaleMeasurementsDocument() {
        ScaleMeasurementsDocument result = ScaleMeasurementsDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ScaleMeasurements createMuseumDatScaleMeasurements() {
        ScaleMeasurements result = ScaleMeasurementsDocument.ScaleMeasurements.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayMeasurementsDocument createMuseumDatDisplayMeasurementsDocument() {
        DisplayMeasurementsDocument result = DisplayMeasurementsDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayMeasurements createMuseumDatDisplayMeasurements() {
        DisplayMeasurements result = DisplayMeasurementsDocument.DisplayMeasurements.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public InscriptionsDocument createMuseumDatInscriptionsDocument() {
        InscriptionsDocument result = InscriptionsDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public Inscriptions createMuseumDatInscriptions() {
        Inscriptions result = InscriptionsDocument.Inscriptions.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public EventTypeDocument createMuseumDatEventTypeDocument() {
        EventTypeDocument result = EventTypeDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public EventType createMuseumDatEventType() {
        EventType result = EventTypeDocument.EventType.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RightsWorkDocument createMuseumDatRightsWorkDocument() {
        RightsWorkDocument result = RightsWorkDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RightsWork createMuseumDatRightsWork() {
        RightsWork result = RightsWorkDocument.RightsWork.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TitleDocument createMuseumDatTitleDocument() {
        TitleDocument result = TitleDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public Title createMuseumDatTitle() {
        Title result = TitleDocument.Title.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordInfoIDDocument createMuseumDatRecordInfoIDDocument() {
        RecordInfoIDDocument result = RecordInfoIDDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordInfoID createMuseumDatRecordInfoID() {
        RecordInfoID result = RecordInfoIDDocument.RecordInfoID.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptionWrapDocument createMuseumDatDescriptionWrapDocument() {
        DescriptionWrapDocument result = DescriptionWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptionWrap createMuseumDatDescriptionWrap() {
        DescriptionWrap result = DescriptionWrapDocument.DescriptionWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayCreationDateDocument createMuseumDatDisplayCreationDateDocument() {
        DisplayCreationDateDocument result = DisplayCreationDateDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayCreationDate createMuseumDatDisplayCreationDate() {
        DisplayCreationDate result = DisplayCreationDateDocument.DisplayCreationDate.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayCreationLocationDocument createMuseumDatDisplayCreationLocationDocument() {
        DisplayCreationLocationDocument result = DisplayCreationLocationDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayCreationLocation createMuseumDatDisplayCreationLocation() {
        DisplayCreationLocation result = DisplayCreationLocationDocument.DisplayCreationLocation.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayMaterialsTechDocument createMuseumDatDisplayMaterialsTechDocument() {
        DisplayMaterialsTechDocument result = DisplayMaterialsTechDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayMaterialsTech createMuseumDatDisplayMaterialsTech() {
        DisplayMaterialsTech result = DisplayMaterialsTechDocument.DisplayMaterialsTech.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayStateEditionWrapDocument createMuseumDatDisplayStateEditionWrapDocument() {
        DisplayStateEditionWrapDocument result = DisplayStateEditionWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayStateEditionWrap createMuseumDatDisplayStateEditionWrap() {
        DisplayStateEditionWrap result = DisplayStateEditionWrapDocument.DisplayStateEditionWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayStateDocument createMuseumDatDisplayStateDocument() {
        DisplayStateDocument result = DisplayStateDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayState createMuseumDatDisplayState() {
        DisplayState result = DisplayStateDocument.DisplayState.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayEditionDocument createMuseumDatDisplayEditionDocument() {
        DisplayEditionDocument result = DisplayEditionDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayEdition createMuseumDatDisplayEdition() {
        DisplayEdition result = DisplayEditionDocument.DisplayEdition.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceStateEditionDocument createMuseumDatSourceStateEditionDocument() {
        SourceStateEditionDocument result = SourceStateEditionDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceStateEdition createMuseumDatSourceStateEdition() {
        SourceStateEdition result = SourceStateEditionDocument.SourceStateEdition.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordSourceDocument createMuseumDatRecordSourceDocument() {
        RecordSourceDocument result = RecordSourceDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordSource createMuseumDatRecordSource() {
        RecordSource result = RecordSourceDocument.RecordSource.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordIDDocument createMuseumDatRecordIDDocument() {
        RecordIDDocument result = RecordIDDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordID createMuseumDatRecordID() {
        RecordID result = RecordIDDocument.RecordID.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelationWrapDocument createMuseumDatRelationWrapDocument() {
        RelationWrapDocument result = RelationWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelationWrap createMuseumDatRelationWrap() {
        RelationWrap result = RelationWrapDocument.RelationWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingSubjectWrapDocument createMuseumDatIndexingSubjectWrapDocument() {
        IndexingSubjectWrapDocument result = IndexingSubjectWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingSubjectWrap createMuseumDatIndexingSubjectWrap() {
        IndexingSubjectWrap result = IndexingSubjectWrapDocument.IndexingSubjectWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelatedWorksWrapDocument createMuseumDatRelatedWorksWrapDocument() {
        RelatedWorksWrapDocument result = RelatedWorksWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelatedWorksWrap createMuseumDatRelatedWorksWrap() {
        RelatedWorksWrap result = RelatedWorksWrapDocument.RelatedWorksWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelatedWorkSetDocument createMuseumDatRelatedWorkSetDocument() {
        RelatedWorkSetDocument result = RelatedWorkSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelatedWorkSet createMuseumDatRelatedWorkSet() {
        RelatedWorkSet result = RelatedWorkSetDocument.RelatedWorkSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LinkRelatedWorkDocument createMuseumDatLinkRelatedWorkDocument() {
        LinkRelatedWorkDocument result = LinkRelatedWorkDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LinkRelatedWork createMuseumDatLinkRelatedWork() {
        LinkRelatedWork result = LinkRelatedWorkDocument.LinkRelatedWork.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LabelRelatedWorkDocument createMuseumDatLabelRelatedWorkDocument() {
        LabelRelatedWorkDocument result = LabelRelatedWorkDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LabelRelatedWork createMuseumDatLabelRelatedWork() {
        LabelRelatedWork result = LabelRelatedWorkDocument.LabelRelatedWork.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingEventSetDocument createMuseumDatIndexingEventSetDocument() {
        IndexingEventSetDocument result = IndexingEventSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingEventSet createMuseumDatIndexingEventSet() {
        IndexingEventSet result = IndexingEventSetDocument.IndexingEventSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingActorSetDocument createMuseumDatIndexingActorSetDocument() {
        IndexingActorSetDocument result = IndexingActorSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingActorSet createMuseumDatIndexingActorSet() {
        IndexingActorSet result = IndexingActorSetDocument.IndexingActorSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public NameActorSetDocument createMuseumDatNameActorSetDocument() {
        NameActorSetDocument result = NameActorSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public NameActorSet createMuseumDatNameActorSet() {
        NameActorSet result = NameActorSetDocument.NameActorSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceNameActorDocument createMuseumDatSourceNameActorDocument() {
        SourceNameActorDocument result = SourceNameActorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceNameActor createMuseumDatSourceNameActor() {
        SourceNameActor result = SourceNameActorDocument.SourceNameActor.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public VitalDatesActorDocument createMuseumDatVitalDatesActorDocument() {
        VitalDatesActorDocument result = VitalDatesActorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public VitalDatesActor createMuseumDatVitalDatesActor() {
        VitalDatesActor result = VitalDatesActorDocument.VitalDatesActor.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RoleActorDocument createMuseumDatRoleActorDocument() {
        RoleActorDocument result = RoleActorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RoleActor createMuseumDatRoleActor() {
        RoleActor result = RoleActorDocument.RoleActor.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentActorDocument createMuseumDatExtentActorDocument() {
        ExtentActorDocument result = ExtentActorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentActor createMuseumDatExtentActor() {
        ExtentActor result = ExtentActorDocument.ExtentActor.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingLocationWrapDocument createMuseumDatIndexingLocationWrapDocument() {
        IndexingLocationWrapDocument result = IndexingLocationWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingLocationWrap createMuseumDatIndexingLocationWrap() {
        IndexingLocationWrap result = IndexingLocationWrapDocument.IndexingLocationWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingLocationSetDocument createMuseumDatIndexingLocationSetDocument() {
        IndexingLocationSetDocument result = IndexingLocationSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingLocationSet createMuseumDatIndexingLocationSet() {
        IndexingLocationSet result = IndexingLocationSetDocument.IndexingLocationSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public NameLocationSetDocument createMuseumDatNameLocationSetDocument() {
        NameLocationSetDocument result = NameLocationSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public NameLocationSet createMuseumDatNameLocationSet() {
        NameLocationSet result = NameLocationSetDocument.NameLocationSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public NameLocationDocument createMuseumDatNameLocationDocument() {
        NameLocationDocument result = NameLocationDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public NameLocation createMuseumDatNameLocation() {
        NameLocation result = NameLocationDocument.NameLocation.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceNameLocationDocument createMuseumDatSourceNameLocationDocument() {
        SourceNameLocationDocument result = SourceNameLocationDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceNameLocation createMuseumDatSourceNameLocation() {
        SourceNameLocation result = SourceNameLocationDocument.SourceNameLocation.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordInfoSetDocument createMuseumDatRecordInfoSetDocument() {
        RecordInfoSetDocument result = RecordInfoSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordInfoSet createMuseumDatRecordInfoSet() {
        RecordInfoSet result = RecordInfoSetDocument.RecordInfoSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordMetadataLocDocument createMuseumDatRecordMetadataLocDocument() {
        RecordMetadataLocDocument result = RecordMetadataLocDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordMetadataLoc createMuseumDatRecordMetadataLoc() {
        RecordMetadataLoc result = RecordMetadataLocDocument.RecordMetadataLoc.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordMetadataDateDocument createMuseumDatRecordMetadataDateDocument() {
        RecordMetadataDateDocument result = RecordMetadataDateDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordMetadataDate createMuseumDatRecordMetadataDate() {
        RecordMetadataDate result = RecordMetadataDateDocument.RecordMetadataDate.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceTitleDocument createMuseumDatSourceTitleDocument() {
        SourceTitleDocument result = SourceTitleDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceTitle createMuseumDatSourceTitle() {
        SourceTitle result = SourceTitleDocument.SourceTitle.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingEventWrapDocument createMuseumDatIndexingEventWrapDocument() {
        IndexingEventWrapDocument result = IndexingEventWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingEventWrap createMuseumDatIndexingEventWrap() {
        IndexingEventWrap result = IndexingEventWrapDocument.IndexingEventWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TitleSetDocument createMuseumDatTitleSetDocument() {
        TitleSetDocument result = TitleSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TitleSet createMuseumDatTitleSet() {
        TitleSet result = TitleSetDocument.TitleSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public InscriptionsWrapDocument createMuseumDatInscriptionsWrapDocument() {
        InscriptionsWrapDocument result = InscriptionsWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public InscriptionsWrap createMuseumDatInscriptionsWrap() {
        InscriptionsWrap result = InscriptionsWrapDocument.InscriptionsWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordTypeDocument createMuseumDatRecordTypeDocument() {
        RecordTypeDocument result = RecordTypeDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordType createMuseumDatRecordType() {
        RecordType result = RecordTypeDocument.RecordType.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public CultureWrapDocument createMuseumDatCultureWrapDocument() {
        CultureWrapDocument result = CultureWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public CultureWrap createMuseumDatCultureWrap() {
        CultureWrap result = CultureWrapDocument.CultureWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public MuseumdatDocument createMuseumDatMuseumdatDocument() {
        MuseumdatDocument result = MuseumdatDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public Museumdat createMuseumDatMuseumdat() {
        Museumdat result = MuseumdatDocument.Museumdat.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveMetadataDocument createMuseumDatDescriptiveMetadataDocument() {
        DescriptiveMetadataDocument result = DescriptiveMetadataDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveMetadata createMuseumDatDescriptiveMetadata() {
        DescriptiveMetadata result = DescriptiveMetadataDocument.DescriptiveMetadata.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IdentificationWrapDocument createMuseumDatIdentificationWrapDocument() {
        IdentificationWrapDocument result = IdentificationWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IdentificationWrap createMuseumDatIdentificationWrap() {
        IdentificationWrap result = IdentificationWrapDocument.IdentificationWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TitleWrapDocument createMuseumDatTitleWrapDocument() {
        TitleWrapDocument result = TitleWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TitleWrap createMuseumDatTitleWrap() {
        TitleWrap result = TitleWrapDocument.TitleWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public EventWrapDocument createMuseumDatEventWrapDocument() {
        EventWrapDocument result = EventWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public EventWrap createMuseumDatEventWrap() {
        EventWrap result = EventWrapDocument.EventWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public AdministrativeMetadataDocument createMuseumDatAdministrativeMetadataDocument() {
        AdministrativeMetadataDocument result = AdministrativeMetadataDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public AdministrativeMetadata createMuseumDatAdministrativeMetadata() {
        AdministrativeMetadata result = AdministrativeMetadataDocument.AdministrativeMetadata.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordWrapDocument createMuseumDatRecordWrapDocument() {
        RecordWrapDocument result = RecordWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordWrap createMuseumDatRecordWrap() {
        RecordWrap result = RecordWrapDocument.RecordWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public MuseumdatWrapDocument createMuseumDatMuseumdatWrapDocument() {
        MuseumdatWrapDocument result = MuseumdatWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public MuseumdatWrap createMuseumDatMuseumdatWrap() {
        MuseumdatWrap result = MuseumdatWrapDocument.MuseumdatWrap.Factory.newInstance();

        return result;
    }
}
