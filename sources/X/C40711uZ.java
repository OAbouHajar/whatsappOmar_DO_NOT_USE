package X;

import com.whatsapp.util.Log;

/* renamed from: X.1uZ  reason: invalid class name and case insensitive filesystem */
public class C40711uZ implements C19550yc {
    public final /* synthetic */ C18800xH A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ byte[] A03;
    public final /* synthetic */ byte[] A04;

    public C40711uZ(C18800xH r1, Runnable runnable, String str, byte[] bArr, byte[] bArr2) {
        this.A00 = r1;
        this.A02 = str;
        this.A04 = bArr;
        this.A03 = bArr2;
        this.A01 = runnable;
    }

    public void APb(String str) {
        StringBuilder sb = new StringBuilder("BackupSendMethods/sendGetCipherKey/failed to deliver id=");
        sb.append(str);
        Log.e(sb.toString());
    }

    public void AQe(C28371Vv r12, String str) {
        for (C28371Vv r1 : r12.A0O("error")) {
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
                    String str2 = this.A02;
                    byte[] bArr = this.A04;
                    byte[] bArr2 = this.A03;
                    Runnable runnable = this.A01;
                    if (str2 != null) {
                        StringBuilder sb2 = new StringBuilder("BackupSendMethods/sendGetCipherKey/success v=");
                        sb2.append(str2);
                        Log.i(sb2.toString());
                        this.A00.A03.A00(str2, (byte[]) null, bArr, bArr2, parseInt);
                    } else {
                        Log.w("BackupSendMethods/sendGetCipherKey/get-ck/file is null");
                    }
                    runnable.run();
                }
            }
        }
    }

    public void AYG(C28371Vv r10, String str) {
        C28371Vv A0I = r10.A0I(0);
        AnonymousClass00B.A06(A0I);
        C28371Vv.A06(A0I, "crypto");
        byte[] bArr = A0I.A0K("password").A01;
        String str2 = this.A02;
        byte[] bArr2 = this.A04;
        byte[] bArr3 = this.A03;
        Runnable runnable = this.A01;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder("BackupSendMethods/sendGetCipherKey/success v=");
            sb.append(str2);
            Log.i(sb.toString());
            this.A00.A03.A00(str2, bArr, bArr2, bArr3, 0);
        } else {
            Log.w("BackupSendMethods/sendGetCipherKey/get-ck/file is null");
        }
        runnable.run();
    }
}
