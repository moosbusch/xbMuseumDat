/*

 *
 */
package org.moosbusch.museum.museumdat.inject;

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
import org.moosbusch.museum.inject.MuseumXmlModule;
import org.moosbusch.museum.museumdat.document.Document;
import org.moosbusch.museum.museumdat.inject.impl.MuseumDatObjectFactory;

/**
 *
 * @author moosbusch
 */
public interface MuseumDatModule extends MuseumXmlModule {

    public String getLanguageEncoding();

    public String getRelatedEncoding();

    public String getEncodingAnalog();

    @Provides
    public Document<? extends MuseumDatObjectFactory> createDocument();

    @Provides
    public EncodinganalogAttribute createEncodingAnalogAttribute();

    @Provides
    public GeographicalEntityAttribute createGeographicalEntityAttribute();

    @Provides
    public ImportedAttribute createImportedAttribute();

    @Provides
    public LabelAttribute createLabelAttribute();

    @Provides
    public LangAttribute createLangAttribute();

    @Provides
    public LinkschemeAttribute createLinkschemeAttribute();

    @Provides
    public LocIDAttribute createLocIDAttribute();

    @Provides
    public LocIDtypeAttribute createLocIDTypeAttribute();

    @Provides
    public TermsourceAttribute createTermSourceAttribute();

    @Provides
    public TermsourceIDAttribute createTermSourceIDAttribute();

    @Provides
    public PoliticalEntityAttribute createPoliticalEntityAttribute();

    @Provides
    public TypeAttribute createTypeAttribute();

    @Provides
    public PrefAttribute createPrefAttribute();

    @Provides
    public ObjectWorkTypeDocument createObjectWorkTypeDocument();

    @Provides
    public ObjectWorkType createObjectWorkType();

    @Provides
    public RepositoryLocationNameDocument createRepositoryLocationNameDocument();

    @Provides
    public RepositoryLocationName createRepositoryLocationName();

    @Provides
    public LinkResourceDocument createLinkResourceDocument();

    @Provides
    public LinkResource createLinkResource();

    @Provides
    public GenderActorDocument createGenderActorDocument();

    @Provides
    public GenderActor createGenderActor();

    @Provides
    public IndexingDatesDocument createIndexingDatesDocument();

    @Provides
    public IndexingDates createIndexingDates();

    @Provides
    public EarliestDateDocument createEarliestDateDocument();

    @Provides
    public EarliestDate createEarliestDate();

    @Provides
    public LatestDateDocument createLatestDateDocument();

    @Provides
    public LatestDate createLatestDate();

    @Provides
    public MeasurementsSetDocument createMeasurementsSetDocument();

    @Provides
    public MeasurementsSet createMeasurementsSet();

    @Provides
    public SourceMaterialsTechDocument createSourceMaterialsTechDocument();

    @Provides
    public SourceMaterialsTech createSourceMaterialsTech();

    @Provides
    public NationalityActorDocument createNationalityActorDocument();

    @Provides
    public NationalityActor createNationalityActor();

    @Provides
    public RelatedWorkRelTypeDocument createRelatedWorkRelTypeDocument();

    @Provides
    public RelatedWorkRelType createRelatedWorkRelType();

    @Provides
    public ResourceWrapDocument createResourceWrapDocument();

    @Provides
    public ResourceWrap createResourceWrap();

    @Provides
    public ResourceSetDocument createResourceSetDocument();

    @Provides
    public ResourceSet createResourceSet();

    @Provides
    public ResourceIDDocument createResourceIDDocument();

    @Provides
    public ResourceID createResourceID();

    @Provides
    public ResourceRelTypeDocument createResourceRelTypeDocument();

    @Provides
    public ResourceRelType createResourceRelType();

    @Provides
    public ResourceTypeDocument createResourceTypeDocument();

    @Provides
    public ResourceType createResourceType();

    @Provides
    public RightsResourceDocument createRightsResourceDocument();

    @Provides
    public RightsResource createRightsResource();

    @Provides
    public ResourceViewDescriptionDocument createResourceViewDescriptionDocument();

    @Provides
    public ResourceViewDescription createResourceViewDescription();

    @Provides
    public ResourceViewTypeDocument createResourceViewTypeDocument();

    @Provides
    public ResourceViewType createResourceViewType();

    @Provides
    public ResourceViewSubjectTermDocument createResourceViewSubjectTermDocument();

    @Provides
    public ResourceViewSubjectTerm createResourceViewSubjectTerm();

    @Provides
    public ResourceViewDateDocument createResourceViewDateDocument();

    @Provides
    public ResourceViewDate createResourceViewDate();

    @Provides
    public ResourceSourceDocument createResourceSourceDocument();

    @Provides
    public ResourceSource createResourceSource();

    @Provides
    public LinkRelatedResourceDocument createLinkRelatedResourceDocument();

    @Provides
    public LinkRelatedResource createLinkRelatedResource();

    @Provides
    public RelatedResourceRelTypeDocument createRelatedResourceRelTypeDocument();

    @Provides
    public RelatedResourceRelType createRelatedResourceRelType();

    @Provides
    public LabelRelatedResourceDocument createLabelRelatedResourceDocument();

    @Provides
    public LabelRelatedResource createLabelRelatedResource();

    @Provides
    public ResourceMetadataLocDocument createResourceMetadataLocDocument();

    @Provides
    public ResourceMetadataLoc createResourceMetadataLoc();

    @Provides
    public TermMaterialsTechDocument createTermMaterialsTechDocument();

    @Provides
    public TermMaterialsTech createTermMaterialsTech();

    @Provides
    public IndexingSubjectSetDocument createIndexingSubjectSetDocument();

    @Provides
    public IndexingSubjectSet createIndexingSubjectSet();

    @Provides
    public ExtentSubjectDocument createExtentSubjectDocument();

    @Provides
    public ExtentSubject createExtentSubject();

    @Provides
    public SubjectTermDocument createSubjectTermDocument();

    @Provides
    public SubjectTerm createSubjectTerm();

    @Provides
    public DisplayCreatorDocument createDisplayCreatorDocument();

    @Provides
    public DisplayCreator createDisplayCreator();

    @Provides
    public ExtentMeasurementsDocument createExtentMeasurementsDocument();

    @Provides
    public ExtentMeasurements createExtentMeasurements();

    @Provides
    public ExtentMaterialsTechDocument createExtentMaterialsTechDocument();

    @Provides
    public ExtentMaterialsTech createExtentMaterialsTech();

    @Provides
    public ShapeMeasurementsDocument createShapeMeasurementsDocument();

    @Provides
    public ShapeMeasurements createShapeMeasurements();

    @Provides
    public RepositoryWrapDocument createRepositoryWrapDocument();

    @Provides
    public RepositoryWrap createRepositoryWrap();

    @Provides
    public RepositorySetDocument createRepositorySetDocument();

    @Provides
    public RepositorySet createRepositorySet();

    @Provides
    public RepositoryNameDocument createRepositoryNameDocument();

    @Provides
    public RepositoryName createRepositoryName();

    @Provides
    public WorkIDDocument createWorkIDDocument();

    @Provides
    public WorkID createWorkID();

    @Provides
    public FormatMeasurementsDocument createFormatMeasurementsDocument();

    @Provides
    public FormatMeasurements createFormatMeasurements();

    @Provides
    public NameActorDocument createNameActorDocument();

    @Provides
    public NameActor createNameActor();

    @Provides
    public StyleWrapDocument createStyleWrapDocument();

    @Provides
    public StyleWrap createStyleWrap();

    @Provides
    public StyleDocument createStyleDocument();

    @Provides
    public Style createStyle();

    @Provides
    public IndexingMaterialsTechWrapDocument createIndexingMaterialsTechWrapDocument();

    @Provides
    public IndexingMaterialsTechWrap createIndexingMaterialsTechWrap();

    @Provides
    public IndexingMaterialsTechSetDocument createIndexingMaterialsTechSetDocument();

    @Provides
    public IndexingMaterialsTechSet createIndexingMaterialsTechSet();

    @Provides
    public LocRelatedWorkDocument createLocRelatedWorkDocument();

    @Provides
    public LocRelatedWork createLocRelatedWork();

    @Provides
    public DisplayEventWrapDocument createDisplayEventWrapDocument();

    @Provides
    public DisplayEventWrap createDisplayEventWrap();

    @Provides
    public DisplayEventDocument createDisplayEventDocument();

    @Provides
    public DisplayEvent createDisplayEvent();

    @Provides
    public CultureDocument createCultureDocument();

    @Provides
    public Culture createCulture();

    @Provides
    public RecordRelIDDocument createRecordRelIDDocument();

    @Provides
    public RecordRelID createRecordRelID();

    @Provides
    public ObjectClassificationWrapDocument createObjectClassificationWrapDocument();

    @Provides
    public ObjectClassificationWrap createObjectClassificationWrap();

    @Provides
    public ObjectWorkTypeWrapDocument createObjectWorkTypeWrapDocument();

    @Provides
    public ObjectWorkTypeWrap createObjectWorkTypeWrap();

    @Provides
    public ClassificationWrapDocument createClassificationWrapDocument();

    @Provides
    public ClassificationWrap createClassificationWrap();

    @Provides
    public ClassificationDocument createClassificationDocument();

    @Provides
    public Classification createClassification();

    @Provides
    public DescriptiveNoteWrapDocument createDescriptiveNoteWrapDocument();

    @Provides
    public DescriptiveNoteWrap createDescriptiveNoteWrap();

    @Provides
    public DescriptiveNoteSetDocument createDescriptiveNoteSetDocument();

    @Provides
    public DescriptiveNoteSet createDescriptiveNoteSet();

    @Provides
    public DescriptiveNoteDocument createDescriptiveNoteDocument();

    @Provides
    public DescriptiveNote createDescriptiveNote();

    @Provides
    public SourceDescriptiveNoteDocument createSourceDescriptiveNoteDocument();

    @Provides
    public SourceDescriptiveNote createSourceDescriptiveNote();

    @Provides
    public IndexingMeasurementsWrapDocument createIndexingMeasurementsWrapDocument();

    @Provides
    public IndexingMeasurementsWrap createIndexingMeasurementsWrap();

    @Provides
    public IndexingMeasurementsSetDocument createIndexingMeasurementsSetDocument();

    @Provides
    public IndexingMeasurementsSet createIndexingMeasurementsSet();

    @Provides
    public ScaleMeasurementsDocument createScaleMeasurementsDocument();

    @Provides
    public ScaleMeasurements createScaleMeasurements();

    @Provides
    public DisplayMeasurementsDocument createDisplayMeasurementsDocument();

    @Provides
    public DisplayMeasurements createDisplayMeasurements();

    @Provides
    public InscriptionsDocument createInscriptionsDocument();

    @Provides
    public Inscriptions createInscriptions();

    @Provides
    public EventTypeDocument createEventTypeDocument();

    @Provides
    public EventType createEventType();

    @Provides
    public RightsWorkDocument createRightsWorkDocument();

    @Provides
    public RightsWork createRightsWork();

    @Provides
    public TitleDocument createTitleDocument();

    @Provides
    public Title createTitle();

    @Provides
    public RecordInfoIDDocument createRecordInfoIDDocument();

    @Provides
    public RecordInfoID createRecordInfoID();

    @Provides
    public DescriptionWrapDocument createDescriptionWrapDocument();

    @Provides
    public DescriptionWrap createDescriptionWrap();

    @Provides
    public DisplayCreationDateDocument createDisplayCreationDateDocument();

    @Provides
    public DisplayCreationDate createDisplayCreationDate();

    @Provides
    public DisplayCreationLocationDocument createDisplayCreationLocationDocument();

    @Provides
    public DisplayCreationLocation createDisplayCreationLocation();

    @Provides
    public DisplayMaterialsTechDocument createDisplayMaterialsTechDocument();

    @Provides
    public DisplayMaterialsTech createDisplayMaterialsTech();

    @Provides
    public DisplayStateEditionWrapDocument createDisplayStateEditionWrapDocument();

    @Provides
    public DisplayStateEditionWrap createDisplayStateEditionWrap();

    @Provides
    public DisplayStateDocument createDisplayStateDocument();

    @Provides
    public DisplayState createDisplayState();

    @Provides
    public DisplayEditionDocument createDisplayEditionDocument();

    @Provides
    public DisplayEdition createDisplayEdition();

    @Provides
    public SourceStateEditionDocument createSourceStateEditionDocument();

    @Provides
    public SourceStateEdition createSourceStateEdition();

    @Provides
    public RecordSourceDocument createRecordSourceDocument();

    @Provides
    public RecordSource createRecordSource();

    @Provides
    public RecordIDDocument createRecordIDDocument();

    @Provides
    public RecordID createRecordID();

    @Provides
    public RelationWrapDocument createRelationWrapDocument();

    @Provides
    public RelationWrap createRelationWrap();

    @Provides
    public IndexingSubjectWrapDocument createIndexingSubjectWrapDocument();

    @Provides
    public IndexingSubjectWrap createIndexingSubjectWrap();

    @Provides
    public RelatedWorksWrapDocument createRelatedWorksWrapDocument();

    @Provides
    public RelatedWorksWrap createRelatedWorksWrap();

    @Provides
    public RelatedWorkSetDocument createRelatedWorkSetDocument();

    @Provides
    public RelatedWorkSet createRelatedWorkSet();

    @Provides
    public LinkRelatedWorkDocument createLinkRelatedWorkDocument();

    @Provides
    public LinkRelatedWork createLinkRelatedWork();

    @Provides
    public LabelRelatedWorkDocument createLabelRelatedWorkDocument();

    @Provides
    public LabelRelatedWork createLabelRelatedWork();

    @Provides
    public IndexingEventSetDocument createIndexingEventSetDocument();

    @Provides
    public IndexingEventSet createIndexingEventSet();

    @Provides
    public IndexingActorSetDocument createIndexingActorSetDocument();

    @Provides
    public IndexingActorSet createIndexingActorSet();

    @Provides
    public NameActorSetDocument createNameActorSetDocument();

    @Provides
    public NameActorSet createNameActorSet();

    @Provides
    public SourceNameActorDocument createSourceNameActorDocument();

    @Provides
    public SourceNameActor createSourceNameActor();

    @Provides
    public VitalDatesActorDocument createVitalDatesActorDocument();

    @Provides
    public VitalDatesActor createVitalDatesActor();

    @Provides
    public RoleActorDocument createRoleActorDocument();

    @Provides
    public RoleActor createRoleActor();

    @Provides
    public ExtentActorDocument createExtentActorDocument();

    @Provides
    public ExtentActor createExtentActor();

    @Provides
    public IndexingLocationWrapDocument createIndexingLocationWrapDocument();

    @Provides
    public IndexingLocationWrap createIndexingLocationWrap();

    @Provides
    public IndexingLocationSetDocument createIndexingLocationSetDocument();

    @Provides
    public IndexingLocationSet createIndexingLocationSet();

    @Provides
    public NameLocationSetDocument createNameLocationSetDocument();

    @Provides
    public NameLocationSet createNameLocationSet();

    @Provides
    public NameLocationDocument createNameLocationDocument();

    @Provides
    public NameLocation createNameLocation();

    @Provides
    public SourceNameLocationDocument createSourceNameLocationDocument();

    @Provides
    public SourceNameLocation createSourceNameLocation();

    @Provides
    public RecordInfoSetDocument createRecordInfoSetDocument();

    @Provides
    public RecordInfoSet createRecordInfoSet();

    @Provides
    public RecordMetadataLocDocument createRecordMetadataLocDocument();

    @Provides
    public RecordMetadataLoc createRecordMetadataLoc();

    @Provides
    public RecordMetadataDateDocument createRecordMetadataDateDocument();

    @Provides
    public RecordMetadataDate createRecordMetadataDate();

    @Provides
    public SourceTitleDocument createSourceTitleDocument();

    @Provides
    public SourceTitle createSourceTitle();

    @Provides
    public IndexingEventWrapDocument createIndexingEventWrapDocument();

    @Provides
    public IndexingEventWrap createIndexingEventWrap();

    @Provides
    public TitleSetDocument createTitleSetDocument();

    @Provides
    public TitleSet createTitleSet();

    @Provides
    public InscriptionsWrapDocument createInscriptionsWrapDocument();

    @Provides
    public InscriptionsWrap createInscriptionsWrap();

    @Provides
    public RecordTypeDocument createRecordTypeDocument();

    @Provides
    public RecordType createRecordType();

    @Provides
    public CultureWrapDocument createCultureWrapDocument();

    @Provides
    public CultureWrap createCultureWrap();

    @Provides
    public MuseumdatDocument createMuseumdatDocument();

    @Provides
    public Museumdat createMuseumdat();

    @Provides
    public DescriptiveMetadataDocument createDescriptiveMetadataDocument();

    @Provides
    public DescriptiveMetadata createDescriptiveMetadata();

    @Provides
    public IdentificationWrapDocument createIdentificationWrapDocument();

    @Provides
    public IdentificationWrap createIdentificationWrap();

    @Provides
    public TitleWrapDocument createTitleWrapDocument();

    @Provides
    public TitleWrap createTitleWrap();

    @Provides
    public EventWrapDocument createEventWrapDocument();

    @Provides
    public EventWrap createEventWrap();

    @Provides
    public AdministrativeMetadataDocument createAdministrativeMetadataDocument();

    @Provides
    public AdministrativeMetadata createAdministrativeMetadata();

    @Provides
    public RecordWrapDocument createRecordWrapDocument();

    @Provides
    public RecordWrap createRecordWrap();

    @Provides
    public MuseumdatWrapDocument createMuseumdatWrapDocument();

    @Provides
    public MuseumdatWrap createMuseumdatWrap();

}