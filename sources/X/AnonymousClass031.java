package X;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.obwhatsapp.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.031  reason: invalid class name */
public class AnonymousClass031 {
    public static int A02;
    public int A00 = -1;
    public final AccessibilityNodeInfo A01;

    public AnonymousClass031(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.A01 = accessibilityNodeInfo;
    }

    public static String A00(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case AccessibilityNodeInfoCompat.ACTION_ACCESSIBILITY_FOCUS /*64*/:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED /*65536*/:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START /*262144*/:
                return "ACTION_EXPAND";
            case AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END /*524288*/:
                return "ACTION_COLLAPSE";
            case AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END /*2097152*/:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i2) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    public AnonymousClass0WL A01() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT < 19 || (collectionItemInfo = this.A01.getCollectionItemInfo()) == null) {
            return null;
        }
        return new AnonymousClass0WL(collectionItemInfo);
    }

    public CharSequence A02() {
        if (!(!A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.A01.getText();
        }
        List A04 = A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List A042 = A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List A043 = A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List A044 = A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i2 = 0; i2 < A04.size(); i2++) {
            spannableString.setSpan(new AnonymousClass0BU(this, ((Number) A044.get(i2)).intValue(), (Build.VERSION.SDK_INT >= 19 ? accessibilityNodeInfo.getExtras() : new Bundle()).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Number) A04.get(i2)).intValue(), ((Number) A042.get(i2)).intValue(), ((Number) A043.get(i2)).intValue());
        }
        return spannableString;
    }

    public List A03() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList;
        if (Build.VERSION.SDK_INT < 21 || (actionList = this.A01.getActionList()) == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new AnonymousClass032((CharSequence) null, actionList.get(i2), 0));
        }
        return arrayList;
    }

    public final List A04(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void A05() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.A01.setContentInvalid(true);
        }
    }

    public final void A06(int i2, boolean z2) {
        Bundle bundle;
        if (Build.VERSION.SDK_INT >= 19) {
            bundle = this.A01.getExtras();
            if (bundle == null) {
                return;
            }
        } else {
            bundle = new Bundle();
        }
        int i3 = bundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i2 ^ -1);
        if (!z2) {
            i2 = 0;
        }
        bundle.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
    }

    public void A07(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.A01.setTraversalAfter(view);
        }
    }

    public void A08(View view, CharSequence charSequence) {
        int length;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 19 && i3 < 26) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    if (((Reference) sparseArray.valueAt(i4)).get() == null) {
                        arrayList.add(Integer.valueOf(i4));
                    }
                }
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    sparseArray.remove(((Number) arrayList.get(i5)).intValue());
                }
            }
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, charSequence.length(), ClickableSpan.class);
                if (clickableSpanArr != null && (length = clickableSpanArr.length) > 0) {
                    accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    int i6 = 0;
                    do {
                        ClickableSpan clickableSpan = clickableSpanArr[i6];
                        int i7 = 0;
                        while (true) {
                            if (i7 >= sparseArray2.size()) {
                                i2 = A02;
                                A02 = i2 + 1;
                                break;
                            } else if (clickableSpan.equals(((Reference) sparseArray2.valueAt(i7)).get())) {
                                i2 = sparseArray2.keyAt(i7);
                                break;
                            } else {
                                i7++;
                            }
                        }
                        sparseArray2.put(i2, new WeakReference(clickableSpanArr[i6]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i6];
                        A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        A04("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
                        i6++;
                    } while (i6 < length);
                }
            }
        }
    }

    public void A09(AnonymousClass032 r3) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.A01.addAction((AccessibilityNodeInfo.AccessibilityAction) r3.A00);
        }
    }

    public void A0A(AnonymousClass032 r3) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.A01.removeAction((AccessibilityNodeInfo.AccessibilityAction) r3.A00);
        }
    }

    public void A0B(C05910Tm r3) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.A01.setRangeInfo((AccessibilityNodeInfo.RangeInfo) r3.A00);
        }
    }

    public void A0C(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.A01.setError(charSequence);
        }
    }

    public void A0D(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.A01.setHintText(charSequence);
        } else if (i2 >= 19) {
            this.A01.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void A0E(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            this.A01.setPaneTitle(charSequence);
        } else if (i2 >= 19) {
            this.A01.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void A0F(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.A01.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    public void A0G(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.A01.setStateDescription(charSequence);
        } else if (i2 >= 19) {
            this.A01.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void A0H(CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            this.A01.setTooltipText(charSequence);
        } else if (i2 >= 19) {
            this.A01.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public void A0I(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.A01.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) ((AnonymousClass09M) obj).A00);
        }
    }

    public void A0J(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.A01.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((AnonymousClass0WL) obj).A00);
        }
    }

    public void A0K(boolean z2) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.A01.setDismissable(z2);
        }
    }

    public void A0L(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.A01.setHeading(z2);
        } else {
            A06(2, z2);
        }
    }

    public void A0M(boolean z2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.A01.setScreenReaderFocusable(z2);
        } else {
            A06(1, z2);
        }
    }

    public void A0N(boolean z2) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.A01.setShowingHintText(z2);
        } else {
            A06(4, z2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0023
            r2 = 0
            if (r5 == 0) goto L_0x0014
            boolean r0 = r5 instanceof X.AnonymousClass031
            if (r0 == 0) goto L_0x0014
            X.031 r5 = (X.AnonymousClass031) r5
            android.view.accessibility.AccessibilityNodeInfo r1 = r4.A01
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.A01
            if (r1 != 0) goto L_0x0015
            if (r0 == 0) goto L_0x001c
        L_0x0014:
            return r2
        L_0x0015:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x001c
            return r2
        L_0x001c:
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 == r0) goto L_0x0023
            return r2
        L_0x0023:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass031.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        AccessibilityNodeInfo accessibilityNodeInfo = this.A01;
        accessibilityNodeInfo.getBoundsInParent(rect);
        StringBuilder sb2 = new StringBuilder("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        accessibilityNodeInfo.getBoundsInScreen(rect);
        StringBuilder sb3 = new StringBuilder("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(A02());
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; viewId: ");
        sb.append(Build.VERSION.SDK_INT >= 18 ? accessibilityNodeInfo.getViewIdResourceName() : null);
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        StringBuilder sb4 = new StringBuilder("; scrollable: ");
        sb4.append(accessibilityNodeInfo.isScrollable());
        sb.append(sb4.toString());
        sb.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List A03 = A03();
            for (int i2 = 0; i2 < A03.size(); i2++) {
                AnonymousClass032 r2 = (AnonymousClass032) A03.get(i2);
                String A002 = A00(r2.A00());
                if (A002.equals("ACTION_UNKNOWN") && r2.A01() != null) {
                    A002 = r2.A01().toString();
                }
                sb.append(A002);
                if (i2 != A03.size() - 1) {
                    sb.append(", ");
                }
            }
        } else {
            int actions = accessibilityNodeInfo.getActions();
            if (actions != 0) {
                while (true) {
                    int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(actions);
                    actions &= numberOfTrailingZeros ^ -1;
                    sb.append(A00(numberOfTrailingZeros));
                    if (actions == 0) {
                        break;
                    }
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
