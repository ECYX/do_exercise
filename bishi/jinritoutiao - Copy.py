
s = raw_input()
n = int(s.split('\n')[0].split(' ')[0])
q = int(s.split('\n')[0].split(' ')[1])
s = raw_input()
A = []
for i in range(n):
	A.append(int(s.split(' ')[i]))
B = []
s = raw_input()
for i in range(n):
	B.append(int(s.split(' ')[i]))


for i in range(q):
	s = raw_input()
	x = int(s.split(' ')[0])
	y = int(s.split(' ')[1])
	count = 0 
	for j in range(len(A)):
		if A[j] >= x and B[j] >= y:
			count += 1
	print count 