package org.apache.commons.io;

import java.io.IOException;
import java.io.OutputStream;

public class HexDump {
    public static final String EOL = System.getProperty("line.separator");
    private static final char[] _hexcodes = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final int[] _shifts = {28, 24, 20, 16, 12, 8, 4, 0};

    private static StringBuilder dump(StringBuilder sb, byte b2) {
        for (int i2 = 0; i2 < 2; i2++) {
            sb.append(_hexcodes[(b2 >> _shifts[i2 + 6]) & 15]);
        }
        return sb;
    }

    private static StringBuilder dump(StringBuilder sb, long j2) {
        for (int i2 = 0; i2 < 8; i2++) {
            sb.append(_hexcodes[((int) (j2 >> _shifts[i2])) & 15]);
        }
        return sb;
    }

    public static void dump(byte[] bArr, long j2, OutputStream outputStream, int i2) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (i2 < 0 || i2 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException("illegal index: " + i2 + " into array of length " + bArr.length);
        } else if (outputStream != null) {
            long j3 = ((long) i2) + j2;
            StringBuilder sb = new StringBuilder(74);
            for (int i3 = i2; i3 < bArr.length; i3 += 16) {
                int length = bArr.length - i3;
                if (length > 16) {
                    length = 16;
                }
                dump(sb, j3).append(' ');
                for (int i4 = 0; i4 < 16; i4++) {
                    if (i4 < length) {
                        dump(sb, bArr[i4 + i3]);
                    } else {
                        sb.append("  ");
                    }
                    sb.append(' ');
                }
                for (int i5 = 0; i5 < length; i5++) {
                    if (bArr[i5 + i3] < 32 || bArr[i5 + i3] >= Byte.MAX_VALUE) {
                        sb.append(FilenameUtils.EXTENSION_SEPARATOR);
                    } else {
                        sb.append((char) bArr[i5 + i3]);
                    }
                }
                sb.append(EOL);
                outputStream.write(sb.toString().getBytes());
                outputStream.flush();
                sb.setLength(0);
                j3 += (long) length;
            }
        } else {
            throw new IllegalArgumentException("cannot write to nullstream");
        }
    }
}
