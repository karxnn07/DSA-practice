package Basics;
// Write a program to print the following pattern:
// ****
// ***
// **
// *
// public class javabasics{
//     public static void main(String args[]){
//         System.out.println("****");
//         System.out.println("***");
//         System.out.println("**");
//         System.out.println("*");
//     }
// }

// Print star pattern:
// *
// **
// ***
// ****
// public class nested {
//     public static void main(String args[]){
//         for( int line = 1; line <= 4; line++){
//             for (int star = 1; star <= line; star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Print inverted star pattern:
// ****
// ***
// **
// *
// public class nested{
//     public static void main(String args[]){
//         int n = 4;
//         for (int i=1; i <=4; i++){
//             for (int s = 1; s <=(n-i+1); s++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Print hollow rectangle pattern:

public class patterns{
// hollow rectangle pattern:    
    public static void hollow_rectangle(int totalrows , int totalcolumns){
        for(int i = 1; i <= totalrows; i++){
            for(int j = 1; j <= totalcolumns; j++){
                if (i==1 || i==totalrows || j==1 || j==totalcolumns){
                    System.out.print(" * ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    // inverted and rotated half pyramid:
    public static void inverted_rotated_half_pyramid(int n){
        for (int i=1; i<=n; i++){

            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // inverted half pyramids pattern with numbers:
    public static void inverted_half_pyramids(int n){
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    // floyds triangle pattern:
    public static void floyds_triangle(int n){
        int counter=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    //0 1 triangle: 
    public static void zero_one_triangle(int n){
        for (int i =1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if( (i+j)%2 == 0){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    // Butterfly pattern:
    public static void Butterfly_pattern(int n){
        // first half:
        for (int i=1; i<=n; i++){
            // stars - i :
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // spaces - 2*(n-i):
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // stars - i:
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half:
            for(int i=n; i>=1; i--){
                // stars - i:
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                // spaces - 2*(n-i):
                for(int j=1; j<=2*(n-i); j++){
                    System.out.print(" ");
                }
                // stars - i:
                for (int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        // solid rhombus:
        public static void solid_rhombus(int n){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=(n-i); j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=n; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

// hollow rhombus:
public static void hollow_rhombus(int n){
    for(int i =1; i<=n; i++){
        // spaces
        for (int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        // hollow rectangle
        for (int j=1; j<=n; j++){
            if( i==1 || i==n || j==1 || j==n){
                System.out.print("*");
            } else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

// diamond pattern
public static void diamond_pattern(int n){
    // first half
    for (int i=1; i<=n; i++){
        // spaces
        for (int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        // stars
        for (int j=1; j<=(2*i-1); j++){
            System.out.print("*");
        }
        System.out.println();
    }
    // second half
    for (int i=n; i>=1; i--){
        // spaces
        for (int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        // stars
        for (int j=1; j<=(2*i-1); j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

    public static void main(String args[]){
       diamond_pattern(3);
    }
}