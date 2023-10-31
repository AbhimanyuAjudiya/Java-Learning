import java.util.*;
public class strobo{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int num=sc.nextInt();
        int temp1=num;
        int temp2=num;
        int fl=0;
        int count=0;
        while(temp1>0){
            int d=temp1%10;
            count++;
            temp1=temp1/10;
        }
        int arr[]=new int[count];
        for(int i=0;i<count;i++){
            arr[i]=temp2%10;
            temp2=temp2/10;
        }
        int fl2=0;
        int mid=0;
        if(count%2==0){
            mid=count/2;
        }
        else{
            mid=(count+1)/2;
        }
        for(int i=0;i<mid;i++){
            if(arr[i]==0 && arr[count-i-1]==0)
            {
                continue;
            }
            else if(arr[i]==1 && arr[count-i-1]==1)
            {
                continue;
            }
            else if(arr[i]==6 && arr[count-i-1]==9)
            {
                continue;
            }
            else if(arr[i]==9 && arr[count-i-1]==6)
            {
                continue;
            }
            else{
                fl2=1;
                break;
            }
        }
        if(fl==1)
        {
            System.out.print(num+" is not Strobogrammatic");
        }
        else{
             System.out.print(num+" is Strobogrammatic");
        }
    }
}
