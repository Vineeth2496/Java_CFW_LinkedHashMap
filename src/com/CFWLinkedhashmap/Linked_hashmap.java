package com.CFWLinkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Linked_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap mo=new LinkedHashMap();
		System.out.println("Before LinkedHashMAp: ");
		mo.put("Billa", "Prabhas, Anushka");
		mo.put("Badri", "Pavan Kalyan, Ammesha patel, Renu Desia");
		mo.put("Orange", "Ram Charan, Genilia, Shazahn Padamsee");
		mo.put("Solo", "Nara Rohit, Nisha Agarwal");
		mo.put("Arjun Reddy", "Vijay Devarkonda, Shalini Pandey");
		mo.put("Pushpa", "Allu Arjun, Rashmika");
		System.out.println("Telugu Movies: "+mo);
		//	public boolean containsValue(java.lang.Object);
		//	To find the content of value is there or not in LinkedHashMap 
		System.out.println("Billa Movie Actor's Prabhas & Anushka: "+mo.containsValue("Prabhas, Anushka"));
		//	public V get(java.lang.Object);
		//	To get the values using get(key) method.
		System.out.println("Actors in Orange Movie: "+mo.get("Orange"));
		//  public V getOrDefault(java.lang.Object, V);
		//	By Default it give the values of First Priority order otherwise it will insert. 
		System.out.println("Lead Actress in Billa: "+mo.getOrDefault("Billa", "Prabhas, Namitha"));
		//  public void clear();
		mo.clear();
		System.out.println("After clearing LinkedHashMap"+mo);
		//  protected boolean removeEldestEntry(java.util.Map$Entry<K, V>);
		//  public java.util.Set<K> keySet();
		//	To get the Key content using Set and keySet method.
		LinkedHashMap season=new LinkedHashMap();
		season.put("Spring", "Vasant Ritu, March and April");
		season.put("Summer", "Grishma Ritu, May and June");
		season.put("Mansoon", "Varsha Ritu, July and August");
		season.put("Autumn", "Sharad Ritu, September and October");
		season.put("Pre-winter", "Hemant Ritu, November and December");
		season.put("Winter", "Shishir or Shita Ritu, January and February");
		System.out.println("Season wise calender: "+season);
		Set key=season.keySet();
		System.out.println("Seasons: "+key);
		//  public java.util.Collection<V> values();
		//	To get Values of content then will use values() method.
		System.out.println("Duration of Ritulu: "+season.values());
		//  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
		//	Fetching purpose
		Set s=season.entrySet();
		System.out.println("After Set the HashMap"+s);
		System.out.println("\n"+"Fetching using Iterator method "+"\n");
		Iterator i=s.iterator();
		for(;i.hasNext();)
		{
			System.out.println("Seaon: "+i.next());
		}
		//  public void forEach(java.util.function.BiConsumer<? super K, ? super V>);
		//	
		System.out.println("\n"+"Fetching using ForEach method "+"\n");
		season.forEach((k, v) -> System.out.println("Season: "+ k + "Ritu and Months: "+v));
	}

}
/*
  transient java.util.LinkedHashMap$Entry<K, V> head;
  transient java.util.LinkedHashMap$Entry<K, V> tail;
  final boolean accessOrder;
  void reinitialize();
  java.util.HashMap$Node<K, V> newNode(int, K, V, java.util.HashMap$Node<K, V>);
  java.util.HashMap$Node<K, V> replacementNode(java.util.HashMap$Node<K, V>, java.util.HashMap$Node<K, V>);
  java.util.HashMap$TreeNode<K, V> newTreeNode(int, K, V, java.util.HashMap$Node<K, V>);
  java.util.HashMap$TreeNode<K, V> replacementTreeNode(java.util.HashMap$Node<K, V>, java.util.HashMap$Node<K, V>);
  void afterNodeRemoval(java.util.HashMap$Node<K, V>);
  void afterNodeInsertion(boolean);
  void afterNodeAccess(java.util.HashMap$Node<K, V>);
  void internalWriteEntries(java.io.ObjectOutputStream) throws java.io.IOException;
  public java.util.LinkedHashMap(int, float);
  public java.util.LinkedHashMap(int);
  public java.util.LinkedHashMap();
  public java.util.LinkedHashMap(java.util.Map<? extends K, ? extends V>);
  public java.util.LinkedHashMap(int, float, boolean);
  public boolean containsValue(java.lang.Object);
  public V get(java.lang.Object);
  public V getOrDefault(java.lang.Object, V);
  public void clear();
  protected boolean removeEldestEntry(java.util.Map$Entry<K, V>);
  public java.util.Set<K> keySet();
  final <T> T[] keysToArray(T[]);
  final <T> T[] valuesToArray(T[]);
  public java.util.Collection<V> values();
  public java.util.Set<java.util.Map$Entry<K, V>> entrySet();
  public void forEach(java.util.function.BiConsumer<? super K, ? super V>);
  public void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V>);
}

*/