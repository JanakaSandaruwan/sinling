 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . t o o l s . c r a w l e r ;  
  
 i m p o r t   j a v a . i o . B u f f e r e d R e a d e r ;  
 i m p o r t   j a v a . i o . B u f f e r e d W r i t e r ;  
 i m p o r t   j a v a . i o . F i l e I n p u t S t r e a m ;  
 i m p o r t   j a v a . i o . F i l e W r i t e r ;  
 i m p o r t   j a v a . i o . I n p u t S t r e a m R e a d e r ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
 i m p o r t   j a v a . u t i l . H a s h M a p ;  
 i m p o r t   j a v a . u t i l . M a p ;  
  
 p u b l i c   c l a s s   H B C r a w l H i s t o r y   {  
  
 	 p r i v a t e   s t a t i c   M a p < S t r i n g ,   S t r i n g >   m a p _ V i s i t e d   =   n e w   H a s h M a p < S t r i n g ,   S t r i n g > ( ) ;  
 	  
 	 p u b l i c   H B C r a w l H i s t o r y ( )    
 	 {  
 	  
 	 }  
  
 	 p u b l i c   s t a t i c   l o n g   G e t E n t r y C o u n t ( )  
 	 {  
 	 	 r e t u r n   m a p _ V i s i t e d . s i z e ( ) ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   s y n c h r o n i z e d   v o i d   L o a d ( S t r i n g   s F i l e N a m e )  
 	 {  
 	 	 t r y {  
 	 	 	 B u f f e r e d R e a d e r   i n   =   n e w   B u f f e r e d R e a d e r ( n e w   I n p u t S t r e a m R e a d e r ( n e w   F i l e I n p u t S t r e a m ( s F i l e N a m e ) ) ) ;  
 	 	 	  
 	 	 	 S t r i n g   s L i n e   =   i n . r e a d L i n e ( ) ;  
 	 	 	 w h i l e ( s L i n e ! = n u l l )  
 	 	 	 {  
 	 	 	 	 i f ( s L i n e . l e n g t h ( ) > 5 )  
 	 	 	 	 {  
 	 	 	 	 	 m a p _ V i s i t e d . p u t ( s L i n e ,   s L i n e ) ; 	 	 	 	 	  
 	 	 	 	 }  
 	 	 	 	 s L i n e   =   i n . r e a d L i n e ( ) ;  
 	 	 	 }  
 	 	 	 i n . c l o s e ( ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 S y s t e m . e r r . p r i n t l n ( " F a i l e d   t o   o p e n   f i l e   :   "   +   s F i l e N a m e ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 }  
 	 }  
 	  
 	  
 	 p u b l i c   s t a t i c   s y n c h r o n i z e d   v o i d   S a v e ( S t r i n g   s F i l e N a m e )  
 	 {  
 	 	 t r y  
 	 	 {  
 	 	 	 P r i n t W r i t e r   o O u t F i l e   =   n e w   P r i n t W r i t e r ( n e w   B u f f e r e d W r i t e r ( n e w   F i l e W r i t e r ( s F i l e N a m e ) ) ) ;  
  
 	 	 	 f o r   ( S t r i n g   s K e y   :   m a p _ V i s i t e d . k e y S e t ( ) )    
 	 	 	 {  
 	 	 	 	 o O u t F i l e . p r i n t l n ( s K e y ) ;  
 	 	 	 } 	 	 	  
 	 	 	  
 	 	 	 o O u t F i l e . f l u s h ( ) ;  
 	 	 	 o O u t F i l e . c l o s e ( ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 } 	 	 	 	 	  
 	 }  
 	  
 	 p u b l i c   s t a t i c   s y n c h r o n i z e d   v o i d   A d d ( S t r i n g   s U R L )  
 	 {  
 	 	 m a p _ V i s i t e d . p u t ( s U R L ,   s U R L ) ;  
 	 }  
 	  
 	 p u b l i c   s t a t i c   s y n c h r o n i z e d   b o o l e a n   H a s V i s i t e d ( S t r i n g   s U R L )  
 	 {  
 	 	 S t r i n g   s F o u n d   =   m a p _ V i s i t e d . g e t ( s U R L ) ;  
 	 	 i f ( s F o u n d = = n u l l )  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 e l s e  
 	 	 	 r e t u r n   t r u e ;  
 	 }  
 	  
 }  
