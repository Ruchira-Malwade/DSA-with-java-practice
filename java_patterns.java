/* rectangle
hollow_Rectangle
triangle
inverted_and_rotated_pyramid
inverted_half_pyramid
floyd's_triangle
butterfly
solid_rhombus
hollow_rhombus
number_pyramid
palindrome_patternNumbers
triangle_of_binaryNum
Diamond
 */

// import java.util.*;

public class java_patterns{

    public static void rectangle(int n){
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_Rectangle(int n){
         for (int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
    }
}

public static void triangle(int n){
    for(int i=1; i<=n; i++){
        for (int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void inverted_and_rotated_pyramid(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void inverted_half_pyramid(int n){
    for(int i=1; i<=n; i++){
        for (int j=1; j<=n-i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
}

public static void floyds_triangle(int n){
    int counter = 1;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }
}

public static void butterfly(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n; i>=1; i--){
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void solid_rhombus(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i+1; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=n; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void hollow_rhombus(int n){
     for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i+1; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=n; j++){
            if(i==1 || j==1 || i==n || j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }     
        }
        System.out.println();
    }
}

public static void number_pyramid(int n){
    for(int i= 1; i<=n; i++){
        for(int j=1; j<=(n-i+1); j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public static void palindrome_patternNumbers(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<= n-i+1; j++){
            System.out.print(" ");
        }
        for(int j=i; j>=2; j--){
            System.out.print(j);
        }
        for(int j=1; j<=i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
}

public static void triangle_of_binaryNum(int n){
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
            if(j % 2 == 0 && i%2==0 || j%2 !=0 && i%2!=0){
                System.out.print("1");
            }
            else{
                System.out.print("0");
            }
            
        }
        System.out.println();
    }
}

public static void Diamond(int n){
    for(int i =1; i<=n; i++){
        for (int j=1; j<=n-i+1; j++ ){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=2; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
     for(int i =n; i>=1; i--){
        for (int j=1; j<=n-i+1; j++ ){
            System.out.print(" ");
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        for(int j=2; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String arg[]){
        // rectangle(5);
        // hollow_Rectangle(5);
        // triangle(5);
        // inverted_and_rotated_pyramid(5);
        // inverted_half_pyramid(5);
        // floyds_triangle(5);
        // butterfly(5);
        // solid_rhombus(5);
        // hollow_rhombus(5);
        // number_pyramid(5);
        // palindrome_patternNumbers(5);
        // triangle_of_binaryNum(5);
        // Diamond(5);
    }
}