package X;

import android.net.Uri;
import android.util.Pair;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: X.37Q  reason: invalid class name */
public class AnonymousClass37Q extends C16690tT {
    public final Uri A00;
    public final C77563vy A01;
    public final AnonymousClass1KN A02;
    public final C19080xj A03;

    public AnonymousClass37Q(C77563vy r2, AnonymousClass1KN r3, C19080xj r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = null;
    }

    public AnonymousClass37Q(Uri uri, C77563vy r2, AnonymousClass1KN r3, C19080xj r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = uri;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long j2;
        int i2;
        AnonymousClass1KN r9 = this.A02;
        Uri uri = this.A00;
        if (uri != null) {
            try {
                AnonymousClass2GB r3 = (AnonymousClass2GB) C28541Wm.A0D(AnonymousClass2GB.A05, r9.A03.A07.A00.getContentResolver().openInputStream(uri));
                boolean z2 = false;
                if ((r3.A00 & 8) == 8) {
                    z2 = true;
                }
                if (z2) {
                    AnonymousClass2G7 r2 = r3.A02;
                    if (r2 == null) {
                        r2 = AnonymousClass2G7.A0f;
                    }
                    if ((r2.A02 & 32) == 32) {
                        j2 = r2.A03;
                        if (Long.valueOf(j2) == null) {
                        }
                    }
                }
            } catch (IOException e2) {
                Log.e("backup-export-storage/read_backup-export-file-size-from-metadata/failed/", e2);
            }
            j2 = -1;
        } else {
            C16190sc r22 = r9.A07;
            long A002 = AnonymousClass1XI.A00((AnonymousClass024) null, (File) r22.A03.get());
            long A003 = AnonymousClass1XI.A00((AnonymousClass024) null, r22.A03());
            long j3 = 0;
            try {
                File A0B = r9.A0A.A0B();
                if (A0B.exists()) {
                    j3 = A0B.length();
                }
            } catch (IllegalStateException unused) {
            }
            j2 = (A002 - A003) + j3;
        }
        if (j2 == -1) {
            i2 = 2;
        } else {
            i2 = 1;
            if (r9.A09.A01() > j2) {
                i2 = 0;
            }
        }
        return C13690nt.A0I(Integer.valueOf(i2), Long.valueOf(j2));
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Pair pair = (Pair) obj;
        C77563vy r1 = this.A01;
        int A0D = AnonymousClass000.A0D(pair.first);
        long A012 = C13700nu.A01(pair.second);
        Iterator A002 = C16590tJ.A00(r1);
        while (A002.hasNext()) {
            ((AnonymousClass5RR) A002.next()).AML(A0D, A012);
        }
        this.A03.A00(1, false);
    }
}
