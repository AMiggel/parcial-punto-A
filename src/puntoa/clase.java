package puntoa;

public class clase {

    double CA, CO, H, pot;

    double hipotenusa(double CA, double CO) {

        pot = Math.pow(CA, 2) + Math.pow(CO, 2);
        H = Math.sqrt(pot);

        return H;
    }

    double A, r;

    double area_circulo(double L) {

        r = L / (2 * Math.PI);

        A = Math.PI * Math.pow(r, 2);

        return A;
    }

    double Acu, l;

    double area_cuadrado(double l) {
        Acu = Math.pow(l, 2);

        return Acu;
    }

    double Ar, b, h;

    double area_rectangulo(double b, double h) {

        Ar = b * h;

        return Ar;
    }

}
