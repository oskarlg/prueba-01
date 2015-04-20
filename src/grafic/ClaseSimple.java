
package grafic;

/**
 * @author Oscar
 */
public class ClaseSimple {    
    
    public static void main(String[] args){
        double num1, num2, sum, prom;
        num1 = Math.random();
        num2 = Math.random();
        sum = num1 + num2;
        prom = sum/2;
        System.out.println("\n La suma de los números "+num1+" y "+num2+" es "+sum );
        System.out.println("\tEl promedio es "+ prom);
    }
}
