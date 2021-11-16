

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


// ENUNCIADO:

// Positius vs Negatius:

/* Fes un programa que llegeixi una seqüència de nombres enters acabada en zero i escrigui si hi ha més nombres positius(POSITIUS) que negatius(NEGATIUS), o si empaten(IGUALS).

Input Format

Successió de nombres enters acabada en 0.

Constraints

No n'hi ha.

Output Format

{POSITIUS | NEGATIUS | IGUALS}

Sample Input 0

40 -20 -23 5 56 0
Sample Output 0

POSITIUS
Sample Input 1

-34 -54 -45 3 0
Sample Output 1

NEGATIUS
Sample Input 2

1 2 -3 -4 0
Sample Output 2

IGUALS

  */




public class Solution
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int neg = 0;
        int pos = 0;
        int eq = 0;



        while (num != 0)
        {
            if (num > 0)
            {
                pos++;
            }
            else
            {
                neg++;
            }
            num = sc.nextInt();
        }

        if(pos == neg)
        {
            System.out.println("IGUALS");
        }
        else if (pos > neg)
        {
            System.out.println("POSITIUS");
        }
        else if (pos < neg)
        {
            System.out.println("NEGATIUS");
        }

    }
}
