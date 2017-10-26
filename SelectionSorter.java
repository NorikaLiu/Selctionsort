import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelectionSorter {

	public static void selectionSort(ArrayList<String> wordList) {
		
	/*
	 * Implement selection sort on the wordList which is an ArrayList of strings
	 */
	 int list = wordList.size ();
	  for (int i = list - 1; i >0; i --) {
		for (int j = 0 ; j < i; j ++) {
			if (wordList.get(j).compareTo(wordList.get(j+ 1)) > 0) {
	Collections.swap (wordList, i, j);
			
		}
//welp i try :)
	}
}
}
	}