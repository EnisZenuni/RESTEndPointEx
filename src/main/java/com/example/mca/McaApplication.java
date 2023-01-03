package com.example.mca;
import com.example.mca.Model.Product;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


import java.util.*;


@SpringBootApplication
public class McaApplication {

    public static void main(String[] args) {
        String URL = "https://interview-task-api.mca.dev/qr-scanner-codes/alpha-qr-gFpwhsQ8fkY1";
        List<Product> productList = new ArrayList<>();

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Product[]> res = restTemplate.getForEntity(URL,Product[].class);

        productList.addAll(Arrays.stream(res.getBody()).toList());
        Map<String,List<Product>> productMap = new TreeMap<>();


        StringBuilder sb = new StringBuilder();
        List<Product> domestic = new ArrayList<>();
        List<Product> imported = new ArrayList<>();

        for (Product p:productList) {
            p.setDescription(p.getDescription().substring(0,10));
          if(p.getDomestic()) {
              domestic.add(p);
          }
          else imported.add(p);
        }
        productMap.put("Domestic",domestic.stream().sorted(Comparator.comparing(Product::getName)).toList());
        productMap.put("Imported",imported);

        productMap.forEach((k,v)-> {
            sb.append(k).append("\n");
            v.forEach(p->sb.append(p.getName()).append("\n").append(p.getPrice()).append("\n").append(p.getWeight()).append("\n"));
        });
        sb.append("Domestic cost: ").append("$").append(domestic.stream().mapToDouble(Product::getPrice).sum()).append("\n");
        sb.append("Imported cost: ").append("$").append(imported.stream().mapToDouble(Product::getPrice).sum()).append("\n");

        sb.append("Domestic count: ").append(domestic.size()).append("\n");
        sb.append("Imported count: ").append(imported.size());
        System.out.println(sb);

    }
    }
