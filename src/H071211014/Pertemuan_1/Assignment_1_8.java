package H071211014.Pertemuan_1;
public class Assignment_1_8 {

    public static void main(String[] args) {
        int[][] nums = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };
        
        int num = 5;
        boolean isFound = false;
        for(int i = 0; i < nums.length; i++) {
            for (int j =0; j < nums[i].length; j++) {
                if (num == nums[i][j]){
                    System.out.printf("Found %d at [%d][%d]", num, i, j); 
                    isFound = true;
                    break;
                }
            } 
            if(isFound) {
                break;
            }
        }
    }
}
