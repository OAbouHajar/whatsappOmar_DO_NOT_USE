package X;

import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2px  reason: invalid class name and case insensitive filesystem */
public class C57042px extends C05340Qi {
    public static final Set A03;
    public static final Set A04 = Collections.unmodifiableSet(new HashSet(Collections.singletonList(5)));
    public final C16300so A00;
    public final AnonymousClass5PX A01;
    public final String A02;

    static {
        Integer[] numArr = new Integer[5];
        AnonymousClass000.A1K(numArr, 4);
        AnonymousClass000.A1L(numArr, 11);
        numArr[2] = 12;
        numArr[3] = 14;
        AnonymousClass000.A1M(numArr, 15, 4);
        A03 = Collections.unmodifiableSet(new HashSet(Arrays.asList(numArr)));
    }

    public C57042px(C16300so r1, AnonymousClass5PX r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public void A00() {
        Log.i("DeviceAuthenticationPlugin/AuthenticationCallback/failed");
    }

    public void A01(int i2, CharSequence charSequence) {
        AnonymousClass5PX r1;
        int i3;
        Log.i(C13680ns.A0c(i2, "DeviceAuthenticationPlugin/AuthenticationCallback/errorCode: "));
        Set set = A03;
        Integer valueOf = Integer.valueOf(i2);
        if (set.contains(valueOf)) {
            this.A00.AcB(AnonymousClass000.A0h(this.A02, AnonymousClass000.A0r("DeviceAuthenticationPlugin/FatalError/")), String.valueOf(i2), false);
            r1 = this.A01;
            i3 = 2;
        } else if (A04.contains(valueOf)) {
            this.A00.AcB(AnonymousClass000.A0h(this.A02, AnonymousClass000.A0r("DeviceAuthenticationPlugin/TemporaryError/")), String.valueOf(i2), false);
            r1 = this.A01;
            i3 = 3;
        } else {
            this.A01.AMw(0);
            return;
        }
        r1.AMw(i3);
    }

    public void A02(C04730Nr r3) {
        Log.i("DeviceAuthenticationPlugin/AuthenticationCallback/succeeded");
        this.A01.AMw(-1);
    }
}
