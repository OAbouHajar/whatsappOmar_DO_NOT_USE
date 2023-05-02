package X;

import com.obwhatsapp.status.playback.StatusPlaybackActivity;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.398  reason: invalid class name */
public class AnonymousClass398 {
    public List A00 = AnonymousClass000.A0u();
    public final HashMap A01 = AnonymousClass000.A0x();
    public final /* synthetic */ StatusPlaybackActivity A02;

    public AnonymousClass398(StatusPlaybackActivity statusPlaybackActivity) {
        this.A02 = statusPlaybackActivity;
    }

    public int A00(String str) {
        int i2 = 0;
        for (AnonymousClass4FE r0 : this.A00) {
            if (r0.A00.A0B.getRawString().equals(str)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public void A01(AnonymousClass4FE r4) {
        this.A00.add(r4);
        String rawString = r4.A00.A0B.getRawString();
        HashMap hashMap = this.A01;
        if (!hashMap.containsKey(rawString)) {
            hashMap.put(rawString, C13690nt.A0W(hashMap.size()));
        }
    }
}
