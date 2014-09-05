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
package org.moosbusch.museum.inject.museumdat;

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
import org.moosbusch.museum.document.museumdat.MuseumDatXmlDocument;
import org.moosbusch.museum.inject.MuseumXmlModule;
import org.moosbusch.museum.inject.museumdat.impl.DefaultMuseumDatObjectFactory;

/**
 *
 * @author moosbusch
 */
public interface MuseumDatModule extends MuseumXmlModule {

    public String getLanguageEncoding();

    public String getRelatedEncoding();

    public String getEncodingAnalog();

    @Override
    public MuseumDatXmlDocument<? extends DefaultMuseumDatObjectFactory> createDocument();

    public EncodinganalogAttribute createMuseumDatEncodingAnalogAttribute();

    public GeographicalEntityAttribute createMuseumDatGeographicalEntityAttribute();

    public ImportedAttribute createMuseumDatImportedAttribute();

    public LabelAttribute createMuseumDatLabelAttribute();

    public LangAttribute createMuseumDatLangAttribute();

    public LinkschemeAttribute createMuseumDatLinkschemeAttribute();

    public LocIDAttribute createMuseumDatLocIDAttribute();

    public LocIDtypeAttribute createMuseumDatLocIDTypeAttribute();

    public TermsourceAttribute createMuseumDatTermSourceAttribute();

    public TermsourceIDAttribute createMuseumDatTermSourceIDAttribute();

    public PoliticalEntityAttribute createMuseumDatPoliticalEntityAttribute();

    public TypeAttribute createMuseumDatTypeAttribute();

    public PrefAttribute createMuseumDatPrefAttribute();

    public ObjectWorkTypeDocument createMuseumDatObjectWorkTypeDocument();

    public ObjectWorkType createMuseumDatObjectWorkType();

    public RepositoryLocationNameDocument createMuseumDatRepositoryLocationNameDocument();

    public RepositoryLocationName createMuseumDatRepositoryLocationName();

    public LinkResourceDocument createMuseumDatLinkResourceDocument();

    public LinkResource createMuseumDatLinkResource();

    public GenderActorDocument createMuseumDatGenderActorDocument();

    public GenderActor createMuseumDatGenderActor();

    public IndexingDatesDocument createMuseumDatIndexingDatesDocument();

    public IndexingDates createMuseumDatIndexingDates();

    public EarliestDateDocument createMuseumDatEarliestDateDocument();

    public EarliestDate createMuseumDatEarliestDate();

    public LatestDateDocument createMuseumDatLatestDateDocument();

    public LatestDate createMuseumDatLatestDate();

    public MeasurementsSetDocument createMuseumDatMeasurementsSetDocument();

    public MeasurementsSet createMuseumDatMeasurementsSet();

    public SourceMaterialsTechDocument createMuseumDatSourceMaterialsTechDocument();

    public SourceMaterialsTech createMuseumDatSourceMaterialsTech();

    public NationalityActorDocument createMuseumDatNationalityActorDocument();

    public NationalityActor createMuseumDatNationalityActor();

    public RelatedWorkRelTypeDocument createMuseumDatRelatedWorkRelTypeDocument();

    public RelatedWorkRelType createMuseumDatRelatedWorkRelType();

    public ResourceWrapDocument createMuseumDatResourceWrapDocument();

    public ResourceWrap createMuseumDatResourceWrap();

    public ResourceSetDocument createMuseumDatResourceSetDocument();

    public ResourceSet createMuseumDatResourceSet();

    public ResourceIDDocument createMuseumDatResourceIDDocument();

    public ResourceID createMuseumDatResourceID();

    public ResourceRelTypeDocument createMuseumDatResourceRelTypeDocument();

    public ResourceRelType createMuseumDatResourceRelType();

    public ResourceTypeDocument createMuseumDatResourceTypeDocument();

    public ResourceType createMuseumDatResourceType();

    public RightsResourceDocument createMuseumDatRightsResourceDocument();

    public RightsResource createMuseumDatRightsResource();

    public ResourceViewDescriptionDocument createMuseumDatResourceViewDescriptionDocument();

    public ResourceViewDescription createMuseumDatResourceViewDescription();

    public ResourceViewTypeDocument createMuseumDatResourceViewTypeDocument();

    public ResourceViewType createMuseumDatResourceViewType();

    public ResourceViewSubjectTermDocument createMuseumDatResourceViewSubjectTermDocument();

    public ResourceViewSubjectTerm createMuseumDatResourceViewSubjectTerm();

    public ResourceViewDateDocument createMuseumDatResourceViewDateDocument();

    public ResourceViewDate createMuseumDatResourceViewDate();

    public ResourceSourceDocument createMuseumDatResourceSourceDocument();

    public ResourceSource createMuseumDatResourceSource();

    public LinkRelatedResourceDocument createMuseumDatLinkRelatedResourceDocument();

    public LinkRelatedResource createMuseumDatLinkRelatedResource();

    public RelatedResourceRelTypeDocument createMuseumDatRelatedResourceRelTypeDocument();

    public RelatedResourceRelType createMuseumDatRelatedResourceRelType();

    public LabelRelatedResourceDocument createMuseumDatLabelRelatedResourceDocument();

    public LabelRelatedResource createMuseumDatLabelRelatedResource();

    public ResourceMetadataLocDocument createMuseumDatResourceMetadataLocDocument();

    public ResourceMetadataLoc createMuseumDatResourceMetadataLoc();

    public TermMaterialsTechDocument createMuseumDatTermMaterialsTechDocument();

    public TermMaterialsTech createMuseumDatTermMaterialsTech();

    public IndexingSubjectSetDocument createMuseumDatIndexingSubjectSetDocument();

    public IndexingSubjectSet createMuseumDatIndexingSubjectSet();

    public ExtentSubjectDocument createMuseumDatExtentSubjectDocument();

    public ExtentSubject createMuseumDatExtentSubject();

    public SubjectTermDocument createMuseumDatSubjectTermDocument();

    public SubjectTerm createMuseumDatSubjectTerm();

    public DisplayCreatorDocument createMuseumDatDisplayCreatorDocument();

    public DisplayCreator createMuseumDatDisplayCreator();

    public ExtentMeasurementsDocument createMuseumDatExtentMeasurementsDocument();

    public ExtentMeasurements createMuseumDatExtentMeasurements();

    public ExtentMaterialsTechDocument createMuseumDatExtentMaterialsTechDocument();

    public ExtentMaterialsTech createMuseumDatExtentMaterialsTech();

    public ShapeMeasurementsDocument createMuseumDatShapeMeasurementsDocument();

    public ShapeMeasurements createMuseumDatShapeMeasurements();

    public RepositoryWrapDocument createMuseumDatRepositoryWrapDocument();

    public RepositoryWrap createMuseumDatRepositoryWrap();

    public RepositorySetDocument createMuseumDatRepositorySetDocument();

    public RepositorySet createMuseumDatRepositorySet();

    public RepositoryNameDocument createMuseumDatRepositoryNameDocument();

    public RepositoryName createMuseumDatRepositoryName();

    public WorkIDDocument createMuseumDatWorkIDDocument();

    public WorkID createMuseumDatWorkID();

    public FormatMeasurementsDocument createMuseumDatFormatMeasurementsDocument();

    public FormatMeasurements createMuseumDatFormatMeasurements();

    public NameActorDocument createMuseumDatNameActorDocument();

    public NameActor createMuseumDatNameActor();

    public StyleWrapDocument createMuseumDatStyleWrapDocument();

    public StyleWrap createMuseumDatStyleWrap();

    public StyleDocument createMuseumDatStyleDocument();

    public Style createMuseumDatStyle();

    public IndexingMaterialsTechWrapDocument createMuseumDatIndexingMaterialsTechWrapDocument();

    public IndexingMaterialsTechWrap createMuseumDatIndexingMaterialsTechWrap();

    public IndexingMaterialsTechSetDocument createMuseumDatIndexingMaterialsTechSetDocument();

    public IndexingMaterialsTechSet createMuseumDatIndexingMaterialsTechSet();

    public LocRelatedWorkDocument createMuseumDatLocRelatedWorkDocument();

    public LocRelatedWork createMuseumDatLocRelatedWork();

    public DisplayEventWrapDocument createMuseumDatDisplayEventWrapDocument();

    public DisplayEventWrap createMuseumDatDisplayEventWrap();

    public DisplayEventDocument createMuseumDatDisplayEventDocument();

    public DisplayEvent createMuseumDatDisplayEvent();

    public CultureDocument createMuseumDatCultureDocument();

    public Culture createMuseumDatCulture();

    public RecordRelIDDocument createMuseumDatRecordRelIDDocument();

    public RecordRelID createMuseumDatRecordRelID();

    public ObjectClassificationWrapDocument createMuseumDatObjectClassificationWrapDocument();

    public ObjectClassificationWrap createMuseumDatObjectClassificationWrap();

    public ObjectWorkTypeWrapDocument createMuseumDatObjectWorkTypeWrapDocument();

    public ObjectWorkTypeWrap createMuseumDatObjectWorkTypeWrap();

    public ClassificationWrapDocument createMuseumDatClassificationWrapDocument();

    public ClassificationWrap createMuseumDatClassificationWrap();

    public ClassificationDocument createMuseumDatClassificationDocument();

    public Classification createMuseumDatClassification();

    public DescriptiveNoteWrapDocument createMuseumDatDescriptiveNoteWrapDocument();

    public DescriptiveNoteWrap createMuseumDatDescriptiveNoteWrap();

    public DescriptiveNoteSetDocument createMuseumDatDescriptiveNoteSetDocument();

    public DescriptiveNoteSet createMuseumDatDescriptiveNoteSet();

    public DescriptiveNoteDocument createMuseumDatDescriptiveNoteDocument();

    public DescriptiveNote createMuseumDatDescriptiveNote();

    public SourceDescriptiveNoteDocument createMuseumDatSourceDescriptiveNoteDocument();

    public SourceDescriptiveNote createMuseumDatSourceDescriptiveNote();

    public IndexingMeasurementsWrapDocument createMuseumDatIndexingMeasurementsWrapDocument();

    public IndexingMeasurementsWrap createMuseumDatIndexingMeasurementsWrap();

    public IndexingMeasurementsSetDocument createMuseumDatIndexingMeasurementsSetDocument();

    public IndexingMeasurementsSet createMuseumDatIndexingMeasurementsSet();

    public ScaleMeasurementsDocument createMuseumDatScaleMeasurementsDocument();

    public ScaleMeasurements createMuseumDatScaleMeasurements();

    public DisplayMeasurementsDocument createMuseumDatDisplayMeasurementsDocument();

    public DisplayMeasurements createMuseumDatDisplayMeasurements();

    public InscriptionsDocument createMuseumDatInscriptionsDocument();

    public Inscriptions createMuseumDatInscriptions();

    public EventTypeDocument createMuseumDatEventTypeDocument();

    public EventType createMuseumDatEventType();

    public RightsWorkDocument createMuseumDatRightsWorkDocument();

    public RightsWork createMuseumDatRightsWork();

    public TitleDocument createMuseumDatTitleDocument();

    public Title createMuseumDatTitle();

    public RecordInfoIDDocument createMuseumDatRecordInfoIDDocument();

    public RecordInfoID createMuseumDatRecordInfoID();

    public DescriptionWrapDocument createMuseumDatDescriptionWrapDocument();

    public DescriptionWrap createMuseumDatDescriptionWrap();

    public DisplayCreationDateDocument createMuseumDatDisplayCreationDateDocument();

    public DisplayCreationDate createMuseumDatDisplayCreationDate();

    public DisplayCreationLocationDocument createMuseumDatDisplayCreationLocationDocument();

    public DisplayCreationLocation createMuseumDatDisplayCreationLocation();

    public DisplayMaterialsTechDocument createMuseumDatDisplayMaterialsTechDocument();

    public DisplayMaterialsTech createMuseumDatDisplayMaterialsTech();

    public DisplayStateEditionWrapDocument createMuseumDatDisplayStateEditionWrapDocument();

    public DisplayStateEditionWrap createMuseumDatDisplayStateEditionWrap();

    public DisplayStateDocument createMuseumDatDisplayStateDocument();

    public DisplayState createMuseumDatDisplayState();

    public DisplayEditionDocument createMuseumDatDisplayEditionDocument();

    public DisplayEdition createMuseumDatDisplayEdition();

    public SourceStateEditionDocument createMuseumDatSourceStateEditionDocument();

    public SourceStateEdition createMuseumDatSourceStateEdition();

    public RecordSourceDocument createMuseumDatRecordSourceDocument();

    public RecordSource createMuseumDatRecordSource();

    public RecordIDDocument createMuseumDatRecordIDDocument();

    public RecordID createMuseumDatRecordID();

    public RelationWrapDocument createMuseumDatRelationWrapDocument();

    public RelationWrap createMuseumDatRelationWrap();

    public IndexingSubjectWrapDocument createMuseumDatIndexingSubjectWrapDocument();

    public IndexingSubjectWrap createMuseumDatIndexingSubjectWrap();

    public RelatedWorksWrapDocument createMuseumDatRelatedWorksWrapDocument();

    public RelatedWorksWrap createMuseumDatRelatedWorksWrap();

    public RelatedWorkSetDocument createMuseumDatRelatedWorkSetDocument();

    public RelatedWorkSet createMuseumDatRelatedWorkSet();

    public LinkRelatedWorkDocument createMuseumDatLinkRelatedWorkDocument();

    public LinkRelatedWork createMuseumDatLinkRelatedWork();

    public LabelRelatedWorkDocument createMuseumDatLabelRelatedWorkDocument();

    public LabelRelatedWork createMuseumDatLabelRelatedWork();

    public IndexingEventSetDocument createMuseumDatIndexingEventSetDocument();

    public IndexingEventSet createMuseumDatIndexingEventSet();

    public IndexingActorSetDocument createMuseumDatIndexingActorSetDocument();

    public IndexingActorSet createMuseumDatIndexingActorSet();

    public NameActorSetDocument createMuseumDatNameActorSetDocument();

    public NameActorSet createMuseumDatNameActorSet();

    public SourceNameActorDocument createMuseumDatSourceNameActorDocument();

    public SourceNameActor createMuseumDatSourceNameActor();

    public VitalDatesActorDocument createMuseumDatVitalDatesActorDocument();

    public VitalDatesActor createMuseumDatVitalDatesActor();

    public RoleActorDocument createMuseumDatRoleActorDocument();

    public RoleActor createMuseumDatRoleActor();

    public ExtentActorDocument createMuseumDatExtentActorDocument();

    public ExtentActor createMuseumDatExtentActor();

    public IndexingLocationWrapDocument createMuseumDatIndexingLocationWrapDocument();

    public IndexingLocationWrap createMuseumDatIndexingLocationWrap();

    public IndexingLocationSetDocument createMuseumDatIndexingLocationSetDocument();

    public IndexingLocationSet createMuseumDatIndexingLocationSet();

    public NameLocationSetDocument createMuseumDatNameLocationSetDocument();

    public NameLocationSet createMuseumDatNameLocationSet();

    public NameLocationDocument createMuseumDatNameLocationDocument();

    public NameLocation createMuseumDatNameLocation();

    public SourceNameLocationDocument createMuseumDatSourceNameLocationDocument();

    public SourceNameLocation createMuseumDatSourceNameLocation();

    public RecordInfoSetDocument createMuseumDatRecordInfoSetDocument();

    public RecordInfoSet createMuseumDatRecordInfoSet();

    public RecordMetadataLocDocument createMuseumDatRecordMetadataLocDocument();

    public RecordMetadataLoc createMuseumDatRecordMetadataLoc();

    public RecordMetadataDateDocument createMuseumDatRecordMetadataDateDocument();

    public RecordMetadataDate createMuseumDatRecordMetadataDate();

    public SourceTitleDocument createMuseumDatSourceTitleDocument();

    public SourceTitle createMuseumDatSourceTitle();

    public IndexingEventWrapDocument createMuseumDatIndexingEventWrapDocument();

    public IndexingEventWrap createMuseumDatIndexingEventWrap();

    public TitleSetDocument createMuseumDatTitleSetDocument();

    public TitleSet createMuseumDatTitleSet();

    public InscriptionsWrapDocument createMuseumDatInscriptionsWrapDocument();

    public InscriptionsWrap createMuseumDatInscriptionsWrap();

    public RecordTypeDocument createMuseumDatRecordTypeDocument();

    public RecordType createMuseumDatRecordType();

    public CultureWrapDocument createMuseumDatCultureWrapDocument();

    public CultureWrap createMuseumDatCultureWrap();

    public MuseumdatDocument createMuseumDatMuseumdatDocument();

    public Museumdat createMuseumDatMuseumdat();

    public DescriptiveMetadataDocument createMuseumDatDescriptiveMetadataDocument();

    public DescriptiveMetadata createMuseumDatDescriptiveMetadata();

    public IdentificationWrapDocument createMuseumDatIdentificationWrapDocument();

    public IdentificationWrap createMuseumDatIdentificationWrap();

    public TitleWrapDocument createMuseumDatTitleWrapDocument();

    public TitleWrap createMuseumDatTitleWrap();

    public EventWrapDocument createMuseumDatEventWrapDocument();

    public EventWrap createMuseumDatEventWrap();

    public AdministrativeMetadataDocument createMuseumDatAdministrativeMetadataDocument();

    public AdministrativeMetadata createMuseumDatAdministrativeMetadata();

    public RecordWrapDocument createMuseumDatRecordWrapDocument();

    public RecordWrap createMuseumDatRecordWrap();

    public MuseumdatWrapDocument createMuseumDatMuseumdatWrapDocument();

    public MuseumdatWrap createMuseumDatMuseumdatWrap();

}