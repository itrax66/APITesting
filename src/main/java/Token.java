import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Token {

    public static final String TOKEN_VALUE = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6Ik5FRTJPVEk0Umpr" +
            "MU5FVkZNemRGT1RneFJrSXpOREl5T1VGRE0wWXpOVUkxTkRaRlFrSTFRUSJ9.eyJpc3MiOiJodHRwczo" +
            "vL2Jsb3guZXUuYXV0aDAuY29tLyIsInN1YiI6InhEMzR5a1A4TTVmamExVlYxTWhkc3BKejltOE" +
            "pROFhQQGNsaWVudHMiLCJhdWQiOiJodHRwczovL2Jsb3guZXUuYXV0aDAuY29tL2FwaS92Mi8iLCJpYXQiOjE" +
            "1MzkxODQ4MTIsImV4cCI6MTUzOTI3MTIxMiwiYXpwIjoieEQzNHlrUDhNNWZqYTFWVjFNaGRzcEp6OW04SlE4WFAiLCJ" +
            "zY29wZSI6InJlYWQ6cmVzb3VyY2Vfc2VydmVycyB1cGRhdGU6cmVzb3VyY2Vfc2VydmVycyBkZWxldGU6cmVzb3VyY2Vfc2V" +
            "ydmVycyBjcmVhdGU6cmVzb3VyY2Vfc2VydmVycyIsImd0eSI6ImNsaWVudC1jcmVkZW50aWFscyJ9.P3nTmL6cgPcg08qVb3ImgaNCC" +
            "_pciArLY6DGBbgE70hHC1SoeYLJxgBSxB0VSGRTCNQXfi0QZjEEAcjWI-tuwts2yGeOcHZcMVrhSsag6ecBI8eNSmoomjj4tMX_lzmmOBehD" +
            "fPsWmTdyH1a3s4RJvSSbjSoj5uJpOnIKtNGzLcW5KrJFFU6O8ukmK_OlvZ18aeWMO4AZ0fGtensf2VmzxJw6lM0GeCZ7xkKWySJxKNGUq0S3t" +
            "ik7mnbPVq7EYz9KdDbxnoOB-maNIQ1Bnrstowwhq6d0j5UZQULWWZ0avjdoauY5SwyuZ14Vb3Quw7vyBo9zA_X44LV5VrEOPJ6Kg";

    public static String getToken(){
        HttpResponse<String> response;
        try {
            response = Unirest.post(" https://blox.eu.auth0.com/oauth/token ")
                    .header("content-type", "application/json")
                    .body("{\n" +
                            "\"client_id\": \"xD34ykP8M5fja1VV1MhdspJz9m8JQ8XP\",\n" +
                            "\"client_secret\":\n" +
                            "\"IdC8Yi7uJ4gA6dSctjMatbhTAW1w3X5M1DE3WbiZ97z7apF2PAD7IP6RKvyg224w\",\n" +
                            "\"audience\": \"https://blox.eu.auth0.com/api/v2/\",\n" +
                            "\"grant_type\": \"client_credentials\"\n" +
                            "}")
                    .asString();
            return response.getBody();
        } catch (UnirestException e) {
            e.printStackTrace();
        }
        return null;
    }
}
