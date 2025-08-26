package tuf_patterns;

// 1 
// 2 2 
// 3 3 3 
// 4 4 4 4 
// 5 5 5 5 5 
public class p4 {
    public static void main(String[] args){
        for (int row = 0; row < 5; row++){
            for (int col = 0; col < row+1; col++){
                System.out.print(row + 1 + " ");
            }
            System.out.println();
        }
    }
}
