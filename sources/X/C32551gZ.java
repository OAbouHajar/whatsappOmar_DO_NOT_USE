package X;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* renamed from: X.1gZ  reason: invalid class name and case insensitive filesystem */
public class C32551gZ {
    public static final long A00 = Runtime.getRuntime().maxMemory();

    public static int A00(int i2) {
        int i3 = 1;
        if (i2 > 127) {
            int i4 = 1;
            while (true) {
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i4++;
            }
            for (int i5 = (i4 - 1) << 3; i5 >= 0; i5 -= 8) {
                i3++;
            }
        }
        return i3;
    }

    public static int A01(int i2) {
        if (i2 < 31) {
            return 1;
        }
        if (i2 < 128) {
            return 2;
        }
        int i3 = 4;
        do {
            i2 >>= 7;
            i3--;
        } while (i2 > 127);
        return 1 + (5 - i3);
    }

    public static int A02(InputStream inputStream) {
        long j2;
        if (inputStream instanceof AnonymousClass40U) {
            return ((AnonymousClass40U) inputStream).A00;
        }
        if (inputStream instanceof C33011hn) {
            return ((C33011hn) inputStream).A00;
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return inputStream.available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                if (channel != null) {
                    j2 = channel.size();
                    if (j2 < 2147483647L) {
                        return (int) j2;
                    }
                }
            } catch (IOException unused) {
            }
        }
        j2 = A00;
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j2;
    }
}
