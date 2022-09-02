import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

public class Main {
    public static void main(String[] args) throws IOException {

        USB cardReader = new CardReader(new MemoryCard());
        cardReader.connectWithUsbCable();

    }
    }
