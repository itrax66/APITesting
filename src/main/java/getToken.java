import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class getToken {

    public static void main(String[]args){
        HttpResponse<String> response;
        try {
            response =Unirest.post(" https://blox.eu.auth0.com/oauth/token ")
                    .header("content-type", "application/json")
                    .body("{\n" +
                            "\"client_id\": \"xD34ykP8M5fja1VV1MhdspJz9m8JQ8XP\",\n" +
                            "\"client_secret\":\n" +
                            "\"IdC8Yi7uJ4gA6dSctjMatbhTAW1w3X5M1DE3WbiZ97z7apF2PAD7IP6RKvyg224w\",\n" +
                            "\"audience\": \"https://blox.eu.auth0.com/api/v2/\",\n" +
                            "\"grant_type\": \"client_credentials\"\n" +
                            "}")
                    .asString();

            System.out.println(response.getBody());
            doTest();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }
    public static void doTest() throws UnirestException {
        HttpResponse<JsonNode> response;
    response = Unirest.post("https://api.blox.io/v4/wallet").header("Authorization","" +
            "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6Ik5FRTJPVEk0UmprMU5FV" +
            "kZNemRGT1RneFJrSXpOREl5T1VGRE0wWXpOVUkxTkR" +
            "aRlFrSTFRUSJ9.eyJpc3MiOiJodHRwczovL2Js" +
            "b3guZXUuYXV0aDAuY29tLyIsInN1YiI6InhEMz" +
            "R5a1A4TTVmamExVlYxTWhkc3BKejltOEpROFhQ" +
            "QGNsaWVudHMiLCJhdWQiOiJodHRwczovL2Jsb3" +
            "guZXUuYXV0aDAuY29tL2FwaS92Mi8iLCJpYXQi" +
            "OjE1MzkxODQ4MTIsImV4cCI6MTUzOTI3MTIxMiwiYXp" +
            "wIjoieEQzNHlrUDhNNWZqYTFWVjFNaGRzcEp6OW04SlE4WFAiLCJzY29" +
            "wZSI6InJlYWQ6cmVzb3VyY2Vfc2VydmVycyB1cGRhdGU6cmVzb3VyY2Vfc2VydmVyc" +
            "yBkZWxldGU6cmVzb3VyY2Vfc2VydmVycyBjcmVhdGU6cmVzb3VyY2Vfc2VydmVycyIsImd0eSI6I" +
            "mNsaWVudC1jcmVkZW50aWFscyJ9.P3nTmL6cgPcg08qVb3ImgaNCC_pciArLY6DGBbgE70hHC1SoeYLJxg" +
            "BSxB0VSGRTCNQXfi0QZjEEAcjWI-tuwts2yGeOcHZcMVrhSsag6ecBI8eNSmoomjj4tMX_lzmmOBehDfPsWmTdyH1" +
            "a3s4RJvSSbjSoj5uJpOnIKtNGzLcW5KrJFFU6O8ukmK_OlvZ18aeWMO4AZ0fGtensf2VmzxJw6lM0GeCZ7xkKWySJxKNGUq0S" +
            "3tik7mnbPVq7EYz9KdDbxnoOB-maNIQ1Bnrstowwhq6d0j5UZQULWWZ0avjdoauY5SwyuZ14Vb3Quw7vyBo9zA_X44LV5VrEOPJ6Kg")
            .field("walletAddress","0xfe34e507B7c0d4035B1c067d590699f45af3E6B4")
            .field("assetType","ethereum").asJson();

        System.out.println(response.getBody());

    }

}
