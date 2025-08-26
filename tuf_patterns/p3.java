package tuf_patterns;

// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 4 5 
public class p3 {
    public static void main(String[] args){
        for (int row = 0; row < 5; row++){
            for (int col = 0; col < row+1; col++){
                System.out.print(col + 1 + " ");
            }
            System.out.println();
        }
    }
}
