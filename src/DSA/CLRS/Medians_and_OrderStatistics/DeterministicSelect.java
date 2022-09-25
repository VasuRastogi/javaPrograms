package DSA.CLRS.Medians_and_OrderStatistics;
// it has worst case linear time complexity i.e. O(n).
// The best algorithm to check for i'th order statistic or i'th smallest element.

// uses the concept of median of medians thus guaranteeing a good pivot selection.
// a good pivot is that it dosen't gives a [0:n-1] partition of array.
// so, here out goal is to find a pivot that is guaranteed to be good.

//ALGO:
/*
select(L,k)
    {
    if (L has 10 or fewer elements)
    {
        sort L
        return the element in the kth position
    }

    partition L into subsets S[i] of five elements each
        (there will be n/5 subsets total).

    for (i = 1 to n/5) do
        x[i] = select(S[i],3)

    M = select({x[i]}, n/10)

    partition L into L1<M, L2=M, L3>M
    if (k <= length(L1))
        return select(L1,k)
    else if (k > length(L1)+length(L2))
        return select(L3,k-length(L1)-length(L2))
    else return M
    }
*/
public class DeterministicSelect {

}
