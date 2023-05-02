package X;

import com.obwhatsapp.notification.DirectReplyService;

/* renamed from: X.56A  reason: invalid class name */
public final /* synthetic */ class AnonymousClass56A implements Runnable {
    public final /* synthetic */ C16010sH A00;
    public final /* synthetic */ C74043pe A01;
    public final /* synthetic */ DirectReplyService A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ AnonymousClass56A(C16010sH r1, C74043pe r2, DirectReplyService directReplyService, String str, String str2) {
        this.A02 = directReplyService;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = str;
        this.A04 = str2;
    }

    public final void run() {
        DirectReplyService directReplyService = this.A02;
        DirectReplyService.A02(this.A00, this.A01, directReplyService, this.A03, this.A04);
    }
}
