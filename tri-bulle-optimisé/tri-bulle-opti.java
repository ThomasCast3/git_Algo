package com.company;

public class TriBullesNormal
{
    public static void main(String[] args)
    {
        int[] tableau = { 6, 5, 3, 1, 8, 7, 2, 4 }; /* Déclaration du tableau */
        boolean ordre = false; /* Déclaration d'un boolean qui défini la fin de l'ordre */
        int temp; /* Déclaration d'une variable pour permuter les nombres */

        while (!ordre) /* Tant que le tableau n'est pas trié */
        {
            ordre = true; /* Affectation de ordre à vrai tant que le tableau n'est pas trié */

            for (int j = 0; j < tableau.length - 1; j++) /* Itération dans le tableau complet - 1 */
            {
                if (tableau[j] > tableau[j + 1]) /* Si le nombre du 1er index est supérieur au nombre de l'index + 1 (ex: 5, 3) */
                {
                    ordre = false; /* Affectation de ordre à faux, le tableau n'est pas encore totalement trié */

                    temp = tableau[j]; /* Affectation de tableau[j] à la variable temp (temporaire)*/
                    tableau[j] = tableau[j + 1]; /* Permutation entre le 1er index du tableau et le deuxième */
                    tableau[j + 1] = temp; /* Permutation entre le deuxième index du tableau et le 1er (temp = 1er index) */
                }
            }
        }

        for (int x : tableau)
        {
            System.out.println(x); /* Affichage du tableau */
        }
    }
}
