package X;

import android.content.SharedPreferences;

/* renamed from: X.1BO  reason: invalid class name */
public class AnonymousClass1BO extends AnonymousClass1BP {
    public final C15860rz A00;

    public AnonymousClass1BO(C18260wP r11, C16440t3 r12, C15860rz r13, AnonymousClass013 r14, AnonymousClass1BT r15, AnonymousClass1BS r16, C207011g r17, C16490t9 r18, C18520wp r19, C16320sq r20) {
        super(r11, r12, r14, r15, r16, r18, r17, r19, r20);
        this.A00 = r13;
    }

    public C88304aH A00() {
        return ((SharedPreferences) this.A00.A01.get()).getInt("emoji_search_algorithm_version", 0) == 2 ? super.A00() : new C88304aH();
    }

    public boolean A01(C88304aH r5) {
        boolean A01 = super.A01(r5);
        if (A01) {
            this.A00.A0K().putInt("emoji_search_algorithm_version", 2).apply();
        }
        return A01;
    }
}
