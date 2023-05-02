package X;

import com.obwhatsapp.WaEditText;
import com.obwhatsapp.gifsearch.GifSearchContainer;

/* renamed from: X.4ye  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C102254ye implements C108745Pe {
    public final /* synthetic */ C85434Ok A00;
    public final /* synthetic */ GifSearchContainer A01;
    public final /* synthetic */ C25861Lk A02;

    public /* synthetic */ C102254ye(C85434Ok r1, GifSearchContainer gifSearchContainer, C25861Lk r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = gifSearchContainer;
    }

    public final void ARt(C93544jN r6) {
        C85434Ok r4 = this.A00;
        C25861Lk r0 = this.A02;
        GifSearchContainer gifSearchContainer = this.A01;
        C25841Li r2 = r0.A07;
        C38411qk r02 = r2.A01;
        if (r02 != null) {
            r02.A02.A02(false);
            r2.A01 = null;
        }
        WaEditText waEditText = gifSearchContainer.A07;
        if (waEditText != null) {
            waEditText.A03();
        }
        C42751yc r03 = r4.A05.A00;
        if (r03 != null) {
            r03.ARt(r6);
        }
    }
}
