package sec.week10_11.supermarket;

import java.util.ArrayList;

public class Stock {
    private ArrayList<Item> ItemsStock = new ArrayList<>();

    public void AddItem(Item i){
        ItemsStock.add(i);
    }
    public void RemoveItem(Item i){
        if(ItemsStock.contains(i)){
            ItemsStock.remove(i);
        }
    }
    public Item GetItem(int index){
        return ItemsStock.get(index);
    }

    public String toString(){
        String s = "";
        for (int i = 0; i < ItemsStock.size(); i++) {
            s+=(i+1)+": "+ItemsStock.get(i).getName()+"\t"
                        +ItemsStock.get(i).getPrice()+
                        "\n";
        }
        return s;
    }

}
