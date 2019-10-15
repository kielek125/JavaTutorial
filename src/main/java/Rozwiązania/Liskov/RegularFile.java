package Rozwiązania.Liskov;

import Rozwiązania.Liskov.IReadWrite;

public class RegularFile  implements IReadWrite {
    @Override
    public void write(byte[] data) {

    }

    @Override
    public byte[] read() {
        return new byte[0];
    }
}
