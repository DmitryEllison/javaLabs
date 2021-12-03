package Enums;

public enum DescriptionObject {
    GOOD("good"),  // хороший
    DEEP("deep"),  // глубокий
    CLEAR("clear"),  // ясный
    THINKING ("thoughtful"),  // задумчивый
    SLY("sly"),  // хитрый
    GRAY("gray"),  // серый
    OLD("old");  // старый

    private String des;

    DescriptionObject(String des){
        this.des = des;
    }

    public String toString(){
        return des;
    }
}
