package X;

import android.content.Context;

/* renamed from: X.4zY  reason: invalid class name and case insensitive filesystem */
public class C102804zY implements AnonymousClass2V1 {
    public final C37781pj A00;
    public final C17250um A01;

    public C102804zY(C37781pj r1, C17250um r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean A5u() {
        return true;
    }

    public C455829l A7b(Context context, AnonymousClass013 r5, boolean z2) {
        AnonymousClass00B.A00();
        return new C605032p(context, this.A00, this.A01, z2);
    }

    public C37781pj[] ABx() {
        return new C37781pj[]{this.A00};
    }

    public String AGT() {
        return AnonymousClass000.A0h(this.A00.toString(), AnonymousClass000.A0r("EmojiShapeCreator:"));
    }

    public boolean AcK() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C102804zY) {
            return this.A00.equals(((C102804zY) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
