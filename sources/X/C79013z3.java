package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3z3  reason: invalid class name and case insensitive filesystem */
public class C79013z3 extends C16690tT {
    public final byte A00;
    public final AnonymousClass024 A01;
    public final C16300so A02;
    public final AnonymousClass01Z A03;
    public final C16460t6 A04;
    public final C16480t8 A05;
    public final C16490t9 A06;
    public final C221516v A07;
    public final File A08;
    public final WeakReference A09 = C13690nt.A0h((Object) null);

    public C79013z3(C16300so r4, AnonymousClass01Z r5, C16460t6 r6, C16480t8 r7, C16490t9 r8, C221516v r9, C16320sq r10, File file, byte b2) {
        this.A02 = r4;
        this.A06 = r8;
        this.A07 = r9;
        this.A00 = b2;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r5;
        this.A08 = file;
        this.A01 = C41711wS.A00(r10, 20000);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass4VH r8 = new AnonymousClass4VH();
        byte b2 = this.A00;
        r8.A00 = b2;
        C221516v r27 = this.A07;
        C16460t6 r26 = this.A04;
        C16480t8 r15 = this.A05;
        AnonymousClass01Z r14 = this.A03;
        File file = this.A08;
        AnonymousClass024 r12 = this.A01;
        ArrayList A0u = AnonymousClass000.A0u();
        try {
            r8.A0C = Long.valueOf(SystemClock.uptimeMillis());
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                ArrayList A0i = C13690nt.A0i(r3);
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        A0i.add(new AnonymousClass4I8(file2));
                    }
                }
                Collections.sort(A0i, AnonymousClass57E.A00);
                r8.A07 += (long) A0i.size();
                r8.A0B = Long.valueOf(SystemClock.uptimeMillis());
                r8.A0A = Long.valueOf(SystemClock.uptimeMillis());
                AnonymousClass03G r5 = new AnonymousClass03G();
                Iterator it = A0i.iterator();
                while (it.hasNext()) {
                    AnonymousClass4I8 r3 = (AnonymousClass4I8) it.next();
                    long j2 = r3.A00;
                    AnonymousClass4I9 r2 = (AnonymousClass4I9) r5.A04(j2, (Object) null);
                    if (r2 == null) {
                        r2 = new AnonymousClass4I9(j2);
                        r5.A09(j2, r2);
                    }
                    File file3 = r3.A01;
                    List list = r2.A01;
                    boolean z2 = true;
                    if (!list.isEmpty() && file3.getName().compareTo(((File) list.get(list.size() - 1)).getName()) < 0) {
                        z2 = false;
                    }
                    AnonymousClass00B.A0G(z2);
                    list.add(file3);
                }
                r12.A02();
                ArrayList A0u2 = AnonymousClass000.A0u();
                for (int i2 = 0; i2 < r5.A00(); i2++) {
                    AnonymousClass4I9 r22 = (AnonymousClass4I9) r5.A03(i2);
                    if (r22.A01.size() >= 2) {
                        A0u2.add(r22);
                        r8.A08 += (long) r22.A01.size();
                    }
                }
                r12.A02();
                Collections.sort(A0u2, AnonymousClass57F.A00);
                r12.A02();
                Iterator it2 = A0u2.iterator();
                while (it2.hasNext()) {
                    AnonymousClass4I9 r6 = (AnonymousClass4I9) it2.next();
                    HashMap A0x = AnonymousClass000.A0x();
                    List list2 = r6.A01;
                    int size = list2.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            File file4 = (File) list2.get(size);
                            try {
                                r12.A02();
                                String A002 = C37981q3.A00(file4);
                                long j3 = r6.A00;
                                r8.A04++;
                                r8.A01 += j3;
                                File file5 = (File) A0x.get(A002);
                                if (file5 == null) {
                                    A0x.put(A002, file4);
                                } else {
                                    file4.getParentFile();
                                    file4.getName();
                                    file5.getName();
                                    Collection<C16730tY> A0C = r15.A0C(r12, file4, A002);
                                    r12.A02();
                                    if (!A0C.isEmpty()) {
                                        ArrayList A0i2 = C13690nt.A0i(A0C.size());
                                        r14.A05(file5, A0C.size(), true);
                                        for (C16730tY r32 : A0C) {
                                            C16750ta r23 = r32.A02;
                                            AnonymousClass00B.A06(r23);
                                            r23.A0F = file5;
                                            r26.A0a(r32);
                                            A0i2.add(new AnonymousClass4IA(file4, file5));
                                        }
                                        r14.A00(file4, b2, A0C.size(), false, false);
                                        A0C.size();
                                        A0u.addAll(A0i2);
                                        long length = file5.length();
                                        r8.A06++;
                                        r8.A03 += length;
                                    } else {
                                        r27.A06(file4, b2);
                                        file4.delete();
                                        long length2 = file5.length();
                                        r8.A05++;
                                        r8.A02 += length2;
                                    }
                                }
                            } catch (IOException e2) {
                                Log.e("mediafilemerger/processfileswithsamelength", e2);
                            }
                        }
                    }
                }
            }
        } catch (AnonymousClass057 e3) {
            Log.e("mediafilemerger/cancelled", e3);
        } catch (Throwable th) {
            SystemClock.uptimeMillis();
            throw th;
        }
        r8.A09 = Long.valueOf(SystemClock.uptimeMillis());
        return new AnonymousClass4IB(r8, A0u);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass4IB r3 = (AnonymousClass4IB) obj;
        AnonymousClass1WE r0 = (AnonymousClass1WE) this.A09.get();
        if (r0 != null) {
            r0.accept(r3);
        }
        this.A06.A06(r3.A00.A01());
    }
}
