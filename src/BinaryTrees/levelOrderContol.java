package BinaryTrees;
//https://stackoverflow.com/questions/1894846/printing-bfs-binary-tree-in-level-order-with-specific-formatting
//
//To begin with, this question is not a dup of this one, but builds on it.
//
//Taking the tree in that question as an example,
//
//    1 
//   / \
//  2   3
// /   / \
//4   5   6
//How would you modify your program to print it so,
//
//1
//2 3
//4 5 6
//TEAMS
//What’s this?
//Free 30 Day Trial
//Printing BFS (Binary Tree) in Level Order with _specific formatting_
//Ask Question
//Asked 10 years, 4 months ago
//Active 1 year ago
//Viewed 50k times
//
//31
//
//
//18
//To begin with, this question is not a dup of this one, but builds on it.
//
//Taking the tree in that question as an example,
//
//    1 
//   / \
//  2   3
// /   / \
//4   5   6
//How would you modify your program to print it so,
//
//1
//2 3
//4 5 6
//rather than the general
//
//1 
//2 
//3 
//4 
//5 
//6
//I'm basically looking for intuitions on the most efficient way to do it - I've got a method involving appending the result to a list, and then looping through it. A more efficient way might be to store the last element in each level as it is popped, and print out a new line afterward.
//
//Ideas?
//
//python algorithm binary-tree breadth-first-search
//shareimprove this questionfollow
//edited May 23 '17 at 12:18
//
//Community♦
//111 silver badge
//asked Dec 12 '09 at 22:04
//
//viksit
//6,35788 gold badges3838 silver badges5151 bronze badges
//depend whether you did too much or to little. too much, remove the / and \ of too little, use arrayindex to know depth – Niklas Dec 12 '09 at 22:37
//BTW, why was this question down voted? – viksit Dec 12 '09 at 22:47
//@larsOn Ok, I understand the "remove every second line" comment now. But the first block is only an intuitive representation of the tree as it exists in memory. The third block shows what viksit already knows an algorithm for, and the second block what he would like to obtain instead. – Pascal Cuoq Dec 12 '09 at 23:12
//This was a interview question to me – Mustafa Nov 11 '11 at 21:51
//add a comment
//14 Answers
//Active
//Oldest
//Votes
//
//68
//class Node(object):
//  def __init__(self, value, left=None, right=None):
//    self.value = value
//    self.left = left
//    self.right = right
//
//def traverse(rootnode):
//  thislevel = [rootnode]
//  while thislevel:
//    nextlevel = list()
//    for n in thislevel:
//      print n.value,
//      if n.left: nextlevel.append(n.left)
//      if n.right: nextlevel.append(n.right)
//    print
//    thislevel = nextlevel
//
//t = Node(1, Node(2, Node(4, Node(7))), Node(3, Node(5), Node(6)))
//
//traverse(t)
//Edit: if you're keen to get a small saving in maximum consumed "auxiliary" memory (never having simultaneously all this level and the next level in such "auxiliary" memory), you can of course use collection.deque instead of list, and consume the current level as you go (via popleft) instead of simply looping. The idea of creating one level at a time (as you consume --or iterate on-- the previous one) remains intact -- when you do need to distinguish levels, it's just more direct than using a single big deque plus auxiliary information (such as depth, or number of nodes remaining in a given level).
//
//However, a list that is only appended to (and looped on, rather than "consumed") is quite a bit more efficient than a deque (and if you're after C++ solutions, quite similarly, a std::vector using just push_back for building it, and a loop for then using it, is more efficient than a std::deque). Since all the producing happens first, then all the iteration (or consuming), an interesting alternative if memory is tightly constrained might be to use a list anyway to represent each level, then .reverse it before you start consuming it (with .pop calls) -- I don't have large trees around to check by measurement, but I suspect that this approach would still be faster (and actually less memory-consuming) than deque (assuming that the underlying implementation of list [[or std::vector]] actually does recycle memory after a few calls to pop [[or pop_back]] -- and with the same assumption for deque, of course;-).