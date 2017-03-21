# def order(m,n,k):
# 	count=0
# 	answer=1
# 	if m>n:
# 		m=m+n
# 		n=m-n
# 		m=m-n
# 	while 1:
# 		for i in range(1,m+1):
# 			if answer % i ==0 and answer / i < n+1:
# 				count+=1
# 				# print str(count)+'count'+str (i)+'\t'+str(answer)
# 				if count == k:
# 					return answer
# 		answer+=1
def Cal(x,m,n):
	sum=0
	for i in range(1,n+1):
		if m<x/i:
			sum+=m
		else:
			sum+=x/i
	return sum
def binarySearch(left,right,kth,m,n ):
	while(left<=right):
		mid=(left+right)/2
		if Cal(mid,m,n)<kth:
			left=mid+1
		else:
			right=mid-1
	return left
string = raw_input('')
# string = "2115 384 385536"
num = string.split(' ')
m = long(num[0])
n = long(num[1])
k = long(num[2])

print binarySearch(1,m*n,k,m,n)