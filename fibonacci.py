x = int(input("Enter the no. of fibonacci number you want(greater then 1):- "))
if x<0: print("Invalid Input")
else:
    f = 0
    s = 1
    print(f)
    print(s)
    for j in range(x-2):
        t = f+s
        print(t)
        f = s
        s = t