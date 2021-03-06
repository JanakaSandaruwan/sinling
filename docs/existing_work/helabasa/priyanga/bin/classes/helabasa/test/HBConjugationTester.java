 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . t e s t ;  
  
 i m p o r t   h e l a b a s a . H B A n a l y z e r ;  
 i m p o r t   h e l a b a s a . H B C o r p u s ;  
 i m p o r t   h e l a b a s a . H B F o r m ;  
 i m p o r t   h e l a b a s a . H B F o r m C o n t a i n e r ;  
 i m p o r t   h e l a b a s a . H B I r r e g u l a r F o r m ;  
 i m p o r t   h e l a b a s a . H B P O S ;  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n C o n j u g a t i o n R u l e s ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n C o n j u g a t i o n R u l e s E x t e n s i v e ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n S y n t h e s i z e r ;  
 i m p o r t   h e l a b a s a . n o u n s . s c o r i n g . H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . n o u n s . s c o r i n g . H B N o u n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B J o i n R e s u l t s ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B J o i n R e s u l t s S e t ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B W o r d J o i n e r ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B J o i n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B N o u n F o r m S c o r i n g A l o g o r i t h m ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . N o u n C o n j u g a t o r ;  
 i m p o r t   h e l a b a s a . t e s t . H B J o i n T e s t e r . H B J o i n T e s t D a t a ;  
 i m p o r t   h e l a b a s a . u t i l s . H B N u t r a l P r i n t W r i t e r ;  
  
 i m p o r t   j a v a . i o . B u f f e r e d R e a d e r ;  
 i m p o r t   j a v a . i o . F i l e I n p u t S t r e a m ;  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . I n p u t S t r e a m R e a d e r ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 p u b l i c   c l a s s   H B C o n j u g a t i o n T e s t e r   {  
  
 	 p r i v a t e   L i s t < H B C o n j u g a t i o n T e s t D a t a >   l i s t _ T e s t D a t a   =   n e w   A r r a y L i s t < H B C o n j u g a t i o n T e s t D a t a > ( ) ;  
 	 p r i v a t e   S t r i n g [ ]   a r r _ I D s   =   { " P R - D S " , " P R - I S " , " P R - P L " , " K R - D S " , " K R - I S " , " K R - P L " , " K A - D S " , " K A - I S " , " K A - P L " , " S P - D S " , " S P - I S " , " S P - P L " , " A V - D S " , " A V - I S " , " A V - P L " , " S M - D S " , " S M - I S " , " S M - P L " , " A L - D S " , " A L - P L " } ;  
 	  
 	 p u b l i c   H B C o n j u g a t i o n T e s t e r ( )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
 	 }  
  
 	 p u b l i c   v o i d   L o a d T e s t D a t a ( S t r i n g   s F i l e N a m e ,   S t r i n g   s C h a r S e t )  
 	 { 	 	  
 / * 	 	 H B J o i n T e s t D a t a   o T e s t D a t a 1   =   n e w   H B J o i n T e s t D a t a ( "������ " ,   "� " ,   "������ " ) ;  
 	 	 H B J o i n T e s t D a t a   o T e s t D a t a 2   =   n e w   H B J o i n T e s t D a t a ( "��� " ,   "��� " ,   "����� " ) ;  
 	 	 l i s t T e s t D a t a . a d d ( o T e s t D a t a 1 ) ;  
 	 	 l i s t T e s t D a t a . a d d ( o T e s t D a t a 2 ) ;  
 * / 	 	                  
                 i n t   i C o u n t   =   0 ;  
  
                 t r y     {  
  
                 	 B u f f e r e d R e a d e r   b r   =   n e w   B u f f e r e d R e a d e r ( n e w   I n p u t S t r e a m R e a d e r ( n e w   F i l e I n p u t S t r e a m ( s F i l e N a m e ) ,   s C h a r S e t ) ) ;  
                         S t r i n g   s L i n e ;  
                         w h i l e   ( ( s L i n e   =   b r . r e a d L i n e ( ) )   ! =   n u l l )   {                         	  
                         	 i f ( A d d C o n j u g a t i o n T e s t D a t a ( s L i n e ,   i C o u n t ) )  
                         	 {  
                         	 	 i C o u n t + + ;  
                         	 }  
                         }  
                         b r . c l o s e ( ) ;  
  
                 }   c a t c h   ( I O E x c e p t i o n   e )   {  
                 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " H B C o n j u g a t i o n T e s t e r : : L o a d T e s t D a t a   :   E r r o r   a t   r e c o r d   "   +   ( i C o u n t   - 1 )   ) ;  
                         e . p r i n t S t a c k T r a c e ( ) ;                          
                 } 	 	  
                  
                 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " H B C o n j u g a t i o n T e s t e r : : L o a d T e s t D a t a   :   "   +   ( l i s t _ T e s t D a t a . s i z e ( ) )   +   "   T e s t   D a t a   R e c o r d s   L o a d e d . " ) ; 	  
 	 }  
 	  
 	  
 	 p r i v a t e   b o o l e a n   A d d C o n j u g a t i o n T e s t D a t a ( S t r i n g   s L i n e ,   i n t   i L i n e N u m )  
 	 {  
 	 	 / / L e m m a , P R - D S , P R - I S , P R - P L , K R - D S , K R - I S , K R - P L , K A - D S , K A - I S , K A - P L , S P - D S , S P - I S , S P - P L , A V - D S , A V - I S , A V - P L , S M - D S , S M - I S , S M - P L , A L - D S , A L - P L  
 	 	 S t r i n g   c v s S p l i t B y   =   " , " ;  
                 S t r i n g [ ]   i t e m s   =   s L i n e . s p l i t ( c v s S p l i t B y ) ;  
                  
                 i f ( i t e m s . l e n g t h < 2 1 )  
                 {  
                 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " H B C o n j u g a t i o n T e s t e r : : A d d C o n j u g a t i o n T e s t D a t a   :   E r r o r   a t   r e c o r d   "   +   ( i L i n e N u m )   +   "   :   d e l i m e t e r   c o u n t   =   "   +   i t e m s . l e n g t h   +   "   :   [ 0 ] = "   +   i t e m s [ 0 ] ) ;  
                 	 r e t u r n   f a l s e ;  
                 }  
                 e l s e  
                 {                 	  
                 	 H B F o r m C o n t a i n e r   o C o n t a i n e r   =   n e w   H B F o r m C o n t a i n e r ( ) ;  
                 	 H B W o r d   o L e m m a   =   n e w   H B W o r d ( H e l a b a s a . C l e a n ( i t e m s [ 0 ] ) ) ;  
                 	  
                 	 i n t   i L e n   =   a r r _ I D s . l e n g t h ;  
                 	  
                 	 f o r ( i n t   i = 0 ;   i < = i L e n ;   i + + )  
                 	 {  
                 	 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . E x t r a c t T y p e ( a r r _ I D s [ i ] ) ,   H B N o u n . E x t r a c t T y p e ( a r r _ I D s [ i ] ) ,   i t e m s [ i + 1 ] ,   o C o n t a i n e r ) ;  
                 	 }  
                 	  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ P R ,   H B N o u n . H B I _ C A T _ S I N G ,   i t e m s [ 1 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ P R ,   H B N o u n . H B I _ C A T _ I N D E F _ S I N G ,   i t e m s [ 2 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ P R ,   H B N o u n . H B I _ C A T _ P L U R A L ,   i t e m s [ 3 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ K R ,   H B N o u n . H B I _ C A T _ S I N G ,   i t e m s [ 4 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ K R ,   H B N o u n . H B I _ C A T _ I N D E F _ S I N G ,   i t e m s [ 5 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ K R ,   H B N o u n . H B I _ C A T _ P L U R A L ,   i t e m s [ 6 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ K A ,   H B N o u n . H B I _ C A T _ S I N G ,   i t e m s [ 7 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ K A ,   H B N o u n . H B I _ C A T _ I N D E F _ S I N G ,   i t e m s [ 8 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ K A ,   H B N o u n . H B I _ C A T _ P L U R A L ,   i t e m s [ 9 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ S P ,   H B N o u n . H B I _ C A T _ S I N G ,   i t e m s [ 1 0 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ S P ,   H B N o u n . H B I _ C A T _ I N D E F _ S I N G ,   i t e m s [ 1 1 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ S P ,   H B N o u n . H B I _ C A T _ P L U R A L ,   i t e m s [ 1 2 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ A V ,   H B N o u n . H B I _ C A T _ S I N G ,   i t e m s [ 1 3 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ A V ,   H B N o u n . H B I _ C A T _ I N D E F _ S I N G ,   i t e m s [ 1 4 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ A V ,   H B N o u n . H B I _ C A T _ P L U R A L ,   i t e m s [ 1 5 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ S M ,   H B N o u n . H B I _ C A T _ S I N G ,   i t e m s [ 1 6 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ S M ,   H B N o u n . H B I _ C A T _ I N D E F _ S I N G ,   i t e m s [ 1 7 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ S M ,   H B N o u n . H B I _ C A T _ P L U R A L ,   i t e m s [ 1 8 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ A L ,   H B N o u n . H B I _ C A T _ S I N G ,   i t e m s [ 1 9 ] ,   o C o n t a i n e r ) ;  
 / /                 	 A d d C o n j u g a t i o n F o r m ( H B N o u n . H B I _ C O N J _ A L ,   H B N o u n . H B I _ C A T _ P L U R A L ,   i t e m s [ 2 0 ] ,   o C o n t a i n e r ) ;  
 / /                 	  
                 	 H B C o n j u g a t i o n T e s t D a t a   o T e s t D a t a   =   n e w   H B C o n j u g a t i o n T e s t D a t a ( o L e m m a ,   o C o n t a i n e r ) ;  
                 	  
                 	 l i s t _ T e s t D a t a . a d d ( o T e s t D a t a ) ;                 	  
                 	 r e t u r n   t r u e ;  
                 }  
 	 	  
 	 }  
 	  
 	 p u b l i c   v o i d   G e n e r a t e H e a d i n g L i n e ( )  
 	 {  
 	 	 / / L e m m a , P R - D S , P R - I S , P R - P L , K R - D S , K R - I S , K R - P L , K A - D S , K A - I S , K A - P L , S P - D S , S P - I S , S P - P L , A V - D S , A V - I S , A V - P L , S M - D S , S M - I S , S M - P L , A L - D S , A L - P L  
 	 	  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t ( " L e m m a " ) ;  
 	 	  
 	 	 i n t   i L e n   =   a r r _ I D s . l e n g t h ;  
         	  
         	 f o r ( i n t   i = 0 ;   i < i L e n ;   i + + )  
         	 {         	 	  
         	 	 H e l a b a s a . G e t L o g ( ) . p r i n t ( " , "     +   a r r _ I D s [ i ] ) ;  
         	 } 	 	  
         	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( ) ;  
 	 }  
 	  
 	 p u b l i c   v o i d   G e n e r a t e T e m p l a t e L i n e ( S t r i n g   s L e m m a )  
 	 {  
 	 	 / / L e m m a , P R - D S , P R - I S , P R - P L , K R - D S , K R - I S , K R - P L , K A - D S , K A - I S , K A - P L , S P - D S , S P - I S , S P - P L , A V - D S , A V - I S , A V - P L , S M - D S , S M - I S , S M - P L , A L - D S , A L - P L  
 	 	 H B N o u n C o n j u g a t i o n R u l e s   o R u l e s   =   n e w   H B N o u n C o n j u g a t i o n R u l e s E x t e n s i v e ( ) ;    
 	 	 H B J o i n S c o r i n g A l g o r i t h m   o J o i n A l g o   =   n e w   H B N o u n F o r m S c o r i n g A l o g o r i t h m ( ) ;    
 	 	 H B N o u n S c o r i n g A l g o r i t h m   o N o u n A l g o   =   n e w   H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ( ) ;  
 	 	 H B N o u n   o N o u n   =   H B N o u n S y n t h e s i z e r . S y n t h e s i z e N o u n ( n e w   H B W o r d ( s L e m m a ) ,   o R u l e s ,   o N o u n A l g o ,   o J o i n A l g o ,   - 1 ) ;  
 	 	  
 	 	 / / o N o u n . D e b u g P r i n t ( ) ;  
 	 	  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t ( s L e m m a ) ;  
 	 	  
 	 	 i n t   i L e n   =   a r r _ I D s . l e n g t h ;  
         	  
         	 f o r ( i n t   i = 0 ;   i < i L e n ;   i + + )  
         	 {  
         	 	 L i s t < S t r i n g >   l i s t F o r m s   =   o N o u n . G e t N o u n F o r m S t r i n g s ( H B N o u n . E x t r a c t T y p e ( a r r _ I D s [ i ] ) ,   H B N o u n . E x t r a c t S u b T y p e ( a r r _ I D s [ i ] ) ) ;  
         	 	  
         	 	 / / H e l a b a s a . G e t L o g ( ) . p r i n t l n ( a r r _ I D s [ i ]   +   "   :   T = "   +   H B N o u n . E x t r a c t T y p e ( a r r _ I D s [ i ] )   +   "   :   S T = "   +   H B N o u n . E x t r a c t S u b T y p e ( a r r _ I D s [ i ] ) ) ;  
         	 	 	 	  
         	 	 S t r i n g   s F o r m   =   " " ;  
         	 	 i f ( l i s t F o r m s ! = n u l l   & &   l i s t F o r m s . s i z e ( ) > 0 )  
         	 	 {  
         	 	 	 s F o r m   =   l i s t F o r m s . g e t ( 0 ) ;  
         	 	 }  
         	 	 H e l a b a s a . G e t L o g ( ) . p r i n t ( " , "     +   s F o r m ) ;  
         	 } 	 	  
         	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( ) ;  
 	 }  
 	  
 	 p r i v a t e   v o i d   A d d C o n j u g a t i o n F o r m ( i n t   i T y p e ,   i n t   i S u b T y p e ,   S t r i n g   s F o r m ,   H B F o r m C o n t a i n e r   o C o n t a i n e r )  
 	 {  
 	 	 i f ( s F o r m ! = n u l l   & &   s F o r m . t r i m ( ) . l e n g t h ( ) > 0 )  
 	 	 {  
 	 	 	 H B I r r e g u l a r F o r m   o F o r m   =   n e w   H B I r r e g u l a r F o r m ( H e l a b a s a . C l e a n ( s F o r m ) ,   ( s h o r t ) i T y p e ,   ( s h o r t ) i S u b T y p e ) ;  
 	 	 	 o C o n t a i n e r . A d d F o r m ( o F o r m ) ; 	 	 	  
 	 	 }  
 	 } 	  
 	  
 	 p r i v a t e   v o i d   C o n j u g a t e ( H B C o n j u g a t i o n T e s t D a t a   o T e s t D a t a ,   H B N o u n C o n j u g a t i o n R u l e s   o R u l e s ,   H B J o i n S c o r i n g A l g o r i t h m   o J o i n A l g o ,   H B N o u n S c o r i n g A l g o r i t h m   o N o u n A l g o )  
 	 {  
 	 	 H B N o u n   o N o u n   =   H B N o u n S y n t h e s i z e r . S y n t h e s i z e N o u n ( o T e s t D a t a . G e t L e m m a ( ) ,   o R u l e s ,   o N o u n A l g o ,   o J o i n A l g o ,   - 1 ) ;  
 	 	 i f ( o N o u n ! = n u l l )  
 	 	 {  
 	 	 	 o T e s t D a t a . S e t A c t u a l R e s u l t ( o N o u n ) ;  
 	 	 }  
 	 }  
 	 p r i v a t e   v o i d   C o n j u g a t e A l l ( H B N o u n C o n j u g a t i o n R u l e s   o R u l e s ,   H B J o i n S c o r i n g A l g o r i t h m   o J o i n A l g o ,   H B N o u n S c o r i n g A l g o r i t h m   o N o u n A l g o )  
 	 {  
   	 	 i n t   i C o u n t   =   l i s t _ T e s t D a t a . s i z e ( ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B C o n j u g a t i o n T e s t D a t a   o T e s t D a t a   =   l i s t _ T e s t D a t a . g e t ( i ) ;    
 	 	 	 C o n j u g a t e ( o T e s t D a t a ,   o R u l e s ,   o J o i n A l g o ,   o N o u n A l g o ) ;  
 	 	 	 o T e s t D a t a . V a l i d a t e ( ) ;  
 	 	 } 	 	  
 	 }  
 	  
 	 p u b l i c   v o i d   P u b l i s h R e s u l t s ( )  
 	 {  
 	 	 / / T O D O  
 	 	 i n t   i C o u n t   =   l i s t _ T e s t D a t a . s i z e ( ) ;  
 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 {  
 	 	 	 H B C o n j u g a t i o n T e s t D a t a   o T e s t D a t a   =   l i s t _ T e s t D a t a . g e t ( i ) ; 	 	  
 	 	 	 o T e s t D a t a . D e b u g P r i n t ( i + 1 ) ;  
 	 	 }  
 	 }  
 	 	  
 	 p u b l i c   v o i d   T e s t ( )  
 	 {  
 	 	 H B N o u n C o n j u g a t i o n R u l e s   o R u l e s   =   n e w   H B N o u n C o n j u g a t i o n R u l e s E x t e n s i v e ( ) ;    
 	 	 H B J o i n S c o r i n g A l g o r i t h m   o J o i n A l g o   =   n e w   H B N o u n F o r m S c o r i n g A l o g o r i t h m ( ) ;    
 	 	 H B N o u n S c o r i n g A l g o r i t h m   o N o u n A l g o   =   n e w   H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ( ) ;  
 	 	  
 	 	 C o n j u g a t e A l l ( o R u l e s ,   o J o i n A l g o ,   o N o u n A l g o ) ;  
 	 	  
 	 	 P u b l i s h R e s u l t s ( ) ; 	 	  
 	 }  
  
 	 p u b l i c   c l a s s   H B C o n j u g a t i o n T e s t D a t a  
 	 {  
 	 	 p r i v a t e   H B W o r d   o _ L e m m a   =   n u l l ;  
 	 	 p r i v a t e   H B F o r m C o n t a i n e r   o _ E x p e c t e d R e s u l t   =   n u l l ;  
 	 	 p r i v a t e   H B N o u n   o _ A c t u a l R e s u l t   =   n u l l ;  
 	 	 p r i v a t e   s h o r t [ ] [ ]   a r r _ R e s u l t s   =   n e w   s h o r t [ 7 ] [ 3 ] ;  
 	 	 p r i v a t e   s h o r t   i _ S c o r e   =   0 ;  
 	 	 p r i v a t e   s h o r t   i _ O u t O f   =   0 ;  
 	 	  
 	 	 p u b l i c   H B C o n j u g a t i o n T e s t D a t a ( H B W o r d   o L e m m a ,   H B F o r m C o n t a i n e r   o E x p e c t e d R e s u l t s )  
 	 	 {  
 	 	 	 o _ L e m m a   =   o L e m m a ;  
 	 	 	 o _ E x p e c t e d R e s u l t   =   o E x p e c t e d R e s u l t s ; 	 	 	  
 	 	 }  
 	 	  
 	 	 p u b l i c   v o i d   D e b u g P r i n t ( i n t   i L i n e N u m )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t ( i L i n e N u m   +   "   :   "   +   o _ L e m m a . G e t N a t u r a l F o r m ( )   +   "   :   ( "   +   i _ S c o r e   +   " / "   +   i _ O u t O f   +   " ) " ) ;  
 	 	 	 f o r ( i n t   i = 0 ;   i < 7 ;   i + + )  
 	 	 	 {  
 	 	 	 	 f o r ( i n t   j = 0 ;   j < 3 ;   j + + )  
 	 	 	 	 {  
 	 	 	 	 	 i n t   i F o r m S c o r e   =   a r r _ R e s u l t s [ i ] [ j ] ;  
 	 	 	 	 	 i f ( i F o r m S c o r e = = 1 )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t ( " ,   P " ) ;  
 	 	 	 	 	 }  
 	 	 	 	 	 e l s e   i f ( i F o r m S c o r e = = - 1 )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t ( " ,   F " ) ;  
 	 	 	 	 	 }  
 	 	 	 	 }  
 	 	 	 }  
 	 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( ) ;  
 	 	 }  
 	 	  
 	 	 p u b l i c   v o i d   S e t A c t u a l R e s u l t ( H B N o u n   o N o u n )  
 	 	 {  
 	 	 	 o _ A c t u a l R e s u l t   =   o N o u n ;  
 	 	 }  
 	 	  
 	 	 p u b l i c   H B W o r d   G e t L e m m a ( )  
 	 	 {  
 	 	 	 r e t u r n   o _ L e m m a ; 	 	 	 	 	  
 	 	 }  
 	 	  
 	 	 p u b l i c   H B F o r m C o n t a i n e r   G e t E x p e c t e d R e s u l t ( )  
 	 	 {  
 	 	 	 r e t u r n   o _ E x p e c t e d R e s u l t ;  
 	 	 }  
 	 	  
 	 	 p u b l i c   H B N o u n   G e t A c t u a l R e s u l t ( )  
 	 	 {  
 	 	 	 r e t u r n   o _ A c t u a l R e s u l t ;  
 	 	 }  
 	 	  
 	 	 p u b l i c   v o i d   V a l i d a t e ( )  
 	 	 {  
 	 	 	 L i s t < H B F o r m >   l i s t F o r m s   =   o _ E x p e c t e d R e s u l t . G e t A l l F o r m s ( ) ;  
 	 	 	 i f ( l i s t F o r m s   ! =   n u l l   & &   l i s t F o r m s . s i z e ( ) > 0 )  
 	 	 	 {  
 	 	 	 	 i n t   i C o u n t   =   l i s t F o r m s . s i z e ( ) ;  
 	 	 	 	 f o r ( i n t   i = 0 ;   i < i C o u n t ;   i + + )  
 	 	 	 	 {  
 	 	 	 	 	 H B F o r m   o F o r m   =   l i s t F o r m s . g e t ( i ) ;  
 	 	 	 	 	 b o o l e a n   b M a t c h   =   f a l s e ;  
 	 	 	 	 	 L i s t < S t r i n g >   l i s t R e s u l t s   =   o _ A c t u a l R e s u l t . G e t N o u n F o r m S t r i n g s ( o F o r m . G e t T y p e ( ) ,   o F o r m . G e t S u b T y p e ( ) ) ;  
 	 	 	 	 	 i f ( l i s t R e s u l t s ! = n u l l   & &   l i s t R e s u l t s . s i z e ( ) > 0 )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 i n t   i R e s   =   l i s t R e s u l t s . s i z e ( ) ;  
 	 	 	 	 	 	 f o r ( i n t   j = 0 ;   j < i R e s ;   j + + )  
 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 S t r i n g   s F o r m   =   l i s t R e s u l t s . g e t ( j ) ;  
 	 	 	 	 	 	 	 i f ( s F o r m ! = n u l l   & &   s F o r m . l e n g t h ( ) > 0   & &   s F o r m . e q u a l s ( o F o r m . G e t N a t u r a l F o r m ( ) ) )  
 	 	 	 	 	 	 	 {  
 	 	 	 	 	 	 	 	 b M a t c h   =   t r u e ;  
 	 	 	 	 	 	 	 }  
 	 	 	 	 	 	 }  
 	 	 	 	 	 }  
 	 	 	 	 	  
 	 	 	 	 	 i f ( b M a t c h )  
 	 	 	 	 	 {  
 	 	 	 	 	 	 a r r _ R e s u l t s [ o F o r m . G e t T y p e ( ) ] [ o F o r m . G e t S u b T y p e ( ) ]   =   1 ;  
 	 	 	 	 	 	 i _ S c o r e + + ;  
 	 	 	 	 	 }  
 	 	 	 	 	 e l s e  
 	 	 	 	 	 {  
 	 	 	 	 	 	 a r r _ R e s u l t s [ o F o r m . G e t T y p e ( ) ] [ o F o r m . G e t S u b T y p e ( ) ]   =   - 1 ;  
 	 	 	 	 	 }  
 	 	 	 	 	 i _ O u t O f + + ;  
 	 	 	 	 } 	 	 	  
 	 	 	 	  
 	 	 	 }  
 	 	 }  
 	 }  
 	  
 	 p u b l i c   v o i d   A d h o c T e s t ( )  
 	 {  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = =   T E S T   1   = = = = = = = = = = = = = = = = = = = " ) ; 	 	  
 	 	 H B W o r d   o W o r d   =   n e w   H B W o r d ( "��� " ) ;  
 	 	 l o n g   l F r e q   =   H B C o r p u s . G e t W o r d F r e q u e n c y ( o W o r d ) ; 	 	  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " f ( "   +   o W o r d . G e t N a t u r a l F o r m ( )   +   " ) = "     +   l F r e q ) ;  
 	 	  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = =   T E S T   2   B E G I N   = = = = = = = = = = = = = = = = = = " ) ;  
 	 	  
 	 	 H B N o u n C o n j u g a t i o n R u l e s   o R u l e s   =   n e w   H B N o u n C o n j u g a t i o n R u l e s ( ) ;  
         	 H B N o u n S c o r i n g A l g o r i t h m   o N o u n S c o r e A l g o   =   n e w   H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ( ) ;  
         	 H B J o i n S c o r i n g A l g o r i t h m   o J o i n S c o r e A l g o   =   n e w   H B N o u n F o r m S c o r i n g A l o g o r i t h m ( ) ;  
         	  
         	 H B N o u n   o N o u n   =   H B N o u n S y n t h e s i z e r . S y n t h e s i z e N o u n ( o W o r d ,   o R u l e s ,   o N o u n S c o r e A l g o ,   o J o i n S c o r e A l g o ,   0 ) ;       	  
         	  
         	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " = = = = = = = = = = = = = = = = = =   T E S T   2   E N D   = = = = = = = = = = = = = = = = = = = " ) ;  
         	  
         	 i f ( o N o u n = = n u l l )  
         	 {  
                 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " F a i l e d   t o   C o n j u g a t e   -   "   +   o W o r d . G e t N a t u r a l F o r m ( ) ) ;         	 	  
         	 } 	  
         	 e l s e  
         	 {  
         	 	 o N o u n . D e b u g P r i n t ( ) ;  
         	 }  
 	 }  
 	  
 	 / * *  
 	   *   @ p a r a m   a r g s  
 	   * /  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )    
 	 {  
 	 	  
 	 	  
 	 	 / / H B C o r p u s . b _ O f f l i n e   =   t r u e ; 	 	  
 	 	 H e l a b a s a . S e t L o g ( n e w   P r i n t W r i t e r ( S y s t e m . o u t ,   t r u e ) ) ;  
 	 	 H e l a b a s a . S e t D e b u g L o g ( n e w   P r i n t W r i t e r ( S y s t e m . o u t ,   t r u e ) ) ;  
 	 	 H e l a b a s a . I n i t ( ) ; 	  
 	 	  
 	 	 H B C o n j u g a t i o n T e s t e r   o T e s t e r   =   n e w   H B C o n j u g a t i o n T e s t e r ( ) ;  
 	 	  
 	 	 i n t   i A r g s   =   a r g s . l e n g t h ;  
 	 	  
 	 	 i f ( i A r g s < 1 )  
 	 	 {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " S t a r t i n g   T e s t   :   A R G S = "   +   a r g s . l e n g t h ) ;  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " = = = = = = = = = = = = = = = =   A D H O C   T E S T   = = = = = = = = = = = = = = = = = = " ) ;  
 	 	 	 / / H B C o n j u g a t i o n T e s t e r  
 	 	 	 o T e s t e r . A d h o c T e s t ( ) ;  
 	 	 }  
 	 	 e l s e   i f ( i A r g s = = 1 )  
 	 	 {  
 	 	 	 H e l a b a s a . S e t D e b u g L o g ( n e w   H B N u t r a l P r i n t W r i t e r ( ) ) ;  
 	 	 	 / / S y s t e m . o u t . p r i n t l n ( " = = = = = = = = = = = = = = = =   T E M P L A T E   G E N E R A T I O N   = = = = = = = = = = = = = = = = = = " ) ;  
 	 	 	 / / H B C o n j u g a t i o n T e s t e r   < L e m m a >   / / G e n e r a t e s   a   s a m p l e   l i n e   f o r   t e s t   d a t a   f i l e  
 	 	 	  
 	 	 	 i f ( a r g s [ 0 ] . e q u a l s ( " H E A D I N G " ) )  
 	 	 	 {  
 	 	 	 	  
 	 	 	 	 o T e s t e r . G e n e r a t e H e a d i n g L i n e ( ) ;  
 	 	 	 }  
 	 	 	 e l s e  
 	 	 	 {  
 	 	 	 	 o T e s t e r . G e n e r a t e T e m p l a t e L i n e ( a r g s [ 0 ] ) ;  
 	 	 	 }  
 	 	 	  
 	 	 } 	 	  
 	 	 e l s e   i f ( i A r g s = = 2 )  
 	 	 {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " S t a r t i n g   T e s t   :   A R G S = "   +   a r g s . l e n g t h ) ;  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " = = = = = = = = = = = = = = = =   C O N J U G A T I O N   T E S T   = = = = = = = = = = = = = = = = = = " ) ;  
 	 	 	 / / H B C o n j u g a t i o n T e s t e r   < f i l e N a m e >   < e n c o d i n g >  
 	 	 	 o T e s t e r . L o a d T e s t D a t a ( a r g s [ 0 ] ,   a r g s [ 1 ] ) ; 	 	 	  
 	 	 } 	  
 	 	 e l s e  
 	 	 {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " I n v a l i d   A r g u m e n t s   C o u n t   :   A R G S = "   +   a r g s . l e n g t h ) ;  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " U s a g e   1   :   A d h c o   T e s t   :   H B C o n j u g a t i o n T e s t e r   " ) ;  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " U s a g e   2   :   T e m p l a t e   G e n e r a t i o n   :   H B C o n j u g a t i o n T e s t e r   < l e m m a > " ) ;  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " U s a g e   2   :   C o n j u g a t i o n   T e s t   :   H B C o n j u g a t i o n T e s t e r   < f i l e N a m e >   < U T F - 8 > " ) ;  
 	 	 }  
 	 }  
 }  
