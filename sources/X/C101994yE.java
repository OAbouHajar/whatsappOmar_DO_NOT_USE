package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.4yE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C101994yE implements C108715Pb {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ ImageView A03;
    public final /* synthetic */ WaTextView A04;
    public final /* synthetic */ MessageReplyActivity A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ C101994yE(Resources resources, View view, ViewGroup viewGroup, ImageView imageView, WaTextView waTextView, MessageReplyActivity messageReplyActivity, boolean z2) {
        this.A05 = messageReplyActivity;
        this.A06 = z2;
        this.A02 = viewGroup;
        this.A01 = view;
        this.A03 = imageView;
        this.A00 = resources;
        this.A04 = waTextView;
    }

    public final void AXI(int[] iArr) {
        MessageReplyActivity messageReplyActivity = this.A05;
        boolean z2 = this.A06;
        ViewGroup viewGroup = this.A02;
        MessageReplyActivity.A02(this.A00, this.A01, viewGroup, this.A03, this.A04, messageReplyActivity, iArr, z2);
    }
}
