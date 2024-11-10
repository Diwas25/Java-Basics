package Java11Features;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpDemo2 {
    public static void main(String[] args) {

        String json = "{\"name\":\"John Doe\",\"email\":\"john.doe@example.com\"}";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts"))  // Replace with your target URL
                .header("Content-Type", "application/json")  // Set content type to JSON
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Response Status Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
