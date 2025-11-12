/*********************************************************************
 Author    : Alexandria Deleon 
 Course    : COP3804
 Professor : Michael Robinson 
 Program # : Program Purpose/Description 
             { This program is meant to expose us to the new concepts of parallel arrays, enhanced for loops, string tokenizers, array lists, and array list of objects. }

 Due Date  : 10/05/2023 


 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 

 ..........{ Alexandria Deleon }..........
*********************************************************************/
import java.util.ArrayList;


public class deleonApgm2
{

    public static void parallel( int carsWeight[], String owner[], double totalMiles[] )
    {
        //printing out arrays using for loop
        for ( int x = 0; x < carsWeight.length; x = x + 1 )
        {
            
            System.out.printf( "%d, %s, %f", carsWeight[x], owner[x], totalMiles[x] );
            System.out.printf( "%s", "\n" );

        }
    
    }//end public static void parallel()
    
    
    public static void theEnhanceForLoop( Object objectArray[] )
    {
        
        for( Object o : objectArray )         
        {
            System.out.printf( " %s\n", o );
        }
    
    }//end public static void theEnhanceForLoop
    
    
    public static void tokens()
    {    
        //declaring variables
        String str1 = "Jill$Billy%Becky*Tara&Mary";    
        String str2 = "http://gaddisbooks.com";    
        String str3 = "blue one red three yellow";
        
        //String tokenizers, .split splits string into differnt strings
        String tokens[] = str1.split( "[$%*&]" );
        for( String s : tokens )
        {
            System.out.printf( "%s\n", s );
        }

        tokens = str2.split( "[:.]" );
        for( String s : tokens )
        {
            System.out.printf( "%s", s );
        }
    
        tokens = str3.split( "[' ']" );
        for( String s : tokens )
        {
            System.out.printf( "%s\n", s );
        }
          
    }//end public static void tokens
    
    
    public static void theArrayList()
    {
     
        ArrayList<Object> theList = new ArrayList<Object>();

        //adding data to arraylist
        theList.add( 123 );
        theList.add( "Java" );
        theList.add( 3.75 );
        theList.add( "Fall C" );
        theList.add( 2099 );

        //for loop that prints array list
        for( int x = 0; x < theList.size(); x++ )
        {
            System.out.printf( "%s " , theList.get(x) );
        }
        
        System.out.printf( "%s", "\n" );
    
        //removing data from position 5 and 2. Should remove right to left.
        theList.remove(4);
        theList.remove(1); 
 
        //for loop that prints array list
        for( int x = 0; x < theList.size(); x++ )
        {
            System.out.printf( "%s " , theList.get(x) );
        }
       
    }//end public static void theArrayList
    
                       //theObjects( 1, "one", 1.4, 0.25, "COP3804", "Java Language", 100 );
    public static void theObjects( Object number1, Object stringOne, Object double1_4, Object double0_25, Object stringCOP3804, Object stringJava_Language, Object number100 )
    {

        System.out.printf( "%s", "\n" );
     
        ArrayList<Object> theObjectList = new ArrayList<Object>();
        
        //adding data to arraylist
        theObjectList.add( number1 );
        theObjectList.add( stringOne );
        theObjectList.add( double1_4 );
        theObjectList.add( double0_25 );
        theObjectList.add( stringCOP3804 );
        theObjectList.add( stringJava_Language );
        theObjectList.add( number100 );

        //for loop that prints array list
        for ( int x = 0; x < theObjectList.size(); x = x + 1 )
        {
            System.out.printf( "%s " , theObjectList.get(x) );
        } 
        
    }//end public static void theObjects()
    

    public static void main( String args[] )
    {
        //declaring arrays
        int carsWeight[]    = { 50102, 23908, 12098 }; //carsWeight
        String owner[]      =  { "Michael Hall", "Maria Lopez", "Mo Freeman" }; //owers name
        double totalMiles[] =  { 104.45, 232.78, 153.07 }; //total miles
        
        //calling method and trafering the data in arrays to parallel
        parallel(carsWeight, owner, totalMiles);
       
        Object objectArray[] = { "cat", "dog", "bird", "fish", "hamster" };
    
        //calling methods
        theEnhanceForLoop( objectArray );
        tokens();
        theArrayList();
        theObjects( 1, "one", 1.4, 0.25, "COP3804", "Java Language", 100 );  //transfering data to theObjects method
    
    }//end public static void main( String args[] )


}