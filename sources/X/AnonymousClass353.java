package X;

import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.facebook.redex.RunnableRunnableShape18S0100000_I1_1;
import com.whatsapp.util.Log;
import java.util.List;
import org.apache.commons.io.FileUtils;

/* renamed from: X.353  reason: invalid class name */
public class AnonymousClass353 extends C85614Pd {
    public final /* synthetic */ AnonymousClass39R A00;

    public AnonymousClass353(AnonymousClass39R r1) {
        this.A00 = r1;
    }

    public void A00(List list) {
        list.size();
        boolean z2 = false;
        if (list.size() == 1 && ((C37771pi) list.get(0)).A0Q) {
            z2 = true;
        }
        if (list.size() == 0 || z2) {
            AnonymousClass1MI r2 = this.A00.A07;
            RunnableRunnableShape18S0100000_I1_1 runnableRunnableShape18S0100000_I1_1 = new RunnableRunnableShape18S0100000_I1_1((Object) this, 25);
            if (r2.A00.A02(AnonymousClass1XK.A0S, 0, FileUtils.ONE_MB, true, false, false, false)) {
                C20100zV r4 = r2.A01;
                r4.A03.Acl(new RunnableRunnableShape10S0200000_I0_8(r4, 36, new C78393xx(r2, runnableRunnableShape18S0100000_I1_1)));
                return;
            }
            Log.i("InitialStickerPackDownloader/downloadInitialStickerPack/autodownload is not safe, going to do nothing");
            return;
        }
        AnonymousClass39R r22 = this.A00;
        C13680ns.A0z(r22.A06.A05.A0K(), "sticker_picker_initial_download", true);
        r22.A00();
    }
}
