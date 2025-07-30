import matplotlib
import matplotlib.pyplot as plt
matplotlib.use ('TkAgg')

def selection_sort(theSeq):
   n=len(theSeq)
   for i in range(n):
      min=n
      for j in range(i+1,n):
         if theSeq[j]<theSeq[min]:
            temp=theSeq[min]
            theSeq[min]=theSeq[j]
            theSeq[j]=temp
theSeq=[10,40,30,20,50,60,70]
print("Before Sorting",theSeq)
selection_sort(theSeq)
print("After Sorting",theSeq)

x=list(range(1,10,000))
plt.plot(x,[y*y for y in x])
plt.title("BoubbleSort-Time Complexity o(n\u00b2)")
plt.xlabel("Input")
plt.ylabel("Time")
plt.show()
