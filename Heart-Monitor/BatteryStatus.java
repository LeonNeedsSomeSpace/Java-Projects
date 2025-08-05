public class BatteryStatus {
        private int batterylevel;

        public BatteryStatus(int batterylevel){
            this.batterylevel = batterylevel;
        }

        public int getBatterylevel(){
            return batterylevel;
        }

        public void adjustbatterylevel(int batterylevel){
            this.batterylevel = batterylevel;
        }
}
