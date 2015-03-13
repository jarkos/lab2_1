package edu.iis.mto.bsearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

		@Test
		public void searchElementIsInSeq() {
			int[] seq = {1};
			SearchResult result = BinarySearch.search(1, seq);		
			assertTrue(result.isFound());
		}
		
		@Test
		public void searchElementIsntInSeq() {
			int[] seq = {1};
			SearchResult result = BinarySearch.search(5, seq);		
			assertFalse(result.isFound());
		}
		
		@Test
		public void search_manyElement_firstInSeq() {
			int[] seq = {2,3,5};
			SearchResult result = BinarySearch.search(2, seq);		
			assertTrue(result.isFound());			
		}
		
		@Test
		public void search_manyElement_lastInSeq() {
			int[] seq = {2,3,5};
			SearchResult result = BinarySearch.search(5, seq);		
			assertTrue(result.isFound());			
		}
	
		@Test
		public void search_manyElement_middleInSeq() {
			int[] seq = {2,3,5};
			SearchResult result = BinarySearch.search(3, seq);		
			assertTrue(result.isFound());			
		}
		
		@Test
		public void binarySearch_search_manyElement_notInSeq() {
			int[] seq = {2,3,5};
			SearchResult result = BinarySearch.search(4, seq);		
			assertFalse(result.isFound());			
		}

}
