public class ArrayIndexOutOfBoundException {  
  
    public static void main(String[] args) {  
String[] arr = {"Rohit","Shikar","Virat","Dhoni"};   
//Declaring 4 elements in the String array                                       
          
        for(int i=0;i<8;i++) {       
  
//Here, no element is present at the iteration number arr.length, i.e 4  
             System.out.println(arr[i]);      
//So it will throw ArrayIndexOutOfBoundException at iteration 4           
        }  
  
  
      int num= 25;
  
             System.out.println(num/0)    
  
    }  
  
}
