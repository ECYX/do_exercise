import sys
def reverse(x):
	"""
	:type x: int
	:rtype: int
	"""
	result = 0
	negative = 1
	if x < 0:
		x = -x
		negative = -1
	if x > sys.maxint:
		return 0
	else:
		while x:
			temp = x%10
			x = x/10
			result = result*10+temp
		if result > 2147483647 or result*negative < -2147483648:
			return 0
		else:
			return result*negative

x = 1234567899
print reverse(x)
print sys.maxint