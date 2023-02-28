package com.designPatterns.BehavioralPatterns.Memento;

public class FileWriterUtil {
    private String filename;
    private StringBuilder content;

    public FileWriterUtil(String filename) {
        this.filename = filename;
        content = new StringBuilder();
    }

    public void write(String text) {
        this.content.append(text);
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public Memento createMemento() {
        return new Memento(filename, content);
    }

    public void loadMemento(Object m) {
        Memento memento = (Memento) m;
        this.filename = memento.filename;
        this.content = new StringBuilder(memento.content);
    }

    // The memento inner class
    private class Memento{
        private static int fileIds = 0;
        private int fileId;
        private String filename;
        private StringBuilder content;

        Memento(String filename, StringBuilder content) {
            this.fileId = fileIds + 1;
            this.filename = filename;
            this.content = new StringBuilder(content);
        }

        public int getFileId() {
            return this.fileId;
        }
    }
}
