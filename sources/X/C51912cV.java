package X;

import com.whatsapp.jid.UserJid;
import java.util.Stack;

/* renamed from: X.2cV  reason: invalid class name and case insensitive filesystem */
public class C51912cV extends Stack<C51922cW> {
    public C51912cV() {
        push(new C51922cW((UserJid) null, 0, "", 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = (X.C51922cW) peek();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C51922cW r6) {
        /*
            r5 = this;
            int r0 = r5.size()
            r4 = 3
            r3 = 1
            if (r0 <= 0) goto L_0x0019
            java.lang.Object r1 = r5.peek()
            X.2cW r1 = (X.C51922cW) r1
            int r0 = r1.A00
            if (r0 != r3) goto L_0x0033
            int r0 = r6.A00
            if (r0 != r3) goto L_0x0019
        L_0x0016:
            r5.pop()
        L_0x0019:
            java.util.Iterator r2 = r5.iterator()
        L_0x001d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r2.next()
            X.2cW r0 = (X.C51922cW) r0
            int r1 = r0.A00
            int r0 = r6.A00
            if (r1 != r0) goto L_0x001d
            r2.remove()
            goto L_0x001d
        L_0x0033:
            if (r0 != r4) goto L_0x0019
            int r0 = r6.A00
            if (r0 != r4) goto L_0x0019
            com.whatsapp.jid.UserJid r1 = r1.A01
            com.whatsapp.jid.UserJid r0 = r6.A01
            if (r1 != r0) goto L_0x0019
            goto L_0x0016
        L_0x0040:
            int r1 = r6.A00
            if (r1 != r4) goto L_0x0049
            com.whatsapp.jid.UserJid r0 = r6.A01
            if (r0 != 0) goto L_0x0062
        L_0x0048:
            return
        L_0x0049:
            if (r1 != r3) goto L_0x0054
            java.lang.String r0 = r6.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0062
            return
        L_0x0054:
            r0 = 2
            if (r1 != r0) goto L_0x0062
            java.lang.Integer r0 = r6.A03
            if (r0 == 0) goto L_0x0048
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0062
            return
        L_0x0062:
            r5.push(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51912cV.A00(X.2cW):void");
    }
}
