/*

 *
 */
package org.moosbusch.museum.museumdat.inject;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
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
import org.apache.xmlbeans.XmlObject;
import org.moosbusch.museum.museumdat.document.Document;
import org.moosbusch.museum.museumdat.document.impl.DocumentImpl;
import org.moosbusch.museum.museumdat.inject.annotation.EncodingAnalog;
import org.moosbusch.museum.museumdat.inject.annotation.Language;
import org.moosbusch.museum.museumdat.inject.annotation.LanguageEncoding;
import org.moosbusch.museum.museumdat.inject.annotation.RelatedEncoding;

/**
 *
 * @author moosbusch
 */
public class MuseumDatModule extends AbstractModule {

    private Injector defaultInjector;

    protected final Injector getDefaultInjector() {
        synchronized (this) {
            if (defaultInjector == null) {
                defaultInjector = Guice.createInjector(this);
            }

            return defaultInjector;
        }
    }

    protected final <T extends XmlObject> T entityCreated(T entity) {
        getDefaultInjector().injectMembers(entity);
        return entityCreatedImpl(entity);
    }

    protected <T extends XmlObject> T entityCreatedImpl(T entity) {
        return entity;
    }

    @Override
    protected void configure() {
        binder().bind(String.class).annotatedWith(Language.class).toInstance(
                Document.DEFAULT_LANGUAGE);
        binder().bind(String.class).annotatedWith(LanguageEncoding.class).toInstance(
                Document.DEFAULT_LANGUAGE_ENCODING);
        binder().bind(String.class).annotatedWith(RelatedEncoding.class).toInstance(
                Document.DEFAULT_RELATED_ENCODING);
        binder().bind(String.class).annotatedWith(EncodingAnalog.class).toInstance(
                Document.DEFAULT_ENCODING_ANALOG);
    }

    @Provides
    public Document createDocument() {
        return new DocumentImpl();
    }

    @Provides
    public EncodinganalogAttribute createEncodingAnalogAttribute() {
        EncodinganalogAttribute result = EncodinganalogAttribute.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public GeographicalEntityAttribute createGeographicalEntityAttribute() {
        GeographicalEntityAttribute result = GeographicalEntityAttribute.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ImportedAttribute createImportedAttribute() {
        ImportedAttribute result = ImportedAttribute.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LabelAttribute createLabelAttribute() {
        LabelAttribute result = LabelAttribute.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LangAttribute createLangAttribute() {
        LangAttribute result = LangAttribute.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LinkschemeAttribute createLinkschemeAttribute() {
        LinkschemeAttribute result = LinkschemeAttribute.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LocIDAttribute createLocIDAttribute() {
        LocIDAttribute result = LocIDAttribute.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LocIDtypeAttribute createLocIDTypeAttribute() {
        LocIDtypeAttribute result = LocIDtypeAttribute.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public TermsourceAttribute createTermSourceAttribute() {
        TermsourceAttribute result = TermsourceAttribute.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public TermsourceIDAttribute createTermSourceIDAttribute() {
        TermsourceIDAttribute result = TermsourceIDAttribute.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public PoliticalEntityAttribute createPoliticalEntityAttribute() {
        PoliticalEntityAttribute result = PoliticalEntityAttribute.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public TypeAttribute createTypeAttribute() {
        TypeAttribute result = TypeAttribute.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public PrefAttribute createPrefAttribute() {
        PrefAttribute result = PrefAttribute.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ObjectWorkTypeDocument createObjectWorkTypeDocument() {
        ObjectWorkTypeDocument result = ObjectWorkTypeDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ObjectWorkType createObjectWorkType() {
        ObjectWorkType result = ObjectWorkTypeDocument.ObjectWorkType.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RepositoryLocationNameDocument createRepositoryLocationNameDocument() {
        RepositoryLocationNameDocument result = RepositoryLocationNameDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RepositoryLocationName createRepositoryLocationName() {
        RepositoryLocationName result = RepositoryLocationNameDocument.RepositoryLocationName.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LinkResourceDocument createLinkResourceDocument() {
        LinkResourceDocument result = LinkResourceDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LinkResource createLinkResource() {
        LinkResource result = LinkResourceDocument.LinkResource.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public GenderActorDocument createGenderActorDocument() {
        GenderActorDocument result = GenderActorDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public GenderActor createGenderActor() {
        GenderActor result = GenderActorDocument.GenderActor.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingDatesDocument createIndexingDatesDocument() {
        IndexingDatesDocument result = IndexingDatesDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingDates createIndexingDates() {
        IndexingDates result = IndexingDatesDocument.IndexingDates.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public EarliestDateDocument createEarliestDateDocument() {
        EarliestDateDocument result = EarliestDateDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public EarliestDate createEarliestDate() {
        EarliestDate result = EarliestDateDocument.EarliestDate.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LatestDateDocument createLatestDateDocument() {
        LatestDateDocument result = LatestDateDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LatestDate createLatestDate() {
        LatestDate result = LatestDateDocument.LatestDate.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public MeasurementsSetDocument createMeasurementsSetDocument() {
        MeasurementsSetDocument result = MeasurementsSetDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public MeasurementsSet createMeasurementsSet() {
        MeasurementsSet result = MeasurementsSetDocument.MeasurementsSet.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public SourceMaterialsTechDocument createSourceMaterialsTechDocument() {
        SourceMaterialsTechDocument result = SourceMaterialsTechDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public SourceMaterialsTech createSourceMaterialsTech() {
        SourceMaterialsTech result = SourceMaterialsTechDocument.SourceMaterialsTech.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public NationalityActorDocument createNationalityActorDocument() {
        NationalityActorDocument result = NationalityActorDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public NationalityActor createNationalityActor() {
        NationalityActor result = NationalityActorDocument.NationalityActor.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RelatedWorkRelTypeDocument createRelatedWorkRelTypeDocument() {
        RelatedWorkRelTypeDocument result = RelatedWorkRelTypeDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RelatedWorkRelType createRelatedWorkRelType() {
        RelatedWorkRelType result = RelatedWorkRelTypeDocument.RelatedWorkRelType.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceWrapDocument createResourceWrapDocument() {
        ResourceWrapDocument result = ResourceWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceWrap createResourceWrap() {
        ResourceWrap result = ResourceWrapDocument.ResourceWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceSetDocument createResourceSetDocument() {
        ResourceSetDocument result = ResourceSetDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceSet createResourceSet() {
        ResourceSet result = ResourceSetDocument.ResourceSet.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceIDDocument createResourceIDDocument() {
        ResourceIDDocument result = ResourceIDDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceID createResourceID() {
        ResourceID result = ResourceIDDocument.ResourceID.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceRelTypeDocument createResourceRelTypeDocument() {
        ResourceRelTypeDocument result = ResourceRelTypeDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceRelType createResourceRelType() {
        ResourceRelType result = ResourceRelTypeDocument.ResourceRelType.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceTypeDocument createResourceTypeDocument() {
        ResourceTypeDocument result = ResourceTypeDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceType createResourceType() {
        ResourceType result = ResourceTypeDocument.ResourceType.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RightsResourceDocument createRightsResourceDocument() {
        RightsResourceDocument result = RightsResourceDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RightsResource createRightsResource() {
        RightsResource result = RightsResourceDocument.RightsResource.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceViewDescriptionDocument createResourceViewDescriptionDocument() {
        ResourceViewDescriptionDocument result = ResourceViewDescriptionDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceViewDescription createResourceViewDescription() {
        ResourceViewDescription result = ResourceViewDescriptionDocument.ResourceViewDescription.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceViewTypeDocument createResourceViewTypeDocument() {
        ResourceViewTypeDocument result = ResourceViewTypeDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceViewType createResourceViewType() {
        ResourceViewType result = ResourceViewTypeDocument.ResourceViewType.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceViewSubjectTermDocument createResourceViewSubjectTermDocument() {
        ResourceViewSubjectTermDocument result = ResourceViewSubjectTermDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceViewSubjectTerm createResourceViewSubjectTerm() {
        ResourceViewSubjectTerm result = ResourceViewSubjectTermDocument.ResourceViewSubjectTerm.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceViewDateDocument createResourceViewDateDocument() {
        ResourceViewDateDocument result = ResourceViewDateDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceViewDate createResourceViewDate() {
        ResourceViewDate result = ResourceViewDateDocument.ResourceViewDate.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceSourceDocument createResourceSourceDocument() {
        ResourceSourceDocument result = ResourceSourceDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceSource createResourceSource() {
        ResourceSource result = ResourceSourceDocument.ResourceSource.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LinkRelatedResourceDocument createLinkRelatedResourceDocument() {
        LinkRelatedResourceDocument result = LinkRelatedResourceDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LinkRelatedResource createLinkRelatedResource() {
        LinkRelatedResource result = LinkRelatedResourceDocument.LinkRelatedResource.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RelatedResourceRelTypeDocument createRelatedResourceRelTypeDocument() {
        RelatedResourceRelTypeDocument result = RelatedResourceRelTypeDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RelatedResourceRelType createRelatedResourceRelType() {
        RelatedResourceRelType result = RelatedResourceRelTypeDocument.RelatedResourceRelType.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LabelRelatedResourceDocument createLabelRelatedResourceDocument() {
        LabelRelatedResourceDocument result = LabelRelatedResourceDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LabelRelatedResource createLabelRelatedResource() {
        LabelRelatedResource result = LabelRelatedResourceDocument.LabelRelatedResource.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceMetadataLocDocument createResourceMetadataLocDocument() {
        ResourceMetadataLocDocument result = ResourceMetadataLocDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ResourceMetadataLoc createResourceMetadataLoc() {
        ResourceMetadataLoc result = ResourceMetadataLocDocument.ResourceMetadataLoc.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public TermMaterialsTechDocument createTermMaterialsTechDocument() {
        TermMaterialsTechDocument result = TermMaterialsTechDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public TermMaterialsTech createTermMaterialsTech() {
        TermMaterialsTech result = TermMaterialsTechDocument.TermMaterialsTech.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingSubjectSetDocument createIndexingSubjectSetDocument() {
        IndexingSubjectSetDocument result = IndexingSubjectSetDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingSubjectSet createIndexingSubjectSet() {
        IndexingSubjectSet result = IndexingSubjectSetDocument.IndexingSubjectSet.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ExtentSubjectDocument createExtentSubjectDocument() {
        ExtentSubjectDocument result = ExtentSubjectDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ExtentSubject createExtentSubject() {
        ExtentSubject result = ExtentSubjectDocument.ExtentSubject.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public SubjectTermDocument createSubjectTermDocument() {
        SubjectTermDocument result = SubjectTermDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public SubjectTerm createSubjectTerm() {
        SubjectTerm result = SubjectTermDocument.SubjectTerm.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayCreatorDocument createDisplayCreatorDocument() {
        DisplayCreatorDocument result = DisplayCreatorDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayCreator createDisplayCreator() {
        DisplayCreator result = DisplayCreatorDocument.DisplayCreator.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ExtentMeasurementsDocument createExtentMeasurementsDocument() {
        ExtentMeasurementsDocument result = ExtentMeasurementsDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ExtentMeasurements createExtentMeasurements() {
        ExtentMeasurements result = ExtentMeasurementsDocument.ExtentMeasurements.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ExtentMaterialsTechDocument createExtentMaterialsTechDocument() {
        ExtentMaterialsTechDocument result = ExtentMaterialsTechDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ExtentMaterialsTech createExtentMaterialsTech() {
        ExtentMaterialsTech result = ExtentMaterialsTechDocument.ExtentMaterialsTech.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ShapeMeasurementsDocument createShapeMeasurementsDocument() {
        ShapeMeasurementsDocument result = ShapeMeasurementsDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ShapeMeasurements createShapeMeasurements() {
        ShapeMeasurements result = ShapeMeasurementsDocument.ShapeMeasurements.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RepositoryWrapDocument createRepositoryWrapDocument() {
        RepositoryWrapDocument result = RepositoryWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RepositoryWrap createRepositoryWrap() {
        RepositoryWrap result = RepositoryWrapDocument.RepositoryWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RepositorySetDocument createRepositorySetDocument() {
        RepositorySetDocument result = RepositorySetDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RepositorySet createRepositorySet() {
        RepositorySet result = RepositorySetDocument.RepositorySet.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RepositoryNameDocument createRepositoryNameDocument() {
        RepositoryNameDocument result = RepositoryNameDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RepositoryName createRepositoryName() {
        RepositoryName result = RepositoryNameDocument.RepositoryName.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public WorkIDDocument createWorkIDDocument() {
        WorkIDDocument result = WorkIDDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public WorkID createWorkID() {
        WorkID result = WorkIDDocument.WorkID.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public FormatMeasurementsDocument createFormatMeasurementsDocument() {
        FormatMeasurementsDocument result = FormatMeasurementsDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public FormatMeasurements createFormatMeasurements() {
        FormatMeasurements result = FormatMeasurementsDocument.FormatMeasurements.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public NameActorDocument createNameActorDocument() {
        NameActorDocument result = NameActorDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public NameActor createNameActor() {
        NameActor result = NameActorDocument.NameActor.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public StyleWrapDocument createStyleWrapDocument() {
        StyleWrapDocument result = StyleWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public StyleWrap createStyleWrap() {
        StyleWrap result = StyleWrapDocument.StyleWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public StyleDocument createStyleDocument() {
        StyleDocument result = StyleDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public Style createStyle() {
        Style result = StyleDocument.Style.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingMaterialsTechWrapDocument createIndexingMaterialsTechWrapDocument() {
        IndexingMaterialsTechWrapDocument result = IndexingMaterialsTechWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingMaterialsTechWrap createIndexingMaterialsTechWrap() {
        IndexingMaterialsTechWrap result = IndexingMaterialsTechWrapDocument.IndexingMaterialsTechWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingMaterialsTechSetDocument createIndexingMaterialsTechSetDocument() {
        IndexingMaterialsTechSetDocument result = IndexingMaterialsTechSetDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingMaterialsTechSet createIndexingMaterialsTechSet() {
        IndexingMaterialsTechSet result = IndexingMaterialsTechSetDocument.IndexingMaterialsTechSet.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LocRelatedWorkDocument createLocRelatedWorkDocument() {
        LocRelatedWorkDocument result = LocRelatedWorkDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LocRelatedWork createLocRelatedWork() {
        LocRelatedWork result = LocRelatedWorkDocument.LocRelatedWork.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayEventWrapDocument createDisplayEventWrapDocument() {
        DisplayEventWrapDocument result = DisplayEventWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayEventWrap createDisplayEventWrap() {
        DisplayEventWrap result = DisplayEventWrapDocument.DisplayEventWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayEventDocument createDisplayEventDocument() {
        DisplayEventDocument result = DisplayEventDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayEvent createDisplayEvent() {
        DisplayEvent result = DisplayEventDocument.DisplayEvent.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public CultureDocument createCultureDocument() {
        CultureDocument result = CultureDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public Culture createCulture() {
        Culture result = CultureDocument.Culture.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RecordRelIDDocument createRecordRelIDDocument() {
        RecordRelIDDocument result = RecordRelIDDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RecordRelID createRecordRelID() {
        RecordRelID result = RecordRelIDDocument.RecordRelID.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ObjectClassificationWrapDocument createObjectClassificationWrapDocument() {
        ObjectClassificationWrapDocument result = ObjectClassificationWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ObjectClassificationWrap createObjectClassificationWrap() {
        ObjectClassificationWrap result = ObjectClassificationWrapDocument.ObjectClassificationWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ObjectWorkTypeWrapDocument createObjectWorkTypeWrapDocument() {
        ObjectWorkTypeWrapDocument result = ObjectWorkTypeWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ObjectWorkTypeWrap createObjectWorkTypeWrap() {
        ObjectWorkTypeWrap result = ObjectWorkTypeWrapDocument.ObjectWorkTypeWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ClassificationWrapDocument createClassificationWrapDocument() {
        ClassificationWrapDocument result = ClassificationWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ClassificationWrap createClassificationWrap() {
        ClassificationWrap result = ClassificationWrapDocument.ClassificationWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ClassificationDocument createClassificationDocument() {
        ClassificationDocument result = ClassificationDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public Classification createClassification() {
        Classification result = ClassificationDocument.Classification.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DescriptiveNoteWrapDocument createDescriptiveNoteWrapDocument() {
        DescriptiveNoteWrapDocument result = DescriptiveNoteWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DescriptiveNoteWrap createDescriptiveNoteWrap() {
        DescriptiveNoteWrap result = DescriptiveNoteWrapDocument.DescriptiveNoteWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DescriptiveNoteSetDocument createDescriptiveNoteSetDocument() {
        DescriptiveNoteSetDocument result = DescriptiveNoteSetDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DescriptiveNoteSet createDescriptiveNoteSet() {
        DescriptiveNoteSet result = DescriptiveNoteSetDocument.DescriptiveNoteSet.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DescriptiveNoteDocument createDescriptiveNoteDocument() {
        DescriptiveNoteDocument result = DescriptiveNoteDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DescriptiveNote createDescriptiveNote() {
        DescriptiveNote result = DescriptiveNoteDocument.DescriptiveNote.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public SourceDescriptiveNoteDocument createSourceDescriptiveNoteDocument() {
        SourceDescriptiveNoteDocument result = SourceDescriptiveNoteDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public SourceDescriptiveNote createSourceDescriptiveNote() {
        SourceDescriptiveNote result = SourceDescriptiveNoteDocument.SourceDescriptiveNote.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingMeasurementsWrapDocument createIndexingMeasurementsWrapDocument() {
        IndexingMeasurementsWrapDocument result = IndexingMeasurementsWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingMeasurementsWrap createIndexingMeasurementsWrap() {
        IndexingMeasurementsWrap result = IndexingMeasurementsWrapDocument.IndexingMeasurementsWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingMeasurementsSetDocument createIndexingMeasurementsSetDocument() {
        IndexingMeasurementsSetDocument result = IndexingMeasurementsSetDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingMeasurementsSet createIndexingMeasurementsSet() {
        IndexingMeasurementsSet result = IndexingMeasurementsSetDocument.IndexingMeasurementsSet.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ScaleMeasurementsDocument createScaleMeasurementsDocument() {
        ScaleMeasurementsDocument result = ScaleMeasurementsDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ScaleMeasurements createScaleMeasurements() {
        ScaleMeasurements result = ScaleMeasurementsDocument.ScaleMeasurements.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayMeasurementsDocument createDisplayMeasurementsDocument() {
        DisplayMeasurementsDocument result = DisplayMeasurementsDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayMeasurements createDisplayMeasurements() {
        DisplayMeasurements result = DisplayMeasurementsDocument.DisplayMeasurements.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public InscriptionsDocument createInscriptionsDocument() {
        InscriptionsDocument result = InscriptionsDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public Inscriptions createInscriptions() {
        Inscriptions result = InscriptionsDocument.Inscriptions.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public EventTypeDocument createEventTypeDocument() {
        EventTypeDocument result = EventTypeDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public EventType createEventType() {
        EventType result = EventTypeDocument.EventType.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RightsWorkDocument createRightsWorkDocument() {
        RightsWorkDocument result = RightsWorkDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RightsWork createRightsWork() {
        RightsWork result = RightsWorkDocument.RightsWork.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public TitleDocument createTitleDocument() {
        TitleDocument result = TitleDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public Title createTitle() {
        Title result = TitleDocument.Title.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RecordInfoIDDocument createRecordInfoIDDocument() {
        RecordInfoIDDocument result = RecordInfoIDDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RecordInfoID createRecordInfoID() {
        RecordInfoID result = RecordInfoIDDocument.RecordInfoID.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DescriptionWrapDocument createDescriptionWrapDocument() {
        DescriptionWrapDocument result = DescriptionWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DescriptionWrap createDescriptionWrap() {
        DescriptionWrap result = DescriptionWrapDocument.DescriptionWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayCreationDateDocument createDisplayCreationDateDocument() {
        DisplayCreationDateDocument result = DisplayCreationDateDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayCreationDate createDisplayCreationDate() {
        DisplayCreationDate result = DisplayCreationDateDocument.DisplayCreationDate.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayCreationLocationDocument createDisplayCreationLocationDocument() {
        DisplayCreationLocationDocument result = DisplayCreationLocationDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayCreationLocation createDisplayCreationLocation() {
        DisplayCreationLocation result = DisplayCreationLocationDocument.DisplayCreationLocation.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayMaterialsTechDocument createDisplayMaterialsTechDocument() {
        DisplayMaterialsTechDocument result = DisplayMaterialsTechDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayMaterialsTech createDisplayMaterialsTech() {
        DisplayMaterialsTech result = DisplayMaterialsTechDocument.DisplayMaterialsTech.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayStateEditionWrapDocument createDisplayStateEditionWrapDocument() {
        DisplayStateEditionWrapDocument result = DisplayStateEditionWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayStateEditionWrap createDisplayStateEditionWrap() {
        DisplayStateEditionWrap result = DisplayStateEditionWrapDocument.DisplayStateEditionWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayStateDocument createDisplayStateDocument() {
        DisplayStateDocument result = DisplayStateDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayState createDisplayState() {
        DisplayState result = DisplayStateDocument.DisplayState.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayEditionDocument createDisplayEditionDocument() {
        DisplayEditionDocument result = DisplayEditionDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DisplayEdition createDisplayEdition() {
        DisplayEdition result = DisplayEditionDocument.DisplayEdition.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public SourceStateEditionDocument createSourceStateEditionDocument() {
        SourceStateEditionDocument result = SourceStateEditionDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public SourceStateEdition createSourceStateEdition() {
        SourceStateEdition result = SourceStateEditionDocument.SourceStateEdition.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RecordSourceDocument createRecordSourceDocument() {
        RecordSourceDocument result = RecordSourceDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RecordSource createRecordSource() {
        RecordSource result = RecordSourceDocument.RecordSource.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RecordIDDocument createRecordIDDocument() {
        RecordIDDocument result = RecordIDDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RecordID createRecordID() {
        RecordID result = RecordIDDocument.RecordID.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RelationWrapDocument createRelationWrapDocument() {
        RelationWrapDocument result = RelationWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RelationWrap createRelationWrap() {
        RelationWrap result = RelationWrapDocument.RelationWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingSubjectWrapDocument createIndexingSubjectWrapDocument() {
        IndexingSubjectWrapDocument result = IndexingSubjectWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingSubjectWrap createIndexingSubjectWrap() {
        IndexingSubjectWrap result = IndexingSubjectWrapDocument.IndexingSubjectWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RelatedWorksWrapDocument createRelatedWorksWrapDocument() {
        RelatedWorksWrapDocument result = RelatedWorksWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RelatedWorksWrap createRelatedWorksWrap() {
        RelatedWorksWrap result = RelatedWorksWrapDocument.RelatedWorksWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RelatedWorkSetDocument createRelatedWorkSetDocument() {
        RelatedWorkSetDocument result = RelatedWorkSetDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RelatedWorkSet createRelatedWorkSet() {
        RelatedWorkSet result = RelatedWorkSetDocument.RelatedWorkSet.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LinkRelatedWorkDocument createLinkRelatedWorkDocument() {
        LinkRelatedWorkDocument result = LinkRelatedWorkDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LinkRelatedWork createLinkRelatedWork() {
        LinkRelatedWork result = LinkRelatedWorkDocument.LinkRelatedWork.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LabelRelatedWorkDocument createLabelRelatedWorkDocument() {
        LabelRelatedWorkDocument result = LabelRelatedWorkDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public LabelRelatedWork createLabelRelatedWork() {
        LabelRelatedWork result = LabelRelatedWorkDocument.LabelRelatedWork.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingEventSetDocument createIndexingEventSetDocument() {
        IndexingEventSetDocument result = IndexingEventSetDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingEventSet createIndexingEventSet() {
        IndexingEventSet result = IndexingEventSetDocument.IndexingEventSet.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingActorSetDocument createIndexingActorSetDocument() {
        IndexingActorSetDocument result = IndexingActorSetDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingActorSet createIndexingActorSet() {
        IndexingActorSet result = IndexingActorSetDocument.IndexingActorSet.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public NameActorSetDocument createNameActorSetDocument() {
        NameActorSetDocument result = NameActorSetDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public NameActorSet createNameActorSet() {
        NameActorSet result = NameActorSetDocument.NameActorSet.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public SourceNameActorDocument createSourceNameActorDocument() {
        SourceNameActorDocument result = SourceNameActorDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public SourceNameActor createSourceNameActor() {
        SourceNameActor result = SourceNameActorDocument.SourceNameActor.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public VitalDatesActorDocument createVitalDatesActorDocument() {
        VitalDatesActorDocument result = VitalDatesActorDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public VitalDatesActor createVitalDatesActor() {
        VitalDatesActor result = VitalDatesActorDocument.VitalDatesActor.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RoleActorDocument createRoleActorDocument() {
        RoleActorDocument result = RoleActorDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RoleActor createRoleActor() {
        RoleActor result = RoleActorDocument.RoleActor.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ExtentActorDocument createExtentActorDocument() {
        ExtentActorDocument result = ExtentActorDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public ExtentActor createExtentActor() {
        ExtentActor result = ExtentActorDocument.ExtentActor.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingLocationWrapDocument createIndexingLocationWrapDocument() {
        IndexingLocationWrapDocument result = IndexingLocationWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingLocationWrap createIndexingLocationWrap() {
        IndexingLocationWrap result = IndexingLocationWrapDocument.IndexingLocationWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingLocationSetDocument createIndexingLocationSetDocument() {
        IndexingLocationSetDocument result = IndexingLocationSetDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingLocationSet createIndexingLocationSet() {
        IndexingLocationSet result = IndexingLocationSetDocument.IndexingLocationSet.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public NameLocationSetDocument createNameLocationSetDocument() {
        NameLocationSetDocument result = NameLocationSetDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public NameLocationSet createNameLocationSet() {
        NameLocationSet result = NameLocationSetDocument.NameLocationSet.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public NameLocationDocument createNameLocationDocument() {
        NameLocationDocument result = NameLocationDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public NameLocation createNameLocation() {
        NameLocation result = NameLocationDocument.NameLocation.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public SourceNameLocationDocument createSourceNameLocationDocument() {
        SourceNameLocationDocument result = SourceNameLocationDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public SourceNameLocation createSourceNameLocation() {
        SourceNameLocation result = SourceNameLocationDocument.SourceNameLocation.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RecordInfoSetDocument createRecordInfoSetDocument() {
        RecordInfoSetDocument result = RecordInfoSetDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RecordInfoSet createRecordInfoSet() {
        RecordInfoSet result = RecordInfoSetDocument.RecordInfoSet.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RecordMetadataLocDocument createRecordMetadataLocDocument() {
        RecordMetadataLocDocument result = RecordMetadataLocDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RecordMetadataLoc createRecordMetadataLoc() {
        RecordMetadataLoc result = RecordMetadataLocDocument.RecordMetadataLoc.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RecordMetadataDateDocument createRecordMetadataDateDocument() {
        RecordMetadataDateDocument result = RecordMetadataDateDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RecordMetadataDate createRecordMetadataDate() {
        RecordMetadataDate result = RecordMetadataDateDocument.RecordMetadataDate.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public SourceTitleDocument createSourceTitleDocument() {
        SourceTitleDocument result = SourceTitleDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public SourceTitle createSourceTitle() {
        SourceTitle result = SourceTitleDocument.SourceTitle.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingEventWrapDocument createIndexingEventWrapDocument() {
        IndexingEventWrapDocument result = IndexingEventWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IndexingEventWrap createIndexingEventWrap() {
        IndexingEventWrap result = IndexingEventWrapDocument.IndexingEventWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public TitleSetDocument createTitleSetDocument() {
        TitleSetDocument result = TitleSetDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public TitleSet createTitleSet() {
        TitleSet result = TitleSetDocument.TitleSet.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public InscriptionsWrapDocument createInscriptionsWrapDocument() {
        InscriptionsWrapDocument result = InscriptionsWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public InscriptionsWrap createInscriptionsWrap() {
        InscriptionsWrap result = InscriptionsWrapDocument.InscriptionsWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RecordTypeDocument createRecordTypeDocument() {
        RecordTypeDocument result = RecordTypeDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RecordType createRecordType() {
        RecordType result = RecordTypeDocument.RecordType.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public CultureWrapDocument createCultureWrapDocument() {
        CultureWrapDocument result = CultureWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public CultureWrap createCultureWrap() {
        CultureWrap result = CultureWrapDocument.CultureWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public MuseumdatDocument createMuseumdatDocument() {
        MuseumdatDocument result = MuseumdatDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public Museumdat createMuseumdat() {
        Museumdat result = MuseumdatDocument.Museumdat.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DescriptiveMetadataDocument createDescriptiveMetadataDocument() {
        DescriptiveMetadataDocument result = DescriptiveMetadataDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public DescriptiveMetadata createDescriptiveMetadata() {
        DescriptiveMetadata result = DescriptiveMetadataDocument.DescriptiveMetadata.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IdentificationWrapDocument createIdentificationWrapDocument() {
        IdentificationWrapDocument result = IdentificationWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public IdentificationWrap createIdentificationWrap() {
        IdentificationWrap result = IdentificationWrapDocument.IdentificationWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public TitleWrapDocument createTitleWrapDocument() {
        TitleWrapDocument result = TitleWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public TitleWrap createTitleWrap() {
        TitleWrap result = TitleWrapDocument.TitleWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public EventWrapDocument createEventWrapDocument() {
        EventWrapDocument result = EventWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public EventWrap createEventWrap() {
        EventWrap result = EventWrapDocument.EventWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public AdministrativeMetadataDocument createAdministrativeMetadataDocument() {
        AdministrativeMetadataDocument result = AdministrativeMetadataDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public AdministrativeMetadata createAdministrativeMetadata() {
        AdministrativeMetadata result = AdministrativeMetadataDocument.AdministrativeMetadata.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RecordWrapDocument createRecordWrapDocument() {
        RecordWrapDocument result = RecordWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public RecordWrap createRecordWrap() {
        RecordWrap result = RecordWrapDocument.RecordWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public MuseumdatWrapDocument createMuseumdatWrapDocument() {
        MuseumdatWrapDocument result = MuseumdatWrapDocument.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

    @Provides
    public MuseumdatWrap createMuseumdatWrap() {
        MuseumdatWrap result = MuseumdatWrapDocument.MuseumdatWrap.Factory.newInstance();
        result = entityCreated(result);
        return result;
    }

}