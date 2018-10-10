import com.mashape.unirest.http.HttpResponse;
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
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }

}
