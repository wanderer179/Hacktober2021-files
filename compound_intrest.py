p = int(input("Enter the Principle amount:- "))
r = float(input("Enter the rate of Intrest:- "))
t = float(input("Enter the time period:- "))

ans = p*((1+(r/100))**(t))
print("\n Your Compound Intrest is:- ")
print(ans-p,'\n')