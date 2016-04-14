package com.cmaxw123;

/**
 * Created by Clint on 4/14/2016.
 */
import java.util.ArrayList;
import java.util.List;

class StackFullException extends Exception {}

class StackEmptyException extends Exception {}


interface Video {
    void display();
}

interface Audio {
    void playAudio();
}

class Movie implements Video, Audio {
    private String location;

    Movie(String location) {
        this.location = location;
    }

    public void display() {
        System.out.println("Displaying video from " + location);
    }

    public void playAudio() {
        System.out.println("Playing audio from " + location);
    }
}



class Stack<E extends Video & Audio > {
    private List<E> elements = new ArrayList<>();
    private int index = 0;
    private int size;

    Stack(int size) {
        this.size = size;
    }

    void push(E element ) throws StackFullException {
        if (index >= size) {
            throw new StackFullException();
        }

        elements.add(index, element); // increment first, then use as array index
        index++;
    }

    E pop () throws StackEmptyException {
        if (index == 0) {
            throw new StackEmptyException();
        }

        E returnElement = elements.get(index - 1);
        index--;
        return returnElement;
    }

    void playAllAudioAndVideo() {
        while (index > 0) {
            try {
                E element = pop();
                element.display();
                element.playAudio();
            } catch (StackEmptyException e) {
                // won't get here because of while condition
            }
        }
    }
}


public class Main {
    public static void main(String[] agrs) {
        Stack<Movie> movies = new Stack<>(2);
        try {
            movies.push(new Movie("C:\\AMovie.mp4"));
            movies.push(new Movie("C:\\AMovie2.mp4"));
        } catch (StackFullException e) {
            e.printStackTrace();
        }
        movies.playAllAudioAndVideo();


    }
}

