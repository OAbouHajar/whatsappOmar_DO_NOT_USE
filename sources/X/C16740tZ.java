package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.obwhatsapp.TextData;
import com.obwhatsapp.data.ProfilePhotoChange;
import com.whatsapp.MediaData;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0tZ  reason: invalid class name and case insensitive filesystem */
public abstract class C16740tZ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public AnonymousClass21U A0J;
    public C35541m6 A0K;
    public AnonymousClass1Vt A0L;
    public C15830rv A0M;
    public C40531uH A0N;
    public AnonymousClass2EC A0O;
    public C16740tZ A0P;
    public C39251sA A0Q;
    public C28381Vw A0R;
    public C16870tm A0S;
    public C39271sC A0T;
    public C30771cv A0U;
    public C40111ta A0V;
    public AnonymousClass23T A0W;
    public Integer A0X;
    public Long A0Y;
    public Long A0Z;
    public Long A0a;
    public Long A0b;
    public Long A0c;
    public Long A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public List A0q;
    public List A0r;
    public Map A0s;
    public boolean A0t;
    public boolean A0u;
    public boolean A0v;
    public boolean A0w;
    public boolean A0x;
    public boolean A0y;
    public byte[] A0z;
    public final byte A10;
    public final C28381Vw A11;
    public final Object A12;
    public volatile long A13;
    public volatile long A14;
    public volatile boolean A15;
    public transient long A16;
    public transient long A17;
    public transient long A18;
    public transient DeviceJid A19;
    public transient C39191s4 A1A;
    public transient boolean A1B;
    public transient boolean A1C;
    public transient boolean A1D;
    public transient boolean A1E;
    public transient byte[] A1F;
    public final transient long A1G;
    public volatile transient int A1H;

    public C16740tZ(C16740tZ r5, C28381Vw r6, byte b2, long j2, boolean z2) {
        this(r6, b2, j2);
        AnonymousClass1Vt r2;
        synchronized (r5.A12) {
            this.A0g = r5.A0g;
            this.A0z = r5.A0z;
        }
        this.A02 = r5.A02;
        this.A08 = r5.A08;
        A0u(r5.A0q);
        this.A0R = r5.A0R;
        if (z2) {
            this.A0M = r5.A0B();
            this.A19 = r5.A19;
            this.A0r = r5.A0Q() != null ? new ArrayList(r5.A0Q()) : null;
            this.A0m = r5.A0m;
            this.A0l = r5.A0l;
            this.A0h = r5.A0h;
            this.A0t = r5.A0t;
            this.A0A = r5.A0A;
            this.A0O = r5.A0O;
            this.A0X = r5.A0X;
            this.A0F = r5.A0F;
            this.A0P = r5.A0P;
            this.A0d = r5.A0d;
            this.A0E = r5.A0E;
            this.A0V = r5.A0V;
            this.A0c = r5.A0c;
            this.A0b = r5.A0b;
            this.A0a = r5.A0a;
            this.A01 = r5.A01;
            this.A09 = r5.A09;
            this.A05 = r5.A05;
            A02(r5, this, false);
            AnonymousClass1Vt r3 = r5.A0L;
            if (r3 != null && (r2 = this.A0L) != null) {
                synchronized (r3) {
                    if (TextUtils.isEmpty(r2.A0K) || r2.A0K.equals(r3.A0K)) {
                        r2.A0K = r3.A0K;
                        r2.A02 = r3.A02;
                        r2.A06 = r3.A06;
                    }
                }
            }
        }
    }

    public C16740tZ(C16740tZ r8, C28381Vw r9, long j2, boolean z2) {
        this(r8, r9, r8.A10, j2, z2);
    }

    public C16740tZ(C28381Vw r5, byte b2, long j2) {
        this.A1D = false;
        this.A1E = false;
        this.A0H = -1;
        this.A0O = AnonymousClass2EC.NONE;
        this.A13 = -1;
        this.A14 = -1;
        this.A0X = null;
        this.A0i = null;
        this.A1C = false;
        this.A0D = 0;
        this.A00 = 0;
        this.A06 = 0;
        this.A12 = new Object();
        this.A0v = false;
        AnonymousClass00B.A06(r5);
        this.A11 = r5;
        this.A0I = j2;
        this.A10 = b2;
        long uptimeMillis = SystemClock.uptimeMillis();
        this.A1G = uptimeMillis;
        this.A18 = uptimeMillis;
    }

    public static void A02(C16740tZ r2, C16740tZ r3, boolean z2) {
        C16740tZ r1;
        if (!(r2.A0F() == null || r3.A0F() == null || !r2.A0F().A05() || r2.A0F().A07() == null)) {
            r3.A0F().A03(r2.A0F().A07(), z2);
        }
        C16740tZ r22 = r2.A0P;
        if (r22 != null && (r1 = r3.A0P) != null) {
            A02(r22, r1, true);
        }
    }

    public int A03() {
        int i2;
        synchronized (this.A12) {
            i2 = this.A02;
        }
        return i2;
    }

    public int A04() {
        if (this instanceof C30581cc) {
            return ((C30581cc) this).A00;
        }
        if (this instanceof C39361sM) {
            return ((C39361sM) this).A00;
        }
        if (this instanceof C39381sO) {
            return ((C39381sO) this).A01 ? 1 : 0;
        }
        if (this instanceof C39331sJ) {
            return ((C39331sJ) this).A01;
        }
        if (this instanceof C39291sE) {
            C39291sE r1 = (C39291sE) this;
            return r1 instanceof C39431sT ? ((C39431sT) r1).A00 : r1.A00;
        } else if (this instanceof C39411sR) {
            return ((C39411sR) this).A00;
        } else {
            if (this instanceof C38841rV) {
                return ((C38841rV) this).A00;
            }
            if (this instanceof C38791rQ) {
                return ((C38791rQ) this).A01;
            }
            if (this instanceof C16730tY) {
                C16730tY r12 = (C16730tY) this;
                return r12 instanceof C38631rA ? ((C38631rA) r12).A00 : r12.A00;
            } else if (this instanceof C38761rN) {
                return ((C38761rN) this).A00;
            } else {
                return 0;
            }
        }
    }

    public int A05() {
        if (this instanceof C30581cc) {
            return ((C30581cc) this).A01;
        }
        if (this instanceof C39451sV) {
            return ((C39451sV) this).A00;
        }
        if (this instanceof C39381sO) {
            return ((C39381sO) this).A00;
        }
        if (this instanceof C39341sK) {
            return ((C39341sK) this).A00;
        }
        if (this instanceof C39331sJ) {
            return ((C39331sJ) this).A00;
        }
        if (this instanceof C30071bh) {
            return ((C30071bh) this).A00;
        }
        return 0;
    }

    public int A06() {
        return this instanceof C39191s4 ? ((C39191s4) this).A01 : this.A06;
    }

    public int A07() {
        if (TextUtils.isEmpty(this instanceof C16730tY ? ((C16730tY) this).A09 : null)) {
            this.A09 = -65 & this.A09;
        }
        return this.A09;
    }

    public int A08() {
        if (this instanceof C38541qx) {
            return 4;
        }
        return this.A0D;
    }

    public long A09() {
        if (this instanceof AnonymousClass1WU) {
            return (long) ((AnonymousClass1WU) this).A00;
        }
        if (this instanceof C38831rU) {
            return ((C38831rU) this).A00;
        }
        if (this instanceof C16730tY) {
            return ((C16730tY) this).A01;
        }
        if (this instanceof C38841rV) {
            return ((C38841rV) this).A01;
        }
        if (this instanceof C38761rN) {
            return (long) ((C38761rN) this).A01;
        }
        return 0;
    }

    public long A0A() {
        long j2 = A0y() ? 1 : 0;
        if (this.A0P != null || this.A0F > 0) {
            j2 |= 2;
        }
        if (this.A0n != null) {
            j2 |= 4;
        }
        return A0x() ? j2 | 8 : j2;
    }

    public C15830rv A0B() {
        if (this instanceof AnonymousClass1WT) {
            return null;
        }
        return this.A0M;
    }

    public UserJid A0C() {
        if (this instanceof AnonymousClass1WU) {
            AnonymousClass1WU r1 = (AnonymousClass1WU) this;
            if (r1 instanceof C39351sL) {
                return ((C39351sL) r1).A01;
            }
            return null;
        }
        C15830rv r12 = this.A11.A00;
        if (C16030sJ.A0L(r12) || C16030sJ.A0G(r12)) {
            r12 = this.A0M;
        }
        return (UserJid) r12;
    }

    public C16740tZ A0D() {
        if ((this instanceof AnonymousClass1WU) || (this instanceof C39231s8) || (this instanceof C38971ri) || (this instanceof C38541qx)) {
            return null;
        }
        return this.A0P;
    }

    public C39251sA A0E() {
        C39251sA r0 = this.A0Q;
        if (r0 != null) {
            return r0;
        }
        C39251sA r02 = new C39251sA();
        this.A0Q = r02;
        return r02;
    }

    public C16870tm A0F() {
        C16870tm r1;
        synchronized (this.A12) {
            r1 = this.A0S;
            if (r1 == null && C16870tm.A00(this.A10)) {
                r1 = new C16870tm(this);
                this.A0S = r1;
            }
        }
        return r1;
    }

    public C39271sC A0G() {
        C39271sC r0;
        synchronized (this.A12) {
            r0 = this.A0T;
        }
        return r0;
    }

    public Object A0H() {
        UserJid userJid;
        if (this instanceof C30581cc) {
            C30581cc r1 = (C30581cc) this;
            TextData textData = r1.A02;
            return textData == null ? r1.A08 : textData;
        } else if (this instanceof C39321sH) {
            return ((C39321sH) this).A00;
        } else {
            if (this instanceof C39351sL) {
                C28381Vw r3 = ((C39351sL) this).A02;
                if (r3 == null) {
                    return null;
                }
                String[] strArr = new String[3];
                C15830rv r0 = r3.A00;
                strArr[0] = r0 != null ? r0.getRawString() : "null";
                strArr[1] = String.valueOf(r3.A02);
                strArr[2] = r3.A01;
                return TextUtils.join(";", Arrays.asList(strArr));
            } else if (this instanceof AnonymousClass1WT) {
                AnonymousClass1WT r2 = (AnonymousClass1WT) this;
                if (r2.A00 != 10 || (userJid = r2.A00) == null) {
                    return null;
                }
                return userJid.getRawString();
            } else if (this instanceof C39291sE) {
                C39291sE r4 = (C39291sE) this;
                if (r4 instanceof C39471sX) {
                    C39471sX r42 = (C39471sX) r4;
                    ArrayList arrayList = new ArrayList();
                    for (C39481sY r12 : r42.A00) {
                        arrayList.add(new AnonymousClass4UL(r12.A01.getRawString(), r12.A02, r12.A00));
                    }
                    ArrayList A062 = r42.A01.size() > 0 ? C16030sJ.A06(r42.A01) : null;
                    JSONObject jSONObject = new JSONObject();
                    if (A062 != null) {
                        JSONArray jSONArray = new JSONArray();
                        Iterator it = A062.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(it.next());
                        }
                        jSONObject.put("participant_list", jSONArray);
                    }
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass4UL r32 = (AnonymousClass4UL) it2.next();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("jid_string", r32.A01);
                        jSONObject2.put("subject", r32.A02);
                        jSONObject2.put("type", r32.A00);
                        jSONArray2.put(jSONObject2);
                    }
                    jSONObject.put("group_nodes", jSONArray2);
                    return jSONObject.toString();
                } else if (r4 instanceof C39451sV) {
                    String[][] strArr2 = (String[][]) Array.newInstance(String.class, new int[]{3, 2});
                    Iterator it3 = ((C39451sV) r4).A03.iterator();
                    int i2 = 0;
                    while (it3.hasNext() && i2 < strArr2.length) {
                        C39461sW r33 = (C39461sW) it3.next();
                        strArr2[i2][0] = r33.A02.getRawString();
                        strArr2[i2][1] = r33.A03;
                        i2++;
                    }
                    return strArr2;
                } else if (r4 instanceof C39281sD) {
                    return ((C39281sD) r4).A01;
                } else {
                    if (r4.A01.size() > 0) {
                        return C16030sJ.A06(r4.A01);
                    }
                    return null;
                }
            } else if (this instanceof C16730tY) {
                C16750ta r02 = ((C16730tY) this).A02;
                if (r02 != null) {
                    return r02.A01();
                }
                return null;
            } else if (!(this instanceof C30901d9)) {
                return null;
            } else {
                int i3 = ((C30901d9) this).A02;
                if (i3 == 1) {
                    i3 = 0;
                }
                return Integer.valueOf(i3);
            }
        }
    }

    public String A0I() {
        String str;
        byte[] bArr;
        String str2;
        String str3;
        String valueOf;
        String valueOf2;
        String str4;
        String str5;
        if (this instanceof C39321sH) {
            return ((C39321sH) this).A13();
        }
        if (this instanceof C39421sS) {
            return ((C39421sS) this).A00;
        }
        if (this instanceof C39451sV) {
            C39451sV r0 = (C39451sV) this;
            synchronized (r0.A12) {
                str5 = r0.A02;
            }
            return str5;
        } else if (this instanceof C39281sD) {
            C39281sD r02 = (C39281sD) this;
            synchronized (r02.A12) {
                str4 = r02.A00;
            }
            return str4;
        } else if (this instanceof C39401sQ) {
            C39401sQ r03 = (C39401sQ) this;
            synchronized (this) {
                valueOf2 = String.valueOf(r03.A00);
            }
            return valueOf2;
        } else if (this instanceof C39491sZ) {
            return ((C39491sZ) this).A00;
        } else {
            if (this instanceof C39391sP) {
                C39391sP r04 = (C39391sP) this;
                synchronized (this) {
                    valueOf = String.valueOf(r04.A00);
                }
                return valueOf;
            } else if (this instanceof C39171s2) {
                return ((C39171s2) this).A03;
            } else {
                if (this instanceof C39041rp) {
                    C39041rp r1 = (C39041rp) this;
                    synchronized (r1.A12) {
                        C35101lN r05 = r1.A00;
                        if (r05 == null) {
                            str3 = null;
                        } else if (TextUtils.isEmpty(r05.A01)) {
                            str3 = r1.A00.A03;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            C35101lN r12 = r1.A00;
                            sb.append(r12.A03);
                            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                            sb.append(r12.A01);
                            str3 = sb.toString();
                        }
                    }
                    return str3;
                } else if (this instanceof C38741rL) {
                    C38741rL r06 = (C38741rL) this;
                    synchronized (r06.A12) {
                        str2 = r06.A01;
                    }
                    return str2;
                } else {
                    synchronized (this.A12) {
                        if (this.A02 == 1) {
                            str = null;
                        } else {
                            str = this.A0g;
                            if (str == null && (bArr = this.A0z) != null) {
                                try {
                                    str = new String(bArr, AnonymousClass01S.A08);
                                } catch (UnsupportedEncodingException unused) {
                                    str = null;
                                }
                                this.A0g = str;
                            }
                        }
                    }
                    return str;
                }
            }
        }
    }

    public String A0J() {
        boolean z2;
        if (this instanceof C30581cc) {
            return ((C30581cc) this).A06;
        }
        if (this instanceof C39351sL) {
            C39351sL r1 = (C39351sL) this;
            return r1 instanceof C39371sN ? ((C39371sN) r1).A03 : r1 instanceof C39361sM ? ((C39361sM) r1).A02 : r1.A03;
        } else if (this instanceof AnonymousClass1WT) {
            AnonymousClass1WT r4 = (AnonymousClass1WT) this;
            int i2 = r4.A00;
            if (i2 == 28) {
                if (r4.A01 == null) {
                    r4.A03.AcB("sys-msg/number-change/old-jid-persist-null", r4.A13(), true);
                }
            } else if (i2 != 28) {
                return null;
            }
            UserJid userJid = r4.A01;
            if (userJid != null) {
                return userJid.getRawString();
            }
            return null;
        } else {
            if (this instanceof C39421sS) {
                z2 = ((C39421sS) this).A01;
            } else if (this instanceof C39451sV) {
                C16050sL r0 = ((C39451sV) this).A01;
                if (r0 != null) {
                    return r0.getRawString();
                }
                return null;
            } else if (this instanceof C39441sU) {
                return ((C39441sU) this).A00;
            } else {
                if (this instanceof C40211tk) {
                    return ((C40211tk) this).A00;
                }
                if (this instanceof C39301sF) {
                    return ((C39301sF) this).A00;
                }
                if (this instanceof C39431sT) {
                    GroupJid groupJid = ((C39431sT) this).A01;
                    if (groupJid != null) {
                        return groupJid.getRawString();
                    }
                    return null;
                } else if (this instanceof C38871rY) {
                    return ((C38871rY) this).A00;
                } else {
                    if (this instanceof C16730tY) {
                        return ((C16730tY) this).A03;
                    }
                    if (this instanceof C38841rV) {
                        return ((C38841rV) this).A03;
                    }
                    if (this instanceof C30071bh) {
                        return ((C30071bh) this).A04;
                    }
                    if (this instanceof C38651rC) {
                        return ((C38651rC) this).A01;
                    }
                    if (this instanceof C39161s1) {
                        return C16030sJ.A03(((C39161s1) this).A00);
                    }
                    if (!(this instanceof C38601r3)) {
                        return null;
                    }
                    C38601r3 r12 = (C38601r3) this;
                    if (!r12.A00) {
                        return null;
                    }
                    z2 = r12.A01;
                }
            }
            return z2 ? "video" : "audio";
        }
    }

    public String A0K() {
        if (this instanceof C39351sL) {
            C39351sL r1 = (C39351sL) this;
            return r1 instanceof C39371sN ? ((C39371sN) r1).A04 : r1 instanceof C39361sM ? ((C39361sM) r1).A03 : C16030sJ.A03(r1.A01);
        } else if (this instanceof C16730tY) {
            return ((C16730tY) this).A04;
        } else {
            return null;
        }
    }

    public String A0L() {
        if (this instanceof C39351sL) {
            C39351sL r1 = (C39351sL) this;
            return r1 instanceof C39371sN ? ((C39371sN) r1).A00 : r1 instanceof C39361sM ? ((C39361sM) r1).A01 : C16030sJ.A03(r1.A00);
        } else if (this instanceof C16730tY) {
            return ((C16730tY) this).A05;
        } else {
            return null;
        }
    }

    public String A0M() {
        if (this instanceof C30581cc) {
            return ((C30581cc) this).A05;
        }
        if (this instanceof C16730tY) {
            return ((C16730tY) this).A06;
        }
        return null;
    }

    public String A0N() {
        if (this instanceof C30581cc) {
            return ((C30581cc) this).A04;
        }
        if (this instanceof AnonymousClass1WT) {
            AnonymousClass1WT r4 = (AnonymousClass1WT) this;
            int i2 = r4.A00;
            if (i2 == 28) {
                if (r4.A00 == null) {
                    r4.A03.AcB("sys-msg/number-change/new-jid-persist-null", r4.A13(), true);
                }
            } else if (i2 != 28) {
                return null;
            }
            UserJid userJid = r4.A00;
            if (userJid != null) {
                return userJid.getRawString();
            }
            return null;
        } else if (this instanceof C39311sG) {
            return ((C39311sG) this).A00;
        } else {
            if (this instanceof C38831rU) {
                return ((C38831rU) this).A01;
            }
            if (this instanceof C38751rM) {
                return ((C38751rM) this).A15();
            }
            if (this instanceof C38841rV) {
                C39721sx r42 = ((C38841rV) this).A02;
                if (r42 == null) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(r42.A06.getRawString());
                sb.append(",");
                sb.append(Double.toString(r42.A00));
                sb.append(",");
                sb.append(Double.toString(r42.A01));
                sb.append(",");
                sb.append(Long.toString(r42.A05));
                return sb.toString();
            } else if (this instanceof C16730tY) {
                C16730tY r1 = (C16730tY) this;
                return r1 instanceof C38631rA ? r1.A14() : r1.A07;
            } else if (this instanceof C38811rS) {
                return ((C38811rS) this).A00;
            } else {
                if (this instanceof C38741rL) {
                    return ((C38741rL) this).A00;
                }
                if (this instanceof C38761rN) {
                    C38761rN r12 = (C38761rN) this;
                    if (r12.A00) {
                        return Long.toString(r12.A02);
                    }
                    return null;
                } else if (this instanceof C38651rC) {
                    return ((C38651rC) this).A00;
                } else {
                    return null;
                }
            }
        }
    }

    public String A0O() {
        if (this instanceof C30581cc) {
            return ((C30581cc) this).A07;
        }
        if (this instanceof C39371sN) {
            return ((C39371sN) this).A02;
        }
        if (this instanceof C39361sM) {
            return ((C39361sM) this).A04;
        }
        if (this instanceof C39431sT) {
            Integer num = ((C39431sT) this).A02;
            if (num != null) {
                return Integer.toString(num.intValue());
            }
            return null;
        } else if (this instanceof C39411sR) {
            return ((C39411sR) this).A01;
        } else {
            if (this instanceof C38751rM) {
                return ((C38751rM) this).A02;
            }
            if (this instanceof C16730tY) {
                return ((C16730tY) this).A08;
            }
            return null;
        }
    }

    public String A0P() {
        String str;
        if (this instanceof C30581cc) {
            return A0I();
        }
        if (this instanceof AnonymousClass1WU) {
            AnonymousClass1WU r2 = (AnonymousClass1WU) this;
            if (!(r2 instanceof C39281sD)) {
                return r2.A0I();
            }
            C39281sD r22 = (C39281sD) r2;
            synchronized (r22.A12) {
                str = r22.A00;
            }
            return str;
        } else if ((this instanceof C39221s7) || (this instanceof C38831rU) || (this instanceof C39211s6)) {
            return null;
        } else {
            if (this instanceof C39171s2) {
                return ((C39171s2) this).A03;
            }
            if ((this instanceof C38661rD) || (this instanceof C29861bL)) {
                return null;
            }
            if (this instanceof C38871rY) {
                return ((C38871rY) this).A00;
            }
            if ((this instanceof C39061rr) || (this instanceof C39201s5)) {
                return null;
            }
            if (this instanceof C16730tY) {
                return ((C16730tY) this).A03;
            }
            if (this instanceof C38751rM) {
                return null;
            }
            if (this instanceof C38841rV) {
                return ((C38841rV) this).A03;
            }
            if ((this instanceof C39121rx) || (this instanceof C16830ti)) {
                return null;
            }
            if (this instanceof C30071bh) {
                return ((C30071bh) this).A04;
            }
            if ((this instanceof C38791rQ) || (this instanceof C39231s8) || (this instanceof C38971ri)) {
                return null;
            }
            if (this instanceof C38811rS) {
                return ((C38811rS) this).A00;
            }
            if (this instanceof C38741rL) {
                return ((C38741rL) this).A00;
            }
            return null;
        }
    }

    public List A0Q() {
        boolean z2;
        String str;
        if (!(this instanceof AnonymousClass1WU)) {
            return this.A0r;
        }
        AnonymousClass1WU r1 = (AnonymousClass1WU) this;
        if (r1 instanceof C39351sL) {
            z2 = false;
            str = "should not be called for FMessageSystemPayment";
        } else if (r1 instanceof C39291sE) {
            return ((C39291sE) r1).A01;
        } else {
            z2 = false;
            str = "should not be called for FMessageSystem";
        }
        AnonymousClass00B.A0B(str, z2);
        return null;
    }

    public void A0R() {
        String str;
        if (this instanceof AnonymousClass1WU) {
            str = "Cannot change status for FMessageSystem";
        } else if (this instanceof C38601r3) {
            str = "Cannot change status for calls message type";
        } else {
            this.A0C = 0;
            return;
        }
        AnonymousClass00B.A08(str);
    }

    public void A0S(int i2) {
        this.A09 = i2 | this.A09;
    }

    public void A0T(int i2) {
        if (!(this instanceof C39231s8) && !(this instanceof C38971ri)) {
            if (i2 <= 0) {
                this.A04 = 0;
                this.A09 = -257 & this.A09;
                return;
            }
            this.A04 = i2;
            A0S(256);
        }
    }

    public void A0U(int i2) {
        if (this instanceof C30581cc) {
            ((C30581cc) this).A00 = i2;
        } else if (this instanceof C39361sM) {
            ((C39361sM) this).A00 = i2;
        } else if (this instanceof C39381sO) {
            C39381sO r1 = (C39381sO) this;
            boolean z2 = true;
            if (i2 != 1) {
                z2 = false;
            }
            r1.A01 = z2;
        } else if (this instanceof C39331sJ) {
            ((C39331sJ) this).A01 = i2;
        } else if (this instanceof C39291sE) {
            C39291sE r12 = (C39291sE) this;
            if (r12 instanceof C39431sT) {
                ((C39431sT) r12).A00 = i2;
            } else {
                r12.A00 = i2;
            }
        } else if (this instanceof C39411sR) {
            ((C39411sR) this).A00 = i2;
        } else if (this instanceof C38841rV) {
            ((C38841rV) this).A00 = i2;
        } else if (this instanceof C38791rQ) {
            ((C38791rQ) this).A01 = i2;
        } else if (this instanceof C16730tY) {
            C16730tY r13 = (C16730tY) this;
            if (r13 instanceof C38631rA) {
                ((C38631rA) r13).A00 = i2;
            } else {
                r13.A00 = i2;
            }
        } else if (this instanceof C38761rN) {
            C38761rN r14 = (C38761rN) this;
            if (i2 > 0) {
                r14.A00 = true;
                r14.A00 = i2;
            }
        }
    }

    public void A0V(int i2) {
        if (this instanceof C30581cc) {
            ((C30581cc) this).A01 = i2;
        } else if (this instanceof C39451sV) {
            ((C39451sV) this).A00 = i2;
        } else if (this instanceof C39381sO) {
            ((C39381sO) this).A00 = i2;
        } else if (this instanceof C39341sK) {
            C39341sK r1 = (C39341sK) this;
            if (!r1.A01) {
                switch (i2) {
                    case 1:
                        i2 = 8;
                        break;
                    case 2:
                        i2 = 6;
                        break;
                    case 3:
                        i2 = 10;
                        break;
                    case 4:
                        i2 = 7;
                        break;
                    case 5:
                        i2 = 5;
                        break;
                    case 6:
                        i2 = 9;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
            }
            r1.A00 = i2;
        } else if (this instanceof C39331sJ) {
            ((C39331sJ) this).A00 = i2;
        } else if (this instanceof C30071bh) {
            ((C30071bh) this).A00 = i2;
        }
    }

    public void A0W(int i2) {
        if (C42881yp.A00(this.A0C, i2) > 0) {
            StringBuilder sb = new StringBuilder("FMessage/setStatus/statusDowngrade/key=");
            sb.append(this.A11);
            sb.append("; type=");
            sb.append(this.A10);
            sb.append("; current=");
            sb.append(this.A0C);
            sb.append("; new=");
            sb.append(i2);
            Log.e(sb.toString());
        }
        this.A0C = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r3 == r5) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0X(int r5) {
        /*
            r4 = this;
            int r3 = r4.A0D
            if (r3 == 0) goto L_0x0007
            r2 = 0
            if (r3 != r5) goto L_0x0008
        L_0x0007:
            r2 = 1
        L_0x0008:
            java.lang.String r0 = "FMessage/setStorageType/should only update storage type when it is undefined; current="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            java.lang.String r0 = "; new="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A0B(r0, r2)
            r4.A0D = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16740tZ.A0X(int):void");
    }

    public void A0Y(long j2) {
        if (this instanceof C38831rU) {
            ((C38831rU) this).A00 = j2;
        } else if (this instanceof C16730tY) {
            ((C16730tY) this).A01 = j2;
        } else if (this instanceof C38841rV) {
            ((C38841rV) this).A01 = j2;
        } else if (this instanceof C38761rN) {
            C38761rN r3 = (C38761rN) this;
            if (j2 > 0) {
                r3.A00 = true;
                r3.A01 = (int) j2;
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0024 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Z(android.database.Cursor r8) {
        /*
            r7 = this;
            java.lang.String r0 = "thumb_image"
            int r0 = r8.getColumnIndexOrThrow(r0)
            byte[] r1 = r8.getBlob(r0)
            r4 = 0
            if (r1 == 0) goto L_0x0028
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x0025 }
            r0.<init>(r1)     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x0025 }
            java.io.ObjectInputStream r1 = new java.io.ObjectInputStream     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x0025 }
            r1.<init>(r0)     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x0025 }
            java.lang.Object r3 = r1.readObject()     // Catch:{ all -> 0x0020 }
            r1.close()     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x002a }
            goto L_0x0030
        L_0x0020:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0024 }
        L_0x0024:
            throw r0     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x0025 }
        L_0x0025:
            r1 = move-exception
            r3 = r4
            goto L_0x002b
        L_0x0028:
            r3 = r4
            goto L_0x0030
        L_0x002a:
            r1 = move-exception
        L_0x002b:
            java.lang.String r0 = "MessageStoreMessageUtils/readMessageFromCursor"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0030:
            java.lang.String r0 = "media_url"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0r(r0)
            java.lang.String r0 = "media_mime_type"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r1 = r8.getString(r0)
            r2 = r7
            boolean r0 = r7 instanceof X.C30581cc
            if (r0 == 0) goto L_0x012a
            r0 = r2
            X.1cc r0 = (X.C30581cc) r0
            r0.A05 = r1
        L_0x0051:
            java.lang.String r0 = "media_size"
            int r0 = r8.getColumnIndexOrThrow(r0)
            long r0 = r8.getLong(r0)
            r7.A0Y(r0)
            java.lang.String r0 = "media_name"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0q(r0)
            java.lang.String r0 = "media_caption"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0n(r0)
            java.lang.String r0 = "media_hash"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0p(r0)
            java.lang.String r0 = "media_enc_hash"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0o(r0)
            java.lang.String r0 = "media_duration"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r0 = r8.getInt(r0)
            r7.A0U(r0)
            java.lang.String r0 = "latitude"
            int r0 = r8.getColumnIndexOrThrow(r0)
            double r0 = r8.getDouble(r0)
            boolean r6 = r7 instanceof X.C30901d9
            if (r6 == 0) goto L_0x00b2
            r5 = r2
            X.1d9 r5 = (X.C30901d9) r5
            r5.A00 = r0
        L_0x00b2:
            java.lang.String r0 = "longitude"
            int r0 = r8.getColumnIndexOrThrow(r0)
            double r0 = r8.getDouble(r0)
            if (r6 == 0) goto L_0x00c3
            r5 = r2
            X.1d9 r5 = (X.C30901d9) r5
            r5.A01 = r0
        L_0x00c3:
            java.lang.String r0 = "quoted_row_id"
            int r0 = r8.getColumnIndexOrThrow(r0)
            long r0 = r8.getLong(r0)
            r7.A0F = r0
            java.lang.String r0 = "multicast_id"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0l(r0)
            java.lang.String r0 = "edit_version"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r0 = r8.getInt(r0)
            r7.A01 = r0
            java.lang.String r0 = "mentioned_jids"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            java.util.List r0 = X.C39501sa.A01(r0)
            r7.A0u(r0)
            java.lang.String r0 = "payment_transaction_id"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0n = r0
            java.lang.String r0 = "preview_type"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r0 = r8.getInt(r0)
            r7.A0V(r0)
            java.lang.String r0 = "future_message_type"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r1 = r8.getInt(r0)
            boolean r0 = r7 instanceof X.C38791rQ
            if (r0 == 0) goto L_0x0124
            X.1rQ r2 = (X.C38791rQ) r2
            r2.A00 = r1
        L_0x0124:
            r7.A0j(r3)
            r7.A19 = r4
            return
        L_0x012a:
            boolean r0 = r7 instanceof X.C16730tY
            if (r0 == 0) goto L_0x0051
            r0 = r2
            X.0tY r0 = (X.C16730tY) r0
            r0.A06 = r1
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16740tZ.A0Z(android.database.Cursor):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00e9 */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0269  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0a(android.database.Cursor r8, X.C216314v r9) {
        /*
            r7 = this;
            java.lang.String r2 = "table_version"
            int r3 = r8.getColumnIndex(r2)
            java.lang.String r0 = "_id"
            int r0 = r8.getColumnIndexOrThrow(r0)
            long r0 = r8.getLong(r0)
            r7.A13 = r0
            if (r3 >= 0) goto L_0x0281
            long r0 = r7.A13
            r7.A14 = r0
            java.lang.String r0 = "status"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r0 = r8.getInt(r0)
            r7.A0W(r0)
            java.lang.String r0 = "needs_push"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r1 = r8.getInt(r0)
            r2 = 0
            r5 = 2
            r6 = 1
            r0 = 0
            if (r1 != r5) goto L_0x0038
            r0 = 1
        L_0x0038:
            r7.A0t = r0
            java.lang.String r0 = "recipient_count"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r0 = r8.getInt(r0)
            r7.A0A = r0
            java.lang.String r0 = "participant_hash"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0m = r0
            java.lang.String r0 = "origination_flags"
            int r0 = r8.getColumnIndex(r0)
            if (r0 >= 0) goto L_0x0060
            java.lang.String r0 = "forwarded"
            int r0 = r8.getColumnIndexOrThrow(r0)
        L_0x0060:
            int r0 = r8.getInt(r0)
            r7.A0S(r0)
            java.lang.String r0 = "message_add_on_flags"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r1 = r8.getInt(r0)
            int r0 = r7.A07
            r1 = r1 | r0
            r7.A07 = r1
            java.lang.String r0 = "origin"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r0 = r8.getInt(r0)
            r7.A08 = r0
            java.lang.String r0 = "received_timestamp"
            int r0 = r8.getColumnIndexOrThrow(r0)
            long r0 = r8.getLong(r0)
            r7.A0G = r0
            java.lang.String r0 = "receipt_server_timestamp"
            int r0 = r8.getColumnIndexOrThrow(r0)
            long r0 = r8.getLong(r0)
            r7.A0H = r0
            java.lang.String r0 = "starred"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r0 = r8.getInt(r0)
            if (r0 != r6) goto L_0x00a8
            r2 = 1
        L_0x00a8:
            r7.A0x = r2
            java.lang.String r0 = "remote_resource"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0m(r0)
            java.lang.String r0 = "lookup_tables"
            int r0 = r8.getColumnIndexOrThrow(r0)
            long r0 = r8.getLong(r0)
            r7.A17 = r0
            java.lang.String r0 = "thumb_image"
            int r0 = r8.getColumnIndexOrThrow(r0)
            byte[] r1 = r8.getBlob(r0)
            r2 = 0
            if (r1 == 0) goto L_0x00ea
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x00ec }
            r0.<init>(r1)     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x00ec }
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x00ec }
            r3.<init>(r0)     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x00ec }
            java.lang.Object r1 = r3.readObject()     // Catch:{ all -> 0x00e5 }
            r3.close()     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x00e3 }
            goto L_0x00f3
        L_0x00e3:
            r3 = move-exception
            goto L_0x00ee
        L_0x00e5:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00e9 }
        L_0x00e9:
            throw r0     // Catch:{ IOException | ArrayIndexOutOfBoundsException | ClassNotFoundException -> 0x00ec }
        L_0x00ea:
            r1 = r2
            goto L_0x00f3
        L_0x00ec:
            r3 = move-exception
            r1 = r2
        L_0x00ee:
            java.lang.String r0 = "MessageStoreMessageUtils/readMessageFromCursor"
            com.whatsapp.util.Log.e(r0, r3)
        L_0x00f3:
            byte r3 = r7.A10
            java.lang.String r4 = "data"
            if (r3 == r6) goto L_0x0141
            r0 = 5
            if (r3 == r0) goto L_0x0141
            r0 = 3
            if (r3 == r0) goto L_0x0141
            if (r3 == r5) goto L_0x0141
            r0 = 9
            if (r3 == r0) goto L_0x0141
            r0 = 13
            if (r3 == r0) goto L_0x0141
            r0 = 14
            if (r3 == r0) goto L_0x0141
            r0 = 12
            if (r3 == r0) goto L_0x0141
            r0 = 16
            if (r3 == r0) goto L_0x0141
            r0 = 20
            if (r3 == r0) goto L_0x0141
            r0 = 23
            if (r3 == r0) goto L_0x0141
            r0 = 37
            if (r3 == r0) goto L_0x0141
            r0 = 24
            if (r3 == r0) goto L_0x0141
            r0 = 25
            if (r3 == r0) goto L_0x0141
            r0 = 26
            if (r3 == r0) goto L_0x0141
            r0 = 28
            if (r3 == r0) goto L_0x0141
            r0 = 29
            if (r3 == r0) goto L_0x0141
            r0 = 30
            if (r3 == r0) goto L_0x0141
            r0 = 42
            if (r3 == r0) goto L_0x0141
            r0 = 43
            if (r3 != r0) goto L_0x0274
        L_0x0141:
            java.lang.String r0 = "raw_data"
            int r0 = r8.getColumnIndexOrThrow(r0)
            byte[] r3 = r8.getBlob(r0)
            if (r3 != 0) goto L_0x015b
            int r0 = r8.getColumnIndexOrThrow(r4)
            java.lang.String r0 = r8.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0274
        L_0x015b:
            r7.A0v(r3)
        L_0x015e:
            int r0 = r7.A03()
            if (r0 != 0) goto L_0x016f
            java.lang.String r0 = r7.A0I()
            if (r0 != 0) goto L_0x016f
            java.lang.String r0 = ""
            r7.A0k(r0)
        L_0x016f:
            java.lang.String r0 = "media_url"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0r(r0)
            java.lang.String r0 = "media_mime_type"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r3 = r8.getString(r0)
            r5 = r7
            boolean r0 = r7 instanceof X.C30581cc
            if (r0 == 0) goto L_0x0269
            r0 = r5
            X.1cc r0 = (X.C30581cc) r0
            r0.A05 = r3
        L_0x0190:
            java.lang.String r0 = "media_size"
            int r0 = r8.getColumnIndexOrThrow(r0)
            long r3 = r8.getLong(r0)
            r7.A0Y(r3)
            java.lang.String r0 = "media_name"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0q(r0)
            java.lang.String r0 = "media_caption"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0n(r0)
            java.lang.String r0 = "media_hash"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0p(r0)
            java.lang.String r0 = "media_enc_hash"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0o(r0)
            java.lang.String r0 = "media_duration"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r0 = r8.getInt(r0)
            r7.A0U(r0)
            java.lang.String r0 = "latitude"
            int r0 = r8.getColumnIndexOrThrow(r0)
            double r3 = r8.getDouble(r0)
            boolean r6 = r7 instanceof X.C30901d9
            if (r6 == 0) goto L_0x01f1
            r0 = r5
            X.1d9 r0 = (X.C30901d9) r0
            r0.A00 = r3
        L_0x01f1:
            java.lang.String r0 = "longitude"
            int r0 = r8.getColumnIndexOrThrow(r0)
            double r3 = r8.getDouble(r0)
            if (r6 == 0) goto L_0x0202
            r0 = r5
            X.1d9 r0 = (X.C30901d9) r0
            r0.A01 = r3
        L_0x0202:
            java.lang.String r0 = "future_message_type"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r3 = r8.getInt(r0)
            boolean r0 = r7 instanceof X.C38791rQ
            if (r0 == 0) goto L_0x0214
            X.1rQ r5 = (X.C38791rQ) r5
            r5.A00 = r3
        L_0x0214:
            java.lang.String r0 = "quoted_row_id"
            int r0 = r8.getColumnIndexOrThrow(r0)
            long r3 = r8.getLong(r0)
            r7.A0F = r3
            java.lang.String r0 = "multicast_id"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0l(r0)
            java.lang.String r0 = "edit_version"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r0 = r8.getInt(r0)
            r7.A01 = r0
            java.lang.String r0 = "mentioned_jids"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            java.util.List r0 = X.C39501sa.A01(r0)
            r7.A0u(r0)
            java.lang.String r0 = "preview_type"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r0 = r8.getInt(r0)
            r7.A0V(r0)
            r7.A0j(r1)
            r7.A19 = r2
            java.lang.String r0 = "payment_transaction_id"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0n = r0
            return
        L_0x0269:
            boolean r0 = r7 instanceof X.C16730tY
            if (r0 == 0) goto L_0x0190
            r0 = r5
            X.0tY r0 = (X.C16730tY) r0
            r0.A06 = r3
            goto L_0x0190
        L_0x0274:
            int r0 = r8.getColumnIndexOrThrow(r4)
            java.lang.String r0 = r8.getString(r0)
            r7.A0k(r0)
            goto L_0x015e
        L_0x0281:
            java.lang.String r0 = "sort_id"
            int r0 = r8.getColumnIndexOrThrow(r0)
            long r0 = r8.getLong(r0)
            r7.A14 = r0
            java.lang.String r0 = "status"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r0 = r8.getInt(r0)
            r7.A0W(r0)
            java.lang.String r0 = "broadcast"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r1 = r8.getInt(r0)
            r4 = 0
            r3 = 1
            r0 = 0
            if (r1 <= 0) goto L_0x02ac
            r0 = 1
        L_0x02ac:
            r7.A0t = r0
            java.lang.String r0 = "recipient_count"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r0 = r8.getInt(r0)
            r7.A0A = r0
            java.lang.String r0 = "participant_hash"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0m = r0
            java.lang.String r0 = "origination_flags"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r0 = r8.getInt(r0)
            r7.A0S(r0)
            java.lang.String r0 = "origin"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r0 = r8.getInt(r0)
            r7.A08 = r0
            java.lang.String r0 = "received_timestamp"
            int r0 = r8.getColumnIndexOrThrow(r0)
            long r0 = r8.getLong(r0)
            r7.A0G = r0
            java.lang.String r0 = "receipt_server_timestamp"
            int r0 = r8.getColumnIndexOrThrow(r0)
            long r0 = r8.getLong(r0)
            r7.A0H = r0
            java.lang.String r0 = "starred"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r0 = r8.getInt(r0)
            if (r0 != r3) goto L_0x0305
            r4 = 1
        L_0x0305:
            r7.A0x = r4
            java.lang.String r0 = "lookup_tables"
            int r0 = r8.getColumnIndexOrThrow(r0)
            long r0 = r8.getLong(r0)
            r7.A17 = r0
            java.lang.String r0 = "message_add_on_flags"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r1 = r8.getInt(r0)
            int r0 = r7.A07
            r1 = r1 | r0
            r7.A07 = r1
            int r0 = r8.getColumnIndexOrThrow(r2)
            long r3 = r8.getLong(r0)
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x03e1
            java.lang.String r0 = "sender_jid_raw_string"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0m(r0)
            byte r3 = r7.A10
            r2 = 12
            java.lang.String r4 = "data"
            r0 = 1
            if (r3 == r0) goto L_0x038e
            r0 = 5
            if (r3 == r0) goto L_0x038e
            r0 = 3
            if (r3 == r0) goto L_0x038e
            r0 = 2
            if (r3 == r0) goto L_0x038e
            r0 = 9
            if (r3 == r0) goto L_0x038e
            r0 = 13
            if (r3 == r0) goto L_0x038e
            r0 = 14
            if (r3 == r0) goto L_0x038e
            if (r3 == r2) goto L_0x038e
            r0 = 16
            if (r3 == r0) goto L_0x038e
            r0 = 20
            if (r3 == r0) goto L_0x038e
            r0 = 23
            if (r3 == r0) goto L_0x038e
            r0 = 37
            if (r3 == r0) goto L_0x038e
            r0 = 24
            if (r3 == r0) goto L_0x038e
            r0 = 25
            if (r3 == r0) goto L_0x038e
            r0 = 26
            if (r3 == r0) goto L_0x038e
            r0 = 28
            if (r3 == r0) goto L_0x038e
            r0 = 29
            if (r3 == r0) goto L_0x038e
            r0 = 30
            if (r3 == r0) goto L_0x038e
            r0 = 42
            if (r3 == r0) goto L_0x038e
            r0 = 43
            if (r3 != r0) goto L_0x03d5
        L_0x038e:
            java.lang.String r0 = "raw_data"
            int r0 = r8.getColumnIndexOrThrow(r0)
            byte[] r1 = r8.getBlob(r0)
            if (r1 != 0) goto L_0x03a8
            int r0 = r8.getColumnIndexOrThrow(r4)
            java.lang.String r0 = r8.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03d5
        L_0x03a8:
            r7.A0v(r1)
        L_0x03ab:
            if (r3 != r2) goto L_0x03c0
            java.lang.String r0 = "future_message_type"
            int r0 = r8.getColumnIndexOrThrow(r0)
            int r2 = r8.getInt(r0)
            r1 = r7
            boolean r0 = r7 instanceof X.C38791rQ
            if (r0 == 0) goto L_0x03c0
            X.1rQ r1 = (X.C38791rQ) r1
            r1.A00 = r2
        L_0x03c0:
            int r0 = r7.A03()
            if (r0 != 0) goto L_0x03d1
            java.lang.String r0 = r7.A0I()
            if (r0 != 0) goto L_0x03d1
            java.lang.String r0 = ""
            r7.A0k(r0)
        L_0x03d1:
            r0 = 0
            r7.A19 = r0
            return
        L_0x03d5:
            int r0 = r8.getColumnIndexOrThrow(r4)
            java.lang.String r0 = r8.getString(r0)
            r7.A0k(r0)
            goto L_0x03ab
        L_0x03e1:
            java.lang.Class<X.0rv> r2 = X.C15830rv.class
            java.lang.String r0 = "sender_jid_row_id"
            int r0 = r8.getColumnIndexOrThrow(r0)
            long r0 = r8.getLong(r0)
            com.whatsapp.jid.Jid r0 = r9.A07(r2, r0)
            X.0rv r0 = (X.C15830rv) r0
            r7.A0b(r0)
            java.lang.String r0 = "text_data"
            int r0 = r8.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r8.getString(r0)
            r7.A0s(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16740tZ.A0a(android.database.Cursor, X.14v):void");
    }

    public void A0b(C15830rv r5) {
        if (this instanceof AnonymousClass1WU) {
            AnonymousClass1WU r2 = (AnonymousClass1WU) this;
            if (r2 instanceof C39351sL) {
                if (r5 == null) {
                    return;
                }
                if (!r2.A12()) {
                    StringBuilder sb = new StringBuilder("should not be called for FMessageSystem, key = ");
                    sb.append(r2.A11.toString());
                    sb.append(" action = ");
                    sb.append(r2.A00);
                    AnonymousClass00B.A0B(sb.toString(), false);
                }
            } else if (!(r2 instanceof AnonymousClass1WT) && r5 != null) {
                if (!r2.A12()) {
                    StringBuilder sb2 = new StringBuilder("FMessageSystem/setRemoteResourceJid/should not be called for FMessageSystem, key = ");
                    sb2.append(r2.A11.toString());
                    sb2.append(" action = ");
                    sb2.append(r2.A00);
                    Log.e(sb2.toString());
                    return;
                }
            } else {
                return;
            }
            r2.A0M = r5;
            return;
        }
        this.A0M = r5;
        this.A0r = null;
    }

    public void A0c(C40531uH r3) {
        this.A0N = r3;
        if (r3 == null) {
            this.A09 = -1025 & this.A09;
        } else {
            A0S(1024);
        }
    }

    public void A0d(C16740tZ r4) {
        int i2;
        this.A13 = r4.A13;
        this.A14 = r4.A14;
        this.A0I = r4.A0I;
        this.A0G = r4.A0G;
        this.A0M = r4.A0B();
        this.A19 = r4.A19;
        this.A0r = r4.A0Q() != null ? new ArrayList(r4.A0Q()) : null;
        this.A0H = r4.A0H;
        this.A0u = r4.A0u;
        this.A15 = r4.A15;
        AnonymousClass1Vt r2 = r4.A0L;
        if (r2 != null && (this.A0L == null || !((i2 = r2.A03) == 4 || i2 == 20))) {
            this.A0n = r4.A0n;
            this.A0L = r2;
        }
        int i3 = r4.A04;
        if (i3 > 0) {
            this.A04 = i3;
            this.A0Z = r4.A0Z;
            this.A06 = r4.A06;
        }
    }

    public void A0e(C16740tZ r4) {
        String str;
        if (r4 != null) {
            boolean z2 = false;
            if (!(!(this instanceof AnonymousClass1WU) && !(this instanceof C39231s8) && !(this instanceof C38971ri) && !(this instanceof C38541qx))) {
                str = "message type is not allowed to have a quoted message";
            } else if ((r4 instanceof AnonymousClass1WU) || (r4 instanceof C39231s8) || (r4 instanceof C38971ri) || (r4 instanceof C38541qx)) {
                str = "message type can not be a quoted message";
            } else {
                if (r4.A08() == 2) {
                    z2 = true;
                }
                AnonymousClass00B.A0B("quoted message should be marked StorageType.QUOTED", z2);
                r4.A0e((C16740tZ) null);
            }
            AnonymousClass00B.A0B(str, false);
            return;
        }
        this.A0P = r4;
    }

    public void A0f(C39261sB r5) {
        A0E().A00 = r5;
        this.A17 |= 8;
    }

    public void A0g(C39271sC r3) {
        synchronized (this.A12) {
            this.A0T = r3;
        }
    }

    public void A0h(C30771cv r3) {
        this.A0U = r3;
        if (r3 == null) {
            this.A09 = -2049 & this.A09;
        } else {
            A0S(2048);
        }
    }

    public void A0i(Long l2) {
        if (this instanceof C39231s8) {
            AnonymousClass00B.A06(l2);
            C18450wi.A0F(l2);
            ((C39231s8) this).A01 = l2.longValue();
            return;
        }
        if (this instanceof C38971ri) {
            AnonymousClass00B.A0B("For FMessageEphemeralSettingChange the setting timestamp is the timestamp", false);
        }
        this.A0Y = l2;
    }

    public void A0j(Object obj) {
        C16750ta r12;
        int i2;
        C16750ta r122;
        ArrayList arrayList;
        if (this instanceof C30581cc) {
            C30581cc r1 = (C30581cc) this;
            if (obj instanceof TextData) {
                r1.A14((TextData) obj);
            } else if ((obj instanceof byte[]) || obj == null) {
                r1.A08 = (byte[]) obj;
            } else {
                StringBuilder sb = new StringBuilder("FMessageText/setObjectForDatabaseFieldThumbImage/setting wrong object; object.class=");
                sb.append(obj.getClass());
                AnonymousClass00B.A08(sb.toString());
            }
        } else if (this instanceof C39321sH) {
            C39321sH r13 = (C39321sH) this;
            if (obj instanceof ProfilePhotoChange) {
                r13.A00 = (ProfilePhotoChange) obj;
            }
        } else if (this instanceof C39351sL) {
            C39351sL r5 = (C39351sL) this;
            if (obj instanceof String) {
                String[] split = ((String) obj).split(";");
                boolean z2 = false;
                if (split.length == 3) {
                    z2 = true;
                }
                AnonymousClass00B.A0B("Wrong format of expired reference key.", z2);
                r5.A02 = new C28381Vw(UserJid.getNullable(split[0]), split[2], Boolean.valueOf(split[1]).booleanValue());
            }
        } else if (this instanceof AnonymousClass1WT) {
            AnonymousClass1WT r2 = (AnonymousClass1WT) this;
            if (r2.A00 == 10 && (obj instanceof String)) {
                r2.A00 = UserJid.getNullable((String) obj);
            }
        } else if (this instanceof C39291sE) {
            C39291sE r52 = (C39291sE) this;
            if (r52 instanceof C39471sX) {
                C39471sX r53 = (C39471sX) r52;
                if (obj instanceof String) {
                    try {
                        JSONObject jSONObject = new JSONObject((String) obj);
                        JSONArray optJSONArray = jSONObject.optJSONArray("participant_list");
                        int i3 = 0;
                        if (optJSONArray != null) {
                            arrayList = new ArrayList();
                            int length = optJSONArray.length();
                            int i4 = 0;
                            while (i4 < length) {
                                int i5 = i4 + 1;
                                String string = optJSONArray.getString(i4);
                                C18450wi.A0B(string);
                                arrayList.add(string);
                                i4 = i5;
                            }
                        } else {
                            arrayList = null;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("group_nodes");
                        ArrayList arrayList2 = new ArrayList();
                        int length2 = jSONArray.length();
                        while (i3 < length2) {
                            int i6 = i3 + 1;
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                            C18450wi.A0B(jSONObject2);
                            String string2 = jSONObject2.getString("jid_string");
                            Object opt = jSONObject2.opt("subject");
                            String obj2 = opt == null ? null : opt.toString();
                            int i7 = jSONObject2.getInt("type");
                            C18450wi.A0B(string2);
                            arrayList2.add(new AnonymousClass4UL(string2, obj2, i7));
                            i3 = i6;
                        }
                        List list = r53.A00;
                        list.clear();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            AnonymousClass4UL r14 = (AnonymousClass4UL) it.next();
                            GroupJid nullable = GroupJid.getNullable(r14.A01);
                            String str = r14.A02;
                            int i8 = r14.A00;
                            if (nullable != null) {
                                list.add(new C39481sY(nullable, str, i8));
                            } else {
                                Log.e("FMessageSystemWithGroupNodes/setObjectForDatabaseFieldThumbImage/gid is null");
                            }
                        }
                        r53.A13(arrayList);
                    } catch (JSONException unused) {
                        Log.e("FMessageSystemWithGroupNodes/setObjectForDatabaseFieldThumbImage/json exception");
                    }
                }
            } else if (r52 instanceof C39451sV) {
                C39451sV r54 = (C39451sV) r52;
                if (obj instanceof String[][]) {
                    try {
                        String[][] strArr = (String[][]) obj;
                        Set set = r54.A03;
                        set.clear();
                        for (int i9 = 0; i9 < strArr.length; i9++) {
                            C16050sL A052 = C16050sL.A05(strArr[i9][0]);
                            String str2 = strArr[i9][1];
                            if (!(A052 == null || str2 == null)) {
                                set.add(new C39461sW(A052, str2, 2, 0));
                            }
                        }
                    } catch (Exception e2) {
                        Log.e((Throwable) e2);
                    }
                }
            } else if (r52 instanceof C39281sD) {
                C39281sD r55 = (C39281sD) r52;
                if (obj instanceof String) {
                    r55.A01 = (String) obj;
                }
            } else {
                r52.A13(obj);
            }
        } else if (this instanceof C16730tY) {
            C16730tY r22 = (C16730tY) this;
            if (obj instanceof C16750ta) {
                r122 = (C16750ta) obj;
            } else if (obj instanceof MediaData) {
                r122 = C16750ta.A00((MediaData) obj);
            } else {
                StringBuilder sb2 = new StringBuilder("FMessageMedia/setObjectForDatabaseFieldThumbImage/setting wrong object; object.class=");
                sb2.append(obj == null ? "null" : obj.getClass());
                Log.e(sb2.toString());
                r122 = new C16750ta();
            }
            r22.A02 = r122;
        } else if (this instanceof C30901d9) {
            C30901d9 r23 = (C30901d9) this;
            if (obj instanceof C16750ta) {
                r12 = (C16750ta) obj;
            } else if (obj instanceof MediaData) {
                r12 = C16750ta.A00((MediaData) obj);
            } else if (obj instanceof Integer) {
                i2 = ((Number) obj).intValue();
                r23.A02 = i2;
            } else {
                if (obj != null) {
                    StringBuilder sb3 = new StringBuilder("FMessageLocation/setObjectForDatabaseFieldThumbImage/setting wrong object; object.class=");
                    sb3.append(obj.getClass());
                    AnonymousClass00B.A08(sb3.toString());
                }
                i2 = 2;
                r23.A02 = i2;
            }
            if (!r12.A0P) {
                i2 = 0;
                if (r12.A0Z) {
                    i2 = 1;
                }
                r23.A02 = i2;
            }
            i2 = 2;
            r23.A02 = i2;
        }
    }

    public void A0k(String str) {
        synchronized (this.A12) {
            this.A0g = str;
            this.A0z = null;
        }
    }

    public void A0l(String str) {
        if (this instanceof C16730tY) {
            C16730tY r2 = (C16730tY) this;
            r2.A09 = str;
            if (!TextUtils.isEmpty(str)) {
                r2.A0S(64);
            } else {
                r2.A09 = -65 & r2.A09;
            }
        } else {
            this.A09 &= -65;
        }
    }

    public void A0m(String str) {
        if (this instanceof AnonymousClass1WU) {
            AnonymousClass1WU r3 = (AnonymousClass1WU) this;
            if (r3 instanceof C39371sN) {
                ((C39371sN) r3).A01 = str;
            } else if (r3 instanceof C39361sM) {
                ((C39351sL) r3).A03 = str;
            } else if (r3 instanceof AnonymousClass1WT) {
                AnonymousClass1WT r32 = (AnonymousClass1WT) r3;
                if (r32.A00 == 10) {
                    r32.A01 = UserJid.getNullable(str);
                }
            } else {
                r3.A0M = null;
                if (r3.A12() && !TextUtils.isEmpty(str)) {
                    C15830rv A022 = C15830rv.A02(str);
                    r3.A0M = A022;
                    if (A022 == null) {
                        StringBuilder sb = new StringBuilder("Something went wrong with this message, key = ");
                        sb.append(r3.A11.toString());
                        sb.append(" action = ");
                        sb.append(r3.A00);
                        AnonymousClass00B.A0B(sb.toString(), false);
                    }
                }
            }
        } else {
            C15830rv r1 = this.A11.A00;
            if (!C16030sJ.A0G(r1) || C16030sJ.A0Q(r1) || str == null) {
                A0b(C16030sJ.A0Q(r1) ? C16030sJ.A02(str) : TextUtils.isEmpty(str) ? null : C15830rv.A02(str));
            } else {
                A0t(C16030sJ.A08(UserJid.class, Arrays.asList(str.split(","))));
            }
        }
    }

    public void A0n(String str) {
        boolean z2;
        C16300so r2;
        String A132;
        String str2;
        if (this instanceof C30581cc) {
            ((C30581cc) this).A06 = str;
        } else if (this instanceof C39351sL) {
            C39351sL r1 = (C39351sL) this;
            if (r1 instanceof C39371sN) {
                ((C39371sN) r1).A03 = str;
            } else if (r1 instanceof C39361sM) {
                ((C39361sM) r1).A02 = str;
            } else {
                r1.A03 = str;
            }
        } else if (this instanceof AnonymousClass1WT) {
            AnonymousClass1WT r4 = (AnonymousClass1WT) this;
            if (r4.A00 == 28) {
                if (r4.A01 != null) {
                    if (TextUtils.isEmpty(str)) {
                        r2 = r4.A03;
                        A132 = r4.A13();
                        str2 = "sys-msg/number-change/old-jid-null-override";
                    } else if (UserJid.getNullable(str) == null) {
                        r2 = r4.A03;
                        A132 = r4.A13();
                        str2 = "sys-msg/number-change/old-jid-invalid-override";
                    }
                    r2.AcB(str2, A132, false);
                }
                r4.A01 = UserJid.getNullable(str);
            }
        } else if (this instanceof C39421sS) {
            ((C39421sS) this).A01 = "video".equals(str);
        } else if (this instanceof C39451sV) {
            ((C39451sV) this).A01 = C16050sL.A05(str);
        } else if (this instanceof C39441sU) {
            ((C39441sU) this).A00 = str;
        } else if (this instanceof C40211tk) {
            ((C40211tk) this).A00 = str;
        } else if (this instanceof C39301sF) {
            ((C39301sF) this).A00 = str;
        } else if (this instanceof C39431sT) {
            ((C39431sT) this).A01 = C16050sL.A05(str);
        } else if (this instanceof C38871rY) {
            ((C38871rY) this).A00 = str;
        } else if (this instanceof C16730tY) {
            ((C16730tY) this).A03 = str;
        } else if (this instanceof C38841rV) {
            ((C38841rV) this).A03 = str;
        } else if (this instanceof C30071bh) {
            ((C30071bh) this).A04 = str;
        } else if (this instanceof C38651rC) {
            ((C38651rC) this).A01 = str;
        } else if (this instanceof C39161s1) {
            ((C39161s1) this).A00 = UserJid.getNullable(str);
        } else if (this instanceof C38601r3) {
            C38601r3 r12 = (C38601r3) this;
            if (!TextUtils.isEmpty(str)) {
                r12.A01 = "video".equals(str);
                z2 = true;
            } else {
                z2 = false;
            }
            r12.A00 = z2;
        }
    }

    public void A0o(String str) {
        if (this instanceof C39351sL) {
            C39351sL r1 = (C39351sL) this;
            if (r1 instanceof C39371sN) {
                ((C39371sN) r1).A04 = str;
            } else if (r1 instanceof C39361sM) {
                ((C39361sM) r1).A03 = str;
            } else {
                r1.A01 = UserJid.getNullable(str);
            }
        } else if (this instanceof C16730tY) {
            ((C16730tY) this).A04 = str;
        }
    }

    public void A0p(String str) {
        if (this instanceof C39351sL) {
            C39351sL r1 = (C39351sL) this;
            if (r1 instanceof C39371sN) {
                ((C39371sN) r1).A00 = str;
            } else if (r1 instanceof C39361sM) {
                ((C39361sM) r1).A01 = str;
            } else {
                r1.A00 = UserJid.getNullable(str);
            }
        } else if (this instanceof C16730tY) {
            ((C16730tY) this).A05 = str;
        }
    }

    public void A0q(String str) {
        C16300so r2;
        String A132;
        String str2;
        if (this instanceof C30581cc) {
            ((C30581cc) this).A04 = str;
        } else if (this instanceof AnonymousClass1WT) {
            AnonymousClass1WT r4 = (AnonymousClass1WT) this;
            if (r4.A00 == 28) {
                if (r4.A00 != null) {
                    if (TextUtils.isEmpty(str)) {
                        r2 = r4.A03;
                        A132 = r4.A13();
                        str2 = "sys-msg/number-change/new-jid-null-override";
                    } else if (UserJid.getNullable(str) == null) {
                        r2 = r4.A03;
                        A132 = r4.A13();
                        str2 = "sys-msg/number-change/new-jid-invalid-override";
                    }
                    r2.AcB(str2, A132, false);
                }
                r4.A00 = UserJid.getNullable(str);
            }
        } else if (this instanceof C39311sG) {
            ((C39311sG) this).A00 = str;
        } else if (this instanceof C38831rU) {
            ((C38831rU) this).A01 = str;
        } else if (this instanceof C16730tY) {
            ((C16730tY) this).A07 = str;
        } else if (this instanceof C38751rM) {
            C38751rM r22 = (C38751rM) this;
            if (!TextUtils.isEmpty(str)) {
                int indexOf = str.indexOf(10);
                if (indexOf == -1) {
                    r22.A01 = str;
                    return;
                }
                r22.A01 = str.substring(0, indexOf);
                if (str.length() > indexOf) {
                    r22.A00 = str.substring(indexOf + 1);
                }
            }
        } else if (this instanceof C38841rV) {
            C38841rV r42 = (C38841rV) this;
            if (str != null) {
                String[] split = str.split(",");
                if (split.length == 4) {
                    UserJid nullable = UserJid.getNullable(split[0]);
                    AnonymousClass00B.A06(nullable);
                    C39721sx r23 = new C39721sx(nullable);
                    r42.A02 = r23;
                    r23.A00 = Double.parseDouble(split[1]);
                    r23.A01 = Double.parseDouble(split[2]);
                    r23.A05 = Long.parseLong(split[3]);
                }
            }
        } else if (this instanceof C38811rS) {
            ((C38811rS) this).A00 = str;
        } else if (this instanceof C38741rL) {
            ((C38741rL) this).A00 = str;
        } else if (this instanceof C38761rN) {
            C38761rN r7 = (C38761rN) this;
            long A012 = C29501aj.A01(str, 0);
            if (A012 < 0 || A012 > 2147483648L) {
                A012 = 0;
            }
            r7.A02 = A012;
            if (A012 > 0) {
                r7.A00 = true;
            }
        } else if (this instanceof C38651rC) {
            ((C38651rC) this).A00 = str;
        }
    }

    public void A0r(String str) {
        if (this instanceof C30581cc) {
            ((C30581cc) this).A07 = str;
        } else if (this instanceof C39371sN) {
            ((C39371sN) this).A02 = str;
        } else if (this instanceof C39361sM) {
            ((C39361sM) this).A04 = str;
        } else if (this instanceof C39431sT) {
            C39431sT r3 = (C39431sT) this;
            Integer num = null;
            if (str != null) {
                try {
                    num = Integer.valueOf(Integer.parseInt(str));
                } catch (NumberFormatException e2) {
                    Log.e("FMessageSystemCommunityLinkChanged/could not format number. Error = ", e2);
                }
            }
            r3.A02 = num;
        } else if (this instanceof C39411sR) {
            ((C39411sR) this).A01 = str;
        } else if (this instanceof C38751rM) {
            ((C38751rM) this).A02 = str;
        } else if (this instanceof C16730tY) {
            ((C16730tY) this).A08 = str;
        }
    }

    public void A0s(String str) {
        if (this instanceof C30581cc) {
            A0k(str);
        } else if (this instanceof AnonymousClass1WU) {
            AnonymousClass1WU r2 = (AnonymousClass1WU) this;
            if (r2 instanceof C39281sD) {
                C39281sD r22 = (C39281sD) r2;
                synchronized (r22.A12) {
                    r22.A00 = str;
                }
                return;
            }
            r2.A0k(str);
        } else if (!(this instanceof C39221s7) && !(this instanceof C38831rU) && !(this instanceof C39211s6)) {
            if (this instanceof C39171s2) {
                C39171s2 r0 = (C39171s2) this;
                if (str == null) {
                    str = "";
                }
                r0.A03 = str;
            } else if (!(this instanceof C38661rD) && !(this instanceof C29861bL)) {
                if (this instanceof C38871rY) {
                    ((C38871rY) this).A00 = str;
                } else if (!(this instanceof C39061rr) && !(this instanceof C39201s5)) {
                    if (this instanceof C16730tY) {
                        ((C16730tY) this).A03 = str;
                    } else if (this instanceof C38751rM) {
                    } else {
                        if (this instanceof C38841rV) {
                            ((C38841rV) this).A03 = str;
                        } else if (!(this instanceof C39121rx) && !(this instanceof C16830ti)) {
                            if (this instanceof C30071bh) {
                                ((C30071bh) this).A04 = str;
                            } else if (!(this instanceof C38791rQ) && !(this instanceof C39231s8) && !(this instanceof C38971ri)) {
                                if (this instanceof C38811rS) {
                                    ((C38811rS) this).A00 = str;
                                } else if (this instanceof C38741rL) {
                                    ((C38741rL) this).A00 = str;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void A0t(List list) {
        boolean z2;
        String str;
        if (this instanceof AnonymousClass1WU) {
            AnonymousClass1WU r1 = (AnonymousClass1WU) this;
            if (r1 instanceof C39351sL) {
                z2 = false;
                str = "should not be called for FMessageSystemPayment";
            } else if (r1 instanceof C39291sE) {
                C39291sE r12 = (C39291sE) r1;
                if (list == null) {
                    list = new ArrayList();
                }
                r12.A01 = list;
                return;
            } else {
                z2 = false;
                str = "should not be called for FMessageSystem";
            }
            AnonymousClass00B.A0B(str, z2);
            return;
        }
        this.A0M = null;
        this.A0r = list;
    }

    public final void A0u(List list) {
        if (list == null || list.isEmpty()) {
            this.A0q = null;
            return;
        }
        this.A0q = new ArrayList(list);
        this.A17 |= 1;
    }

    public void A0v(byte[] bArr) {
        synchronized (this.A12) {
            this.A0z = bArr;
            this.A0g = null;
            this.A02 = 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r3.A0z != null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0w() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A12
            monitor-enter(r2)
            java.lang.String r0 = r3.A0g     // Catch:{ all -> 0x000f }
            if (r0 != 0) goto L_0x000c
            byte[] r1 = r3.A0z     // Catch:{ all -> 0x000f }
            r0 = 0
            if (r1 == 0) goto L_0x000d
        L_0x000c:
            r0 = 1
        L_0x000d:
            monitor-exit(r2)     // Catch:{ all -> 0x000f }
            return r0
        L_0x000f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x000f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16740tZ.A0w():boolean");
    }

    public boolean A0x() {
        long j2 = (long) 8;
        return (this.A17 & j2) == j2;
    }

    public boolean A0y() {
        List list = this.A0q;
        return list != null && !list.isEmpty();
    }

    public boolean A0z() {
        return !(this instanceof AnonymousClass1WU) && !(this instanceof C38661rD) && !(this instanceof C38791rQ) && !(this instanceof C38601r3);
    }

    public boolean A10(int i2) {
        return (this.A09 & i2) == i2;
    }

    public byte[] A11() {
        byte[] bArr;
        String str;
        synchronized (this.A12) {
            bArr = this.A0z;
            if (bArr == null && (str = this.A0g) != null) {
                try {
                    bArr = str.getBytes(AnonymousClass01S.A08);
                } catch (UnsupportedEncodingException unused) {
                    bArr = null;
                }
                this.A0z = bArr;
            }
        }
        return bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" key=");
        sb.append(this.A11);
        sb.append(" media_wa_type=");
        sb.append(this.A10);
        return sb.toString();
    }
}
