Class s8
{
	public static void main (string args[])
{
		Int n=6;
printPattern(n);
          }
	Static void printPattern(int n)
{
Inti,j,k=0;
for(i=1;i<=n;i++){
	for(j=1;j<=n;j++){
		System.out.println(“ “);
}
While(k!=2*i-1){
	If(k==0||k==2*i-2){
			System.out.println(“#”);
         Else
			System.out.println(“ ”);
       K++;
}
k=0;
System.out.println();
}
For(i=0;i<2n-1;i++){
	System.out.println(“#”);
}
}
}
			


