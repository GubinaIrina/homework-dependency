package ru.netology;

public class AfishaManager {
    private PurchaseItem[] items = new PurchaseItem[0];
    public void add(PurchaseItem item){
        int lenght = items.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[lenght];
        for (int i = 0; i < items.length; i++) {
           tmp[i] = items[i];
        }
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }
    public PurchaseItem[] getAll(){
        PurchaseItem[] result = new PurchaseItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - 1 - i;
            result[i] = items[index];
        }
         return result;
        }
    public void removeById(int id) {
        int lenght = items.length - 1;
        PurchaseItem[] tmp = new PurchaseItem[lenght];
        int index = 0;
        for (PurchaseItem item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

}
