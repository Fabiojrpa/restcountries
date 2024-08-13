package com.exemplo.restcountries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CountryService {

    @Autowired
    private CountriesClient countriesClient;

    public String getIDDInfo(String pais) {
        try {
            // Obtém a resposta da API como uma String
            String response = countriesClient.getCountryInfo(pais);

            // Cria um ObjectMapper para processar a resposta JSON
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(response);

            // Obtém o IDD root e sufixo
            JsonNode iddNode = rootNode.get(0).get("idd");
            String root = iddNode.get("root").asText();
            String suffix = iddNode.get("suffixes").get(0).asText();

            // Retorna os valores formatados
            return String.format("IDD root: %s, IDD sufixo: %s", root, suffix);

        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao obter informações";
        }
    }
}
