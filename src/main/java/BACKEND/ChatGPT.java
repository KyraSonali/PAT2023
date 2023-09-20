package BACKEND;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class ChatGPT {

    public static String url = "https://api.openai.com/v1/chat/completions";
    public static String api_key = "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";
    public static String model = "gpt-4";


    public static String askChatBot(String message) throws IOException {



        //turning our string into a url and making the connection
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        //this is standard HTTP connection stuff, no need to know this
        con.setRequestMethod("POST");
        con.setRequestProperty("Authorization", "Bearer " + api_key);
        con.setRequestProperty("Content-Type", "application/json");

        //send the message into the url
        String body = "{\"model\": \"" + model + "\", \"messages\": [{\"role\": \"user\", \"content\": \"" + message + "\"}]}";
        con.setDoOutput(true);
        OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream());
        writer.write(body);
        writer.flush();
        writer.close();

        //grab the response from the url
        BufferedReader input = new BufferedReader(new java.io.InputStreamReader(con.getInputStream()));
        String line = "";
        StringBuffer response = new StringBuffer();

        while((line = input.readLine()) != null) {
            response.append(line);
        }
        input.close();

        return (response.toString().split("\"content\": \"")[1].split("\"")[0]).substring(0);

    }


}

