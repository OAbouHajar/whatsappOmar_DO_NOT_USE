package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

/* renamed from: X.34s  reason: invalid class name and case insensitive filesystem */
public class C606434s extends C41841wk {
    public final View A00;
    public final AnonymousClass4WP A01;

    public C606434s(C14870pt r11, C17090uW r12, AnonymousClass01V r13, AnonymousClass013 r14, AnonymousClass1P8 r15, AnonymousClass4WP r16, AnonymousClass4Ta r17) {
        super(r12, r11, r13, r14, r15, r17);
        this.A01 = r16;
        View inflate = LayoutInflater.from(A01()).inflate(R.layout.layout0571, (ViewGroup) null);
        this.A00 = inflate;
        C13680ns.A0L(inflate, R.id.status_playback_deleting_subtitle).setText(R.string.str06bb);
    }

    public long A08() {
        return this.A01.A00;
    }

    public void A09() {
        C41841wk.A00(this.A01, this);
    }

    public void A0A() {
        this.A01.A02();
    }
}
