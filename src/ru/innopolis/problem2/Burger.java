package ru.innopolis.problem2;

public class Burger {
    private boolean cheese;
    private boolean peperone;
    private boolean letucci;
    private boolean tomato;
    private Size size;

    public Burger(boolean cheese, boolean peperone, boolean letucci, boolean tomato, Size size) {
        this.cheese = cheese;
        this.peperone = peperone;
        this.letucci = letucci;
        this.tomato = tomato;
        this.size = size;
    }

    public void print() {
        if (cheese) {
            System.out.println("cheese");
        }
        if (peperone) {
            System.out.println("peperone");
        }
        if (letucci) {
            System.out.println("letucci");
        }
        if (tomato) {
            System.out.println("tomato");
        }
        System.out.println(size);
    }
}
