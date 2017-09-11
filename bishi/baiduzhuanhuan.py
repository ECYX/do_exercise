import re
def convert(x):
	

string = raw_input('')
# string = "2115 384 385536"
num = string.split(' ')
m = int(num[0])
x=[]
y=[]
for i in range(1,m):
	x.append(num[i])
for i in range(len(x)):
	print convert(x[i])