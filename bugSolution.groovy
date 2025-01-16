```groovy
def calculateAverage(List<Integer> numbers) {
    if (numbers.isEmpty()) {
        return 0.0 // Handle empty list
    }
    //Ensure floating point division 
    return numbers.sum().toDouble() / numbers.size() 
}

println calculateAverage([1, 2, 3, 4, 5]) // Output: 3.0
println calculateAverage([]) // Output: 0.0
println calculateAverage([10, 20, 30]) // Output: 20.0
```