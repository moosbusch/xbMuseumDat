/*

 *
 */
package org.moosbusch.museum.museumdat.inject.impl;

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
import org.moosbusch.museum.document.XmlDocument;
import org.moosbusch.museum.inject.annotation.Language;
import org.moosbusch.museum.museumdat.document.Document;
import org.moosbusch.museum.museumdat.document.impl.DocumentImpl;
import org.moosbusch.museum.museumdat.inject.annotation.EncodingAnalog;
import org.moosbusch.museum.museumdat.inject.annotation.LanguageEncoding;
import org.moosbusch.museum.inject.annotation.RelatedEncoding;
import org.moosbusch.museum.museumdat.inject.spi.AbstractMuseumDatModule;

/**
 *
 * @author moosbusch
 */
public class MuseumDatModuleImpl extends AbstractMuseumDatModule {

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
    public Document<? extends MuseumDatObjectFactory> createDocument() {
        return new DocumentImpl();
    }

    @Override
    protected String createRelatedEncoding() {
        return XmlDocument.DEFAULT_RELATED_ENCODING;
    }

    @Override
    protected String createLanguageEncoding() {
        return Document.DEFAULT_LANGUAGE_ENCODING;
    }

    @Override
    protected String createEncodingAnalog() {
        return Document.DEFAULT_ENCODING_ANALOG;
    }

    @Provides
    @Override
    public EncodinganalogAttribute createEncodingAnalogAttribute() {
        EncodinganalogAttribute result = EncodinganalogAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public GeographicalEntityAttribute createGeographicalEntityAttribute() {
        GeographicalEntityAttribute result = GeographicalEntityAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ImportedAttribute createImportedAttribute() {
        ImportedAttribute result = ImportedAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LabelAttribute createLabelAttribute() {
        LabelAttribute result = LabelAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LangAttribute createLangAttribute() {
        LangAttribute result = LangAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LinkschemeAttribute createLinkschemeAttribute() {
        LinkschemeAttribute result = LinkschemeAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LocIDAttribute createLocIDAttribute() {
        LocIDAttribute result = LocIDAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LocIDtypeAttribute createLocIDTypeAttribute() {
        LocIDtypeAttribute result = LocIDtypeAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public TermsourceAttribute createTermSourceAttribute() {
        TermsourceAttribute result = TermsourceAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public TermsourceIDAttribute createTermSourceIDAttribute() {
        TermsourceIDAttribute result = TermsourceIDAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public PoliticalEntityAttribute createPoliticalEntityAttribute() {
        PoliticalEntityAttribute result = PoliticalEntityAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public TypeAttribute createTypeAttribute() {
        TypeAttribute result = TypeAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public PrefAttribute createPrefAttribute() {
        PrefAttribute result = PrefAttribute.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ObjectWorkTypeDocument createObjectWorkTypeDocument() {
        ObjectWorkTypeDocument result = ObjectWorkTypeDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ObjectWorkType createObjectWorkType() {
        ObjectWorkType result = ObjectWorkTypeDocument.ObjectWorkType.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public RepositoryLocationNameDocument createRepositoryLocationNameDocument() {
        RepositoryLocationNameDocument result = RepositoryLocationNameDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public RepositoryLocationName createRepositoryLocationName() {
        RepositoryLocationName result = RepositoryLocationNameDocument.RepositoryLocationName.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LinkResourceDocument createLinkResourceDocument() {
        LinkResourceDocument result = LinkResourceDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LinkResource createLinkResource() {
        LinkResource result = LinkResourceDocument.LinkResource.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public GenderActorDocument createGenderActorDocument() {
        GenderActorDocument result = GenderActorDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public GenderActor createGenderActor() {
        GenderActor result = GenderActorDocument.GenderActor.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public IndexingDatesDocument createIndexingDatesDocument() {
        IndexingDatesDocument result = IndexingDatesDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public IndexingDates createIndexingDates() {
        IndexingDates result = IndexingDatesDocument.IndexingDates.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public EarliestDateDocument createEarliestDateDocument() {
        EarliestDateDocument result = EarliestDateDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public EarliestDate createEarliestDate() {
        EarliestDate result = EarliestDateDocument.EarliestDate.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LatestDateDocument createLatestDateDocument() {
        LatestDateDocument result = LatestDateDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public LatestDate createLatestDate() {
        LatestDate result = LatestDateDocument.LatestDate.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public MeasurementsSetDocument createMeasurementsSetDocument() {
        MeasurementsSetDocument result = MeasurementsSetDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public MeasurementsSet createMeasurementsSet() {
        MeasurementsSet result = MeasurementsSetDocument.MeasurementsSet.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public SourceMaterialsTechDocument createSourceMaterialsTechDocument() {
        SourceMaterialsTechDocument result = SourceMaterialsTechDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public SourceMaterialsTech createSourceMaterialsTech() {
        SourceMaterialsTech result = SourceMaterialsTechDocument.SourceMaterialsTech.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public NationalityActorDocument createNationalityActorDocument() {
        NationalityActorDocument result = NationalityActorDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public NationalityActor createNationalityActor() {
        NationalityActor result = NationalityActorDocument.NationalityActor.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public RelatedWorkRelTypeDocument createRelatedWorkRelTypeDocument() {
        RelatedWorkRelTypeDocument result = RelatedWorkRelTypeDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public RelatedWorkRelType createRelatedWorkRelType() {
        RelatedWorkRelType result = RelatedWorkRelTypeDocument.RelatedWorkRelType.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ResourceWrapDocument createResourceWrapDocument() {
        ResourceWrapDocument result = ResourceWrapDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ResourceWrap createResourceWrap() {
        ResourceWrap result = ResourceWrapDocument.ResourceWrap.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ResourceSetDocument createResourceSetDocument() {
        ResourceSetDocument result = ResourceSetDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ResourceSet createResourceSet() {
        ResourceSet result = ResourceSetDocument.ResourceSet.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ResourceIDDocument createResourceIDDocument() {
        ResourceIDDocument result = ResourceIDDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ResourceID createResourceID() {
        ResourceID result = ResourceIDDocument.ResourceID.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ResourceRelTypeDocument createResourceRelTypeDocument() {
        ResourceRelTypeDocument result = ResourceRelTypeDocument.Factory.newInstance();
        return result;
    }

    @Provides
    @Override
    public ResourceRelType createResourceRelType() {
        ResourceRelType result = ResourceRelTypeDocument.ResourceRelType.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceTypeDocument createResourceTypeDocument() {
        ResourceTypeDocument result = ResourceTypeDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceType createResourceType() {
        ResourceType result = ResourceTypeDocument.ResourceType.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RightsResourceDocument createRightsResourceDocument() {
        RightsResourceDocument result = RightsResourceDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RightsResource createRightsResource() {
        RightsResource result = RightsResourceDocument.RightsResource.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewDescriptionDocument createResourceViewDescriptionDocument() {
        ResourceViewDescriptionDocument result = ResourceViewDescriptionDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewDescription createResourceViewDescription() {
        ResourceViewDescription result = ResourceViewDescriptionDocument.ResourceViewDescription.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewTypeDocument createResourceViewTypeDocument() {
        ResourceViewTypeDocument result = ResourceViewTypeDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewType createResourceViewType() {
        ResourceViewType result = ResourceViewTypeDocument.ResourceViewType.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewSubjectTermDocument createResourceViewSubjectTermDocument() {
        ResourceViewSubjectTermDocument result = ResourceViewSubjectTermDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewSubjectTerm createResourceViewSubjectTerm() {
        ResourceViewSubjectTerm result = ResourceViewSubjectTermDocument.ResourceViewSubjectTerm.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewDateDocument createResourceViewDateDocument() {
        ResourceViewDateDocument result = ResourceViewDateDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceViewDate createResourceViewDate() {
        ResourceViewDate result = ResourceViewDateDocument.ResourceViewDate.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceSourceDocument createResourceSourceDocument() {
        ResourceSourceDocument result = ResourceSourceDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceSource createResourceSource() {
        ResourceSource result = ResourceSourceDocument.ResourceSource.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LinkRelatedResourceDocument createLinkRelatedResourceDocument() {
        LinkRelatedResourceDocument result = LinkRelatedResourceDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LinkRelatedResource createLinkRelatedResource() {
        LinkRelatedResource result = LinkRelatedResourceDocument.LinkRelatedResource.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelatedResourceRelTypeDocument createRelatedResourceRelTypeDocument() {
        RelatedResourceRelTypeDocument result = RelatedResourceRelTypeDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelatedResourceRelType createRelatedResourceRelType() {
        RelatedResourceRelType result = RelatedResourceRelTypeDocument.RelatedResourceRelType.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LabelRelatedResourceDocument createLabelRelatedResourceDocument() {
        LabelRelatedResourceDocument result = LabelRelatedResourceDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LabelRelatedResource createLabelRelatedResource() {
        LabelRelatedResource result = LabelRelatedResourceDocument.LabelRelatedResource.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceMetadataLocDocument createResourceMetadataLocDocument() {
        ResourceMetadataLocDocument result = ResourceMetadataLocDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ResourceMetadataLoc createResourceMetadataLoc() {
        ResourceMetadataLoc result = ResourceMetadataLocDocument.ResourceMetadataLoc.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TermMaterialsTechDocument createTermMaterialsTechDocument() {
        TermMaterialsTechDocument result = TermMaterialsTechDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TermMaterialsTech createTermMaterialsTech() {
        TermMaterialsTech result = TermMaterialsTechDocument.TermMaterialsTech.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingSubjectSetDocument createIndexingSubjectSetDocument() {
        IndexingSubjectSetDocument result = IndexingSubjectSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingSubjectSet createIndexingSubjectSet() {
        IndexingSubjectSet result = IndexingSubjectSetDocument.IndexingSubjectSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentSubjectDocument createExtentSubjectDocument() {
        ExtentSubjectDocument result = ExtentSubjectDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentSubject createExtentSubject() {
        ExtentSubject result = ExtentSubjectDocument.ExtentSubject.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SubjectTermDocument createSubjectTermDocument() {
        SubjectTermDocument result = SubjectTermDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SubjectTerm createSubjectTerm() {
        SubjectTerm result = SubjectTermDocument.SubjectTerm.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayCreatorDocument createDisplayCreatorDocument() {
        DisplayCreatorDocument result = DisplayCreatorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayCreator createDisplayCreator() {
        DisplayCreator result = DisplayCreatorDocument.DisplayCreator.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentMeasurementsDocument createExtentMeasurementsDocument() {
        ExtentMeasurementsDocument result = ExtentMeasurementsDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentMeasurements createExtentMeasurements() {
        ExtentMeasurements result = ExtentMeasurementsDocument.ExtentMeasurements.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentMaterialsTechDocument createExtentMaterialsTechDocument() {
        ExtentMaterialsTechDocument result = ExtentMaterialsTechDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentMaterialsTech createExtentMaterialsTech() {
        ExtentMaterialsTech result = ExtentMaterialsTechDocument.ExtentMaterialsTech.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ShapeMeasurementsDocument createShapeMeasurementsDocument() {
        ShapeMeasurementsDocument result = ShapeMeasurementsDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ShapeMeasurements createShapeMeasurements() {
        ShapeMeasurements result = ShapeMeasurementsDocument.ShapeMeasurements.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RepositoryWrapDocument createRepositoryWrapDocument() {
        RepositoryWrapDocument result = RepositoryWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RepositoryWrap createRepositoryWrap() {
        RepositoryWrap result = RepositoryWrapDocument.RepositoryWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RepositorySetDocument createRepositorySetDocument() {
        RepositorySetDocument result = RepositorySetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RepositorySet createRepositorySet() {
        RepositorySet result = RepositorySetDocument.RepositorySet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RepositoryNameDocument createRepositoryNameDocument() {
        RepositoryNameDocument result = RepositoryNameDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RepositoryName createRepositoryName() {
        RepositoryName result = RepositoryNameDocument.RepositoryName.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public WorkIDDocument createWorkIDDocument() {
        WorkIDDocument result = WorkIDDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public WorkID createWorkID() {
        WorkID result = WorkIDDocument.WorkID.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public FormatMeasurementsDocument createFormatMeasurementsDocument() {
        FormatMeasurementsDocument result = FormatMeasurementsDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public FormatMeasurements createFormatMeasurements() {
        FormatMeasurements result = FormatMeasurementsDocument.FormatMeasurements.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public NameActorDocument createNameActorDocument() {
        NameActorDocument result = NameActorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public NameActor createNameActor() {
        NameActor result = NameActorDocument.NameActor.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public StyleWrapDocument createStyleWrapDocument() {
        StyleWrapDocument result = StyleWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public StyleWrap createStyleWrap() {
        StyleWrap result = StyleWrapDocument.StyleWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public StyleDocument createStyleDocument() {
        StyleDocument result = StyleDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public Style createStyle() {
        Style result = StyleDocument.Style.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMaterialsTechWrapDocument createIndexingMaterialsTechWrapDocument() {
        IndexingMaterialsTechWrapDocument result = IndexingMaterialsTechWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMaterialsTechWrap createIndexingMaterialsTechWrap() {
        IndexingMaterialsTechWrap result = IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMaterialsTechSetDocument createIndexingMaterialsTechSetDocument() {
        IndexingMaterialsTechSetDocument result = IndexingMaterialsTechSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMaterialsTechSet createIndexingMaterialsTechSet() {
        IndexingMaterialsTechSet result = IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LocRelatedWorkDocument createLocRelatedWorkDocument() {
        LocRelatedWorkDocument result = LocRelatedWorkDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LocRelatedWork createLocRelatedWork() {
        LocRelatedWork result = LocRelatedWorkDocument.LocRelatedWork.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayEventWrapDocument createDisplayEventWrapDocument() {
        DisplayEventWrapDocument result = DisplayEventWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayEventWrap createDisplayEventWrap() {
        DisplayEventWrap result = DisplayEventWrapDocument.DisplayEventWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayEventDocument createDisplayEventDocument() {
        DisplayEventDocument result = DisplayEventDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayEvent createDisplayEvent() {
        DisplayEvent result = DisplayEventDocument.DisplayEvent.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public CultureDocument createCultureDocument() {
        CultureDocument result = CultureDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public Culture createCulture() {
        Culture result = CultureDocument.Culture.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordRelIDDocument createRecordRelIDDocument() {
        RecordRelIDDocument result = RecordRelIDDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordRelID createRecordRelID() {
        RecordRelID result = RecordRelIDDocument.RecordRelID.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ObjectClassificationWrapDocument createObjectClassificationWrapDocument() {
        ObjectClassificationWrapDocument result = ObjectClassificationWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ObjectClassificationWrap createObjectClassificationWrap() {
        ObjectClassificationWrap result = ObjectClassificationWrapDocument.ObjectClassificationWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ObjectWorkTypeWrapDocument createObjectWorkTypeWrapDocument() {
        ObjectWorkTypeWrapDocument result = ObjectWorkTypeWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ObjectWorkTypeWrap createObjectWorkTypeWrap() {
        ObjectWorkTypeWrap result = ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ClassificationWrapDocument createClassificationWrapDocument() {
        ClassificationWrapDocument result = ClassificationWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ClassificationWrap createClassificationWrap() {
        ClassificationWrap result = ClassificationWrapDocument.ClassificationWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ClassificationDocument createClassificationDocument() {
        ClassificationDocument result = ClassificationDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public Classification createClassification() {
        Classification result = ClassificationDocument.Classification.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveNoteWrapDocument createDescriptiveNoteWrapDocument() {
        DescriptiveNoteWrapDocument result = DescriptiveNoteWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveNoteWrap createDescriptiveNoteWrap() {
        DescriptiveNoteWrap result = DescriptiveNoteWrapDocument.DescriptiveNoteWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveNoteSetDocument createDescriptiveNoteSetDocument() {
        DescriptiveNoteSetDocument result = DescriptiveNoteSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveNoteSet createDescriptiveNoteSet() {
        DescriptiveNoteSet result = DescriptiveNoteSetDocument.DescriptiveNoteSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveNoteDocument createDescriptiveNoteDocument() {
        DescriptiveNoteDocument result = DescriptiveNoteDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveNote createDescriptiveNote() {
        DescriptiveNote result = DescriptiveNoteDocument.DescriptiveNote.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceDescriptiveNoteDocument createSourceDescriptiveNoteDocument() {
        SourceDescriptiveNoteDocument result = SourceDescriptiveNoteDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceDescriptiveNote createSourceDescriptiveNote() {
        SourceDescriptiveNote result = SourceDescriptiveNoteDocument.SourceDescriptiveNote.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMeasurementsWrapDocument createIndexingMeasurementsWrapDocument() {
        IndexingMeasurementsWrapDocument result = IndexingMeasurementsWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMeasurementsWrap createIndexingMeasurementsWrap() {
        IndexingMeasurementsWrap result = IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMeasurementsSetDocument createIndexingMeasurementsSetDocument() {
        IndexingMeasurementsSetDocument result = IndexingMeasurementsSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingMeasurementsSet createIndexingMeasurementsSet() {
        IndexingMeasurementsSet result = IndexingMeasurementsSetDocument.IndexingMeasurementsSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ScaleMeasurementsDocument createScaleMeasurementsDocument() {
        ScaleMeasurementsDocument result = ScaleMeasurementsDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ScaleMeasurements createScaleMeasurements() {
        ScaleMeasurements result = ScaleMeasurementsDocument.ScaleMeasurements.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayMeasurementsDocument createDisplayMeasurementsDocument() {
        DisplayMeasurementsDocument result = DisplayMeasurementsDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayMeasurements createDisplayMeasurements() {
        DisplayMeasurements result = DisplayMeasurementsDocument.DisplayMeasurements.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public InscriptionsDocument createInscriptionsDocument() {
        InscriptionsDocument result = InscriptionsDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public Inscriptions createInscriptions() {
        Inscriptions result = InscriptionsDocument.Inscriptions.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public EventTypeDocument createEventTypeDocument() {
        EventTypeDocument result = EventTypeDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public EventType createEventType() {
        EventType result = EventTypeDocument.EventType.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RightsWorkDocument createRightsWorkDocument() {
        RightsWorkDocument result = RightsWorkDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RightsWork createRightsWork() {
        RightsWork result = RightsWorkDocument.RightsWork.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TitleDocument createTitleDocument() {
        TitleDocument result = TitleDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public Title createTitle() {
        Title result = TitleDocument.Title.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordInfoIDDocument createRecordInfoIDDocument() {
        RecordInfoIDDocument result = RecordInfoIDDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordInfoID createRecordInfoID() {
        RecordInfoID result = RecordInfoIDDocument.RecordInfoID.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptionWrapDocument createDescriptionWrapDocument() {
        DescriptionWrapDocument result = DescriptionWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptionWrap createDescriptionWrap() {
        DescriptionWrap result = DescriptionWrapDocument.DescriptionWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayCreationDateDocument createDisplayCreationDateDocument() {
        DisplayCreationDateDocument result = DisplayCreationDateDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayCreationDate createDisplayCreationDate() {
        DisplayCreationDate result = DisplayCreationDateDocument.DisplayCreationDate.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayCreationLocationDocument createDisplayCreationLocationDocument() {
        DisplayCreationLocationDocument result = DisplayCreationLocationDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayCreationLocation createDisplayCreationLocation() {
        DisplayCreationLocation result = DisplayCreationLocationDocument.DisplayCreationLocation.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayMaterialsTechDocument createDisplayMaterialsTechDocument() {
        DisplayMaterialsTechDocument result = DisplayMaterialsTechDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayMaterialsTech createDisplayMaterialsTech() {
        DisplayMaterialsTech result = DisplayMaterialsTechDocument.DisplayMaterialsTech.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayStateEditionWrapDocument createDisplayStateEditionWrapDocument() {
        DisplayStateEditionWrapDocument result = DisplayStateEditionWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayStateEditionWrap createDisplayStateEditionWrap() {
        DisplayStateEditionWrap result = DisplayStateEditionWrapDocument.DisplayStateEditionWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayStateDocument createDisplayStateDocument() {
        DisplayStateDocument result = DisplayStateDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayState createDisplayState() {
        DisplayState result = DisplayStateDocument.DisplayState.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayEditionDocument createDisplayEditionDocument() {
        DisplayEditionDocument result = DisplayEditionDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DisplayEdition createDisplayEdition() {
        DisplayEdition result = DisplayEditionDocument.DisplayEdition.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceStateEditionDocument createSourceStateEditionDocument() {
        SourceStateEditionDocument result = SourceStateEditionDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceStateEdition createSourceStateEdition() {
        SourceStateEdition result = SourceStateEditionDocument.SourceStateEdition.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordSourceDocument createRecordSourceDocument() {
        RecordSourceDocument result = RecordSourceDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordSource createRecordSource() {
        RecordSource result = RecordSourceDocument.RecordSource.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordIDDocument createRecordIDDocument() {
        RecordIDDocument result = RecordIDDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordID createRecordID() {
        RecordID result = RecordIDDocument.RecordID.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelationWrapDocument createRelationWrapDocument() {
        RelationWrapDocument result = RelationWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelationWrap createRelationWrap() {
        RelationWrap result = RelationWrapDocument.RelationWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingSubjectWrapDocument createIndexingSubjectWrapDocument() {
        IndexingSubjectWrapDocument result = IndexingSubjectWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingSubjectWrap createIndexingSubjectWrap() {
        IndexingSubjectWrap result = IndexingSubjectWrapDocument.IndexingSubjectWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelatedWorksWrapDocument createRelatedWorksWrapDocument() {
        RelatedWorksWrapDocument result = RelatedWorksWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelatedWorksWrap createRelatedWorksWrap() {
        RelatedWorksWrap result = RelatedWorksWrapDocument.RelatedWorksWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelatedWorkSetDocument createRelatedWorkSetDocument() {
        RelatedWorkSetDocument result = RelatedWorkSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RelatedWorkSet createRelatedWorkSet() {
        RelatedWorkSet result = RelatedWorkSetDocument.RelatedWorkSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LinkRelatedWorkDocument createLinkRelatedWorkDocument() {
        LinkRelatedWorkDocument result = LinkRelatedWorkDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LinkRelatedWork createLinkRelatedWork() {
        LinkRelatedWork result = LinkRelatedWorkDocument.LinkRelatedWork.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LabelRelatedWorkDocument createLabelRelatedWorkDocument() {
        LabelRelatedWorkDocument result = LabelRelatedWorkDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public LabelRelatedWork createLabelRelatedWork() {
        LabelRelatedWork result = LabelRelatedWorkDocument.LabelRelatedWork.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingEventSetDocument createIndexingEventSetDocument() {
        IndexingEventSetDocument result = IndexingEventSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingEventSet createIndexingEventSet() {
        IndexingEventSet result = IndexingEventSetDocument.IndexingEventSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingActorSetDocument createIndexingActorSetDocument() {
        IndexingActorSetDocument result = IndexingActorSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingActorSet createIndexingActorSet() {
        IndexingActorSet result = IndexingActorSetDocument.IndexingActorSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public NameActorSetDocument createNameActorSetDocument() {
        NameActorSetDocument result = NameActorSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public NameActorSet createNameActorSet() {
        NameActorSet result = NameActorSetDocument.NameActorSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceNameActorDocument createSourceNameActorDocument() {
        SourceNameActorDocument result = SourceNameActorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceNameActor createSourceNameActor() {
        SourceNameActor result = SourceNameActorDocument.SourceNameActor.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public VitalDatesActorDocument createVitalDatesActorDocument() {
        VitalDatesActorDocument result = VitalDatesActorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public VitalDatesActor createVitalDatesActor() {
        VitalDatesActor result = VitalDatesActorDocument.VitalDatesActor.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RoleActorDocument createRoleActorDocument() {
        RoleActorDocument result = RoleActorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RoleActor createRoleActor() {
        RoleActor result = RoleActorDocument.RoleActor.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentActorDocument createExtentActorDocument() {
        ExtentActorDocument result = ExtentActorDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public ExtentActor createExtentActor() {
        ExtentActor result = ExtentActorDocument.ExtentActor.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingLocationWrapDocument createIndexingLocationWrapDocument() {
        IndexingLocationWrapDocument result = IndexingLocationWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingLocationWrap createIndexingLocationWrap() {
        IndexingLocationWrap result = IndexingLocationWrapDocument.IndexingLocationWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingLocationSetDocument createIndexingLocationSetDocument() {
        IndexingLocationSetDocument result = IndexingLocationSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingLocationSet createIndexingLocationSet() {
        IndexingLocationSet result = IndexingLocationSetDocument.IndexingLocationSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public NameLocationSetDocument createNameLocationSetDocument() {
        NameLocationSetDocument result = NameLocationSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public NameLocationSet createNameLocationSet() {
        NameLocationSet result = NameLocationSetDocument.NameLocationSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public NameLocationDocument createNameLocationDocument() {
        NameLocationDocument result = NameLocationDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public NameLocation createNameLocation() {
        NameLocation result = NameLocationDocument.NameLocation.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceNameLocationDocument createSourceNameLocationDocument() {
        SourceNameLocationDocument result = SourceNameLocationDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceNameLocation createSourceNameLocation() {
        SourceNameLocation result = SourceNameLocationDocument.SourceNameLocation.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordInfoSetDocument createRecordInfoSetDocument() {
        RecordInfoSetDocument result = RecordInfoSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordInfoSet createRecordInfoSet() {
        RecordInfoSet result = RecordInfoSetDocument.RecordInfoSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordMetadataLocDocument createRecordMetadataLocDocument() {
        RecordMetadataLocDocument result = RecordMetadataLocDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordMetadataLoc createRecordMetadataLoc() {
        RecordMetadataLoc result = RecordMetadataLocDocument.RecordMetadataLoc.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordMetadataDateDocument createRecordMetadataDateDocument() {
        RecordMetadataDateDocument result = RecordMetadataDateDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordMetadataDate createRecordMetadataDate() {
        RecordMetadataDate result = RecordMetadataDateDocument.RecordMetadataDate.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceTitleDocument createSourceTitleDocument() {
        SourceTitleDocument result = SourceTitleDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public SourceTitle createSourceTitle() {
        SourceTitle result = SourceTitleDocument.SourceTitle.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingEventWrapDocument createIndexingEventWrapDocument() {
        IndexingEventWrapDocument result = IndexingEventWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IndexingEventWrap createIndexingEventWrap() {
        IndexingEventWrap result = IndexingEventWrapDocument.IndexingEventWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TitleSetDocument createTitleSetDocument() {
        TitleSetDocument result = TitleSetDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TitleSet createTitleSet() {
        TitleSet result = TitleSetDocument.TitleSet.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public InscriptionsWrapDocument createInscriptionsWrapDocument() {
        InscriptionsWrapDocument result = InscriptionsWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public InscriptionsWrap createInscriptionsWrap() {
        InscriptionsWrap result = InscriptionsWrapDocument.InscriptionsWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordTypeDocument createRecordTypeDocument() {
        RecordTypeDocument result = RecordTypeDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordType createRecordType() {
        RecordType result = RecordTypeDocument.RecordType.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public CultureWrapDocument createCultureWrapDocument() {
        CultureWrapDocument result = CultureWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public CultureWrap createCultureWrap() {
        CultureWrap result = CultureWrapDocument.CultureWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public MuseumdatDocument createMuseumdatDocument() {
        MuseumdatDocument result = MuseumdatDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public Museumdat createMuseumdat() {
        Museumdat result = MuseumdatDocument.Museumdat.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveMetadataDocument createDescriptiveMetadataDocument() {
        DescriptiveMetadataDocument result = DescriptiveMetadataDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public DescriptiveMetadata createDescriptiveMetadata() {
        DescriptiveMetadata result = DescriptiveMetadataDocument.DescriptiveMetadata.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IdentificationWrapDocument createIdentificationWrapDocument() {
        IdentificationWrapDocument result = IdentificationWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public IdentificationWrap createIdentificationWrap() {
        IdentificationWrap result = IdentificationWrapDocument.IdentificationWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TitleWrapDocument createTitleWrapDocument() {
        TitleWrapDocument result = TitleWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public TitleWrap createTitleWrap() {
        TitleWrap result = TitleWrapDocument.TitleWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public EventWrapDocument createEventWrapDocument() {
        EventWrapDocument result = EventWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public EventWrap createEventWrap() {
        EventWrap result = EventWrapDocument.EventWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public AdministrativeMetadataDocument createAdministrativeMetadataDocument() {
        AdministrativeMetadataDocument result = AdministrativeMetadataDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public AdministrativeMetadata createAdministrativeMetadata() {
        AdministrativeMetadata result = AdministrativeMetadataDocument.AdministrativeMetadata.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordWrapDocument createRecordWrapDocument() {
        RecordWrapDocument result = RecordWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public RecordWrap createRecordWrap() {
        RecordWrap result = RecordWrapDocument.RecordWrap.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public MuseumdatWrapDocument createMuseumdatWrapDocument() {
        MuseumdatWrapDocument result = MuseumdatWrapDocument.Factory.newInstance();

        return result;
    }

    @Provides
    @Override
    public MuseumdatWrap createMuseumdatWrap() {
        MuseumdatWrap result = MuseumdatWrapDocument.MuseumdatWrap.Factory.newInstance();

        return result;
    }
}