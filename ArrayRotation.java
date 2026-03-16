
//See Instrucitons:
// http://apcsa-book.ausdk12.org/apcsa/r/cur/c4/L23_2D_arrays/exercises3.html?topic=c4%2FL23_2D_arrays.topic
public class ArrayRotation{
    private int[][] nums;
    
    public ArrayRotation(int n){
        nums = new int[n][n];
        int x = 1;
        for(int r = 0; r< nums.length;r++){
            for(int c = 0; c< nums[0].length; c++){
                nums[r][c]= x;
                x++;
            }
        }
        for(int r = 0; r<nums.length;r++){
                for(int c = 0; c<nums[0].length;c++){
                    System.out.print(nums[r][c]+"|");
                }
                System.out.println("");
            } 
        // Removed rotate() call from constructor
    }

    public void rotate(){
        int n = nums.length;
        int[][] temp = new int[n][n];
        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                temp[c][n - 1 - r] = nums[r][c];
            }
        }
        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                nums[r][c] = temp[r][c];
            }
        }

        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                System.out.print(nums[r][c] + "|");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        ArrayRotation r = new ArrayRotation(5);
        r.rotate();

    }
}

