package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.obwhatsapp.R;

/* renamed from: X.2kA  reason: invalid class name and case insensitive filesystem */
public abstract class C55682kA extends C55692kB {
    public ViewGroup A00 = ((ViewGroup) findViewById(R.id.search_message_container_attachment));
    public ViewGroup A01 = ((ViewGroup) findViewById(R.id.search_message_container_content));
    public ViewGroup A02 = ((ViewGroup) findViewById(R.id.search_message_container_header));
    public ViewGroup A03 = ((ViewGroup) findViewById(R.id.search_message_container_media));
    public C16040sK A04;
    public C16000sG A05;
    public C16080sP A06;
    public AnonymousClass01V A07;
    public C16440t3 A08;
    public AnonymousClass013 A09;
    public C17250um A0A;
    public C17020u3 A0B;

    public C55682kA(Context context) {
        super(context);
        setOrientation(0);
        LinearLayout.inflate(getContext(), R.layout.layout0529, this);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16843534, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen06bd);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.dimen06be);
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
        setMinimumHeight(getResources().getDimensionPixelSize(R.dimen.dimen06c9));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.34A} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.34B} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.2Rh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.349} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: X.34C} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: X.348} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: X.2pC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.348} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: X.348} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: X.348} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: X.348} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: X.348} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: X.348} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: X.348} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r13 = this;
            r3 = r13
            X.2k9 r3 = (X.C55672k9) r3
            android.content.Context r0 = r3.getContext()
            com.obwhatsapp.components.ConversationListRowHeaderView r6 = new com.obwhatsapp.components.ConversationListRowHeaderView
            r6.<init>(r0)
            r6.addA00(r0)
            r2 = -1
            r1 = -2
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r2, r1)
            r6.setLayoutParams(r0)
            com.obwhatsapp.TextEmojiLabel r0 = r6.A00
            r1 = 0
            r0.setIncludeFontPadding(r1)
            com.obwhatsapp.WaTextView r0 = r6.A01
            r0.setIncludeFontPadding(r1)
            android.content.Context r5 = r3.getContext()
            X.013 r8 = r3.A09
            X.0sP r7 = r3.A06
            X.1Lc r9 = r3.A09
            X.4Vz r4 = new X.4Vz
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A02 = r4
            r4.A00()
            X.4Vz r0 = r3.A02
            int r4 = r3.A06
            com.obwhatsapp.components.ConversationListRowHeaderView r0 = r0.A00
            com.obwhatsapp.WaTextView r0 = r0.A01
            android.view.ViewGroup r0 = r13.A02
            r0.addView(r6)
            android.content.Context r1 = r3.getContext()
            com.obwhatsapp.TextEmojiLabel r0 = new com.obwhatsapp.TextEmojiLabel
            r0.<init>(r1)
            r3.A01 = r0
            r0 = -2
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r0, r0)
            r1 = 3
            r2.gravity = r1
            com.obwhatsapp.TextEmojiLabel r0 = r3.A01
            r0.setLayoutParams(r2)
            com.obwhatsapp.TextEmojiLabel r0 = r3.A01
            r0.setMaxLines(r1)
            com.obwhatsapp.TextEmojiLabel r1 = r3.A01
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r0)
            com.obwhatsapp.TextEmojiLabel r0 = r3.A01
            com.obwhatsapp.TextEmojiLabel r2 = r3.A01
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131166919(0x7f0706c7, float:1.7948097E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setLineHeight(r0)
            com.obwhatsapp.TextEmojiLabel r2 = r3.A01
            r1 = 0
            r0 = 0
            com.obwhatsapp.TextEmojiLabel r1 = r3.A01
            java.lang.String r0 = ""
            r1.setText(r0)
            com.obwhatsapp.TextEmojiLabel r1 = r3.A01
            r0 = 80
            r1.setPlaceholder(r0)
            com.obwhatsapp.TextEmojiLabel r2 = r3.A01
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131166920(0x7f0706c8, float:1.7948099E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.setLineSpacing(r1, r0)
            com.obwhatsapp.TextEmojiLabel r1 = r3.A01
            r0 = 2131365971(0x7f0a1053, float:1.8351822E38)
            r1.setId(r0)
            com.obwhatsapp.TextEmojiLabel r1 = r3.A01
            if (r1 == 0) goto L_0x00b2
            android.view.ViewGroup r0 = r13.A01
            r0.addView(r1)
        L_0x00b2:
            r0 = r13
            boolean r1 = r13 instanceof X.AnonymousClass34P
            if (r1 == 0) goto L_0x011c
            X.34P r0 = (X.AnonymousClass34P) r0
            android.content.Context r2 = r0.getContext()
            X.4Qo r1 = r0.A08
            X.2pC r3 = new X.2pC
            r3.<init>(r2, r1)
            r0.A00 = r3
        L_0x00c6:
            android.view.ViewGroup r1 = r13.A00
            r1.addView(r3)
            r0 = 0
            r1.setVisibility(r0)
        L_0x00cf:
            r2 = r13
            boolean r0 = r13 instanceof X.AnonymousClass34R
            if (r0 == 0) goto L_0x00ee
            X.34T r2 = (X.AnonymousClass34T) r2
            android.content.Context r1 = r2.getContext()
            X.34W r0 = new X.34W
            r0.<init>(r1)
            r2.A00 = r0
            r2.setUpThumbView(r0)
            X.3kJ r1 = r2.A00
        L_0x00e6:
            if (r1 == 0) goto L_0x00ed
            android.view.ViewGroup r0 = r13.A03
            r0.addView(r1)
        L_0x00ed:
            return
        L_0x00ee:
            boolean r0 = r13 instanceof X.AnonymousClass34Q
            if (r0 == 0) goto L_0x0105
            X.34T r2 = (X.AnonymousClass34T) r2
            android.content.Context r1 = r2.getContext()
            X.34H r0 = new X.34H
            r0.<init>(r1)
            r2.A00 = r0
            r2.setUpThumbView(r0)
            X.3kJ r1 = r2.A00
            goto L_0x00e6
        L_0x0105:
            boolean r0 = r13 instanceof X.AnonymousClass34S
            if (r0 == 0) goto L_0x00ed
            X.34T r2 = (X.AnonymousClass34T) r2
            android.content.Context r1 = r2.getContext()
            X.34V r0 = new X.34V
            r0.<init>(r1)
            r2.A00 = r0
            r2.setUpThumbView(r0)
            X.3kJ r1 = r2.A00
            goto L_0x00e6
        L_0x011c:
            boolean r1 = r13 instanceof X.AnonymousClass34U
            if (r1 == 0) goto L_0x012e
            X.34U r0 = (X.AnonymousClass34U) r0
            android.content.Context r1 = r0.getContext()
            X.34C r3 = new X.34C
            r3.<init>(r1)
            r0.A00 = r3
            goto L_0x00c6
        L_0x012e:
            boolean r1 = r13 instanceof X.AnonymousClass2k8
            if (r1 == 0) goto L_0x0142
            X.2k8 r0 = (X.AnonymousClass2k8) r0
            android.content.Context r2 = r0.getContext()
            X.013 r1 = r0.A09
            X.349 r3 = new X.349
            r3.<init>(r2, r1)
            r0.A00 = r3
            goto L_0x00c6
        L_0x0142:
            boolean r1 = r13 instanceof X.AnonymousClass34F
            if (r1 == 0) goto L_0x0155
            X.34F r0 = (X.AnonymousClass34F) r0
            android.content.Context r1 = r0.getContext()
            X.2Rh r3 = new X.2Rh
            r3.<init>(r1)
            r0.A00 = r3
            goto L_0x00c6
        L_0x0155:
            boolean r1 = r13 instanceof X.AnonymousClass34G
            if (r1 == 0) goto L_0x0178
            X.34G r0 = (X.AnonymousClass34G) r0
            android.content.Context r4 = r0.getContext()
            X.0t3 r8 = r0.A08
            X.0sK r5 = r0.A04
            X.1P7 r12 = r0.A06
            X.0ud r6 = r0.A02
            X.013 r9 = r0.A09
            X.2Ao r7 = r0.A03
            X.0yQ r11 = r0.A05
            X.14t r10 = r0.A04
            X.34B r3 = new X.34B
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.A00 = r3
            goto L_0x00c6
        L_0x0178:
            boolean r1 = r13 instanceof X.AnonymousClass34E
            if (r1 == 0) goto L_0x0195
            X.34E r0 = (X.AnonymousClass34E) r0
            android.content.Context r4 = r0.getContext()
            X.0pt r5 = r0.A02
            X.0ud r6 = r0.A03
            X.013 r8 = r0.A09
            X.1zp r9 = r0.A05
            X.2Ao r7 = r0.A04
            X.34A r3 = new X.34A
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.A00 = r3
            goto L_0x00c6
        L_0x0195:
            boolean r1 = r13 instanceof X.AnonymousClass34D
            if (r1 == 0) goto L_0x00cf
            X.34D r0 = (X.AnonymousClass34D) r0
            android.content.Context r1 = r0.getContext()
            X.348 r3 = new X.348
            r3.<init>(r1)
            r0.A00 = r3
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55682kA.A01():void");
    }
}
