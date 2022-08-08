package design.patterns.adapter.exercise2;

public class Mallard implements Duck  {

    @Override
	public void quack() {
        System.out.println("wak");
    }

    @Override
	public void fly() {
        System.out.println("i am doing a fly, i am");
    }
}
