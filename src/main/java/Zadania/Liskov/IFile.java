package Zadania.Liskov;

public interface IFile {
    byte[] read();
    void write(byte[] data);
}