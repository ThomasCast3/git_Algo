package com.company;

import java.util.Random;

public class tri_bulle_normal
{
    public static void main(String[] args)
    {
        stat(10, 20, 5, 10);
    }

    public static void stat(int min, int max, int step, int nbr)
    {
        int[] tableau;
        int[] operationArray = new int[nbr];

        int somme = 0;

        for (int i = min; i <= max; i += step)
        {
            for (int j = 0; j < nbr; j++)
            {
                tableau = tableauAleatoire(i);

                operationArray[j] = tri(tableau);

            }

            for (int z : operationArray) {
                somme += z;
            }

            float moyenne = (float) somme / operationArray.length;

            System.out.println(i + " " + moyenne);

            //System.out.println("i : " + i + " " + moyenne);
        }
    }

    public static int[] tableauAleatoire(int i)
    {
        Random random = new Random();
        int[] tableau = new int[i];

        for (int j = 0; j < i; j++)
        {
            tableau[j] = random.nextInt(100);
        }

        return tableau;
    }

    public static int tri(int[] tableau)
    {
        int b = 0;
        int temp; /* Déclaration d'une variable pour permuter les nombres */

        int affectation = 1;
        int comparaison = 0;

        int operation = 0;

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

                    operation += 1;
                }
            }

            b++;

            affectation += 1; /* b++ */
            comparaison += 1; /*  while (b < tableau.length - 1) */
        }

        return operation; /* nombre "d'opérations" */
    }
}

