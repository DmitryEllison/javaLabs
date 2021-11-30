package MyModule;

enum Description {
    GOOD("good"),  // хороший
    DEEP("deep"),  // глубокий
    CLEAR("clear"),  // ясный
    THINKING ("thoughtful"),  // задумчивый
    SLY("sly");  // хитрый

    private String d;

    Description(String description){
        this.d = description;
    }

    public String toString(){
        return d;
    }
    public String toString(Object o){
        return o.getName().substring(0, 1).toUpperCase() + o.getName().substring(1) + " is " + d;
    }
}
