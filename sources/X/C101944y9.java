package X;

import android.content.res.Resources;
import android.os.Handler;
import com.obwhatsapp.emoji.EmojiDescriptor;

/* renamed from: X.4y9  reason: invalid class name and case insensitive filesystem */
public class C101944y9 implements AnonymousClass20Z {
    public final Resources A00;
    public final Handler A01 = AnonymousClass000.A0L();
    public final int[] A02;
    public final /* synthetic */ C26171Mp A03;

    public C101944y9(Resources resources, C26171Mp r3, int[] iArr) {
        this.A03 = r3;
        this.A02 = iArr;
        this.A00 = resources;
    }

    public void AQQ() {
    }

    public /* bridge */ /* synthetic */ void AVi(Object obj) {
        C434420a r3 = new C434420a(this.A02);
        long A002 = EmojiDescriptor.A00(r3, false);
        this.A01.post(new C1043955e(this.A03.A0B.A02(this.A00, (AnonymousClass20Z) null, r3, A002), this, A002));
    }
}
