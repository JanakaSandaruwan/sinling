 / * *  
   *   @ a u t h o r   R a j i t h   P r i y a n g a   ( c )   2 0 1 3   -   r p r i y a n g a @ y a h o o . c o m    
   *    
   *    
   * /  
 p a c k a g e   h e l a b a s a . s e r v l e t s ;  
  
 i m p o r t   h e l a b a s a . H B W o r d ;  
 i m p o r t   h e l a b a s a . H e l a b a s a ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B J o i n R e s u l t s S e t ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B W o r d J o i n R u l e ;  
 i m p o r t   h e l a b a s a . s a n d h i . H B W o r d J o i n e r ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B J o i n S c o r i n g A l g o r i t h m ;  
 i m p o r t   h e l a b a s a . s a n d h i . s c o r i n g . H B S c o r i n g A l g o r i t h m R e g i s t r y ;  
 i m p o r t   h e l a b a s a . s e r v l e t s . u t i l s . A d m i n L o g i n ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e s s i o n ;  
  
 p u b l i c   c l a s s   A d m i n P a g e   e x t e n d s   H t t p S e r v l e t   {  
  
         / * *  
 	   *    
 	   * /  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   6 9 8 5 4 8 6 8 4 5 9 7 9 2 8 9 6 4 1 L ;  
 	  
  
 	  
  
 	 p u b l i c   v o i d   d o G e t ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )  
         t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
         { 	 	 	  
 	 	 i f ( A d m i n L o g i n . V e r i f y ( o R e q ,   o R e s ) )  
 	 	 {  
 	 	 	 P r i n t A d m i n P a g e ( o R e q ,   o R e s ) ;  
 	 	 }  
         }  
 	  
 	 p u b l i c   v o i d   d o P o s t ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )  
 	 	         t h r o w s   I O E x c e p t i o n ,   S e r v l e t E x c e p t i o n  
         {  
 	 	 d o G e t ( o R e q ,   o R e s ) ;          
         }  
 	  
 	  
         p r i v a t e   v o i d   P r i n t A d m i n P a g e ( H t t p S e r v l e t R e q u e s t   o R e q ,   H t t p S e r v l e t R e s p o n s e   o R e s )   t h r o w s   I O E x c e p t i o n  
         { 	  
         	 o R e s . s e t C o n t e n t T y p e ( " t e x t / h t m l " ) ;  
         	 o R e s . s e t C h a r a c t e r E n c o d i n g ( " u t f - 8 " ) ;  
                 P r i n t W r i t e r   o u t   =   o R e s . g e t W r i t e r ( ) ;  
                  
                 H e l a b a s a . S e t L o g ( o u t ) ;  
                  
                 o u t . p r i n t l n ( " < h t m l > < h e a d > < t i t l e > H e l a b a s a   -   A d m i n   M e n u < / t i t l e > < / h e a d > " ) ;  
                 o u t . p r i n t l n ( " < s t y l e   t y p e = ' t e x t / c s s ' > " ) ;  
                 o u t . p r i n t l n ( " a   { t e x t - d e c o r a t i o n : n o n e ; } " ) ;  
                 o u t . p r i n t l n ( " a : h o v e r   { t e x t - d e c o r a t i o n : u n d e r l i n e ; } " ) ;  
                 o u t . p r i n t l n ( " < / s t y l e > " ) ;  
                 o u t . p r i n t l n ( " < b o d y   a l i g n = ' c e n t e r ' > < p   a l i g n = ' c e n t e r ' > " ) ;  
                 o u t . p r i n t l n ( " < h 2   a l i g n = ' c e n t e r ' > H e l a b a s a < / h 2 >   < h 3   a l i g n = ' c e n t e r ' > S i n h a l a   M o r p h o l o g i c a l   T o o l s   C o l l e c t i o n   -   A d m i n   C o n s o l e < / h 3 > " ) ;  
                 o u t . p r i n t l n ( " < h 3   a l i g n = ' c e n t e r ' > M e n u   < / h 3 > " ) ;  
  
                 o u t . p r i n t l n ( " < p   a l i g n = ' c e n t e r ' > " ) ;  
                 o u t . p r i n t l n ( " < t a b l e   a l i g n = ' c e n t e r '     s t y l e = ' f o n t - f a m i l y : a r i a l ;   f o n t - s i z e : 0 . 8 e m ; ' > " ) ;  
                 o u t . p r i n t l n ( " < t r > < t d   h e i g h t = ' 2 5 ' > < b > 1 . < / b > < / b > < / t d > < t d > < b > < a   h r e f = ' . / s a n d h i _ t e s t ' > S i n h a l a   W o r d   J o i n e r   T e s t   (��  �����  ������  �������� )   < / a > < / b > < / t d > < / t r > " ) ;  
                 o u t . p r i n t l n ( " < t r > < t d   h e i g h t = ' 2 5 ' > < b > 2 . < / b > < / b > < / t d > < t d > < b > < a   h r e f = ' . / v i s a n d h i _ t e s t ' > S i n h a l a   W o r d   D i s j o i n e r   T e s t   (��  �������  ������  �������� )   < / a > < / b > < / t d > < / t r > " ) ;  
                 o u t . p r i n t l n ( " < t r > < t d   h e i g h t = ' 2 5 ' > < b > 3 . < / b > < / t d > < t d > < b > < a   h r e f = ' . / c o n j u g a t o r _ a d m i n ' > S i n h a l a   N o u n   C o n j u g a t i o n   (���  �� �����  �������� )   < / a > < / b > < / t d > < / t r > " ) ;  
                 / / o u t . p r i n t l n ( " < t r > < t d   h e i g h t = ' 2 5 ' > < b > 3 . < / b > < / t d > < t d > < b > < a   h r e f = ' . / c o n j u g a t i o n _ t e s t ' > S i n h a l a   N o u n   C o n j u g a t i o n   T e s t   (���  �� �����  ��������  �������� )   < / a > < / b > < / t d > < / t r > " ) ;  
                 o u t . p r i n t l n ( " < t r > < t d   h e i g h t = ' 2 5 ' > < b > 4 . < / b > < / t d > < t d > < b > < a   h r e f = ' . / n o u n _ c l a s s _ t e s t ' > S i n h a l a   N o u n   C l a s s i f i c a t i o n   T e s t   (���  �� �����  ��  �������� )   < / a > < / b > < / t d > < / t r > " ) ;  
                 o u t . p r i n t l n ( " < t r > < t d   h e i g h t = ' 2 5 ' > < b > 5 . < / b > < / t d > < t d > < b > < a   h r e f = ' . / k b _ v i e w ' > S i n h a l a   L a n g u a g e   K n o w l e d g e   B a s e   (�����  ����  �����  ����� )   < / a > < / b > < / t d > < / t r > " ) ;                  
                 o u t . p r i n t l n ( " < t r > < t d   h e i g h t = ' 2 5 ' > < b > 6 . < / b > < / t d > < t d > < b > < a   h r e f = ' . / n r _ v i e w ' > S i n h a l a   N o u n   C l a s s e s   (�����  ���  �� �����  ��������� )   < / a > < / b > < / t d > < / t r > " ) ;  
                 o u t . p r i n t l n ( " < / t a b l e > " ) ;  
                 o u t . p r i n t l n ( " < / p > " ) ;  
                  
                 o u t . p r i n t l n ( A d m i n L o g i n . G e t L o g o u t P a n e l ( o R e q ) ) ;                  
                  
                 o u t . p r i n t l n ( " < b r > < p   a l i g n = ' c e n t e r ' > �   2 0 1 3   R a j i t h   P r i y a n g a   ( < a   h r e f = ' m a i l t o : r p r i y a n g a @ y a h o o . c o m ' >   r p r i y a n g a @ y a h o o . c o m < / a > ) < / p > < / p > " ) ;  
                 o u t . p r i n t l n ( " < / b o d y > < / h t m l > " ) ;  
         }  
      
 }  
