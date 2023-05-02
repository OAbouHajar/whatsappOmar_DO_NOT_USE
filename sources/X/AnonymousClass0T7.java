package X;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import com.facebook.redex.IDxComparatorShape18S0000000_I1;
import com.obwhatsapp.yo.yo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.0T7  reason: invalid class name */
public class AnonymousClass0T7 {
    public static final Comparator A00 = new IDxComparatorShape18S0000000_I1(0);

    public static C04750Nu A00(Context context, C05160Pn r22) {
        int i2;
        Cursor cursor;
        boolean z2;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        C05160Pn r11 = r22;
        String str = r11.A01;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            String str2 = resolveContentProvider.packageName;
            String str3 = r11.A02;
            if (str2.equals(str3)) {
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                Signature[] yoSig = yo.getYoSig();
                ArrayList A0u = AnonymousClass000.A0u();
                for (Signature byteArray : yoSig) {
                    A0u.add(byteArray.toByteArray());
                }
                Comparator comparator = A00;
                Collections.sort(A0u, comparator);
                List list = r11.A04;
                if (list == null) {
                    list = AnonymousClass0LS.A00(resources, 0);
                }
                for (int i3 = 0; i3 < list.size(); i3++) {
                    ArrayList arrayList = new ArrayList((Collection) list.get(i3));
                    Collections.sort(arrayList, comparator);
                    if (A0u.size() == arrayList.size()) {
                        int i4 = 0;
                        while (i4 < A0u.size()) {
                            if (Arrays.equals((byte[]) A0u.get(i4), (byte[]) arrayList.get(i4))) {
                                i4++;
                            }
                        }
                        String str4 = resolveContentProvider.authority;
                        ArrayList A0u2 = AnonymousClass000.A0u();
                        Uri build = new Uri.Builder().scheme("content").authority(str4).build();
                        Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
                        String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                        ContentResolver contentResolver = context.getContentResolver();
                        if (Build.VERSION.SDK_INT > 16) {
                            i2 = 1;
                            cursor = contentResolver.query(build, strArr, "query = ?", new String[]{r11.A03}, (String) null, (CancellationSignal) null);
                        } else {
                            i2 = 1;
                            cursor = contentResolver.query(build, strArr, "query = ?", new String[]{r11.A03}, (String) null);
                        }
                        if (cursor != null) {
                            try {
                                if (cursor.getCount() > 0) {
                                    int columnIndex = cursor.getColumnIndex("result_code");
                                    A0u2 = AnonymousClass000.A0u();
                                    int columnIndex2 = cursor.getColumnIndex("_id");
                                    int columnIndex3 = cursor.getColumnIndex("file_id");
                                    int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                                    int columnIndex5 = cursor.getColumnIndex("font_weight");
                                    int columnIndex6 = cursor.getColumnIndex("font_italic");
                                    while (cursor.moveToNext()) {
                                        int i5 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                                        int i6 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                                        Uri withAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                                        int i7 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                                        if (columnIndex6 != -1) {
                                            z2 = true;
                                            if (cursor.getInt(columnIndex6) == i2) {
                                                A0u2.add(new C04940Op(withAppendedId, i6, i7, i5, z2));
                                            }
                                        }
                                        z2 = false;
                                        A0u2.add(new C04940Op(withAppendedId, i6, i7, i5, z2));
                                    }
                                }
                            } finally {
                                cursor.close();
                            }
                        }
                        return new C04750Nu((C04940Op[]) A0u2.toArray(new C04940Op[0]), 0);
                    }
                }
                return new C04750Nu((C04940Op[]) null, 1);
            }
            StringBuilder A0r = AnonymousClass000.A0r("Found content provider ");
            A0r.append(str);
            A0r.append(", but package was not ");
            throw new PackageManager.NameNotFoundException(AnonymousClass000.A0h(str3, A0r));
        }
        throw new PackageManager.NameNotFoundException(AnonymousClass000.A0h(str, AnonymousClass000.A0r("No package found for authority: ")));
    }
}
