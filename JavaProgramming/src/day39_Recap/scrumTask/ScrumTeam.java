package day39_Recap.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    private ProductOwner PO;
    private BusinessAnalyst BA;
    private ScrumMaster SM;
    public ArrayList<Tester> testers;
    public ArrayList<Developer> developers;

    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }

    public ProductOwner getPO() {
        return PO;
    }

    public void setPO(ProductOwner PO) {
        this.PO = PO;
    }

    public BusinessAnalyst getBA() {
        return BA;
    }

    public void setBA(BusinessAnalyst BA) {
        this.BA = BA;
    }

    public ScrumMaster getSM() {
        return SM;
    }

    public void setSM(ScrumMaster SM) {
        this.SM = SM;
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }

    public void addTesters(Tester [] tester){
        testers.addAll(Arrays.asList(tester));
    }



}
