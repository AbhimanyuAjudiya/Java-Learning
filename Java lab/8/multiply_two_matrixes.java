
public class multiply_two_matrixes 
{
	public static void main(String[] args)
	{
		int a[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		int b[][] = {{11,22,33}, {44,55,66}, {77,88,99}};
		int c[][] = new int[3][3];
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				c[i][j]=0;
				for(int k=0;k<=2;k++)
				{
					c[i][j] = c[i][j] + (a[i][k]*b[k][j]);
				}
			}
		}
		System.out.println("Result:");
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(c[i][j] + "\t");
			}
			System.out.println("");
		}
	}

}




