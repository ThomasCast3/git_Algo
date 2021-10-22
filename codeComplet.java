package com.company;

import java.util.Random;

public class tri_final
{
    public  static  void main(String[] args)
    {
        stat(10, 20, 5, 10);
    }

    public  static  void stat(int min, int max, int step, int nbr)
    {
        int[] tableau;
        int[] operationArray = new int[nbr];
        int somme = 0;

        for (int i = min; i <= max; i += step)
        {
            for (int j = 0; j < nbr; j++)
            {
                tableau = tab_alea(i);

                //operationArray[j] = tri_select(tableau);
                //operationArray[j] = tri_inser(tableau);
                operationArray[j] = tri_bulle_opti(tableau);
                //operationArray[j] = tri_bulle_norm(tableau);
            }

            for (int z : operationArray)
            {
                somme += z;
            }

            float moyenne = (float) somme / operationArray.length;

            System.out.println(i + " " + moyenne);
        }
    }

    public static int[] tab_alea(int i)
    {
        java.util.Random random = new Random();
        int [] tableau = new int[i];

        for (int j=0; j<i; j++)
        {
            tableau[j] = random.nextInt(100);
        }

        return tableau;
    }

    public  static int tri_select(int[] tableau)
    {
        int min, temp;

        int affectation = 0;
        int comparaison = 0;
        int operation = 0;

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

            comparaison += 1;/* for (int b = min; b < tableau.length; b++) */

            if (a != min) /* Si a n'est pas égal à la variable min */
            {
                temp = tableau[a]; /* Affectation de temp à l'index a du tableau */
                tableau[a] = tableau[min]; /* Permutation entre l'index précédant et le suivant */
                tableau[min] = temp; /* Affectation du tableau à l'index min à la valeur de temp */

                affectation += 3; /* temp = tableau[a] && tableau[a] = tableau[min] && tableau[min] = temp */
                comparaison += 1; /* a != min */
                operation +=1;
            }

            comparaison += 1; /* if (a != min) */
        }

        comparaison += 1; /* for (int a = 0; a < tableau.length; a++) */

        return operation; /* nombre "d'opérations" */
    }

    public  static int tri_inser(int[] tableau)
    {
        int min, j; /* Déclaration des variables */
        int a;
        int operation = 0;
        int affectation = 0;
        int comparaison = 0;

        for (a = 1; a < tableau.length; a++) /* Itération dans le tableau complet */
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

            comparaison += 2;
            operation +=1;

            tableau[j] = min; /* reposition du tableau */

            affectation += 1;
        }

        comparaison += 1;

        return operation; /* nombre "d'opérations" */
    }

    public static int tri_bulle_opti(int[] tableau)
    {
        boolean ordre = false; /* Déclaration d'un boolean qui défini la fin de l'ordre */
        int temp; /* Déclaration d'une variable pour permuter les nombres */

        int affectation = 1;
        int comparaison = 0;
        int operation = 0;

        while (!ordre) /* Tant que le tableau n'est pas trié */
        {
            ordre = true; /* Affectation de ordre à vrai tant que le tableau n'est pas trié */

            affectation += 1; /* ordre = true */
            comparaison += 1; /* !ordre */

            for (int j = 0; j < tableau.length - 1; j++) /* Itération dans le tableau complet - 1 */
            {
                affectation += 1; /* int j = 0 || j++ */
                comparaison += 1; /* j < tableau.length */

                if (tableau[j] > tableau[j + 1]) /* Si le nombre du 1er index est supérieur au nombre de l'index + 1 (ex: 5, 3) */
                {
                    ordre = false; /* Affectation de ordre à faux, le tableau n'est pas encore totalement trié */

                    temp = tableau[j]; /* Affectation de tableau[j] à la variable temp (temporaire)*/
                    tableau[j] = tableau[j + 1]; /* Permutation entre le 1er index du tableau et le deuxième */
                    tableau[j + 1] = temp; /* Permutation entre le deuxième index du tableau et le 1er (temp = 1er index) */

                    affectation += 4; /* order = false && temp = tableau[j] && tableau[j] = tableau[j + 1] && tableau[j + 1] = temp */
                    comparaison += 1; /* tableau[j] > tableau[j + 1] */
                }

                comparaison += 1; /*  if (tab[j] < tab[ j + 1]) */
            }

            comparaison += 1; /*  for (j < tableau.length - 1) */
            operation +=1;
        }

        comparaison += 1; /*  while (!ordre) */

        return operation; /* nombre "d'opérations" */
    }

    public static void tri_bulle_norm(int[] tableau)
    {
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

                comparaison += 1; /*  for (j < tableau.length - 1) */
            }

            b++;

            affectation += 1; /* b++ */
            comparaison += 1; /*  while (b < tableau.length - 1) */
        }
    }
}
