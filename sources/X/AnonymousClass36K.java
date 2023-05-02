package X;

import android.os.Bundle;
import android.os.SystemClock;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.36K  reason: invalid class name */
public class AnonymousClass36K extends C16690tT {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C18930xU A01;
    public final AnonymousClass10G A02;
    public final C15830rv A03;
    public final WeakReference A04;

    public AnonymousClass36K(C18930xU r3, StarredMessagesActivity starredMessagesActivity, AnonymousClass10G r5, C15830rv r6) {
        this.A01 = r3;
        this.A02 = r5;
        this.A04 = C13690nt.A0h(starredMessagesActivity);
        this.A03 = r6;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0041 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0041=Splitter:B:19:0x0041, B:14:0x0039=Splitter:B:14:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r8) {
        /*
            r7 = this;
            X.0xU r5 = r7.A01
            X.0rv r4 = r7.A03
            X.15h r1 = r5.A0T
            java.lang.String r0 = "star"
            java.lang.Object r6 = r1.A02(r0)
            X.1it r6 = (X.C33631it) r6
            if (r6 == 0) goto L_0x0047
            X.0sK r0 = r5.A07
            r0.A0B()
            X.1ZT r0 = r0.A05
            if (r0 == 0) goto L_0x0047
            X.0tq r0 = r6.A05
            X.0tf r3 = r0.get()
            r2 = 0
            r1 = 0
            if (r4 == 0) goto L_0x002f
            X.10G r0 = r6.A06     // Catch:{ all -> 0x0042 }
            android.database.Cursor r1 = r0.ADd(r1, r4, r1)     // Catch:{ all -> 0x0042 }
            java.util.List r0 = r6.A0A(r1, r3, r2)     // Catch:{ all -> 0x003d }
            goto L_0x0039
        L_0x002f:
            X.10G r0 = r6.A06     // Catch:{ all -> 0x0042 }
            android.database.Cursor r1 = r0.ADc(r1, r1)     // Catch:{ all -> 0x0042 }
            java.util.List r0 = r6.A0A(r1, r3, r2)     // Catch:{ all -> 0x003d }
        L_0x0039:
            r1.close()     // Catch:{ all -> 0x0042 }
            goto L_0x004c
        L_0x003d:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0
        L_0x0047:
            java.util.Set r2 = java.util.Collections.emptySet()
            goto L_0x0053
        L_0x004c:
            r3.close()
            java.util.Set r2 = r5.A0I(r0)
        L_0x0053:
            X.10G r1 = r7.A02
            r0 = 0
            boolean r4 = r1.A03(r4, r0)
            if (r4 == 0) goto L_0x006b
            r5.A0V(r2)
        L_0x005f:
            long r2 = r7.A00
            r0 = 300(0x12c, double:1.48E-321)
            X.C14550pN.A0y(r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L_0x006b:
            r5.A0U(r2)
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36K.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Boolean bool = (Boolean) obj;
        C45692Af r2 = (C45692Af) this.A04.get();
        if (r2 != null && !r2.AIm()) {
            r2.Ac1();
            if (bool.booleanValue()) {
                r2.A0W().A00((Bundle) null, r2);
                r2.A37();
                return;
            }
            r2.A05.A0H(r2.getResources().getQuantityString(R.plurals.plurals0177, 2), 0);
        }
    }
}
