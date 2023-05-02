package com.obwhatsapp.registration.report;

import X.AnonymousClass027;
import X.AnonymousClass13S;
import X.AnonymousClass2FB;
import X.C003401n;
import X.C16320sq;
import X.C18230wM;
import X.C82434Cu;
import X.C82444Cv;
import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape0S0101000_I0;

public class BanReportViewModel extends C003401n {
    public String A00;
    public final AnonymousClass027 A01 = new AnonymousClass027();
    public final AnonymousClass027 A02 = new AnonymousClass027();
    public final C82434Cu A03;
    public final C82444Cv A04;
    public final AnonymousClass2FB A05;
    public final C18230wM A06;
    public final AnonymousClass13S A07;
    public final C16320sq A08;

    public BanReportViewModel(C82434Cu r2, C82444Cv r3, AnonymousClass2FB r4, C18230wM r5, AnonymousClass13S r6, C16320sq r7) {
        this.A08 = r7;
        this.A03 = r2;
        this.A06 = r5;
        this.A04 = r3;
        this.A05 = r4;
        this.A07 = r6;
    }

    public static /* synthetic */ void A01(BanReportViewModel banReportViewModel, int i2) {
        int i3 = i2 + 1;
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableRunnableShape0S0101000_I0((Object) banReportViewModel, i3, 26), ((long) i3) * 5000);
    }
}
