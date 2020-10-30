package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.*;

class AfishaEmptyRepositoryTest {
    AfishaRepository repository = new AfishaRepository();

    @Test
    void findAll() {
        PurchaseItem[] expected = new PurchaseItem[0];
        PurchaseItem[] actual = repository.findAll();

        assertArrayEquals(expected, actual);
    }
}