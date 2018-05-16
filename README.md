write a program that determines a shift sequence to traverse from an initial gear combination to a gear combination with the closest ratio. Each shift can only change one gear on either the front or rear.

For example, input
f_cogs = [38, 30]
r_cogs = [28, 23, 19, 16]
ratio = 1.6
initial combination = (F:38 R:28)

output:
1 - F:38 R:28 Ratio 1.357
2 - F:30 R:28 Ratio 1.071
3 - F:30 R:23 Ratio 1.304
4 - F:30 R:19 Ratio 1.579
