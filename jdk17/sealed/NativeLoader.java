import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.io.*;


public final class NativeLoader {

	public static void load(String name) {
		try (InputStream soFile = NativeLoader.class.getClassLoader().getResourceAsStream(name)) {
			File temp = File.createTempFile(name + "-", name);
                	temp.deleteOnExit();

                	try (OutputStream outputStream = new FileOutputStream(temp)) {
                		// md_5 uses this nice function called ByteStreams#copy(), seen below, from Google Commons.
                    		copy(soFile, outputStream);
                	} catch (Exception e) {
                		System.out.println("Could not copy file to output stream! Reason: " + e.getMessage());
                	}

                	System.load(temp.getPath());
		} catch (Exception e) {
			System.out.println("Could not get resource!" + e.getMessage());
		}
	}

	public static long copy(InputStream from, OutputStream to) throws IOException {
    		byte[] buf = new byte[0x1000];
    		long total = 0;
    		while (true) {
         		int r = from.read(buf);
         		if (r == -1) break;
         		to.write(buf, 0, r);
         		total += r;
       		}
       		return total;
    	}

}
