package X;

import android.os.Handler;
import android.os.Looper;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: X.1H8  reason: invalid class name */
public class AnonymousClass1H8 {
    public final Handler A00 = new C46622Fe(Looper.getMainLooper(), this);
    public final C16600tK A01;
    public final C14710pd A02;
    public final C27671Sr A03;
    public final C27661Sq A04;
    public final C17190ug A05;
    public final HashMap A06 = new HashMap();

    public AnonymousClass1H8(C16600tK r3, C14710pd r4, C27671Sr r5, C27661Sq r6, C17190ug r7) {
        this.A02 = r4;
        this.A04 = r6;
        this.A05 = r7;
        this.A01 = r3;
        this.A03 = r5;
    }

    public static /* synthetic */ void A00(AnonymousClass1H8 r5, C15830rv r6) {
        C17190ug r3 = r5.A05;
        C46652Fh r52 = new C46652Fh();
        C32461gQ r4 = new C32461gQ("chatstate");
        if (C32271fx.A0A(r6, Arrays.asList(new Class[]{C16050sL.class, UserJid.class}))) {
            r4.A02(new C35081lL((Jid) r6, "to"));
        }
        r4.A05(r52.A00, new ArrayList());
        r52.Aaf(r4, Collections.EMPTY_LIST);
        r3.A0D(r4.A01(), 5);
        StringBuilder sb = new StringBuilder("HandleMeComposing/write/paused; toJid=");
        sb.append(r6);
        Log.i(sb.toString());
    }

    public static /* synthetic */ void A01(AnonymousClass1H8 r6, C15830rv r7, int i2) {
        if (!yo.yoHideComposeG()) {
            C17190ug r3 = r6.A05;
            C46632Ff r5 = new C46632Ff("audio".equals(i2 == 1 ? "audio" : null));
            C32461gQ r4 = new C32461gQ("chatstate");
            if (C32271fx.A0A(r7, Arrays.asList(new Class[]{C16050sL.class, UserJid.class}))) {
                r4.A02(new C35081lL((Jid) r7, "to"));
            }
            r4.A05(r5.A00, new ArrayList());
            r5.Aaf(r4, Collections.EMPTY_LIST);
            r3.A0D(r4.A01(), 4);
            StringBuilder sb = new StringBuilder("HandleMeComposing/sendComposing; toJid=");
            sb.append(r7);
            sb.append("; media=");
            sb.append(i2);
            Log.i(sb.toString());
        }
    }
}
