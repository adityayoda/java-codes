 /*class Pattern3{
 
 public static void main(String args[]){
 
 int k=1;
 for(int i=0;i<=7;i++){
 
 for(int j=0;j<i+1;i++){
 
 System.out.print(k++ +" ");
 }
 System.out.println();
 }}}*/
 class Pattern3  
{              
public static void main(String[] args)   
{  
int i, j, k = 1;  
//inner loop  
for (i = 1; i <= 7; i++)   
{  
//outer loop  
for (j = 1; j< i + 1; j++)   
{  
//prints the value of k  
System.out.print(k++ + " ");  
}  
//throws the cursor at the next line  
System.out.println();  
}  
}  
}
