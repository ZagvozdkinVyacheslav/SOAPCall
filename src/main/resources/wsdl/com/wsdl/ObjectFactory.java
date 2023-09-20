
package com.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Annotation_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "Annotation");
    private final static QName _AnnotationId_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "AnnotationId");
    private final static QName _AnnotationIds_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "AnnotationIds");
    private final static QName _AppendStringListProperty_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "AppendStringListProperty");
    private final static QName _AppendStringListPropertyResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "AppendStringListPropertyResponse");
    private final static QName _ArchiveDocuments_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "ArchiveDocuments");
    private final static QName _ArchiveDocumentsResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "ArchiveDocumentsResponse");
    private final static QName _AuthPropertiesResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "AuthPropertiesResponse");
    private final static QName _CancelDeferredSign_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "CancelDeferredSign");
    private final static QName _CancelDeferredSignResult_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "CancelDeferredSignResult");
    private final static QName _CopyDocument_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "CopyDocument");
    private final static QName _CreateAnnotation_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "CreateAnnotation");
    private final static QName _CreateDeferredAnnotationsRequest_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "CreateDeferredAnnotationsRequest");
    private final static QName _CreateDocument_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "CreateDocument");
    private final static QName _CreateFolder_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "CreateFolder");
    private final static QName _CreateMultipleAnnotationsRequest_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "CreateMultipleAnnotationsRequest");
    private final static QName _CustomID_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "CustomID");
    private final static QName _CustomIDs_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "CustomIDs");
    private final static QName _CustomId_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "CustomId");
    private final static QName _DeferredTaskId_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "DeferredTaskId");
    private final static QName _DeleteAnnotation_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "DeleteAnnotation");
    private final static QName _DeleteAnnotationResult_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "DeleteAnnotationResult");
    private final static QName _DeleteDocumentVersion_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "DeleteDocumentVersion");
    private final static QName _DeleteDocumentVersionResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "DeleteDocumentVersionResponse");
    private final static QName _DeleteDocuments_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "DeleteDocuments");
    private final static QName _DigestInfoArray_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "DigestInfoArray");
    private final static QName _DocumentClassArray_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "DocumentClassArray");
    private final static QName _DocumentData_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "DocumentData");
    private final static QName _DocumentID_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "DocumentID");
    private final static QName _DocumentIDs_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "DocumentIDs");
    private final static QName _DocumentsInFolder_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "DocumentsInFolder");
    private final static QName _DocumentsPropertiesResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "DocumentsPropertiesResponse");
    private final static QName _ErrorMessageException_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "ErrorMessageException");
    private final static QName _FileNetId_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "FileNetId");
    private final static QName _FindDocuments_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "FindDocuments");
    private final static QName _FolderDocument_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "FolderDocument");
    private final static QName _FolderDocumentResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "FolderDocumentResponse");
    private final static QName _FolderPath_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "FolderPath");
    private final static QName _FoldersInFolder_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "FoldersInFolder");
    private final static QName _FoldersOfDocument_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "FoldersOfDocument");
    private final static QName _FoundedDocuments_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "FoundedDocuments");
    private final static QName _GetAnnotations_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetAnnotations");
    private final static QName _GetAnnotationsResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetAnnotationsResponse");
    private final static QName _GetAuthProperties_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetAuthProperties");
    private final static QName _GetChildren_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetChildren");
    private final static QName _GetConvertedDocument_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetConvertedDocument");
    private final static QName _GetCustomId_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetCustomId");
    private final static QName _GetDigest_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetDigest");
    private final static QName _GetDocument_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetDocument");
    private final static QName _GetDocumentData_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetDocumentData");
    private final static QName _GetDocumentPermissions_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetDocumentPermissions");
    private final static QName _GetDocumentProperties_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetDocumentProperties");
    private final static QName _GetDocumentPropertiesResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetDocumentPropertiesResponse");
    private final static QName _GetDocumentResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetDocumentResponse");
    private final static QName _GetDocumentsInFolder_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetDocumentsInFolder");
    private final static QName _GetDocumentsProperties_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetDocumentsProperties");
    private final static QName _GetFileNetId_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetFileNetId");
    private final static QName _GetFolderPermissions_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetFolderPermissions");
    private final static QName _GetFoldersInFolder_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetFoldersInFolder");
    private final static QName _GetFoldersOfDocument_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetFoldersOfDocument");
    private final static QName _GetParentFolder_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetParentFolder");
    private final static QName _GetSignedDocumentData_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetSignedDocumentData");
    private final static QName _GetStringListProperty_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetStringListProperty");
    private final static QName _GetStringListPropertyResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "GetStringListPropertyResponse");
    private final static QName _MultipleAnnotationsArray_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "MultipleAnnotationsArray");
    private final static QName _NumOfDeleted_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "NumOfDeleted");
    private final static QName _ParentFolder_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "ParentFolder");
    private final static QName _PermissionsOfDocument_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "PermissionsOfDocument");
    private final static QName _PermissionsOfFolder_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "PermissionsOfFolder");
    private final static QName _RemoveFromStringListProperty_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "RemoveFromStringListProperty");
    private final static QName _RemoveFromStringListPropertyResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "RemoveFromStringListPropertyResponse");
    private final static QName _RestoreDocuments_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "RestoreDocuments");
    private final static QName _RestoreDocumentsResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "RestoreDocumentsResponse");
    private final static QName _RetrieveAnnotation_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "RetrieveAnnotation");
    private final static QName _RetrieveAnnotations_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "RetrieveAnnotations");
    private final static QName _RetrieveDocAndAnnotations_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "RetrieveDocAndAnnotations");
    private final static QName _RetrieveDocAndAnnotationsResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "RetrieveDocAndAnnotationsResponse");
    private final static QName _RetrieveDocumentAndSignatures_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "RetrieveDocumentAndSignatures");
    private final static QName _RetrieveDocumentAndSignaturesResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "RetrieveDocumentAndSignaturesResponse");
    private final static QName _SearchDocuments_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "SearchDocuments");
    private final static QName _SearchDocumentsInFolder_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "SearchDocumentsInFolder");
    private final static QName _SetDocumentPermissions_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "SetDocumentPermissions");
    private final static QName _SetDocumentPermissionsResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "SetDocumentPermissionsResponse");
    private final static QName _SetFolderPermissions_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "SetFolderPermissions");
    private final static QName _SetFolderPermissionsResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "SetFolderPermissionsResponse");
    private final static QName _SignatureStatusArray_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "SignatureStatusArray");
    private final static QName _SignedDocumentData_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "SignedDocumentData");
    private final static QName _UpdateDocumentProperties_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "UpdateDocumentProperties");
    private final static QName _UpdateDocumentPropertiesResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "UpdateDocumentPropertiesResponse");
    private final static QName _UpdateDocumentVersion_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "UpdateDocumentVersion");
    private final static QName _UpdatedId_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "UpdatedId");
    private final static QName _ValidateCertificate_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "ValidateCertificate");
    private final static QName _ValidateCertificateResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "ValidateCertificateResponse");
    private final static QName _ValidateDocument_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "ValidateDocument");
    private final static QName _ValidateDocumentSignatures_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "ValidateDocumentSignatures");
    private final static QName _ValidateDocumentStatuses_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "ValidateDocumentStatuses");
    private final static QName _ValidateDocumentWithInfo_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "ValidateDocumentWithInfo");
    private final static QName _ValidateDocumentWithInfoResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "ValidateDocumentWithInfoResponse");
    private final static QName _ValidateExternalSignature_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "ValidateExternalSignature");
    private final static QName _ValidateExternalSignatureResponse_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "ValidateExternalSignatureResponse");
    private final static QName _MoveDocument_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "moveDocument");
    private final static QName _MovedCustomId_QNAME = new QName("http://cloud.mos.ru/customWebService2/", "movedCustomId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidateDocumentInfo }
     * 
     */
    public ValidateDocumentInfo createValidateDocumentInfo() {
        return new ValidateDocumentInfo();
    }

    /**
     * Create an instance of {@link DocumentProperties }
     * 
     */
    public DocumentProperties createDocumentProperties() {
        return new DocumentProperties();
    }

    /**
     * Create an instance of {@link PartAnnotationRequest }
     * 
     */
    public PartAnnotationRequest createPartAnnotationRequest() {
        return new PartAnnotationRequest();
    }

    /**
     * Create an instance of {@link ValidateDocumentWithInfoResponse }
     * 
     */
    public ValidateDocumentWithInfoResponse createValidateDocumentWithInfoResponse() {
        return new ValidateDocumentWithInfoResponse();
    }

    /**
     * Create an instance of {@link UpdateDocumentRequest }
     * 
     */
    public UpdateDocumentRequest createUpdateDocumentRequest() {
        return new UpdateDocumentRequest();
    }

    /**
     * Create an instance of {@link UpdatePropertiesRequest }
     * 
     */
    public UpdatePropertiesRequest createUpdatePropertiesRequest() {
        return new UpdatePropertiesRequest();
    }

    /**
     * Create an instance of {@link SetFolderPermissionsRequest }
     * 
     */
    public SetFolderPermissionsRequest createSetFolderPermissionsRequest() {
        return new SetFolderPermissionsRequest();
    }

    /**
     * Create an instance of {@link SetDocumentPermissionsRequest }
     * 
     */
    public SetDocumentPermissionsRequest createSetDocumentPermissionsRequest() {
        return new SetDocumentPermissionsRequest();
    }

    /**
     * Create an instance of {@link SearchDocumentsInFolderRequest }
     * 
     */
    public SearchDocumentsInFolderRequest createSearchDocumentsInFolderRequest() {
        return new SearchDocumentsInFolderRequest();
    }

    /**
     * Create an instance of {@link RetrieveDocAndAnnotationsResponse }
     * 
     */
    public RetrieveDocAndAnnotationsResponse createRetrieveDocAndAnnotationsResponse() {
        return new RetrieveDocAndAnnotationsResponse();
    }

    /**
     * Create an instance of {@link GetPermissionsResponse }
     * 
     */
    public GetPermissionsResponse createGetPermissionsResponse() {
        return new GetPermissionsResponse();
    }

    /**
     * Create an instance of {@link GetDocumentResponse }
     * 
     */
    public GetDocumentResponse createGetDocumentResponse() {
        return new GetDocumentResponse();
    }

    /**
     * Create an instance of {@link GetDocumentPropertiesResponse }
     * 
     */
    public GetDocumentPropertiesResponse createGetDocumentPropertiesResponse() {
        return new GetDocumentPropertiesResponse();
    }

    /**
     * Create an instance of {@link GetDigestRequest }
     * 
     */
    public GetDigestRequest createGetDigestRequest() {
        return new GetDigestRequest();
    }

    /**
     * Create an instance of {@link GetAnnotationsRequest }
     * 
     */
    public GetAnnotationsRequest createGetAnnotationsRequest() {
        return new GetAnnotationsRequest();
    }

    /**
     * Create an instance of {@link FindDocumentsRequest }
     * 
     */
    public FindDocumentsRequest createFindDocumentsRequest() {
        return new FindDocumentsRequest();
    }

    /**
     * Create an instance of {@link FindDocumentsRequest.Properties }
     * 
     */
    public FindDocumentsRequest.Properties createFindDocumentsRequestProperties() {
        return new FindDocumentsRequest.Properties();
    }

    /**
     * Create an instance of {@link CreateDocumentRequest }
     * 
     */
    public CreateDocumentRequest createCreateDocumentRequest() {
        return new CreateDocumentRequest();
    }

    /**
     * Create an instance of {@link CreateAnnotationRequest }
     * 
     */
    public CreateAnnotationRequest createCreateAnnotationRequest() {
        return new CreateAnnotationRequest();
    }

    /**
     * Create an instance of {@link ChangeStorageAreaResponse }
     * 
     */
    public ChangeStorageAreaResponse createChangeStorageAreaResponse() {
        return new ChangeStorageAreaResponse();
    }

    /**
     * Create an instance of {@link StringArray }
     * 
     */
    public StringArray createStringArray() {
        return new StringArray();
    }

    /**
     * Create an instance of {@link AppendStringListPropertyRequest }
     * 
     */
    public AppendStringListPropertyRequest createAppendStringListPropertyRequest() {
        return new AppendStringListPropertyRequest();
    }

    /**
     * Create an instance of {@link GetStringListPropertyResponse }
     * 
     */
    public GetStringListPropertyResponse createGetStringListPropertyResponse() {
        return new GetStringListPropertyResponse();
    }

    /**
     * Create an instance of {@link ChangeStorageAreaRequest }
     * 
     */
    public ChangeStorageAreaRequest createChangeStorageAreaRequest() {
        return new ChangeStorageAreaRequest();
    }

    /**
     * Create an instance of {@link DocumentsStringListPropertiesResponse }
     * 
     */
    public DocumentsStringListPropertiesResponse createDocumentsStringListPropertiesResponse() {
        return new DocumentsStringListPropertiesResponse();
    }

    /**
     * Create an instance of {@link CancelDeferredSignRequest }
     * 
     */
    public CancelDeferredSignRequest createCancelDeferredSignRequest() {
        return new CancelDeferredSignRequest();
    }

    /**
     * Create an instance of {@link CopyDocumentRequest }
     * 
     */
    public CopyDocumentRequest createCopyDocumentRequest() {
        return new CopyDocumentRequest();
    }

    /**
     * Create an instance of {@link CreateDefferedAnnotationsRequest }
     * 
     */
    public CreateDefferedAnnotationsRequest createCreateDefferedAnnotationsRequest() {
        return new CreateDefferedAnnotationsRequest();
    }

    /**
     * Create an instance of {@link CreateFolderRequest }
     * 
     */
    public CreateFolderRequest createCreateFolderRequest() {
        return new CreateFolderRequest();
    }

    /**
     * Create an instance of {@link CreateMultipleAnnotationsRequest }
     * 
     */
    public CreateMultipleAnnotationsRequest createCreateMultipleAnnotationsRequest() {
        return new CreateMultipleAnnotationsRequest();
    }

    /**
     * Create an instance of {@link RetrieveAnnotationRequest }
     * 
     */
    public RetrieveAnnotationRequest createRetrieveAnnotationRequest() {
        return new RetrieveAnnotationRequest();
    }

    /**
     * Create an instance of {@link DeleteDocumentVersionRequest }
     * 
     */
    public DeleteDocumentVersionRequest createDeleteDocumentVersionRequest() {
        return new DeleteDocumentVersionRequest();
    }

    /**
     * Create an instance of {@link DeleteDocumentsRequest }
     * 
     */
    public DeleteDocumentsRequest createDeleteDocumentsRequest() {
        return new DeleteDocumentsRequest();
    }

    /**
     * Create an instance of {@link DigestInfoArray }
     * 
     */
    public DigestInfoArray createDigestInfoArray() {
        return new DigestInfoArray();
    }

    /**
     * Create an instance of {@link DocumentClassArray }
     * 
     */
    public DocumentClassArray createDocumentClassArray() {
        return new DocumentClassArray();
    }

    /**
     * Create an instance of {@link DocumentsPropertiesResponse }
     * 
     */
    public DocumentsPropertiesResponse createDocumentsPropertiesResponse() {
        return new DocumentsPropertiesResponse();
    }

    /**
     * Create an instance of {@link ErrorMessageException }
     * 
     */
    public ErrorMessageException createErrorMessageException() {
        return new ErrorMessageException();
    }

    /**
     * Create an instance of {@link FolderDocumentRequest }
     * 
     */
    public FolderDocumentRequest createFolderDocumentRequest() {
        return new FolderDocumentRequest();
    }

    /**
     * Create an instance of {@link com.wsdl.Annotations }
     * 
     */
    public com.wsdl.Annotations createAnnotations() {
        return new com.wsdl.Annotations();
    }

    /**
     * Create an instance of {@link GetDocumentsPropertiesRequest }
     * 
     */
    public GetDocumentsPropertiesRequest createGetDocumentsPropertiesRequest() {
        return new GetDocumentsPropertiesRequest();
    }

    /**
     * Create an instance of {@link GetDocumentRequest }
     * 
     */
    public GetDocumentRequest createGetDocumentRequest() {
        return new GetDocumentRequest();
    }

    /**
     * Create an instance of {@link GetDocumentPermissionsRequest }
     * 
     */
    public GetDocumentPermissionsRequest createGetDocumentPermissionsRequest() {
        return new GetDocumentPermissionsRequest();
    }

    /**
     * Create an instance of {@link GetFilesInFolderRequest }
     * 
     */
    public GetFilesInFolderRequest createGetFilesInFolderRequest() {
        return new GetFilesInFolderRequest();
    }

    /**
     * Create an instance of {@link GetFolderPermissionsRequest }
     * 
     */
    public GetFolderPermissionsRequest createGetFolderPermissionsRequest() {
        return new GetFolderPermissionsRequest();
    }

    /**
     * Create an instance of {@link GetFoldersOfDocumentRequest }
     * 
     */
    public GetFoldersOfDocumentRequest createGetFoldersOfDocumentRequest() {
        return new GetFoldersOfDocumentRequest();
    }

    /**
     * Create an instance of {@link GetParentFolderRequest }
     * 
     */
    public GetParentFolderRequest createGetParentFolderRequest() {
        return new GetParentFolderRequest();
    }

    /**
     * Create an instance of {@link GetStringListPropertyRequest }
     * 
     */
    public GetStringListPropertyRequest createGetStringListPropertyRequest() {
        return new GetStringListPropertyRequest();
    }

    /**
     * Create an instance of {@link MultipleAnnotationsArray }
     * 
     */
    public MultipleAnnotationsArray createMultipleAnnotationsArray() {
        return new MultipleAnnotationsArray();
    }

    /**
     * Create an instance of {@link SearchDocumentsRequest }
     * 
     */
    public SearchDocumentsRequest createSearchDocumentsRequest() {
        return new SearchDocumentsRequest();
    }

    /**
     * Create an instance of {@link SignatureStatusArray }
     * 
     */
    public SignatureStatusArray createSignatureStatusArray() {
        return new SignatureStatusArray();
    }

    /**
     * Create an instance of {@link ValidateCertificateResponse }
     * 
     */
    public ValidateCertificateResponse createValidateCertificateResponse() {
        return new ValidateCertificateResponse();
    }

    /**
     * Create an instance of {@link ValidateDocumentRequest }
     * 
     */
    public ValidateDocumentRequest createValidateDocumentRequest() {
        return new ValidateDocumentRequest();
    }

    /**
     * Create an instance of {@link BooleanArray }
     * 
     */
    public BooleanArray createBooleanArray() {
        return new BooleanArray();
    }

    /**
     * Create an instance of {@link ValidateExternalSignature }
     * 
     */
    public ValidateExternalSignature createValidateExternalSignature() {
        return new ValidateExternalSignature();
    }

    /**
     * Create an instance of {@link SignatureInfoObjResponse }
     * 
     */
    public SignatureInfoObjResponse createSignatureInfoObjResponse() {
        return new SignatureInfoObjResponse();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link AnnotationRequest }
     * 
     */
    public AnnotationRequest createAnnotationRequest() {
        return new AnnotationRequest();
    }

    /**
     * Create an instance of {@link Version }
     * 
     */
    public Version createVersion() {
        return new Version();
    }

    /**
     * Create an instance of {@link Permission }
     * 
     */
    public Permission createPermission() {
        return new Permission();
    }

    /**
     * Create an instance of {@link DocumentStringListProperties }
     * 
     */
    public DocumentStringListProperties createDocumentStringListProperties() {
        return new DocumentStringListProperties();
    }

    /**
     * Create an instance of {@link StringListProperty }
     * 
     */
    public StringListProperty createStringListProperty() {
        return new StringListProperty();
    }

    /**
     * Create an instance of {@link DocumentClass }
     * 
     */
    public DocumentClass createDocumentClass() {
        return new DocumentClass();
    }

    /**
     * Create an instance of {@link Annotation }
     * 
     */
    public Annotation createAnnotation() {
        return new Annotation();
    }

    /**
     * Create an instance of {@link MultipleAnnotations }
     * 
     */
    public MultipleAnnotations createMultipleAnnotations() {
        return new MultipleAnnotations();
    }

    /**
     * Create an instance of {@link SignatureStatus }
     * 
     */
    public SignatureStatus createSignatureStatus() {
        return new SignatureStatus();
    }

    /**
     * Create an instance of {@link DigestInfo }
     * 
     */
    public DigestInfo createDigestInfo() {
        return new DigestInfo();
    }

    /**
     * Create an instance of {@link Base64Binary }
     * 
     */
    public Base64Binary createBase64Binary() {
        return new Base64Binary();
    }

    /**
     * Create an instance of {@link HexBinary }
     * 
     */
    public HexBinary createHexBinary() {
        return new HexBinary();
    }

    /**
     * Create an instance of {@link ValidateDocumentInfo.Properties }
     * 
     */
    public ValidateDocumentInfo.Properties createValidateDocumentInfoProperties() {
        return new ValidateDocumentInfo.Properties();
    }

    /**
     * Create an instance of {@link DocumentProperties.Properties }
     * 
     */
    public DocumentProperties.Properties createDocumentPropertiesProperties() {
        return new DocumentProperties.Properties();
    }

    /**
     * Create an instance of {@link PartAnnotationRequest.Properties }
     * 
     */
    public PartAnnotationRequest.Properties createPartAnnotationRequestProperties() {
        return new PartAnnotationRequest.Properties();
    }

    /**
     * Create an instance of {@link ValidateDocumentWithInfoResponse.ValidateInfo }
     * 
     */
    public ValidateDocumentWithInfoResponse.ValidateInfo createValidateDocumentWithInfoResponseValidateInfo() {
        return new ValidateDocumentWithInfoResponse.ValidateInfo();
    }

    /**
     * Create an instance of {@link UpdateDocumentRequest.Properties }
     * 
     */
    public UpdateDocumentRequest.Properties createUpdateDocumentRequestProperties() {
        return new UpdateDocumentRequest.Properties();
    }

    /**
     * Create an instance of {@link UpdatePropertiesRequest.Properties }
     * 
     */
    public UpdatePropertiesRequest.Properties createUpdatePropertiesRequestProperties() {
        return new UpdatePropertiesRequest.Properties();
    }

    /**
     * Create an instance of {@link SetFolderPermissionsRequest.Permissions }
     * 
     */
    public SetFolderPermissionsRequest.Permissions createSetFolderPermissionsRequestPermissions() {
        return new SetFolderPermissionsRequest.Permissions();
    }

    /**
     * Create an instance of {@link SetDocumentPermissionsRequest.Permissions }
     * 
     */
    public SetDocumentPermissionsRequest.Permissions createSetDocumentPermissionsRequestPermissions() {
        return new SetDocumentPermissionsRequest.Permissions();
    }

    /**
     * Create an instance of {@link SearchDocumentsInFolderRequest.DocumentClasses }
     * 
     */
    public SearchDocumentsInFolderRequest.DocumentClasses createSearchDocumentsInFolderRequestDocumentClasses() {
        return new SearchDocumentsInFolderRequest.DocumentClasses();
    }

    /**
     * Create an instance of {@link RetrieveDocAndAnnotationsResponse.Annotations }
     * 
     */
    public RetrieveDocAndAnnotationsResponse.Annotations createRetrieveDocAndAnnotationsResponseAnnotations() {
        return new RetrieveDocAndAnnotationsResponse.Annotations();
    }

    /**
     * Create an instance of {@link GetPermissionsResponse.Permissions }
     * 
     */
    public GetPermissionsResponse.Permissions createGetPermissionsResponsePermissions() {
        return new GetPermissionsResponse.Permissions();
    }

    /**
     * Create an instance of {@link GetDocumentResponse.Properties }
     * 
     */
    public GetDocumentResponse.Properties createGetDocumentResponseProperties() {
        return new GetDocumentResponse.Properties();
    }

    /**
     * Create an instance of {@link GetDocumentPropertiesResponse.Properties }
     * 
     */
    public GetDocumentPropertiesResponse.Properties createGetDocumentPropertiesResponseProperties() {
        return new GetDocumentPropertiesResponse.Properties();
    }

    /**
     * Create an instance of {@link GetDigestRequest.Documents }
     * 
     */
    public GetDigestRequest.Documents createGetDigestRequestDocuments() {
        return new GetDigestRequest.Documents();
    }

    /**
     * Create an instance of {@link GetAnnotationsRequest.Properties }
     * 
     */
    public GetAnnotationsRequest.Properties createGetAnnotationsRequestProperties() {
        return new GetAnnotationsRequest.Properties();
    }

    /**
     * Create an instance of {@link FindDocumentsRequest.Properties.Entry }
     * 
     */
    public FindDocumentsRequest.Properties.Entry createFindDocumentsRequestPropertiesEntry() {
        return new FindDocumentsRequest.Properties.Entry();
    }

    /**
     * Create an instance of {@link CreateDocumentRequest.Properties }
     * 
     */
    public CreateDocumentRequest.Properties createCreateDocumentRequestProperties() {
        return new CreateDocumentRequest.Properties();
    }

    /**
     * Create an instance of {@link CreateAnnotationRequest.Properties }
     * 
     */
    public CreateAnnotationRequest.Properties createCreateAnnotationRequestProperties() {
        return new CreateAnnotationRequest.Properties();
    }

    /**
     * Create an instance of {@link ChangeStorageAreaResponse.Success }
     * 
     */
    public ChangeStorageAreaResponse.Success createChangeStorageAreaResponseSuccess() {
        return new ChangeStorageAreaResponse.Success();
    }

    /**
     * Create an instance of {@link ChangeStorageAreaResponse.Failed }
     * 
     */
    public ChangeStorageAreaResponse.Failed createChangeStorageAreaResponseFailed() {
        return new ChangeStorageAreaResponse.Failed();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "Annotation")
    public JAXBElement<byte[]> createAnnotation(byte[] value) {
        return new JAXBElement<byte[]>(_Annotation_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "AnnotationId")
    public JAXBElement<String> createAnnotationId(String value) {
        return new JAXBElement<String>(_AnnotationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "AnnotationIds")
    public JAXBElement<StringArray> createAnnotationIds(StringArray value) {
        return new JAXBElement<StringArray>(_AnnotationIds_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppendStringListPropertyRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AppendStringListPropertyRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "AppendStringListProperty")
    public JAXBElement<AppendStringListPropertyRequest> createAppendStringListProperty(AppendStringListPropertyRequest value) {
        return new JAXBElement<AppendStringListPropertyRequest>(_AppendStringListProperty_QNAME, AppendStringListPropertyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStringListPropertyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStringListPropertyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "AppendStringListPropertyResponse")
    public JAXBElement<GetStringListPropertyResponse> createAppendStringListPropertyResponse(GetStringListPropertyResponse value) {
        return new JAXBElement<GetStringListPropertyResponse>(_AppendStringListPropertyResponse_QNAME, GetStringListPropertyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStorageAreaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeStorageAreaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "ArchiveDocuments")
    public JAXBElement<ChangeStorageAreaRequest> createArchiveDocuments(ChangeStorageAreaRequest value) {
        return new JAXBElement<ChangeStorageAreaRequest>(_ArchiveDocuments_QNAME, ChangeStorageAreaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStorageAreaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeStorageAreaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "ArchiveDocumentsResponse")
    public JAXBElement<ChangeStorageAreaResponse> createArchiveDocumentsResponse(ChangeStorageAreaResponse value) {
        return new JAXBElement<ChangeStorageAreaResponse>(_ArchiveDocumentsResponse_QNAME, ChangeStorageAreaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentsStringListPropertiesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentsStringListPropertiesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "AuthPropertiesResponse")
    public JAXBElement<DocumentsStringListPropertiesResponse> createAuthPropertiesResponse(DocumentsStringListPropertiesResponse value) {
        return new JAXBElement<DocumentsStringListPropertiesResponse>(_AuthPropertiesResponse_QNAME, DocumentsStringListPropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelDeferredSignRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelDeferredSignRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "CancelDeferredSign")
    public JAXBElement<CancelDeferredSignRequest> createCancelDeferredSign(CancelDeferredSignRequest value) {
        return new JAXBElement<CancelDeferredSignRequest>(_CancelDeferredSign_QNAME, CancelDeferredSignRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "CancelDeferredSignResult")
    public JAXBElement<Boolean> createCancelDeferredSignResult(Boolean value) {
        return new JAXBElement<Boolean>(_CancelDeferredSignResult_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CopyDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CopyDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "CopyDocument")
    public JAXBElement<CopyDocumentRequest> createCopyDocument(CopyDocumentRequest value) {
        return new JAXBElement<CopyDocumentRequest>(_CopyDocument_QNAME, CopyDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAnnotationRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateAnnotationRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "CreateAnnotation")
    public JAXBElement<CreateAnnotationRequest> createCreateAnnotation(CreateAnnotationRequest value) {
        return new JAXBElement<CreateAnnotationRequest>(_CreateAnnotation_QNAME, CreateAnnotationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDefferedAnnotationsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDefferedAnnotationsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "CreateDeferredAnnotationsRequest")
    public JAXBElement<CreateDefferedAnnotationsRequest> createCreateDeferredAnnotationsRequest(CreateDefferedAnnotationsRequest value) {
        return new JAXBElement<CreateDefferedAnnotationsRequest>(_CreateDeferredAnnotationsRequest_QNAME, CreateDefferedAnnotationsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "CreateDocument")
    public JAXBElement<CreateDocumentRequest> createCreateDocument(CreateDocumentRequest value) {
        return new JAXBElement<CreateDocumentRequest>(_CreateDocument_QNAME, CreateDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateFolderRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateFolderRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "CreateFolder")
    public JAXBElement<CreateFolderRequest> createCreateFolder(CreateFolderRequest value) {
        return new JAXBElement<CreateFolderRequest>(_CreateFolder_QNAME, CreateFolderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMultipleAnnotationsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateMultipleAnnotationsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "CreateMultipleAnnotationsRequest")
    public JAXBElement<CreateMultipleAnnotationsRequest> createCreateMultipleAnnotationsRequest(CreateMultipleAnnotationsRequest value) {
        return new JAXBElement<CreateMultipleAnnotationsRequest>(_CreateMultipleAnnotationsRequest_QNAME, CreateMultipleAnnotationsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "CustomID")
    public JAXBElement<String> createCustomID(String value) {
        return new JAXBElement<String>(_CustomID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "CustomIDs")
    public JAXBElement<StringArray> createCustomIDs(StringArray value) {
        return new JAXBElement<StringArray>(_CustomIDs_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "CustomId")
    public JAXBElement<String> createCustomId(String value) {
        return new JAXBElement<String>(_CustomId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "DeferredTaskId")
    public JAXBElement<String> createDeferredTaskId(String value) {
        return new JAXBElement<String>(_DeferredTaskId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveAnnotationRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveAnnotationRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "DeleteAnnotation")
    public JAXBElement<RetrieveAnnotationRequest> createDeleteAnnotation(RetrieveAnnotationRequest value) {
        return new JAXBElement<RetrieveAnnotationRequest>(_DeleteAnnotation_QNAME, RetrieveAnnotationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "DeleteAnnotationResult")
    public JAXBElement<Boolean> createDeleteAnnotationResult(Boolean value) {
        return new JAXBElement<Boolean>(_DeleteAnnotationResult_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocumentVersionRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDocumentVersionRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "DeleteDocumentVersion")
    public JAXBElement<DeleteDocumentVersionRequest> createDeleteDocumentVersion(DeleteDocumentVersionRequest value) {
        return new JAXBElement<DeleteDocumentVersionRequest>(_DeleteDocumentVersion_QNAME, DeleteDocumentVersionRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "DeleteDocumentVersionResponse")
    public JAXBElement<String> createDeleteDocumentVersionResponse(String value) {
        return new JAXBElement<String>(_DeleteDocumentVersionResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDocumentsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteDocumentsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "DeleteDocuments")
    public JAXBElement<DeleteDocumentsRequest> createDeleteDocuments(DeleteDocumentsRequest value) {
        return new JAXBElement<DeleteDocumentsRequest>(_DeleteDocuments_QNAME, DeleteDocumentsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DigestInfoArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DigestInfoArray }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "DigestInfoArray")
    public JAXBElement<DigestInfoArray> createDigestInfoArray(DigestInfoArray value) {
        return new JAXBElement<DigestInfoArray>(_DigestInfoArray_QNAME, DigestInfoArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentClassArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentClassArray }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "DocumentClassArray")
    public JAXBElement<DocumentClassArray> createDocumentClassArray(DocumentClassArray value) {
        return new JAXBElement<DocumentClassArray>(_DocumentClassArray_QNAME, DocumentClassArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "DocumentData")
    public JAXBElement<byte[]> createDocumentData(byte[] value) {
        return new JAXBElement<byte[]>(_DocumentData_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "DocumentID")
    public JAXBElement<String> createDocumentID(String value) {
        return new JAXBElement<String>(_DocumentID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "DocumentIDs")
    public JAXBElement<StringArray> createDocumentIDs(StringArray value) {
        return new JAXBElement<StringArray>(_DocumentIDs_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "DocumentsInFolder")
    public JAXBElement<StringArray> createDocumentsInFolder(StringArray value) {
        return new JAXBElement<StringArray>(_DocumentsInFolder_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentsPropertiesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentsPropertiesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "DocumentsPropertiesResponse")
    public JAXBElement<DocumentsPropertiesResponse> createDocumentsPropertiesResponse(DocumentsPropertiesResponse value) {
        return new JAXBElement<DocumentsPropertiesResponse>(_DocumentsPropertiesResponse_QNAME, DocumentsPropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorMessageException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErrorMessageException }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "ErrorMessageException")
    public JAXBElement<ErrorMessageException> createErrorMessageException(ErrorMessageException value) {
        return new JAXBElement<ErrorMessageException>(_ErrorMessageException_QNAME, ErrorMessageException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "FileNetId")
    public JAXBElement<String> createFileNetId(String value) {
        return new JAXBElement<String>(_FileNetId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDocumentsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindDocumentsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "FindDocuments")
    public JAXBElement<FindDocumentsRequest> createFindDocuments(FindDocumentsRequest value) {
        return new JAXBElement<FindDocumentsRequest>(_FindDocuments_QNAME, FindDocumentsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FolderDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "FolderDocument")
    public JAXBElement<FolderDocumentRequest> createFolderDocument(FolderDocumentRequest value) {
        return new JAXBElement<FolderDocumentRequest>(_FolderDocument_QNAME, FolderDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "FolderDocumentResponse")
    public JAXBElement<String> createFolderDocumentResponse(String value) {
        return new JAXBElement<String>(_FolderDocumentResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "FolderPath")
    public JAXBElement<String> createFolderPath(String value) {
        return new JAXBElement<String>(_FolderPath_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "FoldersInFolder")
    public JAXBElement<StringArray> createFoldersInFolder(StringArray value) {
        return new JAXBElement<StringArray>(_FoldersInFolder_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "FoldersOfDocument")
    public JAXBElement<StringArray> createFoldersOfDocument(StringArray value) {
        return new JAXBElement<StringArray>(_FoldersOfDocument_QNAME, StringArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentsPropertiesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentsPropertiesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "FoundedDocuments")
    public JAXBElement<DocumentsPropertiesResponse> createFoundedDocuments(DocumentsPropertiesResponse value) {
        return new JAXBElement<DocumentsPropertiesResponse>(_FoundedDocuments_QNAME, DocumentsPropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAnnotationsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAnnotationsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetAnnotations")
    public JAXBElement<GetAnnotationsRequest> createGetAnnotations(GetAnnotationsRequest value) {
        return new JAXBElement<GetAnnotationsRequest>(_GetAnnotations_QNAME, GetAnnotationsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link com.wsdl.Annotations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link com.wsdl.Annotations }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetAnnotationsResponse")
    public JAXBElement<com.wsdl.Annotations> createGetAnnotationsResponse(com.wsdl.Annotations value) {
        return new JAXBElement<com.wsdl.Annotations>(_GetAnnotationsResponse_QNAME, com.wsdl.Annotations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentsPropertiesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentsPropertiesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetAuthProperties")
    public JAXBElement<GetDocumentsPropertiesRequest> createGetAuthProperties(GetDocumentsPropertiesRequest value) {
        return new JAXBElement<GetDocumentsPropertiesRequest>(_GetAuthProperties_QNAME, GetDocumentsPropertiesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetChildren")
    public JAXBElement<GetDocumentRequest> createGetChildren(GetDocumentRequest value) {
        return new JAXBElement<GetDocumentRequest>(_GetChildren_QNAME, GetDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetConvertedDocument")
    public JAXBElement<GetDocumentRequest> createGetConvertedDocument(GetDocumentRequest value) {
        return new JAXBElement<GetDocumentRequest>(_GetConvertedDocument_QNAME, GetDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetCustomId")
    public JAXBElement<GetDocumentRequest> createGetCustomId(GetDocumentRequest value) {
        return new JAXBElement<GetDocumentRequest>(_GetCustomId_QNAME, GetDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDigestRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDigestRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetDigest")
    public JAXBElement<GetDigestRequest> createGetDigest(GetDigestRequest value) {
        return new JAXBElement<GetDigestRequest>(_GetDigest_QNAME, GetDigestRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetDocument")
    public JAXBElement<GetDocumentRequest> createGetDocument(GetDocumentRequest value) {
        return new JAXBElement<GetDocumentRequest>(_GetDocument_QNAME, GetDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetDocumentData")
    public JAXBElement<GetDocumentRequest> createGetDocumentData(GetDocumentRequest value) {
        return new JAXBElement<GetDocumentRequest>(_GetDocumentData_QNAME, GetDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentPermissionsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentPermissionsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetDocumentPermissions")
    public JAXBElement<GetDocumentPermissionsRequest> createGetDocumentPermissions(GetDocumentPermissionsRequest value) {
        return new JAXBElement<GetDocumentPermissionsRequest>(_GetDocumentPermissions_QNAME, GetDocumentPermissionsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetDocumentProperties")
    public JAXBElement<GetDocumentRequest> createGetDocumentProperties(GetDocumentRequest value) {
        return new JAXBElement<GetDocumentRequest>(_GetDocumentProperties_QNAME, GetDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentPropertiesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentPropertiesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetDocumentPropertiesResponse")
    public JAXBElement<GetDocumentPropertiesResponse> createGetDocumentPropertiesResponse(GetDocumentPropertiesResponse value) {
        return new JAXBElement<GetDocumentPropertiesResponse>(_GetDocumentPropertiesResponse_QNAME, GetDocumentPropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetDocumentResponse")
    public JAXBElement<GetDocumentResponse> createGetDocumentResponse(GetDocumentResponse value) {
        return new JAXBElement<GetDocumentResponse>(_GetDocumentResponse_QNAME, GetDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilesInFolderRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFilesInFolderRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetDocumentsInFolder")
    public JAXBElement<GetFilesInFolderRequest> createGetDocumentsInFolder(GetFilesInFolderRequest value) {
        return new JAXBElement<GetFilesInFolderRequest>(_GetDocumentsInFolder_QNAME, GetFilesInFolderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentsPropertiesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentsPropertiesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetDocumentsProperties")
    public JAXBElement<GetDocumentsPropertiesRequest> createGetDocumentsProperties(GetDocumentsPropertiesRequest value) {
        return new JAXBElement<GetDocumentsPropertiesRequest>(_GetDocumentsProperties_QNAME, GetDocumentsPropertiesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetFileNetId")
    public JAXBElement<GetDocumentRequest> createGetFileNetId(GetDocumentRequest value) {
        return new JAXBElement<GetDocumentRequest>(_GetFileNetId_QNAME, GetDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFolderPermissionsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFolderPermissionsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetFolderPermissions")
    public JAXBElement<GetFolderPermissionsRequest> createGetFolderPermissions(GetFolderPermissionsRequest value) {
        return new JAXBElement<GetFolderPermissionsRequest>(_GetFolderPermissions_QNAME, GetFolderPermissionsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFilesInFolderRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFilesInFolderRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetFoldersInFolder")
    public JAXBElement<GetFilesInFolderRequest> createGetFoldersInFolder(GetFilesInFolderRequest value) {
        return new JAXBElement<GetFilesInFolderRequest>(_GetFoldersInFolder_QNAME, GetFilesInFolderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFoldersOfDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetFoldersOfDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetFoldersOfDocument")
    public JAXBElement<GetFoldersOfDocumentRequest> createGetFoldersOfDocument(GetFoldersOfDocumentRequest value) {
        return new JAXBElement<GetFoldersOfDocumentRequest>(_GetFoldersOfDocument_QNAME, GetFoldersOfDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParentFolderRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetParentFolderRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetParentFolder")
    public JAXBElement<GetParentFolderRequest> createGetParentFolder(GetParentFolderRequest value) {
        return new JAXBElement<GetParentFolderRequest>(_GetParentFolder_QNAME, GetParentFolderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetSignedDocumentData")
    public JAXBElement<GetDocumentRequest> createGetSignedDocumentData(GetDocumentRequest value) {
        return new JAXBElement<GetDocumentRequest>(_GetSignedDocumentData_QNAME, GetDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStringListPropertyRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStringListPropertyRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetStringListProperty")
    public JAXBElement<GetStringListPropertyRequest> createGetStringListProperty(GetStringListPropertyRequest value) {
        return new JAXBElement<GetStringListPropertyRequest>(_GetStringListProperty_QNAME, GetStringListPropertyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStringListPropertyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStringListPropertyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "GetStringListPropertyResponse")
    public JAXBElement<GetStringListPropertyResponse> createGetStringListPropertyResponse(GetStringListPropertyResponse value) {
        return new JAXBElement<GetStringListPropertyResponse>(_GetStringListPropertyResponse_QNAME, GetStringListPropertyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultipleAnnotationsArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultipleAnnotationsArray }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "MultipleAnnotationsArray")
    public JAXBElement<MultipleAnnotationsArray> createMultipleAnnotationsArray(MultipleAnnotationsArray value) {
        return new JAXBElement<MultipleAnnotationsArray>(_MultipleAnnotationsArray_QNAME, MultipleAnnotationsArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "NumOfDeleted")
    public JAXBElement<Integer> createNumOfDeleted(Integer value) {
        return new JAXBElement<Integer>(_NumOfDeleted_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "ParentFolder")
    public JAXBElement<String> createParentFolder(String value) {
        return new JAXBElement<String>(_ParentFolder_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPermissionsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPermissionsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "PermissionsOfDocument")
    public JAXBElement<GetPermissionsResponse> createPermissionsOfDocument(GetPermissionsResponse value) {
        return new JAXBElement<GetPermissionsResponse>(_PermissionsOfDocument_QNAME, GetPermissionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPermissionsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPermissionsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "PermissionsOfFolder")
    public JAXBElement<GetPermissionsResponse> createPermissionsOfFolder(GetPermissionsResponse value) {
        return new JAXBElement<GetPermissionsResponse>(_PermissionsOfFolder_QNAME, GetPermissionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppendStringListPropertyRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AppendStringListPropertyRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "RemoveFromStringListProperty")
    public JAXBElement<AppendStringListPropertyRequest> createRemoveFromStringListProperty(AppendStringListPropertyRequest value) {
        return new JAXBElement<AppendStringListPropertyRequest>(_RemoveFromStringListProperty_QNAME, AppendStringListPropertyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStringListPropertyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStringListPropertyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "RemoveFromStringListPropertyResponse")
    public JAXBElement<GetStringListPropertyResponse> createRemoveFromStringListPropertyResponse(GetStringListPropertyResponse value) {
        return new JAXBElement<GetStringListPropertyResponse>(_RemoveFromStringListPropertyResponse_QNAME, GetStringListPropertyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStorageAreaRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeStorageAreaRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "RestoreDocuments")
    public JAXBElement<ChangeStorageAreaRequest> createRestoreDocuments(ChangeStorageAreaRequest value) {
        return new JAXBElement<ChangeStorageAreaRequest>(_RestoreDocuments_QNAME, ChangeStorageAreaRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeStorageAreaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ChangeStorageAreaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "RestoreDocumentsResponse")
    public JAXBElement<ChangeStorageAreaResponse> createRestoreDocumentsResponse(ChangeStorageAreaResponse value) {
        return new JAXBElement<ChangeStorageAreaResponse>(_RestoreDocumentsResponse_QNAME, ChangeStorageAreaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveAnnotationRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveAnnotationRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "RetrieveAnnotation")
    public JAXBElement<RetrieveAnnotationRequest> createRetrieveAnnotation(RetrieveAnnotationRequest value) {
        return new JAXBElement<RetrieveAnnotationRequest>(_RetrieveAnnotation_QNAME, RetrieveAnnotationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "RetrieveAnnotations")
    public JAXBElement<GetDocumentRequest> createRetrieveAnnotations(GetDocumentRequest value) {
        return new JAXBElement<GetDocumentRequest>(_RetrieveAnnotations_QNAME, GetDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "RetrieveDocAndAnnotations")
    public JAXBElement<GetDocumentRequest> createRetrieveDocAndAnnotations(GetDocumentRequest value) {
        return new JAXBElement<GetDocumentRequest>(_RetrieveDocAndAnnotations_QNAME, GetDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDocAndAnnotationsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveDocAndAnnotationsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "RetrieveDocAndAnnotationsResponse")
    public JAXBElement<RetrieveDocAndAnnotationsResponse> createRetrieveDocAndAnnotationsResponse(RetrieveDocAndAnnotationsResponse value) {
        return new JAXBElement<RetrieveDocAndAnnotationsResponse>(_RetrieveDocAndAnnotationsResponse_QNAME, RetrieveDocAndAnnotationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAnnotationsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAnnotationsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "RetrieveDocumentAndSignatures")
    public JAXBElement<GetAnnotationsRequest> createRetrieveDocumentAndSignatures(GetAnnotationsRequest value) {
        return new JAXBElement<GetAnnotationsRequest>(_RetrieveDocumentAndSignatures_QNAME, GetAnnotationsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveDocAndAnnotationsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveDocAndAnnotationsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "RetrieveDocumentAndSignaturesResponse")
    public JAXBElement<RetrieveDocAndAnnotationsResponse> createRetrieveDocumentAndSignaturesResponse(RetrieveDocAndAnnotationsResponse value) {
        return new JAXBElement<RetrieveDocAndAnnotationsResponse>(_RetrieveDocumentAndSignaturesResponse_QNAME, RetrieveDocAndAnnotationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDocumentsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchDocumentsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "SearchDocuments")
    public JAXBElement<SearchDocumentsRequest> createSearchDocuments(SearchDocumentsRequest value) {
        return new JAXBElement<SearchDocumentsRequest>(_SearchDocuments_QNAME, SearchDocumentsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchDocumentsInFolderRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SearchDocumentsInFolderRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "SearchDocumentsInFolder")
    public JAXBElement<SearchDocumentsInFolderRequest> createSearchDocumentsInFolder(SearchDocumentsInFolderRequest value) {
        return new JAXBElement<SearchDocumentsInFolderRequest>(_SearchDocumentsInFolder_QNAME, SearchDocumentsInFolderRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDocumentPermissionsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetDocumentPermissionsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "SetDocumentPermissions")
    public JAXBElement<SetDocumentPermissionsRequest> createSetDocumentPermissions(SetDocumentPermissionsRequest value) {
        return new JAXBElement<SetDocumentPermissionsRequest>(_SetDocumentPermissions_QNAME, SetDocumentPermissionsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "SetDocumentPermissionsResponse")
    public JAXBElement<String> createSetDocumentPermissionsResponse(String value) {
        return new JAXBElement<String>(_SetDocumentPermissionsResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetFolderPermissionsRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetFolderPermissionsRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "SetFolderPermissions")
    public JAXBElement<SetFolderPermissionsRequest> createSetFolderPermissions(SetFolderPermissionsRequest value) {
        return new JAXBElement<SetFolderPermissionsRequest>(_SetFolderPermissions_QNAME, SetFolderPermissionsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "SetFolderPermissionsResponse")
    public JAXBElement<String> createSetFolderPermissionsResponse(String value) {
        return new JAXBElement<String>(_SetFolderPermissionsResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureStatusArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatureStatusArray }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "SignatureStatusArray")
    public JAXBElement<SignatureStatusArray> createSignatureStatusArray(SignatureStatusArray value) {
        return new JAXBElement<SignatureStatusArray>(_SignatureStatusArray_QNAME, SignatureStatusArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "SignedDocumentData")
    public JAXBElement<byte[]> createSignedDocumentData(byte[] value) {
        return new JAXBElement<byte[]>(_SignedDocumentData_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePropertiesRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdatePropertiesRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "UpdateDocumentProperties")
    public JAXBElement<UpdatePropertiesRequest> createUpdateDocumentProperties(UpdatePropertiesRequest value) {
        return new JAXBElement<UpdatePropertiesRequest>(_UpdateDocumentProperties_QNAME, UpdatePropertiesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "UpdateDocumentPropertiesResponse")
    public JAXBElement<String> createUpdateDocumentPropertiesResponse(String value) {
        return new JAXBElement<String>(_UpdateDocumentPropertiesResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UpdateDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "UpdateDocumentVersion")
    public JAXBElement<UpdateDocumentRequest> createUpdateDocumentVersion(UpdateDocumentRequest value) {
        return new JAXBElement<UpdateDocumentRequest>(_UpdateDocumentVersion_QNAME, UpdateDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "UpdatedId")
    public JAXBElement<String> createUpdatedId(String value) {
        return new JAXBElement<String>(_UpdatedId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "ValidateCertificate")
    public JAXBElement<byte[]> createValidateCertificate(byte[] value) {
        return new JAXBElement<byte[]>(_ValidateCertificate_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateCertificateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateCertificateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "ValidateCertificateResponse")
    public JAXBElement<ValidateCertificateResponse> createValidateCertificateResponse(ValidateCertificateResponse value) {
        return new JAXBElement<ValidateCertificateResponse>(_ValidateCertificateResponse_QNAME, ValidateCertificateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "ValidateDocument")
    public JAXBElement<GetDocumentRequest> createValidateDocument(GetDocumentRequest value) {
        return new JAXBElement<GetDocumentRequest>(_ValidateDocument_QNAME, GetDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "ValidateDocumentSignatures")
    public JAXBElement<ValidateDocumentRequest> createValidateDocumentSignatures(ValidateDocumentRequest value) {
        return new JAXBElement<ValidateDocumentRequest>(_ValidateDocumentSignatures_QNAME, ValidateDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanArray }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BooleanArray }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "ValidateDocumentStatuses")
    public JAXBElement<BooleanArray> createValidateDocumentStatuses(BooleanArray value) {
        return new JAXBElement<BooleanArray>(_ValidateDocumentStatuses_QNAME, BooleanArray.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "ValidateDocumentWithInfo")
    public JAXBElement<GetDocumentRequest> createValidateDocumentWithInfo(GetDocumentRequest value) {
        return new JAXBElement<GetDocumentRequest>(_ValidateDocumentWithInfo_QNAME, GetDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateDocumentWithInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateDocumentWithInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "ValidateDocumentWithInfoResponse")
    public JAXBElement<ValidateDocumentWithInfoResponse> createValidateDocumentWithInfoResponse(ValidateDocumentWithInfoResponse value) {
        return new JAXBElement<ValidateDocumentWithInfoResponse>(_ValidateDocumentWithInfoResponse_QNAME, ValidateDocumentWithInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidateExternalSignature }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidateExternalSignature }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "ValidateExternalSignature")
    public JAXBElement<ValidateExternalSignature> createValidateExternalSignature(ValidateExternalSignature value) {
        return new JAXBElement<ValidateExternalSignature>(_ValidateExternalSignature_QNAME, ValidateExternalSignature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureInfoObjResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatureInfoObjResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "ValidateExternalSignatureResponse")
    public JAXBElement<SignatureInfoObjResponse> createValidateExternalSignatureResponse(SignatureInfoObjResponse value) {
        return new JAXBElement<SignatureInfoObjResponse>(_ValidateExternalSignatureResponse_QNAME, SignatureInfoObjResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDocumentRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "moveDocument")
    public JAXBElement<GetDocumentRequest> createMoveDocument(GetDocumentRequest value) {
        return new JAXBElement<GetDocumentRequest>(_MoveDocument_QNAME, GetDocumentRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://cloud.mos.ru/customWebService2/", name = "movedCustomId")
    public JAXBElement<String> createMovedCustomId(String value) {
        return new JAXBElement<String>(_MovedCustomId_QNAME, String.class, null, value);
    }

}
