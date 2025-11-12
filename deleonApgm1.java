 /*********************************************************************
 Author    : Alexandria Deleon 
 Course    : COP3804 Intermediate Java.
 Professor : Michael Robinson 
 Program #1 : Program Purpose/Description 
             { This purpose of this program is to review java 1 concepts by creating an array using multiple methods and the printf function. }

 Due Date  : 09/12/2023 


 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Alexandria Deleon }..........
*********************************************************************/

public class deleonApgm1
{

    
	
    public static void arrays(int[][]twoDimentionalArray)
	{
		
		
        for ( int x = 0; x < 15; x++ )   //for loops which starts the array at the (0,0) postion and end it at the (14,14) postion
        {
            for ( int y = 0; y < 15; y++ )
			{
				twoDimentionalArray[x][y] = ( x + y ) * 3; //loads array with data
			}
        }
		
	    printArrays(twoDimentionalArray);      //calling other methods
		addingValues(twoDimentionalArray);
		
	}//end public static void arrays()
	
	
	public static void printArrays(int[][]twoDimentionalArray)
	{
		
		
        for ( int x = 0; x < 15; x++ )            
        {
            for ( int y = 0; y < 15; y++ )
			{
				System.out.printf("%3d", twoDimentionalArray[x][y] );    //prints the array 
			}
			System.out.printf( "%s", "\n" );
        }
		
	}//end public static void printArrays()
	
	
	public static void addingValues(int[][]twoDimentionalArray)
	{
       int sum = 0;
	   
	   
	   for ( int x = 0; x < 15; x++ )
        {
            for ( int y = 0; y < 15; y++ )
			{
				sum += twoDimentionalArray[x][y]; //sum = sum + twoDimentionalArray[x][y]
			}
            
	    }
		
		System.out.printf(" The sum of all values is %d.", sum );
	}
	
	
	public static void main( String args[] )
	{
		
		//declares a 15x15 two Dimentional Array
		int twoDimentionalArray[][] = new int[15][15];
		arrays(twoDimentionalArray);                          // calling arrays method with the other two methods
		
		System.out.printf( "%s My name is Alexandria Deleon", "\n" );
		
	}//end public static void main()
}//end of class

	