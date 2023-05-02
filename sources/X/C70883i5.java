package X;

import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3i5  reason: invalid class name and case insensitive filesystem */
public class C70883i5 extends C70893i6 {
    public final /* synthetic */ C616039o A00;
    public final /* synthetic */ AtomicReference A01;

    public C70883i5(C616039o r1, AtomicReference atomicReference) {
        this.A00 = r1;
        this.A01 = atomicReference;
    }

    public /* bridge */ /* synthetic */ Object A00(int i2) {
        AtomicReference atomicReference = this.A01;
        atomicReference.set(this.A00.A0T.A0B());
        if (((File) atomicReference.get()).exists()) {
            return Boolean.TRUE;
        }
        return null;
    }
}
