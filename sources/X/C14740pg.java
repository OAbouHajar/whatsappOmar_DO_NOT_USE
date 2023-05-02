package X;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0pg  reason: invalid class name and case insensitive filesystem */
public class C14740pg {
    public static long A00(C16180sb r4, C41721wT r5) {
        File file = r4.A05().A0A;
        C16180sb.A04(file, false);
        long A00 = AnonymousClass1XI.A00((AnonymousClass024) null, file);
        r5.A01.A05("STORAGE_USAGE_MEDIA_SIZE", String.valueOf(A00));
        r5.A01("STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME");
        return A00;
    }

    public static long A01(C14730pf r2, C14710pd r3) {
        if (r3 == null) {
            return 10000000;
        }
        int A03 = r3.A03(C16620tM.A02, 224);
        return A03 == -1 ? Math.min((r2.A04() * 1) / 100, 50000000) : ((long) A03) * SearchActionVerificationClientService.MS_TO_NS;
    }

    public static Cursor A02(C16480t8 r7, C15830rv r8, int i2, int i3) {
        Throwable th;
        C16800tf r1;
        Cursor cursor;
        if (i2 != 0) {
            if (i2 == 1) {
                if (i3 == 0) {
                    Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedByIDDescCursor:");
                    String str = AnonymousClass4BD.A04;
                    String[] strArr = {String.valueOf(5)};
                    r1 = r7.A0B.get();
                    cursor = r1.A02.A08(str, strArr);
                } else if (i3 == 1) {
                    Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedByIDAscCursor:");
                    String str2 = AnonymousClass4BD.A03;
                    String[] strArr2 = {String.valueOf(5)};
                    r1 = r7.A0B.get();
                    cursor = r1.A02.A08(str2, strArr2);
                } else if (i3 == 2) {
                    Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedBySizeCursor:");
                    C16800tf A01 = r7.A0B.get();
                    try {
                        Cursor A08 = A01.A02.A08(r7.A07.A09() ? AnonymousClass4BD.A01 : AnonymousClass4BD.A02, new String[]{String.valueOf(5)});
                        A01.close();
                        return A08;
                    } catch (Throwable unused) {
                    }
                } else if (i3 == 3) {
                    Log.i("mediamsgstore/getForwardedMediaAndDocMessagesOrderedByForwardingScoreCursor_INTERNAL_ONLY:");
                    String str3 = AnonymousClass4BD.A00;
                    String[] strArr3 = {String.valueOf(3)};
                    r1 = r7.A0B.get();
                    try {
                        cursor = r1.A02.A08(str3, strArr3);
                    } catch (Throwable th2) {
                        th = th2;
                        r1.close();
                        throw th;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown sort type: ");
                    sb.append(i3);
                    throw new IllegalArgumentException(sb.toString());
                }
                r1.close();
                return cursor;
            } else if (i2 != 2) {
                StringBuilder sb2 = new StringBuilder("Unknown gallery type: ");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            } else if (i3 == 0) {
                return r7.A07((C15830rv) null, 5000000);
            } else {
                if (i3 == 1) {
                    return r7.A06((C15830rv) null, 5000000);
                }
                if (i3 == 2) {
                    return r7.A05((C15830rv) null, 5000000);
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unknown sort type: ");
                sb3.append(i3);
                throw new IllegalArgumentException(sb3.toString());
            }
        } else if (i3 == 0) {
            return r7.A07(r8, -1);
        } else {
            if (i3 == 1) {
                return r7.A06(r8, -1);
            }
            if (i3 == 2) {
                return r7.A05(r8, -1);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Unknown sort type: ");
            sb4.append(i3);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public static AnonymousClass1YK A03(C16460t6 r6, C25791Ld r7, Integer num, Long l2, List list) {
        if (!(num == null || l2 == null)) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C16740tZ A00 = r6.A0K.A00(((Number) it.next()).longValue());
                    if (A00 instanceof C16730tY) {
                        C16730tY r1 = (C16730tY) A00;
                        if (r1.A18()) {
                            arrayList.add(AnonymousClass3A5.A00(r1, r7));
                        }
                    }
                }
            }
            return new AnonymousClass1YK(arrayList, num.intValue(), l2.longValue());
        }
        return null;
    }

    public static String A04(Context context, AnonymousClass013 r10) {
        return context.getString(R.string.str16fb, new Object[]{r10.A0I(new Object[]{String.format(context.getResources().getConfiguration().locale, "%d", new Object[]{5L})}, 280, 5)});
    }

    public static void A05(Activity activity, C14600pS r7, C16490t9 r8, int i2) {
        r7.Afi(new C99864ui(activity, AnonymousClass4Y3.A00(r8, i2), i2), (Object[]) null, R.string.str0ba1, R.string.str0ba0, R.string.str0ca7);
    }
}
