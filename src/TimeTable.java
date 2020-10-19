import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Jamith Nimantha
 */
public class TimeTable {
    public static void GenerateTable(int arr[][],int nos,String day[], String fac_name[],int freeLectures,int labs){
        int k=0;
        Random r = new Random();

        HashMap<Integer,String> hashmap = new HashMap<Integer, String>();
        hashmap.put(0,"0");
        int id=1;
        for(int i=0 ; i<nos ; i++){
            hashmap.put(id,fac_name[i]);
            id++;
        }

        //Timetable Generates from here
        while(k<6) {
            int count=0;
            ArrayList<Integer> arrayList = new ArrayList<Integer>();

            for(int i=0 ; i<nos ; i++){
                int random=r.nextInt(nos+1);
                if(random==0 && freeLectures==0)
                {
                    i--;
                }
                else {

                    if (arrayList.contains(random)) {
                        if (random == 0 && count < freeLectures) {
                            arrayList.add(random);
                            count++;
                        } else {
                            i--;
                        }
                    } else {
                        if (random == 0 && count < freeLectures) {
                            arrayList.add(random);
                            count++;
                        } else {
                            arrayList.add(random);
                        }
                    }
                }
            }

            if(labs!=0){
                for(int i=nos ; i<nos+labs ; i++){
                    int random=r.nextInt(nos+1);
                    arrayList.add(random);
                }
            }

            //System.out.println("ArrayList: "+arrayList);
            for(int j=0 ; j<nos+labs ; j++){
                if(arrayList.get(j)!=null) {
                    arr[k][j] = arrayList.get(j);
                }else {
                    arr[k][j]=0;
                }
            }
            k++;
        }

        printTable(day,arr,hashmap,nos,labs);

    }

    public static void printTable(String day[],int arr[][],HashMap hashmap, int nos,int labs){
        //Printing TimeTable
        for(int i=0 ; i<6 ; i++){
            System.out.print(day[i]+" ");
            for(int j=0 ; j<nos+labs ; j++){
                System.out.print(hashmap.get(arr[i][j]));
                if(j>=nos && arr[i][j]!=0){
                    System.out.print(" Lab");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("Where 0 = Free Lecture");
    }
    public static void main(String args[])
    {

        String[] day=new String[6];
        day[0] = "Monday    ";
        day[1] = "Tuesday   ";
        day[2] = "Wednesday ";
        day[3] = "Thursday  ";
        day[4] = "Friday    ";
        day[5] = "Saturday  ";

        int nos,i,j;

        Scanner sc=new Scanner(System.in);

        //Entering Number Of Subjects
        System.out.println("Enter Number Of Subjects : ");
        nos=sc.nextInt();
        //nos = nos+1;

        String fac_name[] = new String[nos];

        //Giving Id to teacher
        System.out.println("Enter  name  of  faculty  with  assigned  subject in the format name_of_faculty(Subject name) :");

        for(i=0 ; i<nos ; i-=-1){
            fac_name[i]=sc.next();
        }

        System.out.println("Enter Maximum Number of Free Lectures to be Given :");
        int freeLectures=sc.nextInt();

        System.out.println("Enter Maximum Number of Labs : ");
        int labs=sc.nextInt();

        int A[][] = new int[6][nos+labs];
        GenerateTable(A,nos,day,fac_name,freeLectures,labs);
    }
}
