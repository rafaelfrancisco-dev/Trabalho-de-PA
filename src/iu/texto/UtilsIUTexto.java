/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iu.texto;

/**
 *
 * @author Rafael
 */
public class UtilsIUTexto {
    /**
     *
     */
    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
//                for(int i=0;i<100;i++){
//                    System.out.println("\n");
//                }
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            System.out.println(e.toString());
        }
    }
}
