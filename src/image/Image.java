/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image;

/**
 *
 * @author formation_gep
 */
public class Image {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int moy;
        
        
        int [] [] Matrice = new int [][] {
                                {25,28,100,100,100, 100},
                                {44,45,50,100,100, 100},
                                {65,65,50,20,100, 100},
                                {90,62,100,5,0, 0},
                                {60,87,100,0,100, 100},
                                };
        
 
        // Affichage de la Matrice
        AfficheMatrice(Matrice);

        // Appel de Mystere
        //Matrice = Mystere (Matrice);
        //AfficheMatrice(Matrice);
        
        // Appel de la fonction Accentuer
       //Matrice = Accentuer(Matrice);
         // AfficheMatrice(Matrice);
         
        //Appel de la fonction Moyenne
      //   moy= Moyenne(Matrice);
        // System.out.println();
        // System.out.println(moy);

        // Appel de la fonction Dimimuer le contraste
            moy= Moyenne(Matrice);
            Matrice = Diminuer(Matrice, moy);
            AfficheMatrice(Matrice);

        
    }

public static int  [] []  Mystere ( int Matrice[] []) {  
    
    for (int i=0; i <5; i++) {
           for (int j=0; j<6; j++){
               Matrice[i] [j]= 100- Matrice[i] [j]; 
              }
        }
    return Matrice;
}
public static int  [] []  Accentuer ( int Matrice[] []) {  
    
    for (int i=0; i <5; i++) {
           for (int j=0; j<6; j++){
               if ( Matrice[i] [j]> 75)
                    Matrice[i] [j]= 100; 
               else if ( Matrice[i] [j]> 50)
                    Matrice[i] [j]= 75; 
               else 
                    Matrice[i] [j]= Matrice[i] [j]/2; 
              }
        }
    return Matrice;
}
public static int Moyenne ( int Matrice[] []) {
        // les dimensions du tableau => nb de postes
    int pond= 5*6;
    int cumul =0;
    
    for (int i=0; i <5; i++) {
           for (int j=0; j<6; j++){
           cumul= cumul + Matrice[i] [j];
              }
        }
    return cumul/pond;
}
public static int  [] []  Diminuer ( int Matrice[] [], int M) {  
    
    for (int i=0; i <5; i++) {
           for (int j=0; j<6; j++){
               Matrice[i] [j]= (Matrice[i] [j]+ M)/2; 
              }
        }
    return Matrice;
}
public static void   AfficheMatrice ( int Matrice[] []) {  
    
     // Affichage de la matrice
         for (int i=0; i<5; i++){
                            System.out.println();
                            for  (int j=0; j<4; j++){
                            System.out.print(Matrice[i][j] + "\t");
                            }        
                        }   
        System.out.println("--------------------------------");

}
}
