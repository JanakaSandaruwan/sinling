 p a c k a g e   h e l a b a s a . n o u n s . s c o r i n g ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   h e l a b a s a . H B C o r p u s ;  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . n o u n s . H B N o u n ;  
 i m p o r t   h e l a b a s a . n o u n s . s c o r i n g . H B N o u n S c o r i n g A l g o r i t h m ;  
  
 p u b l i c   c l a s s   H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m   i m p l e m e n t s  
 	 	 H B N o u n S c o r i n g A l g o r i t h m   {  
  
 	 p u b l i c   s t a t i c   f i n a l   i n t   A I D _ N O U N _ A V L _ B A S E D _ S C O R I N G   =   1 ;  
 	  
 	 p u b l i c   H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m ( )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
 	 }  
  
 	 @ O v e r r i d e  
 	 p u b l i c   v o i d   E v a l u a t e ( H B N o u n   o N o u n )    
 	 { 	  
 	 	 L i s t < H B W o r d >   l i s t F o r m s   =   n e w   A r r a y L i s t < H B W o r d > ( ) ;  
 	 	 o N o u n . G e t A l l N o u n F o r m s ( l i s t F o r m s ) ;  
 	 	 H B C o r p u s . G e t W o r d F r e q u e n c i e s ( l i s t F o r m s ) ;  
 	 	 l o n g   l A v a i l a b i l i t y S c o r e   =   0 ;  
 	 	 i n t   i C o u n t   =   l i s t F o r m s . s i z e ( ) ;  
 	 	 l o n g   l T o t a l S c o r e   =   0 ;  
 	 	  
 	 	 H e l a b a s a . G e t D e b u g L o g ( ) . p r i n t l n ( " H B A v a i l a b i l i t y B a s e d S c o r i n g A l g o r i t h m : : E v a l u a t e   :   [ "   +   o N o u n . G e t L e m m a ( ) . G e t N a t u r a l F o r m ( )   + " ]   f o r   "   +   i C o u n t   +   "   f o r m s . " ) ;  
 	 	  
 	 	 f o r ( i n t   j = 0 ;   j < i C o u n t ;   j + + )  
 	 	 {  
 	 	 	 l o n g   l S c o r e   =   l i s t F o r m s . g e t ( j ) . G e t F r e q u e n c y ( ) ;  
 	 	 	 i f ( l S c o r e   >   0 )  
 	 	 	 {  
 	 	 	 	 l T o t a l S c o r e   + =   l S c o r e ;  
 	 	 	 	 l A v a i l a b i l i t y S c o r e + + ;  
 	 	 	 }  
 	 	 }  
 	 	  
 	 	 l T o t a l S c o r e   + =   ( l A v a i l a b i l i t y S c o r e * l A v a i l a b i l i t y S c o r e * l A v a i l a b i l i t y S c o r e * l A v a i l a b i l i t y S c o r e ) ; 	 	  
 	 	 o N o u n . S e t S c o r e ( l T o t a l S c o r e ) ;  
 	 }  
  
 	 @ O v e r r i d e  
 	 p u b l i c   S t r i n g   G e t N a m e ( )   {  
 	 	 r e t u r n   " A v a i l a b i l i t y   B a s e d   S c o r i n g " ;  
 	 }  
  
 	 p u b l i c   i n t   G e t I D ( )  
 	 {  
 	 	 r e t u r n   A I D _ N O U N _ A V L _ B A S E D _ S C O R I N G ;  
 	 }  
 }  
