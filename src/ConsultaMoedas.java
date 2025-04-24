import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoedas {

    public Moedas retornaMoeda() {

        URI url = URI.create("https://v6.exchangerate-api.com/v6/ad4e79c517bcd073d63830a5/latest/USD");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        try {
            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

            Moedas moedas = new Gson().fromJson(response.body(), Moedas.class);


            return moedas;

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Moeda não encontrada");
        }
    }
}