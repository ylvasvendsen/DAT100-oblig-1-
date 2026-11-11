import java.lang.Math.*;

public class trinnskatt {

    public static void main(String[] args) {

        int bruttoloenn_kr = 900000;
        int eiendeler_kr = 3000000;
        int boliglaan_kr = 500000;
        int studielaan_kr= 300000;
        int nettoformue_kr = (eiendeler_kr-boliglaan_kr-studielaan_kr);
        int brunnfradrag_kr = 1900000;
        int skattepliktig_formue_kr = (nettoformue_kr-brunnfradrag_kr);
        int personfradrag_kr = 114540;
        int rentefradrag_kr = 50000;
        double minstefradragssats_personer = 0.46;


        int renteinntekter_kr = 20000;
        int leieinntekter_kr = 100000;
        int sum_inntekter_inkl_kapitalinntekter_kr = bruttoloenn_kr+renteinntekter_kr+leieinntekter_kr;
        double minstefradrag_kr = Math.max((bruttoloenn_kr*minstefradragssats_personer), 95700);
        double alminnelig_inntekt_foer_personfradrag = (sum_inntekter_inkl_kapitalinntekter_kr-minstefradrag_kr);
        double alminnelig_inntekt_kr=(sum_inntekter_inkl_kapitalinntekter_kr-minstefradrag_kr-personfradrag_kr);

        double trygdesats = 0.076;
        double trinn1 = 0.017;
        double trinn2 = 0.04;
        double trinn3 = 0.137;
        double trinn4 = 0.168;
        double trinn5 = 0.178;
        double alminnelig_inntektssats = 0.22;


        int innslagspunkt_formuesskatt_kr = 1900000;
        double kommunesats = 0.0035;
        double statssats = 0.0065;


        int intervall1 = 318300 - 226101;
        int intervall2 = 725050 - 318301;
        int intervall3 = bruttoloenn_kr - 725051;

        double alminnelig_inntektsskatt = (alminnelig_inntekt_kr*alminnelig_inntektssats);
        double trygdeskatt = (bruttoloenn_kr*trygdesats);
        double sum_trinnsskatt = ((intervall1*trinn1)+(intervall2*trinn2)+(intervall3*trinn3));
        double sum_formuesskatt = ((skattepliktig_formue_kr*kommunesats)+(skattepliktig_formue_kr*statssats));


        System.out.println("Bruttolønn = " + bruttoloenn_kr);

        System.out.println("****************************************************");

        System.out.println("Skatt på alminnelig kapitallinntekt (22%) = " + (alminnelig_inntektssats*alminnelig_inntekt_kr));
        System.out.println("Trygdeskatt = " + (bruttoloenn_kr*trygdesats));
        System.out.println("Trinnskatt trinn 1= " + (intervall1*trinn1));
        System.out.println("Trinnsskatt trinn 2 = " + (intervall2*trinn2));
        System.out.println("Trinnskatt trinn 3 = " + (bruttoloenn_kr*trinn3));

        System.out.println("Formuesskatt til kommune = " + (skattepliktig_formue_kr*kommunesats));
        System.out.println("Formuesskatt til stat = " + (skattepliktig_formue_kr * statssats));

        System.out.println("*****************************************************");

        System.out.println("Sum inntekt- og formueskatt = " + (alminnelig_inntektsskatt+trygdeskatt+sum_trinnsskatt+sum_formuesskatt));

    }
}



