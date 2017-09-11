s = raw_input()
n = int(s)
s = raw_input()
B = []
for i in range(n):
	B.append(int(s.split(' ')[i]))
left = 0 
right = 0 
a = []
b = []
flag = 0
for i in range(len(B)-1):
	if B[i]<B[i+1] and flag:
		continue
	elif B[i]>B[i+1] and 1-flag:
		continue 
	else:
		a.append(i)
		flag = 1-flag
max=0
if len(a)>1:
	for i in range(len(a)-2):
		if max < (a[i+2]-a[i]):
			max = a[i+2]-a[i]
			left = a[i]
			right = a[i+2]
		i+=1
if max>0:
	print str(left)+' '+str(right)
else:
	print ('-1 -1')