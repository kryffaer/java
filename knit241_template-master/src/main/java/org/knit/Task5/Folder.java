package org.knit.Task5;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private final String name;
    private final List<FileSystemComponent> components;

    public Folder(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        long totalSize = 0;
        for (FileSystemComponent component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

    @Override
    public void add(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + getName());
        for (FileSystemComponent component : components) {
            component.display(indent + "  "); // Добавляем отступ для вложенных элементов
        }
    }
}
