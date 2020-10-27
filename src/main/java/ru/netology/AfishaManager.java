package ru.netology;

import lombok.Data;

@Data

public class AfishaManager {
    private PurchaseItem[] items = new PurchaseItem[0];
    private int lenght = 10;

    public void add(PurchaseItem item) {

        int lenght = items.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[lenght];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PurchaseItem[] getAll(int lenght) {
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
