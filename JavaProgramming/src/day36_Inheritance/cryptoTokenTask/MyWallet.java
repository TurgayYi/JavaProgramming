package day36_Inheritance.cryptoTokenTask;

public class MyWallet {

    public static void main(String[] args) {

        Bitcoin bitcoin = new Bitcoin();
        bitcoin.setInfo(24000,55,22223421,34576,true);

        Cardano cardano = new Cardano();
        cardano.setInfo(2000,5,2223421,34576,false);

        Doge doge = new Doge();
        doge.setInfo(240,505,22221,3576,true);

        Ethereum ethereum = new Ethereum();
        ethereum.setInfo(124,1155,222283421,348576,false);

        XRP xrp = new XRP();
        xrp.setInfo(0.2,550000,222999421,99934576,true);


        System.out.println(bitcoin.totalPrice() + ethereum.totalPrice() + cardano.totalPrice() + xrp.totalPrice() + doge.totalPrice());







    }
}
/*
	3. create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset
 */