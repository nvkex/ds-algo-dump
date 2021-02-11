# Problem Link:
# https://leetcode.com/problems/3sum/
#
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ans = set()
        n,p,z = [],[],[]
        for i in nums:
            if i<0:
                n.append(i)
            elif i>0:
                p.append(i)
            else:
                z.append(i)
        N,P = set(n), set(p)
        
        # if there are zeros
        if z:
            for i in P:
                if -i in N:
                    ans.add((-i,0,i))
        
        # if three zeros
        if len(z) >= 3:
            ans.add((0,0,0))
            
        # If theres a compliment of two numbers from N in P
        for i in range(len(n)):
            for j in range(i+1, len(n)):
                s = n[i]+n[j]
                if -s in P:
                    ans.add(tuple(sorted([n[i], n[j], -s])))
                    
        # If theres a compliment of two numbers from P in N
        for i in range(len(p)):
            for j in range(i+1, len(p)):
                s = p[i]+p[j]
                if -s in N:
                    ans.add(tuple(sorted([p[i], p[j], -s])))
        return ans
                    
                