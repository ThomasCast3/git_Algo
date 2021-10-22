package com.company;

public class tri_selection
{
    public static void main(String[] args)
    {
        int[] tableau = { 47, 12, -34, 86, -2 }; /* Déclaration du tableau */
        int min, temp;

        int affectation = 0;
        int comparaison = 0;

        for (int a = 0; a < tableau.length; a++) /* Itération dans le premier tableau */
        {
            min = a; /* Affection de min à la variable a */

            affectation += 2; /* int a = 0 || a ++ && min = a */
            comparaison += 1; /* a < tableau.length */

            for (int b = min; b < tableau.length; b++) /* Itération dans le deuxième tableau  */
            {
                comparaison += 1; /* b < tableau.length */
                affectation += 1; /* int b = min || b++ */

                if (tableau[b] < tableau[min]) /* Si la valeur du tableau à l'index b est inférieur à l'index min alors */
                {
                    min = b; /* Affectation de min au nombre minimal du tableau */

                    comparaison += 1; /* tableau[b] < tableau[min] */
                    affectation += 1; /* min = b */
                }
                comparaison += 1; /* if (tableau[b] < tableau[min]) */
            }
                comparaison += 1; /* for (int b = min; b < tableau.length; b++) */
                    
            if (a != min) /* Si a n'est pas égal à la variable min */
            {
                temp = tableau[a]; /* Affectation de temp à l'index a du tableau */
                tableau[a] = tableau[min]; /* Permutation entre l'index précédant et le suivant */
                tableau[min] = temp; /* Affectation du tableau à l'index min à la valeur de temp */

                affectation += 3; /* temp = tableau[a] && tableau[a] = tableau[min] && tableau[min] = temp */
                comparaison += 1; /* a != min */
            }
            comparaison += 1; /* if (a != min) */ 
        }
            comparaison += 1; /* for (int a = 0; a < tableau.length; a++) */
        
        for (int x : tableau)
        {
            System.out.println(x); //Affichage du tableau trié
        }

        System.out.println("Affectations : " + affectation);
        System.out.println("Comparaisons : " + comparaison);
    }
}
