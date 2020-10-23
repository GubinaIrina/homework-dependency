package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTestWithSetUp {
    private AfishaManager manager = new AfishaManager();
    private PurchaseItem first = new PurchaseItem(1, 1, "Бладшот");
    private PurchaseItem second = new PurchaseItem(2, 2, "Вперед");
    private PurchaseItem third = new PurchaseItem(3, 3, "Отель 'Белград'");
    private PurchaseItem four = new PurchaseItem(4, 4, "Джентельмены");
    private PurchaseItem five = new PurchaseItem(5, 5, "Человек-невидимка");
    private PurchaseItem six = new PurchaseItem(6, 6, "Тролли.Мировой тур");
    private PurchaseItem seven = new PurchaseItem(7, 7, "Номер один");

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
    }


    @Test
    void getAll() {
        manager.setLenght(7);
        PurchaseItem[] expected = new PurchaseItem[]{seven, six, five, four, third, second, first};
        PurchaseItem[] actual = manager.getAll(manager.getLenght());
        assertArrayEquals(expected, actual);
    }

    @Test
    void getAllAfterTen() {
        PurchaseItem eight = new PurchaseItem(8, 8, "eight");
        PurchaseItem nine = new PurchaseItem(9, 9, "nine");
        PurchaseItem ten = new PurchaseItem(10, 10, "ten");
        PurchaseItem eleven = new PurchaseItem(11, 11, "eleven");

        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);

        PurchaseItem[] expected = new PurchaseItem[]{eleven, ten, nine, eight, seven, six, five, four, third, second, first};
        PurchaseItem[] actual = manager.getAll(manager.getLenght());
        assertArrayEquals(expected, actual);
    }

}