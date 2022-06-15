/**
 * This is a simulation of Prof.&nbsp;Knuth's MIX computer.
 */

/**
 * This is a simulation of Prof.<!-- --> Knuth's MIX computer.
 */

package pl.lublin.wsei.java.cwiczenia;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello Java world\n");

        //A print
        System.out.print("Stefan");
        System.out.print("ma");
        System.out.print("szopa");

        System.out.println("\n__________________________________________________________\n");

        //B println
        System.out.println("Stefan");
        System.out.println("ma");
        System.out.println("szopa");

        System.out.println("\n__________________________________________________________\n");

        //C print \n
        System.out.print("Stefan\n");
        System.out.print("ma\n");
        System.out.print("szopa\n");

        //D i E zmienne i printf                                                                                                              // println stawia enter po zakończonej lini a print nie
        System.out.println("\n__________________________________________________________\n");
        int a =3;
        double b=4.21;
        String s="abecadło";
        System.out.printf("a =%d, b= %f, s= %20s %n", a,b,s);

        //G
        System.out.println("\n__________________________________________________________\n");
        System.out.println("Nazywaliśmy to „witaminą B3”");
        System.out.print("\n//z prefiksowaniem\n");
        System.out.print("Nazywaliśmy\n");
        System.out.print("to\n");
        System.out.print("„witaminą”\n");
        System.out.print("B3\n");

        //G
        System.out.println("\n__________________________________________________________\n");
        System.out.printf("alfa\tsin(alfa)\n");
            for (int i=0; i<370; i+=10)
                System.out.printf("%d\t%f\t\n", i, Math.sin(i/360.0*2*Math.PI));
    }
}
