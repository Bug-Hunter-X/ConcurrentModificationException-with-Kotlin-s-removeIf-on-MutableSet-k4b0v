fun main() {
    val set = mutableSetOf(1, 2, 3, 4, 5)

    // Solution 1: Using an iterator
    val iterator = set.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() > 2) {
            iterator.remove()
        }
    }
    println(set) // Output: [1, 2]

    // Solution 2: Creating a copy
    val set2 = mutableSetOf(1, 2, 3, 4, 5)
    val filteredSet = set2.filter { it <= 2 }.toMutableSet()
    println(filteredSet) // Output: [1, 2]
    
    //Solution 3: Using toMutableList and toSet
    val set3 = mutableSetOf(1,2,3,4,5)
    val filteredSet3 = set3.toMutableList().filter { it <=2 }.toMutableSet()
    println(filteredSet3) //Output: [1,2]
}