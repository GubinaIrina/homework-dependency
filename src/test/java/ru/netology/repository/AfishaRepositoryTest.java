package ru.netology.repository;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AfishaRepositoryTest {
    private AfishaRepository repository = new AfishaRepository();
    private PurchaseItem first = new PurchaseItem(1, 1, "Бладшот");
    private PurchaseItem second = new PurchaseItem(2, 2, "Вперед");
    private PurchaseItem third = new PurchaseItem(3, 3, "Отель 'Белград'");
    private PurchaseItem four = new PurchaseItem(4, 4, "Джентельмены");
    private PurchaseItem five = new PurchaseItem(5, 5, "Человек-невидимка");
    private PurchaseItem six = new PurchaseItem(6, 6, "Тролли.Мировой тур");
    private PurchaseItem seven = new PurchaseItem(7, 7, "Номер один");

    @BeforeEach
    public void setUp() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(four);
        repository.save(five);
        repository.save(six);
        repository.save(seven);
    }

    @Test
    void saveFilm() {
        PurchaseItem[] expected = new PurchaseItem[]{first, second, third, four, five, six, seven};
        PurchaseItem[] actual = repository.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeById() {
        int idToRemove = 3;

        PurchaseItem[] expected = new PurchaseItem[]{first, second, four, five, six, seven};
        PurchaseItem[] actual = repository.removeById(idToRemove);
        assertArrayEquals(expected, actual);
    }

    @Test
    void findById() {
        int id = 2;

        PurchaseItem expected = second;
        PurchaseItem actual = repository.findById(id);
        assertEquals(expected, actual);
    }

    @Test
    void removeAll() {
        PurchaseItem[] expected = new PurchaseItem[0];
        PurchaseItem[] actual = repository.removeAll();
        assertArrayEquals(expected, actual);
    }
}