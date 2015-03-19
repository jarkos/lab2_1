package edu.iis.mto.bsearch;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class BinarySearchTest {

		@Test
		public void searchElement_IsInSeq() {
			int[] seq = {1};
			SearchResult result = BinarySearch.search(1, seq);		
			assertThat(true, is(result.isFound()));
		}
		
		@Test
		public void searchElement_IsntInSeq() {
			int[] seq = {1};
			SearchResult result = BinarySearch.search(5, seq);		
			assertThat(false, is(result.isFound()));
		}
		
		@Test
		public void searchManyElements_FirstInSeq() {
			int[] seq = {2,3,5};
			SearchResult result = BinarySearch.search(2, seq);		
			assertThat(true, is(result.isFound()));		
		}
		
		@Test
		public void searchManyElements_LastInSeq() {
			int[] seq = {2,3,5};
			SearchResult result = BinarySearch.search(5, seq);		
			assertThat(true, is(result.isFound()));		
		}
	
		@Test
		public void searchManyElements_MiddleInSeq() {
			int[] seq = {2,3,5};
			SearchResult result = BinarySearch.search(3, seq);		
			assertThat(true, is(result.isFound()));			
		}
		
		@Test
		public void searchManyElement_nNotInSeq() {
			int[] seq = {2,3,5};
			SearchResult result = BinarySearch.search(4, seq);		
			assertThat(false, is(result.isFound()));			
		}

}
