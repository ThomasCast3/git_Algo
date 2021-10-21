package com.company;

public class TriBullesOpti
{
    public static void main(String[] args)
    {
        int[] tableau = { 6, 5, 3, 1, 8, 7, 2, 4 }; /* Déclaration du tableau */
        int b = 0;
        int temp; /* Déclaration d'une variable pour permuter les nombres */

        int affectation = 1;
        int comparaison = 0;

        while (b < tableau.length - 1) /* Tant que le tableau n'est pas trié */
        {
            for (int j = 0; j < tableau.length - 1; j++) /* Itération dans le tableau complet - 1 */
            {
                affectation += 1;
                comparaison += 1;
                
                if (tableau[j] > tableau[j + 1]) /* Si le nombre du 1er index est supérieur au nombre de l'index + 1 (ex: 5, 3) */
                {
                    temp = tableau[j]; /* Affectation de tableau[j] à la variable temp (temporaire)*/
                    tableau[j] = tableau[j + 1]; /* Permutation entre le 1er index du tableau et le deuxième */
                    tableau[j + 1] = temp; /* Permutation entre le deuxième index du tableau et le 1er (temp = 1er index) */
                    
                    comparaison += 1;
                    affectation += 3;
                }
            }

            b++;
            
            affectation += 1;
            comparaison += 1;
        }

        for (int x : tableau)
        {
            System.out.println(x); /* Affichage du tableau */
        }
        
        System.out.println("Affectations : " + affectation);
        System.out.println("Affectations : " + comparaison);
    }
}
