import numpy as np

word = "ready"
numOfCorrectLetters = 0
guesses = []


def guess(self):
    x = 0
    while x != 1:
        guess = input("what is your guess!: ")
        if len(guess) != 5:
            guess = input("that was too short/long! enter a 5 character guess!: ")
            
            break
    guesses.append(guess)
    checkGuess(guess)


def checkGuess(self, guess):
    for x in guess:
        if guess[x] == word[x]:
            numOfCorrectLetters += 1


def printBoard(self):
    print("--------")
    for x in guesses:
        print(f"| " + guesses[x] + " |")
        print("")
    print("--------")
