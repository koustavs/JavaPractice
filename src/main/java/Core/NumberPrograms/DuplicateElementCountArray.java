package Core.NumberPrograms;

public class DuplicateElementCountArray {
    public static void main(String args[]){
        int a[]={10,10,10,20,20,30,40,50,60,60,60,70,80,90,100,100,100,100};
        int key=100;

        int count=0;
        for(int x:a){

            if(x==key){
                ++count;
            }

        }

        System.out.println("Count of "+key+" is "+count);
    }
}
