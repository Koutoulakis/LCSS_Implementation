This is an implementation of the algorithm called
Longest Common Subsequence (LCSS) 
https://en.wikipedia.org/wiki/Longest_common_subsequence_problem
In this sample code, we have as input some taxi routes in china, and
we calculate the LCSS in all of them (two routes every time).
After that, we take the shortest taxi route, and apply the LCSS algorithm
between every sub-route of the longest taxi route and the short route to find
the overall optimal LCSS.
Also, graphic user interface has been implemented.

Note: the format of the routes is given in longitude and latitude for every 
minute of driving.