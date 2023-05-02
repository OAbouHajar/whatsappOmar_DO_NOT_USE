package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.emoji.search.EmojiSearchContainer;

/* renamed from: X.2rM  reason: invalid class name and case insensitive filesystem */
public class C57552rM extends AnonymousClass01X implements AnonymousClass2VG {
    public AnonymousClass2X4 A00;
    public final int A01;
    public final LayoutInflater A02;
    public final AnonymousClass013 A03;
    public final C17250um A04;
    public final C108725Pc A05;
    public final C17020u3 A06;
    public final /* synthetic */ EmojiSearchContainer A07;

    public C57552rM(Activity activity, AnonymousClass013 r3, C17250um r4, EmojiSearchContainer emojiSearchContainer, C108725Pc r6, C17020u3 r7, int i2) {
        this.A07 = emojiSearchContainer;
        this.A02 = activity.getLayoutInflater();
        this.A04 = r4;
        this.A03 = r3;
        this.A06 = r7;
        this.A05 = r6;
        this.A01 = i2;
    }

    public /* bridge */ /* synthetic */ void A05(C005602k r1) {
        ((C57732rf) r1).A07();
    }

    public synchronized int A0C() {
        AnonymousClass2X4 r0;
        r0 = this.A00;
        return r0 == null ? 0 : r0.A01.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r3, int i2) {
        C57732rf r32 = (C57732rf) r3;
        synchronized (this) {
            r32.A01 = i2 < this.A00.A01.size() ? (C37781pj) this.A00.A01.get(i2) : null;
            r32.A00 = i2;
        }
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return new C57732rf(this.A02, viewGroup, this.A04, this.A05, this.A06, this.A01);
    }

    public void AWX(AnonymousClass2X4 r5) {
        if (r5.equals(this.A00)) {
            A01();
        }
        EmojiSearchContainer emojiSearchContainer = this.A07;
        int i2 = 8;
        emojiSearchContainer.A01.setVisibility(8);
        View view = emojiSearchContainer.A02;
        if (emojiSearchContainer.A08.A0C() == 0) {
            i2 = 0;
        }
        view.setVisibility(i2);
    }
}
