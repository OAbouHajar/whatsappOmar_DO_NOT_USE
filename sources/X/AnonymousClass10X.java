package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.redex.IDxFCallbackShape0S1710000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0220000_I0;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.obwhatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.io.FileUtils;

/* renamed from: X.10X  reason: invalid class name */
public class AnonymousClass10X {
    public final C16180sb A00;
    public final C14870pt A01;
    public final C15900s5 A02;
    public final C16760tb A03;
    public final AnonymousClass01V A04;
    public final C16980tz A05;
    public final AnonymousClass013 A06;
    public final C16460t6 A07;
    public final C19150xq A08;
    public final C17250um A09;
    public final C14710pd A0A;
    public final C16490t9 A0B;
    public final C18210wK A0C;
    public final C17960vv A0D;
    public final AnonymousClass1HE A0E;
    public final AnonymousClass0y3 A0F;
    public final C17020u3 A0G;
    public final AnonymousClass1RV A0H;
    public final AnonymousClass1MF A0I;
    public final C18820xJ A0J;
    public final AnonymousClass1A9 A0K;
    public final C16320sq A0L;
    public final AnonymousClass1QZ A0M;

    public AnonymousClass10X(C16180sb r2, C14870pt r3, C15900s5 r4, C16760tb r5, AnonymousClass01V r6, C16980tz r7, AnonymousClass013 r8, C16460t6 r9, C19150xq r10, C17250um r11, C14710pd r12, C16490t9 r13, C18210wK r14, C17960vv r15, AnonymousClass1HE r16, AnonymousClass0y3 r17, C17020u3 r18, AnonymousClass1RV r19, AnonymousClass1MF r20, C18820xJ r21, AnonymousClass1A9 r22, C16320sq r23, AnonymousClass1QZ r24) {
        this.A0A = r12;
        this.A01 = r3;
        this.A05 = r7;
        this.A0L = r23;
        this.A00 = r2;
        this.A0B = r13;
        this.A09 = r11;
        this.A02 = r4;
        this.A03 = r5;
        this.A0M = r24;
        this.A0C = r14;
        this.A0J = r21;
        this.A0K = r22;
        this.A04 = r6;
        this.A06 = r8;
        this.A07 = r9;
        this.A08 = r10;
        this.A0H = r19;
        this.A0D = r15;
        this.A0F = r17;
        this.A0I = r20;
        this.A0E = r16;
        this.A0G = r18;
    }

    public void A00(Activity activity, C14600pS r29, AnonymousClass2KA r30, C35541m6 r31, String str, List list, List list2, int i2, boolean z2, boolean z3) {
        Activity activity2;
        C14600pS r7;
        AnonymousClass2KA r2;
        C35541m6 r13;
        String str2;
        List list3;
        Uri uri;
        C14870pt r4;
        int i3;
        StringBuilder sb = new StringBuilder("sendmedia/sendmedia/size=");
        sb.append(list2.size());
        Log.i(sb.toString());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            activity2 = activity;
            r7 = r29;
            r2 = r30;
            r13 = r31;
            str2 = str;
            list3 = list;
            if (!it.hasNext()) {
                break;
            }
            uri = (Uri) it.next();
            byte A002 = this.A0D.A00(uri);
            if (A002 != 1) {
                boolean z4 = z2;
                if (A002 == 2) {
                    this.A0K.A0c(uri, r7, new IDxFCallbackShape0S1710000_2_I0(activity2, uri, r7, r2, this, r13, str2, list3, 0, z4));
                } else if (A002 != 3) {
                    if (A002 == 4) {
                        this.A0L.Acl(new RunnableRunnableShape0S0300000_I0(this, uri, list3, 5));
                    } else if (A002 != 9) {
                        if (A002 == 13) {
                            if (z3) {
                                this.A0K.A0c(uri, r7, new IDxFCallbackShape0S1710000_2_I0(activity2, uri, r7, r2, this, r13, str2, list3, 1, z4));
                            }
                        }
                    } else if (C16030sJ.A0S(list3)) {
                        Log.e("sendmedia/senddocument/error: Trying to share a document to status");
                        this.A01.A09(R.string.str15fd, 0);
                    } else {
                        arrayList2.add(uri);
                    }
                } else if (z3) {
                    this.A0K.A0c(uri, r7, new AnonymousClass2KB(activity2, uri, r7, r2, this, r13, str2, list3));
                }
            } else if (z3) {
                try {
                    String str3 = str2;
                    A02(uri, r13, (AnonymousClass1XQ) null, (C16740tZ) null, str3, list3, C39501sa.A01(uri.getQueryParameter("mentions")), (List) null, i2, 0, false, false, false, false, false);
                } catch (IOException e2) {
                    Log.e("sendmedia/sendimages/share-failed/ ", e2);
                    if (e2.getMessage() == null || !e2.getMessage().contains("No space")) {
                        this.A01.A09(R.string.str15fd, 0);
                    } else {
                        r4 = this.A01;
                        i3 = R.string.str0852;
                    }
                } catch (AnonymousClass20M e3) {
                    Log.e("sendmedia/sendimages/share-failed/ ", e3);
                    r4 = this.A01;
                    i3 = R.string.str0840;
                } catch (OutOfMemoryError e4) {
                    Log.e("sendmedia/sendimages/share-failed/ ", e4);
                    r4 = this.A01;
                    i3 = R.string.str0855;
                } catch (SecurityException e5) {
                    Log.e("sendmedia/sendimages/share-failed/ ", e5);
                    this.A01.A07(R.string.str0de4, 0);
                }
                r2.AZS(uri);
            }
            arrayList.add(uri);
        }
        if (!arrayList.isEmpty()) {
            A03(r7, r2, arrayList2, list3);
            AnonymousClass2KC r1 = new AnonymousClass2KC(activity2);
            r1.A0E = arrayList;
            r1.A0C = str2;
            r1.A0D = C16030sJ.A06(list3);
            r1.A02 = 5;
            r1.A0I = true;
            if (list3.size() > 1) {
                r1.A0K = true;
            }
            if (C16030sJ.A0S(list3)) {
                r1.A09 = r13;
            }
            activity2.startActivity(r1.A00());
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                r2.AZR((Uri) it2.next());
            }
            return;
        } else if (!arrayList2.isEmpty()) {
            if (arrayList2.size() > 1 || !this.A0A.A0E(C16620tM.A02, 1750)) {
                A03(r7, r2, arrayList2, list3);
                return;
            }
            Uri uri2 = (Uri) arrayList2.get(0);
            activity2.startActivityForResult(new Intent().setClassName(activity2.getPackageName(), "com.obwhatsapp.documentpicker.DocumentPreviewActivity").putExtra("jid", C16030sJ.A03((Jid) list3.get(0))).putExtra("uri", uri2), 36);
            r2.AZR(uri2);
            return;
        } else if (list3.size() > 1) {
            activity2.startActivity(C14750ph.A02(activity2));
            return;
        } else {
            return;
        }
        r4.A07(i3, 0);
        r2.AZS(uri);
    }

    public void A01(Uri uri, C14600pS r24, C16740tZ r25, File file, String str, List list, List list2, boolean z2) {
        StringBuilder sb = new StringBuilder("sendmedia/send-document jids: ");
        List list3 = list;
        sb.append(Arrays.deepToString(list3.toArray()));
        Log.i(sb.toString());
        C16320sq r1 = this.A0L;
        C14710pd r11 = this.A0A;
        C14870pt r6 = this.A01;
        C16980tz r9 = this.A05;
        C16180sb r5 = this.A00;
        C16490t9 r12 = this.A0B;
        Uri uri2 = uri;
        C14600pS r4 = r24;
        r1.Ack(new AnonymousClass2K9(uri2, r4, r5, r6, this.A03, this.A04, r9, this.A06, r11, r12, this.A0C, r25, this.A0J, this.A0K, file, str, list3, list2, z2), new Void[0]);
    }

    public void A02(Uri uri, C35541m6 r24, AnonymousClass1XQ r25, C16740tZ r26, String str, List list, List list2, List list3, int i2, int i3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Uri uri2 = uri;
        Bitmap A0W = this.A0K.A0W(uri2, 100, 100);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        A0W.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        A0W.recycle();
        C16760tb r0 = this.A03;
        C18210wK r4 = this.A0C;
        C16750ta r6 = new C16750ta();
        byte b2 = 1;
        if (z4) {
            b2 = 42;
        }
        AnonymousClass1XQ r16 = r25;
        C16760tb r14 = r0;
        r14.A06(r4.A00(uri2, r6, r24, r26, str, list, list2, list3, b2, i2, i3, z2), r16, (C16730tY) null, byteArray, z3, z5, z6);
    }

    public final void A03(C14600pS r12, AnonymousClass2KA r13, ArrayList arrayList, List list) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            A01(uri, r12, (C16740tZ) null, (File) null, (String) null, list, (List) null, false);
            r13.AZS(uri);
        }
    }

    public void A04(C43241zg r12, boolean z2, boolean z3) {
        boolean z4;
        ArrayList arrayList = new ArrayList();
        C43241zg r7 = r12;
        CopyOnWriteArrayList copyOnWriteArrayList = r12.A01;
        Iterator it = Collections.unmodifiableList(copyOnWriteArrayList).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C16740tZ r2 = (C16740tZ) it.next();
            AnonymousClass1HE r1 = this.A0E;
            if ((r2 instanceof C16730tY) && r1.A01((C16730tY) r2) != null) {
                arrayList.add(r2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            StringBuilder sb = new StringBuilder("sendmedia/retrymediaupload/already-uploading ");
            C28381Vw r13 = ((C16740tZ) it2.next()).A11;
            sb.append(r13);
            Log.i(sb.toString());
            r12.A02(r13);
        }
        synchronized (r7) {
            z4 = false;
            if (copyOnWriteArrayList.size() == 0) {
                z4 = true;
            }
        }
        if (z4) {
            Log.i("sendmedia/retrymediaupload/nothing-to-upload");
        } else {
            this.A0L.Acl(new RunnableRunnableShape0S0220000_I0(this, r7, 0, z2, z3));
        }
    }

    public void A05(C16730tY r4) {
        C16750ta r1 = r4.A02;
        if (r4.A08 == null || !(r1 == null || r1.A0F == null)) {
            A06(r4, true, true);
        } else {
            this.A0F.A01(r4);
        }
        this.A08.A08(r4, -1);
    }

    public void A06(C16730tY r3, boolean z2, boolean z3) {
        C16750ta r1 = r3.A02;
        AnonymousClass00B.A06(r1);
        if (z2 && !r1.A0L) {
            r1.A0L = true;
            this.A07.A0e(r3, -1);
        }
        A04(new C43241zg(Collections.singletonList(r3)), z2, z3);
    }

    public boolean A07(C35541m6 r20, C16740tZ r21, AnonymousClass1XK r22, File file, String str, List list, boolean z2, boolean z3, boolean z4) {
        File A0B2;
        C14710pd r6 = this.A0A;
        AnonymousClass013 r8 = this.A06;
        C14870pt r7 = this.A01;
        C15900s5 r2 = this.A02;
        StringBuilder sb = new StringBuilder("mediafileutils/checkmediafilesize src:");
        File file2 = file;
        sb.append(file2.getAbsolutePath());
        Log.i(sb.toString());
        AnonymousClass1XK r3 = r22;
        int A032 = r3 == AnonymousClass1XK.A08 ? r6.A03(C16620tM.A02, 542) : r2.A02(C15910s6.A1f);
        long j2 = (long) A032;
        if (file2.length() > FileUtils.ONE_MB * j2) {
            StringBuilder sb2 = new StringBuilder("mediafileutils/checkmediafilesize/too large:");
            sb2.append(file2.length());
            Log.w(sb2.toString());
            String A0C2 = r8.A0C(R.string.str08e5, r8.A0I(new Object[]{String.format(AnonymousClass013.A00(r8.A00), "%d", new Object[]{Integer.valueOf(A032)})}, 280, j2));
            if (z2) {
                r7.A0H(A0C2, 1);
                return false;
            }
            r7.A0N(A0C2, 1);
            return false;
        }
        Log.i("sendmedia/sendmediafile");
        if (!z3) {
            A0B2 = file2;
        } else {
            C16180sb r1 = this.A00;
            A0B2 = C17970vw.A0B(r1, this.A0G, r3, file2, 0);
            Log.i("sendmedia/sendmediafile - sending hidden file");
            AnonymousClass1XI.A0B(r1.A04, file2, A0B2);
        }
        C16750ta r82 = new C16750ta();
        r82.A0F = A0B2;
        byte[] bArr = null;
        if (C31831f6.A03(r3) && (bArr = C18830xK.A03(C18830xK.A01(A0B2), 100)) == null) {
            Log.w("sendmedia/sendmediafile no video thumbnail generated");
        }
        this.A03.A07(this.A0C.A00((Uri) null, r82, r20, r21, str, list, (List) null, (List) null, r3.A00, 0, 0, z4), bArr, false, false);
        return true;
    }
}
