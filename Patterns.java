//Jonah Banks
//This generates various patterns based upon inputted values by user
//11/6/2025
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
    //Precondition: rows is an int and greater than or equal to 1; postcondition: a triangle with rows rows of numbers printed to console
    public static void triangle(int rows){
        int s=1;
        String currRow="";
        while(s<=rows){
            int r=0;
            while(r<s){
                currRow+=s;
                r++;
            }
            System.out.println(currRow);
            currRow="";
            s++; 
        }
    }
    //Precondition: start is an int at least one; Postcondition: start rows of odd numbers printed to the console
    public static void odds(int start){
        String currRow="";
        for (int i=start;i>0;i-=2){
            for (int j=0; j<i;j++){
                currRow+=i;
            }
            System.out.println(currRow);
            currRow="";
        }
    }
    //Precondition: maxE is an int at least equal to two; Postcondition: a pattern of Es and Os are printed to the screen, odd number of os, even number of es
    public static void eo(int maxE){
        String currRow="";
        if(maxE%2==0){
            currRow="O";
        }else{
            currRow="E";
        }
        for(int i=2;i<=maxE*2;i++){
            System.out.println(currRow);
            if (i>maxE){
                if(currRow.contains("E")){
                    currRow="";
                    for(int j=0;j<maxE-(i%maxE);j++){
                        currRow+="O";
                    }
                }else{
                    currRow="";
                    for(int j=0;j<maxE-(i%maxE);j++){
                        currRow+="E";
                    }
                }
            }else{
                if(currRow.contains("E")){
                    currRow="";
                    for(int j=0;j<i;j++){
                        currRow+="O";
                    }
                }else{
                    currRow="";
                    for(int j=0;j<i;j++){
                        currRow+="E";
                    }
                } 
            }
            }
    }
    //Precondition: rows is an int at least equal to one; Postcondition: a pyramid with rows rows of numbers in descending order is printed to the console
    public static void pyramid(int rows){
        String currRow="";
        int q=1;
        while(q<=rows){
            int p=1;
            int r=q-1;
            while(r>0){
                currRow+=" ";
                r--;
            }
            //Adds q-1 spaces in front  of each new row 
            while(p<=2*rows-2*q+1){
                currRow+=q;
                p++;
            }
            System.out.println(currRow);
            currRow="";
            q++;
        }
    }
    public static void main(String[] args){
        stars(5);
        triangle(5);
        odds(5);
        eo(6);
        pyramid(5);
    }
}