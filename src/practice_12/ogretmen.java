package practice_12;



    public class ogretmen extends Kisi{
        private String bolum;
        private String sicilNo;
        public ogretmen(){
        }
        public ogretmen(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
            super(adSoyad, kimlikNo, yas);
            this.bolum = bolum;
            this.sicilNo = sicilNo;
        }
        public String getBolum() {
            return bolum;
        }
        public String getSicilNo() {
            return sicilNo;
        }
        public void setBolum(String bolum) {
            this.bolum = bolum;
        }
        public void setSicilNo(String sicilNo) {
            this.sicilNo = sicilNo;
        }
        @Override
        public String toString() {
            return "Ogretmen{" +
                    "bolum='" + bolum + '\'' +
                    ", sicilNo='" + sicilNo + '\'' +
                    '}'+super.toString();
        }
    }

