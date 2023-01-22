Finding time complexities of recurrence relations using Akra Bazzi thoerm.

There are two types of Recurrence relations:
1. Linear
2. Divide & Conquer 

Linear recurrence relation example (fibonacci):
![img_3.png](img_3.png)

Divide and conquer recurrence relation example (merge sort):
                 
    [T(n) = 2T(n/2) + (n-1)]
Here, 2T(n/2) is dividing into two sub-arrays and (n-1) is for merging.

The general form of divide and conquer recurrence relation is:
    ![img.png](img.png)

Now, we have Akra-Bazzi thoerm:

![img_1.png](img_1.png)

here, P is found by:

![img_2.png](img_2.png)