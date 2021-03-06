 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . t o o l s . c r a w l e r ;  
  
 i m p o r t   j a v a . i o . B u f f e r e d R e a d e r ;  
 i m p o r t   j a v a . i o . F i l e I n p u t S t r e a m ;  
 i m p o r t   j a v a . i o . I n p u t S t r e a m R e a d e r ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . C o l l e c t i o n ;  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
 i m p o r t   j a v a . u t i l . I t e r a t o r ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
 i m p o r t   j a v a . u t i l . M a p ;  
 i m p o r t   j a v a . u t i l . r e g e x . P a t t e r n ;  
  
 i m p o r t   e d u . u c i . i c s . c r a w l e r 4 j . c r a w l e r . P a g e ;  
 i m p o r t   e d u . u c i . i c s . c r a w l e r 4 j . c r a w l e r . W e b C r a w l e r ;  
 i m p o r t   e d u . u c i . i c s . c r a w l e r 4 j . p a r s e r . H t m l P a r s e D a t a ;  
 i m p o r t   e d u . u c i . i c s . c r a w l e r 4 j . u r l . W e b U R L ;  
  
 p u b l i c   c l a s s   H B D o c u m e n t P r o c e s s o r   e x t e n d s   W e b C r a w l e r    
 {  
 	  
 	 p u b l i c   s t a t i c   L i s t < H B T e x t C o l l e c t o r >   l i s t _ C o l l e c t o r s   =   n e w   A r r a y L i s t < H B T e x t C o l l e c t o r > ( ) ;  
 	  
 	 p u b l i c   s t a t i c   M a p < S t r i n g ,   S t r i n g >   m a p _ T O D O   =   n e w   H a s h M a p < S t r i n g ,   S t r i n g > ( ) ;  
 	  
 	 p r i v a t e   s t a t i c   i n t   i _ P a g e C o u n t   =   0 ;  
 	  
 	  
         p r i v a t e   f i n a l   s t a t i c   P a t t e r n   F I L T E R S   =   P a t t e r n . c o m p i l e ( " . * ( \ \ . ( c s s | j s | b m p | g i f | j p e ? g "    
                         +   " | p n g | t i f f ? | m i d | m p 2 | m p 3 | m p 4 "  
                         +   " | w a v | a v i | m o v | m p e g | r a m | m 4 v | p d f "    
                         +   " | r m | s m i l | w m v | s w f | w m a | z i p | r a r | g z ) ) $ " ) ;  
          
 	 p u b l i c   H B D o c u m e n t P r o c e s s o r ( )    
 	 { 	 	  
 	 	 f o r ( i n t   i = 0 ;   i < H B S i n h a l a C r a w l e r . a s _ C o l l e c t o r T y p e s . l e n g t h ;   i + + )  
 	 	 {  
 	 	 	 l i s t _ C o l l e c t o r s . a d d ( H B T e x t C o l l e c t o r . C r e a t e C o l l e c t o r ( H B S i n h a l a C r a w l e r . a s _ C o l l e c t o r T y p e s [ i ] ) ) ;  
 	 	 }  
 	 }  
  
 	  
 	 p u b l i c   s t a t i c   v o i d   L o a d V i s i t H i s t o r y ( S t r i n g   s F i l e N a m e )  
 	 {  
 	 	 t r y {  
 	 	 	 B u f f e r e d R e a d e r   i n   =   n e w   B u f f e r e d R e a d e r ( n e w   I n p u t S t r e a m R e a d e r ( n e w   F i l e I n p u t S t r e a m ( s F i l e N a m e ) ) ) ;  
 	 	 	  
 	 	 	 S t r i n g   s L i n e   =   i n . r e a d L i n e ( ) ;  
 	 	 	 w h i l e ( s L i n e ! = n u l l )  
 	 	 	 {  
 	 	 	 	 i f ( s L i n e . l e n g t h ( ) > 5 )  
 	 	 	 	 {  
 	 	 	 	 	 A d d U R L ( s L i n e ) ; 	 	 	 	 	  
 	 	 	 	 }  
 	 	 	 	 s L i n e   =   i n . r e a d L i n e ( ) ;  
 	 	 	 }  
 	 	 	 i n . c l o s e ( ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 } 	 	  
 	 }  
 	  
  
 	 p u b l i c   s t a t i c   v o i d   A d d T O D O U R L ( S t r i n g   s U R L )  
 	 {  
 	 	 m a p _ T O D O . p u t ( s U R L ,   s U R L ) ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   v o i d   A d d U R L ( S t r i n g   s U R L )  
 	 {  
 	 	 H B C r a w l H i s t o r y . A d d ( s U R L ) ; 	 	  
 	 }  
  
 	 p u b l i c   b o o l e a n   I s A l l o w e d U R L ( S t r i n g   s C h e c k )  
 	 {  
 	 	 C o l l e c t i o n < S t r i n g >   c o l U R L s   =   m a p _ T O D O . v a l u e s ( ) ;  
 	 	  
 	 	 I t e r a t o r < S t r i n g >   i t e r U R L s   =   c o l U R L s . i t e r a t o r ( ) ;  
 	 	  
 	 	  
 	 	 w h i l e ( i t e r U R L s . h a s N e x t ( ) )  
 	 	 {  
 	 	 	 S t r i n g   s U R L   =   i t e r U R L s . n e x t ( ) ;  
 	 	 	  
 	 	 	 i f ( s C h e c k . s t a r t s W i t h ( s U R L ) )  
 	 	 	 {  
 	 	 	 	 r e t u r n   t r u e ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 r e t u r n   f a l s e ;  
 	 }  
 	  
 / * *  
 *   Y o u   s h o u l d   i m p l e m e n t   t h i s   f u n c t i o n   t o   s p e c i f y   w h e t h e r  
 *   t h e   g i v e n   u r l   s h o u l d   b e   c r a w l e d   o r   n o t   ( b a s e d   o n   y o u r  
 *   c r a w l i n g   l o g i c ) .  
 * /  
 @ O v e r r i d e  
 p u b l i c   b o o l e a n   s h o u l d V i s i t ( W e b U R L   u r l )    
 {  
 	 r e t u r n   t r u e ;  
 	  
 	 / *  
 	 i f ( i _ P a g e C o u n t > H B S i n h a l a C r a w l e r . i _ P a g e s P e r R u n   | |   H B S i n h a l a C r a w l e r . C h e c k W h e t h e r S t o p p e d ( ) )  
 	 {  
 	 	 r e t u r n   f a l s e ;  
 	 }  
 	  
 	 S t r i n g   h r e f   =   u r l . g e t U R L ( ) . t o L o w e r C a s e ( ) ;  
 	  
 	 i f ( H B C r a w l H i s t o r y . H a s V i s i t e d ( h r e f ) )  
 	 {  
 	 	 r e t u r n   f a l s e ;  
 	 }  
 	 e l s e  
 	 { 	  
 	 	 r e t u r n   ! F I L T E R S . m a t c h e r ( h r e f ) . m a t c h e s ( )   & &   I s A l l o w e d U R L ( h r e f ) ;  
 	 } * /  
 }  
  
 / * *  
 *   T h i s   f u n c t i o n   i s   c a l l e d   w h e n   a   p a g e   i s   f e t c h e d   a n d   r e a d y    
 *   t o   b e   p r o c e s s e d   b y   y o u r   p r o g r a m .  
 * /  
 @ O v e r r i d e  
 p u b l i c   v o i d   v i s i t ( P a g e   p a g e )    
 {        
 	 i f ( H B S i n h a l a C r a w l e r . i _ M o d e = = H B S i n h a l a C r a w l e r . M O D E _ C R A W L _ O N L Y )  
 	 {  
 	 	 S t r i n g   s U R L   =   p a g e . g e t W e b U R L ( ) . g e t U R L ( ) ;  
 	 	 H B S i n h a l a C r a w l e r . A d d T o O u t p u t F i l e ( s U R L ) ;  
 	 	 A d d U R L ( s U R L ) ;  
 	 	 i _ P a g e C o u n t + + ;  
 	 }  
 	  
 	 i f ( i _ P a g e C o u n t > H B S i n h a l a C r a w l e r . i _ P a g e s P e r R u n   | |   H B S i n h a l a C r a w l e r . C h e c k W h e t h e r S t o p p e d ( ) )  
 	 {  
 	 	 i f ( H B S i n h a l a C r a w l e r . o _ C o n t r o l l e r ! = n u l l )  
 	 	 {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   S t o p i n g   C r a w l e r s   . . .     P a g e   C o u n t   =   "   +   i _ P a g e C o u n t   ) ;  
 	 	 	 H B S i n h a l a C r a w l e r . C l e a r C o m m a n d F i l e ( ) ;  
 	 	 	 H B S i n h a l a C r a w l e r . o _ C o n t r o l l e r . S h u t d o w n ( ) ;  
 	 	 }  
 	 }  
 	 e l s e   i f ( H B S i n h a l a C r a w l e r . i _ M o d e ! = H B S i n h a l a C r a w l e r . M O D E _ C R A W L _ O N L Y )  
 	 {  
 	 	 S t r i n g   u r l   =   p a g e . g e t W e b U R L ( ) . g e t U R L ( ) ;  
  
 	 	  
 	 	 i f   ( p a g e . g e t P a r s e D a t a ( )   i n s t a n c e o f   H t m l P a r s e D a t a )    
 	 	 {  
 	 	 	 H t m l P a r s e D a t a   h t m l P a r s e D a t a   =   ( H t m l P a r s e D a t a )   p a g e . g e t P a r s e D a t a ( ) ;  
 	 	 	 S t r i n g   s T e x t   =   H B S i n h a l a C r a w l e r . o _ E x t r a c t o r . E x t r a c t ( h t m l P a r s e D a t a ) ;  
 	 	 	 	 	 	 	 	 	  
 	 	 	 i f ( s T e x t . l e n g t h ( ) > 0 )  
 	 	 	 {  
 	 	 	 	 i _ P a g e C o u n t + + ;  
 	 	 	 	  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( H B S i n h a l a C r a w l e r . G e t T i m e S t a m p ( )   +   "   :   H B C   :   U R L   [ "   +   i _ P a g e C o u n t   +   " ]   :   "   +   u r l ) ;  
 	 	 	 	 A d d U R L ( u r l ) ;  
 	 	 	 	  
 	 	 	 	 i n t   i C o l l e c t o r C o u n t   =   l i s t _ C o l l e c t o r s . s i z e ( ) ;  
  
 	 	 	 	 f o r ( i n t   i = 0 ;   i < i C o l l e c t o r C o u n t ;   i + + )  
 	 	 	 	 {  
 	 	 	 	 	 H B T e x t C o l l e c t o r   o C o l l e c t o r   =   l i s t _ C o l l e c t o r s . g e t ( i ) ;  
 	 	 	 	 	 o C o l l e c t o r . C o l l e c t T e x t ( s T e x t ) ;  
 	 	 	 	 } 	 	 	  
 	 	 	 } 	  
 	 	 }  
 	 }  
 } 	  
  
 }  
