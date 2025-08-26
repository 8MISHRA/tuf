package tuf_patterns;

//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

public class p10 {

    public static void main(String[] args) {
        // int lines = 5;
        // for (int row = 0; row < lines; row++){
        //     for (int spc = 0; spc < lines - row - 1; spc++){
        //         System.out.print(" ");
        //     }
        //     for (int str = 0; str < 2*row+1; str++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for (int row = 1; row < lines; row++){
        //     for (int spc = 0; spc < row; spc++){
        //         System.out.print(" ");
        //     }
        //     for (int str = 0; str < 2*(lines - row) - 1; str++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        int lines = 5;
        int totalRows = 2*lines - 1;
        for (int row = 0; row < totalRows; row++){
            int spc = (row < lines) ? lines - row - 1 : row - lines + 1;
            int str = (row < lines) ? 2*row + 1 : 2*(totalRows - row) - 1;
            // System.out.println(String.format("coutnt spaces: %d stars: %d", spc, str));
            System.out.println(" ".repeat(spc) + "*".repeat(str));
        }
    }
}
