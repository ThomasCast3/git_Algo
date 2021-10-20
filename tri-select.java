package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int[] tableau = { 47, 12, -34, 86, -2 }; /* Déclaration du tableau */
        int min, temp; /* Déclaration des variables */

        for (int a = 0; a < tableau.length; a++) /* Itération dans le premier tableau */
        {
            min = a; /* Affection de min à la variable a */

            for (int b = min; b < tableau.length; b++) /* Itération dans le deuxième tableau  */
            {
                if (tableau[b] < tableau[min]) /* Si la valeur du tableau à l'index b est inférieur à l'index min alors */
                {
                    min = b; /* Affectation de min au nombre minimal du tableau */
                }
            }

            if (a != min) /* Si a n'est pas égal à la variable min */
            {
                temp = tableau[a]; /* Affectation de temp à l'index a du tableau */
                tableau[a] = tableau[min]; /* Permutation entre l'index précédant et le suivant */
                tableau[min] = temp; /* Affectation du tableau à l'index min à la valeur de temp */
            }
        }

        for (int i : tableau)
        {
            System.out.println(i); //Affichage du tableau trié
        }
    }
}