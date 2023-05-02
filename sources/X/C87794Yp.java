package X;

/* renamed from: X.4Yp  reason: invalid class name and case insensitive filesystem */
public class C87794Yp {
    public static final char[] A00 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String A00(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : bArr) {
            stringBuffer.append("(byte)0x");
            char[] cArr = A00;
            stringBuffer.append(cArr[(b2 >> 4) & 15]);
            stringBuffer.append(cArr[b2 & 15]);
            stringBuffer.append(", ");
        }
        return stringBuffer.toString();
    }
}
