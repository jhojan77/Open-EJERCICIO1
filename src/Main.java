public class Main {

    public static void main(String[] args) {
        //punto #1
        suma(18, 46, 87);

        //punto #2 creacion del objeto MyCoche
        Coche myCoche = new Coche();
        myCoche.AumentarPuertas();
        myCoche.AumentarPuertas();
        System.out.println("__________________________________");
        System.out.println("Punto #2:");
        System.out.println("El numero de puertas del carro es:" +  myCoche.NumPuertas);
    }
        //punto#1 creacion de la funcion SUMA
    public static void suma(int num1,int num2, int num3){
        int resultado = num1+num2+num3;
        System.out.println("EJERCICIO #1 LECCION3");
        System.out.println("__________________________________");
        System.out.println("Punto #1:");
        System.out.println("la suma es:" + resultado);
        }

        //punto #2 creacion de la clase Coche
     public static class Coche {
        int NumPuertas = 5;
        public void AumentarPuertas () {
            this.NumPuertas++;
        }
    }
}