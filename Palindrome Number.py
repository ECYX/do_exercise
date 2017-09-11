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

x = 12321
def isPalindrome(x):
	if x < 0:
		return False
	for i in range(len(str(x))/2+1):
		if str(x)[i] != str(x)[-1-i]:
			return False
	return True
print isPalindrome(x)
# print len(x)

# print sys.maxint