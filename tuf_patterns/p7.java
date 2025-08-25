package tuf_patterns;

// Following pattern
//          *
//         ***
//        *****
//       *******
//      *********
//     ***********
//    *************
//   ***************
//  *****************
// *******************

public class p7 {
    public static void main(String[] args){
        int lines = 10;
        for (int row = 0; row < lines; row++){
            for (int spc = 0; spc < lines - row - 1 ; spc++){
                System.out.print(" ");
            }
            for (int col = 0; col < 1 + row*2; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
