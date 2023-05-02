package X;

import android.content.Context;
import android.content.res.Resources;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0sP  reason: invalid class name and case insensitive filesystem */
public class C16080sP {
    public List A00;
    public final C16040sK A01;
    public final C16000sG A02;
    public final C17140ub A03;
    public final C18190wI A04;
    public final AnonymousClass11R A05;
    public final C16980tz A06;
    public final AnonymousClass013 A07;
    public final C15810rt A08;
    public final C16070sO A09;
    public final C14710pd A0A;
    public final C20260zl A0B;
    public final ConcurrentHashMap A0C = new ConcurrentHashMap();
    public final ConcurrentHashMap A0D = new ConcurrentHashMap();

    public C16080sP(C16040sK r2, C16000sG r3, C17140ub r4, C18190wI r5, AnonymousClass11R r6, C16980tz r7, AnonymousClass013 r8, C15810rt r9, C16070sO r10, C14710pd r11, C20260zl r12) {
        this.A0A = r11;
        this.A06 = r7;
        this.A01 = r2;
        this.A08 = r9;
        this.A0B = r12;
        this.A02 = r3;
        this.A07 = r8;
        this.A03 = r4;
        this.A04 = r5;
        this.A09 = r10;
        this.A05 = r6;
    }

    public static CharSequence A00(Context context, AnonymousClass013 r3, C16010sH r4) {
        int i2;
        Integer num = r4.A0I;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return r4.A0R;
        }
        switch (intValue) {
            case 1:
                i2 = R.string.str1287;
                break;
            case 2:
                i2 = R.string.str128b;
                break;
            case 3:
                i2 = R.string.str1292;
                break;
            case 4:
                i2 = R.string.str1286;
                break;
            case 5:
                i2 = R.string.str1285;
                break;
            case 6:
                i2 = R.string.str128e;
                break;
            case 7:
                i2 = R.string.str128c;
                break;
            case 8:
                i2 = R.string.str1282;
                break;
            case 9:
                i2 = R.string.str1283;
                break;
            case 10:
                i2 = R.string.str1284;
                break;
            case 11:
                i2 = R.string.str1288;
                break;
            case 12:
                i2 = R.string.str1289;
                break;
            case 13:
                i2 = R.string.str128d;
                break;
            case 14:
                i2 = R.string.str128f;
                break;
            case 15:
                i2 = R.string.str1290;
                break;
            case 16:
                i2 = R.string.str1291;
                break;
            case 17:
                i2 = R.string.str1293;
                break;
            case 18:
                i2 = R.string.str1294;
                break;
            case 19:
                i2 = R.string.str1281;
                break;
            case 20:
                i2 = R.string.str128a;
                break;
            default:
                return r3.A00.getResources().getString(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(intValue));
        }
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf != null) {
            return context.getString(valueOf.intValue());
        }
        return r3.A00.getResources().getString(ContactsContract.CommonDataKinds.Phone.getTypeLabelResource(intValue));
    }

    public static boolean A01(C16080sP r1, C16010sH r2, List list) {
        return r1.A0T(r2, list, true);
    }

    public static boolean A02(C16010sH r2) {
        if (C16030sJ.A0G(r2.A0E) || !TextUtils.isEmpty(r2.A09())) {
            return false;
        }
        return r2.A0H() ? !r2.A0F() && !TextUtils.isEmpty(r2.A0B()) : !TextUtils.isEmpty(r2.A0W);
    }

    public final int A03(C34841kx r4) {
        C30361cE A042 = this.A09.A07.A04(r4);
        boolean A0M = A042.A0M(this.A01);
        int size = A042.A04.size();
        return A0M ? size - 1 : size;
    }

    public C16090sQ A04(C16010sH r4, int i2) {
        if (!r4.A0L()) {
            return A06(r4, i2, false, true);
        }
        return new C16090sQ(C40621uQ.VERIFIED_NAME, A0I(r4, false));
    }

    public final C16090sQ A05(C16010sH r5, int i2, boolean z2) {
        String A0F;
        C40621uQ r1;
        C16010sH A082;
        C15830rv r12 = r5.A0E;
        if (!(r12 instanceof AnonymousClass1ZX) || (A082 = this.A02.A08(r12)) == null) {
            A0F = A0F(r5);
            if (TextUtils.isEmpty(A0F) || ((!this.A04.A01.A0E(C16620tM.A02, 604) || !(i2 == 1 || i2 == 4 || i2 == 5)) && i2 != 7)) {
                if (z2) {
                    A0F = this.A07.A0H(C24561Gk.A01(r5));
                } else {
                    C15830rv r0 = (C15830rv) r5.A08(C15830rv.class);
                    if (r0 == null) {
                        A0F = null;
                        r1 = C40621uQ.UNKNOWN;
                    } else {
                        A0F = C24561Gk.A03(r0);
                    }
                }
                r1 = C40621uQ.PHONE_NUMBER;
            } else {
                r1 = C40621uQ.PUSH_NAME;
            }
        } else {
            A0F = A082.A09();
            r1 = C40621uQ.CONTACT_NAME;
        }
        return new C16090sQ(r1, A0F);
    }

    public final C16090sQ A06(C16010sH r4, int i2, boolean z2, boolean z3) {
        if (z3 || r4.A0D == null || TextUtils.isEmpty(r4.A0N) || r4.A0K()) {
            C16090sQ A072 = A07(r4, z2);
            return TextUtils.isEmpty(A072.A01) ? A05(r4, i2, true) : A072;
        }
        return new C16090sQ(C40621uQ.GIVEN_NAME, r4.A0N);
    }

    public C16090sQ A07(C16010sH r7, boolean z2) {
        String A0I;
        C40621uQ r0;
        String A092;
        C40621uQ r02;
        int i2;
        if (C16030sJ.A0Q(r7.A0E)) {
            A0I = this.A06.A00.getString(R.string.str0dac);
            r0 = C40621uQ.MY_STATUS;
        } else if (r7.A0K() || (A0Q(r7) && r7.A0H() && ((i2 = r7.A06) == 2 || i2 == 3))) {
            A0I = A0I(r7, z2);
            r0 = C40621uQ.VERIFIED_NAME;
        } else {
            if (!TextUtils.isEmpty(r7.A09())) {
                A092 = r7.A09();
                r02 = C40621uQ.CONTACT_NAME;
            } else {
                if (r7.A0J()) {
                    A092 = this.A08.A09((C15830rv) r7.A08(C15830rv.class));
                    if (TextUtils.isEmpty(A092)) {
                        A092 = this.A06.A00.getString(R.string.str0b14);
                    }
                } else if (C16030sJ.A0G(r7.A0E)) {
                    Jid A082 = r7.A08(C34841kx.class);
                    AnonymousClass00B.A06(A082);
                    int A032 = A03((C34841kx) A082);
                    A092 = this.A06.A00.getResources().getQuantityString(R.plurals.plurals0009, A032, new Object[]{Integer.valueOf(A032)});
                    r02 = C40621uQ.RECIPIENTS_COUNT;
                } else {
                    C15830rv r1 = (C15830rv) r7.A08(C15830rv.class);
                    A0I = null;
                    A092 = r1 == null ? null : this.A08.A09(r1);
                    if (TextUtils.isEmpty(A092)) {
                        r0 = C40621uQ.UNKNOWN;
                    }
                }
                r02 = C40621uQ.CHAT_SUBJECT;
            }
            return new C16090sQ(r02, A092);
        }
        return new C16090sQ(r0, A0I);
    }

    public String A08(C16010sH r3) {
        return A0G(r3, -1, false);
    }

    public String A09(C16010sH r4) {
        if (!C16030sJ.A0G(r4.A0E) || !TextUtils.isEmpty(r4.A09())) {
            return A08(r4);
        }
        Jid A082 = r4.A08(C34841kx.class);
        AnonymousClass00B.A06(A082);
        return A0K((C16060sN) A082, -1, true);
    }

    public String A0A(C16010sH r6) {
        C16040sK r4 = this.A01;
        if (!r4.A0I(r6.A0E)) {
            return r6.A0D != null ? A08(r6) : this.A07.A0H(C24561Gk.A01(r6));
        }
        if (!this.A0A.A0E(C16620tM.A02, 1967)) {
            return this.A06.A00.getString(R.string.str1ba8);
        }
        r4.A0B();
        String A042 = C24561Gk.A04(r4.A05);
        if (!r4.A0G()) {
            C16000sG r1 = this.A02;
            C16040sK r0 = r1.A01;
            r0.A0B();
            C16010sH A092 = r1.A09(r0.A05);
            if (A092 != null) {
                return A08(A092);
            }
        } else {
            String string = this.A05.A00().getString("self_contact_name", (String) null);
            if (string != null) {
                return string;
            }
        }
        return this.A07.A0H(A042);
    }

    public String A0B(C16010sH r3) {
        if (this.A01.A0I(r3.A0E)) {
            return this.A06.A00.getString(R.string.str1ba8);
        }
        if (r3.A0D != null) {
            return A08(r3);
        }
        if (!TextUtils.isEmpty(r3.A0W)) {
            return A0F(r3);
        }
        return null;
    }

    public String A0C(C16010sH r3) {
        return A06(r3, -1, false, false).A01;
    }

    public String A0D(C16010sH r7) {
        if (C16030sJ.A0Q(r7.A0E)) {
            return this.A06.A00.getString(R.string.str0dac);
        }
        if (r7.A0K()) {
            return A0I(r7, false);
        }
        if (!TextUtils.isEmpty(r7.A09())) {
            return r7.A09();
        }
        if (!TextUtils.isEmpty(r7.A0J)) {
            return r7.A0J;
        }
        if (r7.A0J()) {
            String A092 = this.A08.A09((C15830rv) r7.A08(C15830rv.class));
            return TextUtils.isEmpty(A092) ? this.A06.A00.getString(R.string.str0b14) : A092;
        } else if (C16030sJ.A0G(r7.A0E)) {
            Jid A082 = r7.A08(C34841kx.class);
            AnonymousClass00B.A06(A082);
            int A032 = A03((C34841kx) A082);
            return this.A06.A00.getResources().getQuantityString(R.plurals.plurals0009, A032, new Object[]{Integer.valueOf(A032)});
        } else {
            String A093 = this.A08.A09((C15830rv) r7.A08(C15830rv.class));
            return TextUtils.isEmpty(A093) ? A05(r7, -1, true).A01 : A093;
        }
    }

    public String A0E(C16010sH r7) {
        if (C16030sJ.A0Q(r7.A0E)) {
            return this.A06.A00.getString(R.string.str0dac);
        }
        if (r7.A0K()) {
            return A0I(r7, false);
        }
        if (!TextUtils.isEmpty(r7.A09())) {
            return r7.A09();
        }
        if (r7.A0J()) {
            String A092 = this.A08.A09((C15830rv) r7.A08(C15830rv.class));
            return TextUtils.isEmpty(A092) ? this.A06.A00.getString(R.string.str0b14) : A092;
        } else if (C16030sJ.A0G(r7.A0E)) {
            Jid A082 = r7.A08(C34841kx.class);
            AnonymousClass00B.A06(A082);
            int A032 = A03((C34841kx) A082);
            return this.A06.A00.getResources().getQuantityString(R.plurals.plurals0009, A032, new Object[]{Integer.valueOf(A032)});
        } else {
            String A093 = this.A08.A09((C15830rv) r7.A08(C15830rv.class));
            return TextUtils.isEmpty(A093) ? !TextUtils.isEmpty(r7.A0W) ? A0F(r7) : this.A07.A0H(C24561Gk.A01(r7)) : A093;
        }
    }

    public String A0F(C16010sH r7) {
        Context context;
        int i2;
        Object[] objArr;
        String A0B2;
        if (!r7.A0H() && !TextUtils.isEmpty(r7.A0W)) {
            context = this.A06.A00;
            i2 = R.string.str1c3f;
            objArr = new Object[1];
            A0B2 = r7.A0W;
        } else if ((!r7.A0H() || r7.A0F() || TextUtils.isEmpty(r7.A0B())) && !C40561uK.A01(this.A0B, r7.A0E)) {
            return "";
        } else {
            context = this.A06.A00;
            i2 = R.string.str1c3f;
            objArr = new Object[1];
            A0B2 = r7.A0B();
        }
        objArr[0] = A0B2;
        return context.getString(i2, objArr);
    }

    public String A0G(C16010sH r2, int i2, boolean z2) {
        return A06(r2, i2, z2, true).A01;
    }

    public String A0H(C16010sH r4, boolean z2) {
        C16090sQ A072 = A07(r4, false);
        if (TextUtils.isEmpty(A072.A01)) {
            A072 = A05(r4, -1, z2);
        }
        return A072.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (android.text.TextUtils.isEmpty(r4.A09()) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0I(X.C16010sH r4, boolean r5) {
        /*
            r3 = this;
            X.0rv r0 = r4.A0E
            boolean r0 = X.C16030sJ.A0P(r0)
            if (r0 != 0) goto L_0x0028
            int r1 = r4.A06
            r0 = 3
            if (r1 == r0) goto L_0x0018
            boolean r0 = r3.A0Q(r4)
            r2 = 2
            if (r0 == 0) goto L_0x002d
            int r0 = r4.A06
            if (r0 != r2) goto L_0x002d
        L_0x0018:
            if (r5 != 0) goto L_0x0028
            X.1ko r0 = r4.A0D
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = r4.A09()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x003e
        L_0x0028:
            java.lang.String r0 = r4.A0B()
            return r0
        L_0x002d:
            int r1 = r4.A06
            if (r1 == r2) goto L_0x0043
            r0 = 1
            if (r1 == r0) goto L_0x0043
            boolean r0 = r4.A0J()
            if (r0 == 0) goto L_0x0052
            boolean r0 = r4.A0a
            if (r0 == 0) goto L_0x0052
        L_0x003e:
            java.lang.String r0 = r4.A09()
            return r0
        L_0x0043:
            X.1ko r0 = r4.A0D
            if (r0 != 0) goto L_0x003e
            java.lang.String r0 = r4.A09()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0052
            goto L_0x003e
        L_0x0052:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16080sP.A0I(X.0sH, boolean):java.lang.String");
    }

    @Deprecated
    public String A0J(GroupJid groupJid) {
        if (groupJid == null) {
            return null;
        }
        return this.A08.A09(groupJid);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        if (X.C16030sJ.A0H(r12) != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A0K(X.C16060sN r12, int r13, boolean r14) {
        /*
            r11 = this;
            r5 = r11
            if (r14 == 0) goto L_0x0045
            java.util.concurrent.ConcurrentHashMap r2 = r11.A0D
        L_0x0005:
            java.lang.Object r0 = r2.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0060
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            X.0sO r0 = r11.A09
            X.0us r0 = r0.A07
            X.1cE r0 = r0.A04(r12)
            X.0uz r0 = r0.A04()
            X.1Ub r4 = r0.iterator()
            r3 = 0
        L_0x0023:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0048
            java.lang.Object r1 = r4.next()
            X.1ck r1 = (X.C30661ck) r1
            X.0sK r0 = r11.A01
            com.whatsapp.jid.UserJid r1 = r1.A03
            boolean r0 = r0.A0I(r1)
            if (r0 == 0) goto L_0x003b
            r3 = 1
            goto L_0x0023
        L_0x003b:
            X.0sG r0 = r11.A02
            X.0sH r0 = r0.A0A(r1)
            r6.add(r0)
            goto L_0x0023
        L_0x0045:
            java.util.concurrent.ConcurrentHashMap r2 = r11.A0C
            goto L_0x0005
        L_0x0048:
            r7 = -1
            if (r14 == 0) goto L_0x004d
            r7 = 10
        L_0x004d:
            if (r3 == 0) goto L_0x0056
            boolean r0 = X.C16030sJ.A0H(r12)
            r9 = 1
            if (r0 == 0) goto L_0x0057
        L_0x0056:
            r9 = 0
        L_0x0057:
            r10 = 0
            r8 = r13
            java.lang.String r0 = r5.A0M(r6, r7, r8, r9, r10)
            r2.put(r12, r0)
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16080sP.A0K(X.0sN, int, boolean):java.lang.String");
    }

    public String A0L(Iterable iterable, int i2) {
        HashSet hashSet = new HashSet();
        return A0M(hashSet, -1, i2, A0U(iterable, hashSet), true);
    }

    public String A0M(Iterable iterable, int i2, int i3, boolean z2, boolean z3) {
        List A0O = A0O(iterable, i3, z2, z3);
        int size = A0O.size();
        if (size > i2 && i2 >= 0) {
            Object[] objArr = new String[(i2 + 1)];
            for (int i4 = 0; i4 < i2; i4++) {
                objArr[i4] = A0O.get(i4);
            }
            int i5 = size - i2;
            objArr[i2] = this.A07.A0J(new Object[]{Integer.valueOf(i5)}, R.plurals.plurals00e5, (long) i5);
            A0O = Arrays.asList(objArr);
        }
        return C40631uR.A00(this.A07, A0O, z3);
    }

    public ArrayList A0N(Context context, C35541m6 r11, List list) {
        String str;
        int size;
        int i2;
        String A082;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            C15830rv r1 = (C15830rv) it.next();
            C16010sH A0A2 = this.A02.A0A(r1);
            if (this.A01.A0I(r1) && this.A0A.A0E(C16620tM.A02, 1967)) {
                A082 = C40641uS.A00(context, this, this.A07, A0A2);
            } else if (C16030sJ.A0Q(A0A2.A0E)) {
                z2 = true;
            } else {
                A082 = A08(A0A2);
                if (A082 == null) {
                }
            }
            arrayList.add(A082);
        }
        if (z2) {
            int i3 = r11.A00;
            if (i3 == 0) {
                str = context.getString(R.string.str1685);
            } else {
                Resources resources = context.getResources();
                if (i3 == 1) {
                    size = r11.A01.size();
                    i2 = R.plurals.plurals013f;
                } else if (i3 == 2) {
                    size = r11.A02.size();
                    i2 = R.plurals.plurals0140;
                } else {
                    str = "";
                }
                str = resources.getQuantityString(i2, size, new Object[]{Integer.valueOf(size)});
            }
            arrayList.add(0, str);
        }
        return arrayList;
    }

    public List A0O(Iterable iterable, int i2, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C16010sH r4 = (C16010sH) it.next();
            String str = A06(r4, i2, false, z3).A01;
            if (str != null) {
                if (A0S(r4, -1)) {
                    arrayList2.add(str);
                } else {
                    arrayList.add(str);
                }
            }
        }
        Collator instance = Collator.getInstance(AnonymousClass013.A00(this.A07.A00));
        instance.setDecomposition(1);
        Collections.sort(arrayList, instance);
        Collections.sort(arrayList2);
        arrayList.addAll(arrayList2);
        if (z2) {
            arrayList.add(this.A06.A00.getString(R.string.str1ba8));
        }
        return arrayList;
    }

    public void A0P(C16060sN r2) {
        this.A0C.remove(r2);
        this.A0D.remove(r2);
    }

    public boolean A0Q(C16010sH r4) {
        C14710pd r2;
        int i2;
        String str = r4.A0P;
        if (str != null && str.startsWith("smb:")) {
            r2 = this.A0A;
            i2 = 2520;
        } else if (!r4.A0I()) {
            return false;
        } else {
            r2 = this.A0A;
            i2 = 2519;
        }
        return !r2.A0E(C16620tM.A02, i2);
    }

    public boolean A0R(C16010sH r4) {
        if (r4.A0D != null) {
            String A092 = r4.A09();
            String A0B2 = r4.A0B();
            return !TextUtils.isEmpty(A0B2) && !TextUtils.isEmpty(A092) && AnonymousClass1ZW.A08(A092).equals(AnonymousClass1ZW.A08(A0B2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r1 == false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        r1 = r7.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (A02(r7) == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0S(X.C16010sH r7, int r8) {
        /*
            r6 = this;
            X.0wI r0 = r6.A04
            X.0pd r2 = r0.A01
            r1 = 604(0x25c, float:8.46E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r5 = r2.A0E(r0, r1)
            r4 = 0
            r3 = 1
            if (r5 == 0) goto L_0x0017
            boolean r0 = A02(r7)
            r1 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            if (r8 == r3) goto L_0x0023
            r0 = 4
            if (r8 == r0) goto L_0x0023
            r0 = 5
            if (r8 == r0) goto L_0x0023
            r0 = 7
            if (r8 != r0) goto L_0x0026
        L_0x0023:
            r2 = 1
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            if (r5 == 0) goto L_0x004e
            boolean r0 = r7.A0F()
            if (r0 != 0) goto L_0x0056
        L_0x002f:
            r1 = 1
        L_0x0030:
            X.0rv r0 = r7.A0E
            boolean r0 = X.C16030sJ.A0G(r0)
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = r7.A09()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x004d
            if (r2 != 0) goto L_0x004d
            java.lang.String r0 = r7.A0B()
            if (r0 == 0) goto L_0x004c
            if (r1 == 0) goto L_0x004d
        L_0x004c:
            r4 = 1
        L_0x004d:
            return r4
        L_0x004e:
            int r1 = r7.A06
            r0 = 2
            if (r1 == r0) goto L_0x002f
            if (r1 != r3) goto L_0x0056
            goto L_0x002f
        L_0x0056:
            r1 = 0
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16080sP.A0S(X.0sH, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r8.A0E(r4, 2630) == false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0T(X.C16010sH r19, java.util.List r20, boolean r21) {
        /*
            r18 = this;
            r17 = 1
            r1 = r20
            if (r20 == 0) goto L_0x01b1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01b1
            r2 = r19
            java.lang.String r0 = r2.A09()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r7 = r18
            if (r0 != 0) goto L_0x0086
            java.lang.String r0 = r2.A09()
            java.lang.String r6 = X.C40651uT.A04(r0)
        L_0x0022:
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r3 = r2.A08(r0)
            X.AnonymousClass00B.A06(r3)
            X.0rv r3 = (X.C15830rv) r3
            java.lang.String r16 = X.C24561Gk.A03(r3)
            X.0sK r5 = r7.A01
            boolean r0 = r5.A0I(r3)
            if (r0 == 0) goto L_0x004e
            X.0pd r8 = r7.A0A
            r0 = 1967(0x7af, float:2.756E-42)
            X.0tM r4 = X.C16620tM.A02
            boolean r0 = r8.A0E(r4, r0)
            if (r0 == 0) goto L_0x004e
            r0 = 2630(0xa46, float:3.685E-42)
            boolean r4 = r8.A0E(r4, r0)
            r0 = 1
            if (r4 != 0) goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            r15 = 0
            if (r0 == 0) goto L_0x0145
            java.util.List r0 = r7.A00
            if (r0 != 0) goto L_0x00a6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.A00 = r0
            X.0tz r0 = r7.A06
            android.content.Context r0 = r0.A00
            android.content.res.Resources r4 = r0.getResources()
            r0 = 2130903062(0x7f030016, float:1.7412931E38)
            java.lang.String[] r11 = r4.getStringArray(r0)
            int r10 = r11.length
            r9 = 0
        L_0x006e:
            if (r9 >= r10) goto L_0x00a6
            r8 = r11[r9]
            java.util.List r4 = r7.A00
            X.013 r0 = r7.A07
            android.content.Context r0 = r0.A00
            java.util.Locale r0 = X.AnonymousClass013.A00(r0)
            java.lang.String r0 = r8.toLowerCase(r0)
            r4.add(r0)
            int r9 = r9 + 1
            goto L_0x006e
        L_0x0086:
            X.0rv r0 = r2.A0E
            boolean r0 = X.C16030sJ.A0G(r0)
            if (r0 == 0) goto L_0x00a0
            java.lang.Class<X.1kx> r0 = X.C34841kx.class
            com.whatsapp.jid.Jid r4 = r2.A08(r0)
            X.AnonymousClass00B.A06(r4)
            X.0sN r4 = (X.C16060sN) r4
            r3 = -1
            r0 = 0
            java.lang.String r6 = r7.A0K(r4, r3, r0)
            goto L_0x0022
        L_0x00a0:
            java.lang.String r6 = X.C24561Gk.A01(r2)
            goto L_0x0022
        L_0x00a6:
            java.util.List r0 = r7.A00
            if (r0 == 0) goto L_0x00d1
            java.util.Iterator r9 = r0.iterator()
        L_0x00ae:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r8 = r9.next()
            java.lang.String r8 = (java.lang.String) r8
            java.util.Iterator r4 = r1.iterator()
        L_0x00be:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x00be
            return r17
        L_0x00d1:
            java.util.Iterator r14 = r1.iterator()
        L_0x00d5:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0145
            java.lang.Object r8 = r14.next()
            java.lang.String r8 = (java.lang.String) r8
            r5.A0B()
            X.1Zb r9 = r5.A01
            if (r9 == 0) goto L_0x00d5
            X.0tz r0 = r7.A06
            android.content.Context r4 = r0.A00
            X.013 r0 = r7.A07
            java.lang.String r0 = X.C40641uS.A00(r4, r7, r0, r9)
            java.lang.String r13 = r9.A0N
            java.lang.String r12 = r9.A0M
            java.lang.String r11 = r9.A0W
            java.lang.String r10 = r9.A0S
            java.lang.String r9 = r9.A0Q
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r4)
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x01b1
            if (r13 == 0) goto L_0x0114
            java.lang.String r0 = r13.toLowerCase(r4)
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x01b1
        L_0x0114:
            if (r12 == 0) goto L_0x0120
            java.lang.String r0 = r12.toLowerCase(r4)
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x01b1
        L_0x0120:
            if (r11 == 0) goto L_0x012c
            java.lang.String r0 = r11.toLowerCase(r4)
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x01b1
        L_0x012c:
            if (r10 == 0) goto L_0x0138
            java.lang.String r0 = r10.toLowerCase(r4)
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x01b1
        L_0x0138:
            if (r9 == 0) goto L_0x00d5
            java.lang.String r0 = r9.toLowerCase(r4)
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L_0x00d5
            return r17
        L_0x0145:
            X.013 r5 = r7.A07
            r4 = r21
            boolean r0 = X.C40661uU.A03(r5, r6, r1, r4)
            if (r0 != 0) goto L_0x01b1
            boolean r0 = r2.A0H()
            if (r0 == 0) goto L_0x0165
            boolean r0 = r2.A0F()
            if (r0 == 0) goto L_0x0165
            java.lang.String r0 = r2.A0B()
            boolean r0 = X.C40661uU.A03(r5, r0, r1, r4)
            if (r0 != 0) goto L_0x01b1
        L_0x0165:
            java.lang.String r0 = r2.A0Q
            boolean r0 = X.C40661uU.A03(r5, r0, r1, r4)
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = r2.A0K
            boolean r0 = X.C40661uU.A03(r5, r0, r1, r4)
            if (r0 != 0) goto L_0x01b1
            java.lang.String r0 = r2.A0U
            boolean r0 = X.C40661uU.A03(r5, r0, r1, r4)
            if (r0 != 0) goto L_0x01b1
            X.0rv r0 = r2.A0E
            boolean r0 = X.C16030sJ.A0G(r0)
            if (r0 != 0) goto L_0x01ab
            boolean r0 = r2.A0J()
            if (r0 != 0) goto L_0x01ab
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 != 0) goto L_0x01ab
            java.util.Iterator r2 = r1.iterator()
        L_0x0195:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01b1
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r3.user
            if (r21 == 0) goto L_0x01ac
            boolean r0 = r0.contains(r1)
        L_0x01a9:
            if (r0 != 0) goto L_0x0195
        L_0x01ab:
            return r15
        L_0x01ac:
            boolean r0 = r0.equals(r1)
            goto L_0x01a9
        L_0x01b1:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16080sP.A0T(X.0sH, java.util.List, boolean):boolean");
    }

    public final boolean A0U(Iterable iterable, Set set) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            C15830rv r1 = (C15830rv) it.next();
            if (this.A01.A0I(r1)) {
                z2 = true;
            } else {
                set.add(this.A02.A0A(r1));
            }
        }
        return z2;
    }
}
