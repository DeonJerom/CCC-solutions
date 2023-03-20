question = int(input())

people = int(input())

dmoj = []
peg = []

temp = input().split(" ")

temp1 = input().split(" ")

for x in temp:
    dmoj.append(int(x))

for i in temp1:
    peg.append(int(i))

if question == 1:
    dmoj.sort()
    peg.sort()
else:
    dmoj.sort()
    peg.sort(reverse=True)

total = 0

for x in range(len(dmoj)):
    total += max(dmoj[x], peg[x])

print(total)
