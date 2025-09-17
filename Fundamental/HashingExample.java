import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashingExample {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String text = "password123";
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(text.getBytes());
        StringBuilder sb = new StringBuilder();
        for(byte b : hashBytes) {
            sb.append(String.format("%02x", b));
        }
        System.out.println("SHA-256 hash: " + sb.toString());
    }
}
