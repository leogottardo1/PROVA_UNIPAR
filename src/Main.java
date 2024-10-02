public class Main {
    public static void main(String[] args) {

        int[] filmes = new int[5];


        filmes[1] = 10;
        filmes[2] = 20;
        filmes[3] = 30;
        filmes[4] = 40;
        filmes[5] = 50;


        System.out.println("Primeiro filme: " + filmes[1]);


        for (int i = 1; i < filmes.length; i++) {
            System.out.println("Elemento " + i + ": " + filmes[i]);
        }