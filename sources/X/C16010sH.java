package X;

import android.content.Context;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.0sH  reason: invalid class name and case insensitive filesystem */
public class C16010sH implements Cloneable {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08 = -1;
    public long A09;
    public long A0A;
    public long A0B;
    public C28331Vq A0C;
    public C34751ko A0D;
    public C15830rv A0E;
    public UserJid A0F;
    public C34911l4 A0G;
    public C30371cF A0H;
    public Integer A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public Locale A0X;
    public boolean A0Y;
    public boolean A0Z = true;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    @Deprecated
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public boolean A0l;
    public boolean A0m;

    public C16010sH(C15830rv r3) {
        this.A0E = r3;
        this.A0i = true;
        this.A0D = null;
        if (C16030sJ.A0L(r3)) {
            this.A0H = C30371cF.A04;
        }
    }

    public C16010sH(C15830rv r4, String str, String str2, String str3, int i2, long j2, boolean z2) {
        int length;
        this.A0E = r4;
        this.A0i = z2;
        this.A0L = str2;
        if ((j2 > 0 || j2 == -2) && str != null && 5 <= (length = str.length()) && length <= 20) {
            this.A0D = new C34751ko(str, j2);
        }
        this.A0I = Integer.valueOf(i2);
        this.A0R = str3;
    }

    public static int A00(C16010sH r1, Object obj) {
        return obj == C34861kz.A06 ? r1.A04 : r1.A05;
    }

    public static C15830rv A01(C16010sH r1) {
        Jid A082 = r1.A08(C15830rv.class);
        AnonymousClass00B.A06(A082);
        return (C15830rv) A082;
    }

    public static C15830rv A02(C16010sH r1) {
        return (C15830rv) r1.A08(C15830rv.class);
    }

    public static Jid A03(C16010sH r1) {
        return r1.A08(UserJid.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        r1 = r3.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a0, code lost:
        if (android.text.TextUtils.equals(r3.A0B(), r2.A0B()) == false) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A04(X.C34871l0 r8, java.util.List r9) {
        /*
            r7 = 0
            if (r9 == 0) goto L_0x00c6
            java.util.Iterator r6 = r9.iterator()
        L_0x0007:
            r7 = 0
        L_0x0008:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r2 = r6.next()
            X.0sH r2 = (X.C16010sH) r2
            X.0sH r3 = r8.A00
            if (r2 == r3) goto L_0x0024
            X.0rv r1 = r3.A0E
            if (r1 != 0) goto L_0x0026
            java.lang.String r0 = "wacontact/updatecontact/invalid"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0022:
            if (r7 == 0) goto L_0x0007
        L_0x0024:
            r7 = 1
            goto L_0x0008
        L_0x0026:
            X.0rv r0 = r2.A0E
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            boolean r0 = r8 instanceof X.C34881l1
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = r3.A0T
            java.lang.String r0 = r2.A0T
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            r5 = r0 ^ 1
            java.lang.String r0 = r3.A0T
            r2.A0T = r0
            long r0 = r3.A0B
            r2.A0B = r0
        L_0x0044:
            if (r5 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0047:
            boolean r0 = r8 instanceof X.C34891l2
            if (r0 == 0) goto L_0x0085
            boolean r0 = r3.A0Z
            r2.A0Z = r0
            int r4 = r3.A04
            if (r4 <= 0) goto L_0x0057
            int r0 = r2.A04
            if (r0 != r4) goto L_0x0077
        L_0x0057:
            int r1 = r3.A05
            if (r1 <= 0) goto L_0x005f
            int r0 = r2.A05
            if (r0 != r1) goto L_0x0077
        L_0x005f:
            if (r4 != 0) goto L_0x0065
            int r0 = r2.A04
            if (r0 != 0) goto L_0x0077
        L_0x0065:
            if (r1 != 0) goto L_0x006b
            int r0 = r2.A05
            if (r0 != 0) goto L_0x0077
        L_0x006b:
            if (r4 >= 0) goto L_0x0071
            int r0 = r2.A04
            if (r0 > 0) goto L_0x0077
        L_0x0071:
            if (r1 >= 0) goto L_0x0083
            int r0 = r2.A05
            if (r0 <= 0) goto L_0x0083
        L_0x0077:
            r5 = 1
        L_0x0078:
            r2.A04 = r4
            int r0 = r3.A05
            r2.A05 = r0
            long r0 = r3.A0A
            r2.A0A = r0
            goto L_0x0044
        L_0x0083:
            r5 = 0
            goto L_0x0078
        L_0x0085:
            java.lang.String r1 = r3.A09()
            java.lang.String r0 = r2.A09()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x00a2
            java.lang.String r1 = r3.A0B()
            java.lang.String r0 = r2.A0B()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            r5 = 0
            if (r0 != 0) goto L_0x00a3
        L_0x00a2:
            r5 = 1
        L_0x00a3:
            java.lang.String r0 = r3.A09()
            r2.A0L = r0
            java.lang.String r0 = r3.A0J
            r2.A0J = r0
            java.lang.String r1 = r3.A0B()
            boolean r0 = r2 instanceof X.C34811ku
            if (r0 == 0) goto L_0x00c3
            java.lang.String r0 = "Setting verified name for ServerContact not allowed"
            X.AnonymousClass00B.A08(r0)
        L_0x00ba:
            java.util.Locale r0 = r3.A0X
            r2.A0X = r0
            int r0 = r3.A06
            r2.A06 = r0
            goto L_0x0044
        L_0x00c3:
            r2.A0V = r1
            goto L_0x00ba
        L_0x00c6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16010sH.A04(X.1l0, java.util.List):boolean");
    }

    public long A05() {
        if (this instanceof C34811ku) {
            return -2;
        }
        return this.A08;
    }

    public C16010sH A06() {
        try {
            Object clone = super.clone();
            if (clone instanceof C16010sH) {
                return (C16010sH) clone;
            }
        } catch (CloneNotSupportedException unused) {
        }
        return null;
    }

    public C15830rv A07() {
        return this.A0E;
    }

    public Jid A08(Class cls) {
        if (cls.isInstance(this.A0E)) {
            return (Jid) cls.cast(this.A0E);
        }
        return null;
    }

    public String A09() {
        if (!(this instanceof C34811ku)) {
            return this.A0L;
        }
        Context context = ((C34811ku) this).A00.A00;
        String str = C34811ku.A02;
        if (str != null) {
            return str;
        }
        String string = context.getString(R.string.str1b3c);
        C34811ku.A02 = string;
        return string;
    }

    public String A0A() {
        C34751ko r3 = this.A0D;
        if (r3 == null) {
            return C16030sJ.A03(this.A0E);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r3.A00);
        sb.append(":");
        sb.append(r3.A01);
        return sb.toString();
    }

    public String A0B() {
        return this instanceof C34811ku ? A09() : this.A0V;
    }

    public String A0C(float f2, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(A0A());
        sb.append("_");
        sb.append(i2);
        sb.append("_");
        sb.append(f2);
        return sb.toString();
    }

    public void A0D(long j2) {
        if (this instanceof C34811ku) {
            StringBuilder sb = new StringBuilder("Attempting to set the id of the server contact to=");
            sb.append(j2);
            Log.e(sb.toString());
            return;
        }
        this.A08 = j2;
    }

    public void A0E(C16300so r8, C34911l4 r9) {
        if (r9.A00 == 2 && r9.A01 == null) {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            C15830rv r1 = this.A0E;
            String obj = r1 != null ? r1.toString() : "unknown@unknown";
            if (!(r1 instanceof C16050sL) && !(r1 instanceof AnonymousClass1WP)) {
                obj = String.format(locale, "[obfuscated]@%s", new Object[]{obj.substring(obj.indexOf("@") + 1)});
            }
            objArr[0] = obj;
            String format = String.format(locale, "(manage_community_groups) contact/community_info Detected subgroup '%s' without parent info", objArr);
            Log.e(format);
            r8.AcB("missing_parent_info", format, true);
            AnonymousClass00B.A08("subgroup has to have a linked parent group jid");
        }
        this.A0G = r9;
    }

    public boolean A0F() {
        return A0H() && this.A06 == 3;
    }

    public boolean A0G() {
        C34751ko r0 = this.A0D;
        return r0 != null && !TextUtils.isEmpty(r0.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r2 = r3.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0H() {
        /*
            r3 = this;
            java.lang.String r0 = r3.A0B()
            if (r0 == 0) goto L_0x000e
            int r2 = r3.A06
            if (r2 == 0) goto L_0x000e
            r1 = -1
            r0 = 1
            if (r2 != r1) goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16010sH.A0H():boolean");
    }

    @Deprecated
    public boolean A0I() {
        String str = this.A0P;
        return str != null && str.startsWith("ent:");
    }

    public boolean A0J() {
        if (this instanceof C34721kl) {
            return true;
        }
        C15830rv r0 = this.A0E;
        if (r0 != null) {
            return C16030sJ.A0L(r0);
        }
        StringBuilder sb = new StringBuilder("row_id=");
        sb.append(A05());
        sb.append(" jid=");
        sb.append("(null)");
        sb.append(" key=");
        C34751ko r2 = this.A0D;
        if (r2 == null) {
            sb.append("(null)");
        } else {
            sb.append(r2.A00);
            sb.append("-");
            sb.append(r2.A01);
        }
        sb.append(" phone=");
        sb.append(this.A0I);
        sb.append(" iswa=");
        sb.append(this.A0i);
        if (A05() == -1) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder("problematic contact:");
        sb2.append(sb.toString());
        Log.e(sb2.toString());
        return false;
    }

    public boolean A0K() {
        if (this instanceof C34811ku) {
            return true;
        }
        return A0H() && A0F();
    }

    public boolean A0L() {
        if (this instanceof C34811ku) {
            return true;
        }
        return A0J() && this.A0a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16010sH)) {
            return false;
        }
        C16010sH r4 = (C16010sH) obj;
        return C34901l3.A00(this.A0E, r4.A0E) && C34901l3.A00(this.A0D, r4.A0D);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0E, this.A0D});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("row_id=");
        sb.append(A05());
        sb.append(" jid=");
        C15830rv r0 = this.A0E;
        if (r0 == null) {
            r0 = "(null)";
        }
        sb.append(r0);
        sb.append(" key=");
        C34751ko r2 = this.A0D;
        if (r2 == null) {
            sb.append("(null)");
        } else {
            sb.append(r2.A00);
            sb.append("-");
            sb.append(AnonymousClass1ZW.A03(4, r2.A01));
        }
        sb.append(" phone=");
        sb.append(this.A0I);
        sb.append(" iswa=");
        sb.append(this.A0i);
        if (A0J()) {
            sb.append(" status=");
            sb.append(this.A0T);
        }
        return sb.toString();
    }
}
