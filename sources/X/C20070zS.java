package X;

import com.facebook.redex.RunnableRunnableShape0S1301000_I0;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.0zS  reason: invalid class name and case insensitive filesystem */
public class C20070zS {
    public final C16000sG A00;
    public final C20030zO A01;
    public final C20050zQ A02;
    public final C14710pd A03;
    public final C16490t9 A04;
    public final C20060zR A05;
    public final C16320sq A06;
    public final HashMap A07;

    public C20070zS(C16000sG r2, C20030zO r3, C20050zQ r4, C14710pd r5, C16490t9 r6, C20060zR r7, C16320sq r8, HashMap hashMap) {
        C18450wi.A0H(r5, 1);
        C18450wi.A0H(r6, 2);
        C18450wi.A0H(r3, 3);
        C18450wi.A0H(r2, 6);
        C18450wi.A0H(r8, 8);
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A07 = hashMap;
        this.A00 = r2;
        this.A05 = r7;
        this.A06 = r8;
    }

    public final C89244bp A00(UserJid userJid) {
        HashMap hashMap = this.A07;
        C89244bp r1 = (C89244bp) hashMap.get(userJid);
        if (r1 != null) {
            return r1;
        }
        C89244bp r12 = new C89244bp((String) null, (HashSet) null, (C54392hN) null, 15, false, false);
        hashMap.put(userJid, r12);
        return r12;
    }

    public final void A01(UserJid userJid, String str, int i2) {
        UserJid userJid2 = userJid;
        if (userJid != null) {
            C89244bp A002 = A00(userJid);
            if ((this.A01.A00(userJid) instanceof AnonymousClass21V) && this.A03.A0E(C16620tM.A02, 1681)) {
                HashSet hashSet = new HashSet();
                hashSet.add(5);
                hashSet.add(15);
                hashSet.add(14);
                hashSet.add(17);
                hashSet.add(17);
                hashSet.add(16);
                hashSet.add(18);
                int i3 = i2;
                Integer valueOf = Integer.valueOf(i2);
                if (hashSet.contains(valueOf)) {
                    HashSet hashSet2 = A002.A03;
                    if (i2 == 16) {
                        hashSet2.add(15);
                    }
                    if (!hashSet2.add(valueOf)) {
                        return;
                    }
                }
                this.A06.Acl(new RunnableRunnableShape0S1301000_I0(this, userJid2, A002, str, i3, 1));
            }
        }
    }
}
