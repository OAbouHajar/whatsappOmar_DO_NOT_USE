package X;

import java.io.File;
import java.nio.channels.FileChannel;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.0U2  reason: invalid class name */
public final class AnonymousClass0U2 {
    public static final Map A03 = AnonymousClass000.A0x();
    public FileChannel A00;
    public final File A01;
    public final Lock A02;

    public AnonymousClass0U2(File file, String str) {
        Lock lock;
        File file2 = new File(file, AnonymousClass000.A0h(".lck", AnonymousClass000.A0q(str)));
        this.A01 = file2;
        String absolutePath = file2.getAbsolutePath();
        C18450wi.A0B(absolutePath);
        Map map = A03;
        synchronized (map) {
            Object obj = map.get(absolutePath);
            if (obj == null) {
                obj = new ReentrantLock();
                map.put(absolutePath, obj);
            }
            lock = (Lock) obj;
        }
        this.A02 = lock;
    }
}
