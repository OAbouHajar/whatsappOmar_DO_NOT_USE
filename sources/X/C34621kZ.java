package X;

import android.content.Intent;
import android.database.Cursor;
import com.facebook.redex.IDxObjectShape331S0100000_2_I0;
import com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1kZ  reason: invalid class name and case insensitive filesystem */
public class C34621kZ extends C003401n {
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public int A03 = 8;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08 = Long.MIN_VALUE;
    public long A09 = 1;
    public long A0A = Long.MIN_VALUE;
    public C34651kc A0B = null;
    public C16740tZ A0C = null;
    public C16740tZ A0D;
    public String A0E;
    public String A0F;
    public ArrayList A0G;
    public boolean A0H;
    public boolean A0I = false;
    public boolean A0J = true;
    public final long A0K;
    public final Intent A0L;
    public final AnonymousClass027 A0M = new AnonymousClass027();
    public final AnonymousClass027 A0N = new C30801cy();
    public final AnonymousClass027 A0O = new C30801cy();
    public final AnonymousClass027 A0P;
    public final C016407u A0Q;
    public final C16040sK A0R;
    public final AnonymousClass1LD A0S;
    public final AnonymousClass1HT A0T;
    public final C26031Mb A0U;
    public final C16440t3 A0V;
    public final AnonymousClass013 A0W;
    public final AnonymousClass10R A0X;
    public final C15810rt A0Y;
    public final C16460t6 A0Z;
    public final AnonymousClass17R A0a;
    public final AnonymousClass11K A0b;
    public final C18940xV A0c;
    public final C19150xq A0d;
    public final AnonymousClass15B A0e;
    public final C18600wx A0f;
    public final C14710pd A0g;
    public final C15830rv A0h;
    public final C19830z4 A0i;
    public final C224718b A0j;
    public final C222617g A0k;
    public final AnonymousClass1A9 A0l;
    public final C30801cy A0m = new C30801cy();
    public final C30801cy A0n = new C30801cy();
    public final C30801cy A0o = new C30801cy();
    public final C30801cy A0p = new C30801cy();
    public final C30801cy A0q = new C30801cy();
    public final C30801cy A0r = new C30801cy();
    public final C30801cy A0s = new C30801cy();
    public final C30801cy A0t = new C30801cy();
    public final C16320sq A0u;
    public final AnonymousClass1ZQ A0v;
    public final ArrayList A0w = new ArrayList();
    public final List A0x = new ArrayList();
    public final Set A0y = new HashSet();
    public final AnonymousClass22J A0z;
    public final boolean A10;

    public C34621kZ(Intent intent, C016407u r15, C16040sK r16, AnonymousClass1LD r17, AnonymousClass1HT r18, C26031Mb r19, C16440t3 r20, AnonymousClass013 r21, AnonymousClass10R r22, C15810rt r23, C16460t6 r24, AnonymousClass17R r25, AnonymousClass11K r26, C19150xq r27, AnonymousClass15B r28, C16010sH r29, C18600wx r30, C14710pd r31, C15830rv r32, C19830z4 r33, C224718b r34, C222617g r35, AnonymousClass1A9 r36, C16320sq r37, AnonymousClass1ZQ r38) {
        AnonymousClass027 r6 = new AnonymousClass027();
        this.A0P = r6;
        this.A0z = new IDxObjectShape331S0100000_2_I0(this, 1);
        IDxMObserverShape73S0100000_1_I0 iDxMObserverShape73S0100000_1_I0 = new IDxMObserverShape73S0100000_1_I0(this, 2);
        this.A0c = iDxMObserverShape73S0100000_1_I0;
        this.A0g = r31;
        this.A0e = r28;
        this.A0Z = r24;
        this.A0u = r37;
        this.A0Y = r23;
        this.A0W = r21;
        this.A0X = r22;
        this.A0R = r16;
        this.A0v = r38;
        AnonymousClass1LD r7 = r17;
        this.A0S = r7;
        this.A0f = r30;
        this.A0l = r36;
        this.A0k = r35;
        this.A0j = r34;
        this.A0V = r20;
        this.A0T = r18;
        this.A0U = r19;
        AnonymousClass17R r5 = r25;
        this.A0a = r5;
        this.A0b = r26;
        C19150xq r4 = r27;
        this.A0d = r4;
        this.A0Q = r15;
        C15830rv r3 = r32;
        this.A0h = r3;
        this.A0L = intent;
        this.A0i = r33;
        Map map = r15.A03;
        Number number = (Number) map.get("start_ref");
        if (number != null) {
            this.A09 = number.longValue();
        }
        Number number2 = (Number) map.get("start_sort_ref");
        if (number2 != null) {
            this.A0A = number2.longValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("quotedMessage_");
        sb.append("fMessageKeyJid");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("quotedMessage_");
        sb2.append("fMessageKeyFromMe");
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("quotedMessage_");
        sb3.append("fMessageKeyId");
        String obj3 = sb3.toString();
        C18450wi.A0H(obj, 0);
        if (map.containsKey(obj)) {
            C18450wi.A0H(obj2, 0);
            if (map.containsKey(obj2)) {
                C18450wi.A0H(obj3, 0);
                if (map.containsKey(obj3)) {
                    C16740tZ A032 = this.A0Z.A0K.A03(new C28381Vw(C15830rv.A02((String) map.get(obj)), (String) map.get(obj3), Boolean.TRUE.equals(map.get(obj2))));
                    this.A0D = A032;
                    if (A032 != null) {
                        r6.A09(A032);
                        r7.A00.put(r3, this.A0D);
                    }
                }
            }
        }
        this.A0K = r5.A00;
        this.A10 = r29.A0J();
        r4.A02(iDxMObserverShape73S0100000_1_I0);
    }

    public void A04() {
        this.A0d.A03(this.A0c);
        C451927k r2 = C451927k.A01;
        AnonymousClass22J r1 = this.A0z;
        C18450wi.A0H(r1, 0);
        synchronized (r2) {
            C451927k.A02.remove(r1);
        }
    }

    public final int A05() {
        int i2;
        synchronized (this) {
            i2 = this.A02;
        }
        int size = i2 + this.A0x.size();
        int i3 = 0;
        if (this.A07 > 0) {
            i3 = 1;
        }
        return size + i3;
    }

    public final int A06() {
        int i2 = this.A07;
        int i3 = this.A00;
        if (i2 > i3 - 10) {
            StringBuilder sb = new StringBuilder("conversation/page size (from unseen):");
            sb.append(i2 + 10);
            Log.i(sb.toString());
            return this.A07 + 10;
        }
        StringBuilder sb2 = new StringBuilder("conversation/page size:");
        sb2.append(i3);
        Log.i(sb2.toString());
        return this.A00;
    }

    public final int A07(Collection collection) {
        int i2 = 0;
        if (this.A08 != Long.MIN_VALUE) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (((C16740tZ) it.next()).A14 > this.A08) {
                    i2++;
                }
            }
        }
        return i2;
    }

    public final C34651kc A08(int i2, long j2) {
        C34651kc A0C2 = this.A0Z.A0C(this.A0h, i2, this.A09, j2, true);
        A0C2.A00.getCount();
        return A0C2;
    }

    public final C16740tZ A09() {
        C16740tZ r0;
        List list = this.A0x;
        if (!list.isEmpty()) {
            return (C16740tZ) list.get(list.size() - 1);
        }
        synchronized (this) {
            r0 = this.A0C;
        }
        return r0;
    }

    public void A0A() {
        List list = this.A0x;
        list.clear();
        this.A0n.A0B(new C34631ka(C34641kb.copyOf((Collection) list), (C34651kc) null, (Boolean) null, (Boolean) null, (Collection) null, true, false));
    }

    public void A0B() {
        StringBuilder sb = new StringBuilder();
        C15830rv r6 = this.A0h;
        sb.append(r6.getRawString());
        sb.append("_");
        sb.append(100);
        sb.append("_");
        long j2 = this.A0K;
        sb.append(j2);
        String obj = sb.toString();
        Set set = this.A0y;
        synchronized (set) {
            if (this.A0J && set.add(obj)) {
                C16320sq r0 = this.A0u;
                C16460t6 r4 = this.A0Z;
                long j3 = this.A09;
                r0.Aco(new AnonymousClass3ID(new AnonymousClass4EA(this), this.A0Y, r4, this.A0e, r6, obj, this.A0x, set, j2, j3));
            }
        }
    }

    public void A0C() {
        StringBuilder sb = new StringBuilder("messagesViewModel/recreatemessagelist/");
        sb.append(this.A09);
        sb.append(" ");
        sb.append(this.A0J);
        Log.i(sb.toString());
        int A052 = A05();
        C34651kc A082 = A08(A06(), this.A0K);
        A0G(A082.A01);
        A0H(A082.A02);
        if (this.A07 > A082.A00.getCount()) {
            A0F();
        }
        A0I(A082);
        this.A0O.A0B(new AnonymousClass2XH(new AnonymousClass2XG(this.A05, this.A06, this.A07), A082, this.A01, this.A0J));
        this.A0x.clear();
        if (this.A0J && A052 > A05()) {
            Log.i("messagesViewModel/messagesViewModel/loadMoreMessages");
            A0B();
        }
    }

    public final void A0D() {
        this.A0t.A0B(new AnonymousClass2XG(this.A05, this.A06, this.A07));
    }

    public final void A0E() {
        ArrayList arrayList = this.A0w;
        this.A0M.A09(arrayList.isEmpty() ? new C48942Pz(8, (String) null) : new C48942Pz(0, this.A0W.A0K().format((long) arrayList.size())));
    }

    public final void A0F() {
        this.A07 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A08 = Long.MIN_VALUE;
    }

    public void A0G(long j2) {
        this.A09 = j2;
        this.A0Q.A06("start_ref", Long.valueOf(j2));
    }

    public void A0H(long j2) {
        this.A0A = j2;
        this.A0Q.A06("start_sort_ref", Long.valueOf(j2));
    }

    public synchronized void A0I(C34651kc r4) {
        int i2;
        this.A0B = r4;
        Cursor cursor = r4.A00;
        if (cursor == null || cursor.isClosed() || !cursor.moveToFirst()) {
            this.A0C = null;
            i2 = 0;
        } else {
            this.A0C = this.A0Z.A0G(cursor, this.A0h);
            i2 = cursor.getCount();
        }
        this.A02 = i2;
    }

    public void A0J(C16740tZ r9) {
        if (!C34901l3.A00(this.A0D, r9)) {
            this.A0D = r9;
            HashMap hashMap = this.A0S.A00;
            C016407u r5 = this.A0Q;
            if (r9 != null) {
                C28381Vw r7 = r9.A11;
                StringBuilder sb = new StringBuilder();
                sb.append("quotedMessage_");
                sb.append("fMessageKeyJid");
                String obj = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("quotedMessage_");
                sb2.append("fMessageKeyFromMe");
                String obj2 = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("quotedMessage_");
                sb3.append("fMessageKeyId");
                r5.A06(sb3.toString(), r7.A01);
                r5.A06(obj2, Boolean.valueOf(r7.A02));
                r5.A06(obj, C16030sJ.A03(r7.A00));
                hashMap.put(this.A0h, r9);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("quotedMessage_");
                sb4.append("fMessageKeyJid");
                String obj3 = sb4.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append("quotedMessage_");
                sb5.append("fMessageKeyFromMe");
                String obj4 = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append("quotedMessage_");
                sb6.append("fMessageKeyId");
                r5.A05(sb6.toString());
                r5.A05(obj4);
                r5.A05(obj3);
                hashMap.remove(this.A0h);
            }
            this.A0P.A0B(r9);
        }
    }

    public void A0K(C16740tZ r20, List list, int i2, int i3, int i4, int i5, boolean z2) {
        boolean z3;
        C34651kc r8;
        C16740tZ r9 = r20;
        if (r9.A14 < this.A0A) {
            z3 = true;
            long j2 = this.A0K;
            r8 = this.A0Z.A0B(this.A0h, 100, r9.A13, j2);
            r8.A00.getCount();
            A0G(r8.A01);
            A0H(r8.A02);
            A0I(r8);
            A0A();
        } else {
            z3 = false;
            r8 = null;
        }
        C30801cy r6 = this.A0r;
        int A022 = this.A0e.A02(this.A0h, this.A0A, r9.A14);
        if (this.A07 > 0 && A022 >= i3) {
            A022++;
        }
        r6.A0B(new AnonymousClass4VE(r8, r9, list, A022, i2, i4, i5, this.A0K, z3, z2));
    }
}
