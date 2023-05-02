package X;

import com.facebook.redex.RunnableRunnableShape0S0101000_I0;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.whatsapp.jid.UserJid;
import java.io.IOException;

/* renamed from: X.25o  reason: invalid class name and case insensitive filesystem */
public class C447925o implements C448025p {
    public long A00;
    public C448125q A01;
    public final C14870pt A02;
    public final AnonymousClass1P1 A03;
    public final C448225r A04;
    public final C26751Oz A05;
    public final C25531Kd A06;
    public final C17210ui A07;
    public final C18260wP A08;
    public final C16440t3 A09;
    public final C16320sq A0A;

    public C447925o(C14870pt r3, C448125q r4, AnonymousClass1P1 r5, C448225r r6, AnonymousClass1P0 r7, C25531Kd r8, C17210ui r9, C18260wP r10, C16440t3 r11, C16320sq r12) {
        this.A09 = r11;
        this.A04 = r6;
        this.A02 = r3;
        this.A01 = r4;
        this.A0A = r12;
        this.A03 = r5;
        this.A07 = r9;
        Object obj = r7.A00.get(1);
        AnonymousClass00B.A06(obj);
        this.A05 = (C26751Oz) obj;
        this.A06 = r8;
        this.A08 = r10;
    }

    public final void A00() {
        C25531Kd r6 = this.A06;
        long j2 = this.A00;
        Long valueOf = Long.valueOf(j2);
        Long valueOf2 = Long.valueOf(System.currentTimeMillis() - j2);
        C75393s5 r1 = new C75393s5();
        r1.A03 = r6.A00;
        r1.A04 = null;
        r1.A02 = valueOf;
        r1.A00 = valueOf2;
        r1.A05 = "xwa_linked_business_account_posts";
        r6.A02.A06(r1);
    }

    public final void A01(int i2) {
        if (this.A01 != null) {
            this.A02.A0K(new RunnableRunnableShape0S0101000_I0((Object) this, i2, 5));
            A00();
        }
    }

    public void A5s(AnonymousClass2JT r6) {
        Object obj;
        if (r6.A00 != 0 || (obj = r6.A02.A00) == null) {
            A01(2);
            return;
        }
        AnonymousClass1P1 r3 = this.A03;
        AnonymousClass4VX r4 = (AnonymousClass4VX) obj;
        UserJid userJid = this.A04.A03;
        synchronized (r3) {
            AnonymousClass4VS r1 = r4.A00;
            if (r1 != null) {
                r3.A00.put(userJid, r1);
            }
            AnonymousClass4VS r12 = r4.A01;
            if (r12 != null) {
                r3.A01.put(userJid, r12);
            }
        }
        if (this.A01 != null) {
            this.A02.A0K(new RunnableRunnableShape4S0100000_I0_3(this, 8));
            A00();
        }
    }

    public void APZ(IOException iOException) {
        iOException.getMessage();
        A01(1);
    }

    public void AQa(Exception exc) {
        if (exc instanceof C802343b) {
            A01(2);
            C32121fg r1 = ((C802343b) exc).error;
            this.A07.A0D(Integer.valueOf(r1.A01), Integer.valueOf(r1.A00), (Integer) null, "xwa_linked_business_account_posts", (String) null, (String) null);
        }
        A01(3);
    }
}
