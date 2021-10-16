# Using default function  
def compound_rate(PV, CRate, tp):  
    # Using CI formula  
    TotalAmount = PV * (pow ((1 + CRate / 100), tp))  
    # Calculating CI  
    CInterest = TotalAmount - PV  
    # Printing CI as result in output  
    print("Total return value after completion of given time period: ", TotalAmount)  
    print("Compound interest gained on given amount is", CInterest)  
  
# Taking principal amount value from the user  
PV = float(input("Enter the principal amount: "))  
CRate = float(input("Enter the rate for compound interest: ")) # taking interest rate value  
tp = float(input("Enter the time period for which principal is invested: ")) # taking time period value  
  
# Calling out CI function  
compound_rate(PV, CRate, tp)  
