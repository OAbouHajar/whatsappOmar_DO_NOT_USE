package X;

import android.content.Context;
import android.util.AttributeSet;
import com.obwhatsapp.CodeInputField;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.mediacomposer.doodle.textentry.DoodleEditText;
import com.obwhatsapp.mentions.MentionableEntry;
import com.obwhatsapp.status.playback.widget.StatusEditText;
import com.obwhatsapp.text.FinalBackspaceAwareEntry;

/* renamed from: X.0py  reason: invalid class name and case insensitive filesystem */
public abstract class C14900py extends AnonymousClass014 implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C14900py(Context context) {
        super(context, (AttributeSet) null);
        A02();
    }

    public C14900py(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
    }

    public C14900py(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A02();
    }

    public void A02() {
        C52642eC r1;
        C52642eC r0;
        StatusEditText statusEditText;
        FinalBackspaceAwareEntry finalBackspaceAwareEntry;
        if (this instanceof FinalBackspaceAwareEntry) {
            FinalBackspaceAwareEntry finalBackspaceAwareEntry2 = (FinalBackspaceAwareEntry) this;
            if (!finalBackspaceAwareEntry2.A03) {
                finalBackspaceAwareEntry2.A03 = true;
                r1 = (C52642eC) finalBackspaceAwareEntry2.generatedComponent();
                finalBackspaceAwareEntry = finalBackspaceAwareEntry2;
            } else {
                return;
            }
        } else if (this instanceof C46132Co) {
            C46132Co r12 = (C46132Co) this;
            if (r12 instanceof StatusEditText) {
                StatusEditText statusEditText2 = (StatusEditText) r12;
                if (!statusEditText2.A00) {
                    statusEditText2.A00 = true;
                    r0 = (C52642eC) statusEditText2.generatedComponent();
                    statusEditText = statusEditText2;
                } else {
                    return;
                }
            } else if (!r12.A00) {
                r12.A00 = true;
                r0 = (C52642eC) r12.generatedComponent();
                statusEditText = (MentionableEntry) r12;
            } else {
                return;
            }
            C16150sX r2 = ((C52652eD) r0).A07;
            statusEditText.A03 = (AnonymousClass013) r2.AR8.get();
            statusEditText.A02 = (AnonymousClass01V) r2.AOi.get();
            statusEditText.A0E = (C19990zK) r2.AEZ.get();
            statusEditText.A07 = (C16000sG) r2.A4x.get();
            statusEditText.A08 = (C16070sO) r2.ABY.get();
            statusEditText.A0F = (C17020u3) r2.AMG.get();
            return;
        } else if (this instanceof DoodleEditText) {
            DoodleEditText doodleEditText = (DoodleEditText) this;
            if (!doodleEditText.A02) {
                doodleEditText.A02 = true;
                r1 = (C52642eC) doodleEditText.generatedComponent();
                finalBackspaceAwareEntry = doodleEditText;
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass1VU) {
            AnonymousClass1VU r02 = (AnonymousClass1VU) this;
            if (!r02.A00) {
                r02.A00 = true;
                r1 = (C52642eC) r02.generatedComponent();
                finalBackspaceAwareEntry = r02;
            } else {
                return;
            }
        } else if (this instanceof CodeInputField) {
            CodeInputField codeInputField = (CodeInputField) this;
            if (!codeInputField.A06) {
                codeInputField.A06 = true;
                r1 = (C52642eC) codeInputField.generatedComponent();
                finalBackspaceAwareEntry = codeInputField;
            } else {
                return;
            }
        } else if (!this.A01) {
            this.A01 = true;
            r1 = (C52642eC) generatedComponent();
            finalBackspaceAwareEntry = (WaEditText) this;
        } else {
            return;
        }
        C16150sX r22 = ((C52652eD) r1).A07;
        finalBackspaceAwareEntry.A03 = (AnonymousClass013) r22.AR8.get();
        finalBackspaceAwareEntry.A02 = (AnonymousClass01V) r22.AOi.get();
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
