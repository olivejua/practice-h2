package dev.olivejua.practiceh2;

import dev.olivejua.practiceh2.domain.Item;
import dev.olivejua.practiceh2.domain.ItemRepository;
import dev.olivejua.practiceh2.domain.Shop;
import dev.olivejua.practiceh2.domain.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private ShopRepository shopRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public void run(String... args) throws Exception {
        shopRepository.save(new Shop("olivejua", "olivejua-develop.tistory.com"));
        itemRepository.save(new Item("olivejua's Github", 1000));
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
