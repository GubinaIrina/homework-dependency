package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.netology.repository.AfishaRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class AfishaManagerTest {
    @Mock
    private AfishaRepository repository;
    @InjectMocks
    private AfishaManager manager;

    @Test
    void getAllOneItem() {
        PurchaseItem first = new PurchaseItem(1, 1, "Бладшот");
        manager.add(first);

        PurchaseItem[] returned = new PurchaseItem[]{first};
        doReturn(returned).when(repository).findAll();

        PurchaseItem[] expected = new PurchaseItem[]{first};
        PurchaseItem[] actual = manager.getAll(manager.getLenght());

        assertArrayEquals(expected, actual);
        verify(repository).findAll();
    }

    @Test
    void getAllEmptyManager() {
        PurchaseItem[] returned = new PurchaseItem[0];
        doReturn(returned).when(repository).findAll();

        PurchaseItem[] actual = manager.getAll(manager.getLenght());
        PurchaseItem[] expected = new PurchaseItem[0];

        assertArrayEquals(expected, actual);
        verify(repository).findAll();
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

        PurchaseItem[] returned = new PurchaseItem[]{first, second, third, four, five, six, seven};
        doReturn(returned).when(repository).findAll();

        PurchaseItem[] expected = new PurchaseItem[]{seven, six, five, four, third, second, first};
        PurchaseItem[] actual = manager.getAll(manager.getLenght());

        assertArrayEquals(expected, actual);
        verify(repository).findAll();
    }
}