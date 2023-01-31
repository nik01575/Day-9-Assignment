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