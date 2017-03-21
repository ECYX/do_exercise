def order(m,n,k):
	count=0
	answer=1
	while 1:
		for i in range(1,m+1):
			if answer % i ==0 and answer / i < n+1:
				count+=1
				# print str(count)+'count'+str (i)+'\t'+str(answer)
				if count == k:
					return answer
		answer+=1
string = raw_input('')
# string = "2 3 4"
num = string.split(' ')
m = int(num[0])
n = int(num[1])
k = int(num[2])

print order(m, n, k)