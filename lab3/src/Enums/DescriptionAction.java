package Enums;

public enum DescriptionAction {
    SADLY("понурно"),
    SLOWLY("медленно");

    private String des;

    DescriptionAction(String des){
        this.des = des;
    }

    public String toString(){
        return this.des;
    }
}
