// package tuf_patterns;

// // *********
// //  *******
// //   *****
// //    ***
// //     *
// //    ***
// //   *****
// //  *******
// // *********

// public class p9 {
//     public static void main(String[] args) {
//         int lines = 5;
//         for (int row = 0; row < lines; row++){
//             for (int spc = 0; spc < row; spc++){
//                 System.out.print(" ");
//             }
//             for (int star = 0; star < 2*(lines - row)-1; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for (int row = 0; row < (lines - 1); row++){
//             for (int spc = 0; spc < lines - row - 2; spc++){
//                 System.out.print(" ");
//             }
//             for (int star = 0; star < 2*(row)+3; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


package tuf_patterns;

public class p9 {
    public static void main(String[] args) {
        int lines = 5;
        int totalRows = 2 * lines - 1;

        for (int row = 0; row < totalRows; row++) {
            int spaces = (row < lines) ? row : (totalRows - row - 1);
            int stars = (row < lines) 
                        ? (2 * (lines - row) - 1) 
                        : (2 * (row - lines + 1) + 1);

            System.out.println(" ".repeat(spaces) + "*".repeat(stars));
        }
    }
}
