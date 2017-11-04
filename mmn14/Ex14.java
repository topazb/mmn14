/**
 * Maman 14 - 4 questions.
 *
 * @author Topaz Braverman
 * @version 13.6.17 v-1.0
 */

public class Ex14
{ 
    /**
     * Q1 - 
     * 
     * "sink" : The values of the line[k] are all 0
     *          and values of the column[k] are all 1 (exept [k][k].
     *          
     * Time Complexity -  O(n) : one while loop that depends on the array length.
     * Space Complexity - O(1) : the amount of memory that used is constant and does not depends on the data that it is processing.
     * 
     * @param   mat[][] - 2D array in size of nXn full of 0 and 1.
     * @return  The "sink" index.
     * @return  -1 if there is NO "sink".
     * 
     */

    public static int isSink (int [][] mat) 
    {
        int i=0,j=0;
        boolean sink=true;

        while(j<mat.length) 
        {            
            if( i==j && mat[j][i]==0) //checks if mat[k][k]=0
            {    
                sink=true;
                i++;
            }
            else if (mat[j][i]==0 && mat[i][j]==1) // checks if line is 0 , and column is 1
            { 
                sink=true;
                i++;
            }
            else // NOT a 'sink' - increase row index
            {
                sink=false;
                j++;
                i=0; // reset the line index
            }

            if (sink && i==mat.length) //found a 'sink'
                return j;
        }
        return -1; // there is NO 'sink'
    }

    /**
     * Q2 -
     * A method that returns "true" if and only if a value is in the sorted matrix.
     * 
     * Time Complexity -  O(log(n)) : binary search - each iteration the search area on the matrix is minimized by half.
     * Space Complexity - O(1) : the amount of memory that used is constant and does not depends on the data that it is processing.
     * 
     * @param   mat[][] - 2D sorted array in size of n^2 where n=2^k.
     * @param   x an integer to serach 
     * @return  True if x was found.  False if x was NOT found. 
     */
    public static boolean find(int[][] mat, int x)
    {
        int hiRow = mat.length-1;
        int loRow = 0;
        int hiCol = mat.length-1;
        int loCol = 0;

        while(loCol<=hiCol && loRow<=hiRow) //array bounds
        {           
            if (Math.abs(hiRow-loRow) >= Math.abs(hiCol-loCol)) // if the matrix size is [n]x[n]
            {
                // cuts the matrix horizontaly
                int midRow = loRow+(hiRow-loRow)/2;
                int value = mat[midRow][hiCol];

                if (x==value)
                    return true;

                if (x<value)
                    hiRow = midRow;

                else if (x>value)
                    loRow = midRow +1;                
            }
            else // the matrix is NOT a squre
            {
                // cuts the matrix verticaly
                int midCol = loCol+(hiCol-loCol)/2; 
                int value = mat[hiRow][midCol];

                if (x==value)
                    return true;

                if (x<value)
                    hiCol=midCol;
                else if (x>value)
                    loCol = midCol +1;       
            }

            if(loRow==hiRow && loCol==hiCol && mat[loRow][loCol]!=x) // check for matrix on size of 1 cell
                return false;
        }
        return false;
    }

    /**
     * Q3 - 
     * A recursive methood that accepts set of natural numbers
     * and a natural number n, and returns true if n is the sum out of the set.
     * Otherwise, the method will return false
     * 
     * @param   s[] array of natural numbers different from each other.
     * @param   n   key to compare to.
     * 
     * @return  True is n is sum of s[],
     *          False otherwise.
     */
    public static boolean isSumOf(int [] s, int n)
    {  
        return isSumOf(s,n,0,0);
    }

    private static boolean isSumOf(int [] s, int n, int i, int sum)
    {    
        if(n==sum) // base case
            return true;

        if (sum<n && i<s.length)
        {            
            if(isSumOf(s,n,i,sum+=s[i])) // Checks the sum with the same number
                return true;             
            else if (isSumOf(s,n,i+1,sum-=s[i])) // Checks the sum with other number
                return true;
        }
        // sum is grater then n 
        // or sum is less then n , and there is no more numbers to add.
        return false; 
    }

    /**
     * Q4 - 
     * A 'path' is a a series of cells in a 2D array: 
     *       A. The first cell in the series is ([x1][y1])
     *       B. The last cell in the series is ([x2] [y2])
     *       C. The passage from a cell is only to its neighbors:
     *          Above him, Below him, to his right and to his left.
     *       D. Each cell in the array appears at most a single time in the route
     * 
     * @param   mat A          2D Array of positive integers.
     * @param   x1,y1,x2,y2    Array cells located above the main diagonal (mat[i][i]).
     * 
     * @return  The number of 'paths' that do not cross the main diagonal (but may contain
     *          cells located in this diagonal) that exist between the two cells.
     */ 
    public static int numPaths (int[][] mat,
    int x1, int y1, int x2, int y2)
    {
        return numPaths(mat, x1,y1, x2,y2, 0);
    }

    private static int numPaths (int[][] mat,
    int x1, int y1, int x2, int y2, int counter)
    {  
        if(y1>=x1 && y1<mat.length && x1>=0) // checks array bounds and above mat[i][i]
        {             
            if (x1==x2 && y1==y2) // found 1 path
                return 1;

            if(mat[x1][y1] != -1 ) // checks if allready been there 
            {
                int temp = mat[x1][y1]; // backup the original value
                mat[x1][y1] = -1; // marks the cell

                counter += numPaths(mat, x1,y1+1, x2,y2, counter); //right
                counter += numPaths(mat, x1+1,y1, x2,y2, counter); //down
                counter += numPaths(mat, x1,y1-1, x2,y2, counter); //left
                counter += numPaths(mat, x1-1,y1, x2,y2, counter); //up              

                mat[x1][y1] = temp;
                return counter;
            }
        }
        return 0; // didnt fount a path
    }
}
