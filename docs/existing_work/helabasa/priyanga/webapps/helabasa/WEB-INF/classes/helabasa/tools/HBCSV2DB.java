 p a c k a g e   h e l a b a s a . t o o l s ;  
  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . u t i l s . H B D a t a b a s e ;  
  
 i m p o r t   j a v a . i o . B u f f e r e d R e a d e r ;  
 i m p o r t   j a v a . i o . F i l e I n p u t S t r e a m ;  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . I n p u t S t r e a m R e a d e r ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
 i m p o r t   j a v a . s q l . C o n n e c t i o n ;  
 i m p o r t   j a v a . s q l . P r e p a r e d S t a t e m e n t ;  
  
 p u b l i c   c l a s s   H B C S V 2 D B   {  
  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   U T F 8 _ B O M   =   " \ u F E F F " ;  
 	  
 	 p u b l i c   H B C S V 2 D B ( )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
 	 }  
  
 	  
 	 p r i v a t e   b o o l e a n   I n s e r t W o r d ( P r e p a r e d S t a t e m e n t   o S t m t ,   S t r i n g   s I D ,   S t r i n g   s W o r d ,   S t r i n g   s F r e q u e n c y )  
 	 {  
 	 	 / / S t r i n g   s S Q L   =   " i n s e r t   i n t o   h b c _ w o r d s ( w o r d _ i d ,   w o r d ,   f r e q u e n c y )   v a l u e s   ( ? ,   ? ,   ? ) " ; 	 	 	  
 	 	  
 	 	 t r y  
 	 	 {  
 	 	 	 o S t m t . s e t L o n g ( 1 ,   L o n g . p a r s e L o n g ( r e m o v e U T F 8 B O M ( s I D . t r i m ( ) ) ) ) ;  
 	 	 	 o S t m t . s e t S t r i n g ( 2 ,   r e m o v e U T F 8 B O M ( s W o r d . t r i m ( ) ) ) ;  
 	 	 	 o S t m t . s e t L o n g ( 3 ,   L o n g . p a r s e L o n g ( r e m o v e U T F 8 B O M ( s F r e q u e n c y . t r i m ( ) ) ) ) ;  
 	 	 	 o S t m t . e x e c u t e U p d a t e ( ) ;  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   I n s e r t   W o r d   [   "   +   s I D   +   "   :   "   +   s W o r d   +   "   :   "   +   s F r e q u e n c y     +   "   ]   t o   C o r p u s   F a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 } 	 	  
 	 	 r e t u r n   f a l s e ; 	  
 	 } 	  
 	  
 	 p r i v a t e   s t a t i c   S t r i n g   r e m o v e U T F 8 B O M ( S t r i n g   s )   {  
 	         i f   ( s . s t a r t s W i t h ( U T F 8 _ B O M ) )   {  
 	                 s   =   s . s u b s t r i n g ( 1 ) ;  
 	         }  
 	         r e t u r n   s ;  
 	 }  
  
 	 p r i v a t e   b o o l e a n   V a l i d a t e F i l e ( S t r i n g   s F i l e N a m e ,   S t r i n g   s C h a r S e t / * * " U T F - 1 6 " * * / ,   l o n g   l S t a r t F r o m ,   l o n g   l S t o p A t )  
 	 {                                  
                 S t r i n g   c v s S p l i t B y   =   " , " ;  
                 l o n g   l C o u n t   =   0 ;  
  
                 t r y     {  
  
                 	 B u f f e r e d R e a d e r   b r   =   n e w   B u f f e r e d R e a d e r ( n e w   I n p u t S t r e a m R e a d e r ( n e w   F i l e I n p u t S t r e a m ( s F i l e N a m e ) ,   s C h a r S e t ) ) ;  
                         S t r i n g   l i n e ;  
                         w h i l e   ( ( l i n e   =   b r . r e a d L i n e ( ) )   ! =   n u l l )   {  
                         	 l C o u n t + + ;  
                         	 i f ( l S t a r t F r o m   <   l C o u n t )  
                         	 {         	 	  
                                  
 	                                 S t r i n g [ ]   i t e m s   =   l i n e . s p l i t ( c v s S p l i t B y ) ;  
 	                                  
 	                                 i f ( i t e m s . l e n g t h < 3 )  
 	                                 {  
 	                                 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E r r o r   a t   r e c o r d   "   +   ( l C o u n t   - 1 )   +   "   :   d e l i m e t e r   c o u n t   =   "   +   i t e m s . l e n g t h   +   "   :   [ 0 ] = "   +   i t e m s [ 0 ] ) ;  
 	                                 }  
 	                                 e l s e  
 	                                 {  
 	 	                                 i f ( l C o u n t   = =   ( l S t a r t F r o m   +   1 ) )  
 	 	                                 {  
 	 	                                 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " S t a r t e d   v a l i d a t i n g   f r o m   r e c o r d   n u m b e r   "   +   ( l C o u n t   - 1 )   +   "   :   W o r d   [   "   +   i t e m s [ 0 ]   +   "   :   "   +   i t e m s [ 1 ]   +   "   :   "   +   i t e m s [ 2 ]     +   "   ] " ) ;  
 	 	                                 }  
 	 	                                  
 	 	                                 i f ( l C o u n t   = =   l S t o p A t )  
 	 	                                 {  
 	 	                                 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " S t o p t e d   a f t e r   v a l i d a t i n g   r e c o r d   n u m b e r   "   +   ( l C o u n t   - 1 )   +   "   :   W o r d   [   "   +   i t e m s [ 0 ]   +   "   :   "   +   i t e m s [ 1 ]   +   "   :   "   +   i t e m s [ 2 ]     +   "   ] " ) ;  
 	 	                                 	 b r e a k ;  
 	 	                                 } 	                                  
 	                                 }  
 	                                  
 	                                 i f ( l C o u n t   %   1 0 0 0 0   = =   0 )  
 	                                 {  
 	                                 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " V a l i d a t e d   "   +   ( l C o u n t   - 1 )   +   "   r e c o r d s   t o   t h e   D B . " ) ;  
 	                                 }  
                         	 }  
                         }  
                         b r . c l o s e ( ) ;  
  
                 }   c a t c h   ( I O E x c e p t i o n   e )   {  
                 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " V a l i d a t e d   "   +   ( l C o u n t   - 1 )   +   "   r e c o r d s   t o   t h e   D B . " ) ;  
                         e . p r i n t S t a c k T r a c e ( ) ;  
                         r e t u r n   f a l s e ;  
                 }  
                  
                 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " C o m p l e t e d   V a l i d a t i o n     :   "   +   ( l C o u n t   - 1 )   +   "   w o r d s   t r a n s f e r e d . " ) ;  
                 r e t u r n   t r u e ;  
 	 } 	  
 	  
 	  
 	 p r i v a t e   b o o l e a n   R e a d F i l e A n d W r i t e T o D B ( S t r i n g   s F i l e N a m e ,   S t r i n g   s C h a r S e t / * * " U T F - 1 6 " * * / ,   P r e p a r e d S t a t e m e n t   o S t m t ,   l o n g   l S t a r t F r o m ,   l o n g   l S t o p A t )  
 	 {                                  
                 S t r i n g   c v s S p l i t B y   =   " , " ;  
                 l o n g   l C o u n t   =   0 ;  
  
                 t r y     {  
  
                 	 B u f f e r e d R e a d e r   b r   =   n e w   B u f f e r e d R e a d e r ( n e w   I n p u t S t r e a m R e a d e r ( n e w   F i l e I n p u t S t r e a m ( s F i l e N a m e ) ,   s C h a r S e t ) ) ;  
                         S t r i n g   l i n e ;  
                         w h i l e   ( ( l i n e   =   b r . r e a d L i n e ( ) )   ! =   n u l l )   {  
                         	 l C o u n t + + ;  
                         	 i f ( l S t a r t F r o m   <   l C o u n t )  
                         	 {         	 	  
                                  
 	                                 S t r i n g [ ]   i t e m s   =   l i n e . s p l i t ( c v s S p l i t B y ) ;  
 	                                 i f ( I n s e r t W o r d ( o S t m t ,   i t e m s [ 0 ] ,   i t e m s [ 1 ] ,   i t e m s [ 2 ] ) = = f a l s e )  
 	                                 {  
 	                                 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E x i t i n g   f i l e   r e a d i n g   a t   r e c o r d   "   +   ( l C o u n t   - 1 )   +   "   d u e   t o   D B   i n s e r t   e r r o r s " ) ;  
 	                                 	 b r e a k ;  
 	                                 }  
  
 	                                 i f ( l C o u n t   = =   ( l S t a r t F r o m   +   1 ) )  
 	                                 {  
 	                                 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " S t a r t e d   i n s e r t i n g   f r o m   r e c o r d   n u m b e r   "   +   ( l C o u n t   - 1 )   +   "   :   W o r d   [   "   +   i t e m s [ 0 ]   +   "   :   "   +   i t e m s [ 1 ]   +   "   :   "   +   i t e m s [ 2 ]     +   "   ] " ) ;  
 	                                 }  
 	                                  
 	                                 i f ( l C o u n t   = =   l S t o p A t )  
 	                                 {  
 	                                 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " S t o p t e d   a f t e r   i n s e r t i n g   r e c o r d   n u m b e r   "   +   ( l C o u n t   - 1 )   +   "   :   W o r d   [   "   +   i t e m s [ 0 ]   +   "   :   "   +   i t e m s [ 1 ]   +   "   :   "   +   i t e m s [ 2 ]     +   "   ] " ) ;  
 	                                 	 b r e a k ;  
 	                                 } 	                                  
 	                                  
 	                                 i f ( l C o u n t   %   1 0 0 0 0   = =   0 )  
 	                                 {  
 	                                 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " I n s e r t e d   "   +   ( l C o u n t   - 1 )   +   "   r e c o r d s   t o   t h e   D B . " ) ;  
 	                                 }  
                         	 }  
                         }  
                         b r . c l o s e ( ) ;  
  
                 }   c a t c h   ( I O E x c e p t i o n   e )   {  
                 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " I n s e r t e d   "   +   ( l C o u n t   - 1 )   +   "   r e c o r d s   t o   t h e   D B . " ) ;  
                         e . p r i n t S t a c k T r a c e ( ) ;  
                         r e t u r n   f a l s e ;  
                 }  
                  
                 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " C o m p l e t e d   D a t a   T r a n s f e r   :   "   +   ( l C o u n t   - 1 )   +   "   w o r d s   t r a n s f e r e d . " ) ;  
                 r e t u r n   t r u e ;  
 	 } 	 	  
 	  
 	 p u b l i c   b o o l e a n   C S V 2 D B ( S t r i n g   s F i l e N a m e ,   S t r i n g   s C h a r S e t ,   S t r i n g   s S t a r t F r o m ,   S t r i n g   s S t o p A t )  
 	 { 	 	  
 	 	 S t r i n g   s I n s e r t S Q L   =   " i n s e r t   i n t o   h b c _ w o r d s ( w o r d _ i d ,   w o r d ,   f r e q u e n c y )   v a l u e s   ( ? ,   ? ,   ? ) " ; 	 	 	  
 	 	 P r e p a r e d S t a t e m e n t   o I n s e r t S t m t   =   n u l l ;  
 	 	 l o n g   l S t a r t F r o m   =   0 ; 	 	  
 	 	 l o n g   l S t o p A t   =   L o n g . M A X _ V A L U E ;  
 	 	  
 	 	 i f ( s S t o p A t   ! =   n u l l   & &   s S t o p A t . l e n g t h ( ) > 0 )  
 	 	 {  
 	 	 	 l S t o p A t   =   L o n g . p a r s e L o n g ( s S t o p A t ) ;  
 	 	 }  
 	 	  
 	 	 C o n n e c t i o n   o C o n   =   H B D a t a b a s e . C o n n e c t T o D B ( ) ;  
 	 	 t r y  
 	 	 { 	 	 	  
 	 	 	 o I n s e r t S t m t   =       o C o n . p r e p a r e S t a t e m e n t ( s I n s e r t S Q L ) ; 	 	 	  
 	 	 	 l S t a r t F r o m   =   L o n g . p a r s e L o n g ( s S t a r t F r o m ) ;  
 	 	 }  
 	 	 c a t c h ( E x c e p t i o n   e )  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " E R R O R   :   C o n n e c t i n g   t o   C o r p u s   F a i l e d   :   "   +   e . g e t M e s s a g e ( ) ) ;  
 	 	 	 e . p r i n t S t a c k T r a c e ( ) ;  
 	 	 	 r e t u r n   f a l s e ;  
 	 	 } 	  
 	 	  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " S t a r t   L o a d i n g   C S V   f i l e   i n   t o   t h e   H B C _ W O R D S   t a b l e " ) ;  
 	 	 	 	 	 	  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " F I L E               = "   +   s F i l e N a m e ) ;  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " C H A R   S E T       = "   +   s C h a r S e t ) ;  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " S T A R T   F R O M   = "   +   l S t a r t F r o m ) ;  
 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " S T O P   A T 	     = "   +   l S t o p A t ) ;  
 	 	  
 	 	 r e t u r n   R e a d F i l e A n d W r i t e T o D B ( s F i l e N a m e ,   s C h a r S e t ,   o I n s e r t S t m t ,   l S t a r t F r o m ,   l S t o p A t ) ; 	 	  
 	 	  
 	 }  
 	  
 	  
 	 / * *  
 	   *   @ p a r a m   a r g s  
 	   * /  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	  
 	 	 H e l a b a s a . S e t L o g ( n e w   P r i n t W r i t e r ( S y s t e m . o u t ,   t r u e ) ) ;  
 	 	  
 	 	 i f   ( a r g s . l e n g t h = = 2 )  
 	 	 {  
 	 	 	 H B C S V 2 D B   c s v 2 d b   =   n e w   H B C S V 2 D B ( ) ;  
 	 	 	 c s v 2 d b . V a l i d a t e F i l e ( a r g s [ 0 ] ,   a r g s [ 1 ] ,   0 ,   0 ) ;  
 	 	 }  
 	 	 e l s e   i f   ( a r g s . l e n g t h = = 3 )  
 	 	 {  
 	 	 	 H B C S V 2 D B   c s v 2 d b   =   n e w   H B C S V 2 D B ( ) ;  
 	 	 	 c s v 2 d b . C S V 2 D B ( a r g s [ 0 ] ,   a r g s [ 1 ] ,   a r g s [ 2 ] ,   n u l l ) ;  
 	 	 }  
 	 	 e l s e   i f   ( a r g s . l e n g t h = = 4 )  
 	 	 {  
 	 	 	 H B C S V 2 D B   c s v 2 d b   =   n e w   H B C S V 2 D B ( ) ;  
 	 	 	 c s v 2 d b . C S V 2 D B ( a r g s [ 0 ] ,   a r g s [ 1 ] ,   a r g s [ 2 ] ,   a r g s [ 3 ] ) ;  
 	 	 }  
 	 	 e l s e  
 	 	 {  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " U s a g e   C S V 2 D B   < F i l e   N a m e >   < C h a r   S e t >   < S t a r t   F r o m   R e c o r d > " ) ;  
 	 	 	 H e l a b a s a . G e t L o g ( ) . p r i n t l n ( " U s a g e   C S V 2 D B   < F i l e   N a m e >   < C h a r   S e t >   < S t a r t   F r o m   R e c o r d >   < S t o p   A t   R e c o r d > " ) ;  
 	 	 }  
 	 }  
  
 }  
