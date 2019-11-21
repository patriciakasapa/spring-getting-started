package io.turntabl.springgettingstarted;

public class HumanBean {
    public String fname;
    public String lname;
    public HumanBean bestfriend;

    public HumanBean(){}

    public HumanBean getBestfriend() {
        return bestfriend;
    }

    public void setBestfriend(HumanBean bestfriend) {
        this.bestfriend = bestfriend;
    }

    public String getFName(){return this.fname;}

    public void setFName(String fname){this.fname = fname;}

    public String getLName(){return this.lname;}

    public void setLName(String lname){this.lname = lname;}

}
