package edu.iis.mto.bsearch;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class BinarySearchTest {

		@Test
		public void searchElementsInSeq_IsInSeq() {
			int[] seq = {1};
			SearchResult result = BinarySearch.search(1, seq);		
			assertThat(true, is(result.isFound()));
		}
		
		@Test
		public void searchElementsInSeq_IsntInSeq() {
			int[] seq = {1};
			SearchResult result = BinarySearch.search(5, seq);		
			assertThat(false, is(result.isFound()));
		}
		
		@Test
		public void searchManyElementsInSeq_FirstInSeq() {
			int[] seq = {2,3,5};
			SearchResult result = BinarySearch.search(2, seq);		
			assertThat(true, is(result.isFound()));		
		}
		
		@Test
		public void searchManyElementsInSeq_LastInSeq() {
			int[] seq = {2,3,5};
			SearchResult result = BinarySearch.search(5, seq);		
			assertThat(true, is(result.isFound()));		
		}
	
		@Test
		public void searchManyElementsInSeq_MiddleInSeq() {
			int[] seq = {2,3,5};
			SearchResult result = BinarySearch.search(3, seq);		
			assertThat(true, is(result.isFound()));			
		}
		
		@Test
		public void searchManyElementsInSeq_nNotInSeq() {
			int[] seq = {2,3,5};
			SearchResult result = BinarySearch.search(4, seq);		
			assertThat(false, is(result.isFound()));			
		}
		
		@Test(expected = IllegalArgumentException.class)
		public void searchNoElemntsInSeq_shouldThrowExeption() {
			int[] seq = {};
			SearchResult result = BinarySearch.search(4, seq);		
			assertThat(false, is(result.isFound()));			
		}
		
		@Test
		public void searchManyElementsInSeqTheSame_shouldFoundInSeq() {
			int[] seq = {2,2,2};
			SearchResult result = BinarySearch.search(2, seq);		
			assertThat(true, is(result.isFound()));			
		}
		
		@Test
		public void searchManyElementsInSeqWithMinusElemnts_shouldFoundInSeq() {
			int[] seq = {-2,-1,2};
			SearchResult result = BinarySearch.search(-2, seq);		
			assertThat(true, is(result.isFound()));			
		}
		
		@Test(expected = IllegalArgumentException.class)
		public void searchManyUnsortedElements_shouldThrowExeption() {
			int[] seq = {3,2,5};
			SearchResult result = BinarySearch.search(2, seq);		
			assertThat(true, is(result.isFound()));			
		}

}
