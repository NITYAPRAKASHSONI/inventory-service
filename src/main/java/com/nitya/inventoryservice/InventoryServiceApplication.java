package com.nitya.inventoryservice;

import com.nitya.inventoryservice.model.Inventory;
import com.nitya.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);

    }

    @Bean
    public CommandLineRunner loadData(InventoryRepository inventoryRepository){
      return args -> {
          Inventory inventory=new Inventory();
          inventory.setSkuCode("Iphone_16");
          inventory.setQuantity(100);

          Inventory inventory1=new Inventory();
          inventory1.setSkuCode("Iphone_16_pro");
          inventory1.setQuantity(10);
          inventoryRepository.save(inventory1);
          inventoryRepository.save(inventory);
      };
    }

}
