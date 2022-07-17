package com.jap.replaceinteger;

public class ArrayPairSum {

    public static void main(String[] aa) {

        //Declare and initialize integer array in the variable numberArray
        int[] numberArray=null;
        ArrayPairSum arrayPairSum = new ArrayPairSum();
        int sumArray[] = arrayPairSum.sumOfArrayPair(numberArray);
        //write forEach loop to iterate through the 'sumArray' to print the output
		for(int i: sumArray){
			System.out.println(i);
		}

    }
	
    public int[] sumOfArrayPair(int numberArray[])
	{
         //int j=0;
		 int [] outputArray2=new int[0];
        if(numberArray.length%2==0)
        {

               int [] outputArray = new int[numberArray.length/2];
			   int j=0;
               {
                   for (int i = 0; i < numberArray.length; i = i + 2)
                  {
                       outputArray[j] = numberArray[i] + numberArray[i + 1];
                       j++;
                  }
				 
 
               }      
			   outputArray2=outputArray;  
		          //return outputArray;
		}

        else if(numberArray.length%2!=0)
        {

            int [] outputArray = new int[(numberArray.length-(1))/2+1];
			int j=0;
            {
                for (int i = 0; i < numberArray.length-1; i = i + 2)
                {
                    outputArray[j] = numberArray[i] + numberArray[i + 1];
                    j++;
                }
                outputArray[outputArray.length-1]=numberArray[numberArray.length-1];
				//return outputArray;
				outputArray2=outputArray;  
            }
            return outputArray2;
		}  
		return outputArray2;
	}    
}