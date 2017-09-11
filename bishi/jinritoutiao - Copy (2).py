
s = raw_input()
n = int(s.split(' ')[0])
m = int(s.split(' ')[1])
A = []
for i in range(n):
	s = raw_input()
	A.append(s)

for i in range(m):
	s = raw_input()
	word = s.lower().split(' ')

	maxnum=0
	flag=0
	for k in range(n):
		count=0
		for j in range(len(word)):
			if word[j] in A[k].lower():
				count+=1
		if maxnum < count:
			maxnum = count
			flag=k
	print A[flag]