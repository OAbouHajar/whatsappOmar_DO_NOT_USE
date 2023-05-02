package com.obwhatsapp.text;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass1yR;
import X.AnonymousClass3K4;
import X.AnonymousClass4F6;
import X.C13680ns;
import X.C13700nu;
import X.C15830rv;
import X.C41651wK;
import X.C42821yj;
import X.C48562Nw;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.google.android.material.chip.Chip;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.gifsearch.GifSearchContainer;
import com.obwhatsapp.inappsupport.ui.ContactUsActivity;
import com.obwhatsapp.search.SearchViewModel;
import com.obwhatsapp.search.views.TokenizedSearchInput;
import com.obwhatsapp.twofactor.SetEmailFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

public class IDxWAdapterShape102S0100000_2_I0 extends C41651wK {
    public Object A00;
    public final int A01;

    public IDxWAdapterShape102S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void afterTextChanged(Editable editable) {
        Chip chip;
        switch (this.A01) {
            case 0:
                C42821yj r1 = (C42821yj) this.A00;
                if (r1.A4c) {
                    return;
                }
                if (editable.toString().length() != 0) {
                    ((AnonymousClass1yR) r1.A22).A00.A03.A0E((C15830rv) r1.A2l.A08(C15830rv.class), 0);
                    return;
                }
                r1.A4Z = false;
                ((AnonymousClass1yR) r1.A22).A00.A03.A0B((C15830rv) r1.A2l.A08(C15830rv.class));
                return;
            case 3:
                editable.toString();
                throw C13680ns.A0m();
            case 4:
                if (editable != null) {
                    FinalBackspaceAwareEntry finalBackspaceAwareEntry = (FinalBackspaceAwareEntry) this.A00;
                    if (!FinalBackspaceAwareEntry.A01(editable.toString()) && !finalBackspaceAwareEntry.A02) {
                        List<AnonymousClass4F6> list = finalBackspaceAwareEntry.A01;
                        if (list != null) {
                            for (AnonymousClass4F6 r0 : list) {
                                TokenizedSearchInput tokenizedSearchInput = r0.A00;
                                SearchViewModel searchViewModel = tokenizedSearchInput.A0C;
                                if (searchViewModel != null) {
                                    UserJid A09 = searchViewModel.A09();
                                    int A06 = tokenizedSearchInput.A0C.A06();
                                    int i2 = tokenizedSearchInput.A00;
                                    if (i2 == 1) {
                                        chip = tokenizedSearchInput.A0R;
                                    } else if (i2 == 2) {
                                        chip = tokenizedSearchInput.A0P;
                                    } else if (i2 == 3) {
                                        chip = tokenizedSearchInput.A0Q;
                                    } else if (i2 == 0) {
                                        if (A09 != null) {
                                            tokenizedSearchInput.setFocus(2);
                                        } else if (A06 != 0) {
                                            tokenizedSearchInput.setFocus(1);
                                        } else if (tokenizedSearchInput.A0C.A0C() != null) {
                                            tokenizedSearchInput.setFocus(3);
                                        }
                                    }
                                    TokenizedSearchInput.A00(chip, tokenizedSearchInput);
                                }
                            }
                        }
                        finalBackspaceAwareEntry.A09(editable);
                    }
                    List<AnonymousClass4F6> list2 = finalBackspaceAwareEntry.A01;
                    if (list2 != null) {
                        for (AnonymousClass4F6 r2 : list2) {
                            String obj = finalBackspaceAwareEntry.A07(editable).toString();
                            SearchViewModel searchViewModel2 = r2.A00.A0C;
                            if (!(searchViewModel2 == null || obj == null)) {
                                searchViewModel2.A0W(obj);
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                String A0Z = AnonymousClass3K4.A0Z(editable);
                SetEmailFragment setEmailFragment = (SetEmailFragment) this.A00;
                int i3 = setEmailFragment.A00;
                if (i3 == 1) {
                    setEmailFragment.A06.A04 = A0Z;
                } else if (i3 == 2) {
                    C13700nu.A0T(setEmailFragment.A04);
                    setEmailFragment.A06.A05 = A0Z;
                }
                setEmailFragment.A1B();
                return;
            default:
                super.afterTextChanged(editable);
                return;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        switch (this.A01) {
            case 1:
                GifSearchContainer gifSearchContainer = (GifSearchContainer) this.A00;
                gifSearchContainer.A0K = charSequence;
                WaEditText waEditText = gifSearchContainer.A07;
                Runnable runnable = gifSearchContainer.A0U;
                waEditText.removeCallbacks(runnable);
                gifSearchContainer.A07.postDelayed(runnable, 500);
                View view = gifSearchContainer.A01;
                int i5 = 0;
                if (TextUtils.isEmpty(charSequence)) {
                    i5 = 4;
                }
                view.setVisibility(i5);
                return;
            case 2:
                C48562Nw r3 = ((ContactUsActivity) this.A00).A0G;
                ContactUsActivity contactUsActivity = r3.A02;
                AnonymousClass00B.A06(contactUsActivity);
                contactUsActivity.findViewById(R.id.contact_us_send_button).setEnabled(AnonymousClass000.A1Q(charSequence.length()));
                if (AnonymousClass3K4.A0Z(r3.A02.A00.getText()).length() >= 10) {
                    ContactUsActivity contactUsActivity2 = r3.A02;
                    if (contactUsActivity2.A01.getVisibility() == 0) {
                        contactUsActivity2.A00.setBackgroundDrawable(AnonymousClass00T.A04(contactUsActivity2, R.drawable.description_field_background_state_list));
                        contactUsActivity2.A01.setVisibility(8);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onTextChanged(charSequence, i2, i3, i4);
                return;
        }
    }
}
