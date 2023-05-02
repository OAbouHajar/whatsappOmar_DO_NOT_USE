package X;

import java.io.Serializable;

/* renamed from: X.54o  reason: invalid class name and case insensitive filesystem */
public abstract class C1042554o implements Serializable, AnonymousClass5VG {
    public static final Object A01 = C1042454m.A00;
    public transient AnonymousClass5VG A00;
    public final boolean isTopLevel;
    public final String name;
    public final Class owner;
    public final Object receiver;
    public final String signature;

    public C1042554o(Class cls, Object obj, String str, String str2, boolean z2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z2;
    }

    public AnonymousClass2BQ A00() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? new C1052558u(cls) : new AnonymousClass2BO(cls);
    }
}
