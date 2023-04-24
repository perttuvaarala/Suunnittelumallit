import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class HardDrive {
	
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	DataOutputStream dos = new DataOutputStream(baos);
	
	public byte[] read(long lba, int size) {
		try {
			dos.writeLong(lba * size);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return baos.toByteArray();
	}
}
