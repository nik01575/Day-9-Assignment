public class assignment4 
{
    public static void main(String[] args)
    {
         int n=11;

        for(int i=0; i<n; i++)
        {
            // --------------------------------------------------Code For P---------------------------------------

             for( int j=0; j<n; j++)
            {
                if( j==0 || i==(n-1)/2 && j<(n-1)/2 ||  i==0 && j<(n-1)/2  ||  i==1 && j==((n-1)/2)+1 ||
                i==2 && j==((n-1)/2)+2 || i==3 && j==((n-1)/2)+2  || i==4 && j==((n-1)/2)+1 ) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            // --------------------------------------------------Code For W ---------------------------------------

             System.out.print("");

             for( int j=0; j<n; j++)
            {
                if( j==0 || j==n-1 || i+j==n-1 && i>=(n-1)/2 || i==j && i>=(n-1)/2) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            // --------------------------------------------------Code For S ---------------------------------------

            System.out.print("              ");

             for( int j=0; j<n; j++)
            {
                if( i==0 || i==n-1 || i==(n-1)/2 || j==0 && i<(n-1)/2 || j==n-1 && i>(n-1)/2 ) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            
            // --------------------------------------------------Code For K ---------------------------------------

             System.out.print("  ");

             for( int j=0; j<n; j++)
            {
                if( j==0 || i+j==(n+1)/2 || i-j==(n-1)/3 ) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

                    // --------------------------------------------------Code For I ---------------------------------------

            System.out.print("");
             for( int j=0; j<n; j++)
            {
                if(i==0 || i==(n-1)||j==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
                 // --------------------------------------------------Code For L ---------------------------------------

            System.out.print("  ");
             for( int j=0; j<n; j++ )
            {
                if(j==0 || i==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
               // --------------------------------------------------Code For L ---------------------------------------

            System.out.print("  ");
             for( int j=0; j<n; j++ )
            {
                if(j==0 || i==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
              // --------------------------------------------------Code For S ---------------------------------------

            System.out.print(" ");

             for( int j=0; j<n; j++)
            {
                if( i==0 || i==n-1 || i==(n-1)/2 || j==0 && i<(n-1)/2 || j==n-1 && i>(n-1)/2 ) 
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}