package X;

import android.util.Pair;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

/* renamed from: X.2i2  reason: invalid class name and case insensitive filesystem */
public class C54702i2 extends C16690tT {
    public final C208811y A00;
    public final C16000sG A01;
    public final C23181Au A02;
    public final UserJid A03;
    public final String A04;
    public final String A05;
    public final WeakReference A06;

    public C54702i2(C208811y r2, C16000sG r3, C23181Au r4, UserJid userJid, AnonymousClass2RO r6, String str, String str2) {
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A06 = new WeakReference(r6);
        this.A03 = userJid;
        this.A05 = str;
        this.A04 = str2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass284 r0;
        UserJid userJid = this.A03;
        if (userJid == null) {
            String str = this.A04;
            if (str != null) {
                return this.A02.A00(C34861kz.A01, str);
            }
            r0 = AnonymousClass284.A03;
        } else {
            C16010sH A0A = this.A01.A0A(userJid);
            String str2 = this.A05;
            if (str2 != null && !str2.isEmpty() && !str2.equals(A0A.A0W)) {
                A0A.A0W = str2;
                this.A00.A01(new RunnableRunnableShape10S0200000_I0_8(this, 9, A0A));
            }
            r0 = A0A.A0D != null ? AnonymousClass284.A08 : this.A02.A01(C34861kz.A01, userJid);
        }
        return Pair.create(r0, (Object) null);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Pair pair = (Pair) obj;
        AnonymousClass2RO r2 = (AnonymousClass2RO) this.A06.get();
        if (r2 != null && !r2.A03) {
            r2.A01((AnonymousClass284) pair.first, (C450927a) pair.second);
        }
    }
}
