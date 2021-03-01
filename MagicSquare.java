
/**
 * @author Nick Brunetti
 * @version  March 1, 2021
 */

public class MagicSquare
{
    /** The magic square array data */
    private int[][] array;

    /**
     * Constructs a MagicSquare object.
     * @param input the magic square array data.
     */
    public MagicSquare(int[][] input)
    {
        array = input;
    }

    /**
     * Tests to see if array is indeed a magic square
     * @return true if array is a magic square
     * @return false if the array is not a magic square
     */
    public boolean isMagicSquare()
    {
      
      if(array[0].length!=array.length){
        return false;
      }
int base =0;

 for(int w = 0; w<array[0].length; w++){
          base += array[0][w];
        }
      
      int diagonal=0, column=0, rows =0, diagonal2 = 0;
      boolean diagon=true, colum=true, row=true, diagon2 = true;

/** row check
*/
      for(int i = 0; i<array.length; i++){
        for(int j = 0; j<array[i].length; j++){
          rows += array[i][j];
        }
        if(rows !=base){
          row = false;
          }
          rows = 0;
      }    
     
/** column check
*/
      for(int i = 0; i<array[0].length; i++){
        for(int j = 0; j<array.length; j++){
          column +=array[j][i]; 
        }
        if(column !=base){
          colum = false;
          }
          column =0;
      }   

/** diagonal top left to bottom right check
*/
      for(int i = 0; i<array[0].length; i++){
           diagonal +=array[i][i];
      }
        if(diagonal !=base){
           diagon = false;
        }

/** diagonal  bottom left to top right check
*/
      for(int i = array[0].length-1; i>=0; i--){
           diagonal2 +=array[array[0].length-1-i][i];
      }
        if(diagonal2 !=base){
           diagon2 = false;
        }

if(row == true && colum == true && diagon == true && diagon2 == true){
  return true;
}else{
  return false;
}
    }

    /**
     * Returns a String which represents the array.
     */
    public String toString()
    {
        String result = "";
        for(int r = 0; r < array.length; r++)
        {
            for(int c = 0; c <array[r].length; c++)
            {
                result += array[r][c];
                result += "\t";
            }
            result += "\n";
        }
        return result;
    }
}
