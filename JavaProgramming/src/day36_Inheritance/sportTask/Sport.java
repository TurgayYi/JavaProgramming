package day36_Inheritance.sportTask;

public class Sport {

    private String name;
    private int numberOfPlayers, numberOfReferee;
    private String rules;


    public void setInfo(String name, int numberOfPlayers, int numberOfReferee, String rules) {
        setName(name);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfReferee(numberOfReferee);
        setRules(rules);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getNumberOfPlayers(){
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers){
        this.numberOfPlayers = numberOfPlayers;
    }


    public int getNumberOfReferee(){
        return numberOfReferee;
    }

    public void setNumberOfReferee(int numberOfReferee){
        this.numberOfReferee = numberOfReferee;
    }


    public String getRules(){
        return rules;
    }

    public void setRules(String rules){
        this.rules = rules;
    }

    public void play(){
        System.out.println("Playing " + name);
    }

    public String toString() {
        return "Sport{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                ", rules='" + rules + '\'' +
                '}';
    }

}
/*
Sports Task:
	1. Create a class named Sport
			variables:
				name, numberOfPlayers, numberOfReferre, rules



			methods:
				setInfo()
				play()
				toString()
 */