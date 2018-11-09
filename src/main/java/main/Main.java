package main;

import ohtu.ohtuvarasto.Varasto;

public class Main {
    private static final double VARASTO_1 = 100.0;
    private static final double KAYTETTY_1 = 20.2;
    public static void main(String[] args) {

        Varasto mehua = new Varasto(VARASTO_1);
        Varasto olutta = new Varasto(VARASTO_1, KAYTETTY_1);
    }
}
