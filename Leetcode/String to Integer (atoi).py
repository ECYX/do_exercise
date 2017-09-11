import sys
# def reverse(x):
# 	"""
# 	:type x: int
# 	:rtype: int
# 	"""
# 	result = 0
# 	negative = 1
# 	if x < 0:
# 		x = -x
# 		negative = -1
# 	if x > sys.maxint:
# 		return 0
# 	else:
# 		while x:
# 			temp = x%10
# 			x = x/10
# 			result = result*10+temp
# 		if result > 2147483647 or result*negative < -2147483648:
# 			return 0
# 		else:
# 			return result*negative

x = "-1111aasd"
def tran(str):
	if '- ' in str or '+ ' in str:
		return 0
	for i in range(len(str)):
		# print 1
		x = (str if(i==0) else str[:-i])
		try:
			if int(x) > 2147483647:
				return 2147483647
			elif int(x) < -2147483648:
				return -2147483648
			else:
				return int(x)
		except:
			continue
	return 0
print tran(x)
print len(x)

# print sys.maxint