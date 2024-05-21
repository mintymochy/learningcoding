import numpy as np

word = "ready"
numOfCorrectLetters = 0
guesses = []


def guess(self):
    guess = input("what is your guess!: ")
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
