package X;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;

/* renamed from: X.2io  reason: invalid class name and case insensitive filesystem */
public final class C55082io {
    public int A00 = 3;
    public int A01;
    public C63543Ka A02;
    public boolean A03;
    public final Context A04;
    public final AudioManager A05;
    public final Handler A06;
    public final AnonymousClass5LB A07;

    public C55082io(Context context, Handler handler, AnonymousClass5LB r8) {
        boolean z2;
        Context applicationContext = context.getApplicationContext();
        this.A04 = applicationContext;
        this.A06 = handler;
        this.A07 = r8;
        Object systemService = applicationContext.getSystemService("audio");
        C90524eJ.A01(systemService);
        AudioManager audioManager = (AudioManager) systemService;
        this.A05 = audioManager;
        this.A01 = A00(audioManager, 3);
        if (AnonymousClass3C1.A01 >= 23) {
            z2 = audioManager.isStreamMute(3);
        } else {
            z2 = false;
            if (A00(audioManager, 3) == 0) {
                z2 = true;
            }
        }
        this.A03 = z2;
        C63543Ka r2 = new C63543Ka(this);
        try {
            applicationContext.registerReceiver(r2, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.A02 = r2;
        } catch (RuntimeException e2) {
            C89504cL.A02("StreamVolumeManager", "Error registering stream volume receiver", e2);
        }
    }

    public static int A00(AudioManager audioManager, int i2) {
        try {
            return audioManager.getStreamVolume(i2);
        } catch (RuntimeException e2) {
            StringBuilder sb = new StringBuilder("Could not retrieve stream volume for stream type ");
            sb.append(i2);
            C89504cL.A02("StreamVolumeManager", sb.toString(), e2);
            return audioManager.getStreamMaxVolume(i2);
        }
    }

    public int A01() {
        if (AnonymousClass3C1.A01 >= 28) {
            return this.A05.getStreamMinVolume(this.A00);
        }
        return 0;
    }

    public final void A02() {
        boolean z2;
        AudioManager audioManager = this.A05;
        int A002 = A00(audioManager, this.A00);
        int i2 = this.A00;
        if (AnonymousClass3C1.A01 >= 23) {
            z2 = audioManager.isStreamMute(i2);
        } else {
            z2 = false;
            if (A00(audioManager, i2) == 0) {
                z2 = true;
            }
        }
        if (this.A01 != A002 || this.A03 != z2) {
            this.A01 = A002;
            this.A03 = z2;
            Iterator it = ((C62543Dz) this.A07).A00.A0U.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException("onDeviceVolumeChanged");
            }
        }
    }

    public void A03(int i2) {
        if (this.A00 != i2) {
            this.A00 = i2;
            A02();
            AnonymousClass2PR r3 = ((C62543Dz) this.A07).A00;
            C55082io r0 = r3.A0P;
            AnonymousClass4TE r1 = new AnonymousClass4TE(r0.A01(), r0.A05.getStreamMaxVolume(r0.A00));
            if (!r1.equals(r3.A0D)) {
                r3.A0D = r1;
                Iterator it = r3.A0U.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw new NullPointerException("onDeviceInfoChanged");
                }
            }
        }
    }
}
