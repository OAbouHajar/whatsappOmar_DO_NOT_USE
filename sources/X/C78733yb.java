package X;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import java.lang.ref.WeakReference;

/* renamed from: X.3yb  reason: invalid class name and case insensitive filesystem */
public class C78733yb extends C16690tT {
    public final WeakReference A00;
    public final WeakReference A01;

    public C78733yb(Context context, C82524Dd r3) {
        this.A01 = C13690nt.A0h(r3);
        this.A00 = C13690nt.A0h(context);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Uri uri;
        Context context;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length <= 0 || (uri = uriArr[0]) == null || (context = (Context) this.A00.get()) == null) {
            return null;
        }
        return RingtoneManager.getRingtone(context, uri);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Ringtone ringtone = (Ringtone) obj;
        C447225g r2 = ((C82524Dd) this.A01.get()).A00;
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null && callInfo.callState == CallState.RECEIVED_CALL && r2.A0J != null) {
            Ringtone ringtone2 = r2.A0H;
            if (ringtone2 != null) {
                ringtone2.stop();
            }
            r2.A0H = ringtone;
            if (ringtone != null) {
                try {
                    r2.A0R();
                } catch (Exception e2) {
                    Log.e((Throwable) e2);
                    try {
                        r2.A0H.stop();
                    } catch (Exception e3) {
                        Log.e((Throwable) e3);
                    }
                    r2.A0H = null;
                }
            } else {
                Log.e(AnonymousClass000.A0f(r2.A0J, AnonymousClass000.A0r("voip/ringtone/no-ringtone found for ")));
            }
        }
    }
}
