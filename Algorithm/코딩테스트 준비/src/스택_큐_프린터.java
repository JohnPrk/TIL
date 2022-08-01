import java.util.*;

class Print {
    int  index, importance;
    
    Print(int index, int importance) {
        this.index = index;
        this.importance = importance;
    }
}

class Solution {

    
    public int solution(int[] priorities, int location) {
        int turn = 0;
        
        ArrayList<Print> printer = new ArrayList<>();
        
        for(int i=0; i < priorities.length; i++){
            printer.add(new Print(i, priorities[i]));
        }    
        
        
        while(!printer.isEmpty()) {
            
            Print print = printer.remove(0);
            
            if(printer.stream().anyMatch(otherJob -> print.importance < otherJob.importance)) {
                printer.add(print);
            }else {
                turn++;
                
                if(location == print.index) {
                    break;
                }
            }
            
        }
        
    
        
        
      
        
        return turn;
    }
}