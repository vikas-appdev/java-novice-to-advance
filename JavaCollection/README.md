## JavaCollection

### Collection Types

- List
- Set
- Map
- Queue

> How it actually works behind the scene is depends on implementation

List : Defines the contract/behaviour

ArrayList : An implementation of the List contract

LinkedList : Another implementation of the List contract

#### Important types

- List
    - ArrayList
    - LinkedList
- Set
    - HashSet
    - LinkedHashSet
    - TreeSet
- Map
    - HashMap
    - TreeMap
- Queue
    - PriorityQueue

##### ArrayList
> Replacement for arrays

```java
package com.gradlic.java.list;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        for(int i=0; i<20; i++){
            names.add("names "+i);
        }

        for (int i=0; i<20; i++){
            System.out.println(names.get(i));
        }

        System.out.println(names.indexOf("names 4")); // In case of no match it will print -1

    }
}

```

###### The O-notation

- Linear Time O(n)
- Constant Time O(1)
- Logarithmic Time O(log n)
- Quadratic Time O(N^2)


###### How Iterator Work (Iterator pattern)


