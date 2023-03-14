# Walk-through

## Hole 1 - Par 7

Goals:
- Convert to Kotlin
- Clean-up ifs

Steps:
- Replace '!=' with '!equals()' (+fix all problems in file) - 1
- Convert Java file to Kotlin file (breaks compilation!) - 1
- (MANUAL) Remove question marks (fix compilation error) - 2
- Remove explicit types arguments - 1 
- Replace with 'listOf' function - 1
- Invert 'if' condition in return clause - 1
- Organise imports - 0

## Hole 2 - Par 6

Goals:
- Remove generics
- Turn Pair into Money

Steps:
- add explicit type args to the Pair on line 16 -1 
- Change signature of Pair (change var name + type + make public) - 1
- Safe delete A - 1
- Safe delete B - 1
- Rename Pair to Money - 1


## Hole 3 - Par 13

Goals:
- Introduce 'plus' method in Money

Steps:
- (MANUAL) Merge two loops - 2
- Introduce variable 'plusResult' for the Money created inside loop - 1
- Extract 'plus' function (make public) - 1
- Inline return variable in 'plus' function - 1
- Inline 'plus' usage inside loop - 1
- Convert 'total' parameter to receiver - 1
- (MANUAL) add brackets to Money - 2 
- (MANUAL) Copy plus to Money to shadow extension function - 2
- Remove redundant receiver parameter - 1
- Safe delete 'plus' extension function - 1


## Hole 4 - Par 16

Goals:
- Introduce 'minus' method in Money
- Make 'plus' look similar to it
- Move Money to its own file

Steps:
- (MANUAL) Replace first.currency total.currency (so can extract minus) - 2
- Extract 'minus' method (visibility + param name) - 1
- Convert 'total' parameter to receiver - 1
- (MANUAL) Copy minus to Money to shadow extension function (MANUAL) - 2
- Remove redundant receiver parameter - 1
- Safe delete extension function - 1
- (MANUAL) Add 'else' before return to plus - 2
- Lift return out of 'if' - 1
- Remove all braces from 'if' - 1
- Convert plus to expression body - 1
- Remove explicit return type - 1
- Format - 0
- Remove all braces from 'if' in minus - 1
- Move Money to its own file - 1


## Hole 5 - Par 12

Goals:
- Introduce TaxRate with an 'apply' method

Steps:
- (MANUAL) create TaxRate class with percent val (with brackets) - 2
- (MANUAL) change tax Money to use currency from total - 2
- Change TakeHomeCalculator constructor signature and add taxRate val with default parameter - 1
- Extract `apply(total: Money)` function (make internal) - 1
- Inline `tax` return - 1
- (MANUAL) use `apply` from `TaxRate` in `TakeHomeCalculator` - 2 
- Safe delete `apply` - 1
- Safe delete `percent` - 1
- Make `taxRate` private - 1


## Hole 6 - Par 4

Goals:
- replace loop with reduce

Steps:
- (MANUAL) replace total with `pairs.fold(first, Money::plus)` - 2
- Change `var` to `val` - 1
- Inline `pairs` - 1


## Total: 58
