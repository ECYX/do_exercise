def order(biao):
	for i in range(len(biao)):
		for j in range(len(biao)-i-1):
			if biao[j]>biao[j+1]:
				t=biao[j]
				biao[j]=biao[j+1]
				biao[j+1]=t
	return biao
string = raw_input('')	
num = string.split(' ')
m = int(num[0])
n = int(num[1])
k = int(num[2])
biao=[]
for x in range(m):
	for y in range(n):
		biao.append((x+1)*(y+1))
# print biao
order(biao)
print biao[k-1]