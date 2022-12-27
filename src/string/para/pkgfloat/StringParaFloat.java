/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string.para.pkgfloat;

/**
 * 
 * @author Marcos
 */

public class StringParaFloat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String str = "420.22";

        // primeiro metodo conversão

        float f = Float.valueOf(str);

        // segundo metodo conversão
        // float fsecond = Float.parseFloat(str);

        System.out.println("\n convertendo o valor float :" + f);

    }

}
