package com.designPatterns.BehavioralPatterns.Memento;

public class FileCareTaker {
    private Object obj;

    public void saveFile(FileWriterUtil file) {
        obj = file.createMemento();
    }

    public void undoFile(FileWriterUtil file) {
        file.loadMemento(obj);
    }
}
