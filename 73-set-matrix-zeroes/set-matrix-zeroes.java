import java.util.Arrays;
class Solution
{
    public void setZeroes(int[][] matrix)
    {
        int n=matrix.length;
        int m=matrix[0].length;
        //int row[]=new int[n]; matrix[...][0] row keeps changing & 0th col{HORIZON}
        //int col[]=new int[m]; matrix[0][...] col keeps changing & 0th row{VERTICAL}

        int col0=1; // flag for the 0th colmn
        for(int i=0;i<n;i++)
        {
            if(matrix[i][0]==0)  col0=0; 
            for(int j=1;j<m;j++)
            {
                if(matrix[i][j]==0)
                {   
                    matrix[i][0]=0; //marking row
                    matrix[0][j]=0; //marking colmn
                }
            }   
        }
        for(int i = 1; i < n; i++) 
        {
            for (int j = 1; j < m; j++) 
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                matrix[i][j]=0;
            }
        }

        if(matrix[0][0]==0)
        {
            for(int j=0;j<m;j++)
            {
                matrix[0][j]=0;
            }
        }

        if(col0==0)
        {
            for(int i=0;i<n;i++)
            {
                matrix[i][0]=0;
            }
        }


    }
}
/*class Solution
{
    public void setZeroes(int[][] matrix) 
    {
        int n=matrix.length;
        int m=matrix[0].length;
        int row[]=new int[n];
        int col[]=new int[m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(row[i]==1 || col[j]==1)
                matrix[i][j]=0;
            }
        }
    }
}
*/
/*class Solution {
    public void setZeroes(int[][] matrix) 
    {
        int n =matrix.length;
        int m=matrix[0].length;
        int row[]=new int [n];
        int col[]=new int [m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    markRow(matrix,i,j,n,m);
                    markCol(matrix,i,j,n,m);
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==-1)
                matrix[i][j]=0;
            }
        }
    }
    void markRow(int matrix[][],int i,int col,int n,int m)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]!=0)
                matrix[i][j]=-1;
            }
        }
    void markCol(int matrix[][],int row,int j,int n,int m)
        {
            for(int i=0;i<n;i++)
            {
                if(matrix[i][j]!=0)
                matrix[i][j]=-1;
            }
        }
}*/