import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;

public class Accounts {

    public static GetRequest getAllAcounts(){
        GetRequest response;

        response = Unirest.get("https://api.blox.io/v4/wallets/accounts").header("Authorization", Token.TOKEN_VALUE);

        return response;

    }

}
