package X;

import android.graphics.Bitmap;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4vk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C100504vk implements C108535Oj {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C14550pN A03;
    public final /* synthetic */ AnonymousClass1KX A04;
    public final /* synthetic */ C35701mM A05;
    public final /* synthetic */ C50262Yq A06;
    public final /* synthetic */ C15830rv A07;
    public final /* synthetic */ UserJid A08;
    public final /* synthetic */ List A09;

    public /* synthetic */ C100504vk(C14550pN r1, AnonymousClass1KX r2, C35701mM r3, C50262Yq r4, C15830rv r5, UserJid userJid, List list, int i2, int i3, long j2) {
        this.A04 = r2;
        this.A00 = i2;
        this.A09 = list;
        this.A03 = r1;
        this.A01 = i3;
        this.A07 = r5;
        this.A05 = r3;
        this.A08 = userJid;
        this.A02 = j2;
        this.A06 = r4;
    }

    public final void ASw(Bitmap bitmap, C62723Er r18, boolean z2) {
        AnonymousClass1KX r5 = this.A04;
        int i2 = this.A00;
        List list = this.A09;
        C14550pN r3 = this.A03;
        int i3 = this.A01;
        C15830rv r8 = this.A07;
        C35701mM r6 = this.A05;
        UserJid userJid = this.A08;
        long j2 = this.A02;
        C50262Yq r7 = this.A06;
        AnonymousClass1WD r4 = new AnonymousClass1WD();
        r4.A01(new AnonymousClass3HJ(r3, r4, r5, r6, r7, r8, userJid, list, i2, i3, j2, z2), r5.A01.A06);
        r5.A0B.Acl(new RunnableRunnableShape0S0300000_I0(r5, r4, bitmap, 19));
    }
}
