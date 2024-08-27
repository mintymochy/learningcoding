import pygame

tileSize = 50
numRows = 8
numCols = numRows
boardWidth = numCols * tileSize
boardHeight = numRows * tileSize
surface = pygame.display.set_mode((boardWidth, boardHeight))
pygame.init()


running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
