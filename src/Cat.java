
class Cat extends Animal {

    protected String sweem;



    public Cat(String name, int run, String sweem) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;

    }

    public void catInfo() {
        System.out.println("CatName: " + name + "  пробежал: " + run+ " метров, " + "  проплыл:" + sweem );
    }
}