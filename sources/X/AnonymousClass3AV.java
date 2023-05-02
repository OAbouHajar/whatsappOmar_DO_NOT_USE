package X;

import android.os.SystemClock;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import org.apache.commons.io.FileUtils;

/* renamed from: X.3AV  reason: invalid class name */
public class AnonymousClass3AV {
    public static final byte[] A07 = {102, 116, 121, 112};
    public static final byte[] A08 = {109, 100, 97, 116};
    public static final byte[] A09 = {109, 111, 111, 118};
    public int A00 = 0;
    public long A01 = 262144;
    public final long A02;
    public final C16300so A03;
    public final Mp4Ops A04;
    public final C16980tz A05;
    public final File A06;

    public AnonymousClass3AV(C16300so r3, Mp4Ops mp4Ops, C16980tz r5, File file, long j2) {
        this.A05 = r5;
        this.A04 = mp4Ops;
        this.A03 = r3;
        this.A06 = file;
        this.A02 = j2;
    }

    public static int A00(byte[] bArr) {
        return ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
    }

    public final int A01(boolean z2) {
        AnonymousClass20O r1;
        Mp4Ops.LibMp4StreamCheckResult mp4streamcheck;
        try {
            File file = this.A06;
            long j2 = this.A02;
            Log.i("mp4ops/check/start");
            int i2 = 0;
            while (true) {
                try {
                    mp4streamcheck = Mp4Ops.mp4streamcheck(file.getAbsolutePath(), z2, j2);
                    if (mp4streamcheck.success || !mp4streamcheck.ioException) {
                        break;
                    }
                    SystemClock.sleep(100);
                    i2++;
                    if (i2 >= 5) {
                        break;
                    }
                } catch (Error e2) {
                    Log.e("mp4ops/integration fail/", e2);
                    r1 = new AnonymousClass20O(0, "stream integrity check error");
                }
            }
            AnonymousClass00B.A06(mp4streamcheck);
            if (mp4streamcheck.success) {
                Log.i("mp4ops/streamcheck/finished");
                long j3 = mp4streamcheck.bytesRequiredToExtractThumbnail;
                if (j3 <= 0) {
                    return 1;
                }
                this.A01 = j3;
                return 1;
            }
            Log.e(AnonymousClass000.A0h(mp4streamcheck.errorMessage, AnonymousClass000.A0r("mp4ops/streamcheck/error_message/")));
            int i3 = mp4streamcheck.errorCode;
            r1 = new AnonymousClass20O(i3, C13680ns.A0c(i3, "integrity check failed, error_code: "));
            throw r1;
        } catch (AnonymousClass20O e3) {
            Log.e("Mp4StreamCheck/failed/exception", e3);
            return 2;
        }
    }

    public boolean A02(long j2) {
        boolean z2;
        String str;
        boolean z3;
        long j3;
        boolean z4;
        if (this.A00 != 0) {
            return false;
        }
        FileInputStream fileInputStream = new FileInputStream(this.A06);
        try {
            byte[] bArr = new byte[8];
            if (fileInputStream.read(bArr, 0, 8) == 8) {
                byte[] bArr2 = A07;
                int length = bArr2.length;
                if (4 >= length) {
                    int i2 = 0;
                    while (true) {
                        z3 = true;
                        if (i2 < length) {
                            if (bArr[i2 + 4] != bArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            break;
                        }
                    }
                }
                z3 = false;
                int i3 = 2;
                if (z3) {
                    int i4 = (((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16)) | ((bArr[2] & 255) << 8)) | (bArr[3] & 255)) - 8;
                    int i5 = i4 + 8;
                    if (((long) i5) <= j2) {
                        fileInputStream.skip((long) i4);
                        boolean z5 = false;
                        while (true) {
                            if (((long) (i5 + 8)) >= j2) {
                                break;
                            }
                            int read = fileInputStream.read(bArr, 0, 8);
                            int i6 = i5 + read;
                            if (read != 8) {
                                break;
                            }
                            byte[] bArr3 = A09;
                            int length2 = bArr3.length;
                            if (4 >= length2) {
                                int i7 = 0;
                                while (i7 < length2) {
                                    if (bArr[i7 + 4] == bArr3[i7]) {
                                        i7++;
                                    }
                                }
                                int A002 = A00(bArr) - 8;
                                i5 = i6 + A002;
                                if (((long) i5) > j2) {
                                    break;
                                }
                                fileInputStream.skip((long) A002);
                                z5 = true;
                            }
                            byte[] bArr4 = A08;
                            int length3 = bArr4.length;
                            if (4 >= length3) {
                                int i8 = 0;
                                while (i8 < length3) {
                                    if (bArr[i8 + 4] == bArr4[i8]) {
                                        i8++;
                                    }
                                }
                                int A003 = A00(bArr) - 8;
                                if (((long) (i6 + 8)) < j2) {
                                    j3 = (long) (i6 + A003);
                                    z4 = true;
                                }
                            }
                            int A004 = A00(bArr) - 8;
                            fileInputStream.skip((long) A004);
                            i5 = i6 + A004;
                            if (((long) i5) > j2) {
                                break;
                            }
                        }
                        j3 = 0;
                        z4 = false;
                        if (z5) {
                            if (z4) {
                                long j4 = this.A02;
                                if (j3 <= j4) {
                                    i3 = j3 > j4 - FileUtils.ONE_KB ? A01(true) : A01(false);
                                }
                            }
                        } else if (z4) {
                            Log.e("Mp4StreamCheck/mdat before moov, failing check");
                        }
                    }
                }
                this.A00 = i3;
                z2 = false;
                str = C13680ns.A0i("Mp4StreamCheck/check complete: ", AnonymousClass000.A0o(), i3);
                Log.i(str);
                fileInputStream.close();
                return z2;
            }
            z2 = true;
            str = "Mp4StreamCheck/need more data to attempt stream check";
            Log.i(str);
            fileInputStream.close();
            return z2;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
