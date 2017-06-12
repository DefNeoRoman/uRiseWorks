package uRiseLessons.booleanType;

public class Main {
    public static void main(String[] args) {
        int ageMisha = 700;
        int ageVasya = 100;
        int ageVadim = 150;
        int old = 0;
        int mid =0 ;
        int young =0;
      if (ageMisha >= ageVasya && ageMisha >= ageVadim){
           old = ageMisha;
          if (ageVasya>ageVadim){
              mid = ageVasya;
              young = ageVadim;
          }else {
              mid = ageVadim;
              young = ageVasya;
          }

      }else if(ageVasya >= ageMisha && ageVasya >= ageVadim){
           old = ageVasya;
          if (ageMisha > ageVadim){
              mid = ageMisha;
              young = ageVadim;
          }else {
              mid = ageVadim;
              young = ageMisha;
          }
    }else {
        old = ageVadim;
          if (ageMisha > ageVasya){
              mid = ageMisha;
              young = ageVasya;
          }else {
              mid = ageVasya;
              young = ageMisha;
          }
    }
        System.out.println("oldestMan - " + old);
        System.out.println("middle age Man - " + mid);
        System.out.println("most young Man - " + young);
    }
}
