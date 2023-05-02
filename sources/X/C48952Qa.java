package X;

import android.content.Context;
import android.database.Cursor;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2Qa  reason: invalid class name and case insensitive filesystem */
public class C48952Qa extends CursorAdapter {
    public int A00;
    public int A01 = 0;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06 = Long.MIN_VALUE;
    public AnonymousClass05J A07;
    public C34641kb A08 = C34641kb.of();
    public AnonymousClass39M A09;
    public C47712Kc A0A;
    public AnonymousClass2T8 A0B;
    public C16740tZ A0C;
    public C28381Vw A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G = false;
    public final SparseArray A0H = new SparseArray();
    public final C000900k A0I;
    public final C16300so A0J;
    public final C30001ba A0K;
    public final AnonymousClass1YG A0L;
    public final C16440t3 A0M;
    public final C16460t6 A0N;
    public final C14710pd A0O;
    public final C15830rv A0P;
    public final C222717h A0Q;
    public final C222617g A0R;
    public final HashSet A0S = new HashSet();
    public final HashSet A0T = new HashSet();
    public final HashSet A0U = new HashSet();
    public final List A0V = new ArrayList();
    public final Set A0W = new HashSet();

    public C48952Qa(C000900k r4, C16300so r5, C30001ba r6, AnonymousClass1YG r7, C16440t3 r8, C16460t6 r9, C14710pd r10, C15830rv r11, C222717h r12, C222617g r13) {
        super(r4, (Cursor) null, false);
        this.A0M = r8;
        this.A0O = r10;
        this.A0J = r5;
        this.A0P = r11;
        this.A0R = r13;
        this.A0N = r9;
        this.A0Q = r12;
        this.A0L = r7;
        this.A0I = r4;
        this.A0K = r6;
    }

    public static boolean A00(C30011bb r3, C16740tZ r4) {
        C16740tZ fMessage = r3.getFMessage();
        if (fMessage.A10 != r4.A10 || ((r4 instanceof C38791rQ) && fMessage.A11.A02 != r4.A11.A02)) {
            return false;
        }
        if (!(r4 instanceof C16840tj) || !(fMessage instanceof C16840tj)) {
            return r4.getClass().equals(fMessage.getClass());
        }
        return false;
    }

    public int A01() {
        return (this.A01 + this.A08.size()) - this.A05;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r1 != 2) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A02(int r6, int r7) {
        /*
            r5 = this;
            r0 = -1
            if (r7 == r0) goto L_0x0016
            r4 = 1
            if (r7 == r4) goto L_0x0016
            X.0tZ r3 = r5.getItem(r6)
            X.AnonymousClass00B.A06(r3)
            int r1 = X.AnonymousClass2Ul.A0d(r3)
            if (r1 == r4) goto L_0x0017
            r0 = 2
            if (r1 == r0) goto L_0x0033
        L_0x0016:
            return r6
        L_0x0017:
            int r2 = r6 + -1
        L_0x0019:
            if (r2 < 0) goto L_0x0033
            X.0tZ r1 = r5.getItem(r2)
            if (r1 == 0) goto L_0x0039
            int r0 = r2 + 1
            boolean r0 = r5.A09(r1, r3, r2, r0)
            if (r0 == 0) goto L_0x0039
            boolean r0 = r5.A08(r1)
            if (r0 == 0) goto L_0x0039
            int r2 = r2 + -1
            r3 = r1
            goto L_0x0019
        L_0x0033:
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x0016
            int r6 = r6 - r4
            return r6
        L_0x0039:
            int r0 = r2 + 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48952Qa.A02(int, int):int");
    }

    public int A03(C16740tZ r4) {
        int i2;
        if (getCursor() != null) {
            SparseArray sparseArray = this.A0H;
            int indexOfValue = sparseArray.indexOfValue(r4);
            if (indexOfValue >= 0) {
                i2 = sparseArray.keyAt(indexOfValue);
            } else {
                int i3 = 0;
                while (i3 < this.A08.size()) {
                    if (r4.equals(this.A08.get(i3))) {
                        i2 = i3 + this.A01;
                    } else {
                        i3++;
                    }
                }
            }
            return i2 >= A01() ? i2 + 1 : i2;
        }
        return -1;
    }

    public int A04(C16740tZ r10, int i2) {
        C16740tZ A052;
        if (A08(r10)) {
            int A0d = AnonymousClass2Ul.A0d(r10);
            int i3 = 0;
            if (A0d == 1) {
                int i4 = i2 - 1;
                C16740tZ r2 = r10;
                int i5 = 0;
                while (i4 >= 0 && i5 < 3) {
                    C16740tZ A053 = getItem(i4);
                    if (A053 == null || !A09(A053, r2, i4, i4 + 1) || !A08(A053)) {
                        break;
                    }
                    i5++;
                    i4--;
                    r2 = A053;
                }
                int i6 = i2 + 1;
                while (i6 < getCount() && i3 < 102 && (A052 = getItem(i6)) != null && A09(A052, r10, i6, i6 - 1) && A08(A052)) {
                    i3++;
                    i6++;
                    r10 = A052;
                }
                if (i5 + 1 + i3 >= 4 && i3 < 102) {
                    if (i3 == 101 || i5 == 0) {
                        return 1;
                    }
                    return i3 != 0 ? 2 : 3;
                }
            } else if (A0d == 2 && this.A0E) {
                int i7 = i2 - 1;
                C16740tZ r22 = r10;
                while (i7 >= 0) {
                    C16740tZ A054 = getItem(i7);
                    if (A054 == null || !A09(A054, r22, i7, i7 + 1) || !A08(A054)) {
                        break;
                    }
                    i3++;
                    i7--;
                    r22 = A054;
                }
                int i8 = i3 % 2;
                if (i8 != 0) {
                    return i8 != 1 ? 2 : 3;
                }
                int i9 = i2 + 1;
                C16740tZ A055 = getItem(i9);
                if (A055 == null || !A09(A055, r10, i9, i2) || !A08(A055)) {
                    return -1;
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: A05 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16740tZ getItem(int r11) {
        /*
            r10 = this;
            int r0 = r10.A05     // Catch:{ all -> 0x018f }
            if (r0 <= 0) goto L_0x002b
            int r0 = r10.A01()     // Catch:{ all -> 0x018f }
            if (r11 != r0) goto L_0x002b
            X.0tZ r1 = r10.A0C     // Catch:{ all -> 0x018f }
            if (r1 != 0) goto L_0x002a
            X.17g r5 = r10.A0R     // Catch:{ all -> 0x018f }
            X.0t3 r0 = r10.A0M     // Catch:{ all -> 0x018f }
            long r2 = r0.A00()     // Catch:{ all -> 0x018f }
            X.18b r4 = r5.A05     // Catch:{ all -> 0x018f }
            r1 = 0
            r0 = 1
            X.1Vw r1 = r4.A02(r1, r0)     // Catch:{ all -> 0x018f }
            r0 = 0
            X.0tZ r1 = r5.A01(r1, r0, r2)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = "dummy msg!"
            r1.A0k(r0)     // Catch:{ all -> 0x018f }
            r10.A0C = r1     // Catch:{ all -> 0x018f }
        L_0x002a:
            return r1
        L_0x002b:
            android.database.Cursor r7 = r10.getCursor()     // Catch:{ all -> 0x018f }
            r3 = 0
            if (r7 == 0) goto L_0x018e
            int r6 = r10.A01()     // Catch:{ all -> 0x018f }
            r2 = r11
            if (r11 <= r6) goto L_0x003b
            int r2 = r11 + -1
        L_0x003b:
            int r0 = r10.A01     // Catch:{ all -> 0x018f }
            if (r2 >= r0) goto L_0x0124
            android.util.SparseArray r8 = r10.A0H     // Catch:{ all -> 0x018f }
            java.lang.Object r3 = r8.get(r2)     // Catch:{ all -> 0x018f }
            X.0tZ r3 = (X.C16740tZ) r3     // Catch:{ all -> 0x018f }
            if (r3 != 0) goto L_0x013b
            int r5 = r7.getPosition()     // Catch:{ all -> 0x018f }
            int r0 = r10.A01     // Catch:{ all -> 0x018f }
            int r0 = r0 + -1
            int r0 = r0 - r2
            r7.moveToPosition(r0)     // Catch:{ all -> 0x018f }
            int r4 = r7.getPosition()     // Catch:{ all -> 0x018f }
            X.0rv r1 = r10.A0P     // Catch:{ CursorIndexOutOfBoundsException -> 0x007e }
            X.0t6 r0 = r10.A0N     // Catch:{ all -> 0x007c }
            X.0tZ r3 = r0.A0G(r7, r1)     // Catch:{ all -> 0x007c }
            if (r4 >= r5) goto L_0x0077
            int r0 = r10.A00     // Catch:{ all -> 0x018f }
            if (r4 <= r0) goto L_0x006b
            int r0 = r0 + 50
            if (r4 <= r0) goto L_0x0077
        L_0x006b:
            r1 = 0
            int r0 = r4 + -50
            int r0 = java.lang.Math.max(r1, r0)     // Catch:{ all -> 0x018f }
            r10.A00 = r0     // Catch:{ all -> 0x018f }
            r7.moveToPosition(r0)     // Catch:{ all -> 0x018f }
        L_0x0077:
            r8.put(r2, r3)     // Catch:{ all -> 0x018f }
            goto L_0x013b
        L_0x007c:
            r0 = move-exception
            throw r0     // Catch:{ CursorIndexOutOfBoundsException -> 0x007e }
        L_0x007e:
            r9 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x018f }
            r1.<init>()     // Catch:{ all -> 0x018f }
            java.lang.String r0 = "ConversationCursorAdapter/getItem out-of-bounds"
            r1.append(r0)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = " unseenRowCount:"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x018f }
            r7.<init>(r0)     // Catch:{ all -> 0x018f }
            int r0 = r10.A05     // Catch:{ all -> 0x018f }
            r7.append(r0)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = " unseenMsgCount:"
            r7.append(r0)     // Catch:{ all -> 0x018f }
            int r0 = r10.A03     // Catch:{ all -> 0x018f }
            r7.append(r0)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = " unseenCallCount:"
            r7.append(r0)     // Catch:{ all -> 0x018f }
            int r0 = r10.A04     // Catch:{ all -> 0x018f }
            r7.append(r0)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = " cachePos:"
            r7.append(r0)     // Catch:{ all -> 0x018f }
            int r0 = r10.A00     // Catch:{ all -> 0x018f }
            r7.append(r0)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = " appended:"
            r7.append(r0)     // Catch:{ all -> 0x018f }
            X.1kb r0 = r10.A08     // Catch:{ all -> 0x018f }
            int r0 = r0.size()     // Catch:{ all -> 0x018f }
            r7.append(r0)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = " db:"
            r7.append(r0)     // Catch:{ all -> 0x018f }
            int r0 = r8.size()     // Catch:{ all -> 0x018f }
            r7.append(r0)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = " jidString:"
            r7.append(r0)     // Catch:{ all -> 0x018f }
            X.0rv r3 = r10.A0P     // Catch:{ all -> 0x018f }
            r7.append(r3)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = " jidType:"
            r7.append(r0)     // Catch:{ all -> 0x018f }
            int r0 = r3.getType()     // Catch:{ all -> 0x018f }
            r7.append(r0)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x018f }
            r1.append(r0)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = " cursorCount:"
            r1.append(r0)     // Catch:{ all -> 0x018f }
            int r0 = r10.A01     // Catch:{ all -> 0x018f }
            r1.append(r0)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = " dataPos:"
            r1.append(r0)     // Catch:{ all -> 0x018f }
            r1.append(r2)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = " viewPos:"
            r1.append(r0)     // Catch:{ all -> 0x018f }
            r1.append(r11)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = " dividerPos:"
            r1.append(r0)     // Catch:{ all -> 0x018f }
            r1.append(r6)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = " oldPos:"
            r1.append(r0)     // Catch:{ all -> 0x018f }
            r1.append(r5)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = " newPos:"
            r1.append(r0)     // Catch:{ all -> 0x018f }
            r1.append(r4)     // Catch:{ all -> 0x018f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x018f }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x018f }
            throw r9     // Catch:{ all -> 0x018f }
        L_0x0124:
            int r1 = r2 - r0
            if (r1 < 0) goto L_0x013b
            X.1kb r0 = r10.A08     // Catch:{ all -> 0x018f }
            int r0 = r0.size()     // Catch:{ all -> 0x018f }
            if (r1 >= r0) goto L_0x013b
            X.1kb r1 = r10.A08     // Catch:{ all -> 0x018f }
            int r0 = r10.A01     // Catch:{ all -> 0x018f }
            int r2 = r2 - r0
            java.lang.Object r3 = r1.get(r2)     // Catch:{ all -> 0x018f }
            X.0tZ r3 = (X.C16740tZ) r3     // Catch:{ all -> 0x018f }
        L_0x013b:
            java.util.List r0 = r10.A0V     // Catch:{ all -> 0x018f }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x018f }
        L_0x0141:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x018f }
            if (r0 == 0) goto L_0x018e
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x018f }
            X.1MB r4 = (X.AnonymousClass1MB) r4     // Catch:{ all -> 0x018f }
            if (r3 == 0) goto L_0x0141
            X.1Vt r2 = r3.A0L     // Catch:{ all -> 0x018f }
            if (r2 == 0) goto L_0x0141
            int r1 = r2.A03     // Catch:{ all -> 0x018f }
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x0141
            X.0sK r1 = r4.A04     // Catch:{ all -> 0x018f }
            com.whatsapp.jid.UserJid r0 = r2.A0D     // Catch:{ all -> 0x018f }
            boolean r0 = r1.A0I(r0)     // Catch:{ all -> 0x018f }
            if (r0 != 0) goto L_0x0177
            X.1Vt r0 = r3.A0L     // Catch:{ all -> 0x018f }
            com.whatsapp.jid.UserJid r0 = r0.A0E     // Catch:{ all -> 0x018f }
            boolean r0 = r1.A0I(r0)     // Catch:{ all -> 0x018f }
            if (r0 != 0) goto L_0x0177
            X.1Vt r0 = r3.A0L     // Catch:{ all -> 0x018f }
            java.lang.String r1 = r0.A0K     // Catch:{ all -> 0x018f }
            X.1Vw r0 = r3.A11     // Catch:{ all -> 0x018f }
            r4.A03(r0, r1)     // Catch:{ all -> 0x018f }
            goto L_0x0141
        L_0x0177:
            X.1Vt r0 = r3.A0L     // Catch:{ all -> 0x018f }
            java.lang.String r2 = r0.A0K     // Catch:{ all -> 0x018f }
            r1 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x018f }
            if (r0 != 0) goto L_0x0141
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x018f }
            r0.<init>()     // Catch:{ all -> 0x018f }
            r0.add(r2)     // Catch:{ all -> 0x018f }
            r4.A02(r1, r0)     // Catch:{ all -> 0x018f }
            goto L_0x0141
        L_0x018e:
            return r3
        L_0x018f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48952Qa.getItem(int):X.0tZ");
    }

    public void A06(C34641kb r2) {
        this.A08 = r2;
        getCursor();
        this.A08.size();
    }

    public final boolean A07(C30011bb r3, C16740tZ r4) {
        HashSet hashSet = this.A0U;
        C28381Vw r1 = r4.A11;
        return hashSet.contains(r1) || this.A0S.contains(r1) || this.A0T.contains(r1) || this.A07 != null || r3.A02 != this.A02 || (r4 instanceof C38841rV);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r1 = r6.A10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08(X.C16740tZ r6) {
        /*
            r5 = this;
            long r3 = r6.A13
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x001c
            long r3 = r6.A14
            long r1 = r5.A06
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x001c
            byte r1 = r6.A10
            r0 = 20
            if (r1 != r0) goto L_0x001e
            X.0tZ r0 = r6.A0D()
            if (r0 == 0) goto L_0x001e
        L_0x001c:
            r2 = 0
        L_0x001d:
            return r2
        L_0x001e:
            boolean r0 = X.C42551xz.A04(r6)
            if (r0 != 0) goto L_0x001c
            X.1uH r0 = r6.A0N
            if (r0 != 0) goto L_0x001c
            r0 = 20
            if (r1 != r0) goto L_0x0036
            X.0t3 r1 = r5.A0M
            X.17h r0 = r5.A0Q
            X.0tZ r0 = X.C38621r6.A0C(r1, r0, r6)
            if (r0 != 0) goto L_0x001c
        L_0x0036:
            int r1 = X.AnonymousClass2Ul.A0d(r6)
            r0 = -1
            r2 = 1
            if (r1 != r0) goto L_0x001d
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48952Qa.A08(X.0tZ):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        r1 = r13.A0B();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A09(X.C16740tZ r13, X.C16740tZ r14, int r15, int r16) {
        /*
            r12 = this;
            long r2 = r13.A0I
            long r0 = r14.A0I
            long r4 = r2 - r0
            long r10 = java.lang.Math.abs(r4)
            r9 = 0
            r8 = 1
            r5 = 610000(0x94ed0, double:3.0138E-318)
            int r4 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            r7 = 0
            if (r4 > 0) goto L_0x0015
            r7 = 1
        L_0x0015:
            boolean r6 = X.C42681yF.A0A(r2, r0)
            boolean r1 = r13.A10(r8)
            boolean r0 = r14.A10(r8)
            r5 = 0
            if (r1 != r0) goto L_0x0025
            r5 = 1
        L_0x0025:
            X.1Vw r0 = r13.A11
            boolean r1 = r0.A02
            X.1Vw r0 = r14.A11
            boolean r0 = r0.A02
            if (r1 != r0) goto L_0x008f
            if (r1 != 0) goto L_0x0041
            X.0rv r1 = r13.A0B()
            if (r1 == 0) goto L_0x0041
            X.0rv r0 = r14.A0B()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008f
        L_0x0041:
            r4 = 1
        L_0x0042:
            int r0 = r12.A01()
            r2 = 0
            if (r15 >= r0) goto L_0x004a
            r2 = 1
        L_0x004a:
            int r1 = r12.A01()
            r0 = 0
            r3 = r16
            if (r3 >= r1) goto L_0x0054
            r0 = 1
        L_0x0054:
            r3 = 0
            if (r2 != r0) goto L_0x0058
            r3 = 1
        L_0x0058:
            int r1 = X.AnonymousClass2Ul.A0d(r13)
            int r0 = X.AnonymousClass2Ul.A0d(r14)
            r2 = 0
            if (r1 != r0) goto L_0x0064
            r2 = 1
        L_0x0064:
            X.0tZ r1 = r13.A0D()
            X.0tZ r0 = r14.A0D()
            if (r1 == r0) goto L_0x007c
            if (r1 == 0) goto L_0x008d
            if (r0 == 0) goto L_0x008d
            X.1Vw r1 = r1.A11
            X.1Vw r0 = r0.A11
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008d
        L_0x007c:
            r0 = 1
        L_0x007d:
            if (r7 == 0) goto L_0x008c
            if (r6 == 0) goto L_0x008c
            if (r4 == 0) goto L_0x008c
            if (r3 == 0) goto L_0x008c
            if (r5 == 0) goto L_0x008c
            if (r2 == 0) goto L_0x008c
            if (r0 == 0) goto L_0x008c
            r9 = 1
        L_0x008c:
            return r9
        L_0x008d:
            r0 = 0
            goto L_0x007d
        L_0x008f:
            r4 = 0
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48952Qa.A09(X.0tZ, X.0tZ, int, int):boolean");
    }

    public void bindView(View view, Context context, Cursor cursor) {
        throw new IllegalStateException("should not be called, getView is defined");
    }

    public void changeCursor(Cursor cursor) {
        this.A0F = true;
        if (cursor != null) {
            this.A01 = cursor.getCount();
        }
        super.changeCursor(cursor);
    }

    public int getCount() {
        int i2 = 0;
        if (!this.A0F || getCursor() == null) {
            return 0;
        }
        int size = this.A01 + this.A08.size();
        if (this.A05 > 0) {
            i2 = 1;
        }
        return size + i2;
    }

    public Cursor getCursor() {
        Cursor cursor = super.getCursor();
        if (cursor == null || !cursor.isClosed()) {
            return cursor;
        }
        return null;
    }

    public long getItemId(int i2) {
        C16740tZ A052 = getItem(i2);
        if (A052 == null) {
            return 0;
        }
        return ((A052.A13 == 0 ? (long) A052.A11.hashCode() : A052.A13) & 4294967295L) | (((long) A052.A10) << 32);
    }

    public int getItemViewType(int i2) {
        if (!this.A0F) {
            return -1;
        }
        if (this.A05 > 0 && i2 == A01()) {
            return 18;
        }
        C16740tZ A052 = getItem(i2);
        if (A052 == null) {
            return -1;
        }
        C30001ba r2 = this.A0K;
        int A042 = A04(A052, i2);
        if (A042 == -1) {
            return r2.A00(A052);
        }
        if (A042 != 1) {
            return 34;
        }
        int A0d = AnonymousClass2Ul.A0d(A052);
        boolean z2 = A052.A11.A02;
        return A0d != 2 ? z2 ? 32 : 33 : z2 ? 41 : 42;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f7, code lost:
        if (A00(r1, r8) != false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r1 != false) goto L_0x0018;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r18, android.view.View r19, android.view.ViewGroup r20) {
        /*
            r17 = this;
            r3 = r19
            r7 = r17
            boolean r0 = r7.A0G
            if (r0 != 0) goto L_0x0018
            X.2Kc r0 = r7.A0A
            if (r0 == 0) goto L_0x0018
            X.2T8 r0 = r7.A0B
            if (r0 == 0) goto L_0x0018
            X.AnonymousClass00B.A01()
            boolean r1 = r0.A01
            r0 = 1
            if (r1 == 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            java.lang.String r16 = "adapter_row"
            if (r0 == 0) goto L_0x0029
            X.2Kc r0 = r7.A0A
            X.AnonymousClass00B.A06(r0)
            X.1dR r1 = r0.A01
            r0 = r16
            r1.A08(r0)
        L_0x0029:
            int r0 = r7.A01()
            r5 = 2
            r9 = 0
            r11 = 1
            r13 = r18
            r2 = r20
            if (r13 != r0) goto L_0x00b5
            if (r19 != 0) goto L_0x0047
            android.content.Context r0 = r2.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131558890(0x7f0d01ea, float:1.8743109E38)
            android.view.View r3 = r1.inflate(r0, r2, r9)
        L_0x0047:
            r0 = 2131366800(0x7f0a1390, float:1.8353504E38)
            android.view.View r6 = X.C004601z.A0E(r3, r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            int r1 = r7.A03
            int r0 = r7.A04
            if (r1 <= 0) goto L_0x009a
            android.content.res.Resources r8 = r3.getResources()
            r4 = 2131755381(0x7f100175, float:1.914164E38)
            int r2 = r7.A03
            if (r0 <= 0) goto L_0x00a5
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1[r9] = r0
            java.lang.String r10 = r8.getQuantityString(r4, r2, r1)
            android.content.res.Resources r8 = r3.getResources()
            r4 = 2131755219(0x7f1000d3, float:1.9141311E38)
            int r2 = r7.A04
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1[r9] = r0
            java.lang.String r4 = r8.getQuantityString(r4, r2, r1)
            android.content.Context r2 = r3.getContext()
            r1 = 2131892383(0x7f12189f, float:1.9419513E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r9] = r10
            r0[r11] = r4
            java.lang.String r0 = r2.getString(r1, r0)
        L_0x0093:
            r6.setText(r0)
            r6.setFocusable(r11)
            return r3
        L_0x009a:
            if (r0 <= 0) goto L_0x00b2
            android.content.res.Resources r8 = r3.getResources()
            r4 = 2131755219(0x7f1000d3, float:1.9141311E38)
            int r2 = r7.A04
        L_0x00a5:
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1[r9] = r0
            java.lang.String r0 = r8.getQuantityString(r4, r2, r1)
            goto L_0x0093
        L_0x00b2:
            java.lang.String r0 = ""
            goto L_0x0093
        L_0x00b5:
            X.0tZ r8 = r7.getItem(r13)
            if (r8 != 0) goto L_0x00d2
            java.lang.String r0 = "Conversation/isMessageValid message was null, already deleted?"
        L_0x00bd:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            android.content.Context r0 = r2.getContext()
            android.view.View r3 = new android.view.View
            r3.<init>(r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r9, r9)
            r3.setLayoutParams(r0)
            return r3
        L_0x00d2:
            byte r6 = r8.A10
            r0 = 36
            if (r6 != r0) goto L_0x00e5
            X.1Vw r0 = r8.A11
            X.0rv r0 = r0.A00
            boolean r0 = X.C16030sJ.A0L(r0)
            if (r0 == 0) goto L_0x00e5
            java.lang.String r0 = "Conversation/isMessageValid message was malicious."
            goto L_0x00bd
        L_0x00e5:
            X.AnonymousClass00B.A06(r8)
            int r12 = r7.A04(r8, r13)
            boolean r0 = r3 instanceof X.C30011bb
            if (r0 == 0) goto L_0x0165
            r1 = r3
            X.1bb r1 = (X.C30011bb) r1
            boolean r0 = A00(r1, r8)
            if (r0 == 0) goto L_0x0165
        L_0x00f9:
            X.05M r2 = r1.A0H
            if (r2 != 0) goto L_0x0106
            r0 = 10
            com.facebook.redex.IDxDCompatShape22S0100000_2_I0 r2 = new com.facebook.redex.IDxDCompatShape22S0100000_2_I0
            r2.<init>(r1, r0)
            r1.A0H = r2
        L_0x0106:
            X.C004601z.A0j(r1, r2)
            boolean r0 = r1 instanceof X.AnonymousClass2Ul
            r11 = 3
            if (r0 == 0) goto L_0x01c4
            r15 = r1
            X.2Ul r15 = (X.AnonymousClass2Ul) r15
            int r14 = r15.getMaxAlbumSize()
            int r0 = r15.getMinAlbumSize()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r0)
            r10.add(r8)
            boolean r5 = r7.A07(r1, r8)
            int r4 = r18 + 1
            r2 = r8
        L_0x0128:
            int r0 = r7.getCount()
            if (r4 >= r0) goto L_0x01c0
            int r0 = r10.size()
            if (r0 >= r14) goto L_0x01c0
            X.0tZ r3 = r7.getItem(r4)
            if (r3 == 0) goto L_0x01c0
            int r0 = r4 + -1
            boolean r0 = r7.A09(r3, r2, r4, r0)
            if (r0 == 0) goto L_0x01c0
            boolean r0 = r7.A08(r3)
            if (r0 == 0) goto L_0x01c0
            r10.add(r3)
            boolean r0 = r7.A07(r1, r3)
            r5 = r5 | r0
            java.util.HashSet r0 = r7.A0T
            X.1Vw r2 = r3.A11
            r0.remove(r2)
            java.util.HashSet r0 = r7.A0U
            r0.remove(r2)
            java.util.HashSet r0 = r7.A0S
            r0.remove(r2)
            int r4 = r4 + 1
            r2 = r3
            goto L_0x0128
        L_0x0165:
            X.1ba r10 = r7.A0K
            android.content.Context r5 = r2.getContext()
            X.1YG r4 = r7.A0L
            r0 = -1
            if (r12 != r0) goto L_0x01a1
            X.1bZ r0 = r10.A07
            java.util.concurrent.ConcurrentMap r2 = r0.A03
            long r0 = r8.A13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r1 = r2.remove(r0)
            X.1bb r1 = (X.C30011bb) r1
            if (r1 == 0) goto L_0x0188
            boolean r0 = A00(r1, r8)
            if (r0 != 0) goto L_0x018c
        L_0x0188:
            X.1bb r1 = r10.A02(r5, r4, r8)
        L_0x018c:
            X.39M r2 = r7.A09
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x00f9
            java.util.List r2 = r2.A0A
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.add(r0)
            goto L_0x00f9
        L_0x01a1:
            r2 = r8
            X.0tY r2 = (X.C16730tY) r2
            if (r12 != r11) goto L_0x01ba
            byte r1 = r2.A10
            r0 = 20
            if (r1 != r0) goto L_0x01b4
            X.1MF r0 = r10.A01
            X.31J r1 = new X.31J
            r1.<init>(r5, r4, r2, r0)
            goto L_0x018c
        L_0x01b4:
            X.2Uj r1 = new X.2Uj
            r1.<init>(r5, r4, r2)
            goto L_0x018c
        L_0x01ba:
            X.3om r1 = new X.3om
            r1.<init>(r5, r4, r2)
            goto L_0x018c
        L_0x01c0:
            r15.A1N(r10, r5)
            goto L_0x01d4
        L_0x01c4:
            boolean r0 = r1 instanceof X.C73703om
            if (r0 == 0) goto L_0x033d
            r2 = r1
            X.3om r2 = (X.C73703om) r2
            r0 = 0
            if (r12 != r11) goto L_0x01cf
            r0 = 1
        L_0x01cf:
            r2.A00 = r0
            r1.A1G(r8, r9)
        L_0x01d4:
            int r0 = r7.A02
            r1.A02 = r0
            java.util.HashSet r2 = r7.A0U
            X.1Vw r10 = r8.A11
            boolean r0 = r2.contains(r10)
            if (r0 == 0) goto L_0x01f8
            r2.remove(r10)
            X.00k r0 = r7.A0I
            X.04p r0 = r0.A06
            X.05f r2 = r0.A02
            X.05f r0 = X.C011005f.RESUMED
            boolean r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x01f8
            boolean r0 = r8.A0x
            r1.A13(r9, r0)
        L_0x01f8:
            java.util.HashSet r2 = r7.A0S
            boolean r0 = r2.contains(r10)
            if (r0 == 0) goto L_0x0221
            r2.remove(r10)
            X.00k r0 = r7.A0I
            X.04p r0 = r0.A06
            X.05f r2 = r0.A02
            X.05f r0 = X.C011005f.RESUMED
            boolean r0 = r2.A00(r0)
            if (r0 == 0) goto L_0x0221
            boolean r0 = r1 instanceof X.AnonymousClass31J
            if (r0 != 0) goto L_0x0221
            int r3 = r8.A06()
            r2 = 1
            r0 = 0
            if (r3 != r2) goto L_0x021e
            r0 = 1
        L_0x021e:
            r1.A13(r2, r0)
        L_0x0221:
            X.1Vw r0 = r7.A0D
            r14 = 0
            if (r0 == 0) goto L_0x0231
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0231
            r7.A0D = r14
            r1.A0z()
        L_0x0231:
            java.util.Set r4 = r7.A0W
            java.util.Iterator r2 = r4.iterator()
        L_0x0237:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0258
            java.lang.Object r3 = r2.next()
            X.1Vw r3 = (X.C28381Vw) r3
            boolean r0 = r1.A1L(r3)
            if (r0 == 0) goto L_0x0237
            r4.remove(r3)
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            com.facebook.redex.IDxDListenerShape38S0300000_2_I0 r0 = new com.facebook.redex.IDxDListenerShape38S0300000_2_I0
            r0.<init>(r3, r1, r7, r9)
            r2.addOnPreDrawListener(r0)
        L_0x0258:
            r0 = -1
            r3 = 1
            if (r12 == r0) goto L_0x025e
            if (r12 != r3) goto L_0x033a
        L_0x025e:
            if (r18 == 0) goto L_0x0337
            int r2 = r18 + -1
            X.0tZ r14 = r7.getItem(r2)
            if (r14 == 0) goto L_0x0337
            X.0tZ r2 = r7.A0C
            if (r14 != r2) goto L_0x0276
            if (r13 <= r3) goto L_0x0276
            int r2 = r18 + -2
            X.0tZ r2 = r7.getItem(r2)
            if (r2 != 0) goto L_0x0277
        L_0x0276:
            r2 = r14
        L_0x0277:
            long r4 = r2.A0I
            long r2 = r8.A0I
            boolean r3 = X.C42681yF.A0A(r4, r2)
            r2 = r3 ^ 1
            r1.A1I(r2)
        L_0x0284:
            if (r12 != r0) goto L_0x0333
            r12 = 20
            r15 = 6
            if (r3 == 0) goto L_0x032e
            if (r14 == 0) goto L_0x032e
            X.1Vw r2 = r14.A11
            boolean r2 = r2.A02
            boolean r3 = r10.A02
            if (r2 != r3) goto L_0x032e
            byte r2 = r14.A10
            if (r2 == r12) goto L_0x032e
            int r2 = r8.A0C
            if (r2 == r15) goto L_0x032e
            int r2 = r14.A0C
            if (r2 == r15) goto L_0x032e
            if (r3 != 0) goto L_0x02b3
            X.0rv r3 = r8.A0B()
            if (r3 == 0) goto L_0x02b3
            X.0rv r2 = r14.A0B()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x032e
        L_0x02b3:
            r14 = 1
        L_0x02b4:
            int r2 = r18 + 1
            X.0tZ r13 = r7.getItem(r2)
            if (r13 == 0) goto L_0x02ed
            long r4 = r13.A0I
            long r2 = r8.A0I
            boolean r2 = X.C42681yF.A0A(r4, r2)
            if (r2 == 0) goto L_0x02ed
            X.1Vw r2 = r13.A11
            boolean r2 = r2.A02
            boolean r3 = r10.A02
            if (r2 != r3) goto L_0x02ed
            byte r2 = r13.A10
            if (r2 == r12) goto L_0x02ed
            int r2 = r8.A0C
            if (r2 == r15) goto L_0x02ed
            int r2 = r13.A0C
            if (r2 == r15) goto L_0x02ed
            if (r3 != 0) goto L_0x02ec
            X.0rv r3 = r8.A0B()
            if (r3 == 0) goto L_0x02ec
            X.0rv r2 = r13.A0B()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x02ed
        L_0x02ec:
            r9 = 1
        L_0x02ed:
            if (r14 == 0) goto L_0x02f1
            if (r9 != 0) goto L_0x032c
        L_0x02f1:
            if (r6 == r12) goto L_0x032c
            if (r14 == 0) goto L_0x0330
            r1.A11(r11)
        L_0x02f8:
            X.2T8 r2 = r7.A0B
            if (r2 == 0) goto L_0x032b
            boolean r0 = r7.A0G
            if (r0 != 0) goto L_0x031a
            X.2Kc r0 = r7.A0A
            if (r0 == 0) goto L_0x031a
            X.AnonymousClass00B.A01()
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x031a
            X.2Kc r0 = r7.A0A
            X.AnonymousClass00B.A06(r0)
            X.1dR r2 = r0.A01
            r0 = r16
            r2.A07(r0)
            r0 = 1
            r7.A0G = r0
        L_0x031a:
            X.2T8 r2 = r7.A0B
            X.AnonymousClass00B.A01()
            X.AnonymousClass00B.A01()
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x032b
            X.0pn r0 = r2.A02
            r1.A4c(r0)
        L_0x032b:
            return r1
        L_0x032c:
            r0 = 2
            goto L_0x0333
        L_0x032e:
            r14 = 0
            goto L_0x02b4
        L_0x0330:
            if (r9 == 0) goto L_0x0333
            r0 = 1
        L_0x0333:
            r1.A11(r0)
            goto L_0x02f8
        L_0x0337:
            r1.A1I(r3)
        L_0x033a:
            r3 = 0
            goto L_0x0284
        L_0x033d:
            if (r19 != 0) goto L_0x0343
            boolean r0 = r1.A1h
            if (r0 == 0) goto L_0x01d4
        L_0x0343:
            boolean r0 = r7.A07(r1, r8)
            r1.A1G(r8, r0)
            java.util.HashSet r2 = r7.A0T
            X.1Vw r0 = r8.A11
            r2.remove(r0)
            r1.A1h = r9
            goto L_0x01d4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48952Qa.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        int i2 = 0;
        if (this.A05 > 0) {
            i2 = 1;
        }
        return i2 + 98;
    }

    public boolean hasStableIds() {
        return true;
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        throw new IllegalStateException("should not be called, getView is defined");
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        this.A0F = false;
    }

    public void onContentChanged() {
    }
}
