package X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.logger.BufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.1hE  reason: invalid class name and case insensitive filesystem */
public class C32811hE implements C32801hD {
    public boolean A60(C32841hK r2, File file) {
        return true;
    }

    public void AVR(C32841hK r14) {
        long nanoTime = System.nanoTime();
        Buffer buffer = r14.A09;
        BufferLogger.writeBytesEntry(buffer, 0, 83, BufferLogger.writeStandardEntry(buffer, 4, 21, nanoTime, 0, 0, 0, 0), "Profilo.ProvidersInitialized");
        BufferLogger.writeStandardEntry(buffer, 4, 22, nanoTime, 0, 0, 0, 0);
    }

    public void AVS(C32841hK r15, int i2) {
        C32851hM r0 = ProvidersRegistry.A00;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = r0.A01;
        synchronized (arrayList) {
            Iterator it = arrayList.iterator();
            int i3 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                if ((i3 & i2) != 0) {
                    hashSet.add(next);
                }
                i3 <<= 1;
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(str);
        }
        Buffer buffer = r15.A09;
        BufferLogger.writeBytesEntry(buffer, 0, 57, BufferLogger.writeBytesEntry(buffer, 0, 56, BufferLogger.writeStandardEntry(buffer, 6, 52, 0, 0, 8126514, 0, 0), "Active providers"), sb.toString());
    }

    public void AYz(C32841hK r1) {
    }

    public void AZ0(int i2, int i3, int i4, int i5) {
    }

    public void AZ1(C32841hK r1) {
    }

    public void AZ2(C32841hK r1) {
    }

    public void AZ3(C32841hK r1) {
    }

    public void AZ4(C32841hK r1, int i2) {
    }

    public void AZ5(C32841hK r1) {
    }

    public void AZ6(C32841hK r1, Throwable th) {
    }

    public void AZ7(C32841hK r1) {
    }
}
