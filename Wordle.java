import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Wordle {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        Wordle wordle = new Wordle ( );

        System.out.println ( "\u001B[45mWelcome to the Wordle Game\u001B[0m" );
        System.out.println ( "\u001B[36m********************************************************************************************************\u001B[0m" );
        System.out.println ( "\u001B[41mRules :\u001B[0m" );
        System.out.println ( "\u001B[44mEach guess must be a valid five-letter word.\u001B[0m" );
        System.out.println ( "\u001B[46mThe color of a tile will change to show you how close your guess was.\u001B[0m" );
        System.out.println ( "\u001B[42mIf the tile turns green, the letter is in the word, and it is in the correct spot.\u001B[0m" );
        System.out.println ( "\u001B[43mIf the tile turns yellow, the letter is in the word, but it is not in the correct spot.\u001B[0m" );
        System.out.println ( "\u001B[100mIf the tile turns gray, the letter is not in the word.\u001B[0m" );
        System.out.println ( "\u001B[36m********************************************************************************************************\u001B[0m" );
        System.out.println ( "\u001B[42mSelect difficulty:\u001B[0m" );
        System.out.println ( "\u001B[41mEasy - 1\u001B[0m" );
        System.out.println ( "\u001B[41mMed- 2\u001B[0m" );
        System.out.println ( "\u001B[41mHard - 3\u001B[0m" );
        System.out.print ( "\u001B[40mEnter the difficulty to start playing:\u001B[0m " );

        int choice = scanner.nextInt ( );
        scanner.nextLine ( );

        switch (choice) {
            case 1:
                System.out.println ( "You've selected Easy difficulty." );
                break;
            case 2:
                System.out.println ( "You've selected Medium difficulty." );
                break;
            case 3:
                System.out.println ( "You've selected Hard difficulty." );
                break;
            default:
                System.out.println ( "Please enter a valid difficulty." );
                return;
        }

        System.out.println ( "Let's begin!" );
//        wordle.new GameBase ( ).playGame ( choice + 4 );
        GameBase obj = new GameBase ();
        obj.playGame (choice+4);
    }
}

    class GameBase {
        private final Scanner scanner = new Scanner ( System.in );
        private final Random random = new Random ( );

        private final String[] fiveLetterWords = {"petal", "serve", "blink", "trick", "hints", "words", "arrow", "alert"};
        private final String[] sixLetterWords = {"coding", "server", "public", "rocket", "flight", "forest", "fisher", "puzzle"};
        private final String[] sevenLetterWords = {"traffic", "package", "backend", "bravery", "weather", "product", "private", "western"};

        public void playGame ( int wordLength ) {
            String computerWord = getRandomWord ( wordLength );

            for (int attempts = 5; attempts > 0; attempts--) {
                System.out.print ( "Attempt " + (6 - attempts) + "/5 - Enter your guess (" + wordLength + " letters): " );
                String userGuess = scanner.nextLine ( ).toLowerCase ( Locale.ROOT );

                if (userGuess.equals ( computerWord )) {
                    System.out.println ( "\u001B[32m" + userGuess );
                    System.out.println ( "Congratulations! You've guessed the word!" );
                    return;
                } else {
                    System.out.println ( "Incorrect guess. Here's your feedback:" );
                    printFeedback ( computerWord, userGuess );
                    if (attempts > 1) {
                        System.out.println ( "Hint: The correct letters in their positions are " );
                        printHint ( computerWord, userGuess );
                    }
                    System.out.println ( "Try again!" );
                }
            }

            System.out.println ( "Sorry, you're out of attempts. The word was: " + computerWord );
        }

        private String getRandomWord ( int wordLength ) {
            String[] selectedArray = switch (wordLength) {
                case 5 -> fiveLetterWords;
                case 6 -> sixLetterWords;
                case 7 -> sevenLetterWords;
                default -> fiveLetterWords;
            };
            return selectedArray[random.nextInt ( selectedArray.length )];
        }

        private void printFeedback ( String computerWord, String userGuess ) {
            for (int i = 0; i < computerWord.length ( ); i++) {
                char c = userGuess.charAt ( i );
                if (c == computerWord.charAt ( i )) {
                    System.out.print ( "\u001B[42m" + c + "\u001B[0m" );
                } else if (computerWord.contains ( String.valueOf ( c ) )) {
                    System.out.print ( "\u001B[43m" + c + "\u001B[0m" );
                } else {
                    System.out.print ( "\u001B[100m" + c + "\u001B[0m" );
                }
            }
            System.out.println ( );
        }

        private void printHint ( String computerWord, String userGuess ) {
            for (int i = 0; i < computerWord.length ( ); i++) {
                if (computerWord.charAt ( i ) == userGuess.charAt ( i )) {
                    System.out.print ( computerWord.charAt ( i ) );
                } else {
                    System.out.print ( "-" );
                }
            }
            System.out.println ( );
        }
    }
