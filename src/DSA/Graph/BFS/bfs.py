# Implementation of BFS in python (Most simple) 
# Done by (c) Vasu Rastogi

from collections import deque

"""Actual Code"""


def bfs(G, s):
    # Make a queue q (active queue)
    # Make a queue visited (passive queue)
    q = []
    q.append(s)
    visited = []
    while q:
        u = q.pop()  # remember to add it into visited.
        visited.append(u)
        for i in G[u]:
            if (not i in visited) & (not i in q):
                q.append(i)
    return visited


graph = [
    [1, 2],       # vertex 0
    [0, 2, 3],    # vertex 1
    [0, 1, 4],    # vertex 2
    [1, 4, 5],    # vertex 3
    [2, 3, 6],    # vertex 4
    [3],          # vertex 5
    [4]           # vertex 6
]


print(bfs(graph, 0))
