package org.example;

public class Main {
    public static void main(String[] args) {
        // Verificamos que se pase el nombre del archivo y al menos una línea de contenido
        if (args.length < 2) {
            System.err.println("Uso: java Writer <nombre_archivo> <contenido>");
            return;
        }

        String filename = args[0];
        StringBuilder content = new StringBuilder();
        for (int i = 1; i < args.length; i++) {
            content.append(args[i]).append(" ");
        }

        // Creamos una instancia de Writer y escribimos en el archivo
        Writer writer = new Writer();
        writer.writeToFile(filename, content.toString());
    }
}
