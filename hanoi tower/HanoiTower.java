//==================================
// Foundations of Computer Science
// Student: Abhishek Das
// id: a1772359
// Semester: 01
// Year: 2019
// Practical Number: 04
//===================================


//class HanoiTower
public class HanoiTower {
    private int totalDisks;
    
 //default constructor which initializes totalDisks to 3   
    public HanoiTower() {
        totalDisks = 3;
        
    }
//Parameterized constructor which takes user value for totalDisks
    public HanoiTower(int dTmp) {
        totalDisks = dTmp;
       
    }
    
 //method solve which calls the moveTower method   
    public void solve() {
        moveTower (totalDisks,'A','B','C');
    }

 //method moveTower which calls itself recursively and print the move by calling moveDisk   
    private void moveTower(int numDisks, char start, char end, char temp) {
        if (numDisks ==1) {
            moveDisk(numDisks,start,end);
        }
        else {
            moveTower (numDisks-1, start, temp, end);
            moveDisk (numDisks,start, end);
            moveTower (numDisks-1, temp, end, start);
        }
    }

 //method moveDisk which prints the move   
    private void moveDisk(int numDisks,char start, char end) {
        
        System.out.println("Move the disk "+numDisks+" from "+start+" to "+end);
        
    }
   
}