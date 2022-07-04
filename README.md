# DartGame
Dart Game project

This is a dart game project, written on Java. The number of the thrown darts will be given by the user (from the keyboard) and the simulation will randomly 
generate the target coordinates of the darts on the board (by generating a random number that is valid inside the board).
The program will display their coordinates, the region of target, and the end-game statistics of the number and percentage of dart hits for each region.
If the dart falls on a boundary between the regions, it will be considered as undecided region.

Dart’s target co-ordinate and region matching rules are as follows:
* If the randomly generated target coordinate is x = 0.2 and y = -0.5, the dart hits the region F (where x coordinate is positive and y coordinate is negative). 
* If the randomly generated target coordinate is x = -0.5 and y = 0.7, the dart hits the region C (where x coordinate is negative and y coordinate is positive). 
* If the randomly generated target coordinate is x = 0.4 and y = 0.3, the dart hits the region A (where x and y coordinates are both positive and x+y is smaller than 1).
* If the randomly generated target coordinate is x = 0.4 and y = 0.7, the dart hits the region B (where x and y coordinates are both positive and x+y is bigger than 1).
* If the randomly generated target coordinate is x = -0.5 and y = -0.4, the dart hits the region D (where x and y coordinates are both negative and x is smaller than y).
* If the randomly generated target coordinate is x = -0.4 and y = -0.5, the dart hits the region E (where x and y coordinates are both negative and x is bigger than y).
The line equation x+y = 1 is the line between region A and region B & the line equation x=y is the line between region D and region E.
