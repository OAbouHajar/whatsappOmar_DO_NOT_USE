package X;

import com.obwhatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.3Hq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C63363Hq implements Runnable {
    public final /* synthetic */ AnonymousClass38P A00;
    public final /* synthetic */ C70863i3 A01;
    public final /* synthetic */ C51412bd A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C63363Hq(AnonymousClass38P r1, C70863i3 r2, C51412bd r3, Map map, boolean z2) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = map;
        this.A04 = z2;
        this.A02 = r3;
    }

    public final void run() {
        long j2;
        long j3;
        long j4;
        AnonymousClass38P r12 = this.A00;
        C70863i3 r2 = this.A01;
        Map map = this.A03;
        boolean z2 = this.A04;
        C51412bd r26 = this.A02;
        C28921Zf r0 = new C28921Zf("restore>BackupApiBackupSelector/download-size-calc");
        try {
            AnonymousClass3BK r4 = r2.A01;
            AtomicBoolean atomicBoolean = r12.A0I;
            JSONObject jSONObject = r4.A0B;
            JSONObject jSONObject2 = jSONObject;
            long j5 = -1;
            if (jSONObject != null) {
                j5 = jSONObject.optLong("chatdbSize", -1);
            }
            if (z2) {
                j2 = j5;
                if (j5 > 0) {
                    r26.A00(Boolean.FALSE);
                }
            } else {
                j2 = 0;
            }
            StringBuilder A0r = AnonymousClass000.A0r("restore>BackupApiBackupSelector/calc-approx-total-download total size:");
            long j6 = r4.A04;
            A0r.append(j6);
            A0r.append(" dbSize: ");
            A0r.append(j5);
            A0r.append(" includeDbSize: ");
            A0r.append(z2);
            C13680ns.A1V(A0r);
            if (j6 < 0) {
                Log.e("restore>BackupApiBackupSelector/calc-approx-total-download totalSize is negative.");
            }
            if (j5 < 0) {
                Log.e("restore>BackupApiBackupSelector/calc-approx-total-download dbSize is negative.");
            }
            long j7 = j6 - j5;
            C16180sb r24 = r12.A01;
            File file = r24.A05().A0A;
            C16180sb.A04(file, false);
            if (file.exists()) {
                int i2 = 0;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                int i3 = 20;
                if (map.size() < 10) {
                    i3 = 1;
                }
                long j8 = 0;
                long j9 = 0;
                while (true) {
                    if (i2 < strArr.length) {
                        if (atomicBoolean.get()) {
                            Log.i("restore>BackupApiBackupSelector/calc-approx-media-download-size/interrupted");
                            j7 = -1;
                            break;
                        }
                        String str = strArr[i2];
                        if (str == null) {
                            Log.e("restore>BackupApiBackupSelector/calc-approx-media-download-size file upload path is null, unexpected.");
                        } else {
                            C16300so r13 = r12.A00;
                            C16190sc r15 = r12.A08;
                            String A06 = AnonymousClass2GK.A06(r12.A09.A00, r13, r15, str);
                            if (A06 == null) {
                                Log.i(C13680ns.A0h("restore>BackupApiBackupSelector/calc-approx-media-download-size/no-local-path-mapping ", str));
                            } else {
                                Object obj = map.get(str);
                                AnonymousClass00B.A06(obj);
                                C61743Ad r14 = (C61743Ad) obj;
                                File A0D = C13700nu.A0D(A06);
                                try {
                                    if (r24.A0T(A0D)) {
                                        if (!A0D.exists() || A0D.length() == 0) {
                                            j4 = r14.A00;
                                            j9 += j4;
                                        } else if (!z2) {
                                            j9 += r14.A00;
                                        } else if (i2 % i3 == 0) {
                                            j4 = r14.A00;
                                            j9 += j4;
                                            if (C62173By.A00(r14, r15, r12.A0A, A06) != 4) {
                                            }
                                        }
                                        j8 += j4;
                                        r26.A00(Boolean.FALSE);
                                    }
                                } catch (IOException e2) {
                                    Log.e(AnonymousClass000.A0g("gdrive-util/in-media-folder ", A0D), e2);
                                }
                            }
                        }
                        i2++;
                    } else if (j9 == 0) {
                        if (j8 > 0) {
                            StringBuilder A0r2 = AnonymousClass000.A0r("restore>BackupApiBackupSelector/calc-approx-media-download unexpected situation, how can toBeDownloadedSampleSize=");
                            A0r2.append(j8);
                            A0r2.append(" be greater than totalSampleSize=");
                            Log.e(C13680ns.A0j(A0r2, j9));
                        }
                        j7 = 0;
                    } else {
                        j7 = (long) (((((double) j8) * 1.0d) / ((double) j9)) * ((double) j7));
                    }
                }
            }
            long j10 = j2 + j7;
            r26.A00(Boolean.valueOf(AnonymousClass000.A1P((j10 > 0 ? 1 : (j10 == 0 ? 0 : -1)))));
            if (z2) {
                j3 = j10 - (jSONObject2 == null ? -1 : jSONObject2.optLong("chatdbSize", -1));
            } else {
                j3 = j10;
            }
            RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) r12.A0H.get();
            if (restoreFromBackupActivity != null) {
                restoreFromBackupActivity.A3M(j10, j3);
            }
        } catch (C31151db e3) {
            Log.e((Throwable) e3);
        }
        r0.A01();
    }
}
