b = [["", "", ""], ["", "", ""], ["", "", ""]]
turn = 0
gameStart = bool(0)

playerInput = input("Do you want to start a game? (y/n): ")
if playerInput == "y":
    playGame()
    gameStart == bool(1)
else:
    gameStart == bool(0)


def playGame():
    createBoard()
    printBoard()
    while checkWin() != bool(1):
        Drop()
        checkWin()
        Drop()
        checkWin()


def printBoard():
    print("    A   B   C  ")
    print("  +---+---+---+")
    for w in range(3):
        for h in range(0, 3, 3):
            print(f"{w + 1} | {b[w][h]} | {b[w][h + 1]} | {b[w][h + 2]} |")
    print("  +---+---+---+")
    print("")


def createBoard():
    for w in range(3):
        for h in range(0, 3, 3):
            b[w][h] = " "


def Drop():
    player = ""
    s1 = ""
    row = 0
    col = 0
    if turn == 0:
        player = "X"
    elif turn == 1:
        player = "O"
    uI = input("Where do you want to place your " + player + "?: ")
    if "A" in uI:
        col = 1
    elif "B" in uI:
        col = 2
    elif "C" in uI:
        col == 3

    if "1" in uI:
        row = 0
    elif "2" in uI:
        row = 1
    elif "3" in uI:
        row = 2
    b[row][col] = player
    if player == "X":
        turn = 1
    elif player == "O":
        turn = 0


def checkWin():
    win = input("Has anyone won yet? (y/n): ")
    if win == "y":
        win = bool(1)
        print("player wins!")
        return win
    elif win == "n":
        win = bool(0)
        print("next round!")
        return win
