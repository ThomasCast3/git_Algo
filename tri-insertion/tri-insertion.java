package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int[] tableau = { 6, 5, 3, 1, 8, 7, 2, 4 }; /* Déclaration du tableau */
        int min, j; /* Déclaration des variables */

        int affectation = 2;
        int comparaison = 0;

        for (int a = 1; a < tableau.length ; a++) /* Itération dans le tableau complet */
        {
            min = tableau[a]; /* Affectation de min à la valeur de l'j du tableau */
            j = a; /* Affectation de j à la valeur de a) */

            affectation += 3;
            comparaison += 1;

            while (j > 0 && tableau[j - 1] > min) /* Tant que j est supérieur à 0 & que l'index du tableau - 1 est supérieur à min*/
            {
                tableau[j] = tableau[j - 1]; /* Décalement de gauche à droite de la valeur actuelle */
                j -= 1; /* Réduction de j */

                affectation += 2;
                comparaison += 2;
            }

            if ( j < 0 || tableau[j - 1] <min)
            {
                comparaison += 2;
            }

            tableau[j] = min; /* reposition du tableau */

            affectation += 1;
        }

        if (a >= tableau.lenght)
        {
            comparaison += 1;
        }

        for (int x : tableau)
        {
            System.out.println(x); /* Affichage du tableau trié */
        }

        System.out.println("Affections : " + affectation);
        System.out.println("Comparaisons : " + comparaison);
    }
}
