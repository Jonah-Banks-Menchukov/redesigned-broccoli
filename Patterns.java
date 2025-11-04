//Jonah Banks
//This generates various 
public class Patterns{
    //Precondition: rows is an int with a minimum value of one.  Postcondition: there will be rows rows of stars printed to the console, each with +2 stars
    public static void stars(int rows){
        String stars ="*";
        int t=1;
        while (t<=rows){
            System.out.println(stars);
            stars+="**";
            t++;
        }
    }
    public static void triangle(int rows){
        int s=1;
        String currRow="";
        while(s<=rows){
            int r=0;
            while(r<s){
                currRow+=s;
            }
            System.out.println(currRow);
            currRow="";
            s++; 
        }
    }
    public static void main(String[] args){
        stars(7);
        triangle(9);
    }
}