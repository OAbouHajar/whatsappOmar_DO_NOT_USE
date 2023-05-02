package com.obwhatsapp.mentions;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01S;
import X.AnonymousClass01V;
import X.AnonymousClass1W4;
import X.AnonymousClass1ZT;
import X.AnonymousClass36F;
import X.AnonymousClass3MM;
import X.AnonymousClass3MN;
import X.C108865Pu;
import X.C14810pn;
import X.C15830rv;
import X.C16000sG;
import X.C16030sJ;
import X.C16050sL;
import X.C16070sO;
import X.C17020u3;
import X.C17380uz;
import X.C19990zK;
import X.C28031Ub;
import X.C30061bg;
import X.C30661ck;
import X.C39501sa;
import X.C46132Co;
import X.C46172Ct;
import X.C46182Cu;
import X.C64053Mo;
import X.C86424Sq;
import X.C88544ag;
import X.C93804jn;
import X.C95064lv;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MentionableEntry extends C46132Co implements C46172Ct, C30061bg, C46182Cu {
    public static final String[] A0K = C88544ag.A01;
    public int A00;
    public int A01;
    public int A02;
    public Bundle A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public C16000sG A07;
    public C16070sO A08;
    public C16050sL A09;
    public C46172Ct A0A;
    public MentionPickerView A0B;
    public AnonymousClass3MM A0C;
    public C108865Pu A0D;
    public C19990zK A0E;
    public C17020u3 A0F;
    public boolean A0G;
    public boolean A0H;
    public final TextWatcher A0I = new C93804jn(this);
    public final C86424Sq A0J = new C86424Sq();

    public MentionableEntry(Context context) {
        super(context);
    }

    public MentionableEntry(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MentionableEntry(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public final int A06(Editable editable, int i2) {
        int lastIndexOf = editable.toString().substring(i2, getSelectionEnd()).lastIndexOf("@");
        for (AnonymousClass3MM r0 : (AnonymousClass3MM[]) editable.getSpans(lastIndexOf, lastIndexOf + 1, AnonymousClass3MM.class)) {
            if (r0.A00) {
                return -1;
            }
        }
        return lastIndexOf;
    }

    public final String A07(int i2, int i3) {
        Editable newEditable = Editable.Factory.getInstance().newEditable(getText().subSequence(i2, i3));
        for (AnonymousClass3MN r3 : (AnonymousClass3MN[]) newEditable.getSpans(0, newEditable.length(), AnonymousClass3MN.class)) {
            newEditable.replace(newEditable.getSpanStart(r3) - 1, newEditable.getSpanEnd(r3), r3.A01);
        }
        return newEditable.toString();
    }

    public void A08() {
        removeTextChangedListener(this.A0I);
        setText((String) null);
        setCursorVisible(false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r1 != '_') goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(android.text.Editable r8) {
        /*
            r7 = this;
            r0 = 0
            int r3 = r7.A06(r8, r0)
            int r2 = r3 + 1
            int r1 = r7.getSelectionEnd()
            java.lang.Class<X.3MN> r0 = X.AnonymousClass3MN.class
            java.lang.Object[] r6 = r8.getSpans(r2, r1, r0)
            X.3MN[] r6 = (X.AnonymousClass3MN[]) r6
            int r5 = r6.length
            if (r5 <= 0) goto L_0x0032
            r4 = 0
            r3 = 0
        L_0x0018:
            r2 = r6[r4]
            int r1 = r8.getSpanEnd(r2)
            if (r1 <= r3) goto L_0x002a
            int r0 = r7.getSelectionEnd()
            if (r1 > r0) goto L_0x002a
            int r3 = r8.getSpanEnd(r2)
        L_0x002a:
            int r4 = r4 + 1
            if (r4 < r5) goto L_0x0018
            int r3 = r7.A06(r8, r3)
        L_0x0032:
            if (r3 < 0) goto L_0x0047
            r0 = 1
            if (r3 == 0) goto L_0x0051
            int r0 = r3 - r0
            char r1 = r8.charAt(r0)
            boolean r0 = java.lang.Character.isLetterOrDigit(r1)
            if (r0 != 0) goto L_0x0047
            r0 = 95
            if (r1 != r0) goto L_0x0051
        L_0x0047:
            X.3MM r0 = r7.A0C
            r7.A0C(r0)
            r0 = 0
            r7.A0E(r0)
        L_0x0050:
            return
        L_0x0051:
            java.lang.String r2 = r8.toString()
            int r1 = r3 + 1
            int r0 = r7.getSelectionEnd()
            java.lang.String r0 = r2.substring(r1, r0)
            r7.A0E(r0)
            boolean r0 = r7.A0H
            if (r0 == 0) goto L_0x0050
            r7.A0A(r8, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.mentions.MentionableEntry.A09(android.text.Editable):void");
    }

    public final void A0A(Editable editable, int i2) {
        int i3 = i2 + 1;
        if (((AnonymousClass3MM[]) editable.getSpans(i2, i3, AnonymousClass3MM.class)).length < 1) {
            A0C(this.A0C);
            AnonymousClass3MM r1 = new AnonymousClass3MM(this.A00, false);
            this.A0C = r1;
            editable.setSpan(r1, i2, i3, 33);
        }
    }

    public final void A0B(SpannableStringBuilder spannableStringBuilder, Collection collection, boolean z2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C15830rv r2 = (C15830rv) it.next();
            if (r2 != null) {
                C19990zK r1 = this.A0E;
                AnonymousClass00B.A06(r1);
                C16000sG r0 = this.A07;
                AnonymousClass00B.A06(r0);
                String A012 = r1.A01(r0.A0A(r2));
                StringBuilder sb = new StringBuilder("@");
                String str = r2.user;
                AnonymousClass00B.A06(str);
                sb.append(str);
                String obj = sb.toString();
                int indexOf = TextUtils.indexOf(spannableStringBuilder, obj);
                if (indexOf < 0) {
                    StringBuilder sb2 = new StringBuilder("unable to set mention for ");
                    sb2.append(r2);
                    sb2.append(" in ");
                    sb2.append(spannableStringBuilder);
                    Log.w(sb2.toString());
                } else {
                    do {
                        StringBuilder sb3 = new StringBuilder("@");
                        sb3.append(A012);
                        spannableStringBuilder.replace(indexOf, obj.length() + indexOf, sb3.toString());
                        if (z2) {
                            AnonymousClass3MM r4 = new AnonymousClass3MM(this.A00, true);
                            int i2 = indexOf + 1;
                            spannableStringBuilder.setSpan(r4, indexOf, i2, 33);
                            spannableStringBuilder.setSpan(new AnonymousClass3MN(r4, obj, this.A01), i2, A012.length() + i2, 33);
                        }
                        indexOf = TextUtils.indexOf(spannableStringBuilder, obj, indexOf + 1);
                    } while (indexOf >= 0);
                }
            }
        }
    }

    public final void A0C(ForegroundColorSpan foregroundColorSpan) {
        if (foregroundColorSpan != null) {
            getText().removeSpan(foregroundColorSpan);
        }
    }

    public void A0D(ViewGroup viewGroup, C16050sL r5, boolean z2, boolean z3, boolean z4) {
        this.A09 = r5;
        addTextChangedListener(this.A0I);
        Context context = getContext();
        int i2 = R.color.color04f8;
        if (z2) {
            i2 = R.color.color04f9;
        }
        this.A01 = AnonymousClass00T.A00(context, i2);
        Context context2 = getContext();
        int i3 = R.color.color0549;
        if (z2) {
            i3 = R.color.color054a;
        }
        this.A00 = AnonymousClass00T.A00(context2, i3);
        A09(getText());
        this.A06 = viewGroup;
        Bundle bundle = new Bundle();
        this.A03 = bundle;
        bundle.putString("ARG_GID", C16030sJ.A03(r5));
        this.A03.putBoolean("ARG_IS_DARK_THEME", z2);
        this.A03.putBoolean("ARG_HIDE_END_DIVIDER", z3);
        this.A03.putBoolean("ARG_WITH_BACKGROUND", z4);
    }

    public final void A0E(String str) {
        if (this.A06 == null) {
            return;
        }
        if (str != null) {
            MentionPickerView mentionPickerView = this.A0B;
            if (mentionPickerView == null) {
                MentionPickerView mentionPickerView2 = (MentionPickerView) LayoutInflater.from(getContext()).inflate(R.layout.layout03d9, this.A06, false);
                this.A0B = mentionPickerView2;
                this.A06.addView(mentionPickerView2);
                this.A0B.setup(this, this.A03);
                View view = this.A05;
                if (view != null) {
                    this.A0B.setAnchorWidthView(view);
                }
                View view2 = this.A04;
                if (view2 != null) {
                    this.A0B.A03 = view2;
                }
                mentionPickerView = this.A0B;
                mentionPickerView.A0B = this;
            }
            if (mentionPickerView.A0G) {
                mentionPickerView.A0D.getFilter().filter(str);
                return;
            }
            mentionPickerView.A0F.Ack(new AnonymousClass36F(mentionPickerView.A07, mentionPickerView.A0A, mentionPickerView, str), mentionPickerView.A09);
            return;
        }
        MentionPickerView mentionPickerView3 = this.A0B;
        if (mentionPickerView3 != null) {
            mentionPickerView3.A0D.getFilter().filter((CharSequence) null);
        }
    }

    public void A4c(C14810pn r2) {
        this.A0J.A01(r2);
    }

    public void AOF(boolean z2) {
        int A062;
        this.A0H = z2;
        C46172Ct r0 = this.A0A;
        if (r0 != null) {
            r0.AOF(z2);
        }
        if (!z2 || (A062 = A06(getEditableText(), 0)) < 0) {
            A0C(this.A0C);
            this.A0C = null;
            return;
        }
        A0A(getEditableText(), A062);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A0J.A00();
    }

    public List getMentions() {
        HashSet hashSet = new HashSet();
        for (AnonymousClass3MN r0 : (AnonymousClass3MN[]) getText().getSpans(0, getText().length(), AnonymousClass3MN.class)) {
            try {
                hashSet.add(AnonymousClass1ZT.A03(r0.A01.substring(1)));
            } catch (AnonymousClass1W4 unused) {
            }
        }
        return new ArrayList(hashSet);
    }

    public String getStringText() {
        return A07(0, getText().length());
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null) {
            String[] strArr = A0K;
            if (strArr.length > 0) {
                EditorInfoCompat.setContentMimeTypes(editorInfo, strArr);
                return InputConnectionCompat.createWrapper(onCreateInputConnection, editorInfo, (InputConnectionCompat.OnCommitContentListener) new C95064lv(this));
            }
        }
        return onCreateInputConnection;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C64053Mo r6 = (C64053Mo) parcelable;
        super.onRestoreInstanceState(r6.getSuperState());
        String str = r6.A00;
        if (!TextUtils.isEmpty(str)) {
            String str2 = r6.A01;
            if (!TextUtils.isEmpty(str2)) {
                int selectionStart = getSelectionStart();
                int selectionEnd = getSelectionEnd();
                AnonymousClass00B.A06(str2);
                setMentionableText(str2, C39501sa.A01(str));
                setSelection(selectionStart, selectionEnd);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        AnonymousClass00B.A06(onSaveInstanceState);
        return new C64053Mo(onSaveInstanceState, getStringText(), C39501sa.A00(getMentions()));
    }

    public void onSelectionChanged(int i2, int i3) {
        super.onSelectionChanged(i2, i3);
        Editable editableText = getEditableText();
        if (!TextUtils.isEmpty(editableText)) {
            Class<AnonymousClass3MN> cls = AnonymousClass3MN.class;
            for (AnonymousClass3MN r1 : (AnonymousClass3MN[]) editableText.getSpans(i2, i2, cls)) {
                int spanStart = editableText.getSpanStart(r1) - 1;
                int spanEnd = editableText.getSpanEnd(r1);
                int i4 = i2;
                i2 = spanEnd;
                if (i4 <= ((spanStart + spanEnd) >> 1)) {
                    i2 = spanStart;
                }
            }
            for (AnonymousClass3MN r12 : (AnonymousClass3MN[]) editableText.getSpans(i3, i3, cls)) {
                int spanStart2 = editableText.getSpanStart(r12) - 1;
                int spanEnd2 = editableText.getSpanEnd(r12);
                int i5 = i3;
                i3 = spanEnd2;
                if (i5 <= ((spanStart2 + spanEnd2) >> 1)) {
                    i3 = spanStart2;
                }
            }
            setSelection(i2, i3);
        }
    }

    public boolean onTextContextMenuItem(int i2) {
        int i3;
        int length = getText().length();
        if (isFocused()) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            i3 = Math.max(0, Math.min(selectionStart, selectionEnd));
            length = Math.max(0, Math.max(selectionStart, selectionEnd));
        } else {
            i3 = 0;
        }
        if (i2 == 16908322) {
            if (this.A09 != null) {
                AnonymousClass01V r0 = this.A02;
                AnonymousClass00B.A06(r0);
                ClipboardManager A0B2 = r0.A0B();
                if (A0B2 == null) {
                    Log.w("mentionableentry/on-text-context-menu-item cm=null");
                } else {
                    ClipData primaryClip = A0B2.getPrimaryClip();
                    if (!(primaryClip == null || primaryClip.getItemCount() == 0)) {
                        ClipData.Item itemAt = primaryClip.getItemAt(0);
                        String text = itemAt != null ? itemAt.getText() : "";
                        SharedPreferences A002 = this.A0F.A00(AnonymousClass01S.A07);
                        String string = A002.getString("copied_message", "");
                        String string2 = A002.getString("copied_message_jids", "");
                        String string3 = A002.getString("copied_message_without_mentions", "");
                        if (!TextUtils.isEmpty(text) && TextUtils.equals(text, string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                            List A012 = C39501sa.A01(string2);
                            HashSet hashSet = new HashSet(A012);
                            HashSet hashSet2 = new HashSet(A012);
                            C16050sL r1 = this.A09;
                            if (r1 != null) {
                                C16070sO r02 = this.A08;
                                AnonymousClass00B.A06(r02);
                                C17380uz A042 = r02.A07.A04(r1).A04();
                                HashSet hashSet3 = new HashSet();
                                C28031Ub it = A042.iterator();
                                while (it.hasNext()) {
                                    hashSet3.add(((C30661ck) it.next()).A03);
                                }
                                hashSet.retainAll(hashSet3);
                                hashSet2.removeAll(hashSet3);
                            } else {
                                hashSet2 = null;
                            }
                            AnonymousClass00B.A06(string3);
                            if (this.A0H) {
                                A0E((String) null);
                            }
                            A0C(this.A0C);
                            this.A0C = null;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
                            A0B(spannableStringBuilder, hashSet, true);
                            if (hashSet2 != null) {
                                A0B(spannableStringBuilder, hashSet2, false);
                            }
                            getText().replace(i3, length, spannableStringBuilder);
                            return true;
                        }
                    }
                }
            }
        } else if (i2 == 16908320 || i2 == 16908321) {
            this.A0F.A00(AnonymousClass01S.A07).edit().putString("copied_message_without_mentions", A07(i3, length)).putString("copied_message", getText().subSequence(i3, length).toString()).putString("copied_message_jids", C39501sa.A00(getMentions())).apply();
        }
        return super.onTextContextMenuItem(i2);
    }

    public void setMentionPickerVisibilityChangeListener(C46172Ct r1) {
        this.A0A = r1;
    }

    public void setMentionableText(String str, Collection collection) {
        if (collection == null || collection.isEmpty()) {
            setText(str);
            return;
        }
        if (this.A0H) {
            A0E((String) null);
        }
        A0C(this.A0C);
        this.A0C = null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        A0B(spannableStringBuilder, collection, true);
        setText(spannableStringBuilder);
    }

    public void setOnCommitContentListener(C108865Pu r1) {
        this.A0D = r1;
    }

    public void setText(String str) {
        for (AnonymousClass3MN r1 : (AnonymousClass3MN[]) getText().getSpans(0, getText().length(), AnonymousClass3MN.class)) {
            A0C(r1.A00);
            A0C(r1);
        }
        A0C(this.A0C);
        this.A0C = null;
        super.setText(str);
    }
}
