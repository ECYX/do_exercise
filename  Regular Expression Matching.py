def convert(s, numRows):
	temp = ['' for row in range(numRows)]
	row = 0
	col = 0
	flag = 1
	result = ''
	if numRows == 1 or len(s) < numRows:
		return s
	else:
		for i_s in range(len(s)):
			if flag == 1:
				temp[row] += str(s[i_s])
				row += 1
			elif flag == -1:
				temp[row] += str(s[i_s])
				row -= 1
			if row == numRows:
				row = numRows-2
				col += 1
				flag = -1
			if row == 0:
				# col -= 1
				flag = 1
		for i in range(len(temp)):
			if temp[i]:
				result += str(temp[i])
		return result 
print convert("ruzqkysmwrecsalhvaqsvnlynygybinufpnpnfejyinskybgzrywelutkctnkjhryujnbpwbxl",49)