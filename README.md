# Groovy Integer Division Bug

This repository demonstrates a common issue in Groovy related to integer division. When calculating averages using integer division (`/`), the result is truncated to an integer, potentially leading to inaccurate results.

## Bug Description
The provided Groovy code calculates the average of a list of integers. However, if the sum of the numbers is not perfectly divisible by the number of elements, the result will be truncated, discarding the fractional part.

## Solution
The solution involves converting at least one of the operands to a floating-point type (e.g., `double`) before the division to ensure a floating-point result is obtained.
