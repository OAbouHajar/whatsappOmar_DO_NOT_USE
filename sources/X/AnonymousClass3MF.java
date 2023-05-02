package X;

import android.text.method.LinkMovementMethod;

/* renamed from: X.3MF  reason: invalid class name */
public class AnonymousClass3MF extends LinkMovementMethod {
    public AnonymousClass5RP A00;
    public Runnable A01 = null;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008d, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x008d, code lost:
        r11 = r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.widget.TextView r18, android.text.Spannable r19, android.view.MotionEvent r20) {
        /*
            r17 = this;
            java.lang.Class<X.5RP> r12 = X.AnonymousClass5RP.class
            r7 = r20
            int r9 = r7.getAction()
            r0 = 3
            r8 = r17
            r16 = r18
            if (r9 != r0) goto L_0x0018
            X.5RP r1 = r8.A00
            if (r1 == 0) goto L_0x0018
            r0 = r16
            r1.AYv(r7, r0)
        L_0x0018:
            r11 = 0
            r0 = 1
            if (r9 == r0) goto L_0x001f
            if (r9 == 0) goto L_0x001f
        L_0x001e:
            return r11
        L_0x001f:
            float r0 = r7.getX()
            int r15 = (int) r0
            float r0 = r7.getY()
            int r1 = (int) r0
            int r0 = r16.getTotalPaddingLeft()
            int r15 = r15 - r0
            int r0 = r16.getTotalPaddingTop()
            int r1 = r1 - r0
            int r0 = r16.getScrollX()
            int r15 = r15 + r0
            int r0 = r16.getScrollY()
            int r1 = r1 + r0
            android.text.Layout r14 = r16.getLayout()
            int r10 = r14.getLineForVertical(r1)
            int r6 = r14.getLineStart(r10)
            int r5 = r14.getLineEnd(r10)
            r13 = r19
            java.lang.Object[] r4 = r13.getSpans(r6, r5, r12)
            X.5RP[] r4 = (X.AnonymousClass5RP[]) r4
            int r3 = r4.length
            if (r3 == 0) goto L_0x001e
            int r0 = r5 - r6
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto L_0x0090
        L_0x005e:
            if (r6 >= r5) goto L_0x0090
            char r1 = r13.charAt(r6)
            r0 = 8206(0x200e, float:1.1499E-41)
            if (r1 == r0) goto L_0x0084
            r0 = 8207(0x200f, float:1.15E-41)
            if (r1 == r0) goto L_0x0084
            r0 = 1564(0x61c, float:2.192E-42)
            if (r1 == r0) goto L_0x0084
            r0 = 1807(0x70f, float:2.532E-42)
            if (r1 == r0) goto L_0x0084
            r0 = 8234(0x202a, float:1.1538E-41)
            if (r1 < r0) goto L_0x008d
            r0 = 8238(0x202e, float:1.1544E-41)
            if (r1 <= r0) goto L_0x0084
            r0 = 8294(0x2066, float:1.1622E-41)
            if (r1 < r0) goto L_0x008d
            r0 = 8297(0x2069, float:1.1627E-41)
            if (r1 > r0) goto L_0x008d
        L_0x0084:
            int r11 = r11 + 1
            if (r11 <= r2) goto L_0x008d
            r2 = 1
            r11 = 0
            if (r3 <= r2) goto L_0x009d
            return r11
        L_0x008d:
            int r6 = r6 + 1
            goto L_0x005e
        L_0x0090:
            float r0 = (float) r15
            int r0 = r14.getOffsetForHorizontal(r10, r0)
            java.lang.Object[] r4 = r13.getSpans(r0, r0, r12)
            X.5RP[] r4 = (X.AnonymousClass5RP[]) r4
            r11 = 0
            r2 = 1
        L_0x009d:
            int r0 = r4.length
            if (r0 == 0) goto L_0x001e
            java.lang.Runnable r0 = r8.A01
            if (r0 == 0) goto L_0x00a9
            if (r9 != r2) goto L_0x00a9
            r0.run()
        L_0x00a9:
            r1 = r4[r11]
            r8.A00 = r1
            r0 = r16
            r1.AYv(r7, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3MF.onTouchEvent(android.widget.TextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }
}
