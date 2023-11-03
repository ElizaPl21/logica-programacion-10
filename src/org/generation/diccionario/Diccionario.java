package org.generation.diccionario;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Diccionario {

	public static void main(String[] args) {
HashMap<String, String> diccionario = new HashMap<String, String>();
        
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("ratón", "mouse");
        diccionario.put("oso", "bear");
        diccionario.put("conejo", "rabbit");
        diccionario.put("lobo", "wolf");
        diccionario.put("tigre", "tiger");
        diccionario.put("jirafa", "giraffe");
        diccionario.put("cebra", "zebra");
        diccionario.put("erizo", "headgehog");
        diccionario.put("cabra", "goat");
        diccionario.put("ballena", "whale");
        diccionario.put("zorro", "fox");
        diccionario.put("mono", "monkey");
        diccionario.put("ardilla", "squirrel");
        diccionario.put("camello", "camel");
        diccionario.put("elefante", "elephant");
        diccionario.put("mapache", "raccoon");
        diccionario.put("rata", "rat");
        diccionario.put("burro", "donkey");
        
        
 Scanner scanner = new Scanner(System.in);
 System.out.println("Escribe la traducción al inglés de las siguientes palabras en español: ");
     
        int respuestasCorrectas=0;
        int respuestasIncorrectas=0;
        
        //Escoger 5 palabras en español al azar
        String[] palabrasAlAzar = generarPalabrasAlAzar(diccionario, 5);       

        for (String palabraEspañol : palabrasAlAzar) {
            System.out.print("Traducción de '" + palabraEspañol + "': ");
            String respuesta = scanner.nextLine();

            
            String traduccionCorrecta = diccionario.get(palabraEspañol);
            if (respuesta.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La traducción correcta es '" + traduccionCorrecta + "'.");
                respuestasIncorrectas++;
            }
        }

        System.out.println("¡Buen trabajo!");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

 
        scanner.close();
    }

    // Método para generar palabras aleatorias del diccionario en español.
    private static String[] generarPalabrasAlAzar(HashMap<String, String> diccionario, int cantidad) {
        String[] palabras = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasAlAzar = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            palabrasAlAzar[i] = palabras[random.nextInt(palabras.length)];
        }

        return palabrasAlAzar;
        
	}

}
