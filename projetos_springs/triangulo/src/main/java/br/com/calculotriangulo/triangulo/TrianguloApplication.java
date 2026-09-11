//existem diferentes formas de calcular a area de um triangulo
//contrua uma classe triangulo.a classe devera possuir um metodo getArea que sera sobrecarregado, para suportar as diferentes formas de calculo da area
//As formulas sao: 1. Base e altura - Formula: A = (base x altura) / 2
// 2. formula de heron: S = a + b + c / 2 A= sqrt(s * (s - a) * (s - b) * (s - c))
// 3. Dois lados e angulo entre eles (em graus) - Formula: A = (a * b * sin(angulo)) / 2

package br.com.calculotriangulo.triangulo;

class Triangulo {

    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;
    private double angulo; // em graus

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getArea() {
        return (base * altura) / 2;
    }

    public double getArea(double s) {
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public double getArea(double a, double b, double angulo) {
        return (a * b * Math.sin(Math.toRadians(angulo))) / 2;
    }
}