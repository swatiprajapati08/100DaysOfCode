//TRANSPOSE

class TransposeMatrix
{
    static void transpose(int a[][], int n)
    {
        int b[][]=new int[a.length][a[0].length];
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            b[i][j]=a[i][j];
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            a[i][j]=b[j][i];
        }
    }
}