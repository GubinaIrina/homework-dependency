package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {
    AfishaManager manager = new AfishaManager();

    @Test
    void getAllOneItem() {
        manager.setLenght(1);
        PurchaseItem first = new PurchaseItem(1, 1, "Бладшот");
        manager.add(first);

        PurchaseItem[] actual = manager.getAll(manager.getLenght());
        PurchaseItem[] expected = new PurchaseItem[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    void getAllEmptyManager() {
        manager.setLenght(0);
        PurchaseItem[] actual = manager.getAll(manager.getLenght());
        PurchaseItem[] expected = new PurchaseItem[0];
        assertArrayEquals(expected, actual);

    }

}