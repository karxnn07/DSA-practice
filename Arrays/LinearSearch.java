// Linear search:
// public class LinearSearchArray{
//     public static int linearSearchNumbers(int numbers[], int key){
//         for (int i=0; i<numbers.length; i++){
//             if (numbers[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         int key = 20;

//         int index = linearSearchNumbers(numbers, key);
//         if(index==-1){
//             System.out.println("Key NOT found");
//         } else {
//             System.out.println("Key is at index: " + index);
//         }
//     }
// }

// Linear Search Menu:
public class LinearSearch{
  public static int linearSearchMenu(String menu[], String key){
    for (int i=0; i<menu.length; i++){
        if (menu[i].equals (key)){
            return i;
        }
    }
    return -1;
  }
  public static void main(String args[]){
    String menu[] = {"chhole bhature", "samosa", "coke", "pepsi"};
    String key = "coke";
    int index = linearSearchMenu(menu, key);

    if (index==-1){
      System.out.println("Item Not Found");
    } else {
      System.out.println("Item Found at index:" +index);
    }
  }
}