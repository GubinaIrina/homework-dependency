package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AfishaManagerTestNonEmptyWithSetup {
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
    public void shouldAddIfExists() {

        PurchaseItem[] actual = manager.getAll();
        PurchaseItem[] expected = new PurchaseItem[]{seven, six, five, four, third, second, first};

        assertArrayEquals(expected, actual);
    }
}