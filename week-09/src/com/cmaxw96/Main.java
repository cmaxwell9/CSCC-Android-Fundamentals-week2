package com.cmaxw96;

/**
 * Created by Clint on 4/2/2016.
 */
class File {
    private String location;

    File(String location) {
        this.location = location;
    }

    byte[] read() {
        int fileLength = 10; // replaced by code to determine file size
        byte[] content = new byte[fileLength];
        System.out.println("Reading data from " + location);
        // code to open and read the file into the byte array
        // code to close the file
        return content;
    }
}

interface Displayable {
    void display();
}

interface Playable {
    void play();
}

interface Shareable {
    void postOnFacebook(String message);
    void tweet(String message);
    void email(String message, String destinationAddress);
}

class Picture extends File implements Displayable, Shareable {
    Picture(String location) {
        super(location);
    }

    @Override
    public void display() {
        //code to display the picture on screen
        System.out.println("Displaying a picture.");
    }

    @Override
    public void postOnFacebook(String message) {
        // code to post a picture on Facebook
        System.out.println("Posting a picture to Facebook.");
    }

    @Override
    public void tweet(String message) {
        //code to post a picture on Twitter
        System.out.println("Tweeting a picture.");
    }

    @Override
    public void email(String message, String destinationAddress) {
        //code to email a picture
        System.out.println("Sending an email with a picture to " + destinationAddress + ".");
    }
}

class Song extends File implements Playable, Shareable {
    Song(String location) {
        super(location);
    }

    @Override
    public void play() {
        // code to play a song
        System.out.println("Playing a song.");
    }

    @Override
    public void postOnFacebook(String message) {
        // code to post a song on Facebook
        System.out.println("Posting a song to Facebook.");
    }

    @Override
    public void tweet(String message) {
        //code to post a song on Twitter
        System.out.println("Tweeting a song.");
    }

    @Override
    public void email(String message, String destinationAddress) {
        //code to email a song
        System.out.println("Sending an email with a song to " + destinationAddress + ".");
    }
}

class Video extends File implements Playable, Shareable {
    Video(String location) {
        super(location);
    }

    @Override
    public void play() {
        // code to play a video
        System.out.println("Playing a video.");
    }

    @Override
    public void postOnFacebook(String message) {
        // code to post a video on Facebook
        System.out.println("Posting a video to Facebook.");
    }

    @Override
    public void tweet(String message) {
        //code to post a video on Twitter
        System.out.println("Tweeting a video.");
    }

    @Override
    public void email(String message, String destinationAddress) {
        //code to email a video
        System.out.println("Sending an email with a video to " + destinationAddress + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        Song coolSong = new Song("song.mp3");
        Picture favoritePicture = new Picture("image.jpg");

        coolSong.play();
        coolSong.email("Check out this cool song", "aneuman1@cscc.edu");

        favoritePicture.display();
    }
}
