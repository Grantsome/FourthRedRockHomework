import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;
import java.util.Scanner;

import static java.lang.System.exit;

abstract  class Bag implements LikeSet{
      public static void main(String args[]){
          All();
	  }

	  public static void All(){
           LinkedList<String> BagList = new LinkedList<String>();
           BagList.add("Name:Grantsome");
           BagList.add("Number:2015213041");  
           Insert(BagList);
           LinkedList<String> BagListAfterOne = Insert(BagList);
	       Delete(BagListAfterOne);
           LinkedList<String> BagListAfterTwo = Delete(BagList);
	       isEmpty(BagListAfterTwo);
           GetElement(BagListAfterTwo);
	       GetSpeacialElement(BagListAfterTwo);
	  }

      public static LinkedList Insert(LinkedList BagList) {
          Scanner input = new Scanner(System.in);
          String element = null;
          do {
              System.out.println("Please Input The inserted Element And Press Enter:(‘End’(Twice is OK) Means Don't Input)");
              element = input.next();
              if(element.equals("End"))
                  break;
              BagList.add(element);
              for (Object str : BagList) {
                  System.out.println(str);
              }
          }while(!element.equals("End"));
          System.out.println("This inserted time is over");
          System.out.println("After Adding Now The List Is :");
          for (Object str : BagList) {
                  System.out.println(str);
          }
              return BagList;
      }


      public static LinkedList Delete(LinkedList BagListAfterOne) {
          Scanner input = new Scanner(System.in);
          System.out.println("Please Input The deleted Element Index And Press Enter:(‘-1’ Means Don't Input),But this Time won't be deleted!:");
          int index = input.nextInt();
          do {
              System.out.println("Please Input The deleted Element Index And Press Enter:(‘-1’(Three Time is Ok!) Means Don't Input)");
              index = input.nextInt();
              if (index > BagListAfterOne.size()) {
                  System.out.println("Error,Please input again");
              }
              if(index == -1){
                  break;
              }
              else
                 BagListAfterOne.remove(index);
              for(Object str:BagListAfterOne){
                  System.out.println(str);
              }
          }while(index !=-1);
          System.out.println("Deleted is over!");
          System.out.println("After deleting Now The List Is :");
          for(Object str:BagListAfterOne){
          	System.out.println(str);
          }
          return BagListAfterOne;
      }

      public static void isEmpty(LinkedList BagListAfeterTwo) {
          if (BagListAfeterTwo == null) {

              System.out.println("ture");

          } else
              System.out.println("false");
          //System.out.println("After Judge isEmpty or Not Now The List Is");
      }

      public static void GetElement(LinkedList BagListAfterTwo){
          System.out.println("After Judge isEmpty and Now The List Is");
          Iterator iterator = BagListAfterTwo.iterator();
          while(iterator.hasNext())
              System.out.println(iterator.next());
      }
      public static void GetSpeacialElement(LinkedList BagListAferTwo){
          System.out.println("Please Input The Elements that you wanted to Selected");
          Scanner input = new Scanner(System.in);
      	  String enterFirst = input.next();
      	if(BagListAferTwo.contains(enterFirst)){
      		System.out.println("It Contains" + enterFirst);
      		System.out.println("It Contains " + enterFirst + "The Locatation of The Element is " + BagListAferTwo.indexOf(enterFirst));
      	}else
      	   System.out.println("It don't Contains" + enterFirst);
      }
}
      	