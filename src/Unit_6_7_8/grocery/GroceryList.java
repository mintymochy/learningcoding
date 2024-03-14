package Unit_6_7_8.grocery;

import java.util.*;

/* 
 August Jones 
 02-08-2024
 AP CSA
 :3
*/
public class GroceryList {
    private String[] itemList;
    private double[] costList;
    private int count;
    private int[] quantityList;

    public GroceryList() {
        itemList = new String[11];
        costList = new double[11];
        quantityList = new int[11];
        count = 1;
    }

    public void setItemList(String[] itemList) {
        this.itemList = itemList;
    }

    public String[] getItemList() {
        return itemList;
    }

    public void setQuantity(int[] quantityList) {
        this.quantityList = quantityList;
    }

    public int[] getQuantityList() {
        return quantityList;
    }

    public void setCostList(double[] CostList) {
        this.costList = costList;
    }

    public double[] getCostlist() {
        return costList;
    }

    public int getItemCount() {
        return itemList.length;
    }

    public int getCount() {
        return count;
    }

    public int amount() {
        return itemList.length;
    }

    public String[] getListArray() {
        return new String[] { itemList[count] };
    }

    public String getList() {
        return Arrays.toString(itemList);
    }

    public String getCost() {
        return Arrays.toString(costList);
    }

    public String toString() {
        StringBuilder Str = new StringBuilder();
        Str.append("-------------------------------------------------------------\n");
        Str.append("| Item 1: ");
        for (int i = 1; i <= 10; i++) {
            Str.append(itemList[i]).append(" | Quantity: ").append(quantityList[i]).append(" | cost: ")
                    .append(costList[i]).append(" | ").append("Total Cost: ").append(addCost(i)).append(" |\n");
            Str.append("--------------------------------------------------------------\n");
            Str.append("| Item ").append(i).append(": ");
        }
        Str.append(itemList[10]).append(" | Quantity: ").append(quantityList[10]).append(" | cost: ")
                .append(costList[10]).append(" | ").append("Total Cost: ").append(addCost(10)).append(" |\n");
        Str.append("-------------------------------------------------------------\n");
        return Str.toString();
    }

    public void add(String item, double cost, int quantity) {
        itemList[count] = item;
        costList[count] = cost;
        quantityList[count] = quantity;
        count++;
    }

    public double getTotalCost() {
        double cost = 0;
        for (int i = 0; i <= costList.length; i++) {
            cost += costList[i];
        }
        return cost;
    }

    public double addCost(int i) {
        return quantityList[i] * costList[i];
    }

}