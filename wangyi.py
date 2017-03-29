

#coding = utf-8
import sys
def find_near_car(linex,liney):
	dis=abs(int(linex[0]))+abs(int(liney[0]))
	locx=int(linex[0])
	locy=int(liney[0])
	result=[]
	for i in range (1,len(linex)):
		temp=abs(int(linex[i]))+abs(int(liney[i]))
		if temp<dis:
			dis=temp
			locx=int(linex[i])
			locy=int(liney[i])

	result.append(locx)
	result.append(locy)
	return result
def cac_dis(carloc,lineaim,linecost):
	ans=0
	ans+=(abs(int(carloc[0]))+abs(int(carloc[1])))*int(linecost[0])
	ans+=(abs(int(lineaim[0])-int(carloc[0]))+abs(int(lineaim[1])-int(carloc[1])))*int(linecost[1])
	return ans


if __name__ == "__main__":
    n = int(sys.stdin.readline().strip())
    linex = sys.stdin.readline().split(' ')
    liney = sys.stdin.readline().split(' ')
    lineaim=sys.stdin.readline().split(' ')
    linecost=sys.stdin.readline().split(' ')
    print len(linex)
    print len(liney)
    print len(lineaim)
    print len(linecost)
    carloc=find_near_car(linex,liney)
    ans1=0

    ans1 = cac_dis(carloc,lineaim,linecost)

    print ans1