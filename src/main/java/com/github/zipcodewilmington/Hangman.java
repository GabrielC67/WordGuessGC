package com.github.zipcodewilmington;


import com.github.zipcodewilmington.sample.Wordguess;

import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
        //Gabriel Cruz

       // choose a random word from a list

        /* while (you want to play) { //outer loop
            start the game
            set word guessed to false
            while (the word isn't guessed) { //inner loop
            print the current game state
            ask for a guess (a single letter)

            check the letter against the word

            The printArray(char[] a) method just print out the characters array a with a space between each letter.
            You'll need a for loop to print each character and a space right after.
            using the two character arrays discussed above
            increment the number of guesses

            if the word is guessed
            player won, congrats

            if too many guesses
            player lost, too bad, quit game
        }*/
        /*ask if player wants to play again
    }
    display game over */
        }

        public Wordguess() {}
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            Wordguess game = new Wordguess();
            game.runGame();

            // instance variables go here

            // set up a list (array) of strings of words players could guess

            announce_game() prints a welcome
            game_over() prints "game over"
            initialize_game_state() sets up char[] for secret word and guesses
            get_next_guess() returns a char from player input
            is_word_guessed() returns boolean
            ask_to_play_again() returns boolean
            print_current_state() uses printArray to show player where they are at
            process() loops thru the word array, looking for the inputed guess, and replaces the "_" with the guesses char if found
            player_won() prints happy message
            player_lost() print sad message
        }*/






    }
/*Some hints
 + all output or input must be in specialized methods, not in runGame()
 + you should use instance variables to sync all the game state
 +use "this." to call all your methods in class Wordguess
+ You need to use the Scanner class to get the player's guess
+ You need to use the Random class to get a random int to choose the secret word
when a method name like "player_won()" is used you need to translate it in to "camelCase" so it would appear as
"playerWon()" in your code.
 */
