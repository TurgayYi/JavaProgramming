package day37_Inheritance.scrumTask;



public class AmazonInc {

    public static void main(String[] args) {
        String company = "Amazon Inc";
        ProductOwner po = new ProductOwner("Ali",43,'M',1,1300000,company);

        BusinessAnalyst ba = new BusinessAnalyst("Cihat", 33,'M',2,150000,company);

        ScrumMaster sm = new ScrumMaster("Anel",25, 'F',3,13456667,company);

        Tester tester1 = new Tester("Chinara",32,'F',"QA",4,100000,company);
        Tester tester2 = new Tester("Yasaman",36,'F',"SDET",5,110000,company);
        Tester tester3 = new Tester("Irena",21,'F',"QA",6,100000,company);
        Tester tester4 = new Tester("Cihad",49,'F',"QE",7,100000,company);

        Tester [] testers = {tester1,tester2,tester3,tester4};

        Developer developer = new Developer("Daniela",23,'F',"Java Developer",8,234455,company);

        ScrumTeam scrumTeam = new ScrumTeam(po,ba,sm);
        scrumTeam.addDeveloper(developer);
        scrumTeam.addTester(tester1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("----------------------------------");


        for (Tester tester : testers) {

            System.out.println(tester.name);

        }






    }



}
