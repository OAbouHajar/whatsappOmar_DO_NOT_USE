package X;

import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.1uY  reason: invalid class name and case insensitive filesystem */
public class C40701uY implements C19550yc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C18800xH A01;
    public final /* synthetic */ Runnable A02;
    public final /* synthetic */ byte[] A03;
    public final /* synthetic */ byte[] A04;

    public C40701uY(C18800xH r1, Runnable runnable, byte[] bArr, byte[] bArr2, int i2) {
        this.A01 = r1;
        this.A00 = i2;
        this.A03 = bArr;
        this.A04 = bArr2;
        this.A02 = runnable;
    }

    public void APb(String str) {
        StringBuilder sb = new StringBuilder("BackupSendMethods/sendGetCipherKey/failed to deliver id=");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void AQe(C28371Vv r9, String str) {
        for (C28371Vv r1 : r9.A0O("error")) {
            if (r1 != null) {
                String A0N = r1.A0N("code", (String) null);
                String A0N2 = r1.A0N("text", (String) null);
                StringBuilder sb = new StringBuilder("BackupSendMethods/sendGetCipherKey id=");
                sb.append(str);
                sb.append(" error=");
                sb.append(A0N);
                sb.append(" ");
                sb.append(A0N2);
                Log.w(sb.toString());
                if (A0N != null) {
                    int parseInt = Integer.parseInt(A0N);
                    int i2 = this.A00;
                    byte[] bArr = this.A03;
                    byte[] bArr2 = this.A04;
                    Runnable runnable = this.A02;
                    Arrays.toString((byte[]) null);
                    Arrays.toString((byte[]) null);
                    Arrays.toString(bArr);
                    Arrays.toString(bArr2);
                    StringBuilder sb2 = new StringBuilder("BackupSendMethods/handleCreateCipherKeyResponse failed to create a key, creation_mode= ");
                    sb2.append(i2);
                    sb2.append(", error_code=");
                    sb2.append(parseInt);
                    Log.e(sb2.toString());
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        }
    }

    public void AYG(C28371Vv r16, String str) {
        C28371Vv A0I = r16.A0I(0);
        AnonymousClass00B.A06(A0I);
        C28371Vv.A06(A0I, "crypto");
        String A0N = A0I.A0N("version", (String) null);
        byte[] bArr = A0I.A0K("code").A01;
        byte[] bArr2 = A0I.A0K("password").A01;
        int i2 = this.A00;
        byte[] bArr3 = this.A03;
        byte[] bArr4 = this.A04;
        Runnable runnable = this.A02;
        Arrays.toString(bArr);
        Arrays.toString(bArr2);
        Arrays.toString(bArr3);
        Arrays.toString(bArr4);
        if (A0N == null || bArr == null || bArr2 == null) {
            StringBuilder sb = new StringBuilder("BackupSendMethods/handleCreateCipherKeyResponse failed to create a key, creation_mode= ");
            sb.append(i2);
            sb.append(", error_code=");
            sb.append(0);
            Log.e(sb.toString());
        } else {
            C18800xH r0 = this.A01;
            if (i2 != 1) {
                r0.A03.A00(A0N, bArr2, bArr, bArr3, 0);
            } else {
                C40691uX.A0A(r0.A02.A00, A0N, bArr, bArr2, bArr3, bArr4);
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
