//import json.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.io.FileReader;


class Assign {
    public static void main(String[] args) throws Exception
    {
        JSONParser assign=new JSONParser();
        FileReader file =new FileReader("Assign.json");
        Object obj=assign.parse(file);
        JSONObject json= (JSONObject) obj;

        JSONArray jsonArray= (JSONArray) json.get("products");

        for (int i=0;i<jsonArray.size();i++)
        {
            JSONObject jsonObj= (JSONObject) jsonArray.get(i);
            String id= String.valueOf(jsonObj.get("prodId"));
            String name= String.valueOf(jsonObj.get("prodName"));
            String price= String.valueOf(jsonObj.get("Price"));
            System.out.println("Id : " +id +"\nName : " +name +"\nPrice : "+ price);
        }
    }
}