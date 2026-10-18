package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int basePrice;
    private int cheesePrice = 80;
    private int toppingsPrice;
    private int bagPrice = 20;

    private boolean cheeseAdded = false;
    private boolean toppingsAdded = false;
    private boolean takeawayAdded = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.basePrice = isVeg ? 300 : 400;
        this.toppingsPrice = isVeg ? 70 : 120;
        this.price = basePrice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if (!cheeseAdded) {
            cheeseAdded = true;
            price += cheesePrice;
        }
    }

    public void addExtraToppings(){
        if (!toppingsAdded) {
            toppingsAdded = true;
            price += toppingsPrice;
        }
    }

    public void addTakeaway(){
        if (!takeawayAdded) {
            takeawayAdded = true;
            price += bagPrice;
        }
    }

    public String getBill(){
        StringBuilder sb = new StringBuilder();
        sb.append("Base Price Of The Pizza: ").append(basePrice).append("\n");
        if (cheeseAdded)   sb.append("Extra Cheese Added: ").append(cheesePrice).append("\n");
        if (toppingsAdded) sb.append("Extra Toppings Added: ").append(toppingsPrice).append("\n");
        if (takeawayAdded) sb.append("Paperbag Added: ").append(bagPrice).append("\n");
        sb.append("Total Price: ").append(price).append("\n");
        this.bill = sb.toString();
        return this.bill;
    }
}