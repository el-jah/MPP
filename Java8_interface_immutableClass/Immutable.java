public final class Immutable {

    //one of making immutable by not providing seter method
    private  String name;

    public Immutable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    //onther way is making the class final



}
