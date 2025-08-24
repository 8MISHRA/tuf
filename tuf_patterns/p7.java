package tuf_patterns;

public class p7 {
    public static void main(String[] args){
        
        for (int row = 0; row < 5; row++){
            for (int spc = 0; spc < 5 - row - 1 ; spc++){
                System.out.print(" ");
            }
            int column = 0;
            while (column<row){
                for (int i = 0; i < column; i++){
                    System.out.print("*");
                }
                column += 2;

            }
            // for (int col = 0; col < row; col++){
            //     System.out.print("*");
            // }
            System.out.println();
        }
    }
}

//     *
//    *** 
//   *****
//  *******
// *********
