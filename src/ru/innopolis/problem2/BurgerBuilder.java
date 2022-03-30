package ru.innopolis.problem2;

public class BurgerBuilder {
    private boolean cheese = true;
    private boolean peperone = true;
    private boolean letucci = true;
    private boolean tomato = true;
    private Size size = Size.MEDIUM;

    public Burger build() {
        return new Burger(cheese, peperone, letucci, tomato, size);
    }

    public BurgerBuilder setCheese(boolean cheese) {
        this.cheese = cheese;
        return this;
    }

    public BurgerBuilder setPeperone(boolean peperone) {
        this.peperone = peperone;
        return this;
    }

    public BurgerBuilder setLetucci(boolean letucci) {
        this.letucci = letucci;
        return this;
    }

    public BurgerBuilder setTomato(boolean tomato) {
        this.tomato = tomato;
        return this;
    }

    public BurgerBuilder setSize(Size size) {
        this.size = size;
        return this;
    }
}
