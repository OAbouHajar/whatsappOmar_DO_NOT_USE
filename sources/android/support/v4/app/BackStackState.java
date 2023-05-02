package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.BackStackRecord;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: BackStackRecord */
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() {
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        public BackStackState[] newArray(int i2) {
            return new BackStackState[i2];
        }
    };
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int mIndex;
    final String mName;
    final int[] mOps;
    final int mTransition;
    final int mTransitionStyle;

    public BackStackState(Parcel parcel) {
        this.mOps = parcel.createIntArray();
        this.mTransition = parcel.readInt();
        this.mTransitionStyle = parcel.readInt();
        this.mName = parcel.readString();
        this.mIndex = parcel.readInt();
        this.mBreadCrumbTitleRes = parcel.readInt();
        this.mBreadCrumbTitleText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mBreadCrumbShortTitleRes = parcel.readInt();
        this.mBreadCrumbShortTitleText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    public BackStackState(FragmentManagerImpl fragmentManagerImpl, BackStackRecord backStackRecord) {
        int i2;
        int i3 = 0;
        for (BackStackRecord.Op op = backStackRecord.mHead; op != null; op = op.next) {
            if (op.removed != null) {
                i3 += op.removed.size();
            }
        }
        this.mOps = new int[((backStackRecord.mNumOp * 7) + i3)];
        if (!backStackRecord.mAddToBackStack) {
            throw new IllegalStateException("Not on back stack");
        }
        BackStackRecord.Op op2 = backStackRecord.mHead;
        int i4 = 0;
        while (op2 != null) {
            int i5 = i4 + 1;
            this.mOps[i4] = op2.cmd;
            int i6 = i5 + 1;
            this.mOps[i5] = op2.fragment != null ? op2.fragment.mIndex : -1;
            int i7 = i6 + 1;
            this.mOps[i6] = op2.enterAnim;
            int i8 = i7 + 1;
            this.mOps[i7] = op2.exitAnim;
            int i9 = i8 + 1;
            this.mOps[i8] = op2.popEnterAnim;
            int i10 = i9 + 1;
            this.mOps[i9] = op2.popExitAnim;
            if (op2.removed != null) {
                int size = op2.removed.size();
                this.mOps[i10] = size;
                int i11 = 0;
                int i12 = i10 + 1;
                while (i11 < size) {
                    this.mOps[i12] = op2.removed.get(i11).mIndex;
                    i11++;
                    i12++;
                }
                i2 = i12;
            } else {
                i2 = i10 + 1;
                this.mOps[i10] = 0;
            }
            op2 = op2.next;
            i4 = i2;
        }
        this.mTransition = backStackRecord.mTransition;
        this.mTransitionStyle = backStackRecord.mTransitionStyle;
        this.mName = backStackRecord.mName;
        this.mIndex = backStackRecord.mIndex;
        this.mBreadCrumbTitleRes = backStackRecord.mBreadCrumbTitleRes;
        this.mBreadCrumbTitleText = backStackRecord.mBreadCrumbTitleText;
        this.mBreadCrumbShortTitleRes = backStackRecord.mBreadCrumbShortTitleRes;
        this.mBreadCrumbShortTitleText = backStackRecord.mBreadCrumbShortTitleText;
    }

    public int describeContents() {
        return 0;
    }

    public BackStackRecord instantiate(FragmentManagerImpl fragmentManagerImpl) {
        BackStackRecord backStackRecord = new BackStackRecord(fragmentManagerImpl);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.mOps.length) {
            BackStackRecord.Op op = new BackStackRecord.Op();
            int i4 = i2 + 1;
            op.cmd = this.mOps[i2];
            if (FragmentManagerImpl.DEBUG) {
                Log.v("FragmentManager", "Instantiate " + backStackRecord + " op #" + i3 + " base fragment #" + this.mOps[i4]);
            }
            int i5 = i4 + 1;
            int i6 = this.mOps[i4];
            if (i6 >= 0) {
                op.fragment = fragmentManagerImpl.mActive.get(i6);
            } else {
                op.fragment = null;
            }
            int i7 = i5 + 1;
            op.enterAnim = this.mOps[i5];
            int i8 = i7 + 1;
            op.exitAnim = this.mOps[i7];
            int i9 = i8 + 1;
            op.popEnterAnim = this.mOps[i8];
            int i10 = i9 + 1;
            op.popExitAnim = this.mOps[i9];
            int i11 = i10 + 1;
            int i12 = this.mOps[i10];
            if (i12 > 0) {
                op.removed = new ArrayList<>(i12);
                int i13 = 0;
                while (i13 < i12) {
                    if (FragmentManagerImpl.DEBUG) {
                        Log.v("FragmentManager", "Instantiate " + backStackRecord + " set remove fragment #" + this.mOps[i11]);
                    }
                    op.removed.add(fragmentManagerImpl.mActive.get(this.mOps[i11]));
                    i13++;
                    i11++;
                }
            }
            i2 = i11;
            backStackRecord.addOp(op);
            i3++;
        }
        backStackRecord.mTransition = this.mTransition;
        backStackRecord.mTransitionStyle = this.mTransitionStyle;
        backStackRecord.mName = this.mName;
        backStackRecord.mIndex = this.mIndex;
        backStackRecord.mAddToBackStack = true;
        backStackRecord.mBreadCrumbTitleRes = this.mBreadCrumbTitleRes;
        backStackRecord.mBreadCrumbTitleText = this.mBreadCrumbTitleText;
        backStackRecord.mBreadCrumbShortTitleRes = this.mBreadCrumbShortTitleRes;
        backStackRecord.mBreadCrumbShortTitleText = this.mBreadCrumbShortTitleText;
        backStackRecord.bumpBackStackNesting(1);
        return backStackRecord;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.mOps);
        parcel.writeInt(this.mTransition);
        parcel.writeInt(this.mTransitionStyle);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mBreadCrumbTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbTitleText, parcel, 0);
        parcel.writeInt(this.mBreadCrumbShortTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbShortTitleText, parcel, 0);
    }
}
