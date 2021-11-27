package image;

import lombok.Getter;

@Getter
public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        // display picture from file fileName
    }

    public void loadFromDisk() {
        // load from image from a disk
    }
}
