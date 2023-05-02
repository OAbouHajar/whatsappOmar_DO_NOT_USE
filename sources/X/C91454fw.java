package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.4fw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91454fw implements DialogInterface.OnClickListener {
    public final /* synthetic */ C14550pN A00;
    public final /* synthetic */ AnonymousClass1KO A01;
    public final /* synthetic */ C18260wP A02;
    public final /* synthetic */ AnonymousClass01V A03;
    public final /* synthetic */ C16260sj A04;
    public final /* synthetic */ AnonymousClass15W A05;
    public final /* synthetic */ AnonymousClass1KP A06;
    public final /* synthetic */ C16320sq A07;

    public /* synthetic */ C91454fw(C14550pN r1, AnonymousClass1KO r2, C18260wP r3, AnonymousClass01V r4, C16260sj r5, AnonymousClass15W r6, AnonymousClass1KP r7, C16320sq r8) {
        this.A00 = r1;
        this.A07 = r8;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = r3;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        C14550pN r4 = this.A00;
        C16320sq r1 = this.A07;
        AnonymousClass1KO r5 = this.A01;
        AnonymousClass01V r7 = this.A03;
        AnonymousClass15W r10 = this.A05;
        C16260sj r8 = this.A04;
        AnonymousClass1KP r11 = this.A06;
        C18260wP r6 = this.A02;
        Log.i("verifynumber/dialog/cant-connect/button/checkstatus");
        AnonymousClass29T.A00(r4, 109);
        r1.Ack(new AnonymousClass379((Bundle) null, r4, r5, r6, r7, r8, (AnonymousClass1Y3) null, r10, r11, "reg/cant-connect", true, true, false), new String[0]);
    }
}
