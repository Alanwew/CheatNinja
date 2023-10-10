package c.a.a;

import android.content.DialogInterface;
/* loaded from: classes.dex */
class ac implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final aa f12a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13b;
    private static int[] bN = {23367072};
    private static int[] bM = {48478763, 82062910, 22526684, 73756675};

    /* JADX INFO: Access modifiers changed from: package-private */
    public ac(aa aaVar, int i) {
        this.f12a = aaVar;
        this.f13b = i;
    }

    private static String H(String str) {
        int i;
        int i2;
        while (true) {
            StringBuilder sb = new StringBuilder();
            char[] charArray = str.toCharArray();
            for (int i3 = 0; i3 < charArray.length; i3++) {
                switch (i3 % 4) {
                    case 0:
                        sb.append((char) (charArray[i3] ^ 45587));
                        int i4 = bM[1];
                        if (i4 >= 0) {
                            do {
                            } while (i4 % (38666269 ^ i4) <= 0);
                        }
                    case 1:
                        sb.append((char) (charArray[i3] ^ 25883));
                        int i5 = bM[2];
                        if (i5 >= 0) {
                            do {
                                i2 = i5 & (87572155 ^ i5);
                                i5 = 4685892;
                            } while (i2 != 4685892);
                        }
                    case 2:
                        sb.append((char) (charArray[i3] ^ 45287));
                        int i6 = bM[3];
                        if (i6 >= 0) {
                            do {
                                i = i6 & (18945202 ^ i6);
                                i6 = 71589889;
                            } while (i != 71589889);
                        }
                    default:
                        sb.append((char) (charArray[i3] ^ 65535));
                        int i7 = bM[0];
                        if (i7 >= 0 && (i7 & (58105296 ^ i7)) == 0) {
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
        int i2;
        z.a(aa.a(this.f12a)).a(this.f13b);
        int i3 = bN[0];
        if (i3 >= 0) {
            do {
                i2 = i3 & (58605083 ^ i3);
                i3 = 33184;
            } while (i2 != 33184);
        }
    }
}
