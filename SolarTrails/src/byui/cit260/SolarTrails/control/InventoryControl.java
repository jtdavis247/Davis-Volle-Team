/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.SolarTrails.control;

/**
 *
 * @author jeff
 */
public class InventoryControl {
    
    public double calcFoodUsed(double timeLapsed, int crewSize, int food) {
      
      double foodUsed = 0;
      if (timeLapsed > 0 && crewSize > 0) {
            foodUsed = (timeLapsed * crewSize);
       }
      if  (foodUsed > food) {
            return -1;
       }
      else
            return foodUsed;
        
    }
}
/*modifiers returnType functionName ()
calcFoodUsed(timeLapsed, crewSize , food) : double
BEGIN

END
*/