
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Tester2
{
 public static void checkFind() {
        int[][] mat = {
                {1, 2},
                {3, 4}};
        int[][] mat1 = {
                {-4,-2,6,9},
                {2,5,11,13},
                {14,20,25,26},
                {22,24,49,57},
            };
        int[][] mat2 = {
                {1,2,5,6,17,18,21,22},
                {3,4,7,8,19,20,23,24},
                {9,10,13,14,25,26,29,30},
                {11,12,15,16,27,28,31,32},
                {33,34,37,38,49,50,53,54},
                {35,36,39,40,51,52,55,56},
                {41,42,45,46,57,58,61,62},
                {43,44,47,48,59,60,63,64},
            };   
        int[][] mat3={
                {10,20,50,60,170,180,210,220},
                {30,40,70,80,190,200,230,240},
                {90,100,130,140,250,260,290,300},
                {110,120,150,160,270,280,310,320},
                {330,340,370,380,490,500,530,540},
                {350,360,390,400,510,520,550,560},
                {410,420,450,460,570,580,610,620},
                {430,440,470,480,590,600,630,640},
            };
            
        System.out.println("Test 1 : the answer is : " + Ex14.find(mat,65) + " it shoud be : false");
        System.out.println("Test 2 : the answer is : " + Ex14.find(mat1,65) + " it shoud be : false");
        System.out.println("Test 3 : the answer is : " + Ex14.find(mat2,65) + " it shoud be : false");
        System.out.println("Test 4 : the answer is : " + Ex14.find(mat,1) + " it shoud be : true");
        System.out.println("Test 5 : the answer is : " + Ex14.find(mat,2) + " it shoud be : true");
        System.out.println("Test 6 : the answer is : " + Ex14.find(mat,3) + " it shoud be : true");
        System.out.println("Test 7 : the answer is : " + Ex14.find(mat,4) + " it shoud be : true");
        System.out.println("Test 8 : the answer is : " + Ex14.find(mat1,-2) + " it shoud be : true");
        System.out.println("Test 9 : the answer is : " + Ex14.find(mat1,9) + " it shoud be : true");
        System.out.println("Test 10 : the answer is : " + Ex14.find(mat1,24) + " it shoud be : true");
        System.out.println("Test 11 : the answer is : " + Ex14.find(mat1,49) + " it shoud be : true");
        System.out.println("Test 12 : the answer is : " + Ex14.find(mat1,48) + " it shoud be : false");
        System.out.println("Test 13 : the answer is : " + Ex14.find(mat2,7) + " it shoud be : true");
        System.out.println("Test 14 : the answer is : " + Ex14.find(mat2,29) + " it shoud be : true");
        System.out.println("Test 15 : the answer is : " + Ex14.find(mat2,40) + " it shoud be : true");
        System.out.println("Test 16 : the answer is : " + Ex14.find(mat2,63) + " it shoud be : true");
        System.out.println("Test 17 : the answer is : " + Ex14.find(mat2,63) + " it shoud be : true");
      System.out.println("Test 18 : the answer is : " + Ex14.find(mat3,26) + " it shoud be : false");
       System.out.println("Test 19 : the answer is : " + Ex14.find(mat3,218) + " it shoud be : false");
      System.out.println("Test 20 : the answer is : " + Ex14.find(mat3,435) + " it shoud be : false");
       System.out.println("Test 21  : the answer is : " + Ex14.find(mat3,633) + " it shoud be : false");
        System.out.println("Test 22  : the answer is : " + Ex14.find(mat3,9) + " it shoud be : false");
    }
}
