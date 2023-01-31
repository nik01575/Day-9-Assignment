public class assignment1 
{
    public static void main(String[] args)
    {
        int n=11;

        for(int i=0; i<n; i++)
        {
            // --------------------------------------------------Code For A---------------------------------------

             for( int j=0; j<n; j++)
            {
                if( j==0 && i>0 || j==(n-1) && i>0 || i==0 & j>0 && j < n-1  ||i==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

             // ---------------------------Code For B----------------------

            System.out.print("   ");

            for( int j=0; j<n; j++)
            {
                if( j==0 || i==(n-1)/2 && j<(n-1)/2 ||  i==0 && j<(n-1)/2 ||  i==(n-1) && j<(n-1)/2 ||  i==1 && j==((n-1)/2)+1 ||
                i==2 && j==((n-1)/2)+2 || i==3 && j==((n-1)/2)+2  || i==4 && j==((n-1)/2)+1 ||
                 i==((n-1)/2)+1 && j==((n-1)/2)+1  || i==((n-1)/2)+2 && j==((n-1)/2)+2  || i==((n-1)/2)+3 && j==((n-1)/2)+2 || i==((n-2)) && j==((n-1)/2)+1  )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            

            // ----------------------------Code For C--------------------------

            System.out.print(" ");

            for( int j=0; j<n; j++)
            {
                if( i==0 || j==0 || i==n-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            
            // --------------------------------------------------Code For D---------------------------

            System.out.print("   ");

             for( int j=0; j<n; j++)
            {
                if(j==0 || i==0 && j<= n-2 || i==n-1  && j<=n-2|| j==n-1 && i>0 && i<n-1 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            // --------------------------------------------------Code For E---------------------------------------

            System.out.print("   ");

             for( int j=0; j<n; j++)
            {
                if(j==0 || i==0 || i==n-1  || i==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            // ---------------------------Code For F---------------------------

            System.out.print("   ");

             for( int j=0; j<n; j++)
            {
                if(j==0 || i==0  ||i==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
                   // ----------------------------Code For G--------------------------

            System.out.print(" ");

            for( int j=0; j<n; j++)
            {
                if( i==0 || j==0 || j==n-1 && i>(n-1)/2 || i==n-1 || i==(n)/2 &&  j>(n)/2-1  )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            // -----------------------------Code For H-------------------------

             System.out.print("   ");

             for( int j=0; j<n; j++)
            {
                if(j==0 || j==(n-1)||i==(n-1)/2)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            // ----------------------------Code For I--------------------------


             System.out.print("   ");

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
            
            System.out.println("");


            
        }
    }
}