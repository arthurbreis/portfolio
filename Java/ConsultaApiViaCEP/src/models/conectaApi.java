package models;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class conectaApi {
    private String endereco = "http://viacep.com.br/ws/";
    private int cep;

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void chamaApi(){
        String url = (endereco + cep + "/json");
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
