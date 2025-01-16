```groovy
def calculateAverage(List<Integer> numbers) {
    if (numbers.isEmpty()) {
        return 0 // Handle empty list
    }
    return numbers.sum() / numbers.size() 
}

println calculateAverage([1, 2, 3, 4, 5]) // Output: 3
println calculateAverage([]) // Output: 0
println calculateAverage([10, 20, 30]) // Output: 20
```