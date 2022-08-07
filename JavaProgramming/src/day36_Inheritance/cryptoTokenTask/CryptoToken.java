package day36_Inheritance.cryptoTokenTask;

public class CryptoToken {

    private double price;
    private int quantity;
    private long marketCap;
    private long circulatingSupply;
    private boolean isMineable;


    public void setInfo(double price, int quantity, long marketCap, long circulatingSupply, boolean isMineable) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public long getMarketCap(){
        return marketCap;
    }

    public long getCirculatingSupply(){
        return circulatingSupply;
    }

    public boolean getIsMinable(){
        return isMineable;
    }


    public void setPrice(double price){
        if(price < 0 ){
           return;
        }
        this.price = price;
    }

    public void setQuantity(int quantity){
        if(quantity < 0 ){
           return;
        }
        this.quantity = quantity;
    }

    public void setMarketCap(long marketCap){
        this.marketCap = marketCap;
    }

    public void setCirculatingSupply(long circulatingSupply){
        this.circulatingSupply = circulatingSupply;
    }

    public void setMineable(boolean isMineable){
        this.isMineable = isMineable;
    }


    public double totalPrice(){

        return price * quantity;

    }

    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                ", totalPrice=" + totalPrice() +
                '}';


    }
}
/*

CryptoToken Task
	1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)



			methods:
				setInfo()
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)
 */