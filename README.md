# Guess the Number Game

A simple console-based Java game where the player tries to guess a randomly generated number within a specified range.

## Table of Contents
    - [Introduction](#introduction)
    - [How to Play](#how-to-play)
    - [Project Structure](#project-structure)

## Introduction
    This Java program implements a basic "Guess the Number" game. The game generates a random number within a specified range, and the player has a limited number of chances to guess the correct number.

## How to Play
    1. Run the `DriverClass` to start the game.
    2. Choose to start the game.
    3. Enter the ending range for the numbers.
    4. Input your guesses, and the game will provide feedback on whether your guess is correct, too high, or too low.
    5. The game ends after a specified number of attempts.

## Project Structure
    - **DriverClass**: The main class to initiate the game.
    - **StartGameView**: Manages the user interface for the game.
    - **StartGameViewModel**: Acts as an intermediary between the view and data.
    - **Repository**: Represents the data layer and generates a random number.


