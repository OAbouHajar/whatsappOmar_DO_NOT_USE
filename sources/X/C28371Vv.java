package X;

import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Vv  reason: invalid class name and case insensitive filesystem */
public class C28371Vv {
    public final String A00;
    public final byte[] A01;
    public final C35081lL[] A02;
    public final C28371Vv[] A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C28371Vv(C28371Vv r4, String str, C35081lL[] r6) {
        this(str, (byte[]) null, r6, r4 != null ? new C28371Vv[]{r4} : null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C28371Vv(String str, String str2, C35081lL[] r5) {
        this(str, str2 != null ? str2.getBytes() : null, r5, (C28371Vv[]) null);
    }

    public C28371Vv(String str, byte[] bArr, C35081lL[] r4) {
        this(str, bArr, r4, (C28371Vv[]) null);
    }

    public C28371Vv(String str, byte[] bArr, C35081lL[] r5, C28371Vv[] r6) {
        AnonymousClass00B.A06(str);
        this.A00 = str;
        this.A02 = r5;
        this.A03 = r6;
        this.A01 = bArr;
        if (r6 != null && bArr != null) {
            throw new IllegalArgumentException("node may not have both data and children");
        }
    }

    public C28371Vv(String str, C35081lL[] r3) {
        this(str, (byte[]) null, r3, (C28371Vv[]) null);
    }

    public C28371Vv(String str, C35081lL[] r3, C28371Vv[] r4) {
        this(str, (byte[]) null, r3, r4);
    }

    public static int A00(C28371Vv r1, String str) {
        return r1.A0B(r1.A0M(str), str);
    }

    public static int A01(Object obj, C35081lL[] r4, Object[] objArr, int i2) {
        r4[0] = new C35081lL((Jid) obj, "jid");
        objArr[i2] = new C28371Vv("group", r4);
        return i2 + 1;
    }

    public static C28371Vv A02(Jid jid, C28371Vv r6, String str) {
        return new C28371Vv(r6, "iq", new C35081lL[]{new C35081lL("id", str), new C35081lL("xmlns", "w:g2"), new C35081lL("type", "set"), new C35081lL(jid, "to")});
    }

    public static C28371Vv A03(Jid jid, C28371Vv r3, C35081lL[] r4, int i2) {
        r4[i2] = new C35081lL(jid, "to");
        return new C28371Vv(r3, "iq", r4);
    }

    public static C28371Vv A04(C28371Vv r2, C35081lL[] r3) {
        return new C28371Vv(r2, "iq", r3);
    }

    public static String A05(C28371Vv r1, String str) {
        return r1.A0N(str, (String) null);
    }

    public static void A06(C28371Vv r2, String str) {
        if (!A07(r2, str)) {
            StringBuilder sb = new StringBuilder("failed requireTag: expected: ");
            sb.append(str);
            sb.append(", actual: ");
            sb.append(r2 != null ? r2.A00 : "null");
            throw new AnonymousClass1W9(sb.toString());
        }
    }

    public static boolean A07(C28371Vv r0, String str) {
        return r0 != null && r0.A00.equals(str);
    }

    public static byte[] A08(C28371Vv r3, int i2) {
        byte[] bArr = r3.A01;
        if (bArr != null) {
            int length = bArr.length;
            if (length == i2) {
                return bArr;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("failed require. node ");
            sb.append(r3);
            sb.append(" data length ");
            sb.append(length);
            sb.append(" != required length ");
            sb.append(i2);
            throw new AnonymousClass1W9(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("failed require. node ");
        sb2.append(r3);
        sb2.append(" missing data");
        throw new AnonymousClass1W9(sb2.toString());
    }

    public int A09(String str) {
        return A0B(A0M(str), str);
    }

    public int A0A(String str, int i2) {
        String A0N = A0N(str, (String) null);
        return A0N == null ? i2 : A0B(A0N, str);
    }

    public int A0B(String str, String str2) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder("attribute ");
            sb.append(str2);
            sb.append(" for tag ");
            sb.append(this.A00);
            sb.append(" is not integral: ");
            sb.append(str);
            throw new AnonymousClass1W9(sb.toString());
        }
    }

    public long A0C(String str) {
        return A0E(A0M(str), str);
    }

    public long A0D(String str, long j2) {
        String A0N = A0N(str, (String) null);
        return A0N == null ? j2 : A0E(A0N, str);
    }

    public long A0E(String str, String str2) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            StringBuilder sb = new StringBuilder("attribute ");
            sb.append(str2);
            sb.append(" for tag ");
            sb.append(this.A00);
            sb.append(" is not integral: ");
            sb.append(str);
            throw new AnonymousClass1W9(sb.toString());
        }
    }

    public Jid A0F(C16300so r7, Class cls, String str) {
        C35081lL r1;
        Jid jid;
        int length;
        C35081lL[] r4 = this.A02;
        if (r4 == null || (length = r4.length) <= 0) {
            r1 = null;
        } else {
            int i2 = 0;
            while (true) {
                r1 = r4[i2];
                if (!TextUtils.equals(str, r1.A02)) {
                    i2++;
                    if (i2 >= length) {
                        break;
                    }
                } else {
                    break;
                }
            }
            r1 = null;
        }
        if (r1 == null || (jid = r1.A01) == null) {
            jid = Jid.getNullable(A0N(str, (String) null));
        }
        if (jid != null && !jid.isProtocolCompliant()) {
            StringBuilder sb = new StringBuilder("Jid: '");
            sb.append(jid);
            sb.append("' key: '");
            sb.append(str);
            sb.append("' tag: '");
            sb.append(this.A00);
            sb.append("'");
            r7.AcB("invalid jid!", sb.toString(), true);
        }
        if (cls == DeviceJid.class && (jid instanceof UserJid)) {
            jid = DeviceJid.of(jid);
        }
        try {
            return (Jid) cls.cast(jid);
        } catch (ClassCastException e2) {
            StringBuilder sb2 = new StringBuilder("ProtocolTreeNode/getAttributeJid/failed to convert '");
            sb2.append(C16030sJ.A03(jid));
            sb2.append("' to ");
            sb2.append(cls.getName());
            Log.e(sb2.toString(), e2);
            r7.AcB("ProtocolTreeNode/getAttributeJid", "invalid-jid-attribute", true);
            return null;
        }
    }

    public Jid A0G(C16300so r3, Class cls, String str) {
        Jid A0F = A0F(r3, cls, str);
        if (A0F != null) {
            return A0F;
        }
        StringBuilder sb = new StringBuilder("required attribute '");
        sb.append(str);
        sb.append("' missing for tag ");
        sb.append(this.A00);
        throw new AnonymousClass1W9(sb.toString());
    }

    public C28371Vv A0H() {
        C28371Vv[] r1 = this.A03;
        if (r1 != null && r1.length != 0) {
            return r1[0];
        }
        StringBuilder sb = new StringBuilder("required first child missing for tag ");
        sb.append(this.A00);
        throw new AnonymousClass1W9(sb.toString());
    }

    public C28371Vv A0I(int i2) {
        C28371Vv[] r1 = this.A03;
        if (r1 == null || r1.length <= i2) {
            return null;
        }
        return r1[i2];
    }

    public C28371Vv A0J(String str) {
        C28371Vv[] r5 = this.A03;
        if (r5 != null) {
            for (C28371Vv r1 : r5) {
                if (TextUtils.equals(str, r1.A00)) {
                    return r1;
                }
            }
        }
        return null;
    }

    public C28371Vv A0K(String str) {
        C28371Vv A0J = A0J(str);
        if (A0J != null) {
            return A0J;
        }
        StringBuilder sb = new StringBuilder("required child ");
        sb.append(str);
        sb.append(" missing for tag ");
        sb.append(this.A00);
        throw new AnonymousClass1W9(sb.toString());
    }

    public String A0L() {
        byte[] bArr = this.A01;
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, AnonymousClass01S.A08);
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public String A0M(String str) {
        String A0N = A0N(str, (String) null);
        if (A0N != null) {
            return A0N;
        }
        StringBuilder sb = new StringBuilder("required attribute '");
        sb.append(str);
        sb.append("' missing for tag ");
        sb.append(this.A00);
        throw new AnonymousClass1W9(sb.toString());
    }

    public String A0N(String str, String str2) {
        int length;
        C35081lL[] r4 = this.A02;
        if (r4 == null || (length = r4.length) <= 0) {
            return str2;
        }
        int i2 = 0;
        do {
            C35081lL r1 = r4[i2];
            if (TextUtils.equals(str, r1.A02)) {
                return r1.A03;
            }
            i2++;
        } while (i2 < length);
        return str2;
    }

    public List A0O(String str) {
        C28371Vv[] r5 = this.A03;
        if (r5 == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (C28371Vv r1 : r5) {
            if (TextUtils.equals(str, r1.A00)) {
                arrayList.add(r1);
            }
        }
        return arrayList;
    }

    public final List A0P(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = new ArrayList((Collection) it.next());
            if (arrayList2.size() > 1 && ((String) arrayList2.get(0)).equals(this.A00)) {
                arrayList2.remove(0);
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    public C35081lL[] A0Q() {
        C35081lL[] r1 = this.A02;
        if (r1 == null || r1.length != 0) {
            return r1;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        if (r0 == null) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0065, code lost:
        if (r6 == null) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r9 = 1
            if (r10 == r11) goto L_0x0082
            r8 = 0
            if (r11 == 0) goto L_0x0081
            java.lang.Class r1 = r10.getClass()
            java.lang.Class r0 = r11.getClass()
            if (r1 != r0) goto L_0x0081
            X.1Vv r11 = (X.C28371Vv) r11
            java.lang.String r1 = r10.A00
            java.lang.String r0 = r11.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0081
            X.1lL[] r5 = r10.A02
            X.1lL[] r0 = r11.A02
            if (r5 == 0) goto L_0x0041
            if (r0 == 0) goto L_0x0081
            int r4 = r5.length
            int r0 = r0.length
            if (r4 != r0) goto L_0x0081
            r3 = 0
        L_0x0029:
            if (r3 >= r4) goto L_0x0043
            r2 = r5[r3]
            java.lang.String r1 = r2.A02
            r0 = 0
            java.lang.String r1 = r11.A0N(r1, r0)
            if (r1 == 0) goto L_0x0081
            java.lang.String r0 = r2.A03
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0081
            int r3 = r3 + 1
            goto L_0x0029
        L_0x0041:
            if (r0 != 0) goto L_0x0081
        L_0x0043:
            X.1Vv[] r7 = r10.A03
            X.1Vv[] r6 = r11.A03
            if (r7 == 0) goto L_0x0065
            if (r6 == 0) goto L_0x0081
            int r5 = r7.length
            int r4 = r6.length
            if (r5 != r4) goto L_0x0081
            r3 = 0
        L_0x0050:
            if (r3 >= r5) goto L_0x0067
            r2 = r7[r3]
            r1 = 0
        L_0x0055:
            if (r1 >= r4) goto L_0x0081
            r0 = r6[r1]
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0062
            int r3 = r3 + 1
            goto L_0x0050
        L_0x0062:
            int r1 = r1 + 1
            goto L_0x0055
        L_0x0065:
            if (r6 != 0) goto L_0x0081
        L_0x0067:
            byte[] r3 = r10.A01
            if (r3 == 0) goto L_0x007a
            byte[] r2 = r11.A01
            if (r2 == 0) goto L_0x007f
            int r1 = r3.length
            int r0 = r2.length
            if (r1 != r0) goto L_0x007f
            boolean r0 = java.util.Arrays.equals(r3, r2)
            if (r0 == 0) goto L_0x007f
            return r9
        L_0x007a:
            byte[] r0 = r11.A01
            if (r0 != 0) goto L_0x007f
            return r9
        L_0x007f:
            r9 = 0
            return r9
        L_0x0081:
            return r8
        L_0x0082:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28371Vv.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i2;
        int hashCode = (this.A00.hashCode() + 31) * 31;
        byte[] bArr = this.A01;
        int i3 = 0;
        int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        C28371Vv[] r4 = this.A03;
        if (r4 == null) {
            i2 = 0;
        } else {
            i2 = 0;
            for (C28371Vv r0 : r4) {
                if (r0 != null) {
                    i2 += r0.hashCode();
                }
            }
        }
        int i4 = (hashCode2 + i2) * 31;
        C35081lL[] r3 = this.A02;
        if (r3 != null) {
            for (C35081lL r02 : r3) {
                if (r02 != null) {
                    i3 += r02.hashCode();
                }
            }
        }
        return i4 + i3;
    }

    public String toString() {
        String str;
        boolean z2;
        String str2;
        StringBuilder sb = new StringBuilder("<");
        String str3 = this.A00;
        sb.append(str3);
        C35081lL[] r6 = this.A02;
        if (r6 == null) {
            r6 = new C35081lL[0];
        }
        for (C35081lL r1 : r6) {
            sb.append(" ");
            sb.append(r1.A02);
            sb.append("='");
            sb.append(r1.A03);
            sb.append("'");
        }
        byte[] bArr = this.A01;
        if (bArr == null && this.A03 == null) {
            str = "/>";
        } else {
            str = ">";
            sb.append(str);
            C28371Vv[] r2 = this.A03;
            if (r2 == null) {
                r2 = new C28371Vv[0];
            }
            for (C28371Vv r0 : r2) {
                if (r0 != null) {
                    sb.append(r0.toString());
                }
            }
            if (bArr != null) {
                try {
                    AnonymousClass01S.A0A.newDecoder().decode(ByteBuffer.wrap(bArr));
                    z2 = true;
                } catch (CharacterCodingException unused) {
                    z2 = false;
                }
                if (z2) {
                    try {
                        str2 = new String(bArr, AnonymousClass01S.A08);
                    } catch (UnsupportedEncodingException unused2) {
                        str2 = null;
                    }
                } else {
                    str2 = Base64.encodeToString(bArr, 2);
                }
                sb.append(str2);
            }
            sb.append("</");
            sb.append(str3);
        }
        sb.append(str);
        return sb.toString();
    }
}
