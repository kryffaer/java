package org.knit.Task5;

public class File implements FileSystemComponent {
    private final String name;
    private final long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    public long getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void add(FileSystemComponent component) {
    }

    public void remove(FileSystemComponent component) {
    }

    public void display(String indent) {
        System.out.println(indent + getName() + " (" + getSize() + " bytes)");
    }
}


