public class binSearch {

    public static boolean bynarySearch(int [] arr, int item)
    {
           int min = 0;
           int max = arr.length -1;
    
          if (min <= max)
         {
            int mid = (min + max)/2;
          
            if( item == arr[mid])
            {
              return true; 
            }
            else if (item > arr[mid])
              {
             
                max = mid + 1; 
              }     
            else{
                 max = mid -1;
                }
            }
            return false;
        }
    }  
    
 


