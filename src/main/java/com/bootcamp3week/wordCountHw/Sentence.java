package com.bootcamp3week.wordCountHw;

import com.bootcamp3week.wordCountHw.Exception.NullSentenceException;

public class Sentence {

    private Integer countOfWords;


    public Integer CountWords(String givenString) {


    int i=0, j=0;
    int countOfWords=0;

        if(givenString == null) {
            throw new NullSentenceException("Sentence not entered!");
        }

    String[] splited = givenString.split("[;, ?.@!_|&%]");;
        for( i=0; i<splited.length; i++){

                for ( j = 0; j < i; j++){
                    if (splited[i].equalsIgnoreCase(splited[j])  ){
                        break;
                    }
                }
                if (i == j){
                    countOfWords++;
                }
        }
        System.out.println(countOfWords);

      return countOfWords;


    }
}
