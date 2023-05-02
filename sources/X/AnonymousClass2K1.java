package X;

import android.app.Activity;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.2K1  reason: invalid class name */
public class AnonymousClass2K1 implements C38331qc {
    public C16010sH A00;
    public WeakReference A01;
    public final C14870pt A02;
    public final C16080sP A03;
    public final AnonymousClass12W A04;
    public final C14730pf A05;
    public final C16490t9 A06;

    public AnonymousClass2K1(Activity activity, C14870pt r3, C16080sP r4, AnonymousClass12W r5, C14730pf r6, C16010sH r7, C16490t9 r8) {
        this.A02 = r3;
        this.A06 = r8;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = new WeakReference(activity);
        this.A00 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c5, code lost:
        if (r5 != -1) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C31701et r8) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.AnonymousClass2K0
            if (r0 == 0) goto L_0x0060
            r4 = 2131890955(0x7f12130b, float:1.9416616E38)
            java.lang.ref.WeakReference r0 = r7.A01
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r6 = r0.get()
            android.app.Activity r6 = (android.app.Activity) r6
            if (r6 == 0) goto L_0x00ce
            boolean r0 = X.AnonymousClass29T.A03(r6)
            if (r0 != 0) goto L_0x00ce
            X.0pt r0 = r7.A02
            X.0pS r0 = r0.A00
            if (r0 != r6) goto L_0x00ce
            int r5 = r8.A01
            r0 = 9
            r3 = 0
            if (r5 != r0) goto L_0x003e
            X.12W r2 = r7.A04
            X.0pf r1 = r7.A05
            X.2Jz r0 = new X.2Jz
            r0.<init>(r6, r1)
            boolean r0 = r2.A04(r0)
            if (r0 == 0) goto L_0x003d
        L_0x0035:
            r1 = 2131892324(0x7f121864, float:1.9419393E38)
        L_0x0038:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r7.A01(r0, r5, r4, r1)
        L_0x003d:
            return
        L_0x003e:
            r0 = 4
            if (r5 != r0) goto L_0x004e
            boolean r0 = X.C14730pf.A00()
            r1 = 2131889054(0x7f120b9e, float:1.941276E38)
            if (r0 == 0) goto L_0x0038
            r1 = 2131889053(0x7f120b9d, float:1.9412759E38)
            goto L_0x0038
        L_0x004e:
            r0 = 5
            if (r5 != r0) goto L_0x0055
            r1 = 2131890956(0x7f12130c, float:1.9416618E38)
            goto L_0x0038
        L_0x0055:
            r0 = 8
            if (r5 == r0) goto L_0x005c
            r0 = -1
            if (r5 != r0) goto L_0x0035
        L_0x005c:
            r1 = 2131889070(0x7f120bae, float:1.9412793E38)
            goto L_0x0038
        L_0x0060:
            java.lang.ref.WeakReference r0 = r7.A01
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r3 = r0.get()
            android.app.Activity r3 = (android.app.Activity) r3
            if (r3 == 0) goto L_0x00d1
            boolean r0 = X.AnonymousClass29T.A03(r3)
            if (r0 != 0) goto L_0x00d1
            X.0pt r0 = r7.A02
            X.0pS r0 = r0.A00
            if (r0 != r3) goto L_0x00d1
            int r5 = r8.A01
            r0 = 9
            r6 = 0
            if (r5 != r0) goto L_0x009a
            X.12W r2 = r7.A04
            X.0pf r1 = r7.A05
            X.2Jz r0 = new X.2Jz
            r0.<init>(r3, r1)
            boolean r0 = r2.A04(r0)
            if (r0 == 0) goto L_0x003d
        L_0x008e:
            r2 = 2131887933(0x7f12073d, float:1.9410487E38)
            r1 = 2131892323(0x7f121863, float:1.9419391E38)
        L_0x0094:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r7.A01(r0, r5, r2, r1)
            return
        L_0x009a:
            r0 = 4
            if (r5 != r0) goto L_0x00a4
            r2 = 2131887933(0x7f12073d, float:1.9410487E38)
            r1 = 2131889056(0x7f120ba0, float:1.9412765E38)
            goto L_0x0094
        L_0x00a4:
            r0 = 5
            if (r5 != r0) goto L_0x00c0
            X.0sH r4 = r7.A00
            if (r4 == 0) goto L_0x00c7
            r3 = 2131887933(0x7f12073d, float:1.9410487E38)
            r2 = 2131892140(0x7f1217ac, float:1.941902E38)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.0sP r0 = r7.A03
            java.lang.String r0 = r0.A08(r4)
            r1[r6] = r0
            r7.A01(r1, r5, r3, r2)
            return
        L_0x00c0:
            r0 = 8
            if (r5 == r0) goto L_0x00c7
            r0 = -1
            if (r5 != r0) goto L_0x008e
        L_0x00c7:
            r2 = 2131887933(0x7f12073d, float:1.9410487E38)
            r1 = 2131889069(0x7f120bad, float:1.9412791E38)
            goto L_0x0094
        L_0x00ce:
            java.lang.String r0 = "productdownloadlistener/notifyuser/skip"
            goto L_0x00d3
        L_0x00d1:
            java.lang.String r0 = "basemediadownloadlistener/notifyuser/skip"
        L_0x00d3:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2K1.A00(X.1et):void");
    }

    public void A01(Object[] objArr, int i2, int i3, int i4) {
        Activity activity;
        WeakReference weakReference = this.A01;
        if (weakReference == null || (activity = (Activity) weakReference.get()) == null || AnonymousClass29T.A03(activity) || this.A02.A00 != activity) {
            Log.i("basemediadownloadlistener/notifyuser/skip");
            return;
        }
        AnonymousClass00B.A06(activity);
        C14600pS r3 = (C14600pS) activity;
        Object[] objArr2 = objArr;
        int i5 = i3;
        int i6 = i4;
        if (i2 == 4) {
            r3.Afi(new C99864ui(activity, AnonymousClass4Y3.A00(this.A06, 4), 4), objArr2, i5, i6, R.string.str0ca7);
        } else {
            r3.Afj(objArr, i3, i4);
        }
    }

    public /* synthetic */ void AQ1(long j2) {
    }

    public void AQ3(boolean z2) {
        this.A01 = null;
    }

    public void AQ4(C31701et r2, C30761cu r3) {
        if (r2.A01 != 0) {
            A00(r2);
            this.A01 = null;
        }
    }
}
