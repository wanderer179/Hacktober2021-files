def gcd(x, y):
	while(y):
		x, y = y, x % y

	return x
	
	
l = list(map(int,input("Enter the numbers:- ").split()))
num1=l[0]
num2=l[1]
g=gcd(num1,num2)

for i in range(2,len(l)):
	g=gcd(g,l[i])
	
print("Ans:- ",g)
