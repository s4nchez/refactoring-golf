 Hole1 - Par 4:
  - replace == with equals
  - replace != with ! equals
  - invert if
  - remove redundant else
   
 Hole2 - Par 8:
  - modify constructor sig (Pair)
  - rename number to value
  - change field type (value)
  - rename string to currency
  - change field type (currency)
  - safe delete A
  - safe delete B
  - rename Pair to Money
 
 Hole3 - Par 9:
 - merge loops (MANUAL)
 - kill second loop (MANUAL)
 - extract variable (total)
 - extract plus method
 - move plus method to Money
 - inline total
 - rename next to other (plus)

 Hole4 - Par 8:
 - replace first.currency total.currency (so can extract minus) (MANUAL)
 - extract minus method (keep original sig)
 - move minus method to Money
 - rename tax to other
 - extract Money to big boy
 - make plus package
 - make minus package
 - replace constructor with factory money()

 Hole5 - Par 10:
 - extract TaxRate parameter object (from constructor)
 - create field taxRate
 - inline percent in calc
 - remove field percent (NOT SAFE DELETE!)
 - replace first.currency total.currency (so can extract minus) (MANUAL)
 - extract method apply
 - extract parameter taxRate
 - move apply method to TaxRate
 - replace constructor with factory

 Hole6 - Par 4:
 - replace loop with reduce (MANUAL)
 - inline getPercent() in TaxRate
 - static import in tests
 - replace public with package private