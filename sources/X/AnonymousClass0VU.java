package X;

import android.system.Os;
import java.io.FileDescriptor;

/* renamed from: X.0VU  reason: invalid class name */
public class AnonymousClass0VU {
    public static FileDescriptor A00(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    public static void A01(FileDescriptor fileDescriptor) {
        Os.close(fileDescriptor);
    }

    public static void A02(FileDescriptor fileDescriptor, int i2, long j2) {
        Os.lseek(fileDescriptor, j2, i2);
    }
}
