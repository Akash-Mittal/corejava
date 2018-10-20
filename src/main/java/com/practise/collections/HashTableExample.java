package com.practise.collections;

import java.util.Hashtable;

import com.practise.domain.UserKey;

public class HashTableExample {
public static void main(String[] args) {
	Hashtable<String, Integer> hashtable = new Hashtable<>();
	System.out.println("Default hashtable size:"+hashtable.size());
	hashtable.put("zero",0);
	hashtable.put("two",2);
	System.out.println("After Init hashtable size:"+hashtable.size());
	System.out.println(hashtable. get("one"));
	System.err.println("--------------customKeyhashtable---------------");
	Float loadFactor = new Float(.10);
	Hashtable<UserKey, Integer> customKeyhashtable = new Hashtable<>(1,loadFactor);
	System.out.println("Default customKeyhashtable size:"+customKeyhashtable.size());
	UserKey userKey = new UserKey(10);
	UserKey userKey1 = new UserKey(110);
	customKeyhashtable.put(userKey,0);
	customKeyhashtable.put(userKey1,2);
	System.out.println("After Init customKeyhashtable size:"+customKeyhashtable.size());
	System.out.println(customKeyhashtable. get(userKey));
	
	// This function uses hascode
	System.out.println(customKeyhashtable.containsKey(userKey));
}
	
}
