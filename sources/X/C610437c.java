package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.37c  reason: invalid class name and case insensitive filesystem */
public class C610437c extends C97584qE {
    public final C14550pN A00;
    public final C14870pt A01;
    public final C16760tb A02;
    public final C18260wP A03;
    public final C16080sP A04;
    public final C16980tz A05;
    public final C14730pf A06;
    public final C216114t A07;
    public final AnonymousClass1P8 A08;
    public final C209212c A09;
    public final C610637e A0A;
    public final C38731rK A0B;

    public C610437c(C14550pN r1, C14870pt r2, C16760tb r3, C18260wP r4, C16080sP r5, C16980tz r6, C14730pf r7, C216114t r8, AnonymousClass1P8 r9, C209212c r10, C610637e r11, C38731rK r12) {
        this.A05 = r6;
        this.A01 = r2;
        this.A06 = r7;
        this.A04 = r5;
        this.A08 = r9;
        this.A02 = r3;
        this.A09 = r10;
        this.A03 = r4;
        this.A07 = r8;
        this.A0B = r12;
        this.A00 = r1;
        this.A0A = r11;
    }

    public C48612Oe A7I() {
        File file;
        C38731rK r12 = this.A0B;
        C16750ta A002 = C16730tY.A00(r12);
        if (A002.A0P && (file = A002.A0F) != null && file.exists()) {
            return new C97644qK(this.A00, Uri.fromFile(A002.A0F));
        }
        C16980tz r6 = this.A05;
        C14870pt r2 = this.A01;
        C16760tb r3 = this.A02;
        C14730pf r7 = this.A06;
        C16080sP r5 = this.A04;
        AnonymousClass1P8 r9 = this.A08;
        C209212c r10 = this.A09;
        C18260wP r4 = this.A03;
        C216114t r8 = this.A07;
        return new AnonymousClass3E7(this.A00, r2, r3, r4, r5, r6, r7, r8, r9, r10, this.A0A, r12, this.A00);
    }
}
