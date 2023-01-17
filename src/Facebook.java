import java.util.ArrayList;

public class Facebook {
        private String NIK;
        private String Nama;
        private String Alamat;
        private String NoTelp;

        public String getNIK() {
            return NIK;
        }

        public void setNIK(String NIK) {
            this.NIK = NIK;
        }

        public String getNama() {
            return Nama;
        }

        public void setNama(String nama) {
            Nama = nama;
        }

        public String getAlamat() {
            return Alamat;
        }

        public void setAlamat(String alamat) {
            Alamat = alamat;
        }

        public String getNoTelp() {
            return NoTelp;
        }

        public void setNoTelp(String noTelp) {
            NoTelp = noTelp;
        }

        public Facebook(String nik, String nama, String alamat, String notelp) {
            this.NIK = nik;
            this.Nama = nama;
            this.Alamat = alamat;
            this.NoTelp = notelp;
        }

        public void ShowProfile(ArrayList<Facebook> cust, String id) {
            for (int index = 0; index < cust.size(); index++) {
                if (id.equals(cust.get(index).())) {
                    System.out.println("Customer Name : " + cust.get(index).getNama());
                    System.out.println("Address : " + cust.get(index).getAlamat());
                    System.out.println("Phone : " + cust.get(index).getNoTelp());
                }
            }
        }
    }
}
