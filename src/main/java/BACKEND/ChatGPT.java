package BACKEND;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import org.json.JSONArray;
// all chatgpt's code lol
public class ChatGPT {

    public String url = "https://api.openai.com/v1/chat/completions";
    public static String api_key_filepath = "data//api.txt";
    public String model = "gpt-3.5-turbo";
    private  String api_key = "";

//    static {
//
//        try {
//
//            api_key = getKey();
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ChatGPT.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
//
//    private static String getKey() throws FileNotFoundException {
//        Scanner filescanner = new Scanner(new File(api_key_filepath));
//        api_key = filescanner.next();
//        return api_key;
//
//    }

    public String askChatBot(String message) throws IOException {
        // Check if API key is available
        if (api_key == null || api_key.isEmpty()) {
            throw new IOException("API key is missing!");
        }

        // Create URL and HttpURLConnection objects
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Set HTTP method, headers, and output
        con.setRequestMethod("POST");
        con.setRequestProperty("Authorization", "Bearer " + api_key);
        con.setRequestProperty("Content-Type", "application/json");
        con.setDoOutput(true);

        // Write request body
        String body = String.format("{\"model\": \"%s\", \"messages\": [{\"role\": \"user\", \"content\": \"%s\"}]}", model, message);
        try (OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream())) {
            writer.write(body);
            writer.flush();
        }

        // Read response
        StringBuilder response = new StringBuilder();
        try (BufferedReader input = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            String line;
            while ((line = input.readLine()) != null) {
                response.append(line).append("\n");
            }
        }

        // Print the raw API response for debugging
        System.out.println("Raw API Response: " + response.toString());

        return extractContentFromResponse(response.toString());
    }

    // This method extracts the response expected from chatgpt and returns it.
    public String extractContentFromResponse(String response) {
        // Create a JSONObject from the response string
        JSONObject jsonResponse = new JSONObject(response);

        // Navigate through the JSON object to extract the content
        JSONArray choices = jsonResponse.getJSONArray("choices");
        JSONObject firstChoice = choices.getJSONObject(0);
        JSONObject message = firstChoice.getJSONObject("message");
        String content = message.getString("content");

        return content;
    }

}
