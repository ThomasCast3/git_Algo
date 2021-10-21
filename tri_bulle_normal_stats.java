package com.company;

import java.util.Random;

public class tri_bulle_normal_stats
{
    public static void main(String[] args)
    {
        stat(10, 20, 5, 10);
    }

    public static void stat(int min, int max, int step, int nbr)
    {
        for (int i = min; i < max; i += step)
        {
            for (int j = 0; j < nbr; j++)
            {
                int[] tableau = tableauAleatoire(min, max);

                tri(tableau);
            }
        }
    }

    public static int[] tableauAleatoire(int min, int max)
    {
        Random rdm = new Random();

        int randomSizeTableau = rdm.nextInt(max - min) + min; /* Probablement + 1 */

        int[] tableau = new int[randomSizeTableau];

        for (int i = 0; i < randomSizeTableau; i++)
        {
            tableau[i] = rdm.nextInt(100 - 1) + 1;
        }

        return tableau;
    }

    public static void tri(int[] tableau)
    {
        /*int[] tableau = { 6, 5, 3, 1, 8, 7, 2, 4 };Déclaration du tableau */
        int b = 0;
        int temp; /* Déclaration d'une variable pour permuter les nombres */

        int affectation = 1;
        int comparaison = 0;

        while (b < tableau.length - 1) /* Tant que le tableau n'est pas trié */
        {
            for (int j = 0; j < tableau.length - 1; j++) /* Itération dans le tableau complet - 1 */
            {
                affectation += 1; /* int j = 0 || j++ */
                comparaison += 1; /* j < tableau.length - 1;*/

                if (tableau[j] > tableau[j + 1]) /* Si le nombre du 1er index est supérieur au nombre de l'index + 1 (ex: 5, 3) */
                {
                    temp = tableau[j]; /* Affectation de tableau[j] à la variable temp (temporaire)*/
                    tableau[j] = tableau[j + 1]; /* Permutation entre le 1er index du tableau et le deuxième */
                    tableau[j + 1] = temp; /* Permutation entre le deuxième index du tableau et le 1er (temp = 1er index) */

                    comparaison += 1; /* tableau[j] > tableau[j + 1] */
                    affectation += 3; /* temp = tableau[j] && tableau[j] = tableau[j + 1] && tableau[j + 1] = temp */
                }
            }

            b++;

            affectation += 1; /* b++ */
            comparaison += 1; /*  while (b < tableau.length - 1) */
        }

        for (int x : tableau)
        {
            //System.out.print(x + " "); /* Affichage du tableau */
        }

        //System.out.println();
        //System.out.println("Affectations : " + affectation);
        //System.out.println("Comparaisons : " + comparaison);
    }
}

