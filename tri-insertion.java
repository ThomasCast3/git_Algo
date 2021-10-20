package com.company;

public class TriInsertion
{
    public static void main(String[] args)
    {
        int[] tableau = { 6, 5, 3, 1, 8, 7, 2, 4 }; /* Déclaration du tableau */
        int min, j; /* Déclaration des variables */

        for (int a = 1; a < tableau.length ; a++) /* Itération dans le tableau complet */
        {
            min = tableau[a]; /* Affectation de min à la valeur de l'j du tableau */
            j = a; /* Affectation de j à la valeur de a) */

            while (j > 0 && tableau[j - 1] > min) /* Tant que j est supérieur à 0 & que l'index du tableau - 1 est supérieur à min*/
            {
                tableau[j] = tableau[j - 1]; /* Décalement de gauche à droite de la valeur actuelle */
                j -= 1; /* Réduction de j */
            }

            tableau[j] = min; /* reposition du tableau */
        }

        for (int i : tableau)
        {
            System.out.println(i); /* Affichage du tableau trié */
        }
    }
}
