package tuf_patterns;

// Following pattern
// *******************
//  *****************
//   ***************
//    *************
//     ***********
//      *********
//       *******
//        *****
//         ***
//          *
public class p8 {
    public static void main(String[] args) {
        
        int lines = 10;

        for (int row = 0; row < lines; row++){
            for (int spc = 0; spc < row; spc++){
                System.out.print(" ");
            }
            for (int star = 0; star < 2*(lines - row) - 1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
