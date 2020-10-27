package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    AfishaManager manager = new AfishaManager();

    @Test
    void getAllOneItem() {
        PurchaseItem first = new PurchaseItem(1, 1, "Бладшот");
        manager.add(first);

        PurchaseItem[] actual = manager.getAll(manager.getLenght());
        PurchaseItem[] expected = new PurchaseItem[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void getAllEmptyManager() {
        PurchaseItem[] actual = manager.getAll(manager.getLenght());
        PurchaseItem[] expected = new PurchaseItem[0];
        assertArrayEquals(expected, actual);

    }


    @Test
    void getAll() {
        PurchaseItem first = new PurchaseItem(1, 1, "Бладшот");
        PurchaseItem second = new PurchaseItem(2, 2, "Вперед");
        PurchaseItem third = new PurchaseItem(3, 3, "Отель 'Белград'");
        PurchaseItem four = new PurchaseItem(4, 4, "Джентельмены");
        PurchaseItem five = new PurchaseItem(5, 5, "Человек-невидимка");
        PurchaseItem six = new PurchaseItem(6, 6, "Тролли.Мировой тур");
        PurchaseItem seven = new PurchaseItem(7, 7, "Номер один");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);

        PurchaseItem[] expected = new PurchaseItem[]{seven, six, five, four, third, second, first};
        PurchaseItem[] actual = manager.getAll(manager.getLenght());
        assertArrayEquals(expected, actual);
    }
}