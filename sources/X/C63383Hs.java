package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.3Hs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C63383Hs implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C15830rv A02;
    public final /* synthetic */ C16050sL A03;
    public final /* synthetic */ AnonymousClass12B A04;

    public /* synthetic */ C63383Hs(C15830rv r1, C16050sL r2, AnonymousClass12B r3, int i2, int i3) {
        this.A04 = r3;
        this.A00 = i2;
        this.A02 = r1;
        this.A01 = i3;
        this.A03 = r2;
    }

    public final void run() {
        AnonymousClass12B r14 = this.A04;
        int i2 = this.A00;
        C15830rv r2 = this.A02;
        int i3 = this.A01;
        C16050sL r7 = this.A03;
        StringBuilder A0r = AnonymousClass000.A0r("ProfilePhotoManager/sendGetSubProfilePhoto photoId:");
        A0r.append(i2);
        A0r.append(" query type:");
        A0r.append("url");
        A0r.append(" jid:");
        A0r.append(r2);
        A0r.append(" image type:");
        A0r.append(i3);
        C13680ns.A1V(A0r);
        String str = i3 == 1 ? "image" : "preview";
        C17190ug r8 = r14.A0C;
        C16980tz r12 = r14.A08;
        C17660vR r5 = r14.A0G;
        C16320sq r3 = r14.A0H;
        C63023Fv r9 = new C63023Fv(r14.A03, r14.A06, r12, r14.A0B, r14, r14.A0D, (AnonymousClass273) null, (AnonymousClass279) null, r14.A0E, r14.A0F, r5, r3);
        GroupJid groupJid = (GroupJid) r2;
        String num = i2 > 0 ? Integer.toString(i2) : null;
        String A022 = r8.A02();
        r8.A0A(new AnonymousClass3GX(r9, r7, groupJid, str, num), C810746s.A00(groupJid, r7, A022, "url", str, num, (String) null), A022, 300, 32000);
    }
}
