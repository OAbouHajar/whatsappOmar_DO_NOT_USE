package X;

import com.whatsapp.jid.UserJid;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.52w  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1038252w implements AnonymousClass1WE {
    public final /* synthetic */ C15830rv A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ AnonymousClass1XP A02;
    public final /* synthetic */ C47222Ic A03;
    public final /* synthetic */ C18270wQ A04;
    public final /* synthetic */ C16740tZ A05;
    public final /* synthetic */ C34151jm A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ CountDownLatch A08;

    public /* synthetic */ C1038252w(C15830rv r1, UserJid userJid, AnonymousClass1XP r3, C47222Ic r4, C18270wQ r5, C16740tZ r6, C34151jm r7, Integer num, CountDownLatch countDownLatch) {
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r7;
        this.A00 = r1;
        this.A01 = userJid;
        this.A05 = r6;
        this.A07 = num;
        this.A02 = r3;
        this.A08 = countDownLatch;
    }

    public final void accept(Object obj) {
        C18270wQ r4 = this.A04;
        C47222Ic r3 = this.A03;
        C34151jm r8 = this.A06;
        C15830rv r5 = this.A00;
        UserJid userJid = this.A01;
        C16740tZ r7 = this.A05;
        Integer num = this.A07;
        AnonymousClass1XP r2 = this.A02;
        CountDownLatch countDownLatch = this.A08;
        if (AnonymousClass000.A0D(obj) == 0) {
            r3.A01 = 1;
            r3.A03 = r4.A02(r5, userJid, r7, r8, num);
            r3.A02 = r2;
        } else {
            r3.A01 = 3;
        }
        countDownLatch.countDown();
    }
}
