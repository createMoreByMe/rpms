
package cn.xxx.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cn.xxx.client package. 
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

    private final static QName _Add_QNAME = new QName("http://service.rpms.xxx.cn/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://service.rpms.xxx.cn/", "addResponse");
    private final static QName _Delete_QNAME = new QName("http://service.rpms.xxx.cn/", "delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://service.rpms.xxx.cn/", "deleteResponse");
    private final static QName _Get_QNAME = new QName("http://service.rpms.xxx.cn/", "get");
    private final static QName _GetAll_QNAME = new QName("http://service.rpms.xxx.cn/", "getAll");
    private final static QName _GetAllResponse_QNAME = new QName("http://service.rpms.xxx.cn/", "getAllResponse");
    private final static QName _GetResponse_QNAME = new QName("http://service.rpms.xxx.cn/", "getResponse");
    private final static QName _QueryLimt_QNAME = new QName("http://service.rpms.xxx.cn/", "queryLimt");
    private final static QName _QueryLimtResponse_QNAME = new QName("http://service.rpms.xxx.cn/", "queryLimtResponse");
    private final static QName _QueryPage_QNAME = new QName("http://service.rpms.xxx.cn/", "queryPage");
    private final static QName _QueryPageResponse_QNAME = new QName("http://service.rpms.xxx.cn/", "queryPageResponse");
    private final static QName _Update_QNAME = new QName("http://service.rpms.xxx.cn/", "update");
    private final static QName _UpdateResponse_QNAME = new QName("http://service.rpms.xxx.cn/", "updateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cn.xxx.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Get }
     * 
     */
    public Get createGet() {
        return new Get();
    }

    /**
     * Create an instance of {@link GetAll }
     * 
     */
    public GetAll createGetAll() {
        return new GetAll();
    }

    /**
     * Create an instance of {@link GetAllResponse }
     * 
     */
    public GetAllResponse createGetAllResponse() {
        return new GetAllResponse();
    }

    /**
     * Create an instance of {@link GetResponse }
     * 
     */
    public GetResponse createGetResponse() {
        return new GetResponse();
    }

    /**
     * Create an instance of {@link QueryLimt }
     * 
     */
    public QueryLimt createQueryLimt() {
        return new QueryLimt();
    }

    /**
     * Create an instance of {@link QueryLimtResponse }
     * 
     */
    public QueryLimtResponse createQueryLimtResponse() {
        return new QueryLimtResponse();
    }

    /**
     * Create an instance of {@link QueryPage }
     * 
     */
    public QueryPage createQueryPage() {
        return new QueryPage();
    }

    /**
     * Create an instance of {@link QueryPageResponse }
     * 
     */
    public QueryPageResponse createQueryPageResponse() {
        return new QueryPageResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link BaseQuery }
     * 
     */
    public BaseQuery createBaseQuery() {
        return new BaseQuery();
    }

    /**
     * Create an instance of {@link PageList }
     * 
     */
    public PageList createPageList() {
        return new PageList();
    }

    /**
     * Create an instance of {@link MaintenanceQuery }
     * 
     */
    public MaintenanceQuery createMaintenanceQuery() {
        return new MaintenanceQuery();
    }

    /**
     * Create an instance of {@link Maintenance }
     * 
     */
    public Maintenance createMaintenance() {
        return new Maintenance();
    }

    /**
     * Create an instance of {@link MaintenanceItem }
     * 
     */
    public MaintenanceItem createMaintenanceItem() {
        return new MaintenanceItem();
    }

    /**
     * Create an instance of {@link Parts }
     * 
     */
    public Parts createParts() {
        return new Parts();
    }

    /**
     * Create an instance of {@link Opt }
     * 
     */
    public Opt createOpt() {
        return new Opt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rpms.xxx.cn/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rpms.xxx.cn/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rpms.xxx.cn/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rpms.xxx.cn/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Get }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rpms.xxx.cn/", name = "get")
    public JAXBElement<Get> createGet(Get value) {
        return new JAXBElement<Get>(_Get_QNAME, Get.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rpms.xxx.cn/", name = "getAll")
    public JAXBElement<GetAll> createGetAll(GetAll value) {
        return new JAXBElement<GetAll>(_GetAll_QNAME, GetAll.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rpms.xxx.cn/", name = "getAllResponse")
    public JAXBElement<GetAllResponse> createGetAllResponse(GetAllResponse value) {
        return new JAXBElement<GetAllResponse>(_GetAllResponse_QNAME, GetAllResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rpms.xxx.cn/", name = "getResponse")
    public JAXBElement<GetResponse> createGetResponse(GetResponse value) {
        return new JAXBElement<GetResponse>(_GetResponse_QNAME, GetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryLimt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rpms.xxx.cn/", name = "queryLimt")
    public JAXBElement<QueryLimt> createQueryLimt(QueryLimt value) {
        return new JAXBElement<QueryLimt>(_QueryLimt_QNAME, QueryLimt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryLimtResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rpms.xxx.cn/", name = "queryLimtResponse")
    public JAXBElement<QueryLimtResponse> createQueryLimtResponse(QueryLimtResponse value) {
        return new JAXBElement<QueryLimtResponse>(_QueryLimtResponse_QNAME, QueryLimtResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rpms.xxx.cn/", name = "queryPage")
    public JAXBElement<QueryPage> createQueryPage(QueryPage value) {
        return new JAXBElement<QueryPage>(_QueryPage_QNAME, QueryPage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryPageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rpms.xxx.cn/", name = "queryPageResponse")
    public JAXBElement<QueryPageResponse> createQueryPageResponse(QueryPageResponse value) {
        return new JAXBElement<QueryPageResponse>(_QueryPageResponse_QNAME, QueryPageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rpms.xxx.cn/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.rpms.xxx.cn/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

}
