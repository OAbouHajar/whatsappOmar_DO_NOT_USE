package X;

import android.app.Application;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.2AY  reason: invalid class name */
public class AnonymousClass2AY extends AnonymousClass02H {
    public String A00 = null;
    public boolean A01;
    public final AnonymousClass026 A02 = new AnonymousClass026();
    public final AnonymousClass026 A03 = new AnonymousClass026();
    public final AnonymousClass027 A04 = new AnonymousClass027();
    public final AnonymousClass027 A05 = new AnonymousClass027();
    public final AnonymousClass027 A06 = new AnonymousClass027();
    public final AnonymousClass027 A07 = new AnonymousClass027();
    public final AnonymousClass027 A08 = new AnonymousClass027();
    public final C16000sG A09;
    public final C16080sP A0A;
    public final AnonymousClass013 A0B;
    public final C23131Ap A0C;
    public final C30801cy A0D = new C30801cy();
    public final List A0E = new ArrayList();

    public AnonymousClass2AY(Application application, C16000sG r3, C16080sP r4, AnonymousClass013 r5, C23131Ap r6) {
        super(application);
        this.A09 = r3;
        this.A0B = r5;
        this.A0A = r4;
        this.A0C = r6;
    }

    public static final void A01(C16010sH r2, Map map) {
        String A092 = r2.A09();
        if (TextUtils.isEmpty(A092)) {
            Log.i("InviteNonWhatsAppContactPickerViewModel/fillNameToContactMap/display name missing");
            return;
        }
        List list = (List) map.get(A092);
        if (list == null) {
            list = new ArrayList();
        }
        list.add(r2);
        map.put(A092, list);
    }

    public void A05(String str) {
        this.A00 = str;
        ArrayList A022 = C40661uU.A02(this.A0B, str);
        this.A08.A0B(0);
        this.A06.A0B(A022);
    }
}
