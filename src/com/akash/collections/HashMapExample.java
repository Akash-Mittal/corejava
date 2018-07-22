package com.akash.collections;

import java.util.HashMap;

import com.akash.domain.UserKey;

public class HashMapExample {
public static void main(String[] args) {
	HashMap<String, Integer> hashMap = new HashMap<>();
	System.out.println("Default hashMap size:"+hashMap.size());
	hashMap.put(null,0);
	hashMap.put("",2);
	System.out.println("After Init hashMap size:"+hashMap.size());
	System.out.println(hashMap. get(null));
	System.err.println("--------------customKeyhashMap---------------");
	Float loadFactor = new Float(.10);
	HashMap<UserKey, Integer> customKeyhashMap = new HashMap<>(1,loadFactor);
	System.out.println("Default customKeyhashMap size:"+customKeyhashMap.size());
	UserKey userKey = new UserKey(10);
	UserKey userKey1 = new UserKey(110);
	customKeyhashMap.put(userKey,0);
	customKeyhashMap.put(userKey1,2);
	System.out.println("After Init customKeyhashMap size:"+customKeyhashMap.size());
	System.out.println(customKeyhashMap. get(userKey));
	
	// This function uses hascode
	System.out.println(customKeyhashMap.containsKey(userKey));
}
	
}
