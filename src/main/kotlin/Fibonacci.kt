fun fib(index: Int): Int {
    if (index < 2) return index
    return fib(index - 1) + fib(index - 2)
}