package com.bootcamp3week.wordCountHw;

import com.bootcamp3week.wordCountHw.Exception.NullSentenceException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WordCountTests {

    @Test
    public void canBeCountedUniqueWord_WhenGetTheSpaceCharacter(){

        //Arrange
        Sentence sut = new Sentence();
        String str = "The stage lights are shining in her eyes";

        //Act
        Integer result = sut.CountWords(str);

        //Assert
        assertEquals(result,8);

    }
    @Test
    void WhenSentenceNotEntered_ShouldThrowNullSentenceException() {
        //Arrange
        Sentence sut = new Sentence();

        //Act
        Exception exception = assertThrows(NullSentenceException.class, () -> sut.CountWords(null));

        //Assert
        assertEquals("Sentence not entered!", exception.getMessage());
    }

    @Test
    public void canBeCountedWord_WhenWordHasApostrophes(){

        //Arrange
        Sentence sut = new Sentence();
        String str = "Bugun Seyma'yla birlikte alisverise gittik ";

        //Act
        Integer result = sut.CountWords(str);

        //Assert
        assertEquals(result,5);

    }

    @Test
    public void canIgnorePunctuation(){

        //Arrange
        Sentence sut = new Sentence();
        String str = "Did you enjoy your day ?";

        //Act
        Integer result = sut.CountWords(str);

        //Assert
        assertEquals(result,5);

    }
    @Test
    public void canBeCountedWord_WhenStringHasDifferentCapitalization(){
        // Arrange
        Sentence sut = new Sentence();

        // Act
        String str = "She is closing her Eyes and concentrating on the Music.";
        int result = sut.CountWords(str);

        // Assert
        assertEquals(result,10);
    }
    @Test
    public void shouldReturnNumberOfUniqueWords_WhenStringHasRepetitions(){
        // Arrange
        Sentence sut = new Sentence();

        // Act
        String str = "It was a sunny And fun and enjoyable day for me";
        int result = sut.CountWords(str);

        // Assert
        assertEquals(result,10);
    }

}

