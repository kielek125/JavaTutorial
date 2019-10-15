package Rozwiązania.Liskov;

public class ReadOnlyFile implements IReadable {
    @Override
    public byte[] read() {
        return new byte[0];
    }
}
