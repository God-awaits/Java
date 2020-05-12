import  java.util. * ;
import  javax.swing.JLabel ;
import  javax.swing.JPanel ;

 calculatrice de classe  publique {
 conteneur JPanel privé =  nouveau  JPanel ();
  // Tableau stockant les éléments à afficher dans la calculatrice
 public  static  void  main ( String [] args ) {
  int tab [] =  new  int [ 50 ];
  int i;
  int n = 0 ;
  int  Sum = 0 ;
// LA TAILLE DU TABLEAU
 faire {
 Système . dehors . println ( " veillez entrer dans la taille du tableau " );
 Scanner sc =  nouveau  scanner ( System . In );
n = sc . nextInt ();}
  tandis que (n > 50 );
// REMPLISSAGE DE TABLEAU
 Système . dehors . println ( " **** PROGRAMME DEBUT **** " );
 pour (i = 0 ; i < n; i ++ ) {
 Système . dehors . println ( " veillez entrer un nombre " );
 Scanner sc1 = nouveau  scanner ( System . In );
tab [i] = sc1 . nextInt ();}
// AFFICHAGE DE TABLEAU
 Système . dehors . println ( " Les éléments de tableau sont: " );
 pour (i = 0 ; i < n; i ++ ) {
 Système . dehors . println (tab [i]);}

}
       // On définit la police d'écriture à utiliser
    Police police =  nouvelle  police ( " Arial " , police . BOLD , 20 );
    ecran =  nouveau  JLabel ( " 0 " );
    ecran. setFont ( police );
    // Sur aligne les informations à droite dans le JLabel
    ecran. setHorizontalAlignment ( JLabel . RIGHT );
    ecran. setPreferredSize ( nouvelle  dimension ( 220 , 20 ));
    Opérateur JPanel =  nouveau  JPanel ();      
    operateur. setPreferredSize ( nouvelle  dimension ( 55 , 225 ));
    JPanel chiffre =  nouveau  JPanel ();
    chiffre. setPreferredSize ( nouvelle  dimension ( 165 , 225 ));
    JPanel panEcran =  nouveau  JPanel ();
    panEcran. setPreferredSize ( nouvelle  dimension ( 220 , 30 ));
 < %
   int carre = ( entier ) (request . getservletrequest ( " / carrejava));
    %>
</p> <%
    int rectangle = (Entier) (request.getservletrequest ( " / rectanglejava));

    % >
< / p >  < %
    String name = ( String ) request . getAttribute ( " Bonjour tout le monde! " );
    en dehors. println ( Bonjour tout le  monde !);
    % >


    
    
    
    // Sur parcourt le tableau initialisé
    // afin de créer nos boutons
    for ( int  i = 0 ; i < tab_string . length ; i ++) {
      tab_button [i] =  new  JButton (tab_string [i]);
      tab_button [i] . setPreferredSize (dim);
      commutateur (i) {
        // Pour chaque élément situé à la fin du tableau
        // et qui n'est pas un chiffre
        // sur définit le comportement à avoir grâce à un auditeur
        cas  11  :
          tab_button [i] . addActionListener ( nouveau  EgalListener ());
          chiffre . add (tab_button [i]);
          casser ;
        cas  12  :
          tab_button [i] . setForeground ( Couleur . rouge);
          tab_button [i] . addActionListener ( new  ResetListener ());
          operateur . add (tab_button [i]);
          casser ;
        cas  13  :
          tab_button [i] . addActionListener ( nouveau  PlusListener ());
          tab_button [i] . setPreferredSize (dim2);
          operateur . add (tab_button [i]);
          casser ;
        cas  14  :
          tab_button [i] . addActionListener ( nouveau  MoinsListener ());
          tab_button [i] . setPreferredSize (dim2);
          operateur . add (tab_button [i]);
          casser ;	
        cas  15  :	
          tab_button [i] . addActionListener ( nouveau  MultiListener ());
          tab_button [i] . setPreferredSize (dim2);
          operateur . add (tab_button [i]);
          casser ;
        cas  16  :
          tab_button [i] . addActionListener ( nouveau  DivListener ());
          tab_button [i] . setPreferredSize (dim2);
          operateur . add (tab_button [i]);
          casser ;
        par défaut  :
          // Par défaut, ce sont les premiers éléments du tableau
          // donc des chiffres, sur affecté alors le bon auditeur
          chiffre . add (tab_button [i]);
          tab_button [i] . addActionListener ( nouveau  ChiffreListener ());
          casser ;
      }
    }
    panEcran. ajouter ( ecran );
    panEcran. setBorder ( BorderFactory . createLineBorder ( Couleur . noir ));
    récipient. add ( panEcran , BorderLayout . NORTH );
    récipient. ajouter ( chiffre , BorderLayout . CENTRE );
    récipient. add ( opérateur , BorderLayout . EAST );
    
     // Méthode permettant d'obtenir un calcul selon ceux sélectionnés sélectionnés
   calcul de vide  privé () {
    if (operateur . equals ( " + " )) {
      chiffre1 = chiffre1 + 
            Double . valueOf (ecran . getText ()) . doubleValue ();
      ecran . setText ( String . valueOf (chiffre1));
    }
    if (operateur . vaut ( " - " )) {
      chiffre1 = chiffre1 - 
            Double . valueOf (ecran . getText ()) . doubleValue ();
      ecran . setText ( String . valueOf (chiffre1));
    }          
    if (operateur . equals ( " * " )) {
      chiffre1 = chiffre1 * 
            Double . valueOf (ecran . getText ()) . doubleValue ();
      ecran . setText ( String . valueOf (chiffre1));
    }     
    if (operateur . vaut ( " / " )) {
      essayez {
        chiffre1 = chiffre1 / 
              Double . valueOf (ecran . getText ()) . doubleValue ();
        ecran . setText ( String . valueOf (chiffre1));
      } catch ( ArithmeticException e) {
        ecran . setText ( " 0 " );
      }
    }
  }
    // Auditeur affecté au bouton =
  classe  EgalListener  implémente  ActionListener {
    public  void  actionPerformed ( ActionEvent  arg0 ) {
      calcul ();
      update =  true ;
      clicOperateur =  false ;
    }
  }

  // Auditeur affecté au bouton +
  classe  PlusListener  implémente  ActionListener {
    public  void  actionPerformed ( ActionEvent  arg0 ) {
      if (clicOperateur) {
        calcul ();
        ecran . setText ( String . valueOf (chiffre1));
      }
      sinon {
        chiffre1 =  Double . valueOf (ecran . getText ()) . doubleValue ();
        clicOperateur =  true ;
      }
      operateur =  " + " ;
      update =  true ;
    }
  }

  // Auditeur affecté au bouton -
  classe  MoinsListener  implémente  ActionListener {
    public  void  actionPerformed ( ActionEvent  arg0 ) {
      if (clicOperateur) {
        calcul ();
        ecran . setText ( String . valueOf (chiffre1));
      }
      sinon {
        chiffre1 =  Double . valueOf (ecran . getText ()) . doubleValue ();
        clicOperateur =  true ;
      }
      operateur =  " - " ;
      update =  true ;
    }
  }

  // Auditeur affecté au bouton *
  classe  MultiListener  implémente  ActionListener {
    public  void  actionPerformed ( ActionEvent  arg0 ) {
      if (clicOperateur) {
        calcul ();
        ecran . setText ( String . valueOf (chiffre1));
      }
      sinon {
        chiffre1 =  Double . valueOf (ecran . getText ()) . doubleValue ();
        clicOperateur =  true ;
      }
      operateur =  " * " ;
      update =  true ;
    }
  }

  // Auditeur affecté au bouton /
  classe  DivListener  implémente  ActionListener {
    public  void  actionPerformed ( ActionEvent  arg0 ) {
      if (clicOperateur) {
        calcul ();
        ecran . setText ( String . valueOf (chiffre1));
      }
      sinon {
        chiffre1 =  Double . valueOf (ecran . getText ()) . doubleValue ();
        clicOperateur =  true ;
      }
      operateur =  " / " ;
      update =  true ;
    }
  }

  // Auditeur affecté au bouton de remise à zéro
  La classe  ResetListener  implémente  ActionListener {
    public  void  actionPerformed ( ActionEvent  arg0 ) {
      clicOperateur =  false ;
      update =  true ;
      chiffre1 =  0 ;
      operateur =  " " ;
      ecran . setText ( " " );
    }
  }      
}
