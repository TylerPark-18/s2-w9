public class Squiral{
    private int[][] nums;

    public Squiral(int n){

        nums = new int[n][n];
        int cR = 0;
        int cC = 0;
        int cN = n * n;
        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                nums[r][c] = 0;
            }
        }

        for(int i = 0; i < 2 * n; i++){
            while(cC + 1 < n && nums[cR][cC + 1] == 0){
                nums[cR][cC] = cN;
                cC++;
                cN--;
            }

            while(cR + 1 < n && nums[cR + 1][cC] == 0){
                nums[cR][cC] = cN;
                cR++;
                cN--;
            }

            while(cC > 0 && nums[cR][cC - 1] == 0){
                nums[cR][cC] = cN;
                cC--;
                cN--;
            }

            while(cR > 0 && nums[cR - 1][cC] == 0){
                nums[cR][cC] = cN;
                cR--;
                cN--;
            }
        }

        nums[cR][cC] = cN;
            //if odd n, center center
            //if even n, n / 2, row n/ 2 + 1

        print();
    }

    public void print(){
        for(int r = 0; r < nums.length; r++){
            for(int c = 0; c < nums.length; c++){
                System.out.print(nums[r][c] + " ");
                if(nums[r][c] < 10)
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Squiral(5);
    }
}

