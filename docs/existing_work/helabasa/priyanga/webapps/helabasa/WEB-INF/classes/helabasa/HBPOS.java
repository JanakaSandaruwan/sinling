 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   * /  
 p a c k a g e   h e l a b a s a ;  
  
 i m p o r t   j a v a . u t i l . C o m p a r a t o r ;  
  
 p u b l i c   c l a s s   H B P O S   {  
  
 	 p u b l i c   s t a t i c   f i n a l   s h o r t   P O S _ N O U N 	 	 =   1 ;  
 	 p u b l i c   s t a t i c   f i n a l   s h o r t   P O S _ V E R B 	 	 =   2 ;  
 	 p u b l i c   s t a t i c   f i n a l   s h o r t   P O S _ A D J E C T I V E 	 =   3 ;  
 	  
 	 p r o t e c t e d   l o n g   l _ S c o r e   =   0 ;  
 	 p r o t e c t e d   s h o r t     i _ T y p e   =   0 ;  
 	 p r o t e c t e d   s h o r t     i _ S u b T y p e   =   0 ;  
 	 p r o t e c t e d   s h o r t     i _ H B C l a s s   =   0 ; 	  
 	  
 	 p r o t e c t e d   H B W o r d 	 	 	 	 o _ L e m m a   	 =   n u l l ;  
 	 p r o t e c t e d   H B T r a n s f o r m R u l e S e t 	 o _ R u l e S e t   	 =   n u l l ;  
  
 	  
 	 p u b l i c   H B P O S ( )    
 	 {  
 	  
 	 }  
  
  
 	  
 	 p u b l i c   v o i d   S e t L e m m a ( S t r i n g   s L e m m a )  
 	 {  
 	 	 o _ L e m m a   =   n e w   H B W o r d ( s L e m m a ) ;  
 	 }  
 	  
 	 p u b l i c   l o n g   G e t S c o r e ( )  
 	 {  
 	 	 r e t u r n   l _ S c o r e ;  
 	 }  
 	  
 	 p u b l i c   v o i d   S e t S c o r e ( l o n g   l S c o r e )  
 	 {  
 	 	 l _ S c o r e   =   l S c o r e ;  
 	 }  
 	  
 	 p u b l i c   v o i d   C a l c u l a t e S c o r e ( )  
 	 {  
 	 	  
 	 }  
 	  
 	 p u b l i c   s h o r t   G e t T y p e ( )  
 	 {  
 	 	 r e t u r n   i _ T y p e ;  
 	 }  
 	  
 	 p u b l i c   v o i d   S e t T y p e ( s h o r t   i T y p e )  
 	 {  
 	 	 i _ T y p e   =   i T y p e ;  
 	 }  
 	  
 	  
 	 p u b l i c   s h o r t   G e t S u b T y p e ( )  
 	 {  
 	 	 r e t u r n   i _ S u b T y p e ;  
 	 }  
 	  
 	 p u b l i c   v o i d   S e t S u b T y p e ( s h o r t   i S u b T y p e )  
 	 {  
 	 	 i _ S u b T y p e   =   i S u b T y p e ;  
 	 }  
 	  
 	 p u b l i c   s h o r t   G e t H B C l a s s ( )  
 	 {  
 	 	 r e t u r n   i _ H B C l a s s ;  
 	 }  
 	  
 	 p u b l i c   v o i d   S e t H B C l a s s ( s h o r t   i H B C l a s s )  
 	 {  
 	 	 i _ H B C l a s s   =   i H B C l a s s ;  
 	 } 	  
 	  
 	  
 	  
 	 p u b l i c   v o i d   D e b u g P r i n t ( )  
 	 {  
 	 	  
 	 }  
 	  
 	 p u b l i c   v o i d   P r i n t S u m m a r y ( )  
 	 {  
 	 	  
 	 } 	  
  
 	 p u b l i c   b o o l e a n   F i n d F o r m ( H B W o r d   o W o r d )  
 	 {  
 	 	 r e t u r n   f a l s e ;  
 	 }  
  
 	 p u b l i c   v o i d   S e t L e m m a ( H B W o r d   o L e m a )  
 	 {  
 	 	 o _ L e m m a   =   o L e m a ;  
 	 }  
 	  
 	 p u b l i c   v o i d   S e t R u l e S e t ( H B T r a n s f o r m R u l e S e t   o R u l e S e t )  
 	 {  
 	 	 o _ R u l e S e t   =   o R u l e S e t ;  
 	 }  
 	  
 	  
 	 p u b l i c   H B W o r d   G e t L e m m a ( )  
 	 {  
 	 	 r e t u r n   o _ L e m m a ; 	 	 	 	  
 	 }  
 	  
 	 p u b l i c   H B T r a n s f o r m R u l e S e t   G e t R u l e S e t ( )  
 	 {  
 	 	 r e t u r n   o _ R u l e S e t ;  
 	 } 	  
 	  
 	 p u b l i c   s t a t i c   c l a s s   H B P O S S c o r e C o m p a r a t o r   i m p l e m e n t s   C o m p a r a t o r < H B P O S >    
 	 {  
 	 	 p u b l i c   i n t   c o m p a r e ( H B P O S   o 1 ,   H B P O S   o 2 )    
 	 	 {  
                         l o n g   l 1   =   o 1 . G e t S c o r e ( ) ;  
                         l o n g   l 2   =   o 2 . G e t S c o r e ( ) ;  
  
                         r e t u r n   ( i n t ) ( l 2   -   l 1 ) ;  
                 }  
 	 }  
 }  
