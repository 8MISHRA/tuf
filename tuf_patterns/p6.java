package tuf_patterns;
public class p6 {
    public static void main(String[] args){
        for (int row = 0; row < 5; row++){
            for (int col = 0; col < 5 - row; col++){
                System.out.print(col + 1 + " ");
            }
            System.out.println();
        }
    }
}
