package recursion;

/*
Print numbers from 1 to N without the help of loops.

        Example 1:

        Input:
        N = 10
        Output: 1 2 3 4 5 6 7 8 9 10

        Example 2:

        Input:
        N = 5
        Output: 1 2 3 4 5
*/



public class oneToN {

    public void printNos(int N)
    {
        //Your code here
        if(N==0) return;
        printNos(N-1);
        System.out.print(N +" ");
    }
}

