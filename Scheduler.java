
package os.scheduler;


public class Scheduler {
    private int no; 
   int [] burst=new int [no];
    int [] arrival=new int [no];
    int [] waiting=new int [no];
    int [] start=new int [no];
        int [] priority=new int [no];
  String[] names=new String[no];
    public Scheduler(int x){
                this.no=x;
                //for (int i=0;i<5;i++){
              //   names[i]="p"+i;
                // System.out.println(names[i]);}
    }
                String [] init(){
                   String[] names=new String[no];
                    for (int i=0;i<no;i++){                 names[i]="p"+(i+1);
                 //System.out.println(names[i]);
                 }
                    return names;
                  }                   
                 int[] execute(int[] arr2){
  int sum=arrival[0];
  int [] arr1=new int[no];
  for(int i=0;i<no;i++){
  arr1[i]=sum;
  sum=sum+arr2[i];
      System.out.println(arr1[i]);
     }
  return arr1;
     }
                int[] rrExecute(int n){
  int sum=arrival[0];
  int [] arr1=new int[no];
  for(int i=0;i<no;i++){
  arr1[i]=sum;
  sum=sum+n;
      //System.out.println(arr1[i]);
     }
  return arr1;
     }
              // sort ascending according to arrival
        void   sort1(int[] arr,int [] arr2, int no){  
        for (int i = 0; i < no - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < no; j++){  
                if (arr[j] < arr[index]){  
                    index = j;
                } } 
         int small = arr[index];
         int temp=arr2[index];
            arr[index] = arr[i]; 
            arr2[index]=arr2[i];
            arr[i] = small; 
            arr2[i]=temp;
             String x=names[index];
                  names[index]=names[i];
                  names[i]=x;
                                                    }  
       // for(int i=0;i<no;i++){
          //  System.out.println(arr[i]+"/"+arr2[i]);}
    }  
int sum(int [] arr){
int sum=arrival[0];
          for(int i=0;i<no;i++){
          sum+=arr[i];
          }
          return sum;
}
float AWT(){
float avrg=0;
float sum=0;
int [] arr=new int [no];
for(int i=0;i<no;i++){
   arr[i]=start[i]-arrival[i];
   sum+=arr[i];}
avrg=sum/no;
return avrg;
}
int [] convert(String x){
     String[] val = x.split(" ");
     int[] arr = new int[val.length];
     for (int i = 0; i < val.length; ++i){
          arr[i] = Integer.parseInt(val[i]);
          
     }
  return arr;
}
//after sorting arrival sort according to burst 
void   sort2(int[] arr,int [] arr2, int no){  
    int sum=0; int t=0;
    
        for (int i = 0; i < no - 1; i++)  
        {              int index = i;  
            for (int j = i + 1; j < no; j++){  
                if (arr[j] < sum){  
                    if(arr2[j]<arr2[i]){
                    index = j;
                    }}}
int small = arr[index];
         int temp=arr2[index];
            arr[index] = arr[i]; 
            arr2[index]=arr2[i];
            arr[i] = small; 
            arr2[i]=temp;
                  String x=names[index];
                  names[index]=names[i];
                  names[i]=x;
                  if(arr2==priority){
                  int temp1=burst[index];
                  burst[index]=burst[i];
                  burst[i]=temp1;}
         sum+=arr2[i];
        }      }   
       //after sorting arrival sort according to priority
       void   sort3(int[] arr,int [] arr2, int no){  
    int sum=0; int t=0;
    
        for (int i = 0; i < no - 1; i++)  
        {              int index = i;  
            for (int j = i + 1; j < no; j++){  
                if (arr[j] < sum){  
                    if(arr2[j]<arr2[i]){
                    index = j;
                    }}}
int small = arr[index];
         int temp=arr2[index];
            arr[index] = arr[i]; 
            arr2[index]=arr2[i];
            arr[i] = small; 
            arr2[i]=temp;
                  String x=names[index];
                  names[index]=names[i];
                  names[i]=x;
                  
                  int temp1=burst[index];
                  burst[index]=burst[i];
                  burst[i]=temp1;
         sum+=burst[i];
        }         //    
}

       
    
}





