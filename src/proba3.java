import java.util.Scanner;
public class proba3 {
    public static void main(String[] args) {
        String word;
       Scanner inputDevice = new Scanner(System.in);
       System.out.println("Enter the word JAVA");
       word = inputDevice.next();

        char letter[]=new char [4];
        for (int k=0; k < 4; k++){
          letter[k]=word.charAt(k);}
        System.out.println("The first letter" + " " + letter[0]);
        System.out.println("The second letter" + " " + letter[1]);
        System.out.println("The third letter" + " " + letter[2]);
        System.out.println("The fourth letter" + " " + letter[3]);

        char twoD[][] = new char[5][35];
        int i, j = 0;
               char m=' ';

        for (i = 0; i < 5; i++)
            for (j = 0; j < 5; j++) {
               if ((i==3 & j==0 )||i==4|| j==4)
                twoD[i][j] = word.charAt(0);
               else
                twoD[i][j] = m;            }
        for (i = 0; i < 5; i++)
            for (j = 5; j < 15; j++) {
                if
                ((i==0 & j==10)|
                        (i==1 & (j==9 | j==11))|
                        (i==2 & (j==8 | j==12))|
                        (i==3 & (j==7|j==8|j==9|j==10|j==11|j==12|j==13))|
                        (i==4 & (j==6 | j==14)))
                    twoD[i][j] =word.charAt(1) ;
                else
                    twoD[i][j] = m;            }

        for (i = 0; i < 5; i++)
            for (j = 15; j < 25; j++) {
                if ((i==0 & (j==16 | j==24))|
                        (i==1 & (j==17 | j==23))|
                        (i==2 & (j==18 | j==22))|
                        (i==3 & (j==19|j==21))|
                        (i==4 & j==20 ))
                    twoD[i][j] =word.charAt(2) ;
                else
                    twoD[i][j] = m;            }

        for (i = 0; i < 5; i++)
            for (j = 25; j < 35; j++) {
                if
                ((i==0 & j==30)|
                        (i==1 & (j==29 | j==31))|
                        (i==2 & (j==28 | j==32))|
                        (i==3 & (j==27|j==28|j==29|j==30|j==31|j==32|j==33))|
                        (i==4 & (j==26 | j==34)))
                    twoD[i][j] =word.charAt(3) ;
                else
                    twoD[i][j] = m;            }
        if (word.equalsIgnoreCase ("java"))
                      for (i = 0; i < 5; i++){
            for (j = 0; j < 35; j++)
                System.out.print(twoD[i][j] + " ");
            System.out.println();}
            else System.out.println("*******TRY AGAIN*******"); } }




