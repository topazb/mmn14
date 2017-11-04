
public class StudentTester {

	public static void main(String[] args) {
		
		checknumPaths();
		
		checkIsSumOf();
		
		checkIsSink();
		
        checkFind();

	}

	private static void checknumPaths() {
        int[][] mat4 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        
        int x1 = 0,  y1 = 0, x2 = 1, y2 = 0;

        if(0 != Ex14.numPaths(mat4, x1, y1, x2, y2))
        	System.out.println("checknumPaths() is failed");
		
	}

	private static void checkIsSumOf() {
		if(Ex14.isSumOf(new int[] {4,5}, 11) || !Ex14.isSumOf(new int[] {4,5}, 13))
			System.out.println("checkIsSumOf() is failed");
		
	}

	private static void checkFind() {
        int[][] mat = {
                {1, 2},
                {3, 4}};
        if(!Ex14.find(mat, 1))
        	System.out.println("checkFind() is failed");
		
	}

	private static void checkIsSink() {
        int[][] mat1 = { //sink=1
                {0, 1},
                {0, 0}};
		
        int[][] mat2 = { //sink=2
                {0, 1, 1},
                {0, 1, 1},
                {0, 0, 0}};

        if(Ex14.isSink(mat1) != 1 || Ex14.isSink(mat2) != 2)
        	System.out.println("isSink() is failed");

        
	}

}
