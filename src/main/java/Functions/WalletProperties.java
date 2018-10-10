
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import org.json.JSONArray;
import org.json.JSONObject;

public class WalletProperties {
    String accountID,accountType,adress;
    public WalletProperties(String sObject){
            accountID = sObject.substring(sObject.lastIndexOf("\"accountId\": ")+1,sObject.lastIndexOf("\"accountId\": ")+7);
            adress = sObject.substring(sObject.lastIndexOf("\"address\": ")+2,sObject.lastIndexOf("\"address\": ")+43);

    }

    public String getAccountID() {
        return accountID;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getAdress() {
        return adress;
    }
}
