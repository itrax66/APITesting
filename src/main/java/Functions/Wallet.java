
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Wallet {

    public static HttpResponse<JsonNode> registerWallet(String walletAdress, String assertType)  {
        HttpResponse<JsonNode> response;
        try {
            response = Unirest.post("https://api.blox.io/v4/wallet")
                    .header("Authorization", Token.TOKEN_VALUE)
                    .field("walletAddress",walletAdress).field("assetType",assertType).asJson();
            return response;
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return null;

        }
    public static HttpResponse<String> registerWalletAndGetInfo(String walletAdress, String assertType)  {
        HttpResponse<JsonNode> response;
        try {
            return  Unirest.post("https://api.blox.io/v4/wallet")
                    .header("Authorization", Token.TOKEN_VALUE)
                    .field("walletAddress",walletAdress).field("assetType",assertType).asString();

        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return null;

    }


    public static void deleteAllWallets() throws UnirestException {
       Unirest.delete("https://api.blox.io/v4/wallets/all").asJson();

    }
    public static void deleteOneWallet(String accountid,String adress){
        Unirest.delete("https://api.blox.io/v4/wallet").field("accountId",accountid).field("address",adress);
    }
}
