package androidx.appcompat.widget;

import X.AnonymousClass047;
import X.AnonymousClass049;
import X.AnonymousClass04B;
import X.C016807y;
import X.C02360Bh;
import X.C02640Eg;
import X.C02700Em;
import X.C06030Ty;
import X.C09340fL;
import X.C11580j0;
import X.C11590j1;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements AnonymousClass047 {
    public static final C06030Ty A0o = (Build.VERSION.SDK_INT < 29 ? new C06030Ty() : null);
    public int A00;
    public int A01;
    public SearchableInfo A02;
    public Rect A03;
    public Rect A04;
    public Bundle A05;
    public TextWatcher A06;
    public View.OnClickListener A07;
    public View.OnFocusChangeListener A08;
    public View.OnKeyListener A09;
    public C11580j0 A0A;
    public C016807y A0B;
    public C11590j1 A0C;
    public C02360Bh A0D;
    public AnonymousClass04B A0E;
    public CharSequence A0F;
    public CharSequence A0G;
    public CharSequence A0H;
    public Runnable A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public int[] A0Q;
    public int[] A0R;
    public final int A0S;
    public final int A0T;
    public final Intent A0U;
    public final Intent A0V;
    public final Drawable A0W;
    public final View.OnClickListener A0X;
    public final View A0Y;
    public final View A0Z;
    public final View A0a;
    public final View A0b;
    public final AdapterView.OnItemClickListener A0c;
    public final AdapterView.OnItemSelectedListener A0d;
    public final ImageView A0e;
    public final ImageView A0f;
    public final ImageView A0g;
    public final ImageView A0h;
    public final ImageView A0i;
    public final TextView.OnEditorActionListener A0j;
    public final SearchAutoComplete A0k;
    public final CharSequence A0l;
    public final Runnable A0m;
    public final WeakHashMap A0n;

    public class SearchAutoComplete extends AnonymousClass049 {
        public int A00;
        public SearchView A01;
        public boolean A02;
        public final Runnable A03;

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.attr0047);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.A03 = new C09340fL(this);
            this.A00 = getThreshold();
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001b A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private int getSearchViewTextMinWidthDp() {
            /*
                r4 = this;
                android.content.res.Resources r0 = r4.getResources()
                android.content.res.Configuration r3 = r0.getConfiguration()
                int r2 = r3.screenWidthDp
                int r1 = r3.screenHeightDp
                r0 = 960(0x3c0, float:1.345E-42)
                if (r2 < r0) goto L_0x001e
                r0 = 720(0x2d0, float:1.009E-42)
                if (r1 < r0) goto L_0x001b
                int r2 = r3.orientation
                r0 = 2
                r1 = 256(0x100, float:3.59E-43)
                if (r2 == r0) goto L_0x001d
            L_0x001b:
                r1 = 192(0xc0, float:2.69E-43)
            L_0x001d:
                return r1
            L_0x001e:
                r0 = 600(0x258, float:8.41E-43)
                r1 = 160(0xa0, float:2.24E-43)
                if (r2 < r0) goto L_0x001d
                goto L_0x001b
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.SearchAutoComplete.getSearchViewTextMinWidthDp():int");
        }

        public void A00() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            C06030Ty r0 = SearchView.A0o;
            C06030Ty.A00();
            Method method = r0.A02;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }

        public boolean enoughToFilter() {
            return this.A00 <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.A02) {
                Runnable runnable = this.A03;
                removeCallbacks(runnable);
                post(runnable);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z2, int i2, Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            SearchView searchView = this.A01;
            searchView.A0I(searchView.A0J());
            searchView.post(searchView.A0m);
            if (searchView.A0k.hasFocus()) {
                searchView.A06();
            }
        }

        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.A01.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        public void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.A01.hasFocus() && getVisibility() == 0) {
                this.A02 = true;
                if (getContext().getResources().getConfiguration().orientation == 2) {
                    A00();
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z2) {
                this.A02 = false;
                removeCallbacks(this.A03);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.A02 = false;
                removeCallbacks(this.A03);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.A02 = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.A01 = searchView;
        }

        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.A00 = i2;
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr043a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SearchView(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r13 = r17
            r2 = r18
            r3 = r19
            r1 = r20
            r13.<init>(r2, r3, r1)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r13.A03 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r13.A04 = r0
            r4 = 2
            int[] r0 = new int[r4]
            r13.A0Q = r0
            int[] r0 = new int[r4]
            r13.A0R = r0
            X.0fJ r0 = new X.0fJ
            r0.<init>(r13)
            r13.A0m = r0
            X.0fK r0 = new X.0fK
            r0.<init>(r13)
            r13.A0I = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r13.A0n = r0
            r12 = 0
            com.facebook.redex.IDxCListenerShape131S0100000_I0 r11 = new com.facebook.redex.IDxCListenerShape131S0100000_I0
            r11.<init>(r13, r12)
            r13.A0X = r11
            X.0Yi r0 = new X.0Yi
            r0.<init>(r13)
            r13.A09 = r0
            X.0ZD r10 = new X.0ZD
            r10.<init>(r13)
            r13.A0j = r10
            com.facebook.redex.IDxCListenerShape192S0100000_I0 r9 = new com.facebook.redex.IDxCListenerShape192S0100000_I0
            r9.<init>(r13, r12)
            r13.A0c = r9
            X.0Z5 r8 = new X.0Z5
            r8.<init>(r13)
            r13.A0d = r8
            X.0YN r0 = new X.0YN
            r0.<init>(r13)
            r13.A06 = r0
            int[] r0 = X.AnonymousClass05L.A0J
            X.07T r7 = X.AnonymousClass07T.A00(r2, r3, r0, r1, r12)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r1 = 9
            r0 = 2131558425(0x7f0d0019, float:1.8742165E38)
            android.content.res.TypedArray r6 = r7.A02
            int r1 = r6.getResourceId(r1, r0)
            r0 = 1
            r2.inflate(r1, r13, r0)
            r0 = 2131365991(0x7f0a1067, float:1.8351863E38)
            android.view.View r5 = r13.findViewById(r0)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r5 = (androidx.appcompat.widget.SearchView.SearchAutoComplete) r5
            r13.A0k = r5
            r5.A01 = r13
            r0 = 2131365931(0x7f0a102b, float:1.8351741E38)
            android.view.View r0 = r13.findViewById(r0)
            r13.A0Z = r0
            r0 = 2131365975(0x7f0a1057, float:1.835183E38)
            android.view.View r15 = r13.findViewById(r0)
            r13.A0a = r15
            r0 = 2131366503(0x7f0a1267, float:1.8352901E38)
            android.view.View r16 = r13.findViewById(r0)
            r0 = r16
            r13.A0b = r0
            r0 = 2131365914(0x7f0a101a, float:1.8351707E38)
            android.view.View r14 = r13.findViewById(r0)
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r13.A0h = r14
            r0 = 2131365938(0x7f0a1032, float:1.8351755E38)
            android.view.View r4 = r13.findViewById(r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r13.A0g = r4
            r0 = 2131365922(0x7f0a1022, float:1.8351723E38)
            android.view.View r3 = r13.findViewById(r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r13.A0e = r3
            r0 = 2131365999(0x7f0a106f, float:1.835188E38)
            android.view.View r2 = r13.findViewById(r0)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r13.A0i = r2
            r0 = 2131365951(0x7f0a103f, float:1.8351782E38)
            android.view.View r1 = r13.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r13.A0f = r1
            r0 = 10
            android.graphics.drawable.Drawable r0 = r7.A02(r0)
            r15.setBackground(r0)
            r0 = 14
            android.graphics.drawable.Drawable r15 = r7.A02(r0)
            r0 = r16
            r0.setBackground(r15)
            r15 = 13
            android.graphics.drawable.Drawable r0 = r7.A02(r15)
            r14.setImageDrawable(r0)
            r0 = 7
            android.graphics.drawable.Drawable r0 = r7.A02(r0)
            r4.setImageDrawable(r0)
            r0 = 4
            android.graphics.drawable.Drawable r0 = r7.A02(r0)
            r3.setImageDrawable(r0)
            r0 = 16
            android.graphics.drawable.Drawable r0 = r7.A02(r0)
            r2.setImageDrawable(r0)
            android.graphics.drawable.Drawable r0 = r7.A02(r15)
            r1.setImageDrawable(r0)
            r0 = 12
            android.graphics.drawable.Drawable r0 = r7.A02(r0)
            r13.A0W = r0
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131893187(0x7f121bc3, float:1.9421143E38)
            java.lang.String r0 = r1.getString(r0)
            X.AnonymousClass0L5.A00(r14, r0)
            r1 = 15
            r0 = 2131558424(0x7f0d0018, float:1.8742163E38)
            int r0 = r6.getResourceId(r1, r0)
            r13.A0T = r0
            r0 = 5
            int r0 = r6.getResourceId(r0, r12)
            r13.A0S = r0
            r14.setOnClickListener(r11)
            r3.setOnClickListener(r11)
            r4.setOnClickListener(r11)
            r2.setOnClickListener(r11)
            r5.setOnClickListener(r11)
            android.text.TextWatcher r0 = r13.A06
            r5.addTextChangedListener(r0)
            r5.setOnEditorActionListener(r10)
            r5.setOnItemClickListener(r9)
            r5.setOnItemSelectedListener(r8)
            android.view.View$OnKeyListener r0 = r13.A09
            r5.setOnKeyListener(r0)
            X.0Yh r0 = new X.0Yh
            r0.<init>(r13)
            r5.setOnFocusChangeListener(r0)
            r1 = 8
            r0 = 1
            boolean r0 = r6.getBoolean(r1, r0)
            r13.setIconifiedByDefault(r0)
            r1 = -1
            r0 = 1
            int r0 = r6.getDimensionPixelSize(r0, r1)
            if (r0 == r1) goto L_0x0180
            r13.setMaxWidth(r0)
        L_0x0180:
            r0 = 6
            java.lang.CharSequence r0 = r6.getText(r0)
            r13.A0l = r0
            r0 = 11
            java.lang.CharSequence r0 = r6.getText(r0)
            r13.A0G = r0
            r0 = 3
            int r0 = r6.getInt(r0, r1)
            if (r0 == r1) goto L_0x0199
            r13.setImeOptions(r0)
        L_0x0199:
            r0 = 2
            int r0 = r6.getInt(r0, r1)
            if (r0 == r1) goto L_0x01a3
            r13.setInputType(r0)
        L_0x01a3:
            r0 = 1
            boolean r0 = r6.getBoolean(r12, r0)
            r13.setFocusable(r0)
            r7.A04()
            java.lang.String r0 = "android.speech.action.WEB_SEARCH"
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0)
            r13.A0V = r3
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r2)
            java.lang.String r1 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r0 = "web_search"
            r3.putExtra(r1, r0)
            java.lang.String r1 = "android.speech.action.RECOGNIZE_SPEECH"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1)
            r13.A0U = r0
            r0.addFlags(r2)
            int r0 = r5.getDropDownAnchor()
            android.view.View r1 = r13.findViewById(r0)
            r13.A0Y = r1
            if (r1 == 0) goto L_0x01e3
            X.0Yk r0 = new X.0Yk
            r0.<init>(r13)
            r1.addOnLayoutChangeListener(r0)
        L_0x01e3:
            boolean r0 = r13.A0M
            r13.A0I(r0)
            r13.A0B()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.dimen0036);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.dimen0037);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.A0k;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void A06() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.A0k.refreshAutoCompleteResults();
            return;
        }
        C06030Ty r3 = A0o;
        SearchAutoComplete searchAutoComplete = this.A0k;
        C06030Ty.A00();
        Method method = r3.A01;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        C06030Ty.A00();
        Method method2 = r3.A00;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void A07() {
        SearchAutoComplete searchAutoComplete = this.A0k;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.A0M && this.A0A == null) {
            clearFocus();
            A0I(true);
        }
    }

    public void A08() {
        SearchAutoComplete searchAutoComplete = this.A0k;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C016807y r1 = this.A0B;
            if (r1 == null || !r1.AVb(text.toString())) {
                if (this.A02 != null) {
                    A0G(text.toString());
                }
                searchAutoComplete.setImeVisibility(false);
                searchAutoComplete.dismissDropDown();
            }
        }
    }

    public void A09() {
        int[] iArr = this.A0k.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.A0a.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.A0b.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void A0A() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.A0k.getText());
        int i2 = 0;
        if (!z3 && (!this.A0M || this.A0K)) {
            z2 = false;
        }
        ImageView imageView = this.A0e;
        if (!z2) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void A0B() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.A0k;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.A0M && (drawable = this.A0W) != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void A0C() {
        this.A0b.setVisibility(((this.A0O || this.A0P) && !A0J() && (this.A0g.getVisibility() == 0 || this.A0i.getVisibility() == 0)) ? 0 : 8);
    }

    public void A0D(int i2) {
        CharSequence A6k;
        Editable text = this.A0k.getText();
        Cursor cursor = this.A0E.A02;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i2) || (A6k = this.A0E.A6k(cursor)) == null) {
            setQuery(text);
        } else {
            setQuery(A6k);
        }
    }

    public void A0E(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void A0F(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.A0k;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.A0H = charSequence;
        }
    }

    public void A0G(String str) {
        Intent intent = new Intent("android.intent.action.SEARCH");
        intent.addFlags(268435456);
        intent.putExtra("user_query", this.A0H);
        if (str != null) {
            intent.putExtra("query", str);
        }
        Bundle bundle = this.A05;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.A02.getSearchActivity());
        getContext().startActivity(intent);
    }

    public final void A0H(boolean z2) {
        this.A0g.setVisibility((!this.A0O || A0J() || !hasFocus() || (!z2 && this.A0P)) ? 8 : 0);
    }

    public final void A0I(boolean z2) {
        this.A0L = z2;
        int i2 = 0;
        int i3 = 8;
        if (z2) {
            i3 = 0;
        }
        boolean z3 = !TextUtils.isEmpty(this.A0k.getText());
        this.A0h.setVisibility(i3);
        A0H(z3);
        View view = this.A0Z;
        int i4 = 0;
        if (z2) {
            i4 = 8;
        }
        view.setVisibility(i4);
        ImageView imageView = this.A0f;
        if (imageView.getDrawable() == null || this.A0M) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        A0A();
        boolean z4 = !z3;
        int i5 = 8;
        if (this.A0P && !A0J() && z4) {
            this.A0g.setVisibility(8);
            i5 = 0;
        }
        this.A0i.setVisibility(i5);
        A0C();
    }

    public boolean A0J() {
        return this.A0L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        if (r3 == null) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K(int r10) {
        /*
            r9 = this;
            r4 = 0
            X.04B r0 = r9.A0E
            android.database.Cursor r5 = r0.A02
            if (r5 == 0) goto L_0x00ea
            boolean r0 = r5.moveToPosition(r10)
            if (r0 == 0) goto L_0x00ea
            r7 = 0
            java.lang.String r0 = "suggest_intent_action"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x00b6 }
            java.lang.String r8 = X.C02640Eg.A00(r5, r0)     // Catch:{ RuntimeException -> 0x00b6 }
            if (r8 != 0) goto L_0x0024
            android.app.SearchableInfo r0 = r9.A02     // Catch:{ RuntimeException -> 0x00b6 }
            java.lang.String r8 = r0.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x00b6 }
            if (r8 != 0) goto L_0x0024
            java.lang.String r8 = "android.intent.action.SEARCH"
        L_0x0024:
            java.lang.String r0 = "suggest_intent_data"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x00b6 }
            java.lang.String r3 = X.C02640Eg.A00(r5, r0)     // Catch:{ RuntimeException -> 0x00b6 }
            if (r3 != 0) goto L_0x0038
            android.app.SearchableInfo r0 = r9.A02     // Catch:{ RuntimeException -> 0x00b6 }
            java.lang.String r3 = r0.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x00b6 }
            if (r3 == 0) goto L_0x005e
        L_0x0038:
            java.lang.String r0 = "suggest_intent_data_id"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x00b6 }
            java.lang.String r2 = X.C02640Eg.A00(r5, r0)     // Catch:{ RuntimeException -> 0x00b6 }
            if (r2 == 0) goto L_0x007d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00b6 }
            r1.<init>()     // Catch:{ RuntimeException -> 0x00b6 }
            r1.append(r3)     // Catch:{ RuntimeException -> 0x00b6 }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ RuntimeException -> 0x00b6 }
            java.lang.String r0 = android.net.Uri.encode(r2)     // Catch:{ RuntimeException -> 0x00b6 }
            r1.append(r0)     // Catch:{ RuntimeException -> 0x00b6 }
            java.lang.String r3 = r1.toString()     // Catch:{ RuntimeException -> 0x00b6 }
            if (r3 != 0) goto L_0x007d
        L_0x005e:
            java.lang.String r0 = "suggest_intent_query"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x00b6 }
            java.lang.String r6 = X.C02640Eg.A00(r5, r0)     // Catch:{ RuntimeException -> 0x00b6 }
            java.lang.String r0 = "suggest_intent_extra_data"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ RuntimeException -> 0x00b6 }
            java.lang.String r2 = X.C02640Eg.A00(r5, r0)     // Catch:{ RuntimeException -> 0x00b6 }
            android.content.Intent r3 = new android.content.Intent     // Catch:{ RuntimeException -> 0x00b6 }
            r3.<init>(r8)     // Catch:{ RuntimeException -> 0x00b6 }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r0)     // Catch:{ RuntimeException -> 0x00b6 }
            goto L_0x0082
        L_0x007d:
            android.net.Uri r7 = android.net.Uri.parse(r3)     // Catch:{ RuntimeException -> 0x00b6 }
            goto L_0x005e
        L_0x0082:
            if (r7 == 0) goto L_0x0087
            r3.setData(r7)     // Catch:{ RuntimeException -> 0x00b6 }
        L_0x0087:
            java.lang.CharSequence r1 = r9.A0H     // Catch:{ RuntimeException -> 0x00b6 }
            java.lang.String r0 = "user_query"
            r3.putExtra(r0, r1)     // Catch:{ RuntimeException -> 0x00b6 }
            if (r6 == 0) goto L_0x0095
            java.lang.String r0 = "query"
            r3.putExtra(r0, r6)     // Catch:{ RuntimeException -> 0x00b6 }
        L_0x0095:
            if (r2 == 0) goto L_0x009c
            java.lang.String r0 = "intent_extra_data_key"
            r3.putExtra(r0, r2)     // Catch:{ RuntimeException -> 0x00b6 }
        L_0x009c:
            android.os.Bundle r1 = r9.A05     // Catch:{ RuntimeException -> 0x00b6 }
            if (r1 == 0) goto L_0x00a5
            java.lang.String r0 = "app_data"
            r3.putExtra(r0, r1)     // Catch:{ RuntimeException -> 0x00b6 }
        L_0x00a5:
            android.app.SearchableInfo r0 = r9.A02     // Catch:{ RuntimeException -> 0x00b6 }
            android.content.ComponentName r0 = r0.getSearchActivity()     // Catch:{ RuntimeException -> 0x00b6 }
            r3.setComponent(r0)     // Catch:{ RuntimeException -> 0x00b6 }
            android.content.Context r0 = r9.getContext()     // Catch:{ RuntimeException -> 0x00d6 }
            r0.startActivity(r3)     // Catch:{ RuntimeException -> 0x00d6 }
            goto L_0x00ea
        L_0x00b6:
            r3 = move-exception
            int r2 = r5.getPosition()     // Catch:{ RuntimeException -> 0x00bc }
            goto L_0x00bd
        L_0x00bc:
            r2 = -1
        L_0x00bd:
            java.lang.String r0 = "Search suggestions cursor at row "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = " returned exception."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "SearchView"
            android.util.Log.w(r0, r1, r3)
            goto L_0x00ea
        L_0x00d6:
            r2 = move-exception
            java.lang.String r1 = "Failed launch activity: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "SearchView"
            android.util.Log.e(r0, r1, r2)
        L_0x00ea:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r9.A0k
            r0.setImeVisibility(r4)
            r0.dismissDropDown()
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.A0K(int):boolean");
    }

    public void clearFocus() {
        this.A0J = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.A0k;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.A0J = false;
    }

    public int getImeOptions() {
        return this.A0k.getImeOptions();
    }

    public int getInputType() {
        return this.A0k.getInputType();
    }

    public int getMaxWidth() {
        return this.A01;
    }

    public CharSequence getQuery() {
        return this.A0k.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.A0G;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.A02;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.A0l : getContext().getText(this.A02.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.A0S;
    }

    public int getSuggestionRowLayout() {
        return this.A0T;
    }

    public AnonymousClass04B getSuggestionsAdapter() {
        return this.A0E;
    }

    public void onActionViewCollapsed() {
        A0F("");
        clearFocus();
        A0I(true);
        this.A0k.setImeOptions(this.A00);
        this.A0K = false;
    }

    public void onActionViewExpanded() {
        if (!this.A0K) {
            this.A0K = true;
            SearchAutoComplete searchAutoComplete = this.A0k;
            int imeOptions = searchAutoComplete.getImeOptions();
            this.A00 = imeOptions;
            searchAutoComplete.setImeOptions(imeOptions | 33554432);
            searchAutoComplete.setText("");
            setIconified(false);
        }
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.A0m);
        post(this.A0I);
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            SearchAutoComplete searchAutoComplete = this.A0k;
            Rect rect = this.A03;
            int[] iArr = this.A0Q;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.A0R;
            getLocationInWindow(iArr2);
            int i6 = iArr[1] - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            Rect rect2 = this.A04;
            rect2.set(rect.left, 0, rect.right, i5 - i3);
            C02360Bh r2 = this.A0D;
            if (r2 == null) {
                C02360Bh r0 = new C02360Bh(rect2, rect, searchAutoComplete);
                this.A0D = r0;
                setTouchDelegate(r0);
                return;
            }
            r2.A04.set(rect2);
            Rect rect3 = r2.A03;
            rect3.set(rect2);
            int i8 = -r2.A01;
            rect3.inset(i8, i8);
            r2.A02.set(rect);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r0 > 0) goto L_0x001c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5.A0J()
            if (r0 != 0) goto L_0x0038
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r4 = android.view.View.MeasureSpec.getSize(r6)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r3) goto L_0x004e
            if (r0 == 0) goto L_0x0045
            if (r0 != r2) goto L_0x0020
            int r0 = r5.A01
            if (r0 <= 0) goto L_0x0020
        L_0x001c:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0020:
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            if (r0 == r3) goto L_0x003c
            if (r0 != 0) goto L_0x0030
            int r1 = r5.getPreferredHeight()
        L_0x0030:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
        L_0x0038:
            super.onMeasure(r6, r7)
            return
        L_0x003c:
            int r0 = r5.getPreferredHeight()
            int r1 = java.lang.Math.min(r0, r1)
            goto L_0x0030
        L_0x0045:
            int r4 = r5.A01
            if (r4 > 0) goto L_0x0020
            int r4 = r5.getPreferredWidth()
            goto L_0x0020
        L_0x004e:
            int r0 = r5.A01
            if (r0 > 0) goto L_0x001c
            int r0 = r5.getPreferredWidth()
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C02700Em)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C02700Em r2 = (C02700Em) parcelable;
        super.onRestoreInstanceState(r2.A00);
        A0I(r2.A00);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C02700Em r1 = new C02700Em(super.onSaveInstanceState());
        r1.A00 = A0J();
        return r1;
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.A0m);
    }

    public boolean requestFocus(int i2, Rect rect) {
        if (this.A0J || !isFocusable()) {
            return false;
        }
        if (A0J()) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.A0k.requestFocus(i2, rect);
        if (requestFocus) {
            A0I(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.A05 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            A07();
            return;
        }
        A0I(false);
        SearchAutoComplete searchAutoComplete = this.A0k;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.A07;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.A0M != z2) {
            this.A0M = z2;
            A0I(z2);
            A0B();
        }
    }

    public void setImeOptions(int i2) {
        this.A0k.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.A0k.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.A01 = i2;
        requestLayout();
    }

    public void setOnCloseListener(C11580j0 r1) {
        this.A0A = r1;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A08 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C016807y r1) {
        this.A0B = r1;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.A07 = onClickListener;
    }

    public void setOnSuggestionListener(C11590j1 r1) {
        this.A0C = r1;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.A0G = charSequence;
        A0B();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.A0N = z2;
        AnonymousClass04B r1 = this.A0E;
        if (r1 instanceof C02640Eg) {
            C02640Eg r12 = (C02640Eg) r1;
            int i2 = 1;
            if (z2) {
                i2 = 2;
            }
            r12.A03 = i2;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        Intent intent;
        this.A02 = searchableInfo;
        if (searchableInfo != null) {
            SearchAutoComplete searchAutoComplete = this.A0k;
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.A02.getImeOptions());
            int inputType = this.A02.getInputType();
            int i2 = 1;
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.A02.getSuggestAuthority() != null) {
                    inputType = inputType | AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED | AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END;
                }
            }
            searchAutoComplete.setInputType(inputType);
            AnonymousClass04B r1 = this.A0E;
            if (r1 != null) {
                r1.A65((Cursor) null);
            }
            if (this.A02.getSuggestAuthority() != null) {
                C02640Eg r0 = new C02640Eg(this.A02, getContext(), this, this.A0n);
                this.A0E = r0;
                searchAutoComplete.setAdapter(r0);
                C02640Eg r12 = (C02640Eg) this.A0E;
                if (this.A0N) {
                    i2 = 2;
                }
                r12.A03 = i2;
            }
            A0B();
        }
        SearchableInfo searchableInfo2 = this.A02;
        boolean z2 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.A02.getVoiceSearchLaunchWebSearch()) {
                intent = this.A0V;
            } else if (this.A02.getVoiceSearchLaunchRecognizer()) {
                intent = this.A0U;
            }
            if (!(intent == null || getContext().getPackageManager().resolveActivity(intent, AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == null)) {
                z2 = true;
            }
        }
        this.A0P = z2;
        if (z2) {
            this.A0k.setPrivateImeOptions("nm");
        }
        A0I(A0J());
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.A0O = z2;
        A0I(A0J());
    }

    public void setSuggestionsAdapter(AnonymousClass04B r2) {
        this.A0E = r2;
        this.A0k.setAdapter(r2);
    }
}
