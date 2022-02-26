import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.util.YailList;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;

@DesignerComponent(version = 1,  description = "Fruitask Extenasion v1.0.<br>",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,   iconName = "https://fruitask.com/assets/logo/Fruitask-logo.svg")
@SimpleObject(external = true)
public class Fruitask extends AndroidNonvisibleComponent {
    private ComponentContainer container;
    /**
     * @param container container, component will be placed in
     */
    public Fruitask(ComponentContainer container) {
        super(container.$form());
        this.container = container;
    }
  private String Apikey;
  private String Baseid;
  private String Table_Name;
  private int Rowid;
  private String Values;
  private int row_Number;
  private int getrow_Number;
  private String column_Name;
  private String Column_Name;
  private String max_Record;
  private int setnumber;
  private String setname;
  private String setvalue;
  private int updatenumber;
  private String updatename;
  private String updatevalue;
  private String Url= "https://api.fruitask.com/";
  
  
  @SimpleProperty
  public void Apikey(String key) {
   Apikey = key;
  }
  @SimpleProperty
  public void Baseid(String id) {
   Baseid = id;
  }
  @SimpleProperty
  public void Table_Name(String Name) {
   Table_Name = Name;
  }
  @SimpleProperty
  public String Apikey(){
    return Apikey;
  }
  @SimpleProperty
  public String Baseid(){
    return Baseid;
  }
  @SimpleProperty
  public  String Table_Name(){
    return Table_Name;
  }
  @SimpleFunction
  public void Create_Row(String Column_Names,String Values){
    Column_Name = Column_Names;
    Values = Values;
  }
  @SimpleEvent
  public void Row Created(int response_Code){
    EventDispatcher.dispatchEvent(this,"Row Created",response_Code);
  }
  @SimpleFunction
  public void Delete_Row(int row_Number){
    Rowid = row_Number;
  }
  @SimpleEvent
  public void Row Deleted(int response_Code){
    EventDispatcher.dispatchEvent(this,"Row Deleted", response_Code);
  }
  @SimpleFunction
  public void Get_Cell(int row_Number,String column_Name){
    row_Number = row_Number;
    column_Name = column_Name;
  }
  @SimpleEvent
  public void Got Cell(int response_Code,String value, int row id,String created_Time){
   EventDispatcher.dispatchEvent(this,"Got Cell",response_Code,value,row id,created_Time);
  }
  @SimpleFunction
  public void Get_Column(String column_Name, String max_Record){
    Column_Name = column_Name;
    max_Record = max_Record;
  }
   @SimpleFunction
  public void Get_Row(int row_Number){
    getrow_Number = row_Number;
  }
   @SimpleFunction
  public void Set_Cell(int row_Number, String column_Name, String value){
    setnumber = row_Number;
    setname = column_Name;
    setvalue = value;
  }
   @SimpleFunction
  public void Update_Row_by_Number(int row_Number, String column_Names, String values){
    updatenumber = row_Number;
    updatename = column_Names;
    updatevalue = values;
  }
  @SimpleFunction
  public void Get_All_Rows(){
 
  }
}
