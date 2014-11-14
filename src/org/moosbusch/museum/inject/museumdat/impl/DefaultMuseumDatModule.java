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
import org.moosbusch.museum.document.museumdat.MuseumDatXmlDocument;
import org.moosbusch.museum.document.museumdat.impl.DefaultMuseumDatXmlDocument;
import org.moosbusch.museum.inject.annotation.EncodingAnalog;
import org.moosbusch.museum.inject.annotation.Language;
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
    public MuseumDatXmlDocument<? extends DefaultMuseumDatObjectFactory> createDocument() {
        return new DefaultMuseumDatXmlDocument();
    }

    @Provides
    @Override
    public EncodinganalogAttribute createMuseumDatEncodingAnalogAttribute() {
        return EncodinganalogAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public GeographicalEntityAttribute createMuseumDatGeographicalEntityAttribute() {
        return GeographicalEntityAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public ImportedAttribute createMuseumDatImportedAttribute() {
        return ImportedAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public LabelAttribute createMuseumDatLabelAttribute() {
        return LabelAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public LangAttribute createMuseumDatLangAttribute() {
        return LangAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public LinkschemeAttribute createMuseumDatLinkschemeAttribute() {
        return LinkschemeAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public LocIDAttribute createMuseumDatLocIDAttribute() {
        return LocIDAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public LocIDtypeAttribute createMuseumDatLocIDTypeAttribute() {
        return LocIDtypeAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public TermsourceAttribute createMuseumDatTermSourceAttribute() {
        return TermsourceAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public TermsourceIDAttribute createMuseumDatTermSourceIDAttribute() {
        return TermsourceIDAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public PoliticalEntityAttribute createMuseumDatPoliticalEntityAttribute() {
        return PoliticalEntityAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public TypeAttribute createMuseumDatTypeAttribute() {
        return TypeAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public PrefAttribute createMuseumDatPrefAttribute() {
        return PrefAttribute.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectWorkTypeDocument createMuseumDatObjectWorkTypeDocument() {
        return ObjectWorkTypeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectWorkType createMuseumDatObjectWorkType() {
        return ObjectWorkTypeDocument.ObjectWorkType.Factory.newInstance();
    }

    @Provides
    @Override
    public RepositoryLocationNameDocument createMuseumDatRepositoryLocationNameDocument() {
        return RepositoryLocationNameDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RepositoryLocationName createMuseumDatRepositoryLocationName() {
        return RepositoryLocationNameDocument.RepositoryLocationName.Factory.newInstance();
    }

    @Provides
    @Override
    public LinkResourceDocument createMuseumDatLinkResourceDocument() {
        return LinkResourceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LinkResource createMuseumDatLinkResource() {
        return LinkResourceDocument.LinkResource.Factory.newInstance();
    }

    @Provides
    @Override
    public GenderActorDocument createMuseumDatGenderActorDocument() {
        return GenderActorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public GenderActor createMuseumDatGenderActor() {
        return GenderActorDocument.GenderActor.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingDatesDocument createMuseumDatIndexingDatesDocument() {
        return IndexingDatesDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingDates createMuseumDatIndexingDates() {
        return IndexingDatesDocument.IndexingDates.Factory.newInstance();
    }

    @Provides
    @Override
    public EarliestDateDocument createMuseumDatEarliestDateDocument() {
        return EarliestDateDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EarliestDate createMuseumDatEarliestDate() {
        return EarliestDateDocument.EarliestDate.Factory.newInstance();
    }

    @Provides
    @Override
    public LatestDateDocument createMuseumDatLatestDateDocument() {
        return LatestDateDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LatestDate createMuseumDatLatestDate() {
        return LatestDateDocument.LatestDate.Factory.newInstance();
    }

    @Provides
    @Override
    public MeasurementsSetDocument createMuseumDatMeasurementsSetDocument() {
        return MeasurementsSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MeasurementsSet createMuseumDatMeasurementsSet() {
        return MeasurementsSetDocument.MeasurementsSet.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceMaterialsTechDocument createMuseumDatSourceMaterialsTechDocument() {
        return SourceMaterialsTechDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceMaterialsTech createMuseumDatSourceMaterialsTech() {
        return SourceMaterialsTechDocument.SourceMaterialsTech.Factory.newInstance();
    }

    @Provides
    @Override
    public NationalityActorDocument createMuseumDatNationalityActorDocument() {
        return NationalityActorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public NationalityActor createMuseumDatNationalityActor() {
        return NationalityActorDocument.NationalityActor.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedWorkRelTypeDocument createMuseumDatRelatedWorkRelTypeDocument() {
        return RelatedWorkRelTypeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedWorkRelType createMuseumDatRelatedWorkRelType() {
        return RelatedWorkRelTypeDocument.RelatedWorkRelType.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceWrapDocument createMuseumDatResourceWrapDocument() {
        return ResourceWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceWrap createMuseumDatResourceWrap() {
        return ResourceWrapDocument.ResourceWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceSetDocument createMuseumDatResourceSetDocument() {
        return ResourceSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceSet createMuseumDatResourceSet() {
        return ResourceSetDocument.ResourceSet.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceIDDocument createMuseumDatResourceIDDocument() {
        return ResourceIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceID createMuseumDatResourceID() {
        return ResourceIDDocument.ResourceID.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceRelTypeDocument createMuseumDatResourceRelTypeDocument() {
        return ResourceRelTypeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceRelType createMuseumDatResourceRelType() {
        return ResourceRelTypeDocument.ResourceRelType.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceTypeDocument createMuseumDatResourceTypeDocument() {
        return ResourceTypeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceType createMuseumDatResourceType() {
        return ResourceTypeDocument.ResourceType.Factory.newInstance();
    }

    @Provides
    @Override
    public RightsResourceDocument createMuseumDatRightsResourceDocument() {
        return RightsResourceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RightsResource createMuseumDatRightsResource() {
        return RightsResourceDocument.RightsResource.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceViewDescriptionDocument createMuseumDatResourceViewDescriptionDocument() {
        return ResourceViewDescriptionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceViewDescription createMuseumDatResourceViewDescription() {
        return ResourceViewDescriptionDocument.ResourceViewDescription.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceViewTypeDocument createMuseumDatResourceViewTypeDocument() {
        return ResourceViewTypeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceViewType createMuseumDatResourceViewType() {
        return ResourceViewTypeDocument.ResourceViewType.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceViewSubjectTermDocument createMuseumDatResourceViewSubjectTermDocument() {
        return ResourceViewSubjectTermDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceViewSubjectTerm createMuseumDatResourceViewSubjectTerm() {
        return ResourceViewSubjectTermDocument.ResourceViewSubjectTerm.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceViewDateDocument createMuseumDatResourceViewDateDocument() {
        return ResourceViewDateDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceViewDate createMuseumDatResourceViewDate() {
        return ResourceViewDateDocument.ResourceViewDate.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceSourceDocument createMuseumDatResourceSourceDocument() {
        return ResourceSourceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceSource createMuseumDatResourceSource() {
        return ResourceSourceDocument.ResourceSource.Factory.newInstance();
    }

    @Provides
    @Override
    public LinkRelatedResourceDocument createMuseumDatLinkRelatedResourceDocument() {
        return LinkRelatedResourceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LinkRelatedResource createMuseumDatLinkRelatedResource() {
        return LinkRelatedResourceDocument.LinkRelatedResource.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedResourceRelTypeDocument createMuseumDatRelatedResourceRelTypeDocument() {
        return RelatedResourceRelTypeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedResourceRelType createMuseumDatRelatedResourceRelType() {
        return RelatedResourceRelTypeDocument.RelatedResourceRelType.Factory.newInstance();
    }

    @Provides
    @Override
    public LabelRelatedResourceDocument createMuseumDatLabelRelatedResourceDocument() {
        return LabelRelatedResourceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LabelRelatedResource createMuseumDatLabelRelatedResource() {
        return LabelRelatedResourceDocument.LabelRelatedResource.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceMetadataLocDocument createMuseumDatResourceMetadataLocDocument() {
        return ResourceMetadataLocDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ResourceMetadataLoc createMuseumDatResourceMetadataLoc() {
        return ResourceMetadataLocDocument.ResourceMetadataLoc.Factory.newInstance();
    }

    @Provides
    @Override
    public TermMaterialsTechDocument createMuseumDatTermMaterialsTechDocument() {
        return TermMaterialsTechDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TermMaterialsTech createMuseumDatTermMaterialsTech() {
        return TermMaterialsTechDocument.TermMaterialsTech.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingSubjectSetDocument createMuseumDatIndexingSubjectSetDocument() {
        return IndexingSubjectSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingSubjectSet createMuseumDatIndexingSubjectSet() {
        return IndexingSubjectSetDocument.IndexingSubjectSet.Factory.newInstance();
    }

    @Provides
    @Override
    public ExtentSubjectDocument createMuseumDatExtentSubjectDocument() {
        return ExtentSubjectDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ExtentSubject createMuseumDatExtentSubject() {
        return ExtentSubjectDocument.ExtentSubject.Factory.newInstance();
    }

    @Provides
    @Override
    public SubjectTermDocument createMuseumDatSubjectTermDocument() {
        return SubjectTermDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SubjectTerm createMuseumDatSubjectTerm() {
        return SubjectTermDocument.SubjectTerm.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayCreatorDocument createMuseumDatDisplayCreatorDocument() {
        return DisplayCreatorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayCreator createMuseumDatDisplayCreator() {
        return DisplayCreatorDocument.DisplayCreator.Factory.newInstance();
    }

    @Provides
    @Override
    public ExtentMeasurementsDocument createMuseumDatExtentMeasurementsDocument() {
        return ExtentMeasurementsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ExtentMeasurements createMuseumDatExtentMeasurements() {
        return ExtentMeasurementsDocument.ExtentMeasurements.Factory.newInstance();
    }

    @Provides
    @Override
    public ExtentMaterialsTechDocument createMuseumDatExtentMaterialsTechDocument() {
        return ExtentMaterialsTechDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ExtentMaterialsTech createMuseumDatExtentMaterialsTech() {
        return ExtentMaterialsTechDocument.ExtentMaterialsTech.Factory.newInstance();
    }

    @Provides
    @Override
    public ShapeMeasurementsDocument createMuseumDatShapeMeasurementsDocument() {
        return ShapeMeasurementsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ShapeMeasurements createMuseumDatShapeMeasurements() {
        return ShapeMeasurementsDocument.ShapeMeasurements.Factory.newInstance();
    }

    @Provides
    @Override
    public RepositoryWrapDocument createMuseumDatRepositoryWrapDocument() {
        return RepositoryWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RepositoryWrap createMuseumDatRepositoryWrap() {
        return RepositoryWrapDocument.RepositoryWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public RepositorySetDocument createMuseumDatRepositorySetDocument() {
        return RepositorySetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RepositorySet createMuseumDatRepositorySet() {
        return RepositorySetDocument.RepositorySet.Factory.newInstance();
    }

    @Provides
    @Override
    public RepositoryNameDocument createMuseumDatRepositoryNameDocument() {
        return RepositoryNameDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RepositoryName createMuseumDatRepositoryName() {
        return RepositoryNameDocument.RepositoryName.Factory.newInstance();
    }

    @Provides
    @Override
    public WorkIDDocument createMuseumDatWorkIDDocument() {
        return WorkIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public WorkID createMuseumDatWorkID() {
        return WorkIDDocument.WorkID.Factory.newInstance();
    }

    @Provides
    @Override
    public FormatMeasurementsDocument createMuseumDatFormatMeasurementsDocument() {
        return FormatMeasurementsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public FormatMeasurements createMuseumDatFormatMeasurements() {
        return FormatMeasurementsDocument.FormatMeasurements.Factory.newInstance();
    }

    @Provides
    @Override
    public NameActorDocument createMuseumDatNameActorDocument() {
        return NameActorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public NameActor createMuseumDatNameActor() {
        return NameActorDocument.NameActor.Factory.newInstance();
    }

    @Provides
    @Override
    public StyleWrapDocument createMuseumDatStyleWrapDocument() {
        return StyleWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public StyleWrap createMuseumDatStyleWrap() {
        return StyleWrapDocument.StyleWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public StyleDocument createMuseumDatStyleDocument() {
        return StyleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public Style createMuseumDatStyle() {
        return StyleDocument.Style.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingMaterialsTechWrapDocument createMuseumDatIndexingMaterialsTechWrapDocument() {
        return IndexingMaterialsTechWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingMaterialsTechWrap createMuseumDatIndexingMaterialsTechWrap() {
        return IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingMaterialsTechSetDocument createMuseumDatIndexingMaterialsTechSetDocument() {
        return IndexingMaterialsTechSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingMaterialsTechSet createMuseumDatIndexingMaterialsTechSet() {
        return IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet.Factory.newInstance();
    }

    @Provides
    @Override
    public LocRelatedWorkDocument createMuseumDatLocRelatedWorkDocument() {
        return LocRelatedWorkDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LocRelatedWork createMuseumDatLocRelatedWork() {
        return LocRelatedWorkDocument.LocRelatedWork.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayEventWrapDocument createMuseumDatDisplayEventWrapDocument() {
        return DisplayEventWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayEventWrap createMuseumDatDisplayEventWrap() {
        return DisplayEventWrapDocument.DisplayEventWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayEventDocument createMuseumDatDisplayEventDocument() {
        return DisplayEventDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayEvent createMuseumDatDisplayEvent() {
        return DisplayEventDocument.DisplayEvent.Factory.newInstance();
    }

    @Provides
    @Override
    public CultureDocument createMuseumDatCultureDocument() {
        return CultureDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public Culture createMuseumDatCulture() {
        return CultureDocument.Culture.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordRelIDDocument createMuseumDatRecordRelIDDocument() {
        return RecordRelIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordRelID createMuseumDatRecordRelID() {
        return RecordRelIDDocument.RecordRelID.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectClassificationWrapDocument createMuseumDatObjectClassificationWrapDocument() {
        return ObjectClassificationWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectClassificationWrap createMuseumDatObjectClassificationWrap() {
        return ObjectClassificationWrapDocument.ObjectClassificationWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectWorkTypeWrapDocument createMuseumDatObjectWorkTypeWrapDocument() {
        return ObjectWorkTypeWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ObjectWorkTypeWrap createMuseumDatObjectWorkTypeWrap() {
        return ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public ClassificationWrapDocument createMuseumDatClassificationWrapDocument() {
        return ClassificationWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ClassificationWrap createMuseumDatClassificationWrap() {
        return ClassificationWrapDocument.ClassificationWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public ClassificationDocument createMuseumDatClassificationDocument() {
        return ClassificationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public Classification createMuseumDatClassification() {
        return ClassificationDocument.Classification.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptiveNoteWrapDocument createMuseumDatDescriptiveNoteWrapDocument() {
        return DescriptiveNoteWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptiveNoteWrap createMuseumDatDescriptiveNoteWrap() {
        return DescriptiveNoteWrapDocument.DescriptiveNoteWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptiveNoteSetDocument createMuseumDatDescriptiveNoteSetDocument() {
        return DescriptiveNoteSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptiveNoteSet createMuseumDatDescriptiveNoteSet() {
        return DescriptiveNoteSetDocument.DescriptiveNoteSet.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptiveNoteDocument createMuseumDatDescriptiveNoteDocument() {
        return DescriptiveNoteDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptiveNote createMuseumDatDescriptiveNote() {
        return DescriptiveNoteDocument.DescriptiveNote.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceDescriptiveNoteDocument createMuseumDatSourceDescriptiveNoteDocument() {
        return SourceDescriptiveNoteDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceDescriptiveNote createMuseumDatSourceDescriptiveNote() {
        return SourceDescriptiveNoteDocument.SourceDescriptiveNote.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingMeasurementsWrapDocument createMuseumDatIndexingMeasurementsWrapDocument() {
        return IndexingMeasurementsWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingMeasurementsWrap createMuseumDatIndexingMeasurementsWrap() {
        return IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingMeasurementsSetDocument createMuseumDatIndexingMeasurementsSetDocument() {
        return IndexingMeasurementsSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingMeasurementsSet createMuseumDatIndexingMeasurementsSet() {
        return IndexingMeasurementsSetDocument.IndexingMeasurementsSet.Factory.newInstance();
    }

    @Provides
    @Override
    public ScaleMeasurementsDocument createMuseumDatScaleMeasurementsDocument() {
        return ScaleMeasurementsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ScaleMeasurements createMuseumDatScaleMeasurements() {
        return ScaleMeasurementsDocument.ScaleMeasurements.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayMeasurementsDocument createMuseumDatDisplayMeasurementsDocument() {
        return DisplayMeasurementsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayMeasurements createMuseumDatDisplayMeasurements() {
        return DisplayMeasurementsDocument.DisplayMeasurements.Factory.newInstance();
    }

    @Provides
    @Override
    public InscriptionsDocument createMuseumDatInscriptionsDocument() {
        return InscriptionsDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public Inscriptions createMuseumDatInscriptions() {
        return InscriptionsDocument.Inscriptions.Factory.newInstance();
    }

    @Provides
    @Override
    public EventTypeDocument createMuseumDatEventTypeDocument() {
        return EventTypeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EventType createMuseumDatEventType() {
        return EventTypeDocument.EventType.Factory.newInstance();
    }

    @Provides
    @Override
    public RightsWorkDocument createMuseumDatRightsWorkDocument() {
        return RightsWorkDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RightsWork createMuseumDatRightsWork() {
        return RightsWorkDocument.RightsWork.Factory.newInstance();
    }

    @Provides
    @Override
    public TitleDocument createMuseumDatTitleDocument() {
        return TitleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public Title createMuseumDatTitle() {
        return TitleDocument.Title.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordInfoIDDocument createMuseumDatRecordInfoIDDocument() {
        return RecordInfoIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordInfoID createMuseumDatRecordInfoID() {
        return RecordInfoIDDocument.RecordInfoID.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptionWrapDocument createMuseumDatDescriptionWrapDocument() {
        return DescriptionWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptionWrap createMuseumDatDescriptionWrap() {
        return DescriptionWrapDocument.DescriptionWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayCreationDateDocument createMuseumDatDisplayCreationDateDocument() {
        return DisplayCreationDateDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayCreationDate createMuseumDatDisplayCreationDate() {
        return DisplayCreationDateDocument.DisplayCreationDate.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayCreationLocationDocument createMuseumDatDisplayCreationLocationDocument() {
        return DisplayCreationLocationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayCreationLocation createMuseumDatDisplayCreationLocation() {
        return DisplayCreationLocationDocument.DisplayCreationLocation.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayMaterialsTechDocument createMuseumDatDisplayMaterialsTechDocument() {
        return DisplayMaterialsTechDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayMaterialsTech createMuseumDatDisplayMaterialsTech() {
        return DisplayMaterialsTechDocument.DisplayMaterialsTech.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayStateEditionWrapDocument createMuseumDatDisplayStateEditionWrapDocument() {
        return DisplayStateEditionWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayStateEditionWrap createMuseumDatDisplayStateEditionWrap() {
        return DisplayStateEditionWrapDocument.DisplayStateEditionWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayStateDocument createMuseumDatDisplayStateDocument() {
        return DisplayStateDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayState createMuseumDatDisplayState() {
        return DisplayStateDocument.DisplayState.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayEditionDocument createMuseumDatDisplayEditionDocument() {
        return DisplayEditionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DisplayEdition createMuseumDatDisplayEdition() {
        return DisplayEditionDocument.DisplayEdition.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceStateEditionDocument createMuseumDatSourceStateEditionDocument() {
        return SourceStateEditionDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceStateEdition createMuseumDatSourceStateEdition() {
        return SourceStateEditionDocument.SourceStateEdition.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordSourceDocument createMuseumDatRecordSourceDocument() {
        return RecordSourceDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordSource createMuseumDatRecordSource() {
        return RecordSourceDocument.RecordSource.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordIDDocument createMuseumDatRecordIDDocument() {
        return RecordIDDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordID createMuseumDatRecordID() {
        return RecordIDDocument.RecordID.Factory.newInstance();
    }

    @Provides
    @Override
    public RelationWrapDocument createMuseumDatRelationWrapDocument() {
        return RelationWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RelationWrap createMuseumDatRelationWrap() {
        return RelationWrapDocument.RelationWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingSubjectWrapDocument createMuseumDatIndexingSubjectWrapDocument() {
        return IndexingSubjectWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingSubjectWrap createMuseumDatIndexingSubjectWrap() {
        return IndexingSubjectWrapDocument.IndexingSubjectWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedWorksWrapDocument createMuseumDatRelatedWorksWrapDocument() {
        return RelatedWorksWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedWorksWrap createMuseumDatRelatedWorksWrap() {
        return RelatedWorksWrapDocument.RelatedWorksWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedWorkSetDocument createMuseumDatRelatedWorkSetDocument() {
        return RelatedWorkSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RelatedWorkSet createMuseumDatRelatedWorkSet() {
        return RelatedWorkSetDocument.RelatedWorkSet.Factory.newInstance();
    }

    @Provides
    @Override
    public LinkRelatedWorkDocument createMuseumDatLinkRelatedWorkDocument() {
        return LinkRelatedWorkDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LinkRelatedWork createMuseumDatLinkRelatedWork() {
        return LinkRelatedWorkDocument.LinkRelatedWork.Factory.newInstance();
    }

    @Provides
    @Override
    public LabelRelatedWorkDocument createMuseumDatLabelRelatedWorkDocument() {
        return LabelRelatedWorkDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public LabelRelatedWork createMuseumDatLabelRelatedWork() {
        return LabelRelatedWorkDocument.LabelRelatedWork.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingEventSetDocument createMuseumDatIndexingEventSetDocument() {
        return IndexingEventSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingEventSet createMuseumDatIndexingEventSet() {
        return IndexingEventSetDocument.IndexingEventSet.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingActorSetDocument createMuseumDatIndexingActorSetDocument() {
        return IndexingActorSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingActorSet createMuseumDatIndexingActorSet() {
        return IndexingActorSetDocument.IndexingActorSet.Factory.newInstance();
    }

    @Provides
    @Override
    public NameActorSetDocument createMuseumDatNameActorSetDocument() {
        return NameActorSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public NameActorSet createMuseumDatNameActorSet() {
        return NameActorSetDocument.NameActorSet.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceNameActorDocument createMuseumDatSourceNameActorDocument() {
        return SourceNameActorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceNameActor createMuseumDatSourceNameActor() {
        return SourceNameActorDocument.SourceNameActor.Factory.newInstance();
    }

    @Provides
    @Override
    public VitalDatesActorDocument createMuseumDatVitalDatesActorDocument() {
        return VitalDatesActorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public VitalDatesActor createMuseumDatVitalDatesActor() {
        return VitalDatesActorDocument.VitalDatesActor.Factory.newInstance();
    }

    @Provides
    @Override
    public RoleActorDocument createMuseumDatRoleActorDocument() {
        return RoleActorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RoleActor createMuseumDatRoleActor() {
        return RoleActorDocument.RoleActor.Factory.newInstance();
    }

    @Provides
    @Override
    public ExtentActorDocument createMuseumDatExtentActorDocument() {
        return ExtentActorDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public ExtentActor createMuseumDatExtentActor() {
        return ExtentActorDocument.ExtentActor.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingLocationWrapDocument createMuseumDatIndexingLocationWrapDocument() {
        return IndexingLocationWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingLocationWrap createMuseumDatIndexingLocationWrap() {
        return IndexingLocationWrapDocument.IndexingLocationWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingLocationSetDocument createMuseumDatIndexingLocationSetDocument() {
        return IndexingLocationSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingLocationSet createMuseumDatIndexingLocationSet() {
        return IndexingLocationSetDocument.IndexingLocationSet.Factory.newInstance();
    }

    @Provides
    @Override
    public NameLocationSetDocument createMuseumDatNameLocationSetDocument() {
        return NameLocationSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public NameLocationSet createMuseumDatNameLocationSet() {
        return NameLocationSetDocument.NameLocationSet.Factory.newInstance();
    }

    @Provides
    @Override
    public NameLocationDocument createMuseumDatNameLocationDocument() {
        return NameLocationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public NameLocation createMuseumDatNameLocation() {
        return NameLocationDocument.NameLocation.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceNameLocationDocument createMuseumDatSourceNameLocationDocument() {
        return SourceNameLocationDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceNameLocation createMuseumDatSourceNameLocation() {
        return SourceNameLocationDocument.SourceNameLocation.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordInfoSetDocument createMuseumDatRecordInfoSetDocument() {
        return RecordInfoSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordInfoSet createMuseumDatRecordInfoSet() {
        return RecordInfoSetDocument.RecordInfoSet.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordMetadataLocDocument createMuseumDatRecordMetadataLocDocument() {
        return RecordMetadataLocDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordMetadataLoc createMuseumDatRecordMetadataLoc() {
        return RecordMetadataLocDocument.RecordMetadataLoc.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordMetadataDateDocument createMuseumDatRecordMetadataDateDocument() {
        return RecordMetadataDateDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordMetadataDate createMuseumDatRecordMetadataDate() {
        return RecordMetadataDateDocument.RecordMetadataDate.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceTitleDocument createMuseumDatSourceTitleDocument() {
        return SourceTitleDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public SourceTitle createMuseumDatSourceTitle() {
        return SourceTitleDocument.SourceTitle.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingEventWrapDocument createMuseumDatIndexingEventWrapDocument() {
        return IndexingEventWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IndexingEventWrap createMuseumDatIndexingEventWrap() {
        return IndexingEventWrapDocument.IndexingEventWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public TitleSetDocument createMuseumDatTitleSetDocument() {
        return TitleSetDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TitleSet createMuseumDatTitleSet() {
        return TitleSetDocument.TitleSet.Factory.newInstance();
    }

    @Provides
    @Override
    public InscriptionsWrapDocument createMuseumDatInscriptionsWrapDocument() {
        return InscriptionsWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public InscriptionsWrap createMuseumDatInscriptionsWrap() {
        return InscriptionsWrapDocument.InscriptionsWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordTypeDocument createMuseumDatRecordTypeDocument() {
        return RecordTypeDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordType createMuseumDatRecordType() {
        return RecordTypeDocument.RecordType.Factory.newInstance();
    }

    @Provides
    @Override
    public CultureWrapDocument createMuseumDatCultureWrapDocument() {
        return CultureWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public CultureWrap createMuseumDatCultureWrap() {
        return CultureWrapDocument.CultureWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public MuseumdatDocument createMuseumDatMuseumdatDocument() {
        return MuseumdatDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public Museumdat createMuseumDatMuseumdat() {
        return MuseumdatDocument.Museumdat.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptiveMetadataDocument createMuseumDatDescriptiveMetadataDocument() {
        return DescriptiveMetadataDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public DescriptiveMetadata createMuseumDatDescriptiveMetadata() {
        return DescriptiveMetadataDocument.DescriptiveMetadata.Factory.newInstance();
    }

    @Provides
    @Override
    public IdentificationWrapDocument createMuseumDatIdentificationWrapDocument() {
        return IdentificationWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public IdentificationWrap createMuseumDatIdentificationWrap() {
        return IdentificationWrapDocument.IdentificationWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public TitleWrapDocument createMuseumDatTitleWrapDocument() {
        return TitleWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public TitleWrap createMuseumDatTitleWrap() {
        return TitleWrapDocument.TitleWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public EventWrapDocument createMuseumDatEventWrapDocument() {
        return EventWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public EventWrap createMuseumDatEventWrap() {
        return EventWrapDocument.EventWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public AdministrativeMetadataDocument createMuseumDatAdministrativeMetadataDocument() {
        return AdministrativeMetadataDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public AdministrativeMetadata createMuseumDatAdministrativeMetadata() {
        return AdministrativeMetadataDocument.AdministrativeMetadata.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordWrapDocument createMuseumDatRecordWrapDocument() {
        return RecordWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public RecordWrap createMuseumDatRecordWrap() {
        return RecordWrapDocument.RecordWrap.Factory.newInstance();
    }

    @Provides
    @Override
    public MuseumdatWrapDocument createMuseumDatMuseumdatWrapDocument() {
        return MuseumdatWrapDocument.Factory.newInstance();
    }

    @Provides
    @Override
    public MuseumdatWrap createMuseumDatMuseumdatWrap() {
        return MuseumdatWrapDocument.MuseumdatWrap.Factory.newInstance();
    }

}
