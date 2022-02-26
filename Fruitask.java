/**  ~~~~~
 * Created with the AppyBuilder Code Editor.
 * This is a template for basic Extension.
 * Modify this template to customize your extension.
 *
 * **** NOTE: DO NOT use a package name. 
 * **** The package name will be created for you automatically.
 * **** Adding a package name will cause a compile error

import android.content.Context;
import android.util.Log;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.annotations.DesignerProperty;
import com.google.appinventor.components.annotations.SimpleEvent;
import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.annotations.SimpleProperty;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.util.YailList;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;

@DesignerComponent(version = 1,  description = "Fruitask Extension v1.0 .<br>" + 
                   "Create your own here:<br><a href='https://editor.appybuilder.com' target='_blank'>https://editor.appybuilder.com</a><br>",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,   iconName = "http://appyBuilder.com/extensions/icons/extension.png")
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
  private String TableName;
  private int Rowid;
  private String Values;
  private int rowNumber;
  private int getrowNumber;
  private String columnName;
  private String ColumnName;
  private int maxRecord;
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
  public void TableName(String Name) {
   TableName = Name;
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
  public  String TableName(){
    return TableName;
  }
  @SimpleFunction
  public void CreateRow(String columnNames,String values){
    ColumnName = columnNames;
    Values = values;
  }
  @SimpleEvent
  public void RowCreated(int responseCode){
    EventDispatcher.dispatchEvent(this,"RowCreated",responseCode);
  }
  @SimpleFunction
  public void DeleteRow(int rowNumber){
    Rowid = rowNumber;
  }
  @SimpleEvent
  public void RowDeleted(int responseCode){
    EventDispatcher.dispatchEvent(this,"RowDeleted",responseCode);
  }
  @SimpleFunction
  public void GetCell(int rowNumber,String columnName){
    rowNumber = rowNumber;
    columnName = columnName;
  }
  @SimpleEvent
  public void GotCell(int responseCode,String value,int rowId,String createdTime){
   EventDispatcher.dispatchEvent(this,"GotCell",responseCode,value,rowId,createdTime);
  }
  @SimpleFunction
  public void GetColumn(String columnName, int maxRecord){
    ColumnName = columnName;
    maxRecord = maxRecord;
  }
  @SimpleEvent
  public void GotColumn(int responseCode,String values,int rowId,String createdTime){
   EventDispatcher.dispatchEvent(this,"GotColumn",responseCode,values,rowId,createdTime);
  }
  @SimpleEvent
  public void RowUpdated(int responseCode){
   EventDispatcher.dispatchEvent(this,"RowUpdated",responseCode);
  }
   @SimpleFunction
  public void GetRow(int rowNumber){
    getrowNumber = rowNumber;
  }
  @SimpleEvent
  public void GotRow(int responseCode,String values){
   EventDispatcher.dispatchEvent(this,"GotRow",responseCode,values);
  }
   @SimpleFunction
  public void SetCell(int rowNumber, String columnName, String value){
    setnumber = rowNumber;
    setname = columnName;
    setvalue = value;
  }
  @SimpleEvent
  public void CellChanged(int responseCode){
   EventDispatcher.dispatchEvent(this,"CellChanged",responseCode);
  }
   @SimpleFunction
  public void UpdateRowByNumber(int rowNumber, String columnNames, String values){
    updatenumber = rowNumber;
    updatename = columnNames;
    updatevalue = values;
  }
 @SimpleFunction
  public void GetAllRows(){
    
  }
  @SimpleEvent
  public void GotAllRows(int responseCode,String responseContent,int totalRows){
   EventDispatcher.dispatchEvent(this,"GotAllRows",responseCode,responseContent,totalRows);
  }
}
