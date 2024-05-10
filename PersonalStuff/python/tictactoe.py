b = [["", "", ""], ["", "", ""], ["", "", ""]]
turn: int = 0

def printBoard():
    print("    A   B   C  ")
    print("  +---+---+---+")
    for w in range(3):
        for h in range(0, 3, 3):
            print(f"{w + 1} | {b[w][h]} | {b[w][h + 1]} | {b[w][h + 2]} |")
    print("  +---+---+---+")
    
def createBoard():
    for w in range(3):
        for h in range(0,3,3):
            b[w][h] = " "
def Drop():
	player = ' '
 	if turn == 0:
    	player = 'X'
 	elif turn == 1:
    	player = 'O'