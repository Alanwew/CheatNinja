package c.a.a;

import android.content.DialogInterface;
/* loaded from: classes.dex */
class s implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final q f49a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50b;
    private static int[] f = {63232341};
    private static int[] e = {57841212, 80823086, 36043805, 18193518};

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(q qVar, int i) {
        this.f49a = qVar;
        this.f50b = i;
    }

    private static String b(String str) {
        int i;
        while (true) {
            StringBuilder sb = new StringBuilder();
            char[] charArray = str.toCharArray();
            for (int i2 = 0; i2 < charArray.length; i2++) {
                switch (i2 % 4) {
                    case 0:
                        sb.append((char) (charArray[i2] ^ 47660));
                        int i3 = e[1];
                        if (i3 >= 0) {
                            do {
                            } while (i3 % (78194804 ^ i3) <= 0);
                        }
                    case 1:
                        sb.append((char) (charArray[i2] ^ 52420));
                        int i4 = e[2];
                        if (i4 >= 0) {
                            do {
                            } while ((i4 & (76263132 ^ i4)) <= 0);
                        }
                    case 2:
                        sb.append((char) (charArray[i2] ^ 11147));
                        int i5 = e[3];
                        if (i5 >= 0) {
                            do {
                                i = i5 & (12051054 ^ i5);
                                i5 = 16784384;
                            } while (i != 16784384);
                        }
                    default:
                        sb.append((char) (charArray[i2] ^ 65535));
                        int i6 = e[0];
                        if (i6 >= 0 && (i6 & (6948278 ^ i6)) == 0) {
                            break;
                        }
                        break;
                }
            }
            return sb.toString();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        q.a(this.f49a).a(this.f50b);
        int i2 = f[0];
        if (i2 >= 0) {
            do {
            } while (i2 % (80033933 ^ i2) <= 0);
        }
    }
}
