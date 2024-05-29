# // Write a python script to generate Fibonacci terms using generator function
def fibonacci():
    f,s=0,1
    while True:
        yield f
        t=f+s
        f=s
        s=t
ob=fibonacci()
n=int(input("enter limit"))
for i in range(0,n):
    print(next(ob))
