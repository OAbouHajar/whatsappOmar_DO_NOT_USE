package X;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.obwhatsapp.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.0Eg  reason: invalid class name and case insensitive filesystem */
public class C02640Eg extends C02650Eh implements View.OnClickListener {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = 1;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public ColorStateList A07;
    public final int A08;
    public final SearchableInfo A09;
    public final Context A0A;
    public final SearchView A0B;
    public final WeakHashMap A0C;

    public C02640Eg(SearchableInfo searchableInfo, Context context, SearchView searchView, WeakHashMap weakHashMap) {
        super(context, searchView.A0T);
        this.A0B = searchView;
        this.A09 = searchableInfo;
        this.A08 = searchView.A0S;
        this.A0A = context;
        this.A0C = weakHashMap;
    }

    public static String A00(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    public View A02(Context context, Cursor cursor, ViewGroup viewGroup) {
        View A022 = super.A02(context, cursor, viewGroup);
        A022.setTag(new C04910Om(A022));
        ((ImageView) A022.findViewById(R.id.edit_query)).setImageResource(this.A08);
        return A022;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0127, code lost:
        if (r13 != null) goto L_0x00a4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.view.View r25, android.content.Context r26, android.database.Cursor r27) {
        /*
            r24 = this;
            java.lang.Object r7 = r25.getTag()
            X.0Om r7 = (X.C04910Om) r7
            r6 = r24
            int r1 = r6.A00
            r5 = 0
            r0 = -1
            r8 = r27
            if (r1 == r0) goto L_0x0199
            int r17 = r8.getInt(r1)
        L_0x0014:
            android.widget.TextView r4 = r7.A03
            if (r4 == 0) goto L_0x002d
            int r0 = r6.A04
            java.lang.String r0 = A00(r8, r0)
            r4.setText(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 0
            if (r1 == 0) goto L_0x002a
            r0 = 8
        L_0x002a:
            r4.setVisibility(r0)
        L_0x002d:
            android.widget.TextView r9 = r7.A04
            r3 = 2
            r2 = 1
            if (r9 == 0) goto L_0x009a
            int r0 = r6.A06
            java.lang.String r1 = A00(r8, r0)
            if (r1 == 0) goto L_0x0191
            android.content.res.ColorStateList r0 = r6.A07
            if (r0 != 0) goto L_0x005c
            android.util.TypedValue r12 = new android.util.TypedValue
            r12.<init>()
            android.content.Context r11 = r6.A0A
            android.content.res.Resources$Theme r10 = r11.getTheme()
            r0 = 2130969890(0x7f040522, float:1.7548475E38)
            r10.resolveAttribute(r0, r12, r2)
            android.content.res.Resources r10 = r11.getResources()
            int r0 = r12.resourceId
            android.content.res.ColorStateList r0 = r10.getColorStateList(r0)
            r6.A07 = r0
        L_0x005c:
            android.text.SpannableString r11 = new android.text.SpannableString
            r11.<init>(r1)
            r19 = 0
            android.content.res.ColorStateList r0 = r6.A07
            android.text.style.TextAppearanceSpan r10 = new android.text.style.TextAppearanceSpan
            r20 = 0
            r21 = 0
            r23 = r19
            r18 = r10
            r22 = r0
            r18.<init>(r19, r20, r21, r22, r23)
            int r1 = r1.length()
            r0 = 33
            r11.setSpan(r10, r5, r1, r0)
        L_0x007d:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L_0x0187
            if (r4 == 0) goto L_0x008b
            r4.setSingleLine(r5)
            r4.setMaxLines(r3)
        L_0x008b:
            r9.setText(r11)
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            r0 = 0
            if (r1 == 0) goto L_0x0097
            r0 = 8
        L_0x0097:
            r9.setVisibility(r0)
        L_0x009a:
            android.widget.ImageView r12 = r7.A00
            if (r12 == 0) goto L_0x00ad
            int r1 = r6.A01
            r0 = -1
            if (r1 != r0) goto L_0x00f8
            r13 = 0
        L_0x00a4:
            r0 = 4
            r12.setImageDrawable(r13)
            if (r13 != 0) goto L_0x00ee
            r12.setVisibility(r0)
        L_0x00ad:
            android.widget.ImageView r10 = r7.A01
            r9 = 8
            if (r10 == 0) goto L_0x00c1
            int r1 = r6.A02
            r0 = -1
            if (r1 != r0) goto L_0x00e5
            r0 = 0
        L_0x00b9:
            r10.setImageDrawable(r0)
            if (r0 != 0) goto L_0x00db
            r10.setVisibility(r9)
        L_0x00c1:
            int r0 = r6.A03
            if (r0 == r3) goto L_0x00cb
            if (r0 != r2) goto L_0x019d
            r0 = r17 & 1
            if (r0 == 0) goto L_0x019d
        L_0x00cb:
            android.widget.ImageView r1 = r7.A02
            r1.setVisibility(r5)
            java.lang.CharSequence r0 = r4.getText()
            r1.setTag(r0)
            r1.setOnClickListener(r6)
            return
        L_0x00db:
            r10.setVisibility(r5)
            r0.setVisible(r5, r5)
            r0.setVisible(r2, r5)
            goto L_0x00c1
        L_0x00e5:
            java.lang.String r0 = r8.getString(r1)
            android.graphics.drawable.Drawable r0 = r6.A04(r0)
            goto L_0x00b9
        L_0x00ee:
            r12.setVisibility(r5)
            r13.setVisible(r5, r5)
            r13.setVisible(r2, r5)
            goto L_0x00ad
        L_0x00f8:
            java.lang.String r0 = r8.getString(r1)
            android.graphics.drawable.Drawable r13 = r6.A04(r0)
            if (r13 != 0) goto L_0x00a4
            android.app.SearchableInfo r0 = r6.A09
            android.content.ComponentName r16 = r0.getSearchActivity()
            java.lang.String r11 = r16.flattenToShortString()
            java.util.WeakHashMap r10 = r6.A0C
            boolean r0 = r10.containsKey(r11)
            r9 = 0
            if (r0 == 0) goto L_0x012b
            java.lang.Object r1 = r10.get(r11)
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1
            if (r1 == 0) goto L_0x017b
            android.content.Context r0 = r6.A0A
            android.content.res.Resources r0 = r0.getResources()
            android.graphics.drawable.Drawable r13 = r1.newDrawable(r0)
        L_0x0127:
            if (r13 == 0) goto L_0x017b
            goto L_0x00a4
        L_0x012b:
            java.lang.String r1 = "SuggestionsAdapter"
            android.content.Context r0 = r6.A0A
            android.content.pm.PackageManager r13 = r0.getPackageManager()
            r14 = 128(0x80, float:1.794E-43)
            r0 = r16
            android.content.pm.ActivityInfo r0 = r13.getActivityInfo(r0, r14)     // Catch:{ NameNotFoundException -> 0x0142 }
            int r14 = r0.getIconResource()
            if (r14 == 0) goto L_0x0171
            goto L_0x014c
        L_0x0142:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
            r13 = r9
            goto L_0x0172
        L_0x014c:
            java.lang.String r15 = r16.getPackageName()
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo
            android.graphics.drawable.Drawable r13 = r13.getDrawable(r15, r14, r0)
            if (r13 != 0) goto L_0x0176
            java.lang.String r0 = "Invalid icon resource "
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0r(r0)
            r13.append(r14)
            java.lang.String r0 = " for "
            r13.append(r0)
            java.lang.String r0 = r16.flattenToShortString()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r13)
            android.util.Log.w(r1, r0)
        L_0x0171:
            r13 = r9
        L_0x0172:
            r10.put(r11, r9)
            goto L_0x0127
        L_0x0176:
            android.graphics.drawable.Drawable$ConstantState r9 = r13.getConstantState()
            goto L_0x0172
        L_0x017b:
            android.content.Context r0 = r6.A0A
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r13 = r0.getDefaultActivityIcon()
            goto L_0x00a4
        L_0x0187:
            if (r4 == 0) goto L_0x008b
            r4.setSingleLine(r2)
            r4.setMaxLines(r2)
            goto L_0x008b
        L_0x0191:
            int r0 = r6.A05
            java.lang.String r11 = A00(r8, r0)
            goto L_0x007d
        L_0x0199:
            r17 = 0
            goto L_0x0014
        L_0x019d:
            android.widget.ImageView r0 = r7.A02
            r0.setVisibility(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02640Eg.A03(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    public final Drawable A04(String str) {
        WeakHashMap weakHashMap;
        Uri parse;
        FileNotFoundException fileNotFoundException;
        InputStream openInputStream;
        FileNotFoundException fileNotFoundException2;
        int i2;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("android.resource://");
                Context context = this.A0A;
                A0o.append(context.getPackageName());
                A0o.append("/");
                String A0l = AnonymousClass000.A0l(A0o, parseInt);
                WeakHashMap weakHashMap2 = this.A0C;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap2.get(A0l);
                Drawable newDrawable = constantState == null ? null : constantState.newDrawable();
                if (newDrawable != null) {
                    return newDrawable;
                }
                Drawable A042 = AnonymousClass00T.A04(context, parseInt);
                if (A042 != null) {
                    weakHashMap2.put(A0l, A042.getConstantState());
                }
                return A042;
            } catch (NumberFormatException unused) {
                weakHashMap = this.A0C;
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                if (constantState2 != null) {
                    drawable = constantState2.newDrawable();
                }
                if (drawable == null) {
                    parse = Uri.parse(str);
                    if ("android.resource".equals(parse.getScheme())) {
                        String authority = parse.getAuthority();
                        if (!TextUtils.isEmpty(authority)) {
                            try {
                                Resources resourcesForApplication = this.A0A.getPackageManager().getResourcesForApplication(authority);
                                List<String> pathSegments = parse.getPathSegments();
                                if (pathSegments != null) {
                                    int size = pathSegments.size();
                                    if (size == 1) {
                                        try {
                                            i2 = Integer.parseInt(AnonymousClass000.A0n(pathSegments, 0));
                                        } catch (NumberFormatException unused2) {
                                            fileNotFoundException2 = new FileNotFoundException(AnonymousClass000.A0g("Single path segment is not a resource ID: ", parse));
                                            throw fileNotFoundException2;
                                        }
                                    } else if (size == 2) {
                                        i2 = resourcesForApplication.getIdentifier(AnonymousClass000.A0n(pathSegments, 1), AnonymousClass000.A0n(pathSegments, 0), authority);
                                    } else {
                                        fileNotFoundException2 = new FileNotFoundException(AnonymousClass000.A0g("More than two path segments: ", parse));
                                    }
                                    if (i2 != 0) {
                                        drawable = resourcesForApplication.getDrawable(i2);
                                    } else {
                                        fileNotFoundException2 = new FileNotFoundException(AnonymousClass000.A0g("No resource found for: ", parse));
                                    }
                                } else {
                                    fileNotFoundException2 = new FileNotFoundException(AnonymousClass000.A0g("No path: ", parse));
                                }
                            } catch (PackageManager.NameNotFoundException unused3) {
                                fileNotFoundException2 = new FileNotFoundException(AnonymousClass000.A0g("No package found for authority: ", parse));
                            }
                        } else {
                            fileNotFoundException2 = new FileNotFoundException(AnonymousClass000.A0g("No authority: ", parse));
                        }
                        throw fileNotFoundException2;
                    }
                    openInputStream = this.A0A.getContentResolver().openInputStream(parse);
                    if (openInputStream != null) {
                        drawable = Drawable.createFromStream(openInputStream, (String) null);
                        try {
                            openInputStream.close();
                        } catch (IOException e2) {
                            Log.e("SuggestionsAdapter", AnonymousClass000.A0f(parse, AnonymousClass000.A0q("Error closing icon stream for ")), e2);
                        }
                    } else {
                        fileNotFoundException = new FileNotFoundException(AnonymousClass000.A0e(parse, "Failed to open ", AnonymousClass000.A0o()));
                    }
                }
            } catch (Resources.NotFoundException unused4) {
                Log.w("SuggestionsAdapter", AnonymousClass000.A0h(str, AnonymousClass000.A0r("Icon resource not found: ")));
                return null;
            } catch (Resources.NotFoundException unused5) {
                fileNotFoundException = new FileNotFoundException(AnonymousClass000.A0e(parse, "Resource does not exist: ", AnonymousClass000.A0o()));
            } catch (FileNotFoundException e3) {
                StringBuilder A0r = AnonymousClass000.A0r("Icon not found: ");
                AnonymousClass000.A1H(parse, A0r);
                Log.w("SuggestionsAdapter", AnonymousClass000.A0h(e3.getMessage(), A0r));
                drawable = null;
            } catch (Throwable th) {
                try {
                    openInputStream.close();
                } catch (IOException e4) {
                    Log.e("SuggestionsAdapter", AnonymousClass000.A0f(parse, AnonymousClass000.A0q("Error closing icon stream for ")), e4);
                }
                throw th;
            }
        }
        return drawable;
        throw fileNotFoundException;
        if (drawable != null) {
            weakHashMap.put(str, drawable.getConstantState());
        }
        return drawable;
    }

    public void A65(Cursor cursor) {
        try {
            super.A65(cursor);
            if (cursor != null) {
                this.A04 = cursor.getColumnIndex("suggest_text_1");
                this.A05 = cursor.getColumnIndex("suggest_text_2");
                this.A06 = cursor.getColumnIndex("suggest_text_2_url");
                this.A01 = cursor.getColumnIndex("suggest_icon_1");
                this.A02 = cursor.getColumnIndex("suggest_icon_2");
                this.A00 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    public CharSequence A6k(Cursor cursor) {
        String A002;
        if (cursor != null) {
            String A003 = A00(cursor, cursor.getColumnIndex("suggest_intent_query"));
            if (A003 == null) {
                SearchableInfo searchableInfo = this.A09;
                if (!searchableInfo.shouldRewriteQueryFromData() || (A003 = A00(cursor, cursor.getColumnIndex("suggest_intent_data"))) == null) {
                    if (!searchableInfo.shouldRewriteQueryFromText() || (A002 = A00(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
                        return null;
                    }
                    return A002;
                }
            }
            return A003;
        }
        return null;
    }

    public Cursor Acr(CharSequence charSequence) {
        Cursor cursor;
        String suggestAuthority;
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        SearchView searchView = this.A0B;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                SearchableInfo searchableInfo = this.A09;
                String[] strArr = null;
                if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
                    cursor = null;
                } else {
                    Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
                    String suggestPath = searchableInfo.getSuggestPath();
                    if (suggestPath != null) {
                        fragment.appendEncodedPath(suggestPath);
                    }
                    fragment.appendPath("search_suggest_query");
                    String suggestSelection = searchableInfo.getSuggestSelection();
                    if (suggestSelection != null) {
                        strArr = new String[]{charSequence2};
                    } else {
                        fragment.appendPath(charSequence2);
                    }
                    fragment.appendQueryParameter("limit", String.valueOf(50));
                    cursor = this.A0A.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr, (String) null);
                }
                if (cursor != null) {
                    cursor.getCount();
                    return cursor;
                }
            } catch (RuntimeException e2) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e2);
            }
        }
        return null;
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View A012 = A01(this.A0A, this.A02, viewGroup);
            if (A012 != null) {
                ((C04910Om) A012.getTag()).A03.setText(e2.toString());
            }
            return A012;
        }
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View A022 = A02(this.A0A, this.A02, viewGroup);
            ((C04910Om) A022.getTag()).A03.setText(e2.toString());
            return A022;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        Bundle extras;
        super.notifyDataSetChanged();
        Cursor cursor = this.A02;
        if (cursor != null && (extras = cursor.getExtras()) != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void notifyDataSetInvalidated() {
        Bundle extras;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.A02;
        if (cursor != null && (extras = cursor.getExtras()) != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.A0B.A0E((CharSequence) tag);
        }
    }
}
