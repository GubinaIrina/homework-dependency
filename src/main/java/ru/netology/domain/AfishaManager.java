package ru.netology.domain;

import lombok.Data;
import ru.netology.repository.AfishaRepository;

@Data

public class AfishaManager {
    private AfishaRepository repository;
    private int lenght = 10;

    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
    }

    public void add(PurchaseItem item) {
        repository.save(item);
    }

    public PurchaseItem[] getAll(int lenght) {
        PurchaseItem[] items = repository.findAll();
        PurchaseItem[] result = new PurchaseItem[items.length];
        if (result.length < getLenght()) {
            this.lenght = result.length;
        }
        for (int i = 0; i < this.lenght; i++) {
            int index = getLenght() - 1 - i;
            result[i] = items[index];
        }
        return result;
    }
}
